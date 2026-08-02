package ru.yandex.taxi.logistics.common;

import androidx.lifecycle.Lifecycle;
import com.yandex.delivery.mapper.model.Expansion;
import com.yandex.go.address.models.Address;
import com.yandex.go.dto.response.Action$SummaryRedirect;
import com.yandex.go.mainscreen.superapp.impl.foundation.domain.g;
import com.yandex.go.models.SummaryRedirectActionModel;
import com.yandex.go.models.b;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import defpackage.a7t0;
import defpackage.apf;
import defpackage.arv0;
import defpackage.awr0;
import defpackage.bhv0;
import defpackage.c4r0;
import defpackage.c4w0;
import defpackage.c8r;
import defpackage.ck31;
import defpackage.dab1;
import defpackage.dqe0;
import defpackage.egz;
import defpackage.evu0;
import defpackage.fnx0;
import defpackage.fre0;
import defpackage.fse0;
import defpackage.gnx0;
import defpackage.hc00;
import defpackage.hre0;
import defpackage.hxx;
import defpackage.ic00;
import defpackage.jc00;
import defpackage.jjv0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.k9s0;
import defpackage.kc00;
import defpackage.kpi0;
import defpackage.lre0;
import defpackage.m30;
import defpackage.m950;
import defpackage.mi31;
import defpackage.mjx0;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.pzr0;
import defpackage.pzt0;
import defpackage.qsi;
import defpackage.rsi;
import defpackage.snv0;
import defpackage.ssi;
import defpackage.tje;
import defpackage.tli0;
import defpackage.tse;
import defpackage.tsi;
import defpackage.usi;
import defpackage.vnv0;
import defpackage.vpe0;
import defpackage.w511;
import defpackage.xaj0;
import defpackage.yaj0;
import defpackage.ynv0;
import defpackage.yqv0;
import defpackage.yvf0;
import defpackage.zvg;
import defpackage.zzs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final class a implements qsi {
    public final tse a;
    public final dqe0 b;
    public final ck31 c;
    public final jjv0 d;
    public final arv0 e;
    public final oep0 f;
    public final jc00 g;
    public final b h;
    public final c4r0 i;
    public final yvf0 j;
    public final kpi0 k;
    public final c8r l;
    public final yaj0 m;
    public final g n;
    public final mjx0 o;
    public final m30 p;
    public final c4w0 q;
    public final ArrayList r;
    public pzt0 s;

    public a(Lifecycle lifecycle, tse tseVar, dqe0 dqe0Var, ck31 ck31Var, jjv0 jjv0Var, arv0 arv0Var, oep0 oep0Var, jc00 jc00Var, b bVar, c4r0 c4r0Var, yvf0 yvf0Var, kpi0 kpi0Var, c8r c8rVar, yaj0 yaj0Var, g gVar, mjx0 mjx0Var, m30 m30Var, c4w0 c4w0Var) {
        this.a = tseVar;
        this.b = dqe0Var;
        this.c = ck31Var;
        this.d = jjv0Var;
        this.e = arv0Var;
        this.f = oep0Var;
        this.g = jc00Var;
        this.h = bVar;
        this.i = c4r0Var;
        this.j = yvf0Var;
        this.k = kpi0Var;
        this.l = c8rVar;
        this.m = yaj0Var;
        this.n = gVar;
        this.o = mjx0Var;
        this.p = m30Var;
        this.q = c4w0Var;
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        lifecycle.a(new tsi(arrayList));
    }

    public final void a(boolean z, snv0 snv0Var, String str) {
        Expansion expansion = Expansion.ANCHORED;
        mi31 a = this.l.a(str, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, null);
        String str2 = a != null ? a.f : null;
        if (str2 == null) {
            str2 = "";
        }
        c(new tli0(TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, true, expansion, str2, z, snv0Var, 48), EmptyList.a);
    }

    public final void b(ynv0 ynv0Var) {
        k9s0 k9s0Var = k9s0.f;
        this.d.getClass();
        k9s0 H = egz.H(null, jjv0.a(ynv0Var), 3);
        ((pep0) this.f).f((m950) this.j.get(), new hre0(new vpe0(this.b.a), new fse0(H), "show payments from delivery", true, dab1.b), hxx.a);
    }

    public final void c(tli0 tli0Var, List list) {
        Action$SummaryRedirect.State state;
        Object value;
        yqv0 yqv0Var;
        boolean z = tli0Var.g;
        ynv0 ynv0Var = tli0Var.h;
        String str = tli0Var.d;
        String str2 = tli0Var.a;
        tse tseVar = this.a;
        c4r0 c4r0Var = this.i;
        if (z) {
            pzt0 pzt0Var = this.s;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            if (tli0Var.b) {
                yqv0Var = new yqv0(SummaryUiState$Type.TRAP, str2 == null ? TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY : str2);
            } else {
                yqv0Var = new yqv0(SummaryUiState$Type.NORMAL, "");
            }
            ((a7t0) this.e).b(yqv0Var);
            if (str != null) {
                if (evu0.J(str)) {
                    str = null;
                }
                if (str != null) {
                    SelectionOrigin selectionOrigin = SelectionOrigin.DELIVERY_CANCEL;
                    if (str2 == null) {
                        str2 = TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY;
                    }
                    c4r0Var.b(selectionOrigin, str, str2, true);
                }
            }
            if (ynv0Var != null) {
                b(ynv0Var);
                return;
            } else {
                this.s = tje.N(tseVar, null, null, new DeliverySummaryRouterImpl$openPaymentMethodsAsync$1(this, null), 3);
                return;
            }
        }
        jc00 jc00Var = this.g;
        if (ynv0Var == null) {
            ic00 ic00Var = ((kc00) jc00Var).a;
            ic00Var.getClass();
            if (ic00Var instanceof hc00) {
                ynv0Var = new vnv0(null, null);
            }
        }
        ynv0 ynv0Var2 = ynv0Var;
        String str3 = str == null ? "" : str;
        String str4 = str2 == null ? "" : str2;
        int i = usi.a[tli0Var.c.ordinal()];
        SummaryRedirectActionModel.State state2 = i != 1 ? i != 2 ? SummaryRedirectActionModel.State.ANCHORED : SummaryRedirectActionModel.State.ANCHORED : SummaryRedirectActionModel.State.EXPANDED;
        boolean z2 = tli0Var.b;
        apf apfVar = tli0Var.f;
        SummaryRedirectActionModel summaryRedirectActionModel = new SummaryRedirectActionModel(str3, str4, state2, z2, apfVar != null ? new SummaryRedirectActionModel.a((zzs) apfVar.b, (String) apfVar.c, (String) apfVar.w, (Address) apfVar.x) : null, null, false, ynv0Var2, list, 96);
        this.h.getClass();
        int i2 = com.yandex.go.models.a.b[summaryRedirectActionModel.c.ordinal()];
        if (i2 == 1) {
            state = Action$SummaryRedirect.State.COLLAPSED;
        } else if (i2 == 2) {
            state = Action$SummaryRedirect.State.EXPANDED;
        } else {
            if (i2 != 3) {
                w511.b();
                return;
            }
            state = Action$SummaryRedirect.State.ANCHORED;
        }
        Action$SummaryRedirect.State state3 = state;
        SummaryRedirectActionModel.a aVar = summaryRedirectActionModel.e;
        ssi ssiVar = new ssi(new Action$SummaryRedirect(summaryRedirectActionModel.a, summaryRedirectActionModel.b, state3, summaryRedirectActionModel.d, aVar != null ? new Action$SummaryRedirect.Destination(aVar.a, aVar.b, aVar.c) : null, summaryRedirectActionModel.f, summaryRedirectActionModel.g));
        c8r c8rVar = this.l;
        String str5 = summaryRedirectActionModel.a;
        String str6 = summaryRedirectActionModel.b;
        mi31 a = c8rVar.a(str5, str6, null);
        if (a != null && jl40.l(a.f, str5)) {
            c4r0Var.a(new gnx0(new fnx0(a, SelectionOrigin.ACTION), true));
        }
        r0 r0Var = this.m.a.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, new xaj0(str5, str6)));
        ic00 ic00Var2 = ((kc00) jc00Var).a;
        ic00Var2.getClass();
        boolean z3 = ic00Var2 instanceof hc00;
        ArrayList arrayList = this.r;
        if (z3) {
            arrayList.add(new rsi(com.yandex.go.coroutines.b.g(tseVar, null, null, new DeliverySummaryRouterImpl$openSummary$openSummaryJob$1(this, summaryRedirectActionModel, ssiVar, null), 3), 1));
            return;
        }
        WeakReference weakReference = this.p.a;
        pzr0 pzr0Var = weakReference != null ? (pzr0) weakReference.get() : null;
        if (pzr0Var == null) {
            jst.e.getClass();
        } else {
            arrayList.add(pzr0Var.b(new awr0(summaryRedirectActionModel, ssiVar, new zvg(23, this, summaryRedirectActionModel))));
        }
    }

    public final void d(String str) {
        snv0 snv0Var = snv0.a;
        ic00 ic00Var = ((kc00) this.g).a;
        ic00Var.getClass();
        if (!(ic00Var instanceof hc00)) {
            a(false, snv0Var, str);
            return;
        }
        Preorder preorder = new Preorder(0);
        preorder.l(this.b.a.G);
        this.k.b();
        preorder.i(this.k.a());
        preorder.j(this.k.c.a.e());
        ((a7t0) this.e).b(new yqv0(SummaryUiState$Type.TRAP, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY));
        fre0 fre0Var = (fre0) this.j.get();
        ((pep0) this.f).f(fre0Var, new lre0(preorder, "open summary from delivery router with super-app main screen case", snv0Var, new bhv0(0)), hxx.a);
        this.r.add(new rsi(com.yandex.go.coroutines.b.g(this.a, null, null, new DeliverySummaryRouterImpl$openSummaryWithSuperAppMainScreenCase$openSummaryWithRedirectJob$1(this, str, fre0Var, null), 3), 0));
    }
}
