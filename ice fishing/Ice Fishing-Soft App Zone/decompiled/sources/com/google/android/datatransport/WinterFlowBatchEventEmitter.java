package com.google.android.datatransport;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowBatchEventEmitter implements Handler.Callback {
    public final /* synthetic */ Object WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowBatchEventEmitter(int i, Object obj) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentName componentName = null;
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    new StringBuilder(String.valueOf(i).length() + 30);
                }
                WinterFlowSchedulerWorker winterFlowSchedulerWorker = (WinterFlowSchedulerWorker) this.WinterFlowHookDataSource;
                synchronized (winterFlowSchedulerWorker) {
                    try {
                        SparseArray sparseArray = winterFlowSchedulerWorker.WinterFlowVariableVersionControl;
                        WinterFlowWidgetUtility winterFlowWidgetUtility = (WinterFlowWidgetUtility) sparseArray.get(i);
                        if (winterFlowWidgetUtility != null) {
                            sparseArray.remove(i);
                            winterFlowSchedulerWorker.WinterFlowArrayNetwork();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                switch (winterFlowWidgetUtility.WinterFlowVariableVersionControl) {
                                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                        if (!data.getBoolean("ack", false)) {
                                            winterFlowWidgetUtility.WinterFlowCacheManagerAgent(new WinterFlowSchedulerMicroservice("Invalid response to one way request", null));
                                            break;
                                        } else {
                                            winterFlowWidgetUtility.WinterFlowHookDataSource(null);
                                            break;
                                        }
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        winterFlowWidgetUtility.WinterFlowHookDataSource(bundle);
                                        break;
                                }
                            } else {
                                winterFlowWidgetUtility.WinterFlowCacheManagerAgent(new WinterFlowSchedulerMicroservice("Not supported by GmsCore", null));
                            }
                        } else {
                            new StringBuilder(String.valueOf(i).length() + 39);
                        }
                    } finally {
                    }
                }
                return true;
            default:
                int i2 = message.what;
                if (i2 == 0) {
                    WinterFlowTransactionWorker winterFlowTransactionWorker = (WinterFlowTransactionWorker) this.WinterFlowHookDataSource;
                    synchronized (winterFlowTransactionWorker.WinterFlowRouterStructure) {
                        try {
                            WinterFlowHandlerFunction winterFlowHandlerFunction = (WinterFlowHandlerFunction) message.obj;
                            WinterFlowConfigurationDatabase winterFlowConfigurationDatabase = (WinterFlowConfigurationDatabase) winterFlowTransactionWorker.WinterFlowRouterStructure.get(winterFlowHandlerFunction);
                            if (winterFlowConfigurationDatabase != null && winterFlowConfigurationDatabase.WinterFlowRouterStructure.isEmpty()) {
                                if (winterFlowConfigurationDatabase.WinterFlowCacheManagerAgent) {
                                    WinterFlowHandlerFunction winterFlowHandlerFunction2 = winterFlowConfigurationDatabase.WinterFlowVariableVersionControl;
                                    WinterFlowTransactionWorker winterFlowTransactionWorker2 = winterFlowConfigurationDatabase.WinterFlowUnitTestResponse;
                                    winterFlowTransactionWorker2.WinterFlowCacheManagerAgent.removeMessages(1, winterFlowHandlerFunction2);
                                    winterFlowTransactionWorker2.WinterFlowArrayNetwork.WinterFlowBatchUI(winterFlowTransactionWorker2.WinterFlowHookDataSource, winterFlowConfigurationDatabase);
                                    winterFlowConfigurationDatabase.WinterFlowCacheManagerAgent = false;
                                    winterFlowConfigurationDatabase.WinterFlowHookDataSource = 2;
                                }
                                winterFlowTransactionWorker.WinterFlowRouterStructure.remove(winterFlowHandlerFunction);
                            }
                        } finally {
                        }
                    }
                    return true;
                }
                if (i2 != 1) {
                    return false;
                }
                WinterFlowTransactionWorker winterFlowTransactionWorker3 = (WinterFlowTransactionWorker) this.WinterFlowHookDataSource;
                synchronized (winterFlowTransactionWorker3.WinterFlowRouterStructure) {
                    try {
                        WinterFlowHandlerFunction winterFlowHandlerFunction3 = (WinterFlowHandlerFunction) message.obj;
                        WinterFlowConfigurationDatabase winterFlowConfigurationDatabase2 = (WinterFlowConfigurationDatabase) winterFlowTransactionWorker3.WinterFlowRouterStructure.get(winterFlowHandlerFunction3);
                        if (winterFlowConfigurationDatabase2 != null && winterFlowConfigurationDatabase2.WinterFlowHookDataSource == 3) {
                            new StringBuilder(String.valueOf(winterFlowHandlerFunction3).length() + 47);
                            new Exception();
                            ComponentName componentName2 = winterFlowConfigurationDatabase2.WinterFlowTransactionManagerStrategy;
                            if (componentName2 == null) {
                                winterFlowHandlerFunction3.getClass();
                            } else {
                                componentName = componentName2;
                            }
                            if (componentName == null) {
                                winterFlowHandlerFunction3.getClass();
                                componentName = new ComponentName("com.google.android.gms", "unknown");
                            }
                            winterFlowConfigurationDatabase2.onServiceDisconnected(componentName);
                        }
                    } finally {
                    }
                }
                return true;
        }
    }
}
