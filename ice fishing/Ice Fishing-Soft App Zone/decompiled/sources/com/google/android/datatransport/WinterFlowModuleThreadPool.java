package com.google.android.datatransport;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowModuleThreadPool implements Runnable {
    public final /* synthetic */ WinterFlowSchedulerWorker WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowModuleThreadPool(WinterFlowSchedulerWorker winterFlowSchedulerWorker, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowSchedulerWorker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowSchedulerWorker winterFlowSchedulerWorker = this.WinterFlowTransactionManagerStrategy;
                synchronized (winterFlowSchedulerWorker) {
                    if (winterFlowSchedulerWorker.WinterFlowRouterStructure == 1) {
                        winterFlowSchedulerWorker.WinterFlowHookDataSource("Timed out while binding");
                    }
                }
                return;
            case 1:
                break;
            default:
                this.WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource("Service disconnected");
                return;
        }
        while (true) {
            WinterFlowSchedulerWorker winterFlowSchedulerWorker2 = this.WinterFlowTransactionManagerStrategy;
            synchronized (winterFlowSchedulerWorker2) {
                try {
                    if (winterFlowSchedulerWorker2.WinterFlowRouterStructure != 2) {
                        return;
                    }
                    ArrayDeque arrayDeque = winterFlowSchedulerWorker2.WinterFlowArrayNetwork;
                    if (arrayDeque.isEmpty()) {
                        winterFlowSchedulerWorker2.WinterFlowArrayNetwork();
                        return;
                    }
                    WinterFlowWidgetUtility winterFlowWidgetUtility = (WinterFlowWidgetUtility) arrayDeque.poll();
                    SparseArray sparseArray = winterFlowSchedulerWorker2.WinterFlowVariableVersionControl;
                    int i = winterFlowWidgetUtility.WinterFlowRouterStructure;
                    sparseArray.put(i, winterFlowWidgetUtility);
                    ((ScheduledExecutorService) winterFlowSchedulerWorker2.WinterFlowTransactionManagerStrategy.WinterFlowCacheManagerAgent).schedule(new WinterFlowProtocolThread(9, winterFlowSchedulerWorker2, winterFlowWidgetUtility, false), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(winterFlowWidgetUtility));
                    }
                    WinterFlowProtocolPlatform winterFlowProtocolPlatform = winterFlowSchedulerWorker2.WinterFlowTransactionManagerStrategy;
                    Messenger messenger = winterFlowSchedulerWorker2.WinterFlowHookDataSource;
                    int i2 = winterFlowWidgetUtility.WinterFlowCacheManagerAgent;
                    Message obtain = Message.obtain();
                    obtain.what = i2;
                    obtain.arg1 = i;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", winterFlowWidgetUtility.WinterFlowRouterStructure());
                    bundle.putString("pkg", ((Context) winterFlowProtocolPlatform.WinterFlowHookDataSource).getPackageName());
                    bundle.putBundle("data", winterFlowWidgetUtility.WinterFlowArrayNetwork);
                    obtain.setData(bundle);
                    try {
                        WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = winterFlowSchedulerWorker2.WinterFlowCacheManagerAgent;
                        Messenger messenger2 = (Messenger) winterFlowCacheManagerVersionControl.WinterFlowTransactionManagerStrategy;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            WinterFlowResponseHandler winterFlowResponseHandler = (WinterFlowResponseHandler) winterFlowCacheManagerVersionControl.WinterFlowUnitTestResponse;
                            if (winterFlowResponseHandler == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            winterFlowResponseHandler.WinterFlowVariableVersionControl.send(obtain);
                        }
                    } catch (RemoteException e) {
                        winterFlowSchedulerWorker2.WinterFlowHookDataSource(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
