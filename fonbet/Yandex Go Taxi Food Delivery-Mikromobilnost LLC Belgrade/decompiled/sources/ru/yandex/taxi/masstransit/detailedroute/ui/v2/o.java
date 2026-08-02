package ru.yandex.taxi.masstransit.detailedroute.ui.v2;

import com.yandex.go.payments.data.p;
import defpackage.a2a0;
import defpackage.ah00;
import defpackage.ai30;
import defpackage.b3l0;
import defpackage.b711;
import defpackage.bvf0;
import defpackage.cu30;
import defpackage.dib1;
import defpackage.ee01;
import defpackage.fe01;
import defpackage.fj40;
import defpackage.g92;
import defpackage.gci0;
import defpackage.h711;
import defpackage.jqr;
import defpackage.jt30;
import defpackage.lm30;
import defpackage.ms30;
import defpackage.mth;
import defpackage.ny61;
import defpackage.oov0;
import defpackage.pd01;
import defpackage.rw30;
import defpackage.su30;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.uj30;
import defpackage.v011;
import defpackage.w511;
import defpackage.wr30;
import defpackage.wu30;
import defpackage.yt11;
import defpackage.yta1;
import defpackage.yw30;
import defpackage.yxf0;
import defpackage.zh30;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticSource;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticType;
import ru.yandex.taxi.masstransit.geopayment.purchase.MtPurchaseMapper;
import ru.yandex.taxi.masstransit.geopayment.tickets.MtPaymentTicketsInteractor$pollTickets$$inlined$flatMapLatest$1;
import ru.yandex.taxi.masstransit.router.MtHubLeadingItemKind;

/* loaded from: classes6.dex */
public final class o implements yt11 {
    public final ru.yandex.taxi.masstransit.domain.c a;
    public final ru.yandex.taxi.masstransit.mapper.a b;
    public final wr30 c;
    public final ah00 d;
    public final yw30 e;
    public final yxf0 f;
    public final v011 g;
    public final wu30 h;
    public final p i;
    public final a2a0 j;
    public final jt30 k;
    public final MtPurchaseMapper l;
    public final r0 m = bvf0.c(EmptySet.a);
    public su30 n;
    public uj30 o;
    public MtDetailedRouteAnalyticSource p;
    public MtDetailedRouteAnalyticType q;
    public lm30 r;

