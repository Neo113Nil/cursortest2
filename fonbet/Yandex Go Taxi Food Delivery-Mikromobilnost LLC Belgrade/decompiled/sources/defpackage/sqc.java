package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.tariffcard.ui.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.delivery.impl.requirement.special.a;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.preorder.summary.altchoice.ui.c;
import ru.yandex.taxi.preorder.summary.tariffpage.data.d;
import ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e;
import ru.yandex.taxi.requirements.glued.ui.image.i;
import ru.yandex.taxi.requirements.glued.ui.ui.b;
import ru.yandex.taxi.requirements.ui.bubbles.RequirementsBubblesContainer;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class sqc extends e {
    public static final /* synthetic */ int T0 = 0;
    public final View A0;
    public final View B0;
    public final View C0;
    public final ViewGroup D0;
    public final RecyclerView E0;
    public final pkt F0;
    public final c G0;
    public final a H0;
    public final d I0;
    public final qhx0 J0;
    public final xjg K0;
    public final vxk0 L0;
    public final ru.yandex.taxi.requirements.glued.ui.ui.a M0;
    public final r0 N0;
    public Runnable O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public final c29 S0;
    public final fva0 v0;
    public final ru.yandex.taxi.preorder.summary.tariffpage.data.holder.a w0;
    public final TextView x0;
    public final TextView y0;
    public final View z0;

    public sqc(View view, ykx0 ykx0Var, jkt jktVar, y9j0 y9j0Var, SummaryStateTracker summaryStateTracker, ppw0 ppw0Var, dkx0 dkx0Var, com.yandex.go.taxi.summary.shared.expanded.repository.c cVar, vm6 vm6Var, pav pavVar, yvf0 yvf0Var, ao4 ao4Var, b bVar, spi spiVar, fva0 fva0Var, ru.yandex.taxi.orderbutton.summary.solid.interactors.c cVar2, ff9 ff9Var, com.yandex.go.taxi.auction.domain.a aVar, z0a0 z0a0Var, ru.yandex.taxi.preorder.summary.tariffpage.data.holder.d dVar, ajj0 ajj0Var, c9i c9iVar, vev0 vev0Var, ru.yandex.taxi.widget.c cVar3, en6 en6Var, pwy0 pwy0Var, ru.yandex.taxi.preorder.summary.tariffpage.data.holder.a aVar2) {
        super(view, summaryStateTracker, ppw0Var, dkx0Var, cVar, vm6Var, ajj0Var, dVar, cVar2, ff9Var, aVar, z0a0Var, yvf0Var, vev0Var, cVar3, en6Var, pwy0Var);
        this.v0 = fva0Var;
        this.w0 = aVar2;
        this.x0 = (TextView) ((View) rp31.d(view, yfh0.solid_tariff_page_name));
        this.y0 = (TextView) ((View) rp31.d(view, yfh0.solid_tariff_page_eta));
        this.z0 = (View) rp31.d(view, yfh0.solid_tariff_page_glued_bottom_divider);
        this.A0 = (View) rp31.d(view, yfh0.solid_tariff_page_alt_choice_bottom_divider);
        this.B0 = (View) rp31.d(view, yfh0.special_requirements_bottom_divider);
        this.C0 = (View) rp31.d(view, yfh0.common_tariff_rest_content_divider);
        ViewGroup viewGroup = (ViewGroup) ((View) rp31.d(view, yfh0.special_requirements_container));
        this.D0 = viewGroup;
        RecyclerView recyclerView = (RecyclerView) ((View) rp31.d(view, yfh0.requirements_recycler_view));
        this.E0 = recyclerView;
        this.O0 = new vpa(1);
        this.S0 = new c29(27, this);
        vxk0 vxk0Var = new vxk0(view.getContext());
        this.L0 = vxk0Var;
        ViewGroup viewGroup2 = (ViewGroup) ((View) rp31.d(view, yfh0.solid_tariff_page_glued_container));
        this.F0 = (pkt) vub1.d(jktVar, viewGroup2).a.get();
        ViewGroup viewGroup3 = (ViewGroup) ((View) rp31.d(view, yfh0.solid_tariff_page_alt_choice_container));
        this.G0 = (c) m83.b(y9j0Var, viewGroup3, new rqc(this, 0)).b.get();
        LinearLayout linearLayout = (LinearLayout) ((View) rp31.d(view, yfh0.badges_container));
        this.I0 = ao4Var.a(linearLayout, cVar);
        qhx0 b = aVar2.b();
        this.J0 = b;
        recyclerView.setAdapter(b);
        this.M0 = bVar.a((ImageView) ((View) rp31.d(view, yfh0.solid_tariff_page_car_image)), (RecyclerView) ((View) rp31.d(view, yfh0.solid_tariff_page_options_container)), (View) rp31.d(view, yfh0.solid_tariff_page_next), null, new v4a(17, this));
        RequirementsBubblesContainer requirementsBubblesContainer = (RequirementsBubblesContainer) ((View) rp31.d(view, yfh0.common_tariff_page_bubbles_container));
        requirementsBubblesContainer.init(pavVar);
        requirementsBubblesContainer.updateBubblesPadding(tje.u(4, view.getContext()), tje.u(4, view.getContext()));
        a0(requirementsBubblesContainer);
        View view2 = (View) rp31.d(view, yfh0.tariff_info_container);
        uxk0 uxk0Var = new uxk0(56, false, j73.d0(new View[]{viewGroup}));
        uxk0[] uxk0VarArr = {new uxk0(28, true, j73.d0(new View[]{viewGroup3})), new uxk0(56, true, j73.d0(new View[]{viewGroup2})), new uxk0(56, false, j73.d0(new View[]{linearLayout}))};
        ArrayList arrayList = vxk0Var.d;
        arrayList.add(uxk0Var);
        ycc.t(arrayList, uxk0VarArr);
        this.K0 = new xjg(c9iVar, (View) rp31.d(view, yfh0.solid_summary_delivery_explicit_comment_courier_requirement_stub));
        this.H0 = spiVar.a();
        this.N0 = ykx0Var.a.a(cVar, (DialogueComponent) ((View) rp31.d(view, yfh0.common_tariff_page_dialogue)), yfh0.common_tariff_page_dialogue_header);
        ru.yandex.taxi.design.utils.c.z(new l7b(26, this), view2);
    }

    @Override // ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e
    public final void W(ikx0 ikx0Var, ikx0 ikx0Var2) {
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Bind;
        fva0.f(this.v0, "TariffPagerView.ViewHolder.Common", performanceAnalytics$Type, 0L, 4);
        super.W(ikx0Var, ikx0Var2);
        String str = ikx0Var2.o;
        String str2 = ikx0Var2.c;
        List list = ikx0Var2.i;
        TextView textView = this.x0;
        if (ikx0Var == null || !str2.equals(ikx0Var.c)) {
            textView.setText(str2);
        }
        TextView textView2 = this.y0;
        if (ikx0Var == null || !jl40.l(str, ikx0Var.o)) {
            textView2.setText(str);
        }
        boolean z = ikx0Var2.x;
        this.O0 = z ? new l7a(16, this, ikx0Var2) : new vpa(1);
        String str3 = ikx0Var2.d;
        if (str3 == null) {
            str3 = "";
        }
        ru.yandex.taxi.requirements.glued.ui.ui.a aVar = this.M0;
        i iVar = aVar.d;
        iVar.o = z;
        kotlinx.coroutines.flow.r0 r0Var = iVar.h;
        l58 l58Var = new l58(str3, list);
        r0Var.getClass();
        r0Var.m(null, l58Var);
        View view = aVar.b;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
        this.F0.a(list);
        this.Q0 = ikx0Var2.v;
        boolean z2 = !list.isEmpty();
        this.P0 = z2;
        boolean z3 = ikx0Var2.w;
        this.R0 = z3;
        c0(((Number) this.I0.k.getValue()).intValue(), z2, this.Q0, z3);
        OneShotPreDrawListener.add(textView, new uz(19, this));
        if (ikx0Var == null) {
            int c = ru.yandex.taxi.design.utils.c.c(xng0.textMain, this.a);
            textView2.setTextColor(c);
            textView.setTextColor(c);
        }
        kb5 kb5Var = ikx0Var2.b;
        this.K0.a(kb5Var.b, kb5Var.d);
        fva0.b(this.v0, "TariffPagerView.ViewHolder.Common", performanceAnalytics$Type, null, 4);
    }

    @Override // ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e
    public final void X() {
        super.X();
        c cVar = this.G0;
        EmptyList emptyList = EmptyList.a;
        cVar.b(emptyList);
        this.F0.a(emptyList);
        this.M0.d.getClass();
    }

    @Override // ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e
    public final void Y() {
        super.Y();
        this.M0.d.a();
        this.N0.a();
        this.I0.a(this.S0);
        this.G0.a(this.Q);
        this.H0.a(this.D0);
        this.w0.a(this.J0);
    }

    @Override // ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e
    public final void Z() {
        super.Z();
        this.j0.scrollTo(0, 0);
        this.M0.d.g.b();
        this.N0.g.b();
        this.I0.j.b();
        this.G0.f.b();
        a aVar = this.H0;
        ViewGroup viewGroup = aVar.f;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        aVar.e.b();
        ru.yandex.taxi.preorder.summary.tariffpage.data.holder.a aVar2 = this.w0;
        aVar2.d = null;
        aVar2.c.b();
    }

    @Override // ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e
    public final void applyTheme(ThemeType themeType) {
        this.J0.applyTheme(themeType);
        this.E0.setBackgroundColor(ru.yandex.taxi.design.utils.c.c(xng0.bgMain, this.a));
    }

    public final void c0(int i, boolean z, boolean z2, boolean z3) {
        bdc bdcVar = this.l0;
        View view = this.a;
        View view2 = this.z0;
        if (z) {
            view2.setVisibility(0);
            view2.setBackgroundColor(ru.yandex.taxi.design.utils.c.x(view, bdcVar));
        } else {
            view2.setVisibility(8);
        }
        View view3 = this.A0;
        if (!z2) {
            view3.setVisibility(8);
        } else if (z) {
            view3.setVisibility(8);
        } else {
            view3.setVisibility(0);
            view3.setBackgroundColor(ru.yandex.taxi.design.utils.c.x(view, bdcVar));
        }
        View view4 = this.B0;
        if (!z3 || z2 || z) {
            view4.setVisibility(8);
        } else {
            view4.setVisibility(0);
            view4.setBackgroundColor(ru.yandex.taxi.design.utils.c.x(view, bdcVar));
        }
        View view5 = this.C0;
        if (i <= 0 || z || z2) {
            view5.setVisibility(8);
        } else {
            view5.setVisibility(0);
            view5.setBackgroundColor(ru.yandex.taxi.design.utils.c.x(view, bdcVar));
        }
        this.L0.b();
    }
}
