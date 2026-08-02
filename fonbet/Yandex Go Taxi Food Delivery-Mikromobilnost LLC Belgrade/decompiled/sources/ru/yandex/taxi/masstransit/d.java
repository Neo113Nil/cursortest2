package ru.yandex.taxi.masstransit;

import android.net.Uri;
import com.yandex.go.masstransit.sdk.ble.api.analytics.BleVehiclesScreenOpenReason;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.analytics.HubOpenReason;
import com.yandex.payment.common.result.ResultType;
import defpackage.a010;
import defpackage.a36;
import defpackage.ae30;
import defpackage.ah00;
import defpackage.an30;
import defpackage.as6;
import defpackage.b010;
import defpackage.b0x0;
import defpackage.b4l0;
import defpackage.bgc;
import defpackage.bi30;
import defpackage.bn30;
import defpackage.c010;
import defpackage.c0g;
import defpackage.c4l0;
import defpackage.cw30;
import defpackage.d4l0;
import defpackage.dab1;
import defpackage.dmb;
import defpackage.dp30;
import defpackage.dyx;
import defpackage.dz00;
import defpackage.e210;
import defpackage.e310;
import defpackage.e4l0;
import defpackage.evu0;
import defpackage.f010;
import defpackage.fp30;
import defpackage.h3y;
import defpackage.hi30;
import defpackage.hre0;
import defpackage.hxx;
import defpackage.i140;
import defpackage.i3g;
import defpackage.i3y;
import defpackage.i6r;
import defpackage.igu0;
import defpackage.in30;
import defpackage.j140;
import defpackage.je30;
import defpackage.jj3;
import defpackage.k1j0;
import defpackage.lx4;
import defpackage.lz30;
import defpackage.m010;
import defpackage.m950;
import defpackage.mz00;
import defpackage.na1;
import defpackage.neg0;
import defpackage.nv20;
import defpackage.ny61;
import defpackage.nz00;
import defpackage.oeg0;
import defpackage.oep0;
import defpackage.p1j0;
import defpackage.pep0;
import defpackage.pho;
import defpackage.pj40;
import defpackage.pq30;
import defpackage.pw2;
import defpackage.pzt0;
import defpackage.q1j0;
import defpackage.q210;
import defpackage.q5z;
import defpackage.qse0;
import defpackage.qtb1;
import defpackage.qu;
import defpackage.qzj0;
import defpackage.rn00;
import defpackage.rq30;
import defpackage.rqo;
import defpackage.s111;
import defpackage.si30;
import defpackage.sls;
import defpackage.sme0;
import defpackage.sq30;
import defpackage.sy00;
import defpackage.sy60;
import defpackage.tj70;
import defpackage.tje;
import defpackage.tls;
import defpackage.tq30;
import defpackage.tse;
import defpackage.tu30;
import defpackage.tz00;
import defpackage.um3;
import defpackage.um30;
import defpackage.uz00;
import defpackage.vm30;
import defpackage.w511;
import defpackage.wm30;
import defpackage.wq30;
import defpackage.wz00;
import defpackage.x740;
import defpackage.xga0;
import defpackage.xm30;
import defpackage.xq30;
import defpackage.xyz;
import defpackage.xz00;
import defpackage.ym30;
import defpackage.yq30;
import defpackage.ysd0;
import defpackage.yvf0;
import defpackage.zm30;
import defpackage.zy11;
import defpackage.zz00;
import defpackage.zzs;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;
import ru.yandex.taxi.common_models.net.map_object.t;
import ru.yandex.taxi.masstransit.address.interactor.i;
import ru.yandex.taxi.masstransit.analytic.TransportMainAnalytics$TransportMainScreenType;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutScreenOpenReason;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$RouteOptionsScreenOpenReason;
import ru.yandex.taxi.masstransit.model.MtCheckoutDeeplinkStatus;
import ru.yandex.taxi.masstransit.model.MtInitState$GeoPayment;
import ru.yandex.taxi.perf.screen.PerformanceScreenName;

