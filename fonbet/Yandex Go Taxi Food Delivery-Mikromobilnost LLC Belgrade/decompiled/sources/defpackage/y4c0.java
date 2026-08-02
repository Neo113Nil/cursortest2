package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.yandex.go.address.address_map_picker.api.AddressMapPickerSourceScreen;
import com.yandex.go.navigator.analitycs.Screen;
import com.yandex.go.promocodes.d;
import com.yandex.go.search.router.Origin;
import com.yandex.go.superapp.api.loading_tracker.GlobalLoadingEvent;
import com.yandex.go.taxi.summary.routestops.e;
import com.yandex.go.walking.navigation.impl.guidance.overlay.b;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.Collections;
import java.util.Set;
import kotlin.a;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.preorder.source.domain.h;
import ru.yandex.taxi.shortcuts.dto.response.RequiredAccount;
import ru.yandex.taxi.systemrequeirements.location.c;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes12.dex */
public final class y4c0 extends h55 {
    public final /* synthetic */ int D;
    public final Object E;
    public final Object F;
    public final Object G;
    public Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4c0(yvf0 yvf0Var, yvf0 yvf0Var2, l01 l01Var, pw pwVar) {
        super(null);
        this.D = 6;
        this.E = yvf0Var;
        this.F = yvf0Var2;
        this.G = l01Var;
        this.H = a.a(new ybf(4, pwVar));
    }

    @Override // defpackage.h55
    public void G(Object obj) {
        int i = this.D;
        Object obj2 = this.E;
        switch (i) {
            case 8:
                tje.a0((Activity) obj2, (qc) this.H);
                break;
            case 9:
                h600 h600Var = (h600) obj;
                ((MapNotificationsMuteRepository) this.H).a();
                vpc vpcVar = (vpc) this.G;
                siw0 siw0Var = h600Var.b;
                String str = siw0Var != null ? siw0Var.b : null;
                if (vpcVar.b && str != null) {
                    vpcVar.a.evaluateNavigation(str);
                }
                vpcVar.b = true;
                UiWebViewConfig uiWebViewConfig = h600Var.a;
                siw0 siw0Var2 = h600Var.b;
                A((m950) ((yvf0) obj2).get(), siw0Var2 == null ? wpc.c : new wpc(siw0Var2.a, siw0Var2.b), new g600(this, uiWebViewConfig));
                break;
            case 16:
                ((g09) this.F).a(this);
                break;
            case 17:
                T((x8w0) obj);
                break;
        }
    }

