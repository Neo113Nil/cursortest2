package ru.yandex.taxi.delivery.router.primary;

import android.content.Context;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.DeliveryInsuranceModal;
import com.yandex.go.zone.dto.objects.PaidOptions;
import com.yandex.go.zone.dto.objects.u2;
import defpackage.a6i;
import defpackage.ahi;
import defpackage.ati;
import defpackage.b6i;
import defpackage.b8r;
import defpackage.bb0;
import defpackage.bhh;
import defpackage.bli;
import defpackage.cii;
import defpackage.cli;
import defpackage.d030;
import defpackage.d6i;
import defpackage.d770;
import defpackage.dqe0;
import defpackage.eli;
import defpackage.evu0;
import defpackage.f030;
import defpackage.fhi;
import defpackage.gni;
import defpackage.gpa;
import defpackage.gsi;
import defpackage.h0i;
import defpackage.h1i;
import defpackage.h55;
import defpackage.h580;
import defpackage.hyf;
import defpackage.i130;
import defpackage.i3y;
import defpackage.iai;
import defpackage.igi;
import defpackage.ihi;
import defpackage.iii;
import defpackage.io9;
import defpackage.jl40;
import defpackage.jo0;
import defpackage.jst;
import defpackage.k9i;
import defpackage.kfi;
import defpackage.kki;
import defpackage.kzo;
import defpackage.lv90;
import defpackage.m5i;
import defpackage.m950;
import defpackage.mai;
import defpackage.mi31;
import defpackage.mki;
import defpackage.n330;
import defpackage.nbi;
import defpackage.nyf;
import defpackage.oy80;
import defpackage.oyr;
import defpackage.ozt0;
import defpackage.p1b;
import defpackage.pav;
import defpackage.pex0;
import defpackage.psi;
import defpackage.q5z;
import defpackage.qke;
import defpackage.r880;
import defpackage.r8i;
import defpackage.sls;
import defpackage.sy60;
import defpackage.t8i;
import defpackage.tje;
import defpackage.uci;
import defpackage.v920;
import defpackage.vaj0;
import defpackage.vli;
import defpackage.vsi;
import defpackage.w7i;
import defpackage.wwf;
import defpackage.xjg;
import defpackage.y5i;
import defpackage.yfa;
import defpackage.ygi;
import defpackage.yi70;
import defpackage.yki;
import defpackage.yzh;
import defpackage.zc;
import defpackage.zgi;
import defpackage.zki;
import defpackage.zof;
import defpackage.zsi;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.delivery.api.routers.PaidInsuranceScreenSource;
import ru.yandex.taxi.delivery.extracted_delivery_form.models.data.PaymentType;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;
import ru.yandex.taxi.delivery.impl.paid_insurance.d;
import ru.yandex.taxi.delivery.interactors.b;
import ru.yandex.taxi.delivery.router.primary.a;
import ru.yandex.taxi.delivery.ui.form.DeliveryFormModalView;
import ru.yandex.taxi.delivery.ui.form.e;
import ru.yandex.taxi.logistics.childrouter.api.ButtonType;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.DeliveryExplicitCommentCourierFlowType;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final class a extends h55 {
    public final dqe0 D;
    public final xjg E;
    public final d770 F;
    public final vaj0 G;
    public final nyf H;
    public final y5i I;
    public final ozt0 J;
    public final gsi K;
    public final d6i L;
    public final wwf M;
    public final b N;
    public final k9i O;
    public final nyf P;
    public final oy80 Q;
    public final zof R;
    public final nyf S;
    public final io9 T;
    public final yzh U;
    public boolean V;
    public final i3y W;
    public final m5i Z;

    public a(dqe0 dqe0Var, xjg xjgVar, d770 d770Var, vaj0 vaj0Var, nyf nyfVar, y5i y5iVar, ozt0 ozt0Var, gsi gsiVar, d6i d6iVar, wwf wwfVar, b bVar, k9i k9iVar, nyf nyfVar2, oy80 oy80Var, zof zofVar, nyf nyfVar3, io9 io9Var, yzh yzhVar) {
        super(null);
        this.D = dqe0Var;
        this.E = xjgVar;
        this.F = d770Var;
        this.G = vaj0Var;
        this.H = nyfVar;
        this.I = y5iVar;
        this.J = ozt0Var;
        this.K = gsiVar;
        this.L = d6iVar;
        this.M = wwfVar;
        this.N = bVar;
        this.O = k9iVar;
        this.P = nyfVar2;
        this.Q = oy80Var;
        this.R = zofVar;
        this.S = nyfVar3;
        this.T = io9Var;
        this.U = yzhVar;
        this.W = kotlin.a.a(new yki(this, 0));
        this.Z = new m5i(1, this);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        PaidOptions paidOptions;
        fhi fhiVar;
        y5i y5iVar = this.I;
        List b = this.D.b();
        String str = ((eli) obj).a;
        xjg xjgVar = this.E;
        gsi gsiVar = this.K;
        vsi e = gsiVar.e(str);
        w7i w7iVar = gsiVar.b;
        kfi b2 = gsiVar.b();
        List f = gsiVar.f(str);
        cii ciiVar = gsiVar.d;
        PaymentType a = ciiVar.a(gsiVar.e.a.c());
        lv90 e2 = gsiVar.e.a.e();
        u2 u2Var = null;
        PaymentType a2 = e2 != null ? ciiVar.a(e2) : null;
        w7iVar.getClass();
        zsi zsiVar = new zsi(w7i.a(b2, f, str, a, a2));
        bli bliVar = new bli(this);
        ozt0 ozt0Var = this.J;
        d770 d770Var = this.F;
        zof zofVar = this.R;
        a6i a6iVar = (a6i) xjgVar.b;
        ru.yandex.taxi.requirements.repository.a a3 = ((h580) xjgVar.c).a();
        ozt0Var.getClass();
        d770Var.getClass();
        zofVar.getClass();
        hyf hyfVar = new hyf(a6iVar, bliVar, e, ozt0Var, a3, zsiVar, d770Var, zofVar);
        if (y5iVar.h.size() == 0 || y5iVar.h.size() != b.size()) {
            if (b.isEmpty()) {
                U(hyfVar);
                jst.e.j(new IllegalStateException(oyr.h(b.size(), y5iVar.h.size(), "Delivery form can't be opened without destination; destinationsNumberFromHolder:", "; destinationsNumberFromDeliveryDataProvider:")));
                return;
            }
            y5iVar.o(qke.B(b));
        }
        oy80 oy80Var = this.Q;
        ygi ygiVar = (ygi) oy80Var.b;
        d dVar = (d) oy80Var.c;
        if (!((Boolean) dVar.c.getValue()).booleanValue()) {
            zgi a4 = ygiVar.a();
            ihi ihiVar = a4 != null ? a4.b : null;
            if (((ihiVar == null || (fhiVar = ihiVar.h) == null) ? null : fhiVar.b) != null) {
                pex0 m = ((k) ygiVar.a).m();
                if (m != null && (paidOptions = m.e0) != null) {
                    u2Var = paidOptions.f;
                }
                if ((u2Var instanceof DeliveryInsuranceModal ? ((DeliveryInsuranceModal) u2Var).a : 0) > dVar.b.i("KEY_DELIVERY_PAID_INSURANCE_SCREEN_SHOW_COUNT", 0)) {
                    A((m950) this.P.get(), new ahi(PaidInsuranceScreenSource.ORDER_BUTTON), new gpa(2, this, hyfVar, str));
                    return;
                }
            }
        }
        T(hyfVar, str);
    }

    public final void P(hyf hyfVar, String str) {
        pex0 pex0Var;
        ati atiVar;
        wwf wwfVar = this.M;
        mi31 d = b8r.d((b8r) wwfVar.a, str, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, 4);
        String str2 = (d == null || (pex0Var = d.a) == null || (atiVar = pex0Var.Z) == null) ? null : atiVar.a;
        if (str2 == null) {
            U(hyfVar);
        } else {
            if (this.V) {
                return;
            }
            this.V = true;
            ((gni) wwfVar.c).b();
            tje.N(o(), null, null, new DeliveryPrimaryRouterImpl$createOrderImmediately$1$1(this, str2, str, hyfVar, null), 3).w(new bhh(22, this));
        }
    }

    public final void Q(hyf hyfVar, String str) {
        if (!((Boolean) this.L.a.b()).booleanValue()) {
            y5i y5iVar = ((kki) hyfVar.H.get()).a;
            String str2 = y5iVar.h.size() > 0 ? y5iVar.m(y5iVar.h.size() - 1).a.b : null;
            if (str2 == null || evu0.J(str2)) {
                R(hyfVar, null, new zki(this, hyfVar, 1));
                return;
            }
        }
        vaj0 vaj0Var = this.G;
        kzo e = vaj0Var.a.e(str);
        if (e != null && jl40.l(vaj0Var.b.b.a.getValue(), t8i.a.b) && e.b) {
            A((m950) this.H.get(), new r8i(str, DeliveryExplicitCommentCourierFlowType.REQUIRED_COMMENT, null), new cli(this, hyfVar));
        } else {
            S(hyfVar);
        }
    }

    public final void R(hyf hyfVar, String str, sls slsVar) {
        Object obj;
        String str2;
        String str3;
        ArrayList arrayList = hyfVar.c.d;
        DeliveryFormStepType deliveryFormStepType = DeliveryFormStepType.DESTINATION;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((b6i) obj).b == deliveryFormStepType) {
                    break;
                }
            }
        }
        b6i b6iVar = (b6i) obj;
        iai iaiVar = new iai((uci) hyfVar.t0.get(), hyfVar.d, (iii) hyfVar.n0.get());
        if (b6iVar == null || (str2 = b6iVar.d) == null) {
            str2 = "";
        }
        A((h1i) hyfVar.W.get(), iai.a(iaiVar, str2, b6iVar != null ? b6iVar.e : null, deliveryFormStepType, null, (b6iVar == null || (str3 = b6iVar.f) == null) ? "" : str3, slsVar, new bhh(21, hyfVar), new zki(this, hyfVar, 0), false, str, 264), sy60.Q2);
    }

    public final void S(h0i h0iVar) {
        hyf hyfVar = (hyf) h0iVar;
        a6i a6iVar = hyfVar.a;
        i130 i130Var = a6iVar.b;
        q5z.h(i130Var);
        Context context = a6iVar.m;
        q5z.h(context);
        pav pavVar = a6iVar.o;
        q5z.h(pavVar);
        e eVar = (e) hyfVar.G0.get();
        mki mkiVar = (mki) hyfVar.J0.get();
        mai maiVar = (mai) hyfVar.a0.get();
        ru.yandex.taxi.design.utils.a aVar = a6iVar.K;
        q5z.h(aVar);
        A(new zc(7, i130Var, new DeliveryFormModalView(context, pavVar, eVar, mkiVar, maiVar, aVar)), zy11.a, new bb0(this, 29));
    }

    public final void T(final hyf hyfVar, final String str) {
        pex0 pex0Var;
        ati atiVar;
        mi31 d = b8r.d((b8r) this.M.a, str, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, 4);
        igi igiVar = (d == null || (pex0Var = d.a) == null || (atiVar = pex0Var.Z) == null) ? null : atiVar.k;
        if (igiVar == null) {
            Q(hyfVar, str);
            return;
        }
        psi psiVar = igiVar.c;
        vli vliVar = igiVar.b;
        r880 r880Var = psiVar != null ? psiVar.b : null;
        if (r880Var != null) {
            p1b p1bVar = new p1b(this.Z, new yfa((v920) this.T.a));
            n330 n330Var = new n330(r880Var.a);
            String str2 = r880Var.b;
            f030 f030Var = new f030(null, n330Var, str2 != null ? new n330(str2) : null, new d030(new n330(r880Var.d.a)), new d030(new n330(r880Var.c.a)));
            ButtonType buttonType = ButtonType.BACK;
            final int i = 0;
            sls slsVar = new sls(this) { // from class: ali
                public final /* synthetic */ a b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int i2 = i;
                    zy11 zy11Var = zy11.a;
                    String str3 = str;
                    hyf hyfVar2 = hyfVar;
                    a aVar = this.b;
                    switch (i2) {
                        case 0:
                            b1 b1Var = (b1) aVar.U.a;
                            b1Var.a.a("Delivery.FastFlow.DetailsCard.Tapped", x4e.p("selected_option", "request_now"), 1, new HashMap());
                            aVar.P(hyfVar2, str3);
                            break;
                        default:
                            b1 b1Var2 = (b1) aVar.U.a;
                            b1Var2.a.a("Delivery.FastFlow.DetailsCard.Tapped", x4e.p("selected_option", "details_first"), 1, new HashMap());
                            aVar.Q(hyfVar2, str3);
                            break;
                    }
                    return zy11Var;
                }
            };
            final int i2 = 1;
            p1bVar.j(f030Var, buttonType, slsVar, new sls(this) { // from class: ali
                public final /* synthetic */ a b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int i22 = i2;
                    zy11 zy11Var = zy11.a;
                    String str3 = str;
                    hyf hyfVar2 = hyfVar;
                    a aVar = this.b;
                    switch (i22) {
                        case 0:
                            b1 b1Var = (b1) aVar.U.a;
                            b1Var.a.a("Delivery.FastFlow.DetailsCard.Tapped", x4e.p("selected_option", "request_now"), 1, new HashMap());
                            aVar.P(hyfVar2, str3);
                            break;
                        default:
                            b1 b1Var2 = (b1) aVar.U.a;
                            b1Var2.a.a("Delivery.FastFlow.DetailsCard.Tapped", x4e.p("selected_option", "details_first"), 1, new HashMap());
                            aVar.Q(hyfVar2, str3);
                            break;
                    }
                    return zy11Var;
                }
            }, new yki(this, i2), new yki(this, 2));
            return;
        }
        nbi nbiVar = igiVar.a;
        if (nbiVar == null && vliVar == null) {
            P(hyfVar, str);
            return;
        }
        if (vliVar != null) {
            yi70 yi70Var = vliVar.a;
            R(hyfVar, yi70Var != null ? yi70Var.a : null, new jo0(10, igiVar, this, hyfVar, str));
        } else if (vliVar != null || nbiVar == null) {
            S(hyfVar);
        } else {
            S(hyfVar);
        }
    }

    public final void U(h0i h0iVar) {
        ((hyf) h0iVar).b.a();
        i();
    }
}
