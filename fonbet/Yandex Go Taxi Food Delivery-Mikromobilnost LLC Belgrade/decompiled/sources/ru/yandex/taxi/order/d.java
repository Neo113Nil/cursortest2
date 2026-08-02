package ru.yandex.taxi.order;

import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a1t;
import defpackage.bvf0;
import defpackage.cne0;
import defpackage.czo0;
import defpackage.d1t;
import defpackage.h1s;
import defpackage.hbp0;
import defpackage.hdu;
import defpackage.k0b0;
import defpackage.mo21;
import defpackage.mth;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.po21;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.experiments.ForceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$flatMapLatest$1;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes6.dex */
public final class d {
    public final tse a;
    public final d1t b;
    public final ru.yandex.taxi.utils.b c;
    public final k0b0 d;
    public final p2y0 e;
    public final po21 f;
    public final zuj0 g;
    public final h1s h;
    public final hdu i;
    public volatile DriveState l;
    public volatile boolean m;
    public pzt0 o;
    public final hbp0 j = new hbp0(new czo0(14), "", null);
    public final r0 k = bvf0.c(null);
    public volatile boolean n = true;

    public d(tse tseVar, d1t d1tVar, ru.yandex.taxi.utils.b bVar, k0b0 k0b0Var, p2y0 p2y0Var, po21 po21Var, zuj0 zuj0Var, h1s h1sVar, hdu hduVar) {
        this.a = tseVar;
        this.b = d1tVar;
        this.c = bVar;
        this.d = k0b0Var;
        this.e = p2y0Var;
        this.f = po21Var;
        this.g = zuj0Var;
        this.h = h1sVar;
        this.i = hduVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Continuation continuation, d dVar) {
        GeoSharingInteractorImpl$checkOrdersCount$1 geoSharingInteractorImpl$checkOrdersCount$1;
        int i;
        o2y0 o2y0Var;
        TaxiOrder b;
        dVar.getClass();
        zy11 zy11Var = zy11.a;
        if (continuation instanceof GeoSharingInteractorImpl$checkOrdersCount$1) {
            geoSharingInteractorImpl$checkOrdersCount$1 = (GeoSharingInteractorImpl$checkOrdersCount$1) continuation;
            int i2 = geoSharingInteractorImpl$checkOrdersCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoSharingInteractorImpl$checkOrdersCount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoSharingInteractorImpl$checkOrdersCount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoSharingInteractorImpl$checkOrdersCount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p2y0 p2y0Var = dVar.e;
                    geoSharingInteractorImpl$checkOrdersCount$1.label = 1;
                    obj = ((e0) p2y0Var).k(geoSharingInteractorImpl$checkOrdersCount$1);
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
                List list = (List) obj;
                o2y0Var = (o2y0) kotlin.collections.a.R(list);
                if (o2y0Var != null || (b = o2y0Var.b()) == null) {
                    dVar.d();
                    return zy11Var;
                }
                if (list.size() <= 1 && b.b.M == null) {
                    dVar.f(b.h.b);
                    return zy11Var;
                }
                com.yandex.go.geosharing.controller.e eVar = (com.yandex.go.geosharing.controller.e) dVar.b;
                eVar.n = false;
                eVar.b.q = false;
                eVar.r = null;
                eVar.j();
                dVar.d();
                return zy11Var;
            }
        }
        geoSharingInteractorImpl$checkOrdersCount$1 = new GeoSharingInteractorImpl$checkOrdersCount$1(continuation, dVar);
        Object obj2 = geoSharingInteractorImpl$checkOrdersCount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoSharingInteractorImpl$checkOrdersCount$1.label;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        o2y0Var = (o2y0) kotlin.collections.a.R(list2);
        if (o2y0Var != null) {
        }
        dVar.d();
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d dVar, boolean z, Continuation continuation) {
        GeoSharingInteractorImpl$enableGeoSharingLocation$1 geoSharingInteractorImpl$enableGeoSharingLocation$1;
        int i;
        List list;
        boolean g;
        boolean f;
        d1t d1tVar = dVar.b;
        ru.yandex.taxi.utils.b bVar = dVar.c;
        if (continuation instanceof GeoSharingInteractorImpl$enableGeoSharingLocation$1) {
            geoSharingInteractorImpl$enableGeoSharingLocation$1 = (GeoSharingInteractorImpl$enableGeoSharingLocation$1) continuation;
            int i2 = geoSharingInteractorImpl$enableGeoSharingLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoSharingInteractorImpl$enableGeoSharingLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoSharingInteractorImpl$enableGeoSharingLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoSharingInteractorImpl$enableGeoSharingLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p2y0 p2y0Var = dVar.e;
                    geoSharingInteractorImpl$enableGeoSharingLocation$1.Z$0 = z;
                    geoSharingInteractorImpl$enableGeoSharingLocation$1.label = 1;
                    obj = ((e0) p2y0Var).k(geoSharingInteractorImpl$enableGeoSharingLocation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = geoSharingInteractorImpl$enableGeoSharingLocation$1.Z$0;
                    kotlin.b.b(obj);
                }
                list = (List) obj;
                cne0 cne0Var = bVar.m;
                String str = bVar.l;
                cne0 cne0Var2 = bVar.m;
                g = cne0Var.g(bVar.i, true);
                zy11 zy11Var = zy11.a;
                if (g && list.size() == 1 && !e(list)) {
                    String str2 = ((o2y0) kotlin.collections.a.P(list)).b().a;
                    com.yandex.go.geosharing.controller.e eVar = (com.yandex.go.geosharing.controller.e) d1tVar;
                    f = eVar.f(Collections.singletonList(str2));
                    if (z == f || !bVar.d().equals(str2)) {
                        if (!z) {
                            cne0Var2.r(bVar.k, str2);
                            if (!f) {
                                dVar.i.p(true);
                            }
                            cne0Var2.u(str, true);
                            eVar.g(true);
                            dVar.d();
                            return zy11Var;
                        }
                        if (bVar.d().equals(str2)) {
                            cne0Var2.u(str, false);
                            eVar.g(false);
                            dVar.d();
                        }
                    }
                }
                return zy11Var;
            }
        }
        geoSharingInteractorImpl$enableGeoSharingLocation$1 = new GeoSharingInteractorImpl$enableGeoSharingLocation$1(continuation, dVar);
        Object obj2 = geoSharingInteractorImpl$enableGeoSharingLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoSharingInteractorImpl$enableGeoSharingLocation$1.label;
        if (i != 0) {
        }
        list = (List) obj2;
        cne0 cne0Var3 = bVar.m;
        String str3 = bVar.l;
        cne0 cne0Var22 = bVar.m;
        g = cne0Var3.g(bVar.i, true);
        zy11 zy11Var2 = zy11.a;
        if (g) {
            String str22 = ((o2y0) kotlin.collections.a.P(list)).b().a;
            com.yandex.go.geosharing.controller.e eVar2 = (com.yandex.go.geosharing.controller.e) d1tVar;
            f = eVar2.f(Collections.singletonList(str22));
            if (z == f) {
            }
            if (!z) {
            }
        }
        return zy11Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006b, code lost:
    
        if (r10 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(d dVar, mo21 mo21Var, ContinuationImpl continuationImpl) {
        GeoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1 geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1;
        int i;
        zzs a;
        o2y0 o2y0Var;
        TaxiOrder b;
        double d;
        dVar.getClass();
        if (continuationImpl instanceof GeoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1) {
            geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1 = (GeoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1) continuationImpl;
            int i2 = geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a = mo21Var.a();
                    p2y0 p2y0Var = dVar.e;
                    geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1.L$0 = null;
                    geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1.L$1 = a;
                    geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1.label = 1;
                    obj = ((e0) p2y0Var).k(geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        d = geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1.D$0;
                        kotlin.b.b(obj);
                        Double d2 = ((a1t) obj).c;
                        return Boolean.valueOf(d < (d2 == null ? d2.doubleValue() : 900.0d));
                    }
                    a = (zzs) geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1.L$1;
                    kotlin.b.b(obj);
                }
                o2y0Var = (o2y0) kotlin.collections.a.R((List) obj);
                if (o2y0Var != null || (b = o2y0Var.b()) == null) {
                    return Boolean.FALSE;
                }
                zzs v = b.v();
                if (v == null) {
                    return Boolean.TRUE;
                }
                double j = ru.yandex.taxi.map.utils.a.j(a, v);
                ru.yandex.taxi.utils.b bVar = dVar.c;
                geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1.L$0 = null;
                geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1.L$1 = null;
                geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1.L$2 = null;
                geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1.L$3 = null;
                geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1.L$4 = null;
                geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1.D$0 = j;
                geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1.label = 2;
                Object b2 = bVar.b(geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1);
                if (b2 != coroutineSingletons) {
                    obj = b2;
                    d = j;
                    Double d22 = ((a1t) obj).c;
                    return Boolean.valueOf(d < (d22 == null ? d22.doubleValue() : 900.0d));
                }
                return coroutineSingletons;
            }
        }
        geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1 = new GeoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1(dVar, continuationImpl);
        Object obj2 = geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1.label;
        if (i != 0) {
        }
        o2y0Var = (o2y0) kotlin.collections.a.R((List) obj2);
        if (o2y0Var != null) {
        }
        return Boolean.FALSE;
    }

    public static boolean e(List list) {
        TaxiOrder b;
        o2y0 o2y0Var = (o2y0) kotlin.collections.a.R(list);
        return ((o2y0Var == null || (b = o2y0Var.b()) == null) ? null : b.b.M) != null;
    }

    public final void d() {
        tje.N(this.a, null, null, new GeoSharingInteractorImpl$emitUiConfig$1(null, this), 3);
    }

    public final void f(DriveState driveState) {
        this.l = driveState;
        boolean z = this.l == DriveState.SEARCH || this.l == DriveState.DRIVING || this.l == DriveState.WAITING;
        pzt0 pzt0Var = this.o;
        if (z) {
            if (pzt0Var == null || pzt0Var.isCancelled()) {
                this.o = tje.N(this.a, null, null, new GeoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(new o(new c(((ru.yandex.taxi.preorder.source.userposition.e) this.f).n(), this), new GeoSharingInteractorImpl$subscribeForUserLocationIfNeeded$2(3, null))), null, this), 3);
            }
        } else if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        d();
    }

    public final void g() {
        hbp0 hbp0Var = this.j;
        hbp0Var.a();
        ru.yandex.taxi.utils.b bVar = this.c;
        int i = 6;
        tje.N(hbp0Var, null, null, new GeoSharingInteractorImpl$resume$$inlined$collectIn$1(new mth(bVar.o, i), null, this), 3);
        tje.N(hbp0Var, null, null, new GeoSharingInteractorImpl$resume$$inlined$collectIn$2(((e0) this.e).n(), null, this), 3);
        tje.N(hbp0Var, null, null, new GeoSharingInteractorImpl$resume$$inlined$collectIn$3(new mth(bVar.p, i), null, this), 3);
        h1s h1sVar = this.h;
        tje.N(hbp0Var, null, null, new GeoSharingInteractorImpl$resume$$inlined$safeCollectIn$1(new ru.yandex.taxi.experiments.h(kotlinx.coroutines.flow.e.X(new ru.yandex.taxi.experiments.f(((com.yandex.go.taxi.order.provider.a) h1sVar.a).a(), h1sVar), new ForceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$flatMapLatest$1(null, h1sVar)), h1sVar), null, this), 3);
        tje.N(this.a, null, null, new GeoSharingInteractorImpl$resume$6(null, this), 3);
    }
}
