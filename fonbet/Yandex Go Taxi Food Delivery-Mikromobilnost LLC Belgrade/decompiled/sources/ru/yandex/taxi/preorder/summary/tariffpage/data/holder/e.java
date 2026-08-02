package ru.yandex.taxi.preorder.summary.tariffpage.data.holder;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryCollapseReasonV2;
import com.yandex.go.taxi.auction.ui.AuctionView;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ajj0;
import defpackage.bdc;
import defpackage.c1f0;
import defpackage.c1x0;
import defpackage.czo0;
import defpackage.dkx0;
import defpackage.en6;
import defpackage.f1h0;
import defpackage.f6t0;
import defpackage.ff9;
import defpackage.hbp0;
import defpackage.hlx0;
import defpackage.ikx0;
import defpackage.jl40;
import defpackage.kb5;
import defpackage.kyh0;
import defpackage.m1a0;
import defpackage.mct0;
import defpackage.n0l0;
import defpackage.npw0;
import defpackage.ons0;
import defpackage.p81;
import defpackage.ppw0;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.qje;
import defpackage.rkb1;
import defpackage.rp31;
import defpackage.t690;
import defpackage.tje;
import defpackage.tse;
import defpackage.ug;
import defpackage.vev0;
import defpackage.vm6;
import defpackage.w0f0;
import defpackage.w511;
import defpackage.wwn;
import defpackage.x95;
import defpackage.xfh0;
import defpackage.xng0;
import defpackage.yfh0;
import defpackage.yvf0;
import defpackage.z0a0;
import defpackage.z0f0;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.a;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.design.button.OrderButtonComponent;
import ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e;
import ru.yandex.taxi.requirements.ui.bubbles.RequirementsBubblesContainer;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes6.dex */
public abstract class e extends x0 {
    public final SummaryStateTracker N;
    public final ppw0 O;
    public final dkx0 P;
    public final com.yandex.go.taxi.summary.shared.expanded.repository.c Q;
    public final vm6 R;
    public final ajj0 S;
    public final d T;
    public final ru.yandex.taxi.orderbutton.summary.solid.interactors.c U;
    public final ff9 V;
    public final com.yandex.go.taxi.auction.domain.a W;
    public final vev0 Z;
    public final ru.yandex.taxi.widget.c a0;
    public final en6 b0;
    public final pwy0 c0;
    public final ViewGroup d0;
    public final View e0;
    public final ViewGroup f0;
    public final View g0;
    public final View h0;
    public AuctionView i0;
    public final NestedScrollViewAdvanced j0;
    public final ShimmeringRobotoTextView k0;
    public final bdc l0;
    public t690 m0;
    public final f6t0 n0;
    public final hlx0 o0;
    public final hbp0 p0;
    public final ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination.d q0;
    public RequirementsBubblesContainer r0;
    public c1f0 s0;
    public c1f0 t0;
    public pzt0 u0;

