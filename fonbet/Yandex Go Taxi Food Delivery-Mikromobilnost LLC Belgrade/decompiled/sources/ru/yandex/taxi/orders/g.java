package ru.yandex.taxi.orders;

import androidx.lifecycle.Lifecycle;
import defpackage.ata0;
import defpackage.bvf0;
import defpackage.ck;
import defpackage.cmt;
import defpackage.gci0;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.ij3;
import defpackage.jst;
import defpackage.lse;
import defpackage.lz60;
import defpackage.ny61;
import defpackage.on2;
import defpackage.pzt0;
import defpackage.r1e0;
import defpackage.s8o;
import defpackage.tt2;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.client.api.PendingOrdersApi;

/* loaded from: classes9.dex */
public final class g implements lz60 {
    public final Lifecycle a;
    public final ru.yandex.taxi.am.g b;
    public final a c;
    public final b d;
    public final i3y e;
    public final hbp0 f;
    public final AtomicLong g;
    public final AtomicBoolean h;
    public final r0 i;
    public final gci0 j;

    public g(Lifecycle lifecycle, tt2 tt2Var, ru.yandex.taxi.am.g gVar, a aVar, b bVar, on2 on2Var) {
        this.a = lifecycle;
        this.b = gVar;
        this.c = aVar;
        this.d = bVar;
        this.e = kotlin.a.a(new ck(on2Var, 18));
        String str = null;
        hbp0 hbp0Var = new hbp0(new PendingOrdersRepositoryImpl$scope$1(0, tt2Var, tt2.class, "io", "io()Lkotlinx/coroutines/CoroutineDispatcher;", 0), str, new ij3(lse.a, 9), 2);
        hbp0Var.a();
        this.f = hbp0Var;
        this.g = new AtomicLong(30000L);
        this.h = new AtomicBoolean(true);
        r0 c = bvf0.c(Boolean.FALSE);
        this.i = c;
        this.j = kotlinx.coroutines.flow.e.d(c);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006a -> B:19:0x0044). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0078 -> B:19:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(g gVar, boolean z, ContinuationImpl continuationImpl) {
        PendingOrdersRepositoryImpl$startPollPendingOrders$1 pendingOrdersRepositoryImpl$startPollPendingOrders$1;
        int i;
        AtomicLong atomicLong = gVar.g;
        if (continuationImpl instanceof PendingOrdersRepositoryImpl$startPollPendingOrders$1) {
            pendingOrdersRepositoryImpl$startPollPendingOrders$1 = (PendingOrdersRepositoryImpl$startPollPendingOrders$1) continuationImpl;
            int i2 = pendingOrdersRepositoryImpl$startPollPendingOrders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pendingOrdersRepositoryImpl$startPollPendingOrders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pendingOrdersRepositoryImpl$startPollPendingOrders$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pendingOrdersRepositoryImpl$startPollPendingOrders$1.label;
                if (i != 0) {
                    if (i == 1) {
                        z = pendingOrdersRepositoryImpl$startPollPendingOrders$1.Z$0;
                        kotlin.b.b(obj);
                        pendingOrdersRepositoryImpl$startPollPendingOrders$1.Z$0 = z;
                        pendingOrdersRepositoryImpl$startPollPendingOrders$1.label = 2;
                        if (gVar.j(pendingOrdersRepositoryImpl$startPollPendingOrders$1) == obj2) {
                        }
                        if (!z) {
                        }
                        if (!kotlinx.coroutines.a.p(pendingOrdersRepositoryImpl$startPollPendingOrders$1.get_context())) {
                        }
                    } else if (i == 2) {
                        z = pendingOrdersRepositoryImpl$startPollPendingOrders$1.Z$0;
                        try {
                            kotlin.b.b(obj);
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable unused) {
                        }
                        if (!z) {
                            long j = atomicLong.get();
                            pendingOrdersRepositoryImpl$startPollPendingOrders$1.Z$0 = z;
                            pendingOrdersRepositoryImpl$startPollPendingOrders$1.label = 3;
                            if (kotlinx.coroutines.a.i(j, pendingOrdersRepositoryImpl$startPollPendingOrders$1) == obj2) {
                                return obj2;
                            }
                        }
                        if (!kotlinx.coroutines.a.p(pendingOrdersRepositoryImpl$startPollPendingOrders$1.get_context())) {
                            return zy11.a;
                        }
                        if (z) {
                            long j2 = atomicLong.get();
                            pendingOrdersRepositoryImpl$startPollPendingOrders$1.Z$0 = z;
                            pendingOrdersRepositoryImpl$startPollPendingOrders$1.label = 1;
                            if (kotlinx.coroutines.a.i(j2, pendingOrdersRepositoryImpl$startPollPendingOrders$1) == obj2) {
                                return obj2;
                            }
                        }
                        pendingOrdersRepositoryImpl$startPollPendingOrders$1.Z$0 = z;
                        pendingOrdersRepositoryImpl$startPollPendingOrders$1.label = 2;
                        if (gVar.j(pendingOrdersRepositoryImpl$startPollPendingOrders$1) == obj2) {
                            return obj2;
                        }
                        if (!z) {
                        }
                        if (!kotlinx.coroutines.a.p(pendingOrdersRepositoryImpl$startPollPendingOrders$1.get_context())) {
                        }
                    } else {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = pendingOrdersRepositoryImpl$startPollPendingOrders$1.Z$0;
                    }
                }
                kotlin.b.b(obj);
                if (!kotlinx.coroutines.a.p(pendingOrdersRepositoryImpl$startPollPendingOrders$1.get_context())) {
                }
            }
        }
        pendingOrdersRepositoryImpl$startPollPendingOrders$1 = new PendingOrdersRepositoryImpl$startPollPendingOrders$1(gVar, continuationImpl);
        Object obj3 = pendingOrdersRepositoryImpl$startPollPendingOrders$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pendingOrdersRepositoryImpl$startPollPendingOrders$1.label;
        if (i != 0) {
        }
        kotlin.b.b(obj3);
        if (!kotlinx.coroutines.a.p(pendingOrdersRepositoryImpl$startPollPendingOrders$1.get_context())) {
        }
    }

    @Override // defpackage.lz60
    public final void g() {
        hbp0.e(this.f, null, null, new PendingOrdersRepositoryImpl$onLargestContentfulPaint$1(null, this), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "PendingOrdersRepositoryImpl";
    }

    public final pzt0 i() {
        return hbp0.e(this.f, null, null, new PendingOrdersRepositoryImpl$fetchPendingOrders$1(null, this), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r10.a(r11, r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063 A[Catch: all -> 0x0037, CancellationException -> 0x0039, TryCatch #3 {CancellationException -> 0x0039, all -> 0x0037, blocks: (B:13:0x0033, B:14:0x007d, B:25:0x0041, B:26:0x005d, B:28:0x0063, B:29:0x006a, B:33:0x0048), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        PendingOrdersRepositoryImpl$forceFetchPendingOrders$1 pendingOrdersRepositoryImpl$forceFetchPendingOrders$1;
        int i;
        AtomicLong atomicLong;
        Long l;
        try {
            if (continuationImpl instanceof PendingOrdersRepositoryImpl$forceFetchPendingOrders$1) {
                pendingOrdersRepositoryImpl$forceFetchPendingOrders$1 = (PendingOrdersRepositoryImpl$forceFetchPendingOrders$1) continuationImpl;
                int i2 = pendingOrdersRepositoryImpl$forceFetchPendingOrders$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pendingOrdersRepositoryImpl$forceFetchPendingOrders$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = pendingOrdersRepositoryImpl$forceFetchPendingOrders$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pendingOrdersRepositoryImpl$forceFetchPendingOrders$1.label;
                    r0 r0Var = this.i;
                    atomicLong = this.g;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<ata0> a = ((PendingOrdersApi) this.e.getValue()).a();
                        pendingOrdersRepositoryImpl$forceFetchPendingOrders$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.c(a, null, pendingOrdersRepositoryImpl$forceFetchPendingOrders$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            try {
                                kotlin.b.b(obj);
                                jst.e.getClass();
                                Boolean bool = Boolean.TRUE;
                                r0Var.getClass();
                                r0Var.m(null, bool);
                                return zy11.a;
                            } catch (Throwable th) {
                                Boolean bool2 = Boolean.TRUE;
                                r0Var.getClass();
                                r0Var.m(null, bool2);
                                throw th;
                            }
                        }
                        kotlin.b.b(obj);
                    }
                    r1e0 r1e0Var = (r1e0) obj;
                    l = r1e0Var.b;
                    if (l != null) {
                        atomicLong.set(l.longValue());
                    }
                    a aVar = this.c;
                    ata0 ata0Var = (ata0) r1e0Var.a;
                    pendingOrdersRepositoryImpl$forceFetchPendingOrders$1.L$0 = null;
                    pendingOrdersRepositoryImpl$forceFetchPendingOrders$1.L$1 = null;
                    pendingOrdersRepositoryImpl$forceFetchPendingOrders$1.label = 2;
                }
            }
            if (i != 0) {
            }
            r1e0 r1e0Var2 = (r1e0) obj;
            l = r1e0Var2.b;
            if (l != null) {
            }
            a aVar2 = this.c;
            ata0 ata0Var2 = (ata0) r1e0Var2.a;
            pendingOrdersRepositoryImpl$forceFetchPendingOrders$1.L$0 = null;
            pendingOrdersRepositoryImpl$forceFetchPendingOrders$1.L$1 = null;
            pendingOrdersRepositoryImpl$forceFetchPendingOrders$1.label = 2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            Long I = s8o.I(th2);
            if (I != null) {
                atomicLong.set(I.longValue());
            }
            jst.e.h("PendingOrdersFetching", "Pending orders fetching produced error", th2);
            throw th2;
        }
        pendingOrdersRepositoryImpl$forceFetchPendingOrders$1 = new PendingOrdersRepositoryImpl$forceFetchPendingOrders$1(this, continuationImpl);
        Object obj2 = pendingOrdersRepositoryImpl$forceFetchPendingOrders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pendingOrdersRepositoryImpl$forceFetchPendingOrders$1.label;
        r0 r0Var2 = this.i;
        atomicLong = this.g;
    }
}
