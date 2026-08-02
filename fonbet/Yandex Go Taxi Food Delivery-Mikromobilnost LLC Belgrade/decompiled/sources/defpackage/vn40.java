package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.tariffcard.ui.r0;
import com.yandex.go.taxi.summary.shared.expanded.repository.c;
import com.yandex.go.taxi.tariffs.repository.g;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.preorder.summary.tariffpage.data.d;
import ru.yandex.taxi.preorder.summary.tariffpage.data.holder.a;
import ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e;
import ru.yandex.taxi.requirements.ui.bubbles.RequirementsBubblesContainer;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class vn40 extends e {
    public final TextView A0;
    public final View B0;
    public final LinearLayout C0;
    public final ViewGroup D0;
    public final RecyclerView E0;
    public final wrr F0;
    public final d G0;
    public final qhx0 H0;
    public final r0 I0;
    public final int J0;
    public final int K0;
    public final uk10 L0;
    public final fva0 v0;
    public final a w0;
    public final View x0;
    public final TextView y0;
    public final TextView z0;

    public vn40(View view, ykx0 ykx0Var, SummaryStateTracker summaryStateTracker, ppw0 ppw0Var, dkx0 dkx0Var, c cVar, vm6 vm6Var, yvf0 yvf0Var, ao4 ao4Var, fva0 fva0Var, g gVar, pav pavVar, ru.yandex.taxi.orderbutton.summary.solid.interactors.c cVar2, ff9 ff9Var, com.yandex.go.taxi.auction.domain.a aVar, z0a0 z0a0Var, ru.yandex.taxi.preorder.summary.tariffpage.data.holder.d dVar, ajj0 ajj0Var, vev0 vev0Var, mqv0 mqv0Var, ru.yandex.taxi.widget.c cVar3, en6 en6Var, pwy0 pwy0Var, rqo rqoVar, ico icoVar, a aVar2) {
        super(view, summaryStateTracker, ppw0Var, dkx0Var, cVar, vm6Var, ajj0Var, dVar, cVar2, ff9Var, aVar, z0a0Var, yvf0Var, vev0Var, cVar3, en6Var, pwy0Var);
        this.v0 = fva0Var;
        this.w0 = aVar2;
        this.x0 = (View) rp31.d(view, yfh0.tariff_info_container);
        this.y0 = (TextView) ((View) rp31.d(view, yfh0.solid_tariff_page_name));
        this.z0 = (TextView) ((View) rp31.d(view, yfh0.solid_tariff_page_subtitle));
        this.A0 = (TextView) ((View) rp31.d(view, yfh0.solid_tariff_page_eta));
        this.B0 = (View) rp31.d(view, yfh0.multi_tariff_rest_content_divider);
        LinearLayout linearLayout = (LinearLayout) ((View) rp31.d(view, yfh0.badges_container));
        this.C0 = linearLayout;
        ViewGroup viewGroup = (ViewGroup) ((View) rp31.d(view, yfh0.multi_tariff_options));
        this.D0 = viewGroup;
        RecyclerView recyclerView = (RecyclerView) ((View) rp31.d(view, yfh0.requirements_recycler_view));
        this.E0 = recyclerView;
        this.J0 = tje.r(mrg0.go_design_m_space, view.getContext());
        this.K0 = tje.r(mrg0.go_design_s_space, view.getContext());
        this.L0 = new uk10(this);
        this.F0 = new wrr(viewGroup, new h45(1, gVar), pavVar, mqv0Var, ((jbh) rqoVar).a(SimpleBooleanExperiment.MULTICLASS_TARIFF_CARD_ETA), icoVar);
        this.G0 = ao4Var.a(linearLayout, cVar);
        qhx0 b = aVar2.b();
        this.H0 = b;
        recyclerView.setAdapter(b);
        RequirementsBubblesContainer requirementsBubblesContainer = (RequirementsBubblesContainer) ((View) rp31.d(view, yfh0.multi_tariff_page_bubbles_container));
        requirementsBubblesContainer.init(pavVar);
        requirementsBubblesContainer.updateBubblesPadding(tje.u(4, view.getContext()), 0);
        a0(requirementsBubblesContainer);
        this.I0 = ykx0Var.a.a(cVar, (DialogueComponent) ((View) rp31.d(view, yfh0.multi_tariff_page_dialogue)), yfh0.multi_tariff_page_dialogue_header);
    }

    @Override // ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e
    public final void W(ikx0 ikx0Var, ikx0 ikx0Var2) {
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Bind;
        fva0.f(this.v0, "TariffPagerView.ViewHolder.Multiclass", performanceAnalytics$Type, 0L, 4);
        super.W(ikx0Var, ikx0Var2);
        String str = ikx0Var2.o;
        String str2 = ikx0Var2.f;
        String str3 = ikx0Var2.c;
        if (ikx0Var == null || ikx0Var2.u != ikx0Var.u || !jl40.l(ikx0Var2.b, ikx0Var.b)) {
            this.F0.e(ikx0Var2);
        }
        TextView textView = this.y0;
        if (ikx0Var == null || !str3.equals(ikx0Var.c)) {
            textView.setText(str3);
        }
        TextView textView2 = this.z0;
        if (ikx0Var == null || !str2.equals(ikx0Var.f)) {
            textView2.setText(str2);
        }
        TextView textView3 = this.A0;
        if (ikx0Var == null || !jl40.l(str, ikx0Var.o)) {
            textView3.setText(str);
        }
        c0(((Number) this.G0.k.getValue()).intValue());
        OneShotPreDrawListener.add(textView, new ii30(5, this));
        if (ikx0Var == null) {
            int c = ru.yandex.taxi.design.utils.c.c(xng0.textMain, this.a);
            textView3.setTextColor(c);
            textView2.setTextColor(c);
            textView.setTextColor(c);
        }
        fva0.b(this.v0, "TariffPagerView.ViewHolder.Multiclass", performanceAnalytics$Type, null, 4);
    }

    @Override // ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e
    public final void Y() {
        super.Y();
        t690 t690Var = this.m0;
        wrr wrrVar = this.F0;
        wrrVar.getClass();
        wrrVar.A = new uhx(22, t690Var);
        this.I0.a();
        this.G0.a(this.L0);
        this.w0.a(this.H0);
    }

    @Override // ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e
    public final void Z() {
        super.Z();
        this.j0.scrollTo(0, 0);
        wrr wrrVar = this.F0;
        wrrVar.getClass();
        wrrVar.A = new zm40();
        this.I0.g.b();
        this.G0.j.b();
        a aVar = this.w0;
        aVar.d = null;
        aVar.c.b();
    }

    @Override // ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e
    public final void applyTheme(ThemeType themeType) {
        this.H0.applyTheme(themeType);
        this.E0.setBackgroundColor(ru.yandex.taxi.design.utils.c.c(xng0.bgMain, this.a));
    }

    public final void c0(int i) {
        View view = this.B0;
        ViewGroup viewGroup = this.D0;
        LinearLayout linearLayout = this.C0;
        View view2 = this.x0;
        if (i > 0) {
            xw31.y(this.J0, view2);
            view2.setBackgroundResource(f1h0.round_section_bg_top);
            linearLayout.setBackgroundResource(f1h0.round_section_bg_top);
            viewGroup.setBackgroundResource(f1h0.round_section_bg_bottom);
            view.setVisibility(0);
            return;
        }
        xw31.y(this.K0, view2);
        view2.setBackgroundResource(f1h0.round_section_bg_top);
        linearLayout.setBackground(null);
        viewGroup.setBackgroundResource(f1h0.round_section_bg_bottom);
        view.setVisibility(8);
    }
}
