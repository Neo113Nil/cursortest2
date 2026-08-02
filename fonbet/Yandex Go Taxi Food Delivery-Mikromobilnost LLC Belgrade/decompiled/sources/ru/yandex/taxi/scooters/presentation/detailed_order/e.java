package ru.yandex.taxi.scooters.presentation.detailed_order;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import defpackage.a5o0;
import defpackage.a650;
import defpackage.b5o0;
import defpackage.b64;
import defpackage.byx;
import defpackage.c0g;
import defpackage.c21;
import defpackage.c430;
import defpackage.cyn0;
import defpackage.cyx;
import defpackage.czn0;
import defpackage.dpb;
import defpackage.euo0;
import defpackage.ewn0;
import defpackage.f28;
import defpackage.fva0;
import defpackage.g0o0;
import defpackage.g5o0;
import defpackage.h55;
import defpackage.i6r;
import defpackage.jhn0;
import defpackage.jl40;
import defpackage.ken0;
import defpackage.kwo0;
import defpackage.len0;
import defpackage.lgn0;
import defpackage.m950;
import defpackage.men0;
import defpackage.n5o0;
import defpackage.ndl0;
import defpackage.nen0;
import defpackage.nwo0;
import defpackage.ny61;
import defpackage.nyn0;
import defpackage.oen0;
import defpackage.og9;
import defpackage.p7g;
import defpackage.pen0;
import defpackage.pgn0;
import defpackage.q5z;
import defpackage.qgn0;
import defpackage.qhn0;
import defpackage.r7g;
import defpackage.r7p0;
import defpackage.rx4;
import defpackage.s7g;
import defpackage.sls;
import defpackage.sy60;
import defpackage.tje;
import defpackage.ukn0;
import defpackage.w030;
import defpackage.w511;
import defpackage.wnj;
import defpackage.ysd0;
import defpackage.yvf0;
import defpackage.zuo0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import kotlinx.serialization.json.JsonNull;
import ru.yandex.taxi.common_models.net.map_object.k0;
import ru.yandex.taxi.common_models.net.map_object.m;
import ru.yandex.taxi.common_models.net.map_object.n0;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.data.ScootersParkingSelectionMode;
import ru.yandex.taxi.scooters.data.g;
import ru.yandex.taxi.scooters.data.k;
import ru.yandex.taxi.scooters.data.u;
import ru.yandex.taxi.scooters.experiments.g0;
import ru.yandex.taxi.scooters.presentation.detailed_order.e;
import ru.yandex.taxi.scooters.presentation.route_navigation.ScootersRouteNavigationAnalytics$OpenReason;

/* loaded from: classes6.dex */
public final class e extends h55 {
    public final fva0 D;
    public final ysd0 E;
    public final ukn0 F;
    public final yvf0 G;
    public final u H;
    public final cyx I;
    public final r7g J;
    public final nyn0 K;
    public final yvf0 L;
    public final b5o0 M;
    public final yvf0 N;
    public final k O;
    public final g P;
    public final rx4 Q;
    public final qgn0 R;
    public final ndl0 S;
    public ru.yandex.taxi.scooters.presentation.route_navigation.b T;
    public f28 U;
    public s7g V;
    public pen0 W;

