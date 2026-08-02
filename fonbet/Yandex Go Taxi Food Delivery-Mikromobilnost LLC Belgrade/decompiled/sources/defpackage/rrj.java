package defpackage;

import android.content.Context;
import android.net.Uri;
import com.yandex.go.drive.sdkintegration.presentation.DriveHostView;
import com.yandex.go.drive.vertical.interactor.e;
import com.yandex.go.drive.vertical.ui.tariff_card.DriveTariffCardModalView;
import com.yandex.go.drive.vertical.ui.tariff_card.collapsed.DriveTariffCardCollapsedView;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main.DiscountsModalView;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main.a;
import com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.c;
import com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.d;
import com.yandex.go.route.interactor.b;
import com.yandex.go.settings.mvp.SettingsModalView;
import com.yandex.go.user_profile.settings.profile.presentation.SettingsProfileView;
import java.util.HashMap;
import java.util.List;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.am.b0;
import ru.yandex.taxi.animation.NavigationDirection;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes13.dex */
public final class rrj extends m230 {
    public final /* synthetic */ int E = 0;
    public final w030 F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;

    public rrj(y50 y50Var, w030 w030Var, b bVar, wgm wgmVar, ezf ezfVar, bhm bhmVar, sgm sgmVar, pgm pgmVar, mgm mgmVar, pcm pcmVar) {
        super(null);
        this.G = y50Var;
        this.F = w030Var;
        this.H = bVar;
        this.I = wgmVar;
        this.J = ezfVar;
        this.K = bhmVar;
        this.L = sgmVar;
        this.M = pgmVar;
        this.N = mgmVar;
        this.O = pcmVar;
    }

    public static final void T(rrj rrjVar, PointType pointType) {
        SourcePicker sourcePicker;
        m950 m950Var = (m950) ((ezf) rrjVar.J).get();
        int i = chm.a[pointType.ordinal()];
        int i2 = 1;
        if (i == 1) {
            sourcePicker = SourcePicker.A_FROM_SUMMARY;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            sourcePicker = SourcePicker.B_FROM_SUMMARY;
        }
        SourcePicker sourcePicker2 = sourcePicker;
        o501 o501Var = new o501(kyh0.address_search_modal_view_from, kyh0.address_search_modal_view_to, 14);
        rrjVar.A(m950Var, new jsd(pointType, sourcePicker2, false, new q501(o501Var, o501Var), ((b) rrjVar.H).c().b(), "order_summary", null, 1792), new k0i(rrjVar, i2));
    }

    public static final void U(rrj rrjVar, wlf0 wlf0Var, rqj rqjVar) {
        if (((qqj) rrjVar.M).a(wlf0Var)) {
            rrjVar.z((m950) ((zlf0) rrjVar.O).get(), sy60.Q2);
            return;
        }
        cmf0 cmf0Var = wlf0Var.i;
        if (cmf0Var == null) {
            return;
        }
        rrjVar.A((m950) ((yvf0) rrjVar.J).get(), new brj(wlf0Var, cmf0Var, rqjVar.b), new qrj(rrjVar, 0));
    }

    @Override // defpackage.m230, defpackage.h55
    public void G(Object obj) {
        switch (this.E) {
            case 2:
                super.G((hbr0) obj);
                gbr0 gbr0Var = (gbr0) this.N;
                if (gbr0Var.a == NavigationDirection.BACKWARD) {
                    gbr0Var.a();
                    break;
                }
                break;
            default:
                super.G(obj);
                break;
        }
    }

