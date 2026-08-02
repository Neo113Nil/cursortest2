package ru.yandex.taxi.masstransit.detailedroute.ui;

import defpackage.ad5;
import defpackage.ah00;
import defpackage.avj0;
import defpackage.bvf0;
import defpackage.gv30;
import defpackage.k141;
import defpackage.kg30;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.oov0;
import defpackage.oyr;
import defpackage.pd01;
import defpackage.pf30;
import defpackage.rw30;
import defpackage.su30;
import defpackage.uj30;
import defpackage.w511;
import defpackage.wr30;
import defpackage.yh30;
import defpackage.yw30;
import defpackage.zf30;
import defpackage.zuj0;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticSource;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$VehicleType;
import ru.yandex.taxi.masstransit.utils.VehicleType;

/* loaded from: classes6.dex */
public final class c extends ad5 {
    public final MtDetailedRouteAnalyticType A;
    public final uj30 B;
    public final yw30 C;
    public final zuj0 D;
    public final ru.yandex.taxi.masstransit.mapper.a E;
    public final ru.yandex.taxi.masstransit.domain.c F;
    public final wr30 G;
    public final ah00 H;
    public final ru.yandex.taxi.masstransit.userlocation.a I;
    public final k141 J;
    public final r0 K;
    public boolean L;
    public final su30 x;
    public final pf30 y;
    public final MtDetailedRouteAnalyticSource z;