    public e(fva0 fva0Var, ysd0 ysd0Var, ukn0 ukn0Var, yvf0 yvf0Var, u uVar, cyx cyxVar, r7g r7gVar, nyn0 nyn0Var, yvf0 yvf0Var2, b5o0 b5o0Var, yvf0 yvf0Var3, k kVar, g gVar, rx4 rx4Var, qgn0 qgn0Var, ndl0 ndl0Var) {
        super(null);
        this.D = fva0Var;
        this.E = ysd0Var;
        this.F = ukn0Var;
        this.G = yvf0Var;
        this.H = uVar;
        this.I = cyxVar;
        this.J = r7gVar;
        this.K = nyn0Var;
        this.L = yvf0Var2;
        this.M = b5o0Var;
        this.N = yvf0Var3;
        this.O = kVar;
        this.P = gVar;
        this.Q = rx4Var;
        this.R = qgn0Var;
        this.S = ndl0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(e eVar, zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersDetailedOrderRouter$handleSessionSelection$1 scootersDetailedOrderRouter$handleSessionSelection$1;
        Object obj;
        int i;
        eVar.getClass();
        ysd0 ysd0Var = eVar.E;
        if (continuationImpl instanceof ScootersDetailedOrderRouter$handleSessionSelection$1) {
            scootersDetailedOrderRouter$handleSessionSelection$1 = (ScootersDetailedOrderRouter$handleSessionSelection$1) continuationImpl;
            int i2 = scootersDetailedOrderRouter$handleSessionSelection$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailedOrderRouter$handleSessionSelection$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersDetailedOrderRouter$handleSessionSelection$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailedOrderRouter$handleSessionSelection$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var = ((euo0) eVar.Q().M.get()).a;
                    r0Var.getClass();
                    r0Var.m(null, wnj.a);
                    scootersDetailedOrderRouter$handleSessionSelection$1.L$0 = zuo0Var;
                    scootersDetailedOrderRouter$handleSessionSelection$1.label = 1;
                    obj = eVar.T(zuo0Var, scootersDetailedOrderRouter$handleSessionSelection$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zuo0Var = (zuo0) scootersDetailedOrderRouter$handleSessionSelection$1.L$0;
                    kotlin.b.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    eVar.U(zuo0Var, null, null);
                }
                ru.yandex.taxi.map_common.b bVar = (ru.yandex.taxi.map_common.b) ysd0Var;
                bVar.b(k0.class);
                bVar.b(m.class);
                bVar.b(n0.class);
                ru.yandex.taxi.map_common.b bVar2 = (ru.yandex.taxi.map_common.b) ysd0Var;
                bVar2.a(n0.class, new og9(eVar, zuo0Var));
                bVar2.a(k0.class, new b(eVar, zuo0Var));
                bVar2.a(m.class, new a(eVar, zuo0Var));
                return zy11.a;
            }
        }
        scootersDetailedOrderRouter$handleSessionSelection$1 = new ScootersDetailedOrderRouter$handleSessionSelection$1(eVar, continuationImpl);
        obj = scootersDetailedOrderRouter$handleSessionSelection$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailedOrderRouter$handleSessionSelection$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        ru.yandex.taxi.map_common.b bVar3 = (ru.yandex.taxi.map_common.b) ysd0Var;
        bVar3.b(k0.class);
        bVar3.b(m.class);
        bVar3.b(n0.class);
        ru.yandex.taxi.map_common.b bVar22 = (ru.yandex.taxi.map_common.b) ysd0Var;
        bVar22.a(n0.class, new og9(eVar, zuo0Var));
        bVar22.a(k0.class, new b(eVar, zuo0Var));
        bVar22.a(m.class, new a(eVar, zuo0Var));
        return zy11.a;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        this.W = ((lgn0) obj).a;
        tje.N(o(), null, null, new ScootersDetailedOrderRouter$listenToNavigationTrigger$$inlined$collectIn$1(kotlinx.coroutines.flow.e.c(R().a), null, this), 3);
        u uVar = this.H;
        tje.N(o(), null, null, new ScootersDetailedOrderRouter$onAttachoSMiklQ$$inlined$collectLatestIn$1(uVar.a(), null, this), 3);
        ((ewn0) Q().d0.get()).c();
        s7g Q = Q();
        fva0.f(this.D, "ScootersDetailedOrder", PerformanceAnalytics$Type.Loading, 0L, 4);
        ((n5o0) this.S.b).b("Perf.ScootersDetailedOrderModalViewRouter.Launch");
        p7g p7gVar = Q.a;
        i6r i6rVar = p7gVar.a;
        w030 C2 = ((c0g) i6rVar).C2();
        q5z.h(C2);
        fva0 F2 = ((c0g) i6rVar).F2();
        q5z.h(F2);
        z(new ru.yandex.taxi.scooters.presentation.detailed_order.v2.a(C2, F2, p7gVar.z0, (ukn0) p7gVar.p2.get(), p7gVar.i1, (czn0) p7gVar.X0.get(), (g5o0) Q.m.a, Q.A, p7gVar.M, Q.n, p7gVar.d4, p7gVar.Z0, p7gVar.f1, Q.B, (qhn0) Q.S.a, (jhn0) Q.T.a, (nwo0) Q.U.get(), p7gVar.h4, p7gVar.S5, p7gVar.k4, Q.W, new ndl0(12, p7gVar.n())), new pgn0(this));
        m950 m950Var = (m950) this.N.get();
        g0o0 g0o0Var = new g0o0(new d(uVar.a()));
        c21 c21Var = sy60.Q2;
        A(m950Var, g0o0Var, c21Var);
        z((m950) this.L.get(), c21Var);
        ((n5o0) this.R.b).a("Perf.ScootersDetailedOrderRouter.Launch");
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        ewn0 ewn0Var;
        pen0 pen0Var = ((lgn0) obj).a;
        s7g s7gVar = this.V;
        if (s7gVar != null && (ewn0Var = (ewn0) s7gVar.d0.get()) != null) {
            ewn0Var.b();
        }
        ru.yandex.taxi.map_common.b bVar = (ru.yandex.taxi.map_common.b) this.E;
        bVar.b(k0.class);
        bVar.b(m.class);
        bVar.b(n0.class);
        j(dpb.a);
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
    }

