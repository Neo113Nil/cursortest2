package ru.yandex.taxi.masstransit.geopayment.modal;

import com.yandex.go.masstransit.sdk.ble.api.analytics.RouteOptionsButtonAction;
import defpackage.cl30;
import defpackage.cw30;
import defpackage.d411;
import defpackage.dl30;
import defpackage.ek30;
import defpackage.el30;
import defpackage.fd30;
import defpackage.fl30;
import defpackage.fre;
import defpackage.gl30;
import defpackage.hl30;
import defpackage.il30;
import defpackage.j26;
import defpackage.jl30;
import defpackage.jl40;
import defpackage.k26;
import defpackage.kl30;
import defpackage.ll30;
import defpackage.ml30;
import defpackage.n26;
import defpackage.ny61;
import defpackage.ol30;
import defpackage.pj40;
import defpackage.pk30;
import defpackage.r26;
import defpackage.sr4;
import defpackage.tpr;
import defpackage.tse;
import defpackage.u26;
import defpackage.w511;
import defpackage.xk30;
import defpackage.z26;
import defpackage.zy11;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$RouteOptionsScreenOpenReason;

/* loaded from: classes6.dex */
public final class f {
    public final ru.yandex.taxi.masstransit.geopayment.domain.c a;
    public final ol30 b;
    public final z26 c;
    public final ek30 d;
    public final xk30 e;
    public final ru.yandex.taxi.masstransit.geopayment.adapter.a f;
    public final sr4 g;
    public final j26 h;

    public f(ru.yandex.taxi.masstransit.geopayment.domain.c cVar, ol30 ol30Var, z26 z26Var, ek30 ek30Var, xk30 xk30Var, ru.yandex.taxi.masstransit.geopayment.adapter.a aVar, sr4 sr4Var, j26 j26Var) {
        this.a = cVar;
        this.b = ol30Var;
        this.c = z26Var;
        this.d = ek30Var;
        this.e = xk30Var;
        this.f = aVar;
        this.g = sr4Var;
        this.h = j26Var;
    }

