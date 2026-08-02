package ru.yandex.taxi.order.map.controller.internal;

import com.yandex.go.taxi.order.models.api.response.NearestDrivers;
import defpackage.cmt;
import defpackage.dk50;
import defpackage.ffx;
import defpackage.gk50;
import defpackage.hk50;
import defpackage.jl40;
import defpackage.jse;
import defpackage.jst;
import defpackage.ny61;
import defpackage.pka0;
import defpackage.pzt0;
import defpackage.r1e0;
import defpackage.rfa0;
import defpackage.shu;
import defpackage.tje;
import defpackage.tse;
import defpackage.uzs;
import defpackage.x240;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.net.taxi.NearestDriversApi;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

/* loaded from: classes6.dex */
public final class a {
    public final tse a;
    public final NearestDriversApi b;
    public final c c;
    public final dk50 d;
    public final jse e;
    public final shu f;
    public hk50 g;
    public zzs h;
    public pzt0 i;
    public final n0 j = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public final AtomicLong k = new AtomicLong(5000);

    public a(tse tseVar, NearestDriversApi nearestDriversApi, c cVar, dk50 dk50Var, jse jseVar, shu shuVar) {
        this.a = tseVar;
        this.b = nearestDriversApi;
        this.c = cVar;
        this.d = dk50Var;
        this.e = jseVar;
        this.f = shuVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:13|14|15|(2:17|18)|20|21|(1:48)(4:23|24|25|(1:37)(6:27|28|(1:35)|30|31|(1:34)(7:33|14|15|(0)|20|21|(0)(0))))) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(1:(1:(1:(7:13|14|15|(2:17|18)|20|21|(1:48)(4:23|24|25|(1:37)(6:27|28|(1:35)|30|31|(1:34)(7:33|14|15|(0)|20|21|(0)(0)))))(2:52|53))(5:54|55|30|31|(0)(0)))(7:56|57|28|(0)|30|31|(0)(0)))(6:58|59|60|24|25|(0)(0)))(3:61|(1:63)(1:77)|(2:75|76)(6:66|b3|71|20|21|(0)(0)))))|81|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0120, code lost:
    
        r6 = r5;
        r5 = r3;
        r3 = r4;
        r4 = r6;
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x006e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object, ru.yandex.taxi.order.map.controller.internal.a] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [hk50] */
    /* JADX WARN: Type inference failed for: r6v5, types: [hk50, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0163 -> B:14:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, hk50 hk50Var, zzs zzsVar, ContinuationImpl continuationImpl) {
        NearestDriversUpdater$updateDrivers$1 nearestDriversUpdater$updateDrivers$1;
        ?? r4;
        hk50 hk50Var2;
        zzs zzsVar2;
        List list;
        List list2;
        long j;
        NearestDriversUpdater$updateDrivers$1 nearestDriversUpdater$updateDrivers$12;
        zzs zzsVar3;
        hk50 hk50Var3;
        jse jseVar;
        NearestDriversUpdater$updateDrivers$2$1 nearestDriversUpdater$updateDrivers$2$1;
        hk50 hk50Var4;
        NearestDriversUpdater$updateDrivers$1 nearestDriversUpdater$updateDrivers$13;
        List list3;
        Object c;
        List J0;
        aVar.getClass();
        try {
            if (continuationImpl instanceof NearestDriversUpdater$updateDrivers$1) {
                nearestDriversUpdater$updateDrivers$1 = (NearestDriversUpdater$updateDrivers$1) continuationImpl;
                int i = nearestDriversUpdater$updateDrivers$1.label;
                ?? r5 = -2147483648;
                ?? r6 = i & Integer.MIN_VALUE;
                if (r6 != 0) {
                    nearestDriversUpdater$updateDrivers$1.label = i - Integer.MIN_VALUE;
                    Object obj = nearestDriversUpdater$updateDrivers$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r4 = nearestDriversUpdater$updateDrivers$1.label;
                    if (r4 != 0) {
                        b.b(obj);
                        if ((hk50Var != null ? hk50Var.a : null) == null || zzsVar == null) {
                            return zy11.a;
                        }
                        dk50 dk50Var = aVar.d;
                        synchronized (dk50Var.c) {
                            J0 = kotlin.collections.a.J0(dk50Var.c);
                        }
                        list3 = J0;
                        nearestDriversUpdater$updateDrivers$12 = nearestDriversUpdater$updateDrivers$1;
                        zzsVar3 = zzsVar;
                        hk50Var3 = hk50Var;
                        c cVar = aVar.c;
                        nearestDriversUpdater$updateDrivers$12.L$0 = hk50Var3;
                        nearestDriversUpdater$updateDrivers$12.L$1 = zzsVar3;
                        nearestDriversUpdater$updateDrivers$12.L$2 = list3;
                        nearestDriversUpdater$updateDrivers$12.label = 1;
                        c = cVar.c(nearestDriversUpdater$updateDrivers$12);
                        if (c == coroutineSingletons) {
                        }
                    } else if (r4 == 1) {
                        List list4 = (List) nearestDriversUpdater$updateDrivers$1.L$2;
                        zzs zzsVar4 = (zzs) nearestDriversUpdater$updateDrivers$1.L$1;
                        hk50 hk50Var5 = (hk50) nearestDriversUpdater$updateDrivers$1.L$0;
                        b.b(obj);
                        nearestDriversUpdater$updateDrivers$13 = nearestDriversUpdater$updateDrivers$1;
                        zzsVar3 = zzsVar4;
                        hk50Var4 = hk50Var5;
                        list3 = list4;
                        Set set = hk50Var4.a;
                        RequirementsParam requirementsParam = hk50Var4.c;
                        rfa0 rfa0Var = hk50Var4.d;
                        nearestDriversUpdater$updateDrivers$13.L$0 = hk50Var4;
                        nearestDriversUpdater$updateDrivers$13.L$1 = zzsVar3;
                        nearestDriversUpdater$updateDrivers$13.L$2 = list3;
                        nearestDriversUpdater$updateDrivers$13.L$3 = null;
                        nearestDriversUpdater$updateDrivers$13.label = 2;
                        obj = aVar.c((String) obj, zzsVar3, set, list3, requirementsParam, rfa0Var, nearestDriversUpdater$updateDrivers$13);
                        if (obj != coroutineSingletons) {
                        }
                    } else if (r4 == 2) {
                        List list5 = (List) nearestDriversUpdater$updateDrivers$1.L$2;
                        zzs zzsVar5 = (zzs) nearestDriversUpdater$updateDrivers$1.L$1;
                        hk50 hk50Var6 = (hk50) nearestDriversUpdater$updateDrivers$1.L$0;
                        b.b(obj);
                        r4 = list5;
                        r5 = zzsVar5;
                        r6 = hk50Var6;
                        NearestDrivers nearestDrivers = (NearestDrivers) obj;
                        aVar.j.g(nearestDrivers);
                        jseVar = aVar.e;
                        nearestDriversUpdater$updateDrivers$2$1 = new NearestDriversUpdater$updateDrivers$2$1(aVar, nearestDrivers, r6, null);
                        nearestDriversUpdater$updateDrivers$1.L$0 = r6;
                        nearestDriversUpdater$updateDrivers$1.L$1 = r5;
                        nearestDriversUpdater$updateDrivers$1.L$2 = r4;
                        nearestDriversUpdater$updateDrivers$1.L$3 = null;
                        nearestDriversUpdater$updateDrivers$1.L$4 = null;
                        nearestDriversUpdater$updateDrivers$1.label = 3;
                        list = r4;
                        zzsVar2 = r5;
                        hk50Var2 = r6;
                        if (tje.k0(jseVar, nearestDriversUpdater$updateDrivers$2$1, nearestDriversUpdater$updateDrivers$1) == coroutineSingletons) {
                        }
                        list2 = list;
                        j = aVar.k.get();
                        nearestDriversUpdater$updateDrivers$1.L$0 = hk50Var2;
                        nearestDriversUpdater$updateDrivers$1.L$1 = zzsVar2;
                        nearestDriversUpdater$updateDrivers$1.L$2 = list2;
                        nearestDriversUpdater$updateDrivers$1.L$3 = null;
                        nearestDriversUpdater$updateDrivers$1.L$4 = null;
                        nearestDriversUpdater$updateDrivers$1.label = 4;
                        if (kotlinx.coroutines.a.i(j, nearestDriversUpdater$updateDrivers$1) != coroutineSingletons) {
                        }
                    } else if (r4 == 3) {
                        List list6 = (List) nearestDriversUpdater$updateDrivers$1.L$2;
                        zzs zzsVar6 = (zzs) nearestDriversUpdater$updateDrivers$1.L$1;
                        hk50 hk50Var7 = (hk50) nearestDriversUpdater$updateDrivers$1.L$0;
                        b.b(obj);
                        list = list6;
                        zzsVar2 = zzsVar6;
                        hk50Var2 = hk50Var7;
                        list2 = list;
                        j = aVar.k.get();
                        nearestDriversUpdater$updateDrivers$1.L$0 = hk50Var2;
                        nearestDriversUpdater$updateDrivers$1.L$1 = zzsVar2;
                        nearestDriversUpdater$updateDrivers$1.L$2 = list2;
                        nearestDriversUpdater$updateDrivers$1.L$3 = null;
                        nearestDriversUpdater$updateDrivers$1.L$4 = null;
                        nearestDriversUpdater$updateDrivers$1.label = 4;
                        if (kotlinx.coroutines.a.i(j, nearestDriversUpdater$updateDrivers$1) != coroutineSingletons) {
                        }
                    } else {
                        if (r4 != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list2 = (List) nearestDriversUpdater$updateDrivers$1.L$2;
                        zzs zzsVar7 = (zzs) nearestDriversUpdater$updateDrivers$1.L$1;
                        hk50 hk50Var8 = (hk50) nearestDriversUpdater$updateDrivers$1.L$0;
                        b.b(obj);
                        nearestDriversUpdater$updateDrivers$12 = nearestDriversUpdater$updateDrivers$1;
                        zzsVar3 = zzsVar7;
                        hk50Var3 = hk50Var8;
                        list3 = list2;
                        if (!aVar.d(zzsVar3, hk50Var3)) {
                            return zy11.a;
                        }
                        c cVar2 = aVar.c;
                        nearestDriversUpdater$updateDrivers$12.L$0 = hk50Var3;
                        nearestDriversUpdater$updateDrivers$12.L$1 = zzsVar3;
                        nearestDriversUpdater$updateDrivers$12.L$2 = list3;
                        nearestDriversUpdater$updateDrivers$12.label = 1;
                        c = cVar2.c(nearestDriversUpdater$updateDrivers$12);
                        if (c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        hk50Var4 = hk50Var3;
                        nearestDriversUpdater$updateDrivers$13 = nearestDriversUpdater$updateDrivers$12;
                        obj = c;
                        try {
                        } catch (Throwable th) {
                            th = th;
                            r4 = list3;
                            r6 = hk50Var4;
                            r5 = zzsVar3;
                            nearestDriversUpdater$updateDrivers$1 = nearestDriversUpdater$updateDrivers$13;
                            Set set2 = r6.a;
                            jst.e.k(th, "Failed to update nearest drivers");
                            Set set3 = aVar.d.d;
                            Set set4 = set3;
                            list = r4;
                            zzsVar2 = r5;
                            hk50Var2 = r6;
                            if (set4 != null) {
                                list = r4;
                                zzsVar2 = r5;
                                hk50Var2 = r6;
                                if (!set4.isEmpty()) {
                                    list = r4;
                                    zzsVar2 = r5;
                                    hk50Var2 = r6;
                                    if (!jl40.l(set2, set3)) {
                                        aVar.d.a();
                                        list = r4;
                                        zzsVar2 = r5;
                                        hk50Var2 = r6;
                                    }
                                }
                            }
                            list2 = list;
                            j = aVar.k.get();
                            nearestDriversUpdater$updateDrivers$1.L$0 = hk50Var2;
                            nearestDriversUpdater$updateDrivers$1.L$1 = zzsVar2;
                            nearestDriversUpdater$updateDrivers$1.L$2 = list2;
                            nearestDriversUpdater$updateDrivers$1.L$3 = null;
                            nearestDriversUpdater$updateDrivers$1.L$4 = null;
                            nearestDriversUpdater$updateDrivers$1.label = 4;
                            if (kotlinx.coroutines.a.i(j, nearestDriversUpdater$updateDrivers$1) != coroutineSingletons) {
                            }
                        }
                        Set set5 = hk50Var4.a;
                        RequirementsParam requirementsParam2 = hk50Var4.c;
                        rfa0 rfa0Var2 = hk50Var4.d;
                        nearestDriversUpdater$updateDrivers$13.L$0 = hk50Var4;
                        nearestDriversUpdater$updateDrivers$13.L$1 = zzsVar3;
                        nearestDriversUpdater$updateDrivers$13.L$2 = list3;
                        nearestDriversUpdater$updateDrivers$13.L$3 = null;
                        nearestDriversUpdater$updateDrivers$13.label = 2;
                        obj = aVar.c((String) obj, zzsVar3, set5, list3, requirementsParam2, rfa0Var2, nearestDriversUpdater$updateDrivers$13);
                        if (obj != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        r4 = list3;
                        r6 = hk50Var4;
                        r5 = zzsVar3;
                        nearestDriversUpdater$updateDrivers$1 = nearestDriversUpdater$updateDrivers$13;
                        NearestDrivers nearestDrivers2 = (NearestDrivers) obj;
                        aVar.j.g(nearestDrivers2);
                        jseVar = aVar.e;
                        nearestDriversUpdater$updateDrivers$2$1 = new NearestDriversUpdater$updateDrivers$2$1(aVar, nearestDrivers2, r6, null);
                        nearestDriversUpdater$updateDrivers$1.L$0 = r6;
                        nearestDriversUpdater$updateDrivers$1.L$1 = r5;
                        nearestDriversUpdater$updateDrivers$1.L$2 = r4;
                        nearestDriversUpdater$updateDrivers$1.L$3 = null;
                        nearestDriversUpdater$updateDrivers$1.L$4 = null;
                        nearestDriversUpdater$updateDrivers$1.label = 3;
                        list = r4;
                        zzsVar2 = r5;
                        hk50Var2 = r6;
                        if (tje.k0(jseVar, nearestDriversUpdater$updateDrivers$2$1, nearestDriversUpdater$updateDrivers$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        list2 = list;
                        j = aVar.k.get();
                        nearestDriversUpdater$updateDrivers$1.L$0 = hk50Var2;
                        nearestDriversUpdater$updateDrivers$1.L$1 = zzsVar2;
                        nearestDriversUpdater$updateDrivers$1.L$2 = list2;
                        nearestDriversUpdater$updateDrivers$1.L$3 = null;
                        nearestDriversUpdater$updateDrivers$1.L$4 = null;
                        nearestDriversUpdater$updateDrivers$1.label = 4;
                        if (kotlinx.coroutines.a.i(j, nearestDriversUpdater$updateDrivers$1) != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        nearestDriversUpdater$updateDrivers$12 = nearestDriversUpdater$updateDrivers$1;
                        zzsVar3 = zzsVar2;
                        hk50Var3 = hk50Var2;
                        list3 = list2;
                        if (!aVar.d(zzsVar3, hk50Var3)) {
                        }
                        c cVar22 = aVar.c;
                        nearestDriversUpdater$updateDrivers$12.L$0 = hk50Var3;
                        nearestDriversUpdater$updateDrivers$12.L$1 = zzsVar3;
                        nearestDriversUpdater$updateDrivers$12.L$2 = list3;
                        nearestDriversUpdater$updateDrivers$12.label = 1;
                        c = cVar22.c(nearestDriversUpdater$updateDrivers$12);
                        if (c == coroutineSingletons) {
                        }
                    }
                }
            }
            if (r4 != 0) {
            }
        } catch (CancellationException e) {
            throw e;
        }
        nearestDriversUpdater$updateDrivers$1 = new NearestDriversUpdater$updateDrivers$1(aVar, continuationImpl);
        Object obj2 = nearestDriversUpdater$updateDrivers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r4 = nearestDriversUpdater$updateDrivers$1.label;
    }

    public final void b(zzs zzsVar, hk50 hk50Var) {
        if (f()) {
            this.g = hk50Var;
            return;
        }
        boolean d = d(zzsVar, hk50Var);
        this.h = zzsVar;
        hk50 hk50Var2 = this.g;
        Set set = hk50Var2 != null ? hk50Var2.a : null;
        if (set != null && !set.isEmpty()) {
            hk50 hk50Var3 = this.g;
            if (!jl40.l(hk50Var3 != null ? hk50Var3.a : null, hk50Var.a)) {
                this.d.a();
            }
        }
        this.g = hk50Var;
        if (d) {
            return;
        }
        pzt0 pzt0Var = this.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, zzs zzsVar, Set set, List list, RequirementsParam requirementsParam, rfa0 rfa0Var, ContinuationImpl continuationImpl) {
        NearestDriversUpdater$nearestDrivers$1 nearestDriversUpdater$nearestDrivers$1;
        int i;
        PaymentMethod$Type paymentMethod$Type;
        Long l;
        if (continuationImpl instanceof NearestDriversUpdater$nearestDrivers$1) {
            nearestDriversUpdater$nearestDrivers$1 = (NearestDriversUpdater$nearestDrivers$1) continuationImpl;
            int i2 = nearestDriversUpdater$nearestDrivers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nearestDriversUpdater$nearestDrivers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = nearestDriversUpdater$nearestDrivers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nearestDriversUpdater$nearestDrivers$1.label;
                if (i != 0) {
                    b.b(obj);
                    cmt<NearestDrivers> a = this.b.a(new gk50(str, zzsVar, kotlin.collections.a.N0(set), list, requirementsParam, new pka0((rfa0Var == null || (paymentMethod$Type = rfa0Var.a) == null) ? null : paymentMethod$Type.getCode())));
                    x240 x240Var = new x240(25, this);
                    nearestDriversUpdater$nearestDrivers$1.L$0 = null;
                    nearestDriversUpdater$nearestDrivers$1.L$1 = null;
                    nearestDriversUpdater$nearestDrivers$1.L$2 = null;
                    nearestDriversUpdater$nearestDrivers$1.L$3 = null;
                    nearestDriversUpdater$nearestDrivers$1.L$4 = null;
                    nearestDriversUpdater$nearestDrivers$1.L$5 = null;
                    nearestDriversUpdater$nearestDrivers$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.c(a, x240Var, nearestDriversUpdater$nearestDrivers$1);
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
                r1e0 r1e0Var = (r1e0) obj;
                l = r1e0Var.b;
                if (l != null) {
                    this.k.set(l.longValue());
                }
                return r1e0Var.a;
            }
        }
        nearestDriversUpdater$nearestDrivers$1 = new NearestDriversUpdater$nearestDrivers$1(this, continuationImpl);
        Object obj2 = nearestDriversUpdater$nearestDrivers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nearestDriversUpdater$nearestDrivers$1.label;
        if (i != 0) {
        }
        r1e0 r1e0Var2 = (r1e0) obj2;
        l = r1e0Var2.b;
        if (l != null) {
        }
        return r1e0Var2.a;
    }

    public final boolean d(zzs zzsVar, hk50 hk50Var) {
        zzs zzsVar2;
        Set set = hk50Var != null ? hk50Var.a : null;
        if (set == null || set.isEmpty() || (zzsVar2 = this.h) == null || !jl40.l(hk50Var, this.g) || zzsVar == null) {
            return false;
        }
        uzs uzsVar = zzs.Companion;
        return zzsVar2.a(zzsVar, 1.0E-6d);
    }

    public final void e() {
        if (f()) {
            return;
        }
        pzt0 pzt0Var = this.i;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            hk50 hk50Var = this.g;
            Set set = hk50Var != null ? hk50Var.a : null;
            if (set == null || set.isEmpty() || this.h == null) {
                return;
            }
            this.i = com.yandex.go.coroutines.b.g(this.a, null, null, new NearestDriversUpdater$requestUpdate$1(this, null), 3);
        }
    }

    public final boolean f() {
        hk50 hk50Var = this.g;
        if (!kotlin.collections.a.G(this.f.b, hk50Var != null ? hk50Var.b : null)) {
            return false;
        }
        this.d.a();
        pzt0 pzt0Var = this.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.i = null;
        return true;
    }
}