    public e(View view, SummaryStateTracker summaryStateTracker, ppw0 ppw0Var, dkx0 dkx0Var, com.yandex.go.taxi.summary.shared.expanded.repository.c cVar, vm6 vm6Var, ajj0 ajj0Var, d dVar, ru.yandex.taxi.orderbutton.summary.solid.interactors.c cVar2, ff9 ff9Var, com.yandex.go.taxi.auction.domain.a aVar, z0a0 z0a0Var, yvf0 yvf0Var, vev0 vev0Var, ru.yandex.taxi.widget.c cVar3, en6 en6Var, pwy0 pwy0Var) {
        super(view);
        this.N = summaryStateTracker;
        this.O = ppw0Var;
        this.P = dkx0Var;
        this.Q = cVar;
        this.R = vm6Var;
        this.S = ajj0Var;
        this.T = dVar;
        this.U = cVar2;
        this.V = ff9Var;
        this.W = aVar;
        this.Z = vev0Var;
        this.a0 = cVar3;
        this.b0 = en6Var;
        this.c0 = pwy0Var;
        int i = yfh0.tariff_page_source_destination_container;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewGroup viewGroup = (ViewGroup) ((View) rp31.d(view, i));
        this.d0 = viewGroup;
        View view2 = (View) rp31.d(view, yfh0.summary_tariff_page_divider);
        this.e0 = view2;
        this.f0 = (ViewGroup) ((View) rp31.d(view, yfh0.select_destination_container));
        View view3 = (View) rp31.d(view, yfh0.tariff_info_container);
        this.g0 = view3;
        this.h0 = (View) rp31.d(view, yfh0.tariff_page_order_button_container);
        NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) ((View) rp31.d(view, xfh0.tariff_card_scroll_view));
        this.j0 = nestedScrollViewAdvanced;
        ShimmeringRobotoTextView shimmeringRobotoTextView = (ShimmeringRobotoTextView) ((View) rp31.d(view, yfh0.solid_tariff_page_price));
        this.k0 = shimmeringRobotoTextView;
        this.l0 = new bdc(xng0.cardDivider);
        this.m0 = wwn.b;
        CompositePaymentIconsView compositePaymentIconsView = (CompositePaymentIconsView) ((View) rp31.d(view, yfh0.tariff_page_payment_icon));
        OrderButtonComponent orderButtonComponent = (OrderButtonComponent) ((View) rp31.d(view, yfh0.tariff_page_order_button));
        View view4 = (View) rp31.d(view, yfh0.tariff_page_close_icon);
        final int i2 = 0;
        Runnable runnable = new Runnable(this) { // from class: skx0
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str;
                jn40 jn40Var;
                int i3 = i2;
                e eVar = this.b;
                switch (i3) {
                    case 0:
                        eVar.m0.b();
                        break;
                    case 1:
                        eVar.m0.f();
                        dkx0 dkx0Var2 = eVar.P;
                        String str2 = ((kb5) eVar.Q.c.getValue()).b;
                        xcv0 xcv0Var = dkx0Var2.c;
                        xcv0Var.g(str2, ((a7t0) dkx0Var2.b).a().b);
                        k kVar = (k) dkx0Var2.d;
                        pex0 m = kVar.m();
                        Set set = (m == null || (jn40Var = m.V) == null) ? null : jn40Var.f;
                        SummaryAnalytics$SummaryCollapseReasonV2 summaryAnalytics$SummaryCollapseReasonV2 = SummaryAnalytics$SummaryCollapseReasonV2.Automatic;
                        String h = kVar.h();
                        pex0 m2 = kVar.m();
                        if (m2 == null || (str = m2.b) == null) {
                            str = "";
                        }
                        xcv0Var.b(summaryAnalytics$SummaryCollapseReasonV2, h, str, set != null ? a.J0(set) : null);
                        break;
                    default:
                        eVar.m0.a();
                        break;
                }
            }
        };
        final int i3 = 1;
        Runnable runnable2 = new Runnable(this) { // from class: skx0
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str;
                jn40 jn40Var;
                int i32 = i3;
                e eVar = this.b;
                switch (i32) {
                    case 0:
                        eVar.m0.b();
                        break;
                    case 1:
                        eVar.m0.f();
                        dkx0 dkx0Var2 = eVar.P;
                        String str2 = ((kb5) eVar.Q.c.getValue()).b;
                        xcv0 xcv0Var = dkx0Var2.c;
                        xcv0Var.g(str2, ((a7t0) dkx0Var2.b).a().b);
                        k kVar = (k) dkx0Var2.d;
                        pex0 m = kVar.m();
                        Set set = (m == null || (jn40Var = m.V) == null) ? null : jn40Var.f;
                        SummaryAnalytics$SummaryCollapseReasonV2 summaryAnalytics$SummaryCollapseReasonV2 = SummaryAnalytics$SummaryCollapseReasonV2.Automatic;
                        String h = kVar.h();
                        pex0 m2 = kVar.m();
                        if (m2 == null || (str = m2.b) == null) {
                            str = "";
                        }
                        xcv0Var.b(summaryAnalytics$SummaryCollapseReasonV2, h, str, set != null ? a.J0(set) : null);
                        break;
                    default:
                        eVar.m0.a();
                        break;
                }
            }
        };
        final int i4 = 2;
        this.n0 = new f6t0(z0a0Var, compositePaymentIconsView, orderButtonComponent, view4, null, runnable, runnable2, new Runnable(this) { // from class: skx0
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str;
                jn40 jn40Var;
                int i32 = i4;
                e eVar = this.b;
                switch (i32) {
                    case 0:
                        eVar.m0.b();
                        break;
                    case 1:
                        eVar.m0.f();
                        dkx0 dkx0Var2 = eVar.P;
                        String str2 = ((kb5) eVar.Q.c.getValue()).b;
                        xcv0 xcv0Var = dkx0Var2.c;
                        xcv0Var.g(str2, ((a7t0) dkx0Var2.b).a().b);
                        k kVar = (k) dkx0Var2.d;
                        pex0 m = kVar.m();
                        Set set = (m == null || (jn40Var = m.V) == null) ? null : jn40Var.f;
                        SummaryAnalytics$SummaryCollapseReasonV2 summaryAnalytics$SummaryCollapseReasonV2 = SummaryAnalytics$SummaryCollapseReasonV2.Automatic;
                        String h = kVar.h();
                        pex0 m2 = kVar.m();
                        if (m2 == null || (str = m2.b) == null) {
                            str = "";
                        }
                        xcv0Var.b(summaryAnalytics$SummaryCollapseReasonV2, h, str, set != null ? a.J0(set) : null);
                        break;
                    default:
                        eVar.m0.a();
                        break;
                }
            }
        });
        this.o0 = new hlx0(nestedScrollViewAdvanced, shimmeringRobotoTextView);
        this.p0 = new hbp0(new czo0(14), "", null);
        if (vev0Var.a instanceof p81) {
            this.q0 = null;
            viewGroup.setVisibility(8);
            view2.setVisibility(8);
        } else {
            ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination.d dVar2 = (ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination.d) yvf0Var.get();
            dVar2.c = new c1x0(this);
            this.q0 = dVar2;
        }
        shimmeringRobotoTextView.setAnimationDuration(900);
        dkx0Var.h++;
        androidx.core.view.b.p(view3, new ug(view3, 3));
    }

    public void W(ikx0 ikx0Var, ikx0 ikx0Var2) {
        Pair pair;
        this.P.i++;
        kb5 kb5Var = ikx0Var2.b;
        String str = ikx0Var2.n;
        String str2 = ikx0Var2.m;
        this.Q.c.l(kb5Var);
        ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination.d dVar = this.q0;
        if (dVar != null) {
            if (ikx0Var == null || !jl40.l(str2, ikx0Var.m) || !jl40.l(str, ikx0Var.n)) {
                n0l0 n0l0Var = dVar.b;
                n0l0Var.m = str2;
                n0l0Var.n = str;
                SourceDestinationComponent sourceDestinationComponent = n0l0Var.j;
                if (sourceDestinationComponent != null) {
                    sourceDestinationComponent.applyDrawables(n0l0Var.a.b(str2), n0l0Var.b.b(str));
                }
            }
            mct0 mct0Var = ikx0Var2.l;
            if (ikx0Var == null || !jl40.l(ikx0Var.l, mct0Var)) {
                tse c = this.p0.c();
                d dVar2 = this.T;
                pzt0 pzt0Var = dVar2.d;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                dVar2.d = null;
                String str3 = mct0Var != null ? mct0Var.j : null;
                if (mct0Var == null || str3 == null || str3.length() == 0) {
                    dVar.b(mct0Var);
                } else {
                    Pair pair2 = dVar2.e;
                    BitmapDrawable bitmapDrawable = (!str3.equals(pair2 != null ? (String) pair2.c() : null) || (pair = dVar2.e) == null) ? null : (BitmapDrawable) pair.f();
                    if (bitmapDrawable != null) {
                        dVar.b(d.b(mct0Var, bitmapDrawable));
                    } else {
                        dVar.b(mct0Var);
                        dVar2.d = tje.N(c, null, null, new RouteTimeIconLoader$handleNewDestinationModel$1(dVar2, str3, dVar, mct0Var, null), 3);
                    }
                }
            }
        }
        m1a0 m1a0Var = ikx0Var2.q;
        if (ikx0Var == null || !jl40.l(ikx0Var.q, m1a0Var)) {
            f6t0 f6t0Var = this.n0;
            f6t0Var.b.update(m1a0Var, f6t0Var.a, true, kyh0.summary_order_button_payment_content_description);
        }
        b0(ikx0Var != null ? ikx0Var.g : null, ikx0Var2.g);
        if (ikx0Var == null) {
            int i = f1h0.round_section_bg;
            View view = this.a;
            this.d0.setBackground(ru.yandex.taxi.design.utils.c.k(i, view));
            bdc bdcVar = this.l0;
            View view2 = this.e0;
            view2.setBackgroundColor(ru.yandex.taxi.design.utils.c.x(view2, bdcVar));
            this.h0.setBackgroundColor(qje.t(xng0.bgFloating, view.getContext()));
            this.j0.setBackgroundColor(qje.t(xng0.bgMain, view.getContext()));
            int i2 = yfh0.tariff_page_close_icon;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            GoImageView goImageView = (GoImageView) ((View) rp31.d(view, i2));
            ThemeType.Companion.getClass();
            ThemeType themeType = ThemeType.LIGHT;
            goImageView.applyTheme(themeType);
            ((OrderButtonComponent) ((View) rp31.d(view, yfh0.tariff_page_order_button))).applyTheme(themeType);
        }
    }

    public void X() {
        this.p0.b();
        this.s0 = null;
        this.t0 = null;
    }

    public void Y() {
        hbp0 hbp0Var = this.p0;
        hbp0Var.a();
        hlx0 hlx0Var = this.o0;
        NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) hlx0Var.b;
        nestedScrollViewAdvanced.addScrollChangeListener((x95) hlx0Var.y);
        ons0 ons0Var = (ons0) hlx0Var.x;
        nestedScrollViewAdvanced.addOnLayoutChangeListener(ons0Var);
        ((TextView) hlx0Var.c).addOnLayoutChangeListener(ons0Var);
        ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination.d dVar = this.q0;
        if (dVar != null) {
            dVar.a(this.d0, this.f0, this.Q.a());
        }
        hbp0.e(hbp0Var, null, null, new TariffPagerViewHolder$onViewAttached$1(this, null), 3);
        hbp0.e(hbp0Var, null, null, new TariffPagerViewHolder$onViewAttached$2(this, null), 3);
        hbp0.e(hbp0Var, null, null, new TariffPagerViewHolder$onViewAttached$3(this, null), 3);
        RequirementsBubblesContainer requirementsBubblesContainer = this.r0;
        if (requirementsBubblesContainer != null) {
            hbp0.e(hbp0Var, null, null, new TariffPagerViewHolder$onViewAttached$4$1(this, requirementsBubblesContainer, null), 3);
            hbp0.e(hbp0Var, null, null, new TariffPagerViewHolder$onViewAttached$4$2(this, requirementsBubblesContainer, null), 3);
        }
        hbp0.e(hbp0Var, null, null, new TariffPagerViewHolder$onViewAttached$5(this, null), 3);
        c1f0 c1f0Var = this.t0;
        if (c1f0Var != null) {
            b0(this.s0, c1f0Var);
        }
    }

    public void Z() {
        this.p0.b();
        hlx0 hlx0Var = this.o0;
        NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) hlx0Var.b;
        nestedScrollViewAdvanced.removeScrollChangeListener((x95) hlx0Var.y);
        ons0 ons0Var = (ons0) hlx0Var.x;
        nestedScrollViewAdvanced.removeOnLayoutChangeListener(ons0Var);
        ((TextView) hlx0Var.c).removeOnLayoutChangeListener(ons0Var);
        ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination.d dVar = this.q0;
        if (dVar != null) {
            dVar.d.b();
            n0l0 n0l0Var = dVar.b;
            if (n0l0Var.h) {
                n0l0Var.h = false;
                SourceDestinationComponent sourceDestinationComponent = n0l0Var.j;
                if (sourceDestinationComponent != null) {
                    sourceDestinationComponent.setSourceTrailClickListener(null);
                    sourceDestinationComponent.setDestinationTrailClickListener(null);
                    sourceDestinationComponent.setSourceDestinationListener(null);
                }
                n0l0Var.g.b();
            }
        }
        AuctionView auctionView = this.i0;
        if (auctionView != null) {
            auctionView.detach();
        }
        this.s0 = null;
        this.t0 = null;
    }

    public final void a0(RequirementsBubblesContainer requirementsBubblesContainer) {
        requirementsBubblesContainer.setBubbleClickListener(new TariffPagerViewHolder$setupBubbleContainer$1$1(2, this, e.class, "onBubbleClick", "onBubbleClick(Lru/yandex/taxi/requirements/models/domain/RequirementBubbleModel;Lru/yandex/taxi/requirements/models/domain/RequirementBubbleAction;)V", 0));
        requirementsBubblesContainer.addOnLayoutChangeListener(new ons0(7, this));
        this.r0 = requirementsBubblesContainer;
    }

    public abstract void applyTheme(ThemeType themeType);

    public final void b0(c1f0 c1f0Var, c1f0 c1f0Var2) {
        Drawable drawable;
        this.s0 = c1f0Var;
        this.t0 = c1f0Var2;
        boolean z = c1f0Var2 instanceof w0f0;
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.k0;
        if (!z) {
            if (!(c1f0Var2 instanceof z0f0)) {
                w511.b();
                return;
            }
            boolean z2 = c1f0Var instanceof z0f0;
            z0f0 z0f0Var = z2 ? (z0f0) c1f0Var : null;
            if (z0f0Var == null || !jl40.l(((z0f0) c1f0Var2).a, z0f0Var.a)) {
                pzt0 pzt0Var = this.u0;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                this.u0 = hbp0.e(this.p0, null, null, new TariffPagerViewHolder$updatePriceState$10$1(this, c1f0Var2, null), 3);
            }
            z0f0 z0f0Var2 = z2 ? (z0f0) c1f0Var : null;
            if (z0f0Var2 == null || ((z0f0) c1f0Var2).c != z0f0Var2.c) {
                shimmeringRobotoTextView.setTextColor(((z0f0) c1f0Var2).c);
            }
            z0f0 z0f0Var3 = z2 ? (z0f0) c1f0Var : null;
            if (z0f0Var3 == null || ((z0f0) c1f0Var2).b != z0f0Var3.b) {
                if (((z0f0) c1f0Var2).b) {
                    shimmeringRobotoTextView.startAnimation();
                } else {
                    shimmeringRobotoTextView.stopAnimation();
                }
            }
            shimmeringRobotoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            z0f0 z0f0Var4 = (z0f0) c1f0Var2;
            rkb1.b(shimmeringRobotoTextView, z0f0Var4.e, z0f0Var4.d);
            return;
        }
        pzt0 pzt0Var2 = this.u0;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.u0 = null;
        boolean z3 = c1f0Var instanceof w0f0;
        w0f0 w0f0Var = z3 ? (w0f0) c1f0Var : null;
        if (w0f0Var == null || !jl40.l(((w0f0) c1f0Var2).a, w0f0Var.a)) {
            shimmeringRobotoTextView.setText(((w0f0) c1f0Var2).a);
        }
        w0f0 w0f0Var2 = z3 ? (w0f0) c1f0Var : null;
        if (w0f0Var2 == null || ((w0f0) c1f0Var2).c != w0f0Var2.c) {
            shimmeringRobotoTextView.setTextColor(((w0f0) c1f0Var2).c);
        }
        w0f0 w0f0Var3 = z3 ? (w0f0) c1f0Var : null;
        if (w0f0Var3 == null || !jl40.l(((w0f0) c1f0Var2).e, w0f0Var3.e)) {
            npw0 npw0Var = ((w0f0) c1f0Var2).e;
            if (npw0Var != null) {
                drawable = tje.y(npw0Var.a, this.O.a);
                drawable.setTint(npw0Var.b);
            } else {
                drawable = null;
            }
            shimmeringRobotoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        w0f0 w0f0Var4 = z3 ? (w0f0) c1f0Var : null;
        if (w0f0Var4 == null || ((w0f0) c1f0Var2).b != w0f0Var4.b) {
            if (((w0f0) c1f0Var2).b) {
                shimmeringRobotoTextView.startAnimation();
            } else {
                shimmeringRobotoTextView.stopAnimation();
            }
        }
        w0f0 w0f0Var5 = (w0f0) c1f0Var2;
        rkb1.b(shimmeringRobotoTextView, w0f0Var5.a, w0f0Var5.d);
    }
}
