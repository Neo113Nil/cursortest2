package ru.yandex.taxi.scooters.presentation.route_navigation;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.navigation.transport.Navigation;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.buo0;
import defpackage.ehs0;
import defpackage.euo0;
import defpackage.fva0;
import defpackage.gh00;
import defpackage.j4u;
import defpackage.mo21;
import defpackage.ney;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qc5;
import defpackage.qto0;
import defpackage.v0o0;
import defpackage.vam0;
import defpackage.w511;
import defpackage.wnj;
import defpackage.wto0;
import defpackage.zuo0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.navigation.single_guidance_coordinator.GuidanceOwnerId;
import ru.yandex.taxi.preorder.source.userposition.e;
import ru.yandex.taxi.scooters.data.k;
import ru.yandex.taxi.scooters.domain.ScootersDetailedOrderFocusInteractor$FocusType;
import ru.yandex.taxi.scooters.domain.g;

/* loaded from: classes6.dex */
public final class a extends qc5 {
    public final ah00 A;
    public final a3v B;
    public final fva0 C;
    public final po21 D;
    public final ehs0 E;
    public final qto0 F;
    public final ru.yandex.taxi.scooters.presentation.route_navigation.domain.a G;
    public final g H;
    public final euo0 I;
    public final k J;
    public final v0o0 K;
    public final zzs L;
    public final vam0 M;
    public final zuo0 N;