    @Override // defpackage.m230
    public final w030 P() {
        switch (this.E) {
        }
        return this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        switch (this.E) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        int i = this.E;
        Object obj2 = this.O;
        Object obj3 = this.N;
        Object obj4 = this.L;
        Object obj5 = this.K;
        switch (i) {
            case 0:
                rqj rqjVar = (rqj) obj;
                Uri uri = rqjVar.a;
                List list = rqjVar.b;
                prj prjVar = new prj(this, rqjVar);
                yx1 yx1Var = ((asj) obj4).a;
                a aVar = new a((k7x0) ((xvf0) yx1Var.a).get(), (tpj) ((xvf0) yx1Var.b).get(), (d) ((xvf0) yx1Var.c).get(), (c) ((xvf0) yx1Var.d).get(), (xpj) ((xvf0) yx1Var.e).get(), (com.yandex.go.promocodes.base.impl.discounts.domain.interactors.b) ((xvf0) yx1Var.f).get(), (kqj) ((lyh) yx1Var.g).get(), (com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.b) ((pqd0) yx1Var.h).get(), uri, list, prjVar);
                mc mcVar = ((oqj) obj5).a;
                return new DiscountsModalView((Context) mcVar.a.get(), (pav) mcVar.b.get(), aVar);
            case 1:
                ygm ygmVar = (ygm) obj;
                String str = ygmVar.a;
                qcm qcmVar = (qcm) ((pcm) obj2);
                qcmVar.getClass();
                HashMap hashMap = new HashMap();
                if (str != null) {
                    hashMap.put("source", str);
                }
                qcmVar.b("drive_vertical_opened", hashMap);
                qnh qnhVar = new qnh(this);
                String str2 = ygmVar.a;
                j4n j4nVar = ((bhm) obj5).a;
                ahm ahmVar = new ahm(qnhVar, str2, (ah00) ((ezf) j4nVar.a).get(), (tgm) ((xvf0) j4nVar.b).get(), (ru.yandex.taxi.layers.presentation.walkroute.simple.b) ((xvf0) j4nVar.c).get(), (wiq0) ((xvf0) j4nVar.x).get(), (b) ((xvf0) j4nVar.y).get(), (kdm) ((xvf0) j4nVar.z).get(), (pcm) ((xvf0) j4nVar.w).get());
                wgm wgmVar = (wgm) this.I;
                pgm pgmVar = (pgm) this.M;
                w3i w3iVar = ((mgm) obj3).a;
                lgm lgmVar = new lgm(qnhVar, ahmVar, (s0c0) ((xvf0) w3iVar.b).get(), (xcv0) ((xvf0) w3iVar.c).get(), (ggm) ((xvf0) w3iVar.w).get(), (wiq0) ((xvf0) w3iVar.x).get(), (tgm) ((xvf0) w3iVar.y).get(), (e) ((rs0) w3iVar.z).get(), (z4m0) ((ubq0) w3iVar.A).get(), (hwo0) ((p8k0) w3iVar.B).get());
                boj0 boj0Var = pgmVar.a;
                return new DriveTariffCardModalView((Context) ((ezf) wgmVar.a.a).get(), ahmVar, new DriveTariffCardCollapsedView((Context) ((ezf) boj0Var.b).get(), (String) ((xvf0) boj0Var.c).get(), lgmVar, (qgu0) ((xvf0) boj0Var.w).get(), (wdt0) ((xvf0) boj0Var.x).get(), (cj31) ((xvf0) boj0Var.y).get(), (zzi) ((xvf0) boj0Var.z).get()), new rgm((DriveHostView) ((ut) ((sgm) obj4).a.a).get(), ahmVar));
            default:
                ndl0 ndl0Var = new ndl0(29, this);
                sw2 sw2Var = new sw2(this, 1);
                bbr0 bbr0Var = (bbr0) obj5;
                ybr0 ybr0Var = ((zbr0) obj4).a;
                wbr0 wbr0Var = new wbr0(sw2Var, (kj10) ybr0Var.a.get(), (in10) ybr0Var.b.get(), (fk10) ybr0Var.c.get(), (ik10) ybr0Var.d.get(), (hk10) ybr0Var.e.get(), (q6r0) ybr0Var.f.get(), (r7r0) ybr0Var.g.get(), (q7r0) ybr0Var.h.get(), (v7j0) ybr0Var.i.get(), (ru.yandex.taxi.utils.b) ybr0Var.j.get(), (d1t) ybr0Var.k.get(), (x2r0) ybr0Var.l.get(), (x2r0) ybr0Var.m.get(), (as21) ybr0Var.n.get(), (qqt0) ybr0Var.o.get(), (aba0) ybr0Var.p.get(), (yaa0) ybr0Var.q.get(), (kt00) ybr0Var.r.get(), (q3g0) ybr0Var.s.get(), (rkv) ybr0Var.t.get(), (b0) ybr0Var.u.get(), (xdr0) ybr0Var.v.get(), (jer0) ybr0Var.w.get());
                NavigationDirection navigationDirection = ((gbr0) obj3).a;
                cjm0 cjm0Var = (cjm0) obj2;
                boolean z = ((hbr0) obj).a;
                wcr0 wcr0Var = (wcr0) cjm0Var.b;
                tig0 tig0Var = ((icr0) cjm0Var.c).a;
                SettingsProfileView settingsProfileView = new SettingsProfileView((Context) wcr0Var.a.a.get(), new hcr0(ndl0Var, (fcr0) ((uwn0) tig0Var.a).get(), (ul) ((ee) tig0Var.b).get()));
                if (z) {
                    settingsProfileView.disableProfile();
                }
                j410 j410Var = bbr0Var.a;
                return new SettingsModalView((Context) ((xvf0) j410Var.a).get(), settingsProfileView, navigationDirection, wbr0Var, (as21) ((xvf0) j410Var.b).get(), (j5z) ((xvf0) j410Var.c).get(), (v3u0) ((xvf0) j410Var.d).get(), (h) ((xvf0) j410Var.e).get(), (ney) ((xvf0) j410Var.f).get(), (ru.yandex.taxi.utils.b) ((xvf0) j410Var.g).get(), (xk60) ((xvf0) j410Var.h).get(), (g3g0) ((xvf0) j410Var.i).get(), (n8z) ((xvf0) j410Var.j).get(), (hiy0) ((xvf0) j410Var.k).get(), (c2x0) ((xvf0) j410Var.l).get(), (pwy0) ((xvf0) j410Var.m).get());
        }
    }

    public rrj(w030 w030Var, yvf0 yvf0Var, yvf0 yvf0Var2, oqj oqjVar, yvf0 yvf0Var3, asj asjVar, qqj qqjVar, yvf0 yvf0Var4, l3e l3eVar, zlf0 zlf0Var) {
        super(null);
        this.F = w030Var;
        this.G = yvf0Var;
        this.H = yvf0Var2;
        this.K = oqjVar;
        this.I = yvf0Var3;
        this.L = asjVar;
        this.M = qqjVar;
        this.J = yvf0Var4;
        this.N = l3eVar;
        this.O = zlf0Var;
    }

    public rrj(yvf0 yvf0Var, w030 w030Var, jj3 jj3Var, bbr0 bbr0Var, zbr0 zbr0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, oc60 oc60Var, yvf0 yvf0Var4, gbr0 gbr0Var, cjm0 cjm0Var) {
        super(null);
        this.F = w030Var;
        this.J = jj3Var;
        this.K = bbr0Var;
        this.L = zbr0Var;
        this.G = yvf0Var2;
        this.H = yvf0Var3;
        this.M = oc60Var;
        this.I = yvf0Var4;
        this.N = gbr0Var;
        this.O = cjm0Var;
    }
}
