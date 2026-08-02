package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Trace;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.molecule.PlatformKt;
import coil3.size.SizeKt;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.zzae;
import com.google.crypto.tink.KeysetHandle;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery$$ExternalSyntheticLambda0;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.provider.FirebaseInitProvider;
import com.google.mlkit.common.internal.zzc;
import com.squareup.util.cash.Countries;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.ConnectionPool;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public final class FirebaseApp {
    public final Context applicationContext;
    public final AtomicBoolean automaticResourceManagementEnabled;
    public final CopyOnWriteArrayList backgroundStateChangeListeners;
    public final ComponentRuntime componentRuntime;
    public final Lazy dataCollectionConfigStorage;
    public final Provider defaultHeartBeatController;
    public final AtomicBoolean deleted;
    public final String name;
    public final FirebaseOptions options;
    public static final Object LOCK = new Object();
    public static final ArrayMap INSTANCES = new ArrayMap(0);

    public final class GlobalBackgroundStateListener implements BackgroundDetector.BackgroundStateChangeListener {
        public static final AtomicReference INSTANCE = new AtomicReference();

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z) {
            synchronized (FirebaseApp.LOCK) {
                try {
                    Iterator it = new ArrayList(FirebaseApp.INSTANCES.values()).iterator();
                    while (it.hasNext()) {
                        FirebaseApp firebaseApp = (FirebaseApp) it.next();
                        if (firebaseApp.automaticResourceManagementEnabled.get()) {
                            Log.d("FirebaseApp", "Notifying background state change listeners.");
                            Iterator it2 = firebaseApp.backgroundStateChangeListeners.iterator();
                            while (it2.hasNext()) {
                                FirebaseApp firebaseApp2 = ((FirebaseApp$$ExternalSyntheticLambda1) it2.next()).f$0;
                                if (!z) {
                                    ((DefaultHeartBeatController) firebaseApp2.defaultHeartBeatController.get()).registerHeartBeat();
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class UserUnlockReceiver extends BroadcastReceiver {
        public static final AtomicReference INSTANCE = new AtomicReference();
        public final Context applicationContext;

        public UserUnlockReceiver(Context context) {
            this.applicationContext = context;
        }

        public static void access$100(Context context) {
            AtomicReference atomicReference = INSTANCE;
            if (atomicReference.get() == null) {
                UserUnlockReceiver userUnlockReceiver = new UserUnlockReceiver(context);
                while (!atomicReference.compareAndSet(null, userUnlockReceiver)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(userUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.LOCK) {
                try {
                    Iterator it = ((ArrayMap.ValueCollection) FirebaseApp.INSTANCES.values()).iterator();
                    while (it.hasNext()) {
                        ((FirebaseApp) it.next()).initializeAllApis();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.applicationContext.unregisterReceiver(this);
        }
    }

    public FirebaseApp(Context context, String str, FirebaseOptions firebaseOptions) {
        int i = 0;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.automaticResourceManagementEnabled = atomicBoolean;
        this.deleted = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.backgroundStateChangeListeners = copyOnWriteArrayList;
        new CopyOnWriteArrayList();
        this.applicationContext = context;
        zzae.checkNotEmpty(str);
        this.name = str;
        this.options = firebaseOptions;
        AutoValue_StartupTime autoValue_StartupTime = FirebaseInitProvider.startupTime;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList discoverLazy = new KeysetHandle(6, context, new ConnectionPool(ComponentDiscoveryService.class)).discoverLazy();
        Trace.endSection();
        Trace.beginSection("Runtime");
        UiExecutor uiExecutor = UiExecutor.INSTANCE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(discoverLazy);
        int i2 = 1;
        arrayList.add(new ComponentDiscovery$$ExternalSyntheticLambda0(new FirebaseCommonRegistrar(), i2));
        arrayList.add(new ComponentDiscovery$$ExternalSyntheticLambda0(new ExecutorsRegistrar(), i2));
        arrayList2.add(Component.of(context, Context.class, new Class[0]));
        arrayList2.add(Component.of(this, FirebaseApp.class, new Class[0]));
        arrayList2.add(Component.of(firebaseOptions, FirebaseOptions.class, new Class[0]));
        zzc zzcVar = new zzc(10);
        if (Countries.isUserUnlocked(context) && FirebaseInitProvider.currentlyInitializing.get()) {
            arrayList2.add(Component.of(autoValue_StartupTime, AutoValue_StartupTime.class, new Class[0]));
        }
        ComponentRuntime componentRuntime = new ComponentRuntime(uiExecutor, arrayList, arrayList2, zzcVar);
        this.componentRuntime = componentRuntime;
        Trace.endSection();
        this.dataCollectionConfigStorage = new Lazy(new FirebaseApp$$ExternalSyntheticLambda0(i, this, context));
        this.defaultHeartBeatController = componentRuntime.getProvider(DefaultHeartBeatController.class);
        FirebaseApp$$ExternalSyntheticLambda1 firebaseApp$$ExternalSyntheticLambda1 = new FirebaseApp$$ExternalSyntheticLambda1(this);
        checkNotDeleted();
        if (atomicBoolean.get()) {
            BackgroundDetector.zza.zzb.get();
        }
        copyOnWriteArrayList.add(firebaseApp$$ExternalSyntheticLambda1);
        Trace.endSection();
    }

    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (LOCK) {
            try {
                firebaseApp = (FirebaseApp) INSTANCES.get("[DEFAULT]");
                if (firebaseApp == null) {
                    StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                    if (PlatformKt.zza == null) {
                        PlatformKt.zza = Application.getProcessName();
                    }
                    sb.append(PlatformKt.zza);
                    sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    throw new IllegalStateException(sb.toString());
                }
                ((DefaultHeartBeatController) firebaseApp.defaultHeartBeatController.get()).registerHeartBeat();
            } catch (Throwable th) {
                throw th;
            }
        }
        return firebaseApp;
    }

    public static void initializeApp(Context context, FirebaseOptions firebaseOptions) {
        FirebaseApp firebaseApp;
        AtomicReference atomicReference = GlobalBackgroundStateListener.INSTANCE;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = GlobalBackgroundStateListener.INSTANCE;
            if (atomicReference2.get() == null) {
                GlobalBackgroundStateListener globalBackgroundStateListener = new GlobalBackgroundStateListener();
                while (true) {
                    if (atomicReference2.compareAndSet(null, globalBackgroundStateListener)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector backgroundDetector = BackgroundDetector.zza;
                        backgroundDetector.getClass();
                        synchronized (backgroundDetector) {
                            backgroundDetector.zzd.add(globalBackgroundStateListener);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (LOCK) {
            ArrayMap arrayMap = INSTANCES;
            zzae.checkState("FirebaseApp name [DEFAULT] already exists!", !arrayMap.containsKey("[DEFAULT]"));
            zzae.checkNotNull(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, "[DEFAULT]", firebaseOptions);
            arrayMap.put("[DEFAULT]", firebaseApp);
        }
        firebaseApp.initializeAllApis();
    }

    public final void checkNotDeleted() {
        zzae.checkState("FirebaseApp was deleted", !this.deleted.get());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        FirebaseApp firebaseApp = (FirebaseApp) obj;
        firebaseApp.checkNotDeleted();
        return this.name.equals(firebaseApp.name);
    }

    public final String getPersistenceKey() {
        StringBuilder sb = new StringBuilder();
        checkNotDeleted();
        sb.append(SizeKt.encodeUrlSafeNoPadding(this.name.getBytes(Charset.defaultCharset())));
        sb.append(Marker.ANY_NON_NULL_MARKER);
        checkNotDeleted();
        sb.append(SizeKt.encodeUrlSafeNoPadding(this.options.applicationId.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public final void initializeAllApis() {
        Context context = this.applicationContext;
        boolean isUserUnlocked = Countries.isUserUnlocked(context);
        String str = this.name;
        if (!isUserUnlocked) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            checkNotDeleted();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            UserUnlockReceiver.access$100(context);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        checkNotDeleted();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        checkNotDeleted();
        this.componentRuntime.initializeEagerComponents("[DEFAULT]".equals(str));
        ((DefaultHeartBeatController) this.defaultHeartBeatController.get()).registerHeartBeat();
    }

    public final void setDataCollectionDefaultEnabled$1() {
        Boolean bool = Boolean.FALSE;
        checkNotDeleted();
        DataCollectionConfigStorage dataCollectionConfigStorage = (DataCollectionConfigStorage) this.dataCollectionConfigStorage.get();
        synchronized (dataCollectionConfigStorage) {
            boolean equals = Boolean.TRUE.equals(bool);
            dataCollectionConfigStorage.sharedPreferences.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
            synchronized (dataCollectionConfigStorage) {
                if (dataCollectionConfigStorage.dataCollectionDefaultEnabled != equals) {
                    dataCollectionConfigStorage.dataCollectionDefaultEnabled = equals;
                    Publisher publisher = dataCollectionConfigStorage.publisher;
                    DataCollectionDefaultChange dataCollectionDefaultChange = new DataCollectionDefaultChange();
                    dataCollectionDefaultChange.enabled = equals;
                    publisher.publish(new Event(dataCollectionDefaultChange));
                }
            }
        }
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(this.name, "name");
        workLauncherImpl.add(this.options, "options");
        return workLauncherImpl.toString();
    }
}