    public final void a(ll30 ll30Var, RouteOptionsButtonAction routeOptionsButtonAction) {
        String str;
        List list = ll30Var.a;
        if (list == null || !(!list.isEmpty()) || ((str = ll30Var.b) != null && str.length() != 0)) {
            list = null;
        }
        List list2 = list;
        ru.yandex.taxi.masstransit.geopayment.adapter.a aVar = this.f;
        this.d.a(routeOptionsButtonAction, ((com.yandex.go.permission.b) aVar.a).a(11), ((com.yandex.go.permission.b) aVar.a).a(3), this.e.a.a, list2, null, this.h.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(pk30 pk30Var, tse tseVar, n26 n26Var, ContinuationImpl continuationImpl) {
        MtGeoPaymentModalUiActionInteractor$getVehicles$1 mtGeoPaymentModalUiActionInteractor$getVehicles$1;
        int i;
        tse tseVar2;
        n26 n26Var2;
        Object obj;
        pk30 pk30Var2;
        k26 k26Var;
        if (continuationImpl instanceof MtGeoPaymentModalUiActionInteractor$getVehicles$1) {
            mtGeoPaymentModalUiActionInteractor$getVehicles$1 = (MtGeoPaymentModalUiActionInteractor$getVehicles$1) continuationImpl;
            int i2 = mtGeoPaymentModalUiActionInteractor$getVehicles$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtGeoPaymentModalUiActionInteractor$getVehicles$1.label = i2 - Integer.MIN_VALUE;
                MtGeoPaymentModalUiActionInteractor$getVehicles$1 mtGeoPaymentModalUiActionInteractor$getVehicles$12 = mtGeoPaymentModalUiActionInteractor$getVehicles$1;
                Object obj2 = mtGeoPaymentModalUiActionInteractor$getVehicles$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtGeoPaymentModalUiActionInteractor$getVehicles$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    r26 r26Var = n26Var.a;
                    u26 u26Var = (r26Var == null || (k26Var = r26Var.b) == null) ? null : k26Var.f;
                    mtGeoPaymentModalUiActionInteractor$getVehicles$12.L$0 = pk30Var;
                    mtGeoPaymentModalUiActionInteractor$getVehicles$12.L$1 = tseVar;
                    mtGeoPaymentModalUiActionInteractor$getVehicles$12.L$2 = n26Var;
                    mtGeoPaymentModalUiActionInteractor$getVehicles$12.label = 1;
                    Object c = this.a.c(u26Var, mtGeoPaymentModalUiActionInteractor$getVehicles$12);
                    if (c != coroutineSingletons) {
                        tseVar2 = tseVar;
                        n26Var2 = n26Var;
                        obj = c;
                        pk30Var2 = pk30Var;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return obj2;
                }
                n26 n26Var3 = (n26) mtGeoPaymentModalUiActionInteractor$getVehicles$12.L$2;
                tse tseVar3 = (tse) mtGeoPaymentModalUiActionInteractor$getVehicles$12.L$1;
                pk30 pk30Var3 = (pk30) mtGeoPaymentModalUiActionInteractor$getVehicles$12.L$0;
                kotlin.b.b(obj2);
                n26Var2 = n26Var3;
                obj = obj2;
                pk30Var2 = pk30Var3;
                tseVar2 = tseVar3;
                tpr tprVar = (tpr) obj;
                fre freVar = new fre(this, pk30Var2, n26Var2, tseVar2, 5);
                mtGeoPaymentModalUiActionInteractor$getVehicles$12.L$0 = null;
                mtGeoPaymentModalUiActionInteractor$getVehicles$12.L$1 = null;
                mtGeoPaymentModalUiActionInteractor$getVehicles$12.L$2 = null;
                mtGeoPaymentModalUiActionInteractor$getVehicles$12.label = 2;
                Object collect = tprVar.collect(freVar, mtGeoPaymentModalUiActionInteractor$getVehicles$12);
                return collect != coroutineSingletons ? coroutineSingletons : collect;
            }
        }
        mtGeoPaymentModalUiActionInteractor$getVehicles$1 = new MtGeoPaymentModalUiActionInteractor$getVehicles$1(this, continuationImpl);
        MtGeoPaymentModalUiActionInteractor$getVehicles$1 mtGeoPaymentModalUiActionInteractor$getVehicles$122 = mtGeoPaymentModalUiActionInteractor$getVehicles$1;
        Object obj22 = mtGeoPaymentModalUiActionInteractor$getVehicles$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtGeoPaymentModalUiActionInteractor$getVehicles$122.label;
        if (i != 0) {
        }
        tpr tprVar2 = (tpr) obj;
        fre freVar2 = new fre(this, pk30Var2, n26Var2, tseVar2, 5);
        mtGeoPaymentModalUiActionInteractor$getVehicles$122.L$0 = null;
        mtGeoPaymentModalUiActionInteractor$getVehicles$122.L$1 = null;
        mtGeoPaymentModalUiActionInteractor$getVehicles$122.L$2 = null;
        mtGeoPaymentModalUiActionInteractor$getVehicles$122.label = 2;
        Object collect2 = tprVar2.collect(freVar2, mtGeoPaymentModalUiActionInteractor$getVehicles$122);
        if (collect2 != coroutineSingletons2) {
        }
    }

    public final Object c(ml30 ml30Var, pk30 pk30Var, tse tseVar, n26 n26Var, SuspendLambda suspendLambda) {
        k26 k26Var;
        k26 k26Var2;
        ru.yandex.taxi.masstransit.geopayment.repository.d dVar = this.a.a;
        boolean l = jl40.l(ml30Var, cl30.a);
        ek30 ek30Var = this.d;
        ru.yandex.taxi.masstransit.geopayment.adapter.a aVar = this.f;
        if (l) {
            boolean a = ((com.yandex.go.permission.b) aVar.a).a(11);
            boolean a2 = ((com.yandex.go.permission.b) aVar.a).a(3);
            d411 d411Var = ek30Var.a;
            cw30 cw30Var = ek30Var.c;
            TransportPaymentAnalytics$RouteOptionsScreenOpenReason transportPaymentAnalytics$RouteOptionsScreenOpenReason = cw30Var.a;
            String c = ek30Var.c();
            pj40 pj40Var = cw30Var.b;
            String str = pj40Var.a;
            String str2 = pj40Var.b;
            d411Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("source", transportPaymentAnalytics$RouteOptionsScreenOpenReason.getEventValue());
            hashMap.put("has_bluetooth_access", Boolean.valueOf(a));
            hashMap.put("has_camera_access", Boolean.valueOf(a2));
            hashMap.put("zone_name", c);
            if (str != null) {
                hashMap.put("utm_source", str);
            }
            if (str2 != null) {
                hashMap.put("utm_medium", str2);
            }
            d411Var.a.a("TransportPayment.RouteOptions.Shown", hashMap, 5, new HashMap());
            return b(pk30Var, tseVar, n26Var, suspendLambda);
        }
        boolean z = ml30Var instanceof kl30;
        z26 z26Var = this.c;
        if (z) {
            a(((kl30) ml30Var).a, RouteOptionsButtonAction.GoToSettings);
            z26Var.c();
        } else if (ml30Var instanceof il30) {
            a(((il30) ml30Var).a, RouteOptionsButtonAction.GoToSettings);
            z26Var.a();
        } else if (ml30Var instanceof jl30) {
            a(((jl30) ml30Var).a, RouteOptionsButtonAction.GoToSettings);
            z26Var.b();
        } else if (ml30Var instanceof dl30) {
            a(((dl30) ml30Var).a, RouteOptionsButtonAction.Back);
            pk30Var.a();
        } else if (ml30Var instanceof gl30) {
            a(((gl30) ml30Var).a, RouteOptionsButtonAction.QrPay);
            pk30Var.d();
        } else {
            u26 u26Var = null;
            if (jl40.l(ml30Var, fl30.a)) {
                r26 r26Var = n26Var.a;
                if (r26Var != null && (k26Var2 = r26Var.b) != null) {
                    u26Var = k26Var2.f;
                }
                dVar.f(u26Var, tseVar);
            } else if (ml30Var instanceof el30) {
                el30 el30Var = (el30) ml30Var;
                fd30 fd30Var = el30Var.b;
                List list = el30Var.a.a;
                boolean a3 = ((com.yandex.go.permission.b) aVar.a).a(11);
                boolean a4 = ((com.yandex.go.permission.b) aVar.a).a(3);
                ek30Var.getClass();
                ek30Var.a(RouteOptionsButtonAction.Transport, a3, a4, null, list, fd30Var.d, ek30Var.c());
                pk30Var.b(fd30Var);
            } else {
                if (!jl40.l(ml30Var, hl30.a)) {
                    w511.b();
                    return null;
                }
                r26 r26Var2 = n26Var.a;
                if (r26Var2 != null && (k26Var = r26Var2.b) != null) {
                    u26Var = k26Var.f;
                }
                dVar.f(u26Var, tseVar);
            }
        }
        return zy11.a;
    }
}
