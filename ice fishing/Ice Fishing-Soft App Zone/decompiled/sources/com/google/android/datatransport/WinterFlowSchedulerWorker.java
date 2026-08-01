package com.google.android.datatransport;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSchedulerWorker implements ServiceConnection {
    public final ArrayDeque WinterFlowArrayNetwork;
    public WinterFlowCacheManagerVersionControl WinterFlowCacheManagerAgent;
    public final Messenger WinterFlowHookDataSource;
    public int WinterFlowRouterStructure = 0;
    public final /* synthetic */ WinterFlowProtocolPlatform WinterFlowTransactionManagerStrategy;
    public final SparseArray WinterFlowVariableVersionControl;

    public WinterFlowSchedulerWorker(WinterFlowProtocolPlatform winterFlowProtocolPlatform) {
        this.WinterFlowTransactionManagerStrategy = winterFlowProtocolPlatform;
        WinterFlowWidgetInterface winterFlowWidgetInterface = new WinterFlowWidgetInterface(Looper.getMainLooper(), new WinterFlowBatchEventEmitter(0, this));
        Looper.getMainLooper();
        this.WinterFlowHookDataSource = new Messenger(winterFlowWidgetInterface);
        this.WinterFlowArrayNetwork = new ArrayDeque();
        this.WinterFlowVariableVersionControl = new SparseArray();
    }

    public final synchronized void WinterFlowArrayNetwork() {
        if (this.WinterFlowRouterStructure == 2 && this.WinterFlowArrayNetwork.isEmpty() && this.WinterFlowVariableVersionControl.size() == 0) {
            this.WinterFlowRouterStructure = 3;
            WinterFlowConfigurationModule.WinterFlowServerProtocol().WinterFlowBatchUI((Context) this.WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource, this);
        }
    }

    public final synchronized void WinterFlowCacheManagerAgent(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i = this.WinterFlowRouterStructure;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.WinterFlowRouterStructure = 4;
                return;
            }
            this.WinterFlowRouterStructure = 4;
            WinterFlowConfigurationModule.WinterFlowServerProtocol().WinterFlowBatchUI((Context) this.WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource, this);
            WinterFlowSchedulerMicroservice winterFlowSchedulerMicroservice = new WinterFlowSchedulerMicroservice(str, securityException);
            ArrayDeque arrayDeque = this.WinterFlowArrayNetwork;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((WinterFlowWidgetUtility) it.next()).WinterFlowCacheManagerAgent(winterFlowSchedulerMicroservice);
            }
            arrayDeque.clear();
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = this.WinterFlowVariableVersionControl;
                if (i2 >= sparseArray.size()) {
                    sparseArray.clear();
                    return;
                } else {
                    ((WinterFlowWidgetUtility) sparseArray.valueAt(i2)).WinterFlowCacheManagerAgent(winterFlowSchedulerMicroservice);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void WinterFlowHookDataSource(String str) {
        WinterFlowCacheManagerAgent(str, null);
    }

    public final synchronized boolean WinterFlowRouterStructure(WinterFlowWidgetUtility winterFlowWidgetUtility) {
        WinterFlowSchedulerWorker winterFlowSchedulerWorker;
        Throwable th;
        try {
            try {
                int i = this.WinterFlowRouterStructure;
                int i2 = 0;
                if (i != 0) {
                    try {
                        if (i == 1) {
                            this.WinterFlowArrayNetwork.add(winterFlowWidgetUtility);
                            return true;
                        }
                        if (i != 2) {
                            return false;
                        }
                        this.WinterFlowArrayNetwork.add(winterFlowWidgetUtility);
                        ((ScheduledExecutorService) this.WinterFlowTransactionManagerStrategy.WinterFlowCacheManagerAgent).execute(new WinterFlowModuleThreadPool(this, 1));
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                        winterFlowSchedulerWorker = this;
                    }
                } else {
                    this.WinterFlowArrayNetwork.add(winterFlowWidgetUtility);
                    try {
                        if (this.WinterFlowRouterStructure == 0) {
                            this.WinterFlowRouterStructure = 1;
                            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                            intent.setPackage("com.google.android.gms");
                            try {
                                WinterFlowConfigurationModule WinterFlowServerProtocol = WinterFlowConfigurationModule.WinterFlowServerProtocol();
                                WinterFlowProtocolPlatform winterFlowProtocolPlatform = this.WinterFlowTransactionManagerStrategy;
                                try {
                                    Context context = (Context) winterFlowProtocolPlatform.WinterFlowHookDataSource;
                                    try {
                                        winterFlowSchedulerWorker = this;
                                        try {
                                            try {
                                                if (WinterFlowServerProtocol.WinterFlowRouterAdapter(context, context.getClass().getName(), intent, winterFlowSchedulerWorker, 1, null)) {
                                                    WinterFlowModuleThreadPool winterFlowModuleThreadPool = new WinterFlowModuleThreadPool(winterFlowSchedulerWorker, i2);
                                                    ((ScheduledExecutorService) winterFlowProtocolPlatform.WinterFlowCacheManagerAgent).schedule(winterFlowModuleThreadPool, 30L, TimeUnit.SECONDS);
                                                } else {
                                                    winterFlowSchedulerWorker.WinterFlowHookDataSource("Unable to bind to service");
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        } catch (SecurityException e) {
                                            e = e;
                                            winterFlowSchedulerWorker.WinterFlowCacheManagerAgent("Unable to bind to service", e);
                                            return true;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        winterFlowSchedulerWorker = this;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    winterFlowSchedulerWorker = this;
                                }
                            } catch (SecurityException e2) {
                                e = e2;
                                winterFlowSchedulerWorker = this;
                            }
                            return true;
                        }
                        winterFlowSchedulerWorker = this;
                        try {
                            throw new IllegalStateException();
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                    th = th;
                }
            } catch (Throwable th8) {
                th = th8;
                th = th;
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
            winterFlowSchedulerWorker = this;
            th = th;
            throw th;
        }
        throw th;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ((ScheduledExecutorService) this.WinterFlowTransactionManagerStrategy.WinterFlowCacheManagerAgent).execute(new WinterFlowProtocolThread(7, this, iBinder, false));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((ScheduledExecutorService) this.WinterFlowTransactionManagerStrategy.WinterFlowCacheManagerAgent).execute(new WinterFlowModuleThreadPool(this, 2));
    }
}