    public final s7g Q() {
        s7g s7gVar = this.V;
        if (s7gVar != null) {
            return s7gVar;
        }
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Creating;
        fva0.f(this.D, "ScootersOnTheWayComponent", performanceAnalytics$Type, 0L, 4);
        s7g s7gVar2 = new s7g(this.J.a);
        fva0.b(this.D, "ScootersOnTheWayComponent", performanceAnalytics$Type, null, 4);
        this.V = s7gVar2;
        return s7gVar2;
    }

    public final nwo0 R() {
        return (nwo0) Q().U.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(ContinuationImpl continuationImpl) {
        ScootersDetailedOrderRouter$isParkingNavigationEnabled$1 scootersDetailedOrderRouter$isParkingNavigationEnabled$1;
        int i;
        if (continuationImpl instanceof ScootersDetailedOrderRouter$isParkingNavigationEnabled$1) {
            scootersDetailedOrderRouter$isParkingNavigationEnabled$1 = (ScootersDetailedOrderRouter$isParkingNavigationEnabled$1) continuationImpl;
            int i2 = scootersDetailedOrderRouter$isParkingNavigationEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailedOrderRouter$isParkingNavigationEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDetailedOrderRouter$isParkingNavigationEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailedOrderRouter$isParkingNavigationEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersDetailedOrderRouter$isParkingNavigationEnabled$1.label = 1;
                    obj = this.F.a.b(scootersDetailedOrderRouter$isParkingNavigationEnabled$1);
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
                a650 a650Var = ((g0) obj).g;
                return Boolean.valueOf(a650Var == null && jl40.l(a650Var.b, Boolean.TRUE));
            }
        }
        scootersDetailedOrderRouter$isParkingNavigationEnabled$1 = new ScootersDetailedOrderRouter$isParkingNavigationEnabled$1(this, continuationImpl);
        Object obj2 = scootersDetailedOrderRouter$isParkingNavigationEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailedOrderRouter$isParkingNavigationEnabled$1.label;
        if (i != 0) {
        }
        a650 a650Var2 = ((g0) obj2).g;
        return Boolean.valueOf(a650Var2 == null && jl40.l(a650Var2.b, Boolean.TRUE));
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0072, code lost:
    
        if (r10 == r1) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersDetailedOrderRouter$launchRouteNavigationIfPossible$1 scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1;
        int i;
        final zuo0 zuo0Var2;
        final pen0 pen0Var;
        pen0 men0Var;
        final zuo0 zuo0Var3;
        zzs zzsVar;
        final pen0 pen0Var2;
        if (continuationImpl instanceof ScootersDetailedOrderRouter$launchRouteNavigationIfPossible$1) {
            scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1 = (ScootersDetailedOrderRouter$launchRouteNavigationIfPossible$1) continuationImpl;
            int i2 = scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1.label;
                final int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pen0 pen0Var3 = this.W;
                    if (pen0Var3 == null) {
                        cyn0 b = this.K.b.b();
                        zzs zzsVar2 = b != null ? b.c : null;
                        if (zzsVar2 == null) {
                            zzsVar2 = null;
                        }
                        if (zzsVar2 != null) {
                            men0Var = new men0(zzsVar2);
                            zuo0Var2 = zuo0Var;
                            pen0Var = men0Var;
                            if (pen0Var != null) {
                                return Boolean.FALSE;
                            }
                            if (pen0Var instanceof men0) {
                                final int i4 = 0;
                                tje.N(o(), null, null, new ScootersDetailedOrderRouter$waitForRidingSessionsState$1(this, new sls(this) { // from class: ngn0
                                    public final /* synthetic */ e b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // defpackage.sls
                                    public final Object invoke() {
                                        int i5 = i4;
                                        zy11 zy11Var = zy11.a;
                                        zuo0 zuo0Var4 = zuo0Var2;
                                        pen0 pen0Var4 = pen0Var;
                                        e eVar = this.b;
                                        switch (i5) {
                                            case 0:
                                                eVar.R().a(new kwo0(((men0) pen0Var4).a, ScootersRouteNavigationAnalytics$OpenReason.MULTI_MODAL, zuo0Var4, null));
                                                break;
                                            default:
                                                eVar.R().a(new kwo0(((len0) pen0Var4).a, ScootersRouteNavigationAnalytics$OpenReason.TARIFF_FIX, zuo0Var4, ScootersParkingSelectionMode.FIX));
                                                break;
                                        }
                                        return zy11Var;
                                    }
                                }, zuo0Var2.getSessionId(), null), 3);
                                return Boolean.TRUE;
                            }
                            if (pen0Var instanceof ken0) {
                                R().a(new kwo0(((ken0) pen0Var).a, ScootersRouteNavigationAnalytics$OpenReason.ARBITRARY, zuo0Var2, null));
                                return Boolean.TRUE;
                            }
                            if (!(pen0Var instanceof len0)) {
                                if (pen0Var instanceof oen0) {
                                    R().a(new kwo0(((oen0) pen0Var).a, ScootersRouteNavigationAnalytics$OpenReason.ARBITRARY, zuo0Var2, null));
                                    return Boolean.TRUE;
                                }
                                if (pen0Var instanceof nen0) {
                                    b64.D(pen0Var);
                                    throw null;
                                }
                                w511.b();
                                return null;
                            }
                            scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1.L$0 = zuo0Var2;
                            scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1.L$1 = pen0Var;
                            scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1.label = 2;
                            Object S = S(scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1);
                            if (S != obj2) {
                                zuo0Var3 = zuo0Var2;
                                obj = S;
                                pen0Var2 = pen0Var;
                                if (((Boolean) obj).booleanValue()) {
                                }
                                return Boolean.FALSE;
                            }
                            return obj2;
                        }
                        String sessionId = zuo0Var.getSessionId();
                        scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1.L$0 = zuo0Var;
                        scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1.label = 1;
                        obj = this.O.a(sessionId, scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1);
                    } else {
                        zuo0Var2 = zuo0Var;
                        pen0Var = pen0Var3;
                        if (pen0Var != null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj3 = scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1.L$1;
                        zuo0Var3 = (zuo0) scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1.L$0;
                        kotlin.b.b(obj);
                        pen0Var2 = obj3;
                        if (((Boolean) obj).booleanValue()) {
                            tje.N(o(), null, null, new ScootersDetailedOrderRouter$waitForRidingSessionsState$1(this, new sls(this) { // from class: ngn0
                                public final /* synthetic */ e b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i5 = i3;
                                    zy11 zy11Var = zy11.a;
                                    zuo0 zuo0Var4 = zuo0Var3;
                                    pen0 pen0Var4 = pen0Var2;
                                    e eVar = this.b;
                                    switch (i5) {
                                        case 0:
                                            eVar.R().a(new kwo0(((men0) pen0Var4).a, ScootersRouteNavigationAnalytics$OpenReason.MULTI_MODAL, zuo0Var4, null));
                                            break;
                                        default:
                                            eVar.R().a(new kwo0(((len0) pen0Var4).a, ScootersRouteNavigationAnalytics$OpenReason.TARIFF_FIX, zuo0Var4, ScootersParkingSelectionMode.FIX));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            }, zuo0Var3.getSessionId(), null), 3);
                        }
                        return Boolean.FALSE;
                    }
                    zuo0Var = (zuo0) scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1.L$0;
                    kotlin.b.b(obj);
                }
                zzsVar = (zzs) obj;
                if (zzsVar == null) {
                    zzsVar = null;
                }
                if (zzsVar == null) {
                    men0Var = new oen0(zzsVar);
                    zuo0Var2 = zuo0Var;
                    pen0Var = men0Var;
                    if (pen0Var != null) {
                    }
                } else {
                    zuo0Var2 = zuo0Var;
                    pen0Var = null;
                    if (pen0Var != null) {
                    }
                }
            }
        }
        scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1 = new ScootersDetailedOrderRouter$launchRouteNavigationIfPossible$1(this, continuationImpl);
        Object obj4 = scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailedOrderRouter$launchRouteNavigationIfPossible$1.label;
        final int i32 = 1;
        if (i != 0) {
        }
        zzsVar = (zzs) obj4;
        if (zzsVar == null) {
        }
        if (zzsVar == null) {
        }
    }

    public final void U(zuo0 zuo0Var, zzs zzsVar, ScootersParkingSelectionMode scootersParkingSelectionMode) {
        String sessionId = zuo0Var.getSessionId();
        r7p0 number = zuo0Var.getNumber();
        boolean z = this.T != null;
        b5o0 b5o0Var = this.M;
        b5o0Var.getClass();
        this.I.b(new byx(Screen.TOTW, new c430(Mode.SCOOTERS, (kotlinx.serialization.json.b) null, new a5o0(sessionId, number, zzsVar, b5o0Var, scootersParkingSelectionMode, z, JsonNull.INSTANCE))));
    }
}
