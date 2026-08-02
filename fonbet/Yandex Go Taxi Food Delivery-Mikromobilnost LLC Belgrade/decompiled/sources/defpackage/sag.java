package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.google.common.collect.ImmutableSet;
import com.yandex.go.about.domain.g;
import com.yandex.go.account.deeplink.b;
import com.yandex.go.chargers.deeplink.a;
import com.yandex.go.intentprocessor.i;
import com.yandex.go.overdraft.domain.r;
import com.yandex.go.payments.shared.z;
import com.yandex.go.promocodes.f;
import com.yandex.go.safety.center.d;
import com.yandex.go.safety.center.n;
import com.yandex.go.universal_qr_scanner.experiments.config.e;
import com.yandex.go.yb.domain.t;
import ru.yandex.taxi.activity.MainActivity;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.map_common.map.p;
import ru.yandex.taxi.settings.main.l;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.surge.repository.c;

/* loaded from: classes6.dex */
public final class sag implements xvf0 {
    public final /* synthetic */ int a;
    public final i6r b;

    public /* synthetic */ sag(i6r i6rVar, int i) {
        this.a = i;
        this.b = i6rVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        i6r i6rVar = this.b;
        switch (i) {
            case 0:
                c cVar = (c) ((c0g) i6rVar).z.er.get();
                q5z.h(cVar);
                return cVar;
            case 1:
                pwy0 w6 = ((c0g) i6rVar).w6();
                q5z.h(w6);
                return w6;
            case 2:
                b6z0 b6z0Var = (b6z0) ((c0g) i6rVar).z.N.get();
                q5z.h(b6z0Var);
                return b6z0Var;
            case 3:
                return ((c0g) i6rVar).z6();
            case 4:
                lg21 lg21Var = (lg21) ((c0g) i6rVar).z.u5.get();
                q5z.h(lg21Var);
                return lg21Var;
            case 5:
                fn21 fn21Var = (fn21) ((c0g) i6rVar).z.a0.get();
                q5z.h(fn21Var);
                return fn21Var;
            case 6:
                po21 C6 = ((c0g) i6rVar).C6();
                q5z.h(C6);
                return C6;
            case 7:
                ck31 d1 = ((c0g) i6rVar).d1();
                q5z.h(d1);
                return d1;
            case 8:
                return (c0g) i6rVar;
            case 9:
                Context W1 = ((c0g) i6rVar).W1();
                q5z.h(W1);
                return W1;
            case 10:
                zzf zzfVar = ((c0g) i6rVar).z;
                zuj0 zuj0Var = (zuj0) zzfVar.W.get();
                lx4 lx4Var = (lx4) zzfVar.Y.get();
                o3h o3hVar = (o3h) zzfVar.K.get();
                ((lt2) zzfVar.g.get()).getClass();
                q0h q0hVar = new q0h(o3hVar, new qqc());
                ((lt2) zzfVar.g.get()).getClass();
                return new ha1(zuj0Var, lx4Var, q0hVar, new qqc());
            case 11:
                tt2 Z1 = ((c0g) i6rVar).Z1();
                q5z.h(Z1);
                return Z1;
            case 12:
                c0g c0gVar = (c0g) i6rVar;
                zzf zzfVar2 = c0gVar.z;
                ImmutableSet l = ImmutableSet.l(5, new a((com.yandex.go.lifecycle.a) zzfVar2.I9.get(), i5m.a(zzfVar2.K1), c0gVar.ae), (vu2) c0gVar.Nz.get(), new oxh(new yuf0((zuj0) zzfVar2.W.get(), i5m.a(c0gVar.Oz)), (z0j) c0gVar.Re.get()), new com.yandex.go.scooters.deeplink.a((com.yandex.go.lifecycle.a) zzfVar2.I9.get(), i5m.a(zzfVar2.M1), c0gVar.Qd), c0gVar.R1());
                q5z.h(l);
                return l;
            case 13:
                c0g c0gVar2 = (c0g) i6rVar;
                zzf zzfVar3 = c0gVar2.z;
                g gVar = new g(new com.yandex.go.about.domain.c((kb20) zzfVar3.k.get(), (k) zzfVar3.L0.get(), zzfVar3.j(), new s66((rqo) zzfVar3.C.get(), 2), (rs2) zzfVar3.e.get(), (bpt) zzfVar3.v3.get()), c0gVar2.d2());
                vl3 vl3Var = new vl3((jj3) c0gVar2.T7.get());
                b bVar = new b((ru.yandex.taxi.am.g) zzfVar3.W0.get(), i5m.a(c0gVar2.T5), (jj3) c0gVar2.T7.get(), new cot(7, new jc4((pho) zzfVar3.d0.get())), i5m.a(zzfVar3.U0), (p2y0) zzfVar3.J2.get());
                com.yandex.go.account.deeplink.a aVar = new com.yandex.go.account.deeplink.a(i5m.a(c0gVar2.U7));
                ru.yandex.taxi.search.deeplink.a aVar2 = new ru.yandex.taxi.search.deeplink.a((jc00) zzfVar3.Xa.get(), (yv0) c0gVar2.kv.get(), (fx60) c0gVar2.ik.get(), c0gVar2.T9, c0gVar2.Wz, (mzb) c0gVar2.Ic.get());
                com.yandex.go.agreement.deeplink.b bVar2 = new com.yandex.go.agreement.deeplink.b((tse) c0gVar2.B.get(), (h) zzfVar3.a0.get(), (ru.yandex.taxi.am.token.a) zzfVar3.C3.get(), (jj3) c0gVar2.T7.get(), c0gVar2.F6(), (zh11) zzfVar3.P.get());
                jo1 jo1Var = new jo1(c0gVar2.fA);
                com.yandex.go.business.impl.deeplink.c cVar2 = new com.yandex.go.business.impl.deeplink.c(i5m.a(c0gVar2.jb), (iq41) c0gVar2.Ha.get());
                w78 w78Var = new w78(c0gVar2.on);
                com.yandex.go.chargers.deeplink.b bVar3 = new com.yandex.go.chargers.deeplink.b(c0gVar2.ae, (com.yandex.go.lifecycle.a) zzfVar3.I9.get());
                kza kzaVar = new kza(c0gVar2.kl, c0gVar2.i6());
                sou0 sou0Var = new sou0(c0gVar2.lA);
                su4 su4Var = new su4((ru.yandex.taxi.banners.c) c0gVar2.M8.get());
                twb twbVar = new twb(c0gVar2.cw);
                k1i k1iVar = new k1i(c0gVar2.i6(), i5m.a(c0gVar2.pA), i5m.a(c0gVar2.qA), new oo2(i5m.a(zzfVar3.Xa), i5m.a(c0gVar2.u8), c0gVar2.Or, c0gVar2.Ys, (oep0) c0gVar2.T.get()), (oep0) c0gVar2.T.get());
                yfi yfiVar = new yfi((fx60) c0gVar2.ik.get(), i5m.a(c0gVar2.sA));
                fx60 fx60Var = (fx60) c0gVar2.ik.get();
                h3y a = i5m.a(c0gVar2.Lz);
                com.yandex.go.taxi.tariffs.interactor.g d = zzfVar3.d();
                zzf zzfVar4 = c0gVar2.z;
                com.yandex.go.delivery.deeplink.b bVar4 = new com.yandex.go.delivery.deeplink.b(fx60Var, a, new ru.yandex.taxi.logistics.ndd_map.domain.c(d, new ru.yandex.taxi.logistics.experiments.k((rqo) zzfVar4.C.get())));
                nfi nfiVar = new nfi(c0gVar2.Lg);
                vxh vxhVar = new vxh(new xw91(21), (z0j) c0gVar2.Re.get(), i5m.a(c0gVar2.Oz));
                im21 im21Var = c0gVar2.hu;
                fx60 fx60Var2 = (fx60) c0gVar2.ik.get();
                wq21 wq21Var = new wq21((rqo) zzfVar3.C.get());
                lx4 lx4Var2 = (lx4) zzfVar3.Y.get();
                cug cugVar = new cug((pho) zzfVar3.d0.get());
                zf zfVar = new zf((pho) zzfVar3.d0.get());
                com.yandex.go.deeplink.a aVar3 = new com.yandex.go.deeplink.a(im21Var, fx60Var2, wq21Var, new eq21(lx4Var2, cugVar, zfVar));
                fdm fdmVar = new fdm((fx60) c0gVar2.ik.get(), c0gVar2.xe);
                com.yandex.go.favorites.deeplink.a aVar4 = new com.yandex.go.favorites.deeplink.a((fx60) c0gVar2.ik.get(), c0gVar2.Du);
                lh9 lh9Var = new lh9((gmr) yvu0.a.get(), (Context) c0gVar2.U.get(), new pat());
                com.yandex.go.flex.main_screen.presentation.feed.a aVar5 = new com.yandex.go.flex.main_screen.presentation.feed.a((ra00) c0gVar2.u8.get(), (com.yandex.go.navigation.screen.c) zzfVar3.Bc.get(), c0gVar2.Or, (com.yandex.go.lifecycle.a) zzfVar3.I9.get());
                rov rovVar = new rov(c0gVar2.CA);
                sov sovVar = new sov(c0gVar2.EA);
                i4l0 i4l0Var = new i4l0((i) c0gVar2.qw.get());
                thj0 thj0Var = new thj0((i) c0gVar2.qw.get());
                u811 u811Var = new u811((i) c0gVar2.qw.get());
                mv20 mv20Var = new mv20((i) c0gVar2.qw.get());
                com.yandex.go.loyalty.impl.selector.domain.c cVar3 = new com.yandex.go.loyalty.impl.selector.domain.c(c0gVar2.KA, (fx60) c0gVar2.ik.get(), new jvz((rqo) zzfVar3.C.get()));
                m800 m800Var = new m800((ra00) c0gVar2.u8.get());
                l730 l730Var = new l730(c0gVar2.NA);
                s730 s730Var = c0gVar2.PA;
                p pVar = (p) c0gVar2.ht.get();
                MainActivity mainActivity = c0gVar2.w;
                com.yandex.go.multimodal_route.deeplink.a aVar6 = new com.yandex.go.multimodal_route.deeplink.a(s730Var, pVar, new xes0(mainActivity), (yu40) zzfVar3.wb.get(), (n20) zzfVar3.o4.get());
                jb50 jb50Var = new jb50((kc50) c0gVar2.ff.get(), (z0j) c0gVar2.Re.get(), (fx60) c0gVar2.ik.get());
                r rVar = new r((com.yandex.go.lifecycle.a) zzfVar3.I9.get(), i5m.a(c0gVar2.WA));
                ve90 ve90Var = new ve90(c0gVar2.YA);
                aaa0 aaa0Var = new aaa0((fx60) c0gVar2.ik.get(), c0gVar2.iy, c0gVar2.bB);
                ed0 ed0Var = new ed0((com.yandex.go.payments.deeplink.a) c0gVar2.jy.get());
                yem0 yem0Var = new yem0();
                pi0 pi0Var = new pi0(c0gVar2.fB, c0gVar2.gB, c0gVar2.hB, c0gVar2.jB, (fx60) c0gVar2.ik.get(), c0gVar2.kB);
                com.yandex.go.payments.porttech.navigation.a aVar7 = new com.yandex.go.payments.porttech.navigation.a((dqe0) zzfVar3.s2.get(), c0gVar2.mB, (n20) zzfVar3.o4.get(), (po21) zzfVar3.Y1.get(), (fx60) c0gVar2.ik.get(), new bce0((tt2) zzfVar3.n.get(), new gq41((lx4) zzfVar3.Y.get()), (iq41) c0gVar2.Ha.get()));
                com.yandex.go.payments.promo.navigation.a aVar8 = new com.yandex.go.payments.promo.navigation.a((fx60) c0gVar2.ik.get(), c0gVar2.qB);
                une uneVar = new une((z) c0gVar2.sB.get(), (ru.yandex.taxi.settings.main.k) zzfVar3.xk.get(), (u500) c0gVar2.b9.get(), c0gVar2.m2(), c0gVar2.i6());
                zw6 zw6Var = new zw6((com.yandex.go.payments.shared.business.onboarding.a) c0gVar2.vB.get(), new mx6(), (fx60) c0gVar2.ik.get(), (z) c0gVar2.sB.get(), (ru.yandex.taxi.settings.main.k) zzfVar3.xk.get(), (u500) c0gVar2.b9.get(), c0gVar2.m2(), c0gVar2.i6());
                cxc cxcVar = new cxc(c0gVar2.ef);
                cl80 cl80Var = new cl80(c0gVar2.yB, new dl80(), c0gVar2.Pe, (rs2) zzfVar3.e.get());
                b67 b67Var = new b67(c0gVar2.AB, (fx60) c0gVar2.ik.get(), (z0j) c0gVar2.Re.get());
                k4d0 k4d0Var = new k4d0(c0gVar2.AB, (fx60) c0gVar2.ik.get(), (z0j) c0gVar2.Re.get());
                bb21 bb21Var = new bb21(c0gVar2.AB, (fx60) c0gVar2.ik.get(), (z0j) c0gVar2.Re.get());
                yqd yqdVar = new yqd(c0gVar2.AB, (fx60) c0gVar2.ik.get(), (z0j) c0gVar2.Re.get());
                i1d0 i1d0Var = new i1d0(c0gVar2.AB, (fx60) c0gVar2.ik.get());
                j39 j39Var = new j39(c0gVar2.AB, (fx60) c0gVar2.ik.get(), (z0j) c0gVar2.Re.get());
                lm51 lm51Var = new lm51(c0gVar2.AB, (fx60) c0gVar2.ik.get(), (z0j) c0gVar2.Re.get());
                com.yandex.go.promocodes.b bVar5 = new com.yandex.go.promocodes.b((com.yandex.go.lifecycle.a) zzfVar3.I9.get(), c0gVar2.U9, c0gVar2.MB, (fx60) c0gVar2.ik.get(), new an5((rqo) zzfVar4.C.get()));
                com.yandex.go.promocodes.a aVar9 = new com.yandex.go.promocodes.a((com.yandex.go.lifecycle.a) zzfVar3.I9.get(), c0gVar2.U9, c0gVar2.MB, (fx60) c0gVar2.ik.get(), new an5((rqo) zzfVar4.C.get()));
                f fVar = new f((com.yandex.go.lifecycle.a) zzfVar3.I9.get(), c0gVar2.U9, (fx60) c0gVar2.ik.get());
                f9t0 f9t0Var = new f9t0(c0gVar2.RB);
                com.yandex.go.safety.center.c cVar4 = new com.yandex.go.safety.center.c((com.yandex.go.lifecycle.a) zzfVar3.I9.get(), (p2y0) zzfVar3.J2.get(), c0gVar2.uu);
                d dVar = new d((com.yandex.go.lifecycle.a) zzfVar3.I9.get(), (p2y0) zzfVar3.J2.get(), c0gVar2.uu);
                com.yandex.go.safety.center.a aVar10 = new com.yandex.go.safety.center.a((com.yandex.go.lifecycle.a) zzfVar3.I9.get(), (p2y0) zzfVar3.J2.get(), c0gVar2.uu);
                n nVar = new n((com.yandex.go.lifecycle.a) zzfVar3.I9.get(), c0gVar2.WB, i5m.a(c0gVar2.XB), c0gVar2.uu, (p2y0) zzfVar3.J2.get());
                srz srzVar = new srz(c0gVar2.aC, new com.yandex.go.safety.center.lost_item.data.a((on2) zzfVar3.w0.get(), (dne0) zzfVar3.d.get()));
                com.yandex.go.scooters.deeplink.b bVar6 = new com.yandex.go.scooters.deeplink.b(c0gVar2.Qd, (com.yandex.go.lifecycle.a) zzfVar3.I9.get());
                com.yandex.go.something_wrong_screen.deeplink.a aVar11 = new com.yandex.go.something_wrong_screen.deeplink.a(i5m.a(c0gVar2.eC), (fx60) c0gVar2.ik.get(), new k8t0((rqo) zzfVar4.C.get()), (tt2) zzfVar3.n.get());
                com.yandex.go.special_needs_menu.a aVar12 = new com.yandex.go.special_needs_menu.a(new oot0((rqo) zzfVar3.C.get()), c0gVar2.Ja, i5m.a(c0gVar2.L));
                com.yandex.go.suggest.impl.router.a aVar13 = new com.yandex.go.suggest.impl.router.a(c0gVar2.Ye, (com.yandex.go.lifecycle.a) zzfVar3.I9.get());
                mtv0 mtv0Var = new mtv0(c0gVar2.IC);
                com.yandex.go.superapp_carts.data.a aVar14 = new com.yandex.go.superapp_carts.data.a(c0gVar2.LC, (com.yandex.go.lifecycle.a) zzfVar3.I9.get());
                z9w0 z9w0Var = new z9w0(c0gVar2.NC);
                com.yandex.go.support.domain.a aVar15 = new com.yandex.go.support.domain.a(mainActivity, (h15) zzfVar3.Yj.get(), (com.yandex.go.lifecycle.a) zzfVar3.I9.get(), c0gVar2.gl, c0gVar2.Gu, new tiw0((tt2) zzfVar3.n.get(), (as21) zzfVar3.H.get()), i5m.a(zzfVar3.oo));
                awx0 awx0Var = new awx0(new fwx0(c0gVar2.T9, (oep0) c0gVar2.T.get()));
                com.yandex.go.taxi.order.deeplink.a aVar16 = new com.yandex.go.taxi.order.deeplink.a(new com.yandex.go.taxi.order.multi.a(c0gVar2.v8, (oep0) c0gVar2.T.get(), (mw40) zzfVar3.zn.get(), new com.yandex.go.taxi.order.interactors.a((p2y0) zzfVar4.J2.get()), new clk0((rqo) zzfVar4.C.get()), (j4l0) c0gVar2.Wm.get()), c0gVar2.T9, new com.yandex.go.taxi.order.deeplink.b(i5m.a(zzfVar3.Xa), new com.yandex.go.taxi.order.interactors.a((p2y0) zzfVar4.J2.get()), (p2y0) zzfVar3.J2.get()), i5m.a(c0gVar2.Cx));
                com.yandex.go.taxi.summary.mobilityhub.deeplink.a aVar17 = new com.yandex.go.taxi.summary.mobilityhub.deeplink.a(c0gVar2.gD, c0gVar2.hD, c0gVar2.iD, (p) c0gVar2.ht.get(), new xes0(mainActivity), (fx60) c0gVar2.ik.get(), c0gVar2.s2());
                kay kayVar = new kay(c0gVar2.kD);
                com.yandex.go.ugc.c cVar5 = new com.yandex.go.ugc.c((fx60) c0gVar2.ik.get(), c0gVar2.na);
                com.yandex.go.universal_qr_scanner.domain.a aVar18 = new com.yandex.go.universal_qr_scanner.domain.a((com.yandex.go.lifecycle.a) zzfVar3.I9.get(), c0gVar2.nD, new e((rqo) zzfVar3.C.get()));
                com.yandex.go.user_profile.main_menu.profile.a aVar19 = new com.yandex.go.user_profile.main_menu.profile.a(c0gVar2.gu, (jj3) c0gVar2.T7.get(), (o600) c0gVar2.mb.get());
                com.yandex.go.user_profile.main_menu.profile.b bVar7 = new com.yandex.go.user_profile.main_menu.profile.b(c0gVar2.gu, (jj3) c0gVar2.T7.get(), (o600) c0gVar2.mb.get());
                ht21 ht21Var = new ht21(c0gVar2.gu, (jj3) c0gVar2.T7.get());
                c331 c331Var = new c331(c0gVar2.sD);
                com.yandex.go.walking.navigation.impl.a aVar20 = new com.yandex.go.walking.navigation.impl.a((p) c0gVar2.ht.get(), c0gVar2.kn, new xes0(mainActivity), (ra00) c0gVar2.u8.get());
                com.yandex.go.wallet.deeplink.a aVar21 = new com.yandex.go.wallet.deeplink.a(c0gVar2.vD, new ofa0((Context) c0gVar2.U.get(), (cd00) c0gVar2.Mr.get(), (vc00) c0gVar2.ir.get(), (l3w0) zzfVar3.Jk.get()));
                fj51 fj51Var = new fj51(mainActivity, (jj3) c0gVar2.T7.get());
                er6 er6Var = new er6(mainActivity, (w030) c0gVar2.o0.get(), i5m.a(c0gVar2.b0));
                w0m0 w0m0Var = new w0m0(c0gVar2.Rr, (ze0) c0gVar2.Uv.get());
                ru.yandex.taxi.superapp.deeplink.a R1 = c0gVar2.R1();
                fuv fuvVar = new fuv(i5m.a(c0gVar2.AD), c0gVar2.BD, c0gVar2.ED);
                ru.yandex.taxi.settings.main.b bVar8 = new ru.yandex.taxi.settings.main.b((ru.yandex.taxi.settings.email.a) zzfVar3.ck.get(), (com.yandex.go.lifecycle.a) zzfVar3.I9.get(), c0gVar2.Tt);
                l lVar = new l(c0gVar2.Tt, (com.yandex.go.lifecycle.a) zzfVar3.I9.get());
                ru.yandex.taxi.settings.main.a aVar22 = new ru.yandex.taxi.settings.main.a(c0gVar2.Tt, (com.yandex.go.lifecycle.a) zzfVar3.I9.get());
                ru.yandex.taxi.settings.main.c cVar6 = new ru.yandex.taxi.settings.main.c(c0gVar2.L, (com.yandex.go.lifecycle.a) zzfVar3.I9.get());
                i3g0 i3g0Var = new i3g0(c0gVar2.KD);
                ru.yandex.taxi.history.a aVar23 = new ru.yandex.taxi.history.a(c0gVar2.rb, (com.yandex.go.lifecycle.a) zzfVar3.I9.get());
                b900 b900Var = c0gVar2.OD;
                new k0m0();
                ImmutableSet r = ImmutableSet.r(gVar, vl3Var, bVar, aVar, aVar2, bVar2, jo1Var, cVar2, w78Var, bVar3, kzaVar, sou0Var, su4Var, twbVar, k1iVar, yfiVar, bVar4, nfiVar, vxhVar, aVar3, fdmVar, aVar4, lh9Var, aVar5, rovVar, sovVar, i4l0Var, thj0Var, u811Var, mv20Var, cVar3, m800Var, l730Var, aVar6, jb50Var, rVar, ve90Var, aaa0Var, ed0Var, yem0Var, pi0Var, aVar7, aVar8, uneVar, zw6Var, cxcVar, cl80Var, b67Var, k4d0Var, bb21Var, yqdVar, i1d0Var, j39Var, lm51Var, bVar5, aVar9, fVar, f9t0Var, cVar4, dVar, aVar10, nVar, srzVar, bVar6, aVar11, aVar12, aVar13, mtv0Var, aVar14, z9w0Var, aVar15, awx0Var, aVar16, aVar17, kayVar, cVar5, aVar18, aVar19, bVar7, ht21Var, c331Var, aVar20, aVar21, fj51Var, er6Var, w0m0Var, R1, fuvVar, bVar8, lVar, aVar22, cVar6, i3g0Var, aVar23, new szl0(b900Var), new aku(c0gVar2.ra, c0gVar2.i6()), new ru.yandex.taxi.intercity.deeplink.a((fx60) c0gVar2.ik.get(), c0gVar2.Ai), new ru.yandex.taxi.intercity.deeplink.b((fx60) c0gVar2.ik.get(), new dcw(), c0gVar2.nk), new vly((ru.yandex.taxi.startup.launch.c) zzfVar3.n5.get()), new ru.yandex.taxi.maas.impl.deeplink.a((com.yandex.go.lifecycle.a) zzfVar3.I9.get(), c0gVar2.s8, new ru.yandex.taxi.superapp.orders.multi.a(c0gVar2.H6(), c0gVar2.E6(), zzfVar4.A1(), zzfVar4.n()), c0gVar2.T9), new az00((h010) c0gVar2.Oi.get(), c0gVar2.z6()), new xy00((h010) c0gVar2.Oi.get(), c0gVar2.z6(), c0gVar2.Ni, c0gVar2.WD), new t010((h010) c0gVar2.Oi.get(), c0gVar2.z6()), new ru.yandex.taxi.masstransit.deeplink.a((h010) c0gVar2.Oi.get(), c0gVar2.z6(), (fx60) c0gVar2.ik.get()), new r110(c0gVar2.y6()), new ru.yandex.taxi.masstransit.deeplink.c(i5m.a(c0gVar2.Av), i5m.a(c0gVar2.dy)), new j010(i5m.a(c0gVar2.Mi), i5m.a(c0gVar2.T7), c0gVar2.z6(), (oep0) c0gVar2.T.get()), new ru.yandex.taxi.masstransit.deeplink.d(i5m.a(c0gVar2.Av), i5m.a(c0gVar2.dy)), new ru.yandex.taxi.masstransit.deeplink.e((h010) c0gVar2.Oi.get(), c0gVar2.z6(), new ru.yandex.taxi.masstransit.deeplink.f(new ru.yandex.taxi.masstransit.datasource.schedule.b((tt2) zzfVar4.n.get(), (x210) zzfVar4.vo.get()))), new ru.yandex.taxi.masstransit.deeplink.b((h010) c0gVar2.Oi.get(), c0gVar2.z6(), new ru.yandex.taxi.masstransit.deeplink.f(new ru.yandex.taxi.masstransit.datasource.schedule.b((tt2) zzfVar4.n.get(), (x210) zzfVar4.vo.get()))), new iz00((h010) c0gVar2.Oi.get(), c0gVar2.z6()), new u110((h010) c0gVar2.Oi.get(), c0gVar2.z6()), new ru.yandex.taxi.scheduleride.deeplink.a((nnm0) c0gVar2.iE.get(), (fx60) c0gVar2.ik.get(), new lnm0(i5m.a(c0gVar2.jE), i5m.a(zzfVar3.qk))), new j3g0(new o4g0(zzfVar3.a)), new qnn((jj3) c0gVar2.T7.get(), c0gVar2.mE), new vg21(new wg21(c0gVar2.Ja)));
                q5z.h(r);
                return r;
            case 14:
                rqo l2 = ((c0g) i6rVar).l2();
                q5z.h(l2);
                return l2;
            case 15:
                tst tstVar = (tst) ((c0g) i6rVar).z.B1.get();
                q5z.h(tstVar);
                return tstVar;
            case 16:
                k421 k421Var = (k421) ((c0g) i6rVar).z.A1.get();
                q5z.h(k421Var);
                return k421Var;
            case 17:
                ney y2 = ((c0g) i6rVar).y2();
                q5z.h(y2);
                return y2;
            case 18:
                d0g d0gVar = ((c0g) i6rVar).A.a;
                zzf zzfVar5 = d0gVar.a;
                com.yandex.go.yb.data.e eVar = (com.yandex.go.yb.data.e) zzfVar5.U1.get();
                tt2 tt2Var = (tt2) zzfVar5.n.get();
                c0g c0gVar3 = d0gVar.b;
                return ImmutableSet.q(new t(eVar, tt2Var, c0gVar3.cb, (c170) c0gVar3.sE.get(), (Lifecycle) c0gVar3.P.get()));
            case 19:
                return ((c0g) i6rVar).K2();
            case 20:
                return ((c0g) i6rVar).M2();
            case 21:
                zuj0 N2 = ((c0g) i6rVar).N2();
                q5z.h(N2);
                return N2;
            case 22:
                oep0 n = ((c0g) i6rVar).n();
                q5z.h(n);
                return n;
            case 23:
                w030 w030Var = (w030) ((c0g) i6rVar).o0.get();
                q5z.h(w030Var);
                return w030Var;
            case 24:
                return new ibw0((pho) ((c0g) i6rVar).z.d0.get());
            case 25:
                return ImmutableSet.q(new f6p0(i5m.a(((c0g) i6rVar).z.M1)));
            case 26:
                return ((c0g) i6rVar).w;
            case 27:
                tt2 Z12 = ((c0g) i6rVar).Z1();
                q5z.h(Z12);
                return Z12;
            case 28:
                ru.yandex.taxi.deeplinks.b bVar9 = (ru.yandex.taxi.deeplinks.b) ((c0g) i6rVar).k8.get();
                q5z.h(bVar9);
                return bVar9;
            default:
                Context e2 = ((c0g) i6rVar).e2();
                q5z.h(e2);
                return e2;
        }
    }
}