    public a(ney neyVar, ah00 ah00Var, a3v a3vVar, fva0 fva0Var, po21 po21Var, ehs0 ehs0Var, qto0 qto0Var, ru.yandex.taxi.scooters.presentation.route_navigation.domain.a aVar, g gVar, euo0 euo0Var, k kVar, v0o0 v0o0Var, zzs zzsVar, vam0 vam0Var, zuo0 zuo0Var) {
        super(wto0.class, neyVar);
        this.A = ah00Var;
        this.B = a3vVar;
        this.C = fva0Var;
        this.D = po21Var;
        this.E = ehs0Var;
        this.F = qto0Var;
        this.G = aVar;
        this.H = gVar;
        this.I = euo0Var;
        this.J = kVar;
        this.K = v0o0Var;
        this.L = zzsVar;
        this.M = vam0Var;
        this.N = zuo0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        if (kotlinx.coroutines.a.i(500, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Mg(a aVar, Navigation navigation, ScootersDetailedOrderFocusInteractor$FocusType scootersDetailedOrderFocusInteractor$FocusType, ContinuationImpl continuationImpl) {
        ScootersRouteNavigationPresenter$onFocusTypeChanged$1 scootersRouteNavigationPresenter$onFocusTypeChanged$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        CameraPosition cameraPosition;
        Location location;
        ah00 ah00Var;
        Object h;
        CameraPosition cameraPosition2;
        Location location2;
        ah00 ah00Var2;
        Double heading;
        aVar.getClass();
        if (continuationImpl instanceof ScootersRouteNavigationPresenter$onFocusTypeChanged$1) {
            scootersRouteNavigationPresenter$onFocusTypeChanged$1 = (ScootersRouteNavigationPresenter$onFocusTypeChanged$1) continuationImpl;
            int i2 = scootersRouteNavigationPresenter$onFocusTypeChanged$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersRouteNavigationPresenter$onFocusTypeChanged$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersRouteNavigationPresenter$onFocusTypeChanged$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersRouteNavigationPresenter$onFocusTypeChanged$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = buo0.a[scootersDetailedOrderFocusInteractor$FocusType.ordinal()];
                    if (i3 == 1) {
                        ((wto0) aVar.Dg()).j5();
                        return zy11.a;
                    }
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    cameraPosition = ((gh00) aVar.A).e.c;
                    ((wto0) aVar.Dg()).p9();
                    scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$0 = navigation;
                    scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$1 = null;
                    scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$2 = cameraPosition;
                    scootersRouteNavigationPresenter$onFocusTypeChanged$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        aVar = (a) scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$5;
                        ah00Var2 = (ah00) scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$4;
                        location2 = (Location) scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$3;
                        cameraPosition2 = (CameraPosition) scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$2;
                        kotlin.b.b(obj);
                        mo21 mo21Var = (mo21) obj;
                        aVar.getClass();
                        Point position = new Point(mo21Var.a, mo21Var.b);
                        ah00Var = ah00Var2;
                        location = location2;
                        cameraPosition = cameraPosition2;
                        ((gh00) ah00Var).g.k(new CameraPosition(position, 19.0f, (location != null || (heading = location.getHeading()) == null) ? 0.0f : (float) heading.doubleValue(), cameraPosition.getTilt()), 400.0f, Animation.Type.LINEAR, null);
                        return zy11.a;
                    }
                    CameraPosition cameraPosition3 = (CameraPosition) scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$2;
                    Navigation navigation2 = (Navigation) scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$0;
                    kotlin.b.b(obj);
                    cameraPosition = cameraPosition3;
                    navigation = navigation2;
                }
                location = navigation.getGuidance().getLocation();
                ah00Var = aVar.A;
                if (location != null || (position = location.getPosition()) == null) {
                    po21 po21Var = aVar.D;
                    scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$0 = null;
                    scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$1 = null;
                    scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$2 = cameraPosition;
                    scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$3 = location;
                    scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$4 = ah00Var;
                    scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$5 = aVar;
                    scootersRouteNavigationPresenter$onFocusTypeChanged$1.label = 2;
                    h = ((e) po21Var).h(scootersRouteNavigationPresenter$onFocusTypeChanged$1);
                    if (h != coroutineSingletons) {
                        cameraPosition2 = cameraPosition;
                        location2 = location;
                        ah00Var2 = ah00Var;
                        obj = h;
                        mo21 mo21Var2 = (mo21) obj;
                        aVar.getClass();
                        Point position2 = new Point(mo21Var2.a, mo21Var2.b);
                        ah00Var = ah00Var2;
                        location = location2;
                        cameraPosition = cameraPosition2;
                    }
                    return coroutineSingletons;
                }
                ((gh00) ah00Var).g.k(new CameraPosition(position2, 19.0f, (location != null || (heading = location.getHeading()) == null) ? 0.0f : (float) heading.doubleValue(), cameraPosition.getTilt()), 400.0f, Animation.Type.LINEAR, null);
                return zy11.a;
            }
        }
        scootersRouteNavigationPresenter$onFocusTypeChanged$1 = new ScootersRouteNavigationPresenter$onFocusTypeChanged$1(aVar, continuationImpl);
        Object obj2 = scootersRouteNavigationPresenter$onFocusTypeChanged$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRouteNavigationPresenter$onFocusTypeChanged$1.label;
        if (i != 0) {
        }
        location = navigation.getGuidance().getLocation();
        ah00Var = aVar.A;
        if (location != null) {
        }
        po21 po21Var2 = aVar.D;
        scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$0 = null;
        scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$1 = null;
        scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$2 = cameraPosition;
        scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$3 = location;
        scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$4 = ah00Var;
        scootersRouteNavigationPresenter$onFocusTypeChanged$1.L$5 = aVar;
        scootersRouteNavigationPresenter$onFocusTypeChanged$1.label = 2;
        h = ((e) po21Var2).h(scootersRouteNavigationPresenter$onFocusTypeChanged$1);
        if (h != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Ng(a aVar, ContinuationImpl continuationImpl) {
        ScootersRouteNavigationPresenter$waitForCancellation$1 scootersRouteNavigationPresenter$waitForCancellation$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof ScootersRouteNavigationPresenter$waitForCancellation$1) {
            scootersRouteNavigationPresenter$waitForCancellation$1 = (ScootersRouteNavigationPresenter$waitForCancellation$1) continuationImpl;
            int i2 = scootersRouteNavigationPresenter$waitForCancellation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersRouteNavigationPresenter$waitForCancellation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersRouteNavigationPresenter$waitForCancellation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersRouteNavigationPresenter$waitForCancellation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var = aVar.I.a;
                    ScootersRouteNavigationPresenter$waitForCancellation$2 scootersRouteNavigationPresenter$waitForCancellation$2 = new ScootersRouteNavigationPresenter$waitForCancellation$2(2, null);
                    scootersRouteNavigationPresenter$waitForCancellation$1.label = 1;
                    if (kotlinx.coroutines.flow.e.x(r0Var, scootersRouteNavigationPresenter$waitForCancellation$2, scootersRouteNavigationPresenter$waitForCancellation$1) == coroutineSingletons) {
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
        scootersRouteNavigationPresenter$waitForCancellation$1 = new ScootersRouteNavigationPresenter$waitForCancellation$1(aVar, continuationImpl);
        Object obj2 = scootersRouteNavigationPresenter$waitForCancellation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRouteNavigationPresenter$waitForCancellation$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        r0 r0Var = this.I.a;
        r0Var.getClass();
        r0Var.m(null, wnj.a);
        qto0 qto0Var = this.F;
        Navigation navigation = qto0Var.a;
        if (navigation != null) {
            navigation.stopGuidance();
        }
        qto0Var.a = null;
        GuidanceOwnerId guidanceOwnerId = GuidanceOwnerId.SCOOTERS_NAVIGATION;
        ehs0 ehs0Var = this.E;
        j4u j4uVar = ehs0Var.a;
        if (guidanceOwnerId != (j4uVar != null ? j4uVar.getId() : null)) {
            return;
        }
        ehs0Var.a = null;
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Fg() {
        super.Fg();
        Navigation navigation = this.F.a;
        if (navigation != null) {
            navigation.suspend();
        }
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        Navigation navigation = this.F.a;
        if (navigation != null) {
            navigation.resume();
        }
    }
}
