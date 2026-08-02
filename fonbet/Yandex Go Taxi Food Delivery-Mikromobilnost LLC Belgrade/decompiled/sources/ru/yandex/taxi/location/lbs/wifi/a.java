package ru.yandex.taxi.location.lbs.wifi;

import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import defpackage.brd;
import defpackage.bvf0;
import defpackage.e2k;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.h73;
import defpackage.hbp0;
import defpackage.jid;
import defpackage.mse;
import defpackage.ny61;
import defpackage.oay0;
import defpackage.ph41;
import defpackage.pzt0;
import defpackage.q7y;
import defpackage.qk0;
import defpackage.qke;
import defpackage.rk0;
import defpackage.tt2;
import defpackage.v551;
import defpackage.yu4;
import defpackage.yw01;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class a {
    public final v551 a;
    public final WifiManager b;
    public final tt2 c;
    public final q7y d;
    public final rk0 e;
    public final kotlinx.coroutines.sync.a f = gtq0.a();
    public final AtomicBoolean g = new AtomicBoolean(false);
    public volatile List h = EmptyList.a;
    public pzt0 i;
    public final hbp0 j;

    public a(v551 v551Var, WifiManager wifiManager, tt2 tt2Var, q7y q7yVar, rk0 rk0Var) {
        this.a = v551Var;
        this.b = wifiManager;
        this.c = tt2Var;
        this.d = q7yVar;
        this.e = rk0Var;
        hbp0 hbp0Var = new hbp0(new oay0(19, this), "WifiRepository", (mse) q7yVar.a.getValue());
        hbp0Var.a();
        this.j = hbp0Var;
    }

    public final r0 a() {
        r0 r0Var;
        v551 v551Var = this.a;
        synchronized (v551Var) {
            try {
                if (v551Var.d == null) {
                    qke.z(v551Var.a, v551Var.e, new IntentFilter("android.net.wifi.SCAN_RESULTS"), 2);
                    List<ScanResult> scanResults = v551Var.b.getScanResults();
                    if (scanResults == null) {
                        scanResults = EmptyList.a;
                    }
                    v551Var.d = bvf0.c(scanResults);
                }
                r0Var = v551Var.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return r0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(3:29|13|(2:15|16)(2:18|(1:22)(2:20|21)))(2:30|(1:32)(1:33)))|12|13|(0)(0)))|36|6|7|(0)(0)|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        r6 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        WifiRepositoryImpl$getDataForFs$1 wifiRepositoryImpl$getDataForFs$1;
        int i;
        Object failure;
        Throwable a;
        a aVar;
        if (continuationImpl instanceof WifiRepositoryImpl$getDataForFs$1) {
            wifiRepositoryImpl$getDataForFs$1 = (WifiRepositoryImpl$getDataForFs$1) continuationImpl;
            int i2 = wifiRepositoryImpl$getDataForFs$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wifiRepositoryImpl$getDataForFs$1.label = i2 - Integer.MIN_VALUE;
                Object obj = wifiRepositoryImpl$getDataForFs$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wifiRepositoryImpl$getDataForFs$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (this.h.isEmpty()) {
                        failure = null;
                        a = Result.a(failure);
                        if (a != null) {
                            this.d.getClass();
                            q7y.a(a, "error when getting wifi data for fs");
                            return null;
                        }
                        if (failure instanceof Result.Failure) {
                            return null;
                        }
                        return failure;
                    }
                    rk0 rk0Var = this.e;
                    wifiRepositoryImpl$getDataForFs$1.L$0 = this;
                    wifiRepositoryImpl$getDataForFs$1.label = 1;
                    obj = rk0Var.a(wifiRepositoryImpl$getDataForFs$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar = this;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = (a) wifiRepositoryImpl$getDataForFs$1.L$0;
                    b.b(obj);
                }
                qk0 qk0Var = (qk0) obj;
                failure = kotlin.sequences.b.s(kotlin.sequences.b.q(new e2k(2, new yw01(kotlin.sequences.b.g(new h73(1, aVar.h), new ph41(3, qk0Var)), new brd(aVar.b.getConnectionInfo().getBSSID(), 15)), new yu4(new jid(12, qk0Var), 4)), qk0Var.c));
                a = Result.a(failure);
                if (a != null) {
                }
            }
        }
        wifiRepositoryImpl$getDataForFs$1 = new WifiRepositoryImpl$getDataForFs$1(this, continuationImpl);
        Object obj2 = wifiRepositoryImpl$getDataForFs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wifiRepositoryImpl$getDataForFs$1.label;
        if (i != 0) {
        }
        qk0 qk0Var2 = (qk0) obj2;
        failure = kotlin.sequences.b.s(kotlin.sequences.b.q(new e2k(2, new yw01(kotlin.sequences.b.g(new h73(1, aVar.h), new ph41(3, qk0Var2)), new brd(aVar.b.getConnectionInfo().getBSSID(), 15)), new yu4(new jid(12, qk0Var2), 4)), qk0Var2.c));
        a = Result.a(failure);
        if (a != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        WifiRepositoryImpl$shouldUpdateOnFirstWifiScan$1 wifiRepositoryImpl$shouldUpdateOnFirstWifiScan$1;
        Object obj;
        int i;
        if (continuationImpl instanceof WifiRepositoryImpl$shouldUpdateOnFirstWifiScan$1) {
            wifiRepositoryImpl$shouldUpdateOnFirstWifiScan$1 = (WifiRepositoryImpl$shouldUpdateOnFirstWifiScan$1) continuationImpl;
            int i2 = wifiRepositoryImpl$shouldUpdateOnFirstWifiScan$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wifiRepositoryImpl$shouldUpdateOnFirstWifiScan$1.label = i2 - Integer.MIN_VALUE;
                obj = wifiRepositoryImpl$shouldUpdateOnFirstWifiScan$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wifiRepositoryImpl$shouldUpdateOnFirstWifiScan$1.label;
                if (i != 0) {
                    b.b(obj);
                    rk0 rk0Var = this.e;
                    wifiRepositoryImpl$shouldUpdateOnFirstWifiScan$1.label = 1;
                    obj = rk0Var.a(wifiRepositoryImpl$shouldUpdateOnFirstWifiScan$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                if (((qk0) obj).g) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(this.g.compareAndSet(true, false) && !this.h.isEmpty());
            }
        }
        wifiRepositoryImpl$shouldUpdateOnFirstWifiScan$1 = new WifiRepositoryImpl$shouldUpdateOnFirstWifiScan$1(this, continuationImpl);
        obj = wifiRepositoryImpl$shouldUpdateOnFirstWifiScan$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wifiRepositoryImpl$shouldUpdateOnFirstWifiScan$1.label;
        if (i != 0) {
        }
        if (((qk0) obj).g) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:11:0x0043, B:13:0x0047), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        WifiRepositoryImpl$startPolling$1 wifiRepositoryImpl$startPolling$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof WifiRepositoryImpl$startPolling$1) {
                wifiRepositoryImpl$startPolling$1 = (WifiRepositoryImpl$startPolling$1) continuationImpl;
                int i2 = wifiRepositoryImpl$startPolling$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    wifiRepositoryImpl$startPolling$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = wifiRepositoryImpl$startPolling$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = wifiRepositoryImpl$startPolling$1.label;
                    if (i != 0) {
                        b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.f;
                        wifiRepositoryImpl$startPolling$1.L$0 = aVar;
                        wifiRepositoryImpl$startPolling$1.label = 1;
                        if (aVar.a(wifiRepositoryImpl$startPolling$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) wifiRepositoryImpl$startPolling$1.L$0;
                        b.b(obj);
                    }
                    if (this.i == null) {
                        this.i = hbp0.e(this.j, null, null, new WifiRepositoryImpl$startPolling$2$1(this, null), 3);
                    }
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            if (this.i == null) {
            }
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        wifiRepositoryImpl$startPolling$1 = new WifiRepositoryImpl$startPolling$1(this, continuationImpl);
        Object obj2 = wifiRepositoryImpl$startPolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wifiRepositoryImpl$startPolling$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        WifiRepositoryImpl$startPollingForWifiAndGpsInFs$1 wifiRepositoryImpl$startPollingForWifiAndGpsInFs$1;
        Object obj;
        int i;
        if (continuationImpl instanceof WifiRepositoryImpl$startPollingForWifiAndGpsInFs$1) {
            wifiRepositoryImpl$startPollingForWifiAndGpsInFs$1 = (WifiRepositoryImpl$startPollingForWifiAndGpsInFs$1) continuationImpl;
            int i2 = wifiRepositoryImpl$startPollingForWifiAndGpsInFs$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wifiRepositoryImpl$startPollingForWifiAndGpsInFs$1.label = i2 - Integer.MIN_VALUE;
                obj = wifiRepositoryImpl$startPollingForWifiAndGpsInFs$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wifiRepositoryImpl$startPollingForWifiAndGpsInFs$1.label;
                if (i != 0) {
                    b.b(obj);
                    wifiRepositoryImpl$startPollingForWifiAndGpsInFs$1.label = 1;
                    obj = this.e.a(wifiRepositoryImpl$startPollingForWifiAndGpsInFs$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                if (((qk0) obj).b) {
                    return zy11.a;
                }
                wifiRepositoryImpl$startPollingForWifiAndGpsInFs$1.label = 2;
                Object d = d(wifiRepositoryImpl$startPollingForWifiAndGpsInFs$1);
                return d == obj2 ? obj2 : d;
            }
        }
        wifiRepositoryImpl$startPollingForWifiAndGpsInFs$1 = new WifiRepositoryImpl$startPollingForWifiAndGpsInFs$1(this, continuationImpl);
        obj = wifiRepositoryImpl$startPollingForWifiAndGpsInFs$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wifiRepositoryImpl$startPollingForWifiAndGpsInFs$1.label;
        if (i != 0) {
        }
        if (((qk0) obj).b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #0 {all -> 0x004b, blocks: (B:11:0x0043, B:13:0x0047), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        WifiRepositoryImpl$stopPolling$1 wifiRepositoryImpl$stopPolling$1;
        int i;
        g050 g050Var;
        pzt0 pzt0Var;
        try {
            if (continuationImpl instanceof WifiRepositoryImpl$stopPolling$1) {
                wifiRepositoryImpl$stopPolling$1 = (WifiRepositoryImpl$stopPolling$1) continuationImpl;
                int i2 = wifiRepositoryImpl$stopPolling$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    wifiRepositoryImpl$stopPolling$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = wifiRepositoryImpl$stopPolling$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = wifiRepositoryImpl$stopPolling$1.label;
                    if (i != 0) {
                        b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.f;
                        wifiRepositoryImpl$stopPolling$1.L$0 = aVar;
                        wifiRepositoryImpl$stopPolling$1.label = 1;
                        if (aVar.a(wifiRepositoryImpl$stopPolling$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) wifiRepositoryImpl$stopPolling$1.L$0;
                        b.b(obj);
                    }
                    pzt0Var = this.i;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            pzt0Var = this.i;
            if (pzt0Var != null) {
            }
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        wifiRepositoryImpl$stopPolling$1 = new WifiRepositoryImpl$stopPolling$1(this, continuationImpl);
        Object obj2 = wifiRepositoryImpl$stopPolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wifiRepositoryImpl$stopPolling$1.label;
        if (i != 0) {
        }
    }
}
