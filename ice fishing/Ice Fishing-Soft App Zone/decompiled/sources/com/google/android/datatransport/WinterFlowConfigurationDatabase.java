package com.google.android.datatransport;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConfigurationDatabase implements ServiceConnection {
    public IBinder WinterFlowArrayNetwork;
    public boolean WinterFlowCacheManagerAgent;
    public ComponentName WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowTransactionWorker WinterFlowUnitTestResponse;
    public final WinterFlowHandlerFunction WinterFlowVariableVersionControl;
    public final HashMap WinterFlowRouterStructure = new HashMap();
    public int WinterFlowHookDataSource = 2;

    public WinterFlowConfigurationDatabase(WinterFlowTransactionWorker winterFlowTransactionWorker, WinterFlowHandlerFunction winterFlowHandlerFunction) {
        this.WinterFlowUnitTestResponse = winterFlowTransactionWorker;
        this.WinterFlowVariableVersionControl = winterFlowHandlerFunction;
    }

    public final ConnectionResult WinterFlowRouterStructure(String str, Executor executor) {
        try {
            Intent WinterFlowRouterStructure = WinterFlowListenerNode.WinterFlowRouterStructure(this.WinterFlowUnitTestResponse.WinterFlowHookDataSource, this.WinterFlowVariableVersionControl);
            this.WinterFlowHookDataSource = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(WinterFlowThreadPoolInvoker.WinterFlowRouterStructure(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                WinterFlowTransactionWorker winterFlowTransactionWorker = this.WinterFlowUnitTestResponse;
                WinterFlowConfigurationModule winterFlowConfigurationModule = winterFlowTransactionWorker.WinterFlowArrayNetwork;
                Context context = winterFlowTransactionWorker.WinterFlowHookDataSource;
                WinterFlowHandlerFunction winterFlowHandlerFunction = this.WinterFlowVariableVersionControl;
                boolean WinterFlowRouterAdapter = winterFlowConfigurationModule.WinterFlowRouterAdapter(context, str, WinterFlowRouterStructure, this, 4225, executor);
                this.WinterFlowCacheManagerAgent = WinterFlowRouterAdapter;
                if (WinterFlowRouterAdapter) {
                    winterFlowTransactionWorker.WinterFlowCacheManagerAgent.sendMessageDelayed(winterFlowTransactionWorker.WinterFlowCacheManagerAgent.obtainMessage(1, winterFlowHandlerFunction), winterFlowTransactionWorker.WinterFlowTransactionManagerStrategy);
                    ConnectionResult connectionResult = ConnectionResult.WinterFlowResponseEngine;
                    StrictMode.setVmPolicy(vmPolicy);
                    return connectionResult;
                }
                this.WinterFlowHookDataSource = 2;
                try {
                    winterFlowTransactionWorker.WinterFlowArrayNetwork.WinterFlowBatchUI(winterFlowTransactionWorker.WinterFlowHookDataSource, this);
                } catch (IllegalArgumentException unused) {
                }
                ConnectionResult connectionResult2 = new ConnectionResult(16, null, null);
                StrictMode.setVmPolicy(vmPolicy);
                return connectionResult2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (WinterFlowResolverVariable e) {
            return e.WinterFlowVariableVersionControl;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        WinterFlowTransactionWorker winterFlowTransactionWorker = this.WinterFlowUnitTestResponse;
        synchronized (winterFlowTransactionWorker.WinterFlowRouterStructure) {
            try {
                winterFlowTransactionWorker.WinterFlowCacheManagerAgent.removeMessages(1, this.WinterFlowVariableVersionControl);
                this.WinterFlowArrayNetwork = iBinder;
                this.WinterFlowTransactionManagerStrategy = componentName;
                Iterator it = this.WinterFlowRouterStructure.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.WinterFlowHookDataSource = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        WinterFlowTransactionWorker winterFlowTransactionWorker = this.WinterFlowUnitTestResponse;
        synchronized (winterFlowTransactionWorker.WinterFlowRouterStructure) {
            try {
                winterFlowTransactionWorker.WinterFlowCacheManagerAgent.removeMessages(1, this.WinterFlowVariableVersionControl);
                this.WinterFlowArrayNetwork = null;
                this.WinterFlowTransactionManagerStrategy = componentName;
                Iterator it = this.WinterFlowRouterStructure.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.WinterFlowHookDataSource = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