    public c(su30 su30Var, pf30 pf30Var, MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource, MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType, uj30 uj30Var, yw30 yw30Var, zuj0 zuj0Var, ru.yandex.taxi.masstransit.mapper.a aVar, ru.yandex.taxi.masstransit.domain.c cVar, wr30 wr30Var, ah00 ah00Var, ru.yandex.taxi.masstransit.userlocation.a aVar2, k141 k141Var) {
        super(zf30.class);
        this.x = su30Var;
        this.y = pf30Var;
        this.z = mtDetailedRouteAnalyticSource;
        this.A = mtDetailedRouteAnalyticType;
        this.B = uj30Var;
        this.C = yw30Var;
        this.D = zuj0Var;
        this.E = aVar;
        this.F = cVar;
        this.G = wr30Var;
        this.H = ah00Var;
        this.I = aVar2;
        this.J = k141Var;
        this.K = bvf0.c(EmptySet.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(c cVar, Pair pair, Continuation continuation) {
        MtDetailedRoutePresenter$mapUiState$1 mtDetailedRoutePresenter$mapUiState$1;
        int i;
        String str;
        String str2;
        String str3;
        cVar.getClass();
        if (continuation instanceof MtDetailedRoutePresenter$mapUiState$1) {
            mtDetailedRoutePresenter$mapUiState$1 = (MtDetailedRoutePresenter$mapUiState$1) continuation;
            int i2 = mtDetailedRoutePresenter$mapUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtDetailedRoutePresenter$mapUiState$1.label = i2 - Integer.MIN_VALUE;
                MtDetailedRoutePresenter$mapUiState$1 mtDetailedRoutePresenter$mapUiState$12 = mtDetailedRoutePresenter$mapUiState$1;
                Object obj = mtDetailedRoutePresenter$mapUiState$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtDetailedRoutePresenter$mapUiState$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rw30 rw30Var = (rw30) pair.getFirst();
                    Set set = (Set) pair.getSecond();
                    su30 su30Var = rw30Var.a;
                    String h = ((avj0) cVar.D).h(kyh0.mt_header_text_separator);
                    String obj3 = su30Var.c.b.toString();
                    gv30 gv30Var = su30Var.f;
                    String format = String.format("%s-%s", Arrays.copyOf(new Object[]{gv30Var.a, gv30Var.b}, 2));
                    if (obj3.length() > 0 && format.length() != 0) {
                        str = oyr.q(obj3, " ", h, " ", format);
                    } else if (obj3.length() > 0) {
                        str2 = obj3;
                        ru.yandex.taxi.masstransit.mapper.a aVar = cVar.E;
                        pd01 pd01Var = rw30Var.f;
                        oov0 oov0Var = pd01Var.b;
                        ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar2 = rw30Var.h;
                        boolean z = pd01Var.a;
                        mtDetailedRoutePresenter$mapUiState$12.L$0 = null;
                        mtDetailedRoutePresenter$mapUiState$12.L$1 = null;
                        mtDetailedRoutePresenter$mapUiState$12.L$2 = null;
                        mtDetailedRoutePresenter$mapUiState$12.L$3 = null;
                        mtDetailedRoutePresenter$mapUiState$12.L$4 = null;
                        mtDetailedRoutePresenter$mapUiState$12.L$5 = null;
                        mtDetailedRoutePresenter$mapUiState$12.L$6 = null;
                        mtDetailedRoutePresenter$mapUiState$12.L$7 = null;
                        mtDetailedRoutePresenter$mapUiState$12.L$8 = str2;
                        mtDetailedRoutePresenter$mapUiState$12.label = 1;
                        obj = aVar.f(rw30Var, set, oov0Var, aVar2, z, null, false, mtDetailedRoutePresenter$mapUiState$12);
                        if (obj != obj2) {
                            return obj2;
                        }
                        str3 = str2;
                    } else {
                        str = "";
                    }
                    str2 = str;
                    ru.yandex.taxi.masstransit.mapper.a aVar3 = cVar.E;
                    pd01 pd01Var2 = rw30Var.f;
                    oov0 oov0Var2 = pd01Var2.b;
                    ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar22 = rw30Var.h;
                    boolean z2 = pd01Var2.a;
                    mtDetailedRoutePresenter$mapUiState$12.L$0 = null;
                    mtDetailedRoutePresenter$mapUiState$12.L$1 = null;
                    mtDetailedRoutePresenter$mapUiState$12.L$2 = null;
                    mtDetailedRoutePresenter$mapUiState$12.L$3 = null;
                    mtDetailedRoutePresenter$mapUiState$12.L$4 = null;
                    mtDetailedRoutePresenter$mapUiState$12.L$5 = null;
                    mtDetailedRoutePresenter$mapUiState$12.L$6 = null;
                    mtDetailedRoutePresenter$mapUiState$12.L$7 = null;
                    mtDetailedRoutePresenter$mapUiState$12.L$8 = str2;
                    mtDetailedRoutePresenter$mapUiState$12.label = 1;
                    obj = aVar3.f(rw30Var, set, oov0Var2, aVar22, z2, null, false, mtDetailedRoutePresenter$mapUiState$12);
                    if (obj != obj2) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = (String) mtDetailedRoutePresenter$mapUiState$12.L$8;
                    kotlin.b.b(obj);
                }
                return new yh30(str3, (List) obj);
            }
        }
        mtDetailedRoutePresenter$mapUiState$1 = new MtDetailedRoutePresenter$mapUiState$1(continuation, cVar);
        MtDetailedRoutePresenter$mapUiState$1 mtDetailedRoutePresenter$mapUiState$122 = mtDetailedRoutePresenter$mapUiState$1;
        Object obj4 = mtDetailedRoutePresenter$mapUiState$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtDetailedRoutePresenter$mapUiState$122.label;
        if (i != 0) {
        }
        return new yh30(str3, (List) obj4);
    }

    public static TransportRouteAnalytics$VehicleType Lg(VehicleType vehicleType) {
        int i = vehicleType == null ? -1 : kg30.a[vehicleType.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return TransportRouteAnalytics$VehicleType.Bus;
        }
        if (i == 2) {
            return TransportRouteAnalytics$VehicleType.Aeroexpress;
        }
        if (i == 3) {
            return TransportRouteAnalytics$VehicleType.Suburban;
        }
        w511.b();
        return null;
    }
}
