package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.datatransport.WinterFlowAPILayer;
import com.google.android.datatransport.WinterFlowAdapterUnitTest;
import com.google.android.datatransport.WinterFlowAlgorithmArray;
import com.google.android.datatransport.WinterFlowBackendComponent;
import com.google.android.datatransport.WinterFlowCompilerScheduler;
import com.google.android.datatransport.WinterFlowDatabaseSchemaBandwidth;
import com.google.android.datatransport.WinterFlowEncryptionSubsystem;
import com.google.android.datatransport.WinterFlowExceptionParser;
import com.google.android.datatransport.WinterFlowExceptionProcessor;
import com.google.android.datatransport.WinterFlowHookInheritance;
import com.google.android.datatransport.WinterFlowHookProcessor;
import com.google.android.datatransport.WinterFlowInterfaceSystem;
import com.google.android.datatransport.WinterFlowListenerWebsocket;
import com.google.android.datatransport.WinterFlowNodeSerializer;
import com.google.android.datatransport.WinterFlowPackageHook;
import com.google.android.datatransport.WinterFlowProcessorLayer;
import com.google.android.datatransport.WinterFlowProtocolPlatform;
import com.google.android.datatransport.WinterFlowProviderRouter;
import com.google.android.datatransport.WinterFlowProviderUserManager;
import com.google.android.datatransport.WinterFlowRequestEngine;
import com.google.android.datatransport.WinterFlowResponseProcess;
import com.google.android.datatransport.WinterFlowRuntimeService;
import com.google.android.datatransport.WinterFlowSchedulerParser;
import com.google.android.datatransport.WinterFlowSessionManagerManager;
import com.google.android.datatransport.WinterFlowStackInterface;
import com.google.android.datatransport.WinterFlowThreadJava;
import com.google.android.datatransport.WinterFlowUnitTestLibrary;
import com.google.android.datatransport.WinterFlowUnitTestSystem;
import com.google.android.datatransport.WinterFlowViewSystem;
import com.google.android.datatransport.WinterFlowWidgetUtility;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static WinterFlowNodeSerializer WinterFlowServerProtocol;
    public static ScheduledThreadPoolExecutor WinterFlowServiceUtility;
    public static WinterFlowHookInheritance WinterFlowThreadListener = new WinterFlowInterfaceSystem(5);
    public final WinterFlowRequestEngine WinterFlowArrayNetwork;
    public final WinterFlowSchedulerParser WinterFlowCacheManagerAgent;
    public final Context WinterFlowHookDataSource;
    public final WinterFlowDatabaseSchemaBandwidth WinterFlowResponseEngine;
    public final ThreadPoolExecutor WinterFlowRouterRouter;
    public final com.google.firebase.WinterFlowSyntaxEvent WinterFlowRouterStructure;
    public final WinterFlowAdapterUnitTest WinterFlowSyntax;
    public boolean WinterFlowTransactionAgent;
    public final WinterFlowViewSystem WinterFlowTransactionManagerStrategy;
    public final ScheduledThreadPoolExecutor WinterFlowUnitTestResponse;
    public final WinterFlowAlgorithmArray WinterFlowVariableVersionControl;

    public FirebaseMessaging(final com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent, WinterFlowHookInheritance winterFlowHookInheritance, WinterFlowHookInheritance winterFlowHookInheritance2, final WinterFlowDatabaseSchemaBandwidth winterFlowDatabaseSchemaBandwidth, WinterFlowHookInheritance winterFlowHookInheritance3, WinterFlowExceptionProcessor winterFlowExceptionProcessor) {
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        Context context = winterFlowSyntaxEvent.WinterFlowRouterStructure;
        final WinterFlowAdapterUnitTest winterFlowAdapterUnitTest = new WinterFlowAdapterUnitTest();
        final int i = 0;
        winterFlowAdapterUnitTest.WinterFlowHookDataSource = 0;
        winterFlowAdapterUnitTest.WinterFlowCacheManagerAgent = context;
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        WinterFlowProviderUserManager winterFlowProviderUserManager = new WinterFlowProviderUserManager(winterFlowSyntaxEvent.WinterFlowRouterStructure);
        WinterFlowSchedulerParser winterFlowSchedulerParser = new WinterFlowSchedulerParser();
        winterFlowSchedulerParser.WinterFlowRouterStructure = winterFlowSyntaxEvent;
        winterFlowSchedulerParser.WinterFlowHookDataSource = winterFlowAdapterUnitTest;
        winterFlowSchedulerParser.WinterFlowCacheManagerAgent = winterFlowProviderUserManager;
        winterFlowSchedulerParser.WinterFlowArrayNetwork = winterFlowHookInheritance;
        winterFlowSchedulerParser.WinterFlowVariableVersionControl = winterFlowHookInheritance2;
        winterFlowSchedulerParser.WinterFlowTransactionManagerStrategy = winterFlowDatabaseSchemaBandwidth;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new WinterFlowCompilerScheduler("Firebase-Messaging-Task"));
        final int i2 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new WinterFlowCompilerScheduler("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new WinterFlowCompilerScheduler("Firebase-Messaging-File-Io"));
        this.WinterFlowTransactionAgent = false;
        WinterFlowThreadListener = winterFlowHookInheritance3;
        this.WinterFlowRouterStructure = winterFlowSyntaxEvent;
        this.WinterFlowTransactionManagerStrategy = new WinterFlowViewSystem(this, winterFlowExceptionProcessor);
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        final Context context2 = winterFlowSyntaxEvent.WinterFlowRouterStructure;
        this.WinterFlowHookDataSource = context2;
        WinterFlowSessionManagerManager winterFlowSessionManagerManager = new WinterFlowSessionManagerManager();
        this.WinterFlowSyntax = winterFlowAdapterUnitTest;
        this.WinterFlowCacheManagerAgent = winterFlowSchedulerParser;
        this.WinterFlowResponseEngine = winterFlowDatabaseSchemaBandwidth;
        WinterFlowRequestEngine winterFlowRequestEngine = new WinterFlowRequestEngine(context2, winterFlowSyntaxEvent, winterFlowDatabaseSchemaBandwidth, winterFlowSchedulerParser, winterFlowAdapterUnitTest);
        this.WinterFlowArrayNetwork = winterFlowRequestEngine;
        this.WinterFlowVariableVersionControl = new WinterFlowAlgorithmArray(newSingleThreadExecutor);
        this.WinterFlowUnitTestResponse = scheduledThreadPoolExecutor;
        this.WinterFlowRouterRouter = threadPoolExecutor;
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        Context context3 = winterFlowSyntaxEvent.WinterFlowRouterStructure;
        if (context3 instanceof Application) {
            ((Application) context3).registerActivityLifecycleCallbacks(winterFlowSessionManagerManager);
        } else {
            Objects.toString(context3);
        }
        if (winterFlowRequestEngine.WinterFlowTransactionAgent()) {
            WinterFlowProcessorLayer winterFlowProcessorLayer = new WinterFlowProcessorLayer(this);
            WinterFlowBackendComponent winterFlowBackendComponent = (WinterFlowBackendComponent) winterFlowDatabaseSchemaBandwidth;
            synchronized (winterFlowBackendComponent) {
                winterFlowBackendComponent.WinterFlowResponseEngine.add(winterFlowProcessorLayer);
            }
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.android.datatransport.WinterFlowRendererDatabase
            public final /* synthetic */ FirebaseMessaging WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WinterFlowExceptionParser WinterFlowSyntax;
                int i3;
                int i4 = i;
                FirebaseMessaging firebaseMessaging = this.WinterFlowTransactionManagerStrategy;
                switch (i4) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        if (firebaseMessaging.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure() && firebaseMessaging.WinterFlowRouterRouter(firebaseMessaging.WinterFlowArrayNetwork())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.WinterFlowTransactionAgent) {
                                    firebaseMessaging.WinterFlowUnitTestResponse(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context4 = firebaseMessaging.WinterFlowHookDataSource;
                        WinterFlowProviderRouter.WinterFlowBandwidthObject(context4);
                        WinterFlowSchedulerParser winterFlowSchedulerParser2 = firebaseMessaging.WinterFlowCacheManagerAgent;
                        final boolean WinterFlowTransactionManagerStrategy = firebaseMessaging.WinterFlowTransactionManagerStrategy();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences WinterFlowTransactionManagerStrategy2 = WinterFlowFrameworkMechanism.WinterFlowTransactionManagerStrategy(context4);
                            if (!WinterFlowTransactionManagerStrategy2.contains("proxy_retention") || WinterFlowTransactionManagerStrategy2.getBoolean("proxy_retention", false) != WinterFlowTransactionManagerStrategy) {
                                WinterFlowProviderUserManager winterFlowProviderUserManager2 = (WinterFlowProviderUserManager) winterFlowSchedulerParser2.WinterFlowCacheManagerAgent;
                                if (winterFlowProviderUserManager2.WinterFlowCacheManagerAgent.WinterFlowConcurrencyThread() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", WinterFlowTransactionManagerStrategy);
                                    WinterFlowProtocolPlatform WinterFlowTransactionAgent = WinterFlowProtocolPlatform.WinterFlowTransactionAgent(winterFlowProviderUserManager2.WinterFlowHookDataSource);
                                    synchronized (WinterFlowTransactionAgent) {
                                        i3 = WinterFlowTransactionAgent.WinterFlowRouterStructure;
                                        WinterFlowTransactionAgent.WinterFlowRouterStructure = i3 + 1;
                                    }
                                    WinterFlowSyntax = WinterFlowTransactionAgent.WinterFlowServerProtocol(new WinterFlowWidgetUtility(i3, 4, bundle, 0));
                                } else {
                                    WinterFlowSyntax = WinterFlowHookProcessor.WinterFlowSyntax(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                WinterFlowSyntax.WinterFlowHookDataSource(new WinterFlowOrchestrationSession(1), new WinterFlowListenerModule() { // from class: com.google.android.datatransport.WinterFlowCompilerThreadPool
                                    @Override // com.google.android.datatransport.WinterFlowListenerModule
                                    public final void WinterFlowCacheManagerAgent(Object obj) {
                                        SharedPreferences.Editor edit = WinterFlowFrameworkMechanism.WinterFlowTransactionManagerStrategy(context4).edit();
                                        edit.putBoolean("proxy_retention", WinterFlowTransactionManagerStrategy);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.WinterFlowTransactionManagerStrategy()) {
                            firebaseMessaging.WinterFlowVariableVersionControl();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new WinterFlowCompilerScheduler("Firebase-Messaging-Topics-Io"));
        WinterFlowHookProcessor.WinterFlowUnitTestResponse(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.android.datatransport.WinterFlowThreadPoolManager
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WinterFlowValidatorHandler winterFlowValidatorHandler;
                Context context4 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                WinterFlowAdapterUnitTest winterFlowAdapterUnitTest2 = winterFlowAdapterUnitTest;
                com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent2 = winterFlowSyntaxEvent;
                FirebaseMessaging firebaseMessaging = this;
                WinterFlowDatabaseSchemaBandwidth winterFlowDatabaseSchemaBandwidth2 = winterFlowDatabaseSchemaBandwidth;
                synchronized (WinterFlowValidatorHandler.class) {
                    try {
                        WeakReference weakReference = WinterFlowValidatorHandler.WinterFlowHookDataSource;
                        WinterFlowValidatorHandler winterFlowValidatorHandler2 = weakReference != null ? (WinterFlowValidatorHandler) weakReference.get() : null;
                        if (winterFlowValidatorHandler2 == null) {
                            SharedPreferences sharedPreferences = context4.getSharedPreferences("com.google.android.gms.appid", 0);
                            winterFlowValidatorHandler = new WinterFlowValidatorHandler();
                            synchronized (winterFlowValidatorHandler) {
                                winterFlowValidatorHandler.WinterFlowRouterStructure = WinterFlowObjectPackage.WinterFlowRouterRouter(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            WinterFlowValidatorHandler.WinterFlowHookDataSource = new WeakReference(winterFlowValidatorHandler);
                        } else {
                            winterFlowValidatorHandler = winterFlowValidatorHandler2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new WinterFlowFunctionJSON(winterFlowAdapterUnitTest2, winterFlowValidatorHandler, new WinterFlowObjectPackage(winterFlowSyntaxEvent2, firebaseMessaging, winterFlowDatabaseSchemaBandwidth2, 26, false), context4, scheduledThreadPoolExecutor3);
            }
        }).WinterFlowHookDataSource(scheduledThreadPoolExecutor, new WinterFlowResponseProcess(this, i));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.android.datatransport.WinterFlowRendererDatabase
            public final /* synthetic */ FirebaseMessaging WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WinterFlowExceptionParser WinterFlowSyntax;
                int i3;
                int i4 = i2;
                FirebaseMessaging firebaseMessaging = this.WinterFlowTransactionManagerStrategy;
                switch (i4) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        if (firebaseMessaging.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure() && firebaseMessaging.WinterFlowRouterRouter(firebaseMessaging.WinterFlowArrayNetwork())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.WinterFlowTransactionAgent) {
                                    firebaseMessaging.WinterFlowUnitTestResponse(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context4 = firebaseMessaging.WinterFlowHookDataSource;
                        WinterFlowProviderRouter.WinterFlowBandwidthObject(context4);
                        WinterFlowSchedulerParser winterFlowSchedulerParser2 = firebaseMessaging.WinterFlowCacheManagerAgent;
                        final boolean WinterFlowTransactionManagerStrategy = firebaseMessaging.WinterFlowTransactionManagerStrategy();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences WinterFlowTransactionManagerStrategy2 = WinterFlowFrameworkMechanism.WinterFlowTransactionManagerStrategy(context4);
                            if (!WinterFlowTransactionManagerStrategy2.contains("proxy_retention") || WinterFlowTransactionManagerStrategy2.getBoolean("proxy_retention", false) != WinterFlowTransactionManagerStrategy) {
                                WinterFlowProviderUserManager winterFlowProviderUserManager2 = (WinterFlowProviderUserManager) winterFlowSchedulerParser2.WinterFlowCacheManagerAgent;
                                if (winterFlowProviderUserManager2.WinterFlowCacheManagerAgent.WinterFlowConcurrencyThread() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", WinterFlowTransactionManagerStrategy);
                                    WinterFlowProtocolPlatform WinterFlowTransactionAgent = WinterFlowProtocolPlatform.WinterFlowTransactionAgent(winterFlowProviderUserManager2.WinterFlowHookDataSource);
                                    synchronized (WinterFlowTransactionAgent) {
                                        i3 = WinterFlowTransactionAgent.WinterFlowRouterStructure;
                                        WinterFlowTransactionAgent.WinterFlowRouterStructure = i3 + 1;
                                    }
                                    WinterFlowSyntax = WinterFlowTransactionAgent.WinterFlowServerProtocol(new WinterFlowWidgetUtility(i3, 4, bundle, 0));
                                } else {
                                    WinterFlowSyntax = WinterFlowHookProcessor.WinterFlowSyntax(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                WinterFlowSyntax.WinterFlowHookDataSource(new WinterFlowOrchestrationSession(1), new WinterFlowListenerModule() { // from class: com.google.android.datatransport.WinterFlowCompilerThreadPool
                                    @Override // com.google.android.datatransport.WinterFlowListenerModule
                                    public final void WinterFlowCacheManagerAgent(Object obj) {
                                        SharedPreferences.Editor edit = WinterFlowFrameworkMechanism.WinterFlowTransactionManagerStrategy(context4).edit();
                                        edit.putBoolean("proxy_retention", WinterFlowTransactionManagerStrategy);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.WinterFlowTransactionManagerStrategy()) {
                            firebaseMessaging.WinterFlowVariableVersionControl();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static synchronized WinterFlowNodeSerializer WinterFlowCacheManagerAgent(Context context) {
        WinterFlowNodeSerializer winterFlowNodeSerializer;
        synchronized (FirebaseMessaging.class) {
            winterFlowNodeSerializer = WinterFlowServerProtocol;
            if (winterFlowNodeSerializer == null) {
                winterFlowNodeSerializer = new WinterFlowNodeSerializer(context);
                WinterFlowServerProtocol = winterFlowNodeSerializer;
            }
        }
        return winterFlowNodeSerializer;
    }

    public static void WinterFlowHookDataSource(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = WinterFlowServiceUtility;
                if (scheduledThreadPoolExecutor == null) {
                    scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new WinterFlowCompilerScheduler("TAG"));
                    WinterFlowServiceUtility = scheduledThreadPoolExecutor;
                }
                scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public static synchronized FirebaseMessaging getInstance(com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            winterFlowSyntaxEvent.WinterFlowRouterStructure();
            firebaseMessaging = (FirebaseMessaging) winterFlowSyntaxEvent.WinterFlowArrayNetwork.WinterFlowRouterStructure(FirebaseMessaging.class);
            WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final WinterFlowThreadJava WinterFlowArrayNetwork() {
        WinterFlowThreadJava WinterFlowHookDataSource;
        WinterFlowNodeSerializer WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent(this.WinterFlowHookDataSource);
        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = this.WinterFlowRouterStructure;
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        String WinterFlowCacheManagerAgent2 = "[DEFAULT]".equals(winterFlowSyntaxEvent.WinterFlowHookDataSource) ? "" : winterFlowSyntaxEvent.WinterFlowCacheManagerAgent();
        String WinterFlowCacheManagerAgent3 = WinterFlowAdapterUnitTest.WinterFlowCacheManagerAgent(this.WinterFlowRouterStructure);
        synchronized (WinterFlowCacheManagerAgent) {
            WinterFlowHookDataSource = WinterFlowThreadJava.WinterFlowHookDataSource(((SharedPreferences) WinterFlowCacheManagerAgent.WinterFlowVariableVersionControl).getString(WinterFlowCacheManagerAgent2 + "|T|" + WinterFlowCacheManagerAgent3 + "|*", null));
        }
        return WinterFlowHookDataSource;
    }

    public final boolean WinterFlowRouterRouter(WinterFlowThreadJava winterFlowThreadJava) {
        String str;
        if (winterFlowThreadJava != null) {
            String str2 = (String) winterFlowThreadJava.WinterFlowHookDataSource;
            String WinterFlowHookDataSource = this.WinterFlowSyntax.WinterFlowHookDataSource();
            if (System.currentTimeMillis() <= winterFlowThreadJava.WinterFlowRouterStructure + 604800000 && WinterFlowHookDataSource.equals((String) winterFlowThreadJava.WinterFlowCacheManagerAgent)) {
                if (this.WinterFlowArrayNetwork.WinterFlowTransactionAgent()) {
                    try {
                        str = (String) WinterFlowHookProcessor.WinterFlowArrayNetwork(((WinterFlowBackendComponent) this.WinterFlowResponseEngine).WinterFlowCacheManagerAgent());
                    } catch (InterruptedException | ExecutionException unused) {
                        str = null;
                    }
                    return !str2.equalsIgnoreCase(str);
                }
                if (str2.length() > 22) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String WinterFlowRouterStructure() {
        WinterFlowExceptionParser winterFlowExceptionParser;
        WinterFlowThreadJava WinterFlowArrayNetwork = WinterFlowArrayNetwork();
        if (!WinterFlowRouterRouter(WinterFlowArrayNetwork)) {
            return (String) WinterFlowArrayNetwork.WinterFlowHookDataSource;
        }
        String WinterFlowCacheManagerAgent = WinterFlowAdapterUnitTest.WinterFlowCacheManagerAgent(this.WinterFlowRouterStructure);
        WinterFlowAlgorithmArray winterFlowAlgorithmArray = this.WinterFlowVariableVersionControl;
        WinterFlowListenerWebsocket winterFlowListenerWebsocket = new WinterFlowListenerWebsocket(this, WinterFlowCacheManagerAgent, WinterFlowArrayNetwork);
        synchronized (winterFlowAlgorithmArray) {
            winterFlowExceptionParser = (WinterFlowExceptionParser) ((WinterFlowUnitTestSystem) winterFlowAlgorithmArray.WinterFlowUnitTestResponse).get(WinterFlowCacheManagerAgent);
            if (winterFlowExceptionParser == null) {
                winterFlowExceptionParser = winterFlowListenerWebsocket.WinterFlowHookDataSource().WinterFlowArrayNetwork((Executor) winterFlowAlgorithmArray.WinterFlowTransactionManagerStrategy, new WinterFlowStackInterface(6, (Object) winterFlowAlgorithmArray, WinterFlowCacheManagerAgent));
                ((WinterFlowUnitTestSystem) winterFlowAlgorithmArray.WinterFlowUnitTestResponse).put(WinterFlowCacheManagerAgent, winterFlowExceptionParser);
            }
        }
        try {
            return (String) WinterFlowHookProcessor.WinterFlowArrayNetwork(winterFlowExceptionParser);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException("FCM Registration failed!", e);
        }
    }

    public final boolean WinterFlowTransactionManagerStrategy() {
        String notificationDelegate;
        Context context = this.WinterFlowHookDataSource;
        WinterFlowProviderRouter.WinterFlowBandwidthObject(context);
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = this.WinterFlowRouterStructure;
                    winterFlowSyntaxEvent.WinterFlowRouterStructure();
                    if (winterFlowSyntaxEvent.WinterFlowArrayNetwork.WinterFlowRouterStructure(WinterFlowAPILayer.class) != null) {
                        return true;
                    }
                    if (WinterFlowEncryptionSubsystem.WinterFlowSingletonPlatform() && WinterFlowThreadListener != null) {
                        return true;
                    }
                }
                return false;
            }
            context.getPackageName();
        }
        return false;
    }

    public final synchronized void WinterFlowUnitTestResponse(long j) {
        WinterFlowHookDataSource(new WinterFlowSyntaxEvent(this, Math.min(Math.max(30L, 2 * j), 28800L)), j);
        this.WinterFlowTransactionAgent = true;
    }

    public final void WinterFlowVariableVersionControl() {
        WinterFlowExceptionParser WinterFlowSyntax;
        int i;
        WinterFlowProviderUserManager winterFlowProviderUserManager = (WinterFlowProviderUserManager) this.WinterFlowCacheManagerAgent.WinterFlowCacheManagerAgent;
        int i2 = 1;
        if (winterFlowProviderUserManager.WinterFlowCacheManagerAgent.WinterFlowConcurrencyThread() >= 241100000) {
            WinterFlowProtocolPlatform WinterFlowTransactionAgent = WinterFlowProtocolPlatform.WinterFlowTransactionAgent(winterFlowProviderUserManager.WinterFlowHookDataSource);
            Bundle bundle = Bundle.EMPTY;
            synchronized (WinterFlowTransactionAgent) {
                i = WinterFlowTransactionAgent.WinterFlowRouterStructure;
                WinterFlowTransactionAgent.WinterFlowRouterStructure = i + 1;
            }
            WinterFlowSyntax = WinterFlowTransactionAgent.WinterFlowServerProtocol(new WinterFlowWidgetUtility(i, 5, bundle, 1)).WinterFlowCacheManagerAgent(WinterFlowRuntimeService.WinterFlowTransactionManagerStrategy, WinterFlowPackageHook.WinterFlowTransactionManagerStrategy);
        } else {
            WinterFlowSyntax = WinterFlowHookProcessor.WinterFlowSyntax(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        WinterFlowSyntax.WinterFlowHookDataSource(this.WinterFlowUnitTestResponse, new WinterFlowResponseProcess(this, i2));
    }
}