/* loaded from: classes6.dex */
public final class d extends BaseRootNavigationRouter implements nz00 {
    public final tse D;
    public final ru.yandex.taxi.layers.b E;
    public final h3y F;
    public final i G;
    public final oep0 H;
    public final h3y I;
    public final i6r J;
    public final rqo K;
    public final dyx L;
    public final ysd0 M;
    public final dz00 N;
    public final ru.yandex.taxi.deeplinks.b O;
    public final h3y P;
    public final h3y Q;
    public final yvf0 R;
    public final yvf0 S;
    public final h3y T;
    public final ru.yandex.taxi.perf.screen.c U;
    public final com.yandex.go.taxi.tariffs.interactor.b V;
    public final q210 W;
    public final ru.yandex.taxi.masstransit.geopayment.b Z;
    public final tj70 a0;
    public final x740 b0;
    public e310 e0;
    public ru.yandex.taxi.masstransit.router.e f0;
    public sq30 g0;
    public pzt0 h0;
    public final BaseRootNavigationRouter.a c0 = new BaseRootNavigationRouter.a(Screen.TRANSPORT_MAIN, BaseRootNavigationRouter.Background.MAP, null, 12);
    public final i3y d0 = kotlin.a.a(new xyz(13, this));
    public MtInitState$GeoPayment.ExitBehavior i0 = MtInitState$GeoPayment.ExitBehavior.OpenTransportMain;

    public d(tse tseVar, ru.yandex.taxi.layers.b bVar, h3y h3yVar, pw2 pw2Var, i iVar, oep0 oep0Var, h3y h3yVar2, i6r i6rVar, rqo rqoVar, dyx dyxVar, ysd0 ysd0Var, dz00 dz00Var, s111 s111Var, ru.yandex.taxi.deeplinks.b bVar2, h3y h3yVar3, h3y h3yVar4, yvf0 yvf0Var, yvf0 yvf0Var2, lz30 lz30Var, h3y h3yVar5, ru.yandex.taxi.perf.screen.c cVar, com.yandex.go.taxi.tariffs.interactor.b bVar3, q210 q210Var, ru.yandex.taxi.masstransit.geopayment.b bVar4, tj70 tj70Var, x740 x740Var) {
        this.D = tseVar;
        this.E = bVar;
        this.F = h3yVar;
        this.G = iVar;
        this.H = oep0Var;
        this.I = h3yVar2;
        this.J = i6rVar;
        this.K = rqoVar;
        this.L = dyxVar;
        this.M = ysd0Var;
        this.N = dz00Var;
        this.O = bVar2;
        this.P = h3yVar3;
        this.Q = h3yVar4;
        this.R = yvf0Var;
        this.S = yvf0Var2;
        this.T = h3yVar5;
        this.U = cVar;
        this.V = bVar3;
        this.W = q210Var;
        this.Z = bVar4;
        this.a0 = tj70Var;
        this.b0 = x740Var;
    }