    @Override // defpackage.h55
    public void H(Object obj) {
        switch (this.D) {
            case 8:
                ((qc) this.H).g();
                break;
            case 9:
                j(dpb.a);
                ((vpc) this.G).b = false;
                ((MapNotificationsMuteRepository) this.H).b();
                break;
            case 16:
                ((g09) this.F).b(this);
                break;
        }
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        int i = this.D;
        Object obj2 = this.G;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                ((d2x0) ((c2x0) obj3)).b(qoi0.a(y4c0.class));
                ((z0j) this.H).c(this);
                break;
            case 3:
                this.H = null;
                break;
            case 7:
                ((eb50) obj2).a = null;
                break;
            case 14:
                Uri uri = ((fno0) obj).a;
                ((MapNotificationsMuteRepository) obj2).b();
                break;
            case 19:
                i541 i541Var = (i541) obj3;
                i541Var.Ig();
                i541Var.A.Cg();
                xm00 xm00Var = i541Var.E;
                xm00Var.m();
                xm00Var.d();
                i541Var.D.b();
                b bVar = (b) this.H;
                if (bVar != null) {
                    bVar.detach();
                }
                this.H = null;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h55
    public void J(Object obj) {
        int i = this.D;
        int i2 = 17;
        int i3 = 5;
        int i4 = 21;
        int i5 = 3;
        int i6 = 11;
        int i7 = 2;
        int i8 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object obj2 = this.F;
        Object obj3 = this.G;
        Object obj4 = this.E;
        int i9 = 1;
        switch (i) {
            case 0:
                ((d2x0) ((c2x0) obj2)).a(0, qoi0.a(y4c0.class), !((pwy0) obj3).getThemeType().c());
                ((z0j) this.H).a(this);
                dt20 dt20Var = (dt20) obj4;
                dt20Var.getClass();
                n3w a = n3w.a(new t4c0(new nw70(20, new q5g(dt20Var, i9))));
                n3w a2 = n3w.a(new x4c0(new y4a0(new kxb0(new q5g(dt20Var, i7), i9), new q5g(dt20Var, objArr2 == true ? 1 : 0), objArr == true ? 1 : 0, 11)));
                w030 w030Var = (w030) dt20Var.c;
                q5z.h(w030Var);
                A(new da0(i2, w030Var, (t4c0) a.a, (x4c0) a2.a), (v4c0) obj, new e3h(this, 1));
                break;
            case 1:
                j18 j18Var = (j18) this.H;
                final Object[] objArr5 = objArr3 == true ? 1 : 0;
                j18Var.w(new tls(this) { // from class: v93
                    public final /* synthetic */ y4c0 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj5) {
                        int i10 = objArr5;
                        zy11 zy11Var = zy11.a;
                        y4c0 y4c0Var = this.b;
                        switch (i10) {
                            case 0:
                                y4c0Var.c = null;
                                y4c0Var.i();
                                break;
                            default:
                                j18 j18Var2 = (j18) y4c0Var.H;
                                if (((Integer) obj5).intValue() == 0) {
                                    if (j18Var2.t() instanceof mf60) {
                                        j18Var2.resumeWith(zy11Var);
                                    }
                                    y4c0Var.i();
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                });
                final int i10 = 1;
                this.c = new tls(this) { // from class: v93
                    public final /* synthetic */ y4c0 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj5) {
                        int i102 = i10;
                        zy11 zy11Var = zy11.a;
                        y4c0 y4c0Var = this.b;
                        switch (i102) {
                            case 0:
                                y4c0Var.c = null;
                                y4c0Var.i();
                                break;
                            default:
                                j18 j18Var2 = (j18) y4c0Var.H;
                                if (((Integer) obj5).intValue() == 0) {
                                    if (j18Var2.t() instanceof mf60) {
                                        j18Var2.resumeWith(zy11Var);
                                    }
                                    y4c0Var.i();
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                };
                A((m950) obj4, obj2, (sy60) obj3);
                break;
            case 2:
                A((ii3) obj4, (ki3) obj, new com.yandex.go.captcha.b(this));
                break;
            case 3:
                U((cz9) obj);
                break;
            case 4:
                A((pue) obj4, (mue) obj, new que(this, objArr4 == true ? 1 : 0));
                break;
            case 5:
                A((m950) ((yvf0) obj4).get(), (mue) obj, new que(this, 1));
                break;
            case 6:
                cff cffVar = (cff) obj;
                if (!jl40.l(cffVar, bff.a)) {
                    if (!(cffVar instanceof aff)) {
                        w511.b();
                        break;
                    } else {
                        Q(((aff) cffVar).a, false);
                        break;
                    }
                } else {
                    R();
                    break;
                }
            case 7:
                P((wjg) obj);
                ((eb50) obj3).a = Screen.PlaceReport;
                break;
            case 8:
                caz cazVar = (caz) obj;
                kkm kkmVar = (kkm) obj2;
                kkmVar.getClass();
                pho phoVar = (pho) kkmVar.f;
                rqo rqoVar = (rqo) kkmVar.e;
                pwy0 pwy0Var = (pwy0) kkmVar.p;
                jbz jbzVar = (jbz) kkmVar.q;
                tt2 tt2Var = (tt2) kkmVar.i;
                w030 w030Var2 = (w030) kkmVar.t;
                r2g r2gVar = new r2g(kkmVar, 1);
                r2g r2gVar2 = new r2g(kkmVar, 6);
                n3w a3 = n3w.a(new jdz(new m(r2gVar, new prq(r2gVar2, new r2g(kkmVar, i3), new r2g(kkmVar, 16), new r2g(kkmVar, i7), new r2g(kkmVar, i2), 20), new r2g(kkmVar, i6), new r2g(kkmVar, i8), new r2g(kkmVar, 14), new r2g(kkmVar, 12), new r2g(kkmVar, 15), new r2g(kkmVar, 10), i5m.b(new e3u((xvf0) new r2g(kkmVar, 3), (xvf0) new h1t(new r2g(kkmVar, 7), 21), (xvf0) new kgn(new r2g(kkmVar, 4), 11), 15)), new r2g(kkmVar, 8))));
                int i11 = 13;
                n3w a4 = n3w.a(new kbz(new r1s(28, new r2g(kkmVar, 9), r2gVar2, n3w.a(new jc6(new sr4(i11, new r2g(kkmVar, i11)))))));
                xvf0 b = i5m.b(taz.a);
                if (!(cazVar instanceof aaz)) {
                    if (!(cazVar instanceof baz)) {
                        w511.b();
                        break;
                    } else {
                        Context context = (Context) kkmVar.a;
                        q5z.h(context);
                        q5z.h(w030Var2);
                        q5z.h(tt2Var);
                        q5z.h(jbzVar);
                        q5z.h(pwy0Var);
                        saz sazVar = (saz) b.get();
                        q5z.h(rqoVar);
                        com.yandex.go.permission.location_with_agreement.ui.b bVar = new com.yandex.go.permission.location_with_agreement.ui.b(tt2Var, jbzVar, pwy0Var, sazVar, rqoVar);
                        c cVar = (c) kkmVar.j;
                        q5z.h(cVar);
                        h hVar = (h) kkmVar.b;
                        q5z.h(hVar);
                        zzv0 zzv0Var = (zzv0) kkmVar.c;
                        q5z.h(zzv0Var);
                        q5z.h(tt2Var);
                        q5z.h(jbzVar);
                        q5z.h(pwy0Var);
                        saz sazVar2 = (saz) b.get();
                        q5z.h(rqoVar);
                        com.yandex.go.permission.location_with_agreement.ui.b bVar2 = new com.yandex.go.permission.location_with_agreement.ui.b(tt2Var, jbzVar, pwy0Var, sazVar2, rqoVar);
                        saz sazVar3 = (saz) b.get();
                        q5z.h(phoVar);
                        com.yandex.go.permission.location_with_agreement.ui.a aVar = new com.yandex.go.permission.location_with_agreement.ui.a(cVar, hVar, zzv0Var, bVar2, sazVar3, new pj(phoVar));
                        q5z.h(phoVar);
                        pj pjVar = new pj(phoVar);
                        lbz lbzVar = (lbz) kkmVar.m;
                        q5z.h(lbzVar);
                        A(new waz(context, w030Var2, bVar, aVar, pjVar, lbzVar), cazVar, new nk5(this, 1));
                        break;
                    }
                } else {
                    q5z.h(w030Var2);
                    gf41 gf41Var = (gf41) kkmVar.s;
                    q5z.h(gf41Var);
                    A(new kk5(w030Var2, gf41Var, (jdz) a3.a, (kbz) a4.a, 4), cazVar, new nk5(this, 1));
                    break;
                }
            case 10:
                D((m950) ((e840) obj4).get(), new yf50(((qf50) obj).a), new rf50(this));
                break;
            case 11:
                A((goi) obj4, (hoi) obj, new kaj0(this));
                break;
            case 12:
                gdl0 gdl0Var = (gdl0) obj;
                i6r i6rVar = (i6r) this.H;
                e eVar = (e) obj2;
                wvb1 wvb1Var = new wvb1(gdl0Var.b, gdl0Var.c);
                fcj0 fcj0Var = (fcj0) obj4;
                dit0 dit0Var = (dit0) obj3;
                i6rVar.getClass();
                eVar.getClass();
                fcj0Var.getClass();
                dit0Var.getClass();
                c0g c0gVar = (c0g) i6rVar;
                Context e2 = c0gVar.e2();
                q5z.h(e2);
                ru.yandex.taxi.badge.b a5 = c0gVar.A.a.a();
                tt2 Z1 = c0gVar.Z1();
                q5z.h(Z1);
                zuj0 N2 = c0gVar.N2();
                q5z.h(N2);
                zuj0 N22 = c0gVar.N2();
                q5z.h(N22);
                wiq0 S2 = c0gVar.S2();
                q5z.h(S2);
                ffl0 ffl0Var = new ffl0(N22, eVar, new w810(S2));
                ah00 z2 = c0gVar.z2();
                q5z.h(z2);
                com.yandex.go.routestops.v2.interactor.c cVar2 = new com.yandex.go.routestops.v2.interactor.c(Z1, N2, ffl0Var, new nr41(i3, z2));
                tt2 Z12 = c0gVar.Z1();
                q5z.h(Z12);
                com.yandex.go.routestops.v2.interactor.b bVar3 = new com.yandex.go.routestops.v2.interactor.b(fcj0Var, new h3l0(Z12, eVar));
                i130 G = c0gVar.G();
                q5z.h(G);
                E(new com.yandex.go.routestops.v2.router.b(e2, wvb1Var, a5, eVar, cVar2, bVar3, G, dit0Var, new com.yandex.go.routestops.v2.interactor.a(fcj0Var, eVar)), zy11.a, new uw20(this, gdl0Var, 1), hxx.a);
                break;
            case 13:
                gzn0 gzn0Var = (gzn0) obj3;
                pio0 pio0Var = (pio0) obj;
                if (!(pio0Var instanceof oio0)) {
                    if (!(pio0Var instanceof nio0)) {
                        if (!(pio0Var instanceof mio0)) {
                            w511.b();
                            break;
                        } else {
                            A((m950) gzn0Var.get(), qjo0.a, new zio0(this));
                            break;
                        }
                    } else {
                        A((m950) gzn0Var.get(), new rjo0(((nio0) pio0Var).a), new zio0(this));
                        break;
                    }
                } else {
                    oio0 oio0Var = (oio0) pio0Var;
                    String str = oio0Var.b;
                    Set set = oio0Var.a;
                    if (str == null) {
                        V(set);
                        break;
                    } else {
                        A((m950) ((yvf0) obj2).get(), new z7n0(str, true), new cb0(i4, this, set));
                        break;
                    }
                }
            case 14:
                Uri uri = ((fno0) obj).a;
                ((MapNotificationsMuteRepository) obj3).a();
                D((m950) ((l7g) obj2).get(), new qrf0(new mrf0(uri, Collections.singletonList("scooters"), v770.x)), new rrf0(this, i7));
                break;
            case 15:
                A((d) obj4, (qrf0) obj, new rrf0(this, i5));
                break;
            case 18:
                A((zyx0) obj4, (yyx0) obj, new azx0(this));
                break;
            case 19:
                b a6 = ((c241) obj3).a(true, (e241) ((yvf0) obj4).get());
                this.H = a6;
                a6.attach();
                i541 i541Var = (i541) obj2;
                i541Var.A.P = true;
                i541Var.D.a();
                i541Var.E.b(((gh00) ((ah00) i541Var.b)).i);
                i541Var.A.Bg(i541Var);
                break;
        }
    }

    @Override // defpackage.h55
    public void K(Object obj) {
        switch (this.D) {
            case 16:
                ((g09) this.F).d(this);
                ogu0 ogu0Var = new ogu0(26, this);
                fc5 fc5Var = (fc5) this.H;
                if (!fc5Var.c()) {
                    ogu0Var.invoke();
                    break;
                } else {
                    fc5Var.a(new tpt0(20, this, ogu0Var), "SuperAppMainScreenCarsOnMapOverlayRouter");
                    break;
                }
        }
    }

    @Override // defpackage.h55
    public void L(Object obj) {
        switch (this.D) {
            case 16:
                ((fc5) this.H).a(null, "SuperAppMainScreenCarsOnMapOverlayRouter");
                ((f09) this.E).setVisible(false);
                ((g09) this.F).c(this);
                break;
        }
    }

    public void P(wjg wjgVar) {
        D((m950) ((k4a) this.E).get(), wjgVar, new jpv(this, wjgVar));
    }

    public void Q(zzs zzsVar, boolean z) {
        boolean a = ((l01) this.G).a(vz0.a);
        hxx hxxVar = hxx.a;
        if (a) {
            E((m950) ((yvf0) this.F).get(), new u11(zzsVar != null ? new ymu(6, zzsVar, (Object) null) : null, AddressMapPickerSourceScreen.Superapp), new dff(this, z), hxxVar);
        } else {
            E((m950) ((yvf0) this.E).get(), new yef(kyh0.specify_your_address, zzsVar, Origin.MENU), new eff(this, z), hxxVar);
        }
    }

    public void R() {
        i3y i3yVar = (i3y) this.H;
        if (v((com.yandex.go.mainscreen.superapp.impl.currentaddress.c) i3yVar.getValue())) {
            return;
        }
        C((com.yandex.go.mainscreen.superapp.impl.currentaddress.c) i3yVar.getValue(), new fff(this));
    }

    public void S(x8w0 x8w0Var) {
        g gVar = (g) this.E;
        int i = 1;
        if (!gVar.f() || !gVar.g()) {
            qv10.C(new Object[]{x8w0Var.a}, 1, "EATSKIT_AUTH: start authorization for %s", jst.e);
            ((rit) this.H).a(GlobalLoadingEvent.NATIVE_AUTH_START);
            ((jj3) ((h3y) this.F).get()).a(new um3(Events$Zalogin$LoginContext.EATSKIT, new qzj0(null, new s5w0(i, this)), false, false, 28), false);
            return;
        }
        if (!x8w0Var.b.a || !gVar.a.Mg()) {
            r(new oxv0(5));
            return;
        }
        qv10.C(new Object[]{x8w0Var.a}, 1, "EATSKIT_AUTH: link phonish account with portal for %s", jst.e);
        ru.yandex.taxi.zalogin.d dVar = (ru.yandex.taxi.zalogin.d) ((h3y) this.G).get();
        dVar.b(Events$Zalogin$LinkageContext.EATSKIT, qeb1.b(dVar.e), new tpt0(22, this, x8w0Var), new zi(21));
    }

    public void T(x8w0 x8w0Var) {
        kl3 kl3Var = x8w0Var.b;
        if (kl3Var instanceof il3) {
            if (((il3) kl3Var).b == RequiredAccount.NOT_REQUIRED) {
                r(new oxv0(4));
                return;
            } else {
                S(x8w0Var);
                return;
            }
        }
        if (kl3Var instanceof jl3) {
            S(x8w0Var);
        } else {
            w511.b();
        }
    }

    public void U(cz9 cz9Var) {
        bu0 bu0Var = (bu0) this.H;
        if (bu0Var == null) {
            i6r i6rVar = (i6r) this.F;
            i6rVar.getClass();
            bu0 bu0Var2 = new bu0();
            bu0Var2.a = i6rVar;
            bu0Var2.b = new rxf(i6rVar, 10);
            int i = 17;
            bu0Var2.c = new rxf(i6rVar, i);
            int i2 = 18;
            bu0Var2.d = n3w.a(new awa(new an8(new lu9(new rxf(i6rVar, 11), i), new rxf(i6rVar, 15), new rxf(i6rVar, i2), new lu9(new rxf(i6rVar, 16), i2), 12)));
            bu0Var2.e = new rxf(i6rVar, 13);
            bu0Var2.f = new rxf(i6rVar, 12);
            bu0Var2.g = i5m.b(iz9.a);
            bu0Var2.h = i5m.b(b0a.a);
            bu0Var2.i = new rxf(i6rVar, 14);
            this.H = bu0Var2;
            bu0Var = bu0Var2;
        }
        c0g c0gVar = (c0g) ((i6r) bu0Var.a);
        Context e2 = c0gVar.e2();
        c0g c0gVar2 = c0gVar.A;
        q5z.h(e2);
        k7x0 Z2 = c0gVar.Z2();
        q5z.h(Z2);
        d130 a = ((y030) c0gVar2.a.b.H3.get()).a(ContentContainer$ZOrder.IN_FRONT_OF_MODAL_VIEW);
        ru.yandex.taxi.widget.c r2 = c0gVar.r2();
        q5z.h(r2);
        rxf rxfVar = (rxf) bu0Var.b;
        rxf rxfVar2 = (rxf) bu0Var.c;
        xma xmaVar = (xma) c0gVar2.a.q2.a;
        q5z.h(xmaVar);
        awa awaVar = (awa) ((n3w) bu0Var.d).a;
        d0g d0gVar = c0gVar2.a;
        com.yandex.go.chargers.surge.domain.a aVar = new com.yandex.go.chargers.surge.domain.a((pdc) d0gVar.a.Ye.get(), (ru.yandex.taxi.widget.utils.e) d0gVar.b.J9.get());
        ru.yandex.taxi.widget.c r22 = c0gVar.r2();
        q5z.h(r22);
        d0g d0gVar2 = c0gVar2.a;
        com.yandex.go.chargers.feedback.ui.c cVar = new com.yandex.go.chargers.feedback.ui.c(new com.yandex.go.chargers.feedback.domain.a(aVar, r22, new com.yandex.go.chargers.domain.mapper.a((ru.yandex.taxi.widget.c) d0gVar2.a.Ze.get(), (ru.yandex.taxi.widget.utils.e) d0gVar2.b.J9.get()), new com.yandex.go.chargers.feedback.data.d(i5m.a((rxf) bu0Var.e))), (rxf) bu0Var.f, (hz9) ((xvf0) bu0Var.g).get(), (a0a) ((xvf0) bu0Var.h).get());
        em9 c2 = c0gVar.c2();
        tse f2 = c0gVar.f2();
        q5z.h(f2);
        A(new com.yandex.go.chargers.feedback.c(e2, Z2, a, r2, rxfVar, rxfVar2, xmaVar, awaVar, cVar, new an8(c2, new com.yandex.go.chargers.feedback.domain.b(f2, new com.yandex.go.chargers.feedback.data.d(i5m.a((rxf) bu0Var.e)), (rxf) bu0Var.f), (hz9) ((xvf0) bu0Var.g).get(), (a0a) ((xvf0) bu0Var.h).get(), 8), (rxf) bu0Var.i, new com.yandex.go.chargers.data.b((dne0) c0gVar2.a.a.d.get())), cz9Var.a, new kz9(this, cz9Var));
    }

    public void V(Set set) {
        D((m950) ((rx4) this.H).get(), new fio0(set), new yio0(0, this));
    }

    public boolean equals(Object obj) {
        switch (this.D) {
            case 1:
                return jl40.l((m950) this.E, obj);
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.D) {
            case 1:
                return ((m950) this.E).hashCode();
            default:
                return super.hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4c0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(null);
        this.D = i;
        this.E = obj;
        this.F = obj2;
        this.G = obj3;
        this.H = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4c0(yvf0 yvf0Var, Object obj, Object obj2, int i) {
        super(null);
        this.D = i;
        this.E = yvf0Var;
        this.F = obj;
        this.G = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4c0(Activity activity, kkm kkmVar, j7j0 j7j0Var) {
        super(null);
        this.D = 8;
        this.E = activity;
        this.F = kkmVar;
        this.G = j7j0Var;
        this.H = new qc(12, this);
    }
}