    public o(ru.yandex.taxi.masstransit.domain.c cVar, ru.yandex.taxi.masstransit.mapper.a aVar, wr30 wr30Var, ah00 ah00Var, yw30 yw30Var, yxf0 yxf0Var, v011 v011Var, wu30 wu30Var, p pVar, a2a0 a2a0Var, jt30 jt30Var, MtPurchaseMapper mtPurchaseMapper) {
        this.a = cVar;
        this.b = aVar;
        this.c = wr30Var;
        this.d = ah00Var;
        this.e = yw30Var;
        this.f = yxf0Var;
        this.g = v011Var;
        this.h = wu30Var;
        this.i = pVar;
        this.j = a2a0Var;
        this.k = jt30Var;
        this.l = mtPurchaseMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7 A[LOOP:1: B:22:0x00c1->B:24:0x00c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4 A[LOOP:2: B:27:0x00de->B:29:0x00e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0053  */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object, ru.yandex.taxi.masstransit.detailedroute.ui.v2.o] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(o oVar, Pair pair, ContinuationImpl continuationImpl) {
        MtDetailedRouteUiStateInteractor$mapUiState$1 mtDetailedRouteUiStateInteractor$mapUiState$1;
        int i;
        rw30 rw30Var;
        String str;
        String str2;
        Iterator it;
        Iterator it2;
        Iterable<h711> iterable;
        Iterator it3;
        fe01 fe01Var;
        Iterator it4;
        boolean z;
        cu30 c;
        oVar.getClass();
        if (continuationImpl instanceof MtDetailedRouteUiStateInteractor$mapUiState$1) {
            mtDetailedRouteUiStateInteractor$mapUiState$1 = (MtDetailedRouteUiStateInteractor$mapUiState$1) continuationImpl;
            int i2 = mtDetailedRouteUiStateInteractor$mapUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtDetailedRouteUiStateInteractor$mapUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtDetailedRouteUiStateInteractor$mapUiState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtDetailedRouteUiStateInteractor$mapUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rw30Var = (rw30) pair.getFirst();
                    Set set = (Set) pair.getSecond();
                    b3l0 u = oVar.f.u(rw30Var.a);
                    str = u.a;
                    String str3 = u.b;
                    mtDetailedRouteUiStateInteractor$mapUiState$1.L$0 = null;
                    mtDetailedRouteUiStateInteractor$mapUiState$1.L$1 = rw30Var;
                    mtDetailedRouteUiStateInteractor$mapUiState$1.L$2 = null;
                    mtDetailedRouteUiStateInteractor$mapUiState$1.L$3 = null;
                    mtDetailedRouteUiStateInteractor$mapUiState$1.L$4 = null;
                    mtDetailedRouteUiStateInteractor$mapUiState$1.L$5 = str;
                    mtDetailedRouteUiStateInteractor$mapUiState$1.L$6 = str3;
                    mtDetailedRouteUiStateInteractor$mapUiState$1.label = 1;
                    obj = oVar.c(rw30Var, set, mtDetailedRouteUiStateInteractor$mapUiState$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    str2 = str3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = (String) mtDetailedRouteUiStateInteractor$mapUiState$1.L$6;
                    String str5 = (String) mtDetailedRouteUiStateInteractor$mapUiState$1.L$5;
                    rw30Var = (rw30) mtDetailedRouteUiStateInteractor$mapUiState$1.L$1;
                    kotlin.b.b(obj);
                    str2 = str4;
                    str = str5;
                }
                List list = (List) obj;
                List list2 = rw30Var.a.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof fj40) {
                        arrayList.add(obj3);
                    }
                }
                MtPurchaseMapper mtPurchaseMapper = oVar.l;
                ms30 a = oVar.k.a();
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((fj40) it.next()).getType());
                }
                MapBuilder mapBuilder = new MapBuilder();
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    fj40 fj40Var = (fj40) it2.next();
                    mapBuilder.putIfAbsent(fj40Var.getType(), fj40Var.a());
                }
                MapBuilder j = mapBuilder.j();
                ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar = rw30Var.h;
                iterable = (Iterable) list;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : iterable) {
                    if (obj4 instanceof b711) {
                        arrayList3.add(obj4);
                    }
                }
                it3 = arrayList3.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        fe01Var = null;
                        break;
                    }
                    ee01 ee01Var = ((b711) it3.next()).a;
                    fe01 fe01Var2 = ee01Var != null ? ee01Var.b : null;
                    if (fe01Var2 != null) {
                        fe01Var = fe01Var2;
                        break;
                    }
                }
                if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    it4 = iterable.iterator();
                    while (it4.hasNext()) {
                        if (((h711) it4.next()) instanceof b711) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                mtPurchaseMapper.getClass();
                c = MtPurchaseMapper.c(a, arrayList2, j, aVar, fe01Var, z);
                if (c.c) {
                    list = new ArrayList();
                    for (h711 h711Var : iterable) {
                        if (h711Var instanceof b711) {
                            b711 b711Var = (b711) h711Var;
                            ee01 ee01Var2 = b711Var.a;
                            h711Var = ee01Var2 != null ? new b711(ee01Var2, null, b711Var.c, b711Var.d) : null;
                        }
                        if (h711Var != null) {
                            list.add(h711Var);
                        }
                    }
                }
                return new ai30(str, str2, list, oVar.r, c.a, c.b, 24);
            }
        }
        mtDetailedRouteUiStateInteractor$mapUiState$1 = new MtDetailedRouteUiStateInteractor$mapUiState$1(oVar, continuationImpl);
        Object obj5 = mtDetailedRouteUiStateInteractor$mapUiState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtDetailedRouteUiStateInteractor$mapUiState$1.label;
        if (i != 0) {
        }
        List list3 = (List) obj5;
        List list22 = rw30Var.a.a;
        ArrayList arrayList4 = new ArrayList();
        while (r2.hasNext()) {
        }
        MtPurchaseMapper mtPurchaseMapper2 = oVar.l;
        ms30 a2 = oVar.k.a();
        ArrayList arrayList22 = new ArrayList(tcc.n(arrayList4, 10));
        it = arrayList4.iterator();
        while (it.hasNext()) {
        }
        MapBuilder mapBuilder2 = new MapBuilder();
        it2 = arrayList4.iterator();
        while (it2.hasNext()) {
        }
        MapBuilder j2 = mapBuilder2.j();
        ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar2 = rw30Var.h;
        iterable = (Iterable) list3;
        ArrayList arrayList32 = new ArrayList();
        while (r7.hasNext()) {
        }
        it3 = arrayList32.iterator();
        while (true) {
            if (it3.hasNext()) {
            }
        }
        if (iterable instanceof Collection) {
        }
        it4 = iterable.iterator();
        while (it4.hasNext()) {
        }
        z = false;
        mtPurchaseMapper2.getClass();
        c = MtPurchaseMapper.c(a2, arrayList22, j2, aVar2, fe01Var, z);
        if (c.c) {
        }
        return new ai30(str, str2, list3, oVar.r, c.a, c.b, 24);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        tpr g92Var;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        su30 su30Var = this.n;
        Object obj = null;
        if (su30Var == null) {
            su30Var = null;
        }
        int i = 2;
        g92 g92Var2 = new g92(i, su30Var);
        wr30 wr30Var = this.c;
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.X(new mth(new j0(null, new jqr(this.a.a(g92Var2, kotlinx.coroutines.flow.e.X(wr30Var.b(), new MtPaymentTicketsInteractor$pollTickets$$inlined$flatMapLatest$1(null, wr30Var))), new MtDetailedRouteUiStateInteractor$routeUiStateFlow$1(ref$BooleanRef, this, ref$ObjectRef, null), 3), new MtDetailedRouteUiStateInteractor$updateLocalState$$inlined$withPreviousEmit$1(3, null)), 6), new MtDetailedRouteUiStateInteractor$updateLocalState$$inlined$flatMapLatest$1(null, this)), new MtDetailedRouteUiStateInteractor$routeUiStateFlow$2(null, this)));
        uj30 uj30Var = this.o;
        if (uj30Var == null) {
            uj30Var = null;
        }
        gci0 d = kotlinx.coroutines.flow.e.d(uj30Var.a);
        tpr t2 = kotlinx.coroutines.flow.e.t(new h(com.yandex.go.coroutines.b.d(new f(dib1.c(this.d)), new MtDetailedRouteUiStateInteractor$azimuthFlow$$inlined$start$1(null, this))));
        lm30 lm30Var = this.r;
        if (lm30Var == null) {
            g92Var = new g92(i, obj);
        } else {
            MtHubLeadingItemKind mtHubLeadingItemKind = lm30Var.c;
            int i2 = mtHubLeadingItemKind == null ? -1 : zh30.a[mtHubLeadingItemKind.ordinal()];
            if (i2 == -1) {
                g92Var = new g92(i, lm30Var);
            } else if (i2 == 1) {
                g92Var = new l(kotlinx.coroutines.flow.e.X(this.h.f(), new MtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$flatMapLatest$1(null, this)), lm30Var);
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                g92Var = new j(this.i.b(), lm30Var, this);
            }
        }
        return kotlinx.coroutines.flow.e.m(t, d, t2, g92Var, new MtDetailedRouteUiStateInteractor$uiStateFlow$1(5, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(rw30 rw30Var, Set set, ContinuationImpl continuationImpl) {
        MtDetailedRouteUiStateInteractor$mapRouteItems$1 mtDetailedRouteUiStateInteractor$mapRouteItems$1;
        int i;
        if (continuationImpl instanceof MtDetailedRouteUiStateInteractor$mapRouteItems$1) {
            mtDetailedRouteUiStateInteractor$mapRouteItems$1 = (MtDetailedRouteUiStateInteractor$mapRouteItems$1) continuationImpl;
            int i2 = mtDetailedRouteUiStateInteractor$mapRouteItems$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtDetailedRouteUiStateInteractor$mapRouteItems$1.label = i2 - Integer.MIN_VALUE;
                MtDetailedRouteUiStateInteractor$mapRouteItems$1 mtDetailedRouteUiStateInteractor$mapRouteItems$12 = mtDetailedRouteUiStateInteractor$mapRouteItems$1;
                Object obj = mtDetailedRouteUiStateInteractor$mapRouteItems$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtDetailedRouteUiStateInteractor$mapRouteItems$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pd01 pd01Var = rw30Var.f;
                    oov0 oov0Var = pd01Var.b;
                    ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar = rw30Var.h;
                    boolean z = pd01Var.a;
                    mtDetailedRouteUiStateInteractor$mapRouteItems$12.L$0 = null;
                    mtDetailedRouteUiStateInteractor$mapRouteItems$12.L$1 = null;
                    mtDetailedRouteUiStateInteractor$mapRouteItems$12.label = 1;
                    obj = this.b.f(rw30Var, set, oov0Var, aVar, z, null, true, mtDetailedRouteUiStateInteractor$mapRouteItems$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return yta1.e((List) obj, null);
            }
        }
        mtDetailedRouteUiStateInteractor$mapRouteItems$1 = new MtDetailedRouteUiStateInteractor$mapRouteItems$1(this, continuationImpl);
        MtDetailedRouteUiStateInteractor$mapRouteItems$1 mtDetailedRouteUiStateInteractor$mapRouteItems$122 = mtDetailedRouteUiStateInteractor$mapRouteItems$1;
        Object obj2 = mtDetailedRouteUiStateInteractor$mapRouteItems$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtDetailedRouteUiStateInteractor$mapRouteItems$122.label;
        if (i != 0) {
        }
        return yta1.e((List) obj2, null);
    }
}
