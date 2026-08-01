package com.google.android.datatransport;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInvokerIDE implements ServiceConnection {
    public final ArrayDeque WinterFlowArrayNetwork;
    public final ScheduledThreadPoolExecutor WinterFlowCacheManagerAgent;
    public final Intent WinterFlowHookDataSource;
    public final Context WinterFlowRouterStructure;
    public boolean WinterFlowTransactionManagerStrategy;
    public WinterFlowUserManagerOrchestration WinterFlowVariableVersionControl;

    public WinterFlowInvokerIDE(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new WinterFlowCompilerScheduler("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.WinterFlowArrayNetwork = new ArrayDeque();
        this.WinterFlowTransactionManagerStrategy = false;
        Context applicationContext = context.getApplicationContext();
        this.WinterFlowRouterStructure = applicationContext;
        this.WinterFlowHookDataSource = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.WinterFlowCacheManagerAgent = scheduledThreadPoolExecutor;
    }

    public final synchronized WinterFlowExceptionParser WinterFlowHookDataSource(Intent intent) {
        WinterFlowTransactionTransaction winterFlowTransactionTransaction;
        winterFlowTransactionTransaction = new WinterFlowTransactionTransaction(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.WinterFlowCacheManagerAgent;
        winterFlowTransactionTransaction.WinterFlowHookDataSource.WinterFlowRouterStructure.WinterFlowRouterStructure(scheduledThreadPoolExecutor, new WinterFlowExceptionBandwidth(10, scheduledThreadPoolExecutor.schedule(new WinterFlowServerConcurrency(11, winterFlowTransactionTransaction), 20L, TimeUnit.SECONDS)));
        this.WinterFlowArrayNetwork.add(winterFlowTransactionTransaction);
        WinterFlowRouterStructure();
        return winterFlowTransactionTransaction.WinterFlowHookDataSource.WinterFlowRouterStructure;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (r1.WinterFlowRouterAdapter(r2, r2.getClass().getName(), r8.WinterFlowHookDataSource, r5, 65, null) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void WinterFlowRouterStructure() {
        WinterFlowInvokerIDE winterFlowInvokerIDE;
        while (!this.WinterFlowArrayNetwork.isEmpty()) {
            try {
                WinterFlowUserManagerOrchestration winterFlowUserManagerOrchestration = this.WinterFlowVariableVersionControl;
                if (winterFlowUserManagerOrchestration == null || !winterFlowUserManagerOrchestration.isBinderAlive()) {
                    try {
                        if (this.WinterFlowTransactionManagerStrategy) {
                            winterFlowInvokerIDE = this;
                        } else {
                            try {
                                this.WinterFlowTransactionManagerStrategy = true;
                                try {
                                    WinterFlowConfigurationModule WinterFlowServerProtocol = WinterFlowConfigurationModule.WinterFlowServerProtocol();
                                    Context context = this.WinterFlowRouterStructure;
                                    winterFlowInvokerIDE = this;
                                    try {
                                        try {
                                        } catch (Throwable th) {
                                            th = th;
                                            th = th;
                                            while (true) {
                                                try {
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            }
                                        }
                                    } catch (SecurityException unused) {
                                    }
                                } catch (SecurityException unused2) {
                                    winterFlowInvokerIDE = this;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                winterFlowInvokerIDE = this;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        winterFlowInvokerIDE = this;
                    }
                } else {
                    this.WinterFlowVariableVersionControl.WinterFlowRouterStructure((WinterFlowTransactionTransaction) this.WinterFlowArrayNetwork.poll());
                }
            } catch (Throwable th5) {
                th = th5;
                winterFlowInvokerIDE = this;
            }
        }
        return;
        winterFlowInvokerIDE.WinterFlowTransactionManagerStrategy = false;
        ArrayDeque arrayDeque = winterFlowInvokerIDE.WinterFlowArrayNetwork;
        while (!arrayDeque.isEmpty()) {
            ((WinterFlowTransactionTransaction) arrayDeque.poll()).WinterFlowHookDataSource.WinterFlowCacheManagerAgent(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.WinterFlowTransactionManagerStrategy = false;
            if (iBinder instanceof WinterFlowUserManagerOrchestration) {
                this.WinterFlowVariableVersionControl = (WinterFlowUserManagerOrchestration) iBinder;
                WinterFlowRouterStructure();
            } else {
                Objects.toString(iBinder);
                ArrayDeque arrayDeque = this.WinterFlowArrayNetwork;
                while (!arrayDeque.isEmpty()) {
                    ((WinterFlowTransactionTransaction) arrayDeque.poll()).WinterFlowHookDataSource.WinterFlowCacheManagerAgent(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        WinterFlowRouterStructure();
    }
}
