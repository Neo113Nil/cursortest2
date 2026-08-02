package com.google.firebase.messaging;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.credentials.CredentialManager$$ExternalSyntheticLambda0;
import androidx.room.Room;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry;
import com.braze.Braze$Companion$$ExternalSyntheticLambda21;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.cloudmessaging.zzx;
import com.google.android.gms.cloudmessaging.zzy;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.measurement.internal.zzky;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda0;
import com.google.firebase.components.EventBus;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Store;
import com.plaid.internal.r6$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda8;
import com.squareup.util.cash.Countries;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public class FirebaseMessaging {
    private static final String EXTRA_DUMMY_P_INTENT = "app";
    static final String GMS_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MIN_DELAY_SEC = 30;
    private static final String SEND_INTENT_ACTION = "com.google.android.gcm.intent.SEND";
    private static final String SUBTYPE_DEFAULT = "";
    static final String TAG = "FirebaseMessaging";
    private static Store store;
    static ScheduledExecutorService syncExecutor;
    private final AutoInit autoInit;
    private final Context context;
    private final Executor fileExecutor;
    private final FirebaseApp firebaseApp;
    private final GmsRpc gmsRpc;
    private final FirebaseInstanceIdInternal iid;
    private final Executor initExecutor;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final Metadata metadata;
    private final RequestDeduplicator requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final Task<TopicsSubscriber> topicsSubscriberTask;
    private static final long MAX_DELAY_SEC = 28800;
    static Provider transportFactory = new ComponentRuntime$$ExternalSyntheticLambda0(6);

    public final class AutoInit {
        public Boolean autoInitEnabled;
        public FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0 dataCollectionDefaultChangeEventHandler;
        public boolean initialized;
        public final Subscriber subscriber;

        public AutoInit(Subscriber subscriber) {
            this.subscriber = subscriber;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [com.google.firebase.events.EventHandler, com.google.firebase.messaging.FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0] */
        public final synchronized void initialize() {
            try {
                if (this.initialized) {
                    return;
                }
                Boolean readEnabled = readEnabled();
                this.autoInitEnabled = readEnabled;
                if (readEnabled == null) {
                    ?? r0 = new EventHandler() { // from class: com.google.firebase.messaging.FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0
                        @Override // com.google.firebase.events.EventHandler
                        public final void handle(Event event) {
                            FirebaseMessaging.AutoInit autoInit = FirebaseMessaging.AutoInit.this;
                            if (autoInit.isEnabled()) {
                                FirebaseMessaging.this.startSyncIfNecessary();
                            }
                        }
                    };
                    this.dataCollectionDefaultChangeEventHandler = r0;
                    EventBus eventBus = (EventBus) this.subscriber;
                    eventBus.subscribe(eventBus.defaultExecutor, r0);
                }
                this.initialized = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized boolean isEnabled() {
            boolean z;
            boolean z2;
            try {
                initialize();
                Boolean bool = this.autoInitEnabled;
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    FirebaseApp firebaseApp = FirebaseMessaging.this.firebaseApp;
                    firebaseApp.checkNotDeleted();
                    DataCollectionConfigStorage dataCollectionConfigStorage = (DataCollectionConfigStorage) firebaseApp.dataCollectionConfigStorage.get();
                    synchronized (dataCollectionConfigStorage) {
                        z = dataCollectionConfigStorage.dataCollectionDefaultEnabled;
                    }
                    z2 = z;
                }
            } catch (Throwable th) {
                throw th;
            }
            return z2;
        }

        public final Boolean readEnabled() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            FirebaseApp firebaseApp = FirebaseMessaging.this.firebaseApp;
            firebaseApp.checkNotDeleted();
            Context context = firebaseApp.applicationContext;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider provider, Subscriber subscriber, final Metadata metadata, final GmsRpc gmsRpc, Executor executor, Executor executor2, Executor executor3) {
        final int i = 0;
        this.syncScheduledOrRunning = false;
        transportFactory = provider;
        this.firebaseApp = firebaseApp;
        this.autoInit = new AutoInit(subscriber);
        firebaseApp.checkNotDeleted();
        final Context context = firebaseApp.applicationContext;
        this.context = context;
        zzky zzkyVar = new zzky();
        this.lifecycleCallbacks = zzkyVar;
        this.metadata = metadata;
        this.gmsRpc = gmsRpc;
        this.requestDeduplicator = new RequestDeduplicator(executor);
        this.initExecutor = executor2;
        this.fileExecutor = executor3;
        firebaseApp.checkNotDeleted();
        Context context2 = firebaseApp.applicationContext;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(zzkyVar);
        } else {
            Log.w(TAG, "Context " + context2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.addNewTokenListener();
        }
        executor2.execute(new Runnable(this) { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda10
            public final /* synthetic */ FirebaseMessaging f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                FirebaseMessaging firebaseMessaging = this.f$0;
                switch (i2) {
                    case 0:
                        firebaseMessaging.lambda$new$2();
                        break;
                    default:
                        firebaseMessaging.lambda$new$4();
                        break;
                }
            }
        });
        final int i2 = 1;
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        zzw call = Room.call(scheduledThreadPoolExecutor, new Callable() { // from class: com.google.firebase.messaging.TopicsSubscriber$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                TopicsStore topicsStore;
                Context context3 = context;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = scheduledThreadPoolExecutor;
                FirebaseMessaging firebaseMessaging = this;
                Metadata metadata2 = metadata;
                GmsRpc gmsRpc2 = gmsRpc;
                synchronized (TopicsStore.class) {
                    try {
                        WeakReference weakReference = TopicsStore.topicsStoreWeakReference;
                        TopicsStore topicsStore2 = weakReference != null ? (TopicsStore) weakReference.get() : null;
                        if (topicsStore2 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            topicsStore = new TopicsStore(sharedPreferences, scheduledThreadPoolExecutor2);
                            synchronized (topicsStore) {
                                topicsStore.topicOperationsQueue = ComponentRegistry.Builder.createInstance(sharedPreferences, scheduledThreadPoolExecutor2);
                            }
                            TopicsStore.topicsStoreWeakReference = new WeakReference(topicsStore);
                        } else {
                            topicsStore = topicsStore2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new TopicsSubscriber(firebaseMessaging, metadata2, topicsStore, gmsRpc2, context3, scheduledThreadPoolExecutor2);
            }
        });
        this.topicsSubscriberTask = call;
        call.addOnSuccessListener(executor2, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(this, 5));
        executor2.execute(new Runnable(this) { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda10
            public final /* synthetic */ FirebaseMessaging f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                FirebaseMessaging firebaseMessaging = this.f$0;
                switch (i22) {
                    case 0:
                        firebaseMessaging.lambda$new$2();
                        break;
                    default:
                        firebaseMessaging.lambda$new$4();
                        break;
                }
            }
        });
    }

    public static synchronized void clearStoreForTest() {
        synchronized (FirebaseMessaging.class) {
            store = null;
        }
    }

    public static void clearTransportFactoryForTest() {
        transportFactory = new Provider() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda1
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                TransportFactory lambda$clearTransportFactoryForTest$12;
                lambda$clearTransportFactoryForTest$12 = FirebaseMessaging.lambda$clearTransportFactoryForTest$12();
                return lambda$clearTransportFactoryForTest$12;
            }
        };
    }

    public static synchronized FirebaseMessaging getInstance(FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseApp.checkNotDeleted();
            firebaseMessaging = (FirebaseMessaging) firebaseApp.componentRuntime.get(FirebaseMessaging.class);
            zzae.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    private static synchronized Store getStore(Context context) {
        Store store2;
        synchronized (FirebaseMessaging.class) {
            try {
                if (store == null) {
                    store = new Store(context);
                }
                store2 = store;
            } catch (Throwable th) {
                throw th;
            }
        }
        return store2;
    }

    private String getSubtype() {
        FirebaseApp firebaseApp = this.firebaseApp;
        firebaseApp.checkNotDeleted();
        return "[DEFAULT]".equals(firebaseApp.name) ? SUBTYPE_DEFAULT : this.firebaseApp.getPersistenceKey();
    }

    public static TransportFactory getTransportFactory() {
        return (TransportFactory) transportFactory.get();
    }

    private void handleProxiedNotificationData() {
        Rpc rpc = this.gmsRpc.rpc;
        (rpc.zzg.zza() >= 241100000 ? zzv.zzb(rpc.zzf).zzd(5, Bundle.EMPTY).continueWith(zzy.zza, zzx.zza$2) : Room.forException(new IOException("SERVICE_NOT_AVAILABLE"))).addOnSuccessListener(this.initExecutor, new FirebaseMessaging$$ExternalSyntheticLambda4(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initializeProxyNotifications, reason: merged with bridge method [inline-methods] */
    public void lambda$new$4() {
        Room.initialize(this.context);
        TransactorKt.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
        if (shouldRetainProxyNotifications()) {
            handleProxiedNotificationData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeOnTokenRefresh, reason: merged with bridge method [inline-methods] */
    public void lambda$new$1(String str) {
        FirebaseApp firebaseApp = this.firebaseApp;
        firebaseApp.checkNotDeleted();
        if ("[DEFAULT]".equals(firebaseApp.name)) {
            if (Log.isLoggable(TAG, 3)) {
                StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                FirebaseApp firebaseApp2 = this.firebaseApp;
                firebaseApp2.checkNotDeleted();
                sb.append(firebaseApp2.name);
                Log.d(TAG, sb.toString());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new FcmBroadcastProcessor(this.context).process(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task lambda$blockingGetToken$13(String str, Store.Token token, String str2) {
        Store store2 = getStore(this.context);
        String subtype = getSubtype();
        String appVersionCode = this.metadata.getAppVersionCode();
        synchronized (store2) {
            String encode = Store.Token.encode(System.currentTimeMillis(), str2, appVersionCode);
            if (encode != null) {
                SharedPreferences.Editor edit = store2.store.edit();
                edit.putString(Store.createTokenKey(subtype, str), encode);
                edit.commit();
            }
        }
        if (token == null || !str2.equals(token.token)) {
            lambda$new$1(str2);
        }
        return Room.forResult(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task lambda$blockingGetToken$14(String str, Store.Token token) {
        GmsRpc gmsRpc = this.gmsRpc;
        return gmsRpc.extractResponseWhenComplete(gmsRpc.startRpc(Metadata.getDefaultSenderId(gmsRpc.f1010app), Marker.ANY_MARKER, new Bundle())).onSuccessTask(this.fileExecutor, new FirebaseMessaging$$ExternalSyntheticLambda8(this, str, token));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TransportFactory lambda$clearTransportFactoryForTest$12() {
        return null;
    }

    private /* synthetic */ void lambda$deleteToken$8(TaskCompletionSource taskCompletionSource) {
        try {
            Metadata.getDefaultSenderId(this.firebaseApp);
            throw null;
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$deleteToken$9(TaskCompletionSource taskCompletionSource) {
        try {
            GmsRpc gmsRpc = this.gmsRpc;
            gmsRpc.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("delete", "1");
            Room.await(gmsRpc.extractResponseWhenComplete(gmsRpc.startRpc(Metadata.getDefaultSenderId(gmsRpc.f1010app), Marker.ANY_MARKER, bundle)));
            Store store2 = getStore(this.context);
            String subtype = getSubtype();
            String defaultSenderId = Metadata.getDefaultSenderId(this.firebaseApp);
            synchronized (store2) {
                String createTokenKey = Store.createTokenKey(subtype, defaultSenderId);
                SharedPreferences.Editor edit = store2.store.edit();
                edit.remove(createTokenKey);
                edit.commit();
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getToken$7(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(blockingGetToken());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleProxiedNotificationData$5(CloudMessage cloudMessage) {
        if (cloudMessage != null) {
            Countries.logNotificationReceived(cloudMessage.getIntent());
            handleProxiedNotificationData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2() {
        if (isAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(TopicsSubscriber topicsSubscriber) {
        if (isAutoInitEnabled()) {
            topicsSubscriber.startTopicsSyncIfNecessary();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setNotificationDelegationEnabled$6(Void r2) {
        TransactorKt.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TransportFactory lambda$static$0() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Task lambda$subscribeToTopic$10(String str, TopicsSubscriber topicsSubscriber) {
        topicsSubscriber.getClass();
        zzw scheduleTopicOperation = topicsSubscriber.scheduleTopicOperation(TopicOperation.subscribe(str));
        topicsSubscriber.startTopicsSyncIfNecessary();
        return scheduleTopicOperation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Task lambda$unsubscribeFromTopic$11(String str, TopicsSubscriber topicsSubscriber) {
        topicsSubscriber.getClass();
        zzw scheduleTopicOperation = topicsSubscriber.scheduleTopicOperation(TopicOperation.unsubscribe(str));
        topicsSubscriber.startTopicsSyncIfNecessary();
        return scheduleTopicOperation;
    }

    private boolean shouldRetainProxyNotifications() {
        Room.initialize(this.context);
        if (!Room.isProxyNotificationEnabled(this.context)) {
            return false;
        }
        FirebaseApp firebaseApp = this.firebaseApp;
        firebaseApp.checkNotDeleted();
        if (firebaseApp.componentRuntime.get(AnalyticsConnector.class) != null) {
            return true;
        }
        return Countries.deliveryMetricsExportToBigQueryEnabled() && transportFactory != null;
    }

    private synchronized void startSync() {
        if (!this.syncScheduledOrRunning) {
            syncWithDelaySecondsInternal(MAX_DELAY_SEC);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSyncIfNecessary() {
        if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    public String blockingGetToken() {
        Task task;
        Store.Token tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            return tokenWithoutTriggeringSync.token;
        }
        String defaultSenderId = Metadata.getDefaultSenderId(this.firebaseApp);
        RequestDeduplicator requestDeduplicator = this.requestDeduplicator;
        FirebaseMessaging$$ExternalSyntheticLambda8 firebaseMessaging$$ExternalSyntheticLambda8 = new FirebaseMessaging$$ExternalSyntheticLambda8(this, defaultSenderId, tokenWithoutTriggeringSync);
        synchronized (requestDeduplicator) {
            task = (Task) requestDeduplicator.getTokenRequests.get(defaultSenderId);
            if (task == null) {
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "Making new request for: " + defaultSenderId);
                }
                task = firebaseMessaging$$ExternalSyntheticLambda8.start().continueWithTask(requestDeduplicator.executor, new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(28, requestDeduplicator, defaultSenderId));
                requestDeduplicator.getTokenRequests.put(defaultSenderId, task);
            } else if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Joining ongoing request for: " + defaultSenderId);
            }
        }
        try {
            return (String) Room.await(task);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public Task<Void> deleteToken() {
        if (getTokenWithoutTriggeringSync() == null) {
            return Room.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io")).execute(new MainActivity$$ExternalSyntheticLambda8(11, this, taskCompletionSource));
        return taskCompletionSource.zza;
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return Countries.deliveryMetricsExportToBigQueryEnabled();
    }

    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (syncExecutor == null) {
                    syncExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Context getApplicationContext() {
        return this.context;
    }

    public Task<String> getToken() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.initExecutor.execute(new r6$$ExternalSyntheticLambda0(3, this, taskCompletionSource));
        return taskCompletionSource.zza;
    }

    public Store.Token getTokenWithoutTriggeringSync() {
        Store.Token parse;
        Store store2 = getStore(this.context);
        String subtype = getSubtype();
        String defaultSenderId = Metadata.getDefaultSenderId(this.firebaseApp);
        synchronized (store2) {
            parse = Store.Token.parse(store2.store.getString(Store.createTokenKey(subtype, defaultSenderId), null));
        }
        return parse;
    }

    public Task<TopicsSubscriber> getTopicsSubscriberTask() {
        return this.topicsSubscriberTask;
    }

    public boolean isAutoInitEnabled() {
        return this.autoInit.isEnabled();
    }

    public boolean isGmsCorePresent() {
        return this.metadata.isGmscorePresent();
    }

    public boolean isNotificationDelegationEnabled() {
        return Room.isProxyNotificationEnabled(this.context);
    }

    @Deprecated
    public void send(RemoteMessage remoteMessage) {
        if (TextUtils.isEmpty(remoteMessage.getTo())) {
            a$$ExternalSyntheticBUOutline0.m$3("Missing 'to'");
            return;
        }
        Intent intent = new Intent(SEND_INTENT_ACTION);
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra(EXTRA_DUMMY_P_INTENT, PendingIntent.getBroadcast(this.context, 0, intent2, 67108864));
        intent.setPackage(GMS_PACKAGE);
        remoteMessage.populateSendMessageIntent(intent);
        this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void setAutoInitEnabled(boolean z) {
        AutoInit autoInit = this.autoInit;
        synchronized (autoInit) {
            try {
                autoInit.initialize();
                FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0 firebaseMessaging$AutoInit$$ExternalSyntheticLambda0 = autoInit.dataCollectionDefaultChangeEventHandler;
                if (firebaseMessaging$AutoInit$$ExternalSyntheticLambda0 != null) {
                    ((EventBus) autoInit.subscriber).unsubscribe(firebaseMessaging$AutoInit$$ExternalSyntheticLambda0);
                    autoInit.dataCollectionDefaultChangeEventHandler = null;
                }
                FirebaseApp firebaseApp = FirebaseMessaging.this.firebaseApp;
                firebaseApp.checkNotDeleted();
                SharedPreferences.Editor edit = firebaseApp.applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("auto_init", z);
                edit.apply();
                if (z) {
                    FirebaseMessaging.this.startSyncIfNecessary();
                }
                autoInit.autoInitEnabled = Boolean.valueOf(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z) {
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        firebaseApp.checkNotDeleted();
        firebaseApp.applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z).apply();
        TransactorKt.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
    }

    public Task<Void> setNotificationDelegationEnabled(boolean z) {
        Executor executor = this.initExecutor;
        Context context = this.context;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new ProxyNotificationInitializer$$ExternalSyntheticLambda0(context, z, taskCompletionSource));
        CredentialManager$$ExternalSyntheticLambda0 credentialManager$$ExternalSyntheticLambda0 = new CredentialManager$$ExternalSyntheticLambda0(0);
        FirebaseMessaging$$ExternalSyntheticLambda4 firebaseMessaging$$ExternalSyntheticLambda4 = new FirebaseMessaging$$ExternalSyntheticLambda4(this, 0);
        zzw zzwVar = taskCompletionSource.zza;
        zzwVar.addOnSuccessListener(credentialManager$$ExternalSyntheticLambda0, firebaseMessaging$$ExternalSyntheticLambda4);
        return zzwVar;
    }

    public synchronized void setSyncScheduledOrRunning(boolean z) {
        this.syncScheduledOrRunning = z;
    }

    public Task<Void> subscribeToTopic(String str) {
        return this.topicsSubscriberTask.onSuccessTask(new Braze$Companion$$ExternalSyntheticLambda21(str, 2));
    }

    public synchronized void syncWithDelaySecondsInternal(long j) {
        enqueueTaskWithDelaySeconds(new SyncTask(this, Math.min(Math.max(MIN_DELAY_SEC, 2 * j), MAX_DELAY_SEC)), j);
        this.syncScheduledOrRunning = true;
    }

    public boolean tokenNeedsRefresh(Store.Token token) {
        if (token != null) {
            return System.currentTimeMillis() > token.timestamp + 604800000 || !this.metadata.getAppVersionCode().equals(token.appVersion);
        }
        return true;
    }

    public Task<Void> unsubscribeFromTopic(String str) {
        return this.topicsSubscriberTask.onSuccessTask(new Braze$Companion$$ExternalSyntheticLambda21(str, 3));
    }

    public static synchronized FirebaseMessaging getInstance() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(FirebaseApp.getInstance());
        }
        return firebaseMessaging;
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider3, Subscriber subscriber, Metadata metadata) {
        this(firebaseApp, firebaseInstanceIdInternal, provider3, subscriber, metadata, new GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi), Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task")), new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init")), new ThreadPoolExecutor(0, 1, MIN_DELAY_SEC, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io")));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider3, Subscriber subscriber) {
        this(firebaseApp, firebaseInstanceIdInternal, provider, provider2, firebaseInstallationsApi, provider3, subscriber, new Metadata(firebaseApp.applicationContext));
        firebaseApp.checkNotDeleted();
    }
}
