package com.google.android.datatransport;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.SparseArray;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProtocolThread implements Runnable {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowProtocolThread(int i, Object obj, Object obj2) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowUnitTestResponse = obj;
        this.WinterFlowTransactionManagerStrategy = obj2;
    }

    private final void WinterFlowHookDataSource() {
        WinterFlowWidgetUtility winterFlowWidgetUtility = (WinterFlowWidgetUtility) this.WinterFlowUnitTestResponse;
        WinterFlowSchedulerWorker winterFlowSchedulerWorker = (WinterFlowSchedulerWorker) this.WinterFlowTransactionManagerStrategy;
        int i = winterFlowWidgetUtility.WinterFlowRouterStructure;
        synchronized (winterFlowSchedulerWorker) {
            SparseArray sparseArray = winterFlowSchedulerWorker.WinterFlowVariableVersionControl;
            WinterFlowWidgetUtility winterFlowWidgetUtility2 = (WinterFlowWidgetUtility) sparseArray.get(i);
            if (winterFlowWidgetUtility2 != null) {
                new StringBuilder(String.valueOf(i).length() + 20);
                sparseArray.remove(i);
                winterFlowWidgetUtility2.WinterFlowCacheManagerAgent(new WinterFlowSchedulerMicroservice("Timed out waiting for response", null));
                winterFlowSchedulerWorker.WinterFlowArrayNetwork();
            }
        }
    }

    private final void WinterFlowRouterStructure() {
        WinterFlowProtocolMechanism winterFlowProtocolMechanism = (WinterFlowProtocolMechanism) this.WinterFlowUnitTestResponse;
        synchronized (winterFlowProtocolMechanism.WinterFlowUnitTestResponse) {
            ((WinterFlowListenerModule) winterFlowProtocolMechanism.WinterFlowRouterRouter).WinterFlowCacheManagerAgent(((WinterFlowExceptionParser) this.WinterFlowTransactionManagerStrategy).WinterFlowTransactionManagerStrategy());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        boolean z;
        List list2;
        List list3;
        Runnable runnable;
        List list4;
        WinterFlowBandwidthRefactoring winterFlowBandwidthRefactoring;
        WinterFlowBandwidthRefactoring winterFlowBandwidthComponent;
        int i = 1;
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((SingleThreadCachedScheduler) this.WinterFlowUnitTestResponse).tryExecuteRunnable((Runnable) this.WinterFlowTransactionManagerStrategy);
                while (true) {
                    list = ((SingleThreadCachedScheduler) this.WinterFlowUnitTestResponse).queue;
                    synchronized (list) {
                        try {
                            z = ((SingleThreadCachedScheduler) this.WinterFlowUnitTestResponse).isTeardown;
                            if (z) {
                                return;
                            }
                            list2 = ((SingleThreadCachedScheduler) this.WinterFlowUnitTestResponse).queue;
                            boolean isEmpty = list2.isEmpty();
                            SingleThreadCachedScheduler singleThreadCachedScheduler = (SingleThreadCachedScheduler) this.WinterFlowUnitTestResponse;
                            if (isEmpty) {
                                singleThreadCachedScheduler.isThreadProcessing = false;
                                return;
                            }
                            list3 = singleThreadCachedScheduler.queue;
                            runnable = (Runnable) list3.get(0);
                            list4 = ((SingleThreadCachedScheduler) this.WinterFlowUnitTestResponse).queue;
                            list4.remove(0);
                        } finally {
                        }
                    }
                    ((SingleThreadCachedScheduler) this.WinterFlowUnitTestResponse).tryExecuteRunnable(runnable);
                }
            case 1:
                ConnectionResult connectionResult = (ConnectionResult) this.WinterFlowTransactionManagerStrategy;
                WinterFlowConfiguration winterFlowConfiguration = (WinterFlowConfiguration) this.WinterFlowUnitTestResponse;
                WinterFlowTransactionManagerStack winterFlowTransactionManagerStack = winterFlowConfiguration.WinterFlowResponseEngine;
                com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent = winterFlowConfiguration.WinterFlowVariableVersionControl;
                WinterFlowCacheTransactionManager winterFlowCacheTransactionManager = (WinterFlowCacheTransactionManager) winterFlowTransactionManagerStack.WinterFlowResponseEngine.get(winterFlowConfiguration.WinterFlowTransactionManagerStrategy);
                if (winterFlowCacheTransactionManager == null) {
                    return;
                }
                if (connectionResult.WinterFlowTransactionManagerStrategy != 0) {
                    winterFlowCacheTransactionManager.WinterFlowServiceUtility(connectionResult, null);
                    return;
                }
                winterFlowConfiguration.WinterFlowSyntax = true;
                if (winterFlowSyntaxEvent.WinterFlowServiceUtility()) {
                    if (!winterFlowConfiguration.WinterFlowSyntax || (winterFlowBandwidthRefactoring = winterFlowConfiguration.WinterFlowUnitTestResponse) == null) {
                        return;
                    }
                    winterFlowSyntaxEvent.WinterFlowUnitTestResponse(winterFlowBandwidthRefactoring, winterFlowConfiguration.WinterFlowRouterRouter);
                    return;
                }
                try {
                    winterFlowSyntaxEvent.WinterFlowUnitTestResponse(null, winterFlowSyntaxEvent.WinterFlowServiceUtility() ? winterFlowSyntaxEvent.WinterFlowResolverController : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException unused) {
                    winterFlowSyntaxEvent.WinterFlowCacheManagerAgent("Failed to get service from broker.");
                    winterFlowCacheTransactionManager.WinterFlowServiceUtility(new ConnectionResult(10, null, null), null);
                    return;
                }
            case 2:
                WinterFlowManagerStructure winterFlowManagerStructure = (WinterFlowManagerStructure) this.WinterFlowUnitTestResponse;
                WinterFlowRouterQueue winterFlowRouterQueue = (WinterFlowRouterQueue) this.WinterFlowTransactionManagerStrategy;
                ConnectionResult connectionResult2 = winterFlowRouterQueue.WinterFlowTransactionManagerStrategy;
                if (connectionResult2.WinterFlowTransactionManagerStrategy == 0) {
                    WinterFlowFrameworkUtility winterFlowFrameworkUtility = winterFlowRouterQueue.WinterFlowUnitTestResponse;
                    WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(winterFlowFrameworkUtility);
                    ConnectionResult connectionResult3 = winterFlowFrameworkUtility.WinterFlowUnitTestResponse;
                    if (connectionResult3.WinterFlowTransactionManagerStrategy != 0) {
                        String valueOf = String.valueOf(connectionResult3);
                        new Exception();
                        "Sign-in succeeded with resolve account failure: ".concat(valueOf);
                        winterFlowManagerStructure.WinterFlowResponseEngine.WinterFlowRouterStructure(connectionResult3);
                        winterFlowManagerStructure.WinterFlowSyntax.WinterFlowHookDataSource();
                        return;
                    }
                    WinterFlowConfiguration winterFlowConfiguration2 = winterFlowManagerStructure.WinterFlowResponseEngine;
                    IBinder iBinder = winterFlowFrameworkUtility.WinterFlowTransactionManagerStrategy;
                    if (iBinder == null) {
                        winterFlowBandwidthComponent = null;
                    } else {
                        int i2 = WinterFlowJavaFrontend.WinterFlowArrayNetwork;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        winterFlowBandwidthComponent = queryLocalInterface instanceof WinterFlowBandwidthRefactoring ? (WinterFlowBandwidthRefactoring) queryLocalInterface : new WinterFlowBandwidthComponent(iBinder);
                    }
                    Set set = winterFlowManagerStructure.WinterFlowUnitTestResponse;
                    winterFlowConfiguration2.getClass();
                    if (winterFlowBandwidthComponent == null || set == null) {
                        new Exception();
                        winterFlowConfiguration2.WinterFlowRouterStructure(new ConnectionResult(4, null, null));
                    } else {
                        winterFlowConfiguration2.WinterFlowUnitTestResponse = winterFlowBandwidthComponent;
                        winterFlowConfiguration2.WinterFlowRouterRouter = set;
                        if (winterFlowConfiguration2.WinterFlowSyntax) {
                            winterFlowConfiguration2.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(winterFlowBandwidthComponent, set);
                        }
                    }
                } else {
                    winterFlowManagerStructure.WinterFlowResponseEngine.WinterFlowRouterStructure(connectionResult2);
                }
                winterFlowManagerStructure.WinterFlowSyntax.WinterFlowHookDataSource();
                return;
            case 3:
                WinterFlowExceptionParser winterFlowExceptionParser = (WinterFlowExceptionParser) this.WinterFlowTransactionManagerStrategy;
                boolean z2 = winterFlowExceptionParser.WinterFlowArrayNetwork;
                WinterFlowResponseEntity winterFlowResponseEntity = (WinterFlowResponseEntity) this.WinterFlowUnitTestResponse;
                if (z2) {
                    winterFlowResponseEntity.WinterFlowRouterRouter.WinterFlowTransactionAgent();
                    return;
                }
                try {
                    ((WinterFlowResponseEntity) this.WinterFlowUnitTestResponse).WinterFlowRouterRouter.WinterFlowSyntax(winterFlowResponseEntity.WinterFlowUnitTestResponse.WinterFlowArrayNetwork(winterFlowExceptionParser));
                    return;
                } catch (WinterFlowDataSourceRouter e) {
                    boolean z3 = e.getCause() instanceof Exception;
                    WinterFlowResponseEntity winterFlowResponseEntity2 = (WinterFlowResponseEntity) this.WinterFlowUnitTestResponse;
                    if (z3) {
                        winterFlowResponseEntity2.WinterFlowRouterRouter.WinterFlowResponseEngine((Exception) e.getCause());
                        return;
                    } else {
                        winterFlowResponseEntity2.WinterFlowRouterRouter.WinterFlowResponseEngine(e);
                        return;
                    }
                } catch (Exception e2) {
                    ((WinterFlowResponseEntity) this.WinterFlowUnitTestResponse).WinterFlowRouterRouter.WinterFlowResponseEngine(e2);
                    return;
                }
            case 4:
                WinterFlowResponseEntity winterFlowResponseEntity3 = (WinterFlowResponseEntity) this.WinterFlowUnitTestResponse;
                WinterFlowExceptionParser winterFlowExceptionParser2 = winterFlowResponseEntity3.WinterFlowRouterRouter;
                try {
                    WinterFlowExceptionParser winterFlowExceptionParser3 = (WinterFlowExceptionParser) winterFlowResponseEntity3.WinterFlowUnitTestResponse.WinterFlowArrayNetwork((WinterFlowExceptionParser) this.WinterFlowTransactionManagerStrategy);
                    if (winterFlowExceptionParser3 == null) {
                        winterFlowResponseEntity3.WinterFlowArrayNetwork(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    WinterFlowCacheModule winterFlowCacheModule = winterFlowExceptionParser3.WinterFlowHookDataSource;
                    WinterFlowRuntimeService winterFlowRuntimeService = WinterFlowCacheHandler.WinterFlowHookDataSource;
                    winterFlowExceptionParser3.WinterFlowHookDataSource(winterFlowRuntimeService, winterFlowResponseEntity3);
                    winterFlowCacheModule.WinterFlowHookDataSource(new WinterFlowProtocolMechanism((Executor) winterFlowRuntimeService, (WinterFlowMicroserviceMiddleware) winterFlowResponseEntity3));
                    winterFlowExceptionParser3.WinterFlowThreadListener();
                    winterFlowCacheModule.WinterFlowHookDataSource(new WinterFlowProtocolMechanism((Executor) winterFlowRuntimeService, (WinterFlowTransactionDeserialization) winterFlowResponseEntity3));
                    winterFlowExceptionParser3.WinterFlowThreadListener();
                    return;
                } catch (WinterFlowDataSourceRouter e3) {
                    if (e3.getCause() instanceof Exception) {
                        winterFlowExceptionParser2.WinterFlowResponseEngine((Exception) e3.getCause());
                        return;
                    } else {
                        winterFlowExceptionParser2.WinterFlowResponseEngine(e3);
                        return;
                    }
                } catch (Exception e4) {
                    winterFlowExceptionParser2.WinterFlowResponseEngine(e4);
                    return;
                }
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                WinterFlowProtocolMechanism winterFlowProtocolMechanism = (WinterFlowProtocolMechanism) this.WinterFlowUnitTestResponse;
                synchronized (winterFlowProtocolMechanism.WinterFlowUnitTestResponse) {
                    ((WinterFlowDeserializationProcess) winterFlowProtocolMechanism.WinterFlowRouterRouter).WinterFlowRouterStructure((WinterFlowExceptionParser) this.WinterFlowTransactionManagerStrategy);
                }
                return;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                WinterFlowProtocolMechanism winterFlowProtocolMechanism2 = (WinterFlowProtocolMechanism) this.WinterFlowUnitTestResponse;
                synchronized (winterFlowProtocolMechanism2.WinterFlowUnitTestResponse) {
                    WinterFlowMicroserviceMiddleware winterFlowMicroserviceMiddleware = (WinterFlowMicroserviceMiddleware) winterFlowProtocolMechanism2.WinterFlowRouterRouter;
                    Exception WinterFlowVariableVersionControl = ((WinterFlowExceptionParser) this.WinterFlowTransactionManagerStrategy).WinterFlowVariableVersionControl();
                    WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(WinterFlowVariableVersionControl);
                    winterFlowMicroserviceMiddleware.WinterFlowArrayNetwork(WinterFlowVariableVersionControl);
                }
                return;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                IBinder iBinder2 = (IBinder) this.WinterFlowUnitTestResponse;
                WinterFlowSchedulerWorker winterFlowSchedulerWorker = (WinterFlowSchedulerWorker) this.WinterFlowTransactionManagerStrategy;
                synchronized (winterFlowSchedulerWorker) {
                    if (iBinder2 == null) {
                        winterFlowSchedulerWorker.WinterFlowHookDataSource("Null service connection");
                    } else {
                        try {
                            winterFlowSchedulerWorker.WinterFlowCacheManagerAgent = new WinterFlowCacheManagerVersionControl(iBinder2);
                            winterFlowSchedulerWorker.WinterFlowRouterStructure = 2;
                            ((ScheduledExecutorService) winterFlowSchedulerWorker.WinterFlowTransactionManagerStrategy.WinterFlowCacheManagerAgent).execute(new WinterFlowModuleThreadPool(winterFlowSchedulerWorker, i));
                        } catch (RemoteException e5) {
                            winterFlowSchedulerWorker.WinterFlowHookDataSource(e5.getMessage());
                        }
                    }
                }
                return;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                WinterFlowRouterStructure();
                return;
            case 9:
                WinterFlowHookDataSource();
                return;
            case 10:
                WinterFlowProtocolMechanism winterFlowProtocolMechanism3 = (WinterFlowProtocolMechanism) this.WinterFlowUnitTestResponse;
                WinterFlowExceptionParser winterFlowExceptionParser4 = (WinterFlowExceptionParser) winterFlowProtocolMechanism3.WinterFlowRouterRouter;
                try {
                    WinterFlowExceptionParser WinterFlowRouterStructure = ((WinterFlowSoftwareRouter) winterFlowProtocolMechanism3.WinterFlowUnitTestResponse).WinterFlowRouterStructure(((WinterFlowExceptionParser) this.WinterFlowTransactionManagerStrategy).WinterFlowTransactionManagerStrategy());
                    WinterFlowCacheModule winterFlowCacheModule2 = WinterFlowRouterStructure.WinterFlowHookDataSource;
                    WinterFlowRuntimeService winterFlowRuntimeService2 = WinterFlowCacheHandler.WinterFlowHookDataSource;
                    WinterFlowRouterStructure.WinterFlowHookDataSource(winterFlowRuntimeService2, winterFlowProtocolMechanism3);
                    winterFlowCacheModule2.WinterFlowHookDataSource(new WinterFlowProtocolMechanism((Executor) winterFlowRuntimeService2, (WinterFlowMicroserviceMiddleware) winterFlowProtocolMechanism3));
                    WinterFlowRouterStructure.WinterFlowThreadListener();
                    winterFlowCacheModule2.WinterFlowHookDataSource(new WinterFlowProtocolMechanism((Executor) winterFlowRuntimeService2, (WinterFlowTransactionDeserialization) winterFlowProtocolMechanism3));
                    WinterFlowRouterStructure.WinterFlowThreadListener();
                    return;
                } catch (WinterFlowDataSourceRouter e6) {
                    if (e6.getCause() instanceof Exception) {
                        winterFlowProtocolMechanism3.WinterFlowArrayNetwork((Exception) e6.getCause());
                        return;
                    } else {
                        winterFlowExceptionParser4.WinterFlowResponseEngine(e6);
                        return;
                    }
                } catch (CancellationException unused2) {
                    winterFlowProtocolMechanism3.WinterFlowHookDataSource();
                    return;
                } catch (Exception e7) {
                    winterFlowExceptionParser4.WinterFlowResponseEngine(e7);
                    return;
                }
            default:
                WinterFlowExceptionParser winterFlowExceptionParser5 = (WinterFlowExceptionParser) this.WinterFlowTransactionManagerStrategy;
                try {
                    winterFlowExceptionParser5.WinterFlowSyntax(((Callable) this.WinterFlowUnitTestResponse).call());
                    return;
                } catch (Exception e8) {
                    winterFlowExceptionParser5.WinterFlowResponseEngine(e8);
                    return;
                } catch (Throwable th) {
                    winterFlowExceptionParser5.WinterFlowResponseEngine(new RuntimeException(th));
                    return;
                }
        }
    }

    public /* synthetic */ WinterFlowProtocolThread(int i, Object obj, Object obj2, boolean z) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
    }
}
