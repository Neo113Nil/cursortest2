package ru.yandex.taxi.location.lbs.gsm;

import android.os.SystemClock;
import defpackage.a8y;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.h03;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.m3u;
import defpackage.mse;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.q7y;
import defpackage.qk0;
import defpackage.rk0;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tt2;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.location.lbs.b;
import ru.yandex.taxi.location.lbs.gsm.a;

/* loaded from: classes9.dex */
public final class a {
    public final m3u a;
    public final tt2 b;
    public final b c;
    public final ru.yandex.taxi.location.a d;
    public final q7y e;
    public final rk0 f;
    public final kotlinx.coroutines.sync.a g = gtq0.a();
    public volatile List h = EmptyList.a;
    public pzt0 i;
    public final hbp0 j;
    public final i3y k;

    public a(m3u m3uVar, tt2 tt2Var, b bVar, ru.yandex.taxi.location.a aVar, q7y q7yVar, rk0 rk0Var) {
        this.a = m3uVar;
        this.b = tt2Var;
        this.c = bVar;
        this.d = aVar;
        this.e = q7yVar;
        this.f = rk0Var;
        final int i = 0;
        hbp0 hbp0Var = new hbp0(new sls(this) { // from class: p3u
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                a aVar2 = this.b;
                switch (i2) {
                    case 0:
                        aVar2.b.getClass();
                        sjh sjhVar = uyj.a;
                        return mdh.b;
                    default:
                        m3u m3uVar2 = aVar2.a;
                        return new n3u(m3uVar2.a, m3uVar2.b, m3uVar2.c);
                }
            }
        }, "GsmCellsRepository", (mse) q7yVar.a.getValue());
        hbp0Var.a();
        this.j = hbp0Var;
        final int i2 = 1;
        this.k = kotlin.a.a(new sls(this) { // from class: p3u
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                a aVar2 = this.b;
                switch (i22) {
                    case 0:
                        aVar2.b.getClass();
                        sjh sjhVar = uyj.a;
                        return mdh.b;
                    default:
                        m3u m3uVar2 = aVar2.a;
                        return new n3u(m3uVar2.a, m3uVar2.b, m3uVar2.c);
                }
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(7:11|12|13|(2:16|14)|17|18|(2:20|21)(4:23|(1:25)|26|27))(2:29|30))(1:31))(3:36|37|(3:39|18|(0)(0))(2:40|(2:42|34)))|32|(6:35|13|(1:14)|17|18|(0)(0))|34))|45|6|7|(0)(0)|32|(0)|34) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0035, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dd, code lost:
    
        r2 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0096 A[Catch: all -> 0x0035, LOOP:0: B:14:0x0090->B:16:0x0096, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:13:0x0073, B:14:0x0090, B:16:0x0096, B:31:0x003e, B:32:0x005d, B:37:0x0045, B:40:0x0050), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(ContinuationImpl continuationImpl) {
        GsmCellsRepository$getDataForFs$1 gsmCellsRepository$getDataForFs$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        ?? failure;
        Throwable a;
        Object a2;
        Iterable iterable;
        int i2;
        if (continuationImpl instanceof GsmCellsRepository$getDataForFs$1) {
            gsmCellsRepository$getDataForFs$1 = (GsmCellsRepository$getDataForFs$1) continuationImpl;
            int i3 = gsmCellsRepository$getDataForFs$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gsmCellsRepository$getDataForFs$1.label = i3 - Integer.MIN_VALUE;
                Object obj = gsmCellsRepository$getDataForFs$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gsmCellsRepository$getDataForFs$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.h.isEmpty()) {
                        failure = 0;
                        a = Result.a(failure);
                        if (a == null) {
                        }
                    } else {
                        ru.yandex.taxi.location.a aVar = this.d;
                        List list = this.h;
                        gsmCellsRepository$getDataForFs$1.label = 1;
                        obj = aVar.g(list, gsmCellsRepository$getDataForFs$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = gsmCellsRepository$getDataForFs$1.I$0;
                        iterable = (Iterable) gsmCellsRepository$getDataForFs$1.L$0;
                        kotlin.b.b(obj);
                        List<a8y> A0 = kotlin.collections.a.A0(iterable, Math.max(i2, ((qk0) obj).d));
                        failure = new ArrayList(tcc.n(A0, 10));
                        for (a8y a8yVar : A0) {
                            failure.add(new h03(new Integer(a8yVar.a), new Integer(a8yVar.b), new Long(a8yVar.c), new Integer(a8yVar.d), new Integer(a8yVar.e), System.currentTimeMillis() - ((SystemClock.elapsedRealtimeNanos() - a8yVar.f) / 1000000)));
                        }
                        a = Result.a(failure);
                        if (a == null) {
                            return failure instanceof Result.Failure ? null : failure;
                        }
                        this.e.getClass();
                        q7y.a(a, "error when getting gsm data for fs");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Iterable iterable2 = (Iterable) obj;
                rk0 rk0Var = this.f;
                gsmCellsRepository$getDataForFs$1.L$0 = iterable2;
                gsmCellsRepository$getDataForFs$1.I$0 = 0;
                gsmCellsRepository$getDataForFs$1.label = 2;
                a2 = rk0Var.a(gsmCellsRepository$getDataForFs$1);
                if (a2 != coroutineSingletons) {
                    iterable = iterable2;
                    obj = a2;
                    i2 = 0;
                    List<a8y> A02 = kotlin.collections.a.A0(iterable, Math.max(i2, ((qk0) obj).d));
                    failure = new ArrayList(tcc.n(A02, 10));
                    while (r0.hasNext()) {
                    }
                    a = Result.a(failure);
                    if (a == null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        gsmCellsRepository$getDataForFs$1 = new GsmCellsRepository$getDataForFs$1(this, continuationImpl);
        Object obj2 = gsmCellsRepository$getDataForFs$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gsmCellsRepository$getDataForFs$1.label;
        if (i != 0) {
        }
        Iterable iterable22 = (Iterable) obj2;
        rk0 rk0Var2 = this.f;
        gsmCellsRepository$getDataForFs$1.L$0 = iterable22;
        gsmCellsRepository$getDataForFs$1.I$0 = 0;
        gsmCellsRepository$getDataForFs$1.label = 2;
        a2 = rk0Var2.a(gsmCellsRepository$getDataForFs$1);
        if (a2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:11:0x0043, B:13:0x0047), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        GsmCellsRepository$startPolling$1 gsmCellsRepository$startPolling$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof GsmCellsRepository$startPolling$1) {
                gsmCellsRepository$startPolling$1 = (GsmCellsRepository$startPolling$1) continuationImpl;
                int i2 = gsmCellsRepository$startPolling$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gsmCellsRepository$startPolling$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = gsmCellsRepository$startPolling$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = gsmCellsRepository$startPolling$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.g;
                        gsmCellsRepository$startPolling$1.L$0 = aVar;
                        gsmCellsRepository$startPolling$1.label = 1;
                        if (aVar.a(gsmCellsRepository$startPolling$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) gsmCellsRepository$startPolling$1.L$0;
                        kotlin.b.b(obj);
                    }
                    if (this.i == null) {
                        this.i = hbp0.e(this.j, null, null, new GsmCellsRepository$startPolling$2$1(this, null), 3);
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
        gsmCellsRepository$startPolling$1 = new GsmCellsRepository$startPolling$1(this, continuationImpl);
        Object obj2 = gsmCellsRepository$startPolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gsmCellsRepository$startPolling$1.label;
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
    public final Object c(ContinuationImpl continuationImpl) {
        GsmCellsRepository$startPollingForWifiAndGpsInFs$1 gsmCellsRepository$startPollingForWifiAndGpsInFs$1;
        Object obj;
        int i;
        if (continuationImpl instanceof GsmCellsRepository$startPollingForWifiAndGpsInFs$1) {
            gsmCellsRepository$startPollingForWifiAndGpsInFs$1 = (GsmCellsRepository$startPollingForWifiAndGpsInFs$1) continuationImpl;
            int i2 = gsmCellsRepository$startPollingForWifiAndGpsInFs$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gsmCellsRepository$startPollingForWifiAndGpsInFs$1.label = i2 - Integer.MIN_VALUE;
                obj = gsmCellsRepository$startPollingForWifiAndGpsInFs$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gsmCellsRepository$startPollingForWifiAndGpsInFs$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gsmCellsRepository$startPollingForWifiAndGpsInFs$1.label = 1;
                    obj = this.f.a(gsmCellsRepository$startPollingForWifiAndGpsInFs$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((qk0) obj).b) {
                    return zy11.a;
                }
                gsmCellsRepository$startPollingForWifiAndGpsInFs$1.label = 2;
                Object b = b(gsmCellsRepository$startPollingForWifiAndGpsInFs$1);
                return b == obj2 ? obj2 : b;
            }
        }
        gsmCellsRepository$startPollingForWifiAndGpsInFs$1 = new GsmCellsRepository$startPollingForWifiAndGpsInFs$1(this, continuationImpl);
        obj = gsmCellsRepository$startPollingForWifiAndGpsInFs$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gsmCellsRepository$startPollingForWifiAndGpsInFs$1.label;
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
    public final Object d(ContinuationImpl continuationImpl) {
        GsmCellsRepository$stopPolling$1 gsmCellsRepository$stopPolling$1;
        int i;
        g050 g050Var;
        pzt0 pzt0Var;
        try {
            if (continuationImpl instanceof GsmCellsRepository$stopPolling$1) {
                gsmCellsRepository$stopPolling$1 = (GsmCellsRepository$stopPolling$1) continuationImpl;
                int i2 = gsmCellsRepository$stopPolling$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gsmCellsRepository$stopPolling$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = gsmCellsRepository$stopPolling$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = gsmCellsRepository$stopPolling$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.g;
                        gsmCellsRepository$stopPolling$1.L$0 = aVar;
                        gsmCellsRepository$stopPolling$1.label = 1;
                        if (aVar.a(gsmCellsRepository$stopPolling$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) gsmCellsRepository$stopPolling$1.L$0;
                        kotlin.b.b(obj);
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
        gsmCellsRepository$stopPolling$1 = new GsmCellsRepository$stopPolling$1(this, continuationImpl);
        Object obj2 = gsmCellsRepository$stopPolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gsmCellsRepository$stopPolling$1.label;
        if (i != 0) {
        }
    }
}
