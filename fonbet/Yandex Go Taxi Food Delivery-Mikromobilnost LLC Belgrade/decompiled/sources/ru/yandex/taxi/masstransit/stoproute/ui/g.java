package ru.yandex.taxi.masstransit.stoproute.ui;

import defpackage.a60;
import defpackage.ah00;
import defpackage.bvf0;
import defpackage.dc4;
import defpackage.diu0;
import defpackage.dz00;
import defpackage.e4l0;
import defpackage.eiu0;
import defpackage.ffu0;
import defpackage.fu30;
import defpackage.gci0;
import defpackage.gh00;
import defpackage.ih01;
import defpackage.is30;
import defpackage.jiu0;
import defpackage.jqr;
import defpackage.js30;
import defpackage.jst;
import defpackage.jt30;
import defpackage.k340;
import defpackage.ks30;
import defpackage.l240;
import defpackage.ls30;
import defpackage.m240;
import defpackage.mdh;
import defpackage.n240;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.o240;
import defpackage.o440;
import defpackage.p240;
import defpackage.pi30;
import defpackage.pt30;
import defpackage.q240;
import defpackage.qt30;
import defpackage.qu;
import defpackage.r240;
import defpackage.rt30;
import defpackage.scc;
import defpackage.sjh;
import defpackage.st30;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.tt30;
import defpackage.ut30;
import defpackage.uyj;
import defpackage.v770;
import defpackage.vt30;
import defpackage.w511;
import defpackage.wr30;
import defpackage.x4e;
import defpackage.xl10;
import defpackage.yt11;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.analytic.CloseReason;
import ru.yandex.taxi.masstransit.analytic.MasstransitPurchaseAnalytics$PurchaseScenariosSource;
import ru.yandex.taxi.masstransit.geopayment.purchase.MtPurchaseMapper;
import ru.yandex.taxi.masstransit.stoproute.interactor.p;

/* loaded from: classes6.dex */
public final class g implements yt11 {
    public final tt2 a;
    public final xl10 b;
    public final e4l0 c;
    public final dc4 d;
    public final ah00 e;
    public final ru.yandex.taxi.masstransit.stoproute.mapper.a f;
    public final p g;
    public final ru.yandex.taxi.masstransit.stoproute.interactor.a h;
    public final dz00 i;
    public final ffu0 j;
    public final jt30 k;
    public final MtPurchaseMapper l;
    public final wr30 m;
    public final ls30 n;
    public final r240 o;
    public final r0 p;
    public final gci0 q;
    public final r0 r;

    public g(tt2 tt2Var, xl10 xl10Var, e4l0 e4l0Var, dc4 dc4Var, ah00 ah00Var, ru.yandex.taxi.masstransit.stoproute.mapper.a aVar, p pVar, ru.yandex.taxi.masstransit.stoproute.interactor.a aVar2, dz00 dz00Var, ffu0 ffu0Var, jt30 jt30Var, MtPurchaseMapper mtPurchaseMapper, wr30 wr30Var, ls30 ls30Var, ih01 ih01Var) {
        this.a = tt2Var;
        this.b = xl10Var;
        this.c = e4l0Var;
        this.d = dc4Var;
        this.e = ah00Var;
        this.f = aVar;
        this.g = pVar;
        this.h = aVar2;
        this.i = dz00Var;
        this.j = ffu0Var;
        this.k = jt30Var;
        this.l = mtPurchaseMapper;
        this.m = wr30Var;
        this.n = ls30Var;
        this.o = new r240(e4l0Var, ih01Var);
        r0 c = bvf0.c(new k340(0));
        this.p = c;
        this.q = kotlinx.coroutines.flow.e.d(c);
        this.r = bvf0.c(EmptyList.a);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.q;
    }

    public final List b(List list, diu0 diu0Var) {
        if (!list.contains(diu0Var)) {
            return list;
        }
        int indexOf = list.indexOf(diu0Var);
        jiu0 jiu0Var = diu0Var.d;
        this.j.getClass();
        return ffu0.a(list, diu0.c(diu0Var, ffu0.b(list, jiu0Var, indexOf)), diu0Var.d, indexOf);
    }

