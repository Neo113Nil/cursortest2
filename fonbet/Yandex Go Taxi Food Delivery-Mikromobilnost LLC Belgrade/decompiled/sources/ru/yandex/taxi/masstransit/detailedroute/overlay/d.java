package ru.yandex.taxi.masstransit.detailedroute.overlay;

import com.yandex.mapkit.geometry.Point;
import defpackage.a3v;
import defpackage.ad5;
import defpackage.ah00;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.cl7;
import defpackage.dg30;
import defpackage.dvw;
import defpackage.fay0;
import defpackage.g92;
import defpackage.hf30;
import defpackage.hj40;
import defpackage.i8m;
import defpackage.ike;
import defpackage.j18;
import defpackage.kf30;
import defpackage.mz30;
import defpackage.ny61;
import defpackage.su30;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.vj;
import defpackage.wj;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.experiment.d0;
import ru.yandex.taxi.masstransit.overlay.onmap.i;

/* loaded from: classes6.dex */
public final class d extends ad5 {
    public final kf30 A;
    public final mz30 B;
    public final boolean C;
    public final tpr D;
    public final boolean E;
    public final ah00 F;
    public final tt2 G;
    public final a3v H;
    public final i I;
    public final ru.yandex.taxi.masstransit.detailedroute.interactor.a J;
    public final d0 K;
    public final r0 L;
    public final su30 x;
    public final su30 y;
    public final fay0 z;

    public d(su30 su30Var, su30 su30Var2, fay0 fay0Var, kf30 kf30Var, mz30 mz30Var, boolean z, tpr tprVar, boolean z2, ah00 ah00Var, tt2 tt2Var, a3v a3vVar, i iVar, ru.yandex.taxi.masstransit.detailedroute.interactor.a aVar, d0 d0Var) {
        super(dg30.class);
        this.x = su30Var;
        this.y = su30Var2;
        this.z = fay0Var;
        this.A = kf30Var;
        this.B = mz30Var;
        this.C = z;
        this.D = tprVar;
        this.E = z2;
        this.F = ah00Var;
        this.G = tt2Var;
        this.H = a3vVar;
        this.I = iVar;
        this.J = aVar;
        this.K = d0Var;
        this.L = bvf0.c(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r11v4, types: [T, i8m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Kg(hf30 hf30Var, ContinuationImpl continuationImpl) {
        MtDetailedRouteOverlayPresenter$trackScheduleVehicle$1 mtDetailedRouteOverlayPresenter$trackScheduleVehicle$1;
        int i;
        if (continuationImpl instanceof MtDetailedRouteOverlayPresenter$trackScheduleVehicle$1) {
            mtDetailedRouteOverlayPresenter$trackScheduleVehicle$1 = (MtDetailedRouteOverlayPresenter$trackScheduleVehicle$1) continuationImpl;
            int i2 = mtDetailedRouteOverlayPresenter$trackScheduleVehicle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtDetailedRouteOverlayPresenter$trackScheduleVehicle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtDetailedRouteOverlayPresenter$trackScheduleVehicle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtDetailedRouteOverlayPresenter$trackScheduleVehicle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mtDetailedRouteOverlayPresenter$trackScheduleVehicle$1.L$0 = hf30Var;
                    mtDetailedRouteOverlayPresenter$trackScheduleVehicle$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(mtDetailedRouteOverlayPresenter$trackScheduleVehicle$1));
                    Ref$ObjectRef y = b64.y(j18Var);
                    vj vjVar = new vj(19, y);
                    cl7 cl7Var = new cl7(j18Var, vjVar);
                    hj40 hj40Var = hf30Var.a.a;
                    Point point = hj40Var != null ? hj40Var.d : null;
                    c cVar = new c(new n(this.B.b, new MtDetailedRouteOverlayPresenter$trackScheduleVehicle$2$vehicleIdFlow$1(hf30Var, null)));
                    ike ikeVar = (ike) Jg();
                    i iVar = this.I;
                    iVar.getClass();
                    iVar.b(ikeVar, cVar, new g92(2, point));
                    y.element = new i8m(29, this);
                    if (cl7Var.c()) {
                        vjVar.invoke();
                    } else {
                        j18Var.w(new wj(cl7Var, 19));
                    }
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        mtDetailedRouteOverlayPresenter$trackScheduleVehicle$1 = new MtDetailedRouteOverlayPresenter$trackScheduleVehicle$1(this, continuationImpl);
        Object obj2 = mtDetailedRouteOverlayPresenter$trackScheduleVehicle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtDetailedRouteOverlayPresenter$trackScheduleVehicle$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