    public static final void Q(d dVar, sq30 sq30Var) {
        tje.N(dVar.o(), null, null, new MassTransitModeRouterImpl$dismissAndOpenSummary$1(dVar, sq30Var, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r12v0, types: [h55, java.lang.Object, ru.yandex.taxi.masstransit.d] */
    /* JADX WARN: Type inference failed for: r2v33, types: [e310] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object R(d dVar, i3g i3gVar, bn30 bn30Var, ContinuationImpl continuationImpl) {
        MassTransitModeRouterImpl$onMassTransitLaunch$1 massTransitModeRouterImpl$onMassTransitLaunch$1;
        int i;
        xga0 xga0Var;
        i3g i3gVar2;
        e210 a;
        dVar.getClass();
        if (continuationImpl instanceof MassTransitModeRouterImpl$onMassTransitLaunch$1) {
            massTransitModeRouterImpl$onMassTransitLaunch$1 = (MassTransitModeRouterImpl$onMassTransitLaunch$1) continuationImpl;
            int i2 = massTransitModeRouterImpl$onMassTransitLaunch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                massTransitModeRouterImpl$onMassTransitLaunch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = massTransitModeRouterImpl$onMassTransitLaunch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = massTransitModeRouterImpl$onMassTransitLaunch$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (bn30Var instanceof vm30) {
                        dVar.U.g(PerformanceScreenName.TransportDiscovery);
                        dVar.c0(i3gVar);
                        c0g c0gVar = (c0g) i3gVar.a;
                        ah00 B = c0gVar.B();
                        q5z.h(B);
                        tu30 tu30Var = (tu30) c0gVar.z.Yl.get();
                        q5z.h(tu30Var);
                        b0x0 b0x0Var = (b0x0) c0gVar.Ci.get();
                        q5z.h(b0x0Var);
                        ru.yandex.taxi.masstransit.discovery.a aVar = new ru.yandex.taxi.masstransit.discovery.a(B, tu30Var, b0x0Var);
                        massTransitModeRouterImpl$onMassTransitLaunch$1.L$0 = null;
                        massTransitModeRouterImpl$onMassTransitLaunch$1.L$1 = null;
                        massTransitModeRouterImpl$onMassTransitLaunch$1.label = 1;
                        Object a2 = aVar.a(massTransitModeRouterImpl$onMassTransitLaunch$1);
                        if (a2 != coroutineSingletons) {
                            return a2;
                        }
                    } else {
                        boolean z = bn30Var instanceof um30;
                        wq30 wq30Var = wq30.a;
                        if (z) {
                            um30 um30Var = (um30) bn30Var;
                            dVar.X(i3gVar, um30Var.a, um30Var.b, um30Var.c, null, um30Var.d, TransportPaymentAnalytics$CheckoutScreenOpenReason.Deeplink, wq30Var, um30Var.e);
                            return zy11Var;
                        }
                        if (bn30Var instanceof xm30) {
                            dVar.a0(i3gVar, wq30Var);
                            return zy11Var;
                        }
                        if (!(bn30Var instanceof MtInitState$GeoPayment)) {
                            if (bn30Var instanceof zm30) {
                                dVar.V(i3gVar, ((zm30) bn30Var).a, new bgc(12));
                                return zy11Var;
                            }
                            if (bn30Var instanceof ym30) {
                                ym30 ym30Var = (ym30) bn30Var;
                                dVar.U(i3gVar, ym30Var.d, new c4l0(ym30Var.a, ym30Var.b, ym30Var.c));
                                return zy11Var;
                            }
                            if (bn30Var instanceof wm30) {
                                dVar.U(i3gVar, null, new b4l0(((wm30) bn30Var).a));
                                return zy11Var;
                            }
                            if (!(bn30Var instanceof an30)) {
                                w511.b();
                                return null;
                            }
                            an30 an30Var = (an30) bn30Var;
                            dVar.U(i3gVar, null, new d4l0(an30Var.a, an30Var.b));
                            return zy11Var;
                        }
                        MtInitState$GeoPayment mtInitState$GeoPayment = (MtInitState$GeoPayment) bn30Var;
                        dVar.i0 = mtInitState$GeoPayment.a;
                        cw30 cw30Var = (cw30) i3gVar.M.get();
                        TransportPaymentAnalytics$RouteOptionsScreenOpenReason transportPaymentAnalytics$RouteOptionsScreenOpenReason = TransportPaymentAnalytics$RouteOptionsScreenOpenReason.Deeplink;
                        pj40 pj40Var = mtInitState$GeoPayment.b;
                        cw30Var.a = transportPaymentAnalytics$RouteOptionsScreenOpenReason;
                        cw30Var.b = pj40Var;
                        xga0Var = (xga0) dVar.a0.get();
                        dVar.D(xga0Var, zy11Var, sy60.Q2);
                        ru.yandex.taxi.masstransit.geopayment.b bVar = dVar.Z;
                        massTransitModeRouterImpl$onMassTransitLaunch$1.L$0 = i3gVar;
                        massTransitModeRouterImpl$onMassTransitLaunch$1.L$1 = null;
                        massTransitModeRouterImpl$onMassTransitLaunch$1.L$2 = xga0Var;
                        massTransitModeRouterImpl$onMassTransitLaunch$1.label = 2;
                        if (bVar.a(massTransitModeRouterImpl$onMassTransitLaunch$1) != coroutineSingletons) {
                            i3gVar2 = i3gVar;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xga0 xga0Var2 = (xga0) massTransitModeRouterImpl$onMassTransitLaunch$1.L$2;
                ?? r2 = (e310) massTransitModeRouterImpl$onMassTransitLaunch$1.L$0;
                kotlin.b.b(obj);
                xga0Var = xga0Var2;
                i3gVar2 = r2;
                a = dVar.W.a();
                if (a != null) {
                    xga0Var.i();
                    dVar.r(new qu(9));
                    return zy11Var;
                }
                pj40 pj40Var2 = i3gVar2.c;
                Z(dVar, i3gVar2, a, new a36(BleVehiclesScreenOpenReason.Deeplink, pj40Var2.a, pj40Var2.b), 4);
                return zy11Var;
            }
        }
        massTransitModeRouterImpl$onMassTransitLaunch$1 = new MassTransitModeRouterImpl$onMassTransitLaunch$1(dVar, continuationImpl);
        Object obj2 = massTransitModeRouterImpl$onMassTransitLaunch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = massTransitModeRouterImpl$onMassTransitLaunch$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        a = dVar.W.a();
        if (a != null) {
        }
    }

    public static final void S(d dVar, sq30 sq30Var) {
        HubOpenReason hubOpenReason;
        if (sq30Var instanceof pq30) {
            dVar.getClass();
            hubOpenReason = HubOpenReason.STOP_MODAL;
        } else {
            hubOpenReason = dVar.g0 instanceof rq30 ? HubOpenReason.SUPERAPP_DISCOVERY_MAP : HubOpenReason.ROUTE_INPUT;
        }
        ((nv20) dVar.P.get()).a(hubOpenReason);
    }

    public static void Z(final d dVar, final e310 e310Var, final e210 e210Var, final a36 a36Var, int i) {
        if ((i & 2) != 0) {
            a36Var = new a36(BleVehiclesScreenOpenReason.MasstransitMain, null, null);
        }
        ((jj3) dVar.F.get()).c(new um3(Events$Zalogin$LoginContext.MASSTRANSIT, new qzj0(null, new tls() { // from class: ru.yandex.taxi.masstransit.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                Object value = ((Result) obj).getValue();
                boolean z = value instanceof Result.Failure;
                d dVar2 = d.this;
                e310 e310Var2 = e310Var;
                if (!z) {
                    tje.N(dVar2.o(), null, null, new MassTransitModeRouterImpl$openGeoPaymentFlow$1(e210Var, e310Var2, dVar2, a36Var, k1j0.a, null), 3);
                }
                if (Result.a(value) != null) {
                    dVar2.c0(e310Var2);
                }
                return zy11.a;
            }
        }), false, false, 28));
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        ru.yandex.taxi.masstransit.router.e eVar = this.f0;
        if (eVar != null) {
            eVar.c(true);
        }
        ((ru.yandex.taxi.map_common.b) this.M).a(t.class, new b(this));
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        ru.yandex.taxi.masstransit.router.e eVar = this.f0;
        if (eVar != null) {
            eVar.c(false);
        }
        ((ru.yandex.taxi.map_common.b) this.M).b(t.class);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.h0 = tje.N(this.D, null, null, new MassTransitModeRouterImpl$onDismiss$1(this, null), 3);
        ru.yandex.taxi.masstransit.router.e eVar = this.f0;
        if (eVar != null) {
            eVar.a();
            sy00 sy00Var = eVar.a;
            lx4 lx4Var = sy00Var.a;
            ((j) lx4Var).m.o.remove(sy00Var.g);
            m010 m010Var = eVar.g;
            m010Var.c.b();
            rn00 rn00Var = eVar.l;
            rn00Var.a.remove(MapObjectType.STOP);
            m010Var.e.remove(eVar.i);
        }
        this.f0 = null;
        this.e0 = null;
        this.g0 = null;
        this.i0 = MtInitState$GeoPayment.ExitBehavior.OpenTransportMain;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        mz00 mz00Var = (mz00) obj;
        this.g0 = (sq30) ((tq30) this.I.get()).a.getValue();
        tje.N(o(), null, CoroutineStart.UNDISPATCHED, new MassTransitModeRouterImpl$onLaunch$1(this, mz00Var.c, mz00Var, null), 1);
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.c0;
    }

    public final void T(e310 e310Var, String str) {
        i3g i3gVar = (i3g) e310Var;
        ru.yandex.taxi.masstransit.geopayment.linkcard.a d = i3gVar.d();
        in30 in30Var = d.c;
        if (in30Var != null) {
            String lowerCase = evu0.k0(str).toString().toLowerCase(Locale.ROOT);
            if (lowerCase.equals("success") || lowerCase.equals(ResultType.RESULT_TYPE_FAILURE) || lowerCase.equals("cancel")) {
                d.c(evu0.k0(str).toString(), in30Var);
                return;
            }
        }
        C((defpackage.t) i3gVar.p0.get(), new wz00(this, 0));
    }

    public final void U(e310 e310Var, zzs zzsVar, e4l0 e4l0Var) {
        i3g i3gVar = (i3g) e310Var;
        D((fp30) i3gVar.f.get(), new dp30(zzsVar, new j140(null, e4l0Var)), new tz00(this.L.a().b.a, this, i3gVar));
    }

    public final void V(e310 e310Var, igu0 igu0Var, sls slsVar) {
        i3g i3gVar = (i3g) e310Var;
        D((fp30) i3gVar.f.get(), new dp30(igu0Var.b, new i140(igu0Var)), new uz00(this, igu0Var, slsVar, this.L.a().b.a, i3gVar));
    }

    public final void W(qse0 qse0Var, String str) {
        ((pep0) this.H).f((m950) this.R.get(), new hre0(qtb1.M, qse0Var, str, false, dab1.b), hxx.a);
    }

    public final void X(e310 e310Var, String str, String str2, String str3, Object obj, pj40 pj40Var, TransportPaymentAnalytics$CheckoutScreenOpenReason transportPaymentAnalytics$CheckoutScreenOpenReason, yq30 yq30Var, MtCheckoutDeeplinkStatus mtCheckoutDeeplinkStatus) {
        boolean z = (yq30Var instanceof xq30) && ((xq30) yq30Var).b;
        ru.yandex.taxi.masstransit.geopayment.checkout.a aVar = (ru.yandex.taxi.masstransit.geopayment.checkout.a) this.S.get();
        B(aVar, zy11.a, new xz00(z, aVar, str2, str3, this, e310Var, transportPaymentAnalytics$CheckoutScreenOpenReason, pj40Var, yq30Var, mtCheckoutDeeplinkStatus, str, obj), z ? p1j0.a : k1j0.a);
    }

    public final void Y(e310 e310Var, String str, String str2, Object obj, pj40 pj40Var, TransportPaymentAnalytics$CheckoutScreenOpenReason transportPaymentAnalytics$CheckoutScreenOpenReason, yq30 yq30Var, MtCheckoutDeeplinkStatus mtCheckoutDeeplinkStatus, q1j0 q1j0Var) {
        if (mtCheckoutDeeplinkStatus == MtCheckoutDeeplinkStatus.FAILURE) {
            i3g i3gVar = (i3g) e310Var;
            C((defpackage.t) i3gVar.p0.get(), new zz00(i3gVar, this, str, str2, obj, pj40Var, transportPaymentAnalytics$CheckoutScreenOpenReason, mtCheckoutDeeplinkStatus, yq30Var));
        } else {
            i3g i3gVar2 = (i3g) e310Var;
            je30 b = i3gVar2.b();
            B(b, new ae30(str, str2, obj, pj40Var, transportPaymentAnalytics$CheckoutScreenOpenReason, mtCheckoutDeeplinkStatus), new a010(this, i3gVar2, yq30Var, b), q1j0Var);
        }
    }

    public final void a0(e310 e310Var, yq30 yq30Var) {
        com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.c a;
        if (yq30Var instanceof wq30) {
            oeg0 oeg0Var = (oeg0) ((i3g) e310Var).a0.get();
            a = oeg0Var.a(oeg0Var.e);
        } else if (!(yq30Var instanceof xq30)) {
            w511.b();
            return;
        } else {
            oeg0 oeg0Var2 = (oeg0) ((i3g) e310Var).a0.get();
            a = oeg0Var2.a(oeg0Var2.f);
        }
        A(a, new neg0(), new f010(yq30Var, a, this, e310Var));
    }

    public final void b0(e310 e310Var, dmb dmbVar, yq30 yq30Var, MtCheckoutDeeplinkStatus mtCheckoutDeeplinkStatus, q1j0 q1j0Var) {
        tje.N(o(), null, null, new MassTransitModeRouterImpl$startSdkCheckoutScreenRouter$1(mtCheckoutDeeplinkStatus, e310Var, this, dmbVar, q1j0Var, yq30Var, null), 3);
    }

    public final void c0(e310 e310Var) {
        if (this.i0 == MtInitState$GeoPayment.ExitBehavior.DismissMassTransitMode) {
            r(new qu(9));
            return;
        }
        hi30 hi30Var = (hi30) ((c0g) ((i3g) e310Var).a).z.Zq.get();
        q5z.h(hi30Var);
        bi30 bi30Var = (bi30) hi30Var.b.getValue();
        i3g i3gVar = (i3g) e310Var;
        i6r i6rVar = i3gVar.a;
        pj40 pj40Var = i3gVar.c;
        String str = pj40Var.b;
        String str2 = pj40Var.a;
        sy00 x6 = ((c0g) i6rVar).x6();
        sme0 sme0Var = x6.e;
        ((na1) x6.b).getClass();
        String E = as6.E();
        long longValue = ((Number) sme0Var.getValue(x6, sy00.h[2])).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= longValue + 1800000) {
            ((j) x6.a).v(E);
            sme0Var.setValue(x6, sy00.h[2], Long.valueOf(currentTimeMillis));
        }
        if (bi30Var != null) {
            pho T1 = ((c0g) i6rVar).T1();
            q5z.h(T1);
            TransportMainAnalytics$TransportMainScreenType transportMainAnalytics$TransportMainScreenType = TransportMainAnalytics$TransportMainScreenType.Flex;
            HashMap hashMap = new HashMap();
            if (str2 != null) {
                hashMap.put("utm_source", str2);
            }
            if (str != null) {
                hashMap.put("utm_medium", str);
            }
            hashMap.put("screen_type", transportMainAnalytics$TransportMainScreenType.getEventValue());
            T1.a("TransportMain.Shown", hashMap, 3, new HashMap());
            D((ru.yandex.taxi.masstransit.main.router.b) i3gVar.t.get(), bi30Var, new c010(e310Var, this));
            return;
        }
        pho T12 = ((c0g) i6rVar).T1();
        q5z.h(T12);
        TransportMainAnalytics$TransportMainScreenType transportMainAnalytics$TransportMainScreenType2 = TransportMainAnalytics$TransportMainScreenType.Native;
        HashMap hashMap2 = new HashMap();
        if (str2 != null) {
            hashMap2.put("utm_source", str2);
        }
        if (str != null) {
            hashMap2.put("utm_medium", str);
        }
        hashMap2.put("screen_type", transportMainAnalytics$TransportMainScreenType2.getEventValue());
        T12.a("TransportMain.Shown", hashMap2, 3, new HashMap());
        D((si30) i3gVar.B.get(), zy11.a, new b010(this));
    }

    public final boolean d0(Uri uri) {
        String queryParameter;
        e310 e310Var = this.e0;
        if (e310Var == null || (queryParameter = uri.getQueryParameter("card_link_status")) == null) {
            return false;
        }
        T(e310Var, queryParameter);
        return true;
    }
}