    public final void c(q240 q240Var) {
        r0 r0Var;
        Object value;
        ArrayList arrayList;
        r240 r240Var = this.o;
        e4l0 e4l0Var = r240Var.a;
        ih01 ih01Var = r240Var.b;
        boolean z = q240Var instanceof l240;
        xl10 xl10Var = this.b;
        if (z) {
            String a = e4l0Var.a();
            String analyticsName = r240.a(e4l0Var).getAnalyticsName();
            ih01Var.getClass();
            HashMap p = x4e.p("button_name", "back");
            if (analyticsName != null) {
                p.put("open_reason", analyticsName);
            }
            if (a != null) {
                p.put("route_id", a);
            }
            ih01Var.a.a("TransportRouteCard.Tapped", p, 1, new HashMap());
            CloseReason closeReason = CloseReason.BACK_BUTTON;
            String a2 = e4l0Var.a();
            String analyticsName2 = r240.a(e4l0Var).getAnalyticsName();
            String reason = closeReason.getReason();
            ih01Var.getClass();
            HashMap hashMap = new HashMap();
            if (reason != null) {
                hashMap.put("close_reason", reason);
            }
            if (analyticsName2 != null) {
                hashMap.put("open_reason", analyticsName2);
            }
            if (a2 != null) {
                hashMap.put("route_id", a2);
            }
            ih01Var.a.a("TransportRouteCard.Closed", hashMap, 1, new HashMap());
            ((ru.yandex.taxi.masstransit.stoproute.router.b) xl10Var.a).r(new qu(9));
            return;
        }
        if (q240Var instanceof m240) {
            diu0 diu0Var = ((m240) q240Var).a;
            do {
                r0Var = this.r;
                value = r0Var.getValue();
                List list = (List) value;
                String str = diu0Var.a;
                if (list.contains(str)) {
                    arrayList = new ArrayList(list);
                    arrayList.remove(str);
                } else {
                    arrayList = new ArrayList(list);
                    arrayList.add(str);
                }
            } while (!r0Var.k(value, arrayList));
            return;
        }
        if (q240Var instanceof p240) {
            this.g.g.c();
            return;
        }
        if (q240Var instanceof n240) {
            ((gh00) this.e).w();
            return;
        }
        if (!(q240Var instanceof o240)) {
            w511.b();
            return;
        }
        vt30 vt30Var = ((o240) q240Var).a;
        boolean z2 = vt30Var instanceof tt30;
        v770 v770Var = v770.c;
        if (z2) {
            ks30 ks30Var = ((tt30) vt30Var).a;
            if (ks30Var instanceof is30) {
                ((a60) ((ru.yandex.taxi.masstransit.stoproute.router.b) xl10Var.a).O).c(((is30) ks30Var).a, v770Var);
                return;
            } else if (ks30Var instanceof js30) {
                jst.e.getClass();
                return;
            } else {
                w511.b();
                return;
            }
        }
        if (vt30Var instanceof ut30) {
            String str2 = ((ut30) vt30Var).a;
            if (str2 != null) {
                ((a60) ((ru.yandex.taxi.masstransit.stoproute.router.b) xl10Var.a).O).c(str2, v770Var);
                return;
            }
            return;
        }
        boolean z3 = vt30Var instanceof st30;
        ls30 ls30Var = this.n;
        if (z3) {
            ArrayList arrayList2 = ((st30) vt30Var).a;
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((fu30) it.next()).c);
            }
            ls30Var.c(arrayList3, MasstransitPurchaseAnalytics$PurchaseScenariosSource.RouteCard);
            return;
        }
        if (vt30Var instanceof pt30) {
            ls30Var.a(Collections.singletonList(((pt30) vt30Var).a.c), MasstransitPurchaseAnalytics$PurchaseScenariosSource.RouteCard);
        } else if (vt30Var instanceof qt30) {
            ls30Var.b(MasstransitPurchaseAnalytics$PurchaseScenariosSource.RouteCard);
        } else {
            if (vt30Var instanceof rt30) {
                return;
            }
            w511.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(tse tseVar, ContinuationImpl continuationImpl) {
        MtStopRouteUiStateInteractor$initializeData$1 mtStopRouteUiStateInteractor$initializeData$1;
        int i;
        tse tseVar2 = tseVar;
        if (continuationImpl instanceof MtStopRouteUiStateInteractor$initializeData$1) {
            mtStopRouteUiStateInteractor$initializeData$1 = (MtStopRouteUiStateInteractor$initializeData$1) continuationImpl;
            int i2 = mtStopRouteUiStateInteractor$initializeData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtStopRouteUiStateInteractor$initializeData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtStopRouteUiStateInteractor$initializeData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtStopRouteUiStateInteractor$initializeData$1.label;
                e4l0 e4l0Var = this.c;
                ru.yandex.taxi.masstransit.stoproute.mapper.a aVar = this.f;
                tt2 tt2Var = this.a;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r240 r240Var = this.o;
                    ih01 ih01Var = r240Var.b;
                    e4l0 e4l0Var2 = r240Var.a;
                    String a = e4l0Var2.a();
                    String analyticsName = r240.a(e4l0Var2).getAnalyticsName();
                    ih01Var.getClass();
                    HashMap hashMap = new HashMap();
                    if (analyticsName != null) {
                        hashMap.put("open_reason", analyticsName);
                    }
                    if (a != null) {
                        hashMap.put("route_id", a);
                    }
                    ih01Var.a.a("TransportRouteCard.Shown", hashMap, 1, new HashMap());
                    while (true) {
                        r0 r0Var = this.p;
                        Object value = r0Var.getValue();
                        aVar.getClass();
                        if (r0Var.k(value, k340.a((k340) value, o440.a, scc.g(new eiu0(false), new eiu0(z), new eiu0(z), new eiu0(false)), true, null, 0.0f, null, null, 120))) {
                            break;
                        }
                        z = true;
                    }
                    kotlinx.coroutines.flow.internal.g a2 = this.h.a(e4l0Var);
                    tt2Var.getClass();
                    sjh sjhVar = uyj.a;
                    o oVar = new o(new f(kotlinx.coroutines.flow.e.F(a2, mdh.b), this), new MtStopRouteUiStateInteractor$initializeData$routeInfoFlow$2(this, null));
                    mtStopRouteUiStateInteractor$initializeData$1.L$0 = tseVar2;
                    mtStopRouteUiStateInteractor$initializeData$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.S(oVar, tseVar2, mtStopRouteUiStateInteractor$initializeData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tseVar2 = (tse) mtStopRouteUiStateInteractor$initializeData$1.L$0;
                    kotlin.b.b(obj);
                }
                tse tseVar3 = tseVar2;
                n4u0 n4u0Var = (n4u0) obj;
                jqr jqrVar = new jqr(new b(n4u0Var, aVar), new MtStopRouteUiStateInteractor$initializeData$3(2, this, g.class, "reportLoaded", "reportLoaded(Lru/yandex/taxi/masstransit/stoproute/model/MtStopsRouteHeaderState;)V", 4), 3);
                tt2Var.getClass();
                sjh sjhVar2 = uyj.a;
                mdh mdhVar = mdh.b;
                tje.N(tseVar3, null, null, new MtStopRouteUiStateInteractor$initializeData$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(jqrVar, mdhVar), null, this), 3);
                tje.N(tseVar3, null, null, new MtStopRouteUiStateInteractor$initializeData$$inlined$safeCollectIn$2(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.n(n4u0Var, new d(ru.yandex.taxi.experiments.d.b(this.i.a)), this.r, new MtStopRouteUiStateInteractor$initializeData$6(this, null)), mdhVar), null, this), 3);
                tje.N(tseVar3, null, null, new MtStopRouteUiStateInteractor$initializeData$$inlined$safeCollectIn$3(kotlinx.coroutines.flow.e.F(new m0(n4u0Var, com.yandex.go.coroutines.b.d(this.m.a(), new MtStopRouteUiStateInteractor$initializeData$$inlined$start$1(ru.yandex.taxi.masstransit.geopayment.tickets.model.a.b, null)), new MtStopRouteUiStateInteractor$initializeData$8(this, this.k.a(), null)), mdhVar), null, this), 3);
                tje.N(tseVar3, null, null, new MtStopRouteUiStateInteractor$initializeData$$inlined$safeCollectIn$4(this.d.a(), null, this), 3);
                this.g.a(tseVar3, n4u0Var, e4l0Var.a());
                return zy11.a;
            }
        }
        mtStopRouteUiStateInteractor$initializeData$1 = new MtStopRouteUiStateInteractor$initializeData$1(this, continuationImpl);
        Object obj2 = mtStopRouteUiStateInteractor$initializeData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopRouteUiStateInteractor$initializeData$1.label;
        e4l0 e4l0Var3 = this.c;
        ru.yandex.taxi.masstransit.stoproute.mapper.a aVar2 = this.f;
        tt2 tt2Var2 = this.a;
        boolean z2 = true;
        if (i != 0) {
        }
        tse tseVar32 = tseVar2;
        n4u0 n4u0Var2 = (n4u0) obj2;
        jqr jqrVar2 = new jqr(new b(n4u0Var2, aVar2), new MtStopRouteUiStateInteractor$initializeData$3(2, this, g.class, "reportLoaded", "reportLoaded(Lru/yandex/taxi/masstransit/stoproute/model/MtStopsRouteHeaderState;)V", 4), 3);
        tt2Var2.getClass();
        sjh sjhVar22 = uyj.a;
        mdh mdhVar2 = mdh.b;
        tje.N(tseVar32, null, null, new MtStopRouteUiStateInteractor$initializeData$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(jqrVar2, mdhVar2), null, this), 3);
        tje.N(tseVar32, null, null, new MtStopRouteUiStateInteractor$initializeData$$inlined$safeCollectIn$2(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.n(n4u0Var2, new d(ru.yandex.taxi.experiments.d.b(this.i.a)), this.r, new MtStopRouteUiStateInteractor$initializeData$6(this, null)), mdhVar2), null, this), 3);
        tje.N(tseVar32, null, null, new MtStopRouteUiStateInteractor$initializeData$$inlined$safeCollectIn$3(kotlinx.coroutines.flow.e.F(new m0(n4u0Var2, com.yandex.go.coroutines.b.d(this.m.a(), new MtStopRouteUiStateInteractor$initializeData$$inlined$start$1(ru.yandex.taxi.masstransit.geopayment.tickets.model.a.b, null)), new MtStopRouteUiStateInteractor$initializeData$8(this, this.k.a(), null)), mdhVar2), null, this), 3);
        tje.N(tseVar32, null, null, new MtStopRouteUiStateInteractor$initializeData$$inlined$safeCollectIn$4(this.d.a(), null, this), 3);
        this.g.a(tseVar32, n4u0Var2, e4l0Var3.a());
        return zy11.a;
    }

    public final void e(Throwable th) {
        r240 r240Var = this.o;
        ih01 ih01Var = r240Var.b;
        e4l0 e4l0Var = r240Var.a;
        ih01Var.a(null, r240.a(e4l0Var).getAnalyticsName(), e4l0Var.a());
        while (true) {
            r0 r0Var = this.p;
            Object value = r0Var.getValue();
            Throwable th2 = th;
            if (r0Var.k(value, k340.a((k340) value, null, null, false, th2, 0.0f, null, null, HProv.PP_CACHE_SIZE))) {
                ((ru.yandex.taxi.masstransit.stoproute.router.b) this.b.a).r(new pi30(27));
                return;
            }
            th = th2;
        }
    }
}
