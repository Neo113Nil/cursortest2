package ru.yandex.taxi.preorder.summary.tariffpage.data.holder;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.multitariff.Description;
import com.yandex.go.tariffcard.ui.r0;
import com.yandex.go.taxi.tariffs.repository.g;
import defpackage.ajj0;
import defpackage.ao4;
import defpackage.bdc;
import defpackage.c9i;
import defpackage.dkx0;
import defpackage.ec31;
import defpackage.en6;
import defpackage.ff9;
import defpackage.fva0;
import defpackage.h45;
import defpackage.hos0;
import defpackage.ico;
import defpackage.ikx0;
import defpackage.j73;
import defpackage.jbh;
import defpackage.jkt;
import defpackage.jl40;
import defpackage.jn40;
import defpackage.kb5;
import defpackage.l58;
import defpackage.l9e;
import defpackage.m83;
import defpackage.mqv0;
import defpackage.n070;
import defpackage.o8g0;
import defpackage.osx0;
import defpackage.pav;
import defpackage.pkt;
import defpackage.ppw0;
import defpackage.pwy0;
import defpackage.qhx0;
import defpackage.qi31;
import defpackage.qr31;
import defpackage.r7t0;
import defpackage.rp31;
import defpackage.rqc;
import defpackage.rqo;
import defpackage.rwj0;
import defpackage.sls;
import defpackage.spi;
import defpackage.t690;
import defpackage.tje;
import defpackage.tls;
import defpackage.tra1;
import defpackage.uhx;
import defpackage.uxk0;
import defpackage.vev0;
import defpackage.vm6;
import defpackage.vub1;
import defpackage.vxk0;
import defpackage.wpy0;
import defpackage.wrr;
import defpackage.xjg;
import defpackage.xng0;
import defpackage.y9j0;
import defpackage.ycc;
import defpackage.yfh0;
import defpackage.ykx0;
import defpackage.yvf0;
import defpackage.z0a0;
import defpackage.z6t0;
import defpackage.zm40;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.TariffsSelectorView$SelectorViewType;
import ru.yandex.taxi.preorder.summary.tariffpage.data.holder.f;
import ru.yandex.taxi.requirements.glued.ui.image.i;
import ru.yandex.taxi.requirements.ui.bubbles.RequirementsBubblesContainer;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.AnyTouchCatcherFrameLayout;

/* loaded from: classes6.dex */
public final class f extends e {
    public static final /* synthetic */ int V1 = 0;
    public final ListTextComponent A0;
    public final ListItemComponent B0;
    public boolean B1;
    public final AnyTouchCatcherFrameLayout C0;
    public final r0 C1;
    public final ViewGroup D0;
    public final View E0;
    public final View F0;
    public final View G0;
    public final View H0;
    public final xjg H1;
    public final View I0;
    public final ViewGroup J0;
    public final RecyclerView K0;
    public final pkt L0;
    public final ru.yandex.taxi.preorder.summary.altchoice.ui.c M0;
    public final ru.yandex.taxi.delivery.impl.requirement.special.a N0;
    public ikx0 N1;
    public final ru.yandex.taxi.preorder.summary.tariffpage.data.d O0;
    public final qhx0 P0;
    public final wrr Q0;
    public final vxk0 R0;
    public final ru.yandex.taxi.requirements.glued.ui.ui.a S0;
    public final o8g0 T0;
    public final wpy0 T1;
    public Runnable p1;
    public final osx0 v0;
    public ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c v1;
    public final fva0 w0;
    public final a x0;
    public String x1;
    public final TextView y0;
    public String y1;
    public final TextView z0;

    public f(View view, ykx0 ykx0Var, jkt jktVar, y9j0 y9j0Var, osx0 osx0Var, SummaryStateTracker summaryStateTracker, ppw0 ppw0Var, dkx0 dkx0Var, com.yandex.go.taxi.summary.shared.expanded.repository.c cVar, vm6 vm6Var, yvf0 yvf0Var, ao4 ao4Var, ru.yandex.taxi.requirements.glued.ui.ui.b bVar, spi spiVar, fva0 fva0Var, g gVar, ru.yandex.taxi.orderbutton.summary.solid.interactors.c cVar2, ff9 ff9Var, com.yandex.go.taxi.auction.domain.a aVar, z0a0 z0a0Var, d dVar, pav pavVar, c9i c9iVar, ajj0 ajj0Var, vev0 vev0Var, mqv0 mqv0Var, ru.yandex.taxi.widget.c cVar3, en6 en6Var, pwy0 pwy0Var, rqo rqoVar, ico icoVar, a aVar2) {
        super(view, summaryStateTracker, ppw0Var, dkx0Var, cVar, vm6Var, ajj0Var, dVar, cVar2, ff9Var, aVar, z0a0Var, yvf0Var, vev0Var, cVar3, en6Var, pwy0Var);
        this.v0 = osx0Var;
        this.w0 = fva0Var;
        this.x0 = aVar2;
        this.y0 = (TextView) ((View) rp31.d(view, yfh0.solid_tariff_page_name));
        this.z0 = (TextView) ((View) rp31.d(view, yfh0.solid_tariff_page_eta));
        ListTextComponent listTextComponent = (ListTextComponent) ((View) rp31.d(view, yfh0.solid_tariff_page_subtitle));
        this.A0 = listTextComponent;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(view, yfh0.multi_tariff_header));
        this.B0 = listItemComponent;
        this.C0 = (AnyTouchCatcherFrameLayout) ((View) rp31.d(view, yfh0.vertical_tariff_page_selector_container));
        ViewGroup viewGroup = (ViewGroup) ((View) rp31.d(view, yfh0.vertical_rest_content));
        this.D0 = viewGroup;
        this.E0 = (View) rp31.d(view, yfh0.badges_bottom_divider);
        this.F0 = (View) rp31.d(view, yfh0.solid_tariff_page_glued_bottom_divider);
        this.G0 = (View) rp31.d(view, yfh0.solid_tariff_page_alt_choice_bottom_divider);
        this.H0 = (View) rp31.d(view, yfh0.special_requirements_bottom_divider);
        this.I0 = (View) rp31.d(view, yfh0.vertical_rest_content_divider);
        ViewGroup viewGroup2 = (ViewGroup) ((View) rp31.d(view, yfh0.special_requirements_container));
        this.J0 = viewGroup2;
        RecyclerView recyclerView = (RecyclerView) ((View) rp31.d(view, yfh0.requirements_recycler_view));
        this.K0 = recyclerView;
        this.p1 = new hos0(8);
        this.T1 = new wpy0(24, this);
        vxk0 vxk0Var = new vxk0(view.getContext());
        this.R0 = vxk0Var;
        this.H1 = new xjg(c9iVar, (View) rp31.d(view, yfh0.solid_summary_delivery_explicit_comment_courier_requirement_stub));
        this.j0.setFixChildRequestIntercept(true);
        ViewGroup viewGroup3 = (ViewGroup) ((View) rp31.d(view, yfh0.solid_tariff_page_glued_container));
        this.L0 = (pkt) vub1.d(jktVar, viewGroup3).a.get();
        ViewGroup viewGroup4 = (ViewGroup) ((View) rp31.d(view, yfh0.solid_tariff_page_alt_choice_container));
        this.M0 = (ru.yandex.taxi.preorder.summary.altchoice.ui.c) m83.b(y9j0Var, viewGroup4, new rqc(this, 1)).b.get();
        LinearLayout linearLayout = (LinearLayout) ((View) rp31.d(view, yfh0.badges_container));
        this.O0 = ao4Var.a(linearLayout, cVar);
        qhx0 b = aVar2.b();
        this.P0 = b;
        recyclerView.setAdapter(b);
        ViewGroup viewGroup5 = (ViewGroup) ((View) rp31.d(view, yfh0.multi_tariff_options));
        this.Q0 = new wrr(viewGroup5, new h45(1, gVar), pavVar, mqv0Var, ((jbh) rqoVar).a(SimpleBooleanExperiment.MULTICLASS_TARIFF_CARD_ETA), icoVar);
        this.S0 = bVar.a((ImageView) ((View) rp31.d(view, yfh0.solid_tariff_page_car_image)), (RecyclerView) ((View) rp31.d(view, yfh0.solid_tariff_page_options_container)), (View) rp31.d(view, yfh0.solid_tariff_page_next), (ViewGroup) ((View) rp31.d(view, yfh0.vertical_tariff_page_selector_container)), new qi31(this, 0));
        RequirementsBubblesContainer requirementsBubblesContainer = (RequirementsBubblesContainer) ((View) rp31.d(view, yfh0.vertical_tariff_page_bubbles_container));
        requirementsBubblesContainer.init(pavVar);
        requirementsBubblesContainer.updateBubblesPadding(tje.u(4, view.getContext()), tje.u(4, view.getContext()));
        a0(requirementsBubblesContainer);
        this.T0 = new o8g0(viewGroup);
        uxk0 c = tra1.c(false, (View) rp31.d(view, yfh0.vertical_header_with_selector_container));
        uxk0[] uxk0VarArr = {tra1.c(false, viewGroup2), new uxk0(28, true, j73.d0(new View[]{viewGroup4})), tra1.c(true, viewGroup3), tra1.c(false, listTextComponent, linearLayout), tra1.c(false, listItemComponent, viewGroup5)};
        ArrayList arrayList = vxk0Var.d;
        arrayList.add(c);
        ycc.t(arrayList, uxk0VarArr);
        this.C1 = ykx0Var.a.a(cVar, (DialogueComponent) ((View) rp31.d(view, yfh0.vertical_tariff_page_dialogue)), yfh0.vertical_tariff_page_dialogue_header);
        this.N0 = spiVar.a();
        ru.yandex.taxi.design.utils.c.z(new ec31(4, this), (View) rp31.d(view, yfh0.tariff_info_container));
    }

    @Override // ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e
    public final void W(ikx0 ikx0Var, final ikx0 ikx0Var2) {
        Runnable hos0Var;
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Bind;
        fva0.f(this.w0, "TariffPagerView.ViewHolder.Verticals", performanceAnalytics$Type, 0L, 4);
        this.N1 = ikx0Var2;
        super.W(ikx0Var, ikx0Var2);
        List list = ikx0Var2.i;
        String str = ikx0Var2.o;
        String str2 = ikx0Var2.c;
        String str3 = ikx0Var2.p;
        String str4 = this.x1;
        kb5 kb5Var = ikx0Var2.b;
        String str5 = kb5Var.a;
        String str6 = kb5Var.a;
        String str7 = kb5Var.b;
        boolean l = jl40.l(str4, str5);
        int i = 1;
        View view = this.a;
        if (!l || this.v1 == null || ikx0Var == null || !jl40.l(str6, ikx0Var.b.a)) {
            this.x1 = str6;
            ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c cVar = this.v1;
            if (cVar != null) {
                cVar.d();
            }
            ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c cVar2 = this.v1;
            if (cVar2 != null) {
                cVar2.b();
            }
            this.C0.removeAllViews();
            r7t0 r7t0Var = new r7t0(i, this);
            if (str6 == null) {
                str6 = "";
            }
            z6t0 z6t0Var = new z6t0(2, str6);
            int i2 = yfh0.vertical_tariff_page_tooltip_container;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            FrameLayout frameLayout = (FrameLayout) ((View) rp31.d(view, i2));
            osx0 osx0Var = this.v0;
            ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c cVar3 = (ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c) l9e.g(osx0Var, this.C0, r7t0Var, z6t0Var, new qr31(frameLayout, osx0Var.j), n070.R2, false).b.get();
            this.v1 = cVar3;
            if (cVar3 != null) {
                cVar3.e(TariffsSelectorView$SelectorViewType.USUAL);
            }
            if (this.B1) {
                ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c cVar4 = this.v1;
                if (cVar4 != null) {
                    cVar4.a();
                }
                ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c cVar5 = this.v1;
                if (cVar5 != null) {
                    cVar5.a.resume();
                }
            }
        }
        TextView textView = this.y0;
        if (ikx0Var == null || !str2.equals(ikx0Var.c)) {
            textView.setText(str2);
        }
        TextView textView2 = this.z0;
        if (ikx0Var == null || !jl40.l(str, ikx0Var.o)) {
            textView2.setText(str);
        }
        ListTextComponent listTextComponent = this.A0;
        if (ikx0Var == null || !jl40.l(str3, ikx0Var.p)) {
            listTextComponent.setText(str3);
            listTextComponent.setVisibility((str3 == null || str3.length() == 0) ? 8 : 0);
        }
        if (ikx0Var == null || ikx0Var2.u != ikx0Var.u || !kb5Var.equals(ikx0Var.b)) {
            this.Q0.e(ikx0Var2);
            jn40 jn40Var = ikx0Var2.k;
            Description description = jn40Var == null ? null : jn40Var.b.f;
            ListItemComponent listItemComponent = this.B0;
            if (description != null) {
                listItemComponent.setVisibility(0);
                listItemComponent.setTitle(description.a);
                listItemComponent.setSubtitle(description.b);
            } else {
                listItemComponent.setVisibility(8);
            }
        }
        boolean z = ikx0Var2.x;
        if (z) {
            final int i3 = 0;
            hos0Var = new Runnable(this) { // from class: pi31
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    ikx0 ikx0Var3 = ikx0Var2;
                    f fVar = this.b;
                    switch (i4) {
                        case 0:
                            fVar.m0.j(ikx0Var3);
                            break;
                        default:
                            fVar.L0.a(ikx0Var3.i);
                            xjg xjgVar = fVar.H1;
                            kb5 kb5Var2 = ikx0Var3.b;
                            xjgVar.a(kb5Var2.b, kb5Var2.d);
                            fVar.c0(ikx0Var3, ((Number) fVar.O0.k.getValue()).intValue());
                            break;
                    }
                }
            };
        } else {
            hos0Var = new hos0(8);
        }
        this.p1 = hos0Var;
        String str8 = ikx0Var2.d;
        String str9 = str8 != null ? str8 : "";
        ru.yandex.taxi.requirements.glued.ui.ui.a aVar = this.S0;
        i iVar = aVar.d;
        iVar.o = z;
        kotlinx.coroutines.flow.r0 r0Var = iVar.h;
        l58 l58Var = new l58(str9, list);
        r0Var.getClass();
        r0Var.m(null, l58Var);
        View view2 = aVar.b;
        if (view2 != null) {
            view2.setVisibility(z ? 0 : 8);
        }
        if (this.y1 != null) {
            this.y1 = str7;
        }
        boolean l2 = jl40.l(this.y1, str7);
        o8g0 o8g0Var = this.T0;
        ViewGroup viewGroup = this.D0;
        if (l2) {
            rwj0 rwj0Var = (rwj0) o8g0Var.b;
            ValueAnimator valueAnimator = rwj0Var.a;
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
            ValueAnimator valueAnimator2 = rwj0Var.b;
            valueAnimator2.removeAllListeners();
            valueAnimator2.removeAllUpdateListeners();
            rwj0Var.c.cancel();
            viewGroup.setAlpha(1.0f);
            viewGroup.setMinimumHeight(0);
            this.L0.a(list);
            this.H1.a(kb5Var.b, kb5Var.d);
            c0(ikx0Var2, ((Number) this.O0.k.getValue()).intValue());
        } else {
            this.y1 = str7;
            viewGroup.setMinimumHeight(viewGroup.getHeight());
            final int i4 = 1;
            Runnable runnable = new Runnable(this) { // from class: pi31
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i42 = i4;
                    ikx0 ikx0Var3 = ikx0Var2;
                    f fVar = this.b;
                    switch (i42) {
                        case 0:
                            fVar.m0.j(ikx0Var3);
                            break;
                        default:
                            fVar.L0.a(ikx0Var3.i);
                            xjg xjgVar = fVar.H1;
                            kb5 kb5Var2 = ikx0Var3.b;
                            xjgVar.a(kb5Var2.b, kb5Var2.d);
                            fVar.c0(ikx0Var3, ((Number) fVar.O0.k.getValue()).intValue());
                            break;
                    }
                }
            };
            qi31 qi31Var = new qi31(this, 1);
            rwj0 rwj0Var2 = (rwj0) o8g0Var.b;
            ViewGroup viewGroup2 = (ViewGroup) ((WeakReference) o8g0Var.a).get();
            if (viewGroup2 != null) {
                AnimatorSet animatorSet = rwj0Var2.c;
                ValueAnimator valueAnimator3 = rwj0Var2.a;
                ValueAnimator valueAnimator4 = rwj0Var2.b;
                boolean isRunning = animatorSet.isRunning();
                if (isRunning) {
                    valueAnimator3.removeAllListeners();
                    valueAnimator3.removeAllUpdateListeners();
                    valueAnimator4.removeAllListeners();
                    valueAnimator4.removeAllUpdateListeners();
                    rwj0Var2.c.cancel();
                    viewGroup2.setAlpha(0.0f);
                    runnable.run();
                }
                final RestContentAnimationDelegate$startFadeOutFadeInAnimation$1 restContentAnimationDelegate$startFadeOutFadeInAnimation$1 = new RestContentAnimationDelegate$startFadeOutFadeInAnimation$1(1, viewGroup2, ViewGroup.class, "setAlpha", "setAlpha(F)V", 0);
                final RestContentAnimationDelegate$startFadeOutFadeInAnimation$2 restContentAnimationDelegate$startFadeOutFadeInAnimation$2 = new RestContentAnimationDelegate$startFadeOutFadeInAnimation$2(0, runnable, Runnable.class, "run", "run()V", 0);
                final RestContentAnimationDelegate$startFadeOutFadeInAnimation$3 restContentAnimationDelegate$startFadeOutFadeInAnimation$3 = new RestContentAnimationDelegate$startFadeOutFadeInAnimation$3(0, qi31Var, Runnable.class, "run", "run()V", 0);
                valueAnimator3.removeAllListeners();
                valueAnimator3.removeAllUpdateListeners();
                valueAnimator4.removeAllListeners();
                valueAnimator4.removeAllUpdateListeners();
                rwj0Var2.c = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (!isRunning) {
                    final int i5 = 0;
                    valueAnimator3.addListener(new AnimUtils$AnimationEndListener(new Runnable() { // from class: ru.yandex.taxi.preorder.summary.tariffpage.data.holder.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i6 = i5;
                            sls slsVar = restContentAnimationDelegate$startFadeOutFadeInAnimation$2;
                            switch (i6) {
                                case 0:
                                    ((RestContentAnimationDelegate$startFadeOutFadeInAnimation$2) slsVar).invoke();
                                    break;
                                default:
                                    ((RestContentAnimationDelegate$startFadeOutFadeInAnimation$3) slsVar).invoke();
                                    break;
                            }
                        }
                    }));
                    valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.yandex.taxi.preorder.summary.tariffpage.data.holder.c
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            int i6 = i5;
                            tls tlsVar = restContentAnimationDelegate$startFadeOutFadeInAnimation$1;
                            switch (i6) {
                                case 0:
                                    ((RestContentAnimationDelegate$startFadeOutFadeInAnimation$1) tlsVar).invoke((Float) valueAnimator5.getAnimatedValue());
                                    break;
                                default:
                                    ((RestContentAnimationDelegate$startFadeOutFadeInAnimation$1) tlsVar).invoke((Float) valueAnimator5.getAnimatedValue());
                                    break;
                            }
                        }
                    });
                    arrayList.add(valueAnimator3);
                }
                final int i6 = 1;
                valueAnimator4.addListener(new AnimUtils$AnimationEndListener(new Runnable() { // from class: ru.yandex.taxi.preorder.summary.tariffpage.data.holder.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i62 = i6;
                        sls slsVar = restContentAnimationDelegate$startFadeOutFadeInAnimation$3;
                        switch (i62) {
                            case 0:
                                ((RestContentAnimationDelegate$startFadeOutFadeInAnimation$2) slsVar).invoke();
                                break;
                            default:
                                ((RestContentAnimationDelegate$startFadeOutFadeInAnimation$3) slsVar).invoke();
                                break;
                        }
                    }
                }));
                valueAnimator4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.yandex.taxi.preorder.summary.tariffpage.data.holder.c
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        int i62 = i6;
                        tls tlsVar = restContentAnimationDelegate$startFadeOutFadeInAnimation$1;
                        switch (i62) {
                            case 0:
                                ((RestContentAnimationDelegate$startFadeOutFadeInAnimation$1) tlsVar).invoke((Float) valueAnimator5.getAnimatedValue());
                                break;
                            default:
                                ((RestContentAnimationDelegate$startFadeOutFadeInAnimation$1) tlsVar).invoke((Float) valueAnimator5.getAnimatedValue());
                                break;
                        }
                    }
                });
                arrayList.add(valueAnimator4);
                rwj0Var2.c.playSequentially(arrayList);
                rwj0Var2.c.start();
            }
        }
        if (ikx0Var == null) {
            int c = ru.yandex.taxi.design.utils.c.c(xng0.textMain, view);
            textView2.setTextColor(c);
            listTextComponent.setTextColor(c);
            textView.setTextColor(c);
        }
        fva0.b(this.w0, "TariffPagerView.ViewHolder.Verticals", performanceAnalytics$Type, null, 4);
    }

    @Override // ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e
    public final void X() {
        super.X();
        pkt pktVar = this.L0;
        EmptyList emptyList = EmptyList.a;
        pktVar.a(emptyList);
        this.M0.b(emptyList);
        this.S0.d.getClass();
        ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c cVar = this.v1;
        if (cVar != null) {
            cVar.d();
        }
        ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c cVar2 = this.v1;
        if (cVar2 != null) {
            cVar2.b();
        }
        this.C0.removeAllViews();
        this.v1 = null;
        this.x1 = null;
    }

    @Override // ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e
    public final void Y() {
        super.Y();
        this.B1 = true;
        t690 t690Var = this.m0;
        wrr wrrVar = this.Q0;
        wrrVar.getClass();
        wrrVar.A = new uhx(22, t690Var);
        ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c cVar = this.v1;
        if (cVar != null) {
            cVar.a();
        }
        ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c cVar2 = this.v1;
        if (cVar2 != null) {
            cVar2.a.resume();
        }
        this.S0.d.a();
        this.C1.a();
        this.O0.a(this.T1);
        this.M0.a(this.Q);
        this.N0.a(this.J0);
        this.x0.a(this.P0);
    }

    @Override // ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e
    public final void Z() {
        super.Z();
        this.B1 = false;
        this.j0.scrollTo(0, 0);
        this.D0.animate().setListener(null);
        wrr wrrVar = this.Q0;
        wrrVar.getClass();
        wrrVar.A = new zm40();
        ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c cVar = this.v1;
        if (cVar != null) {
            cVar.d();
        }
        ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c cVar2 = this.v1;
        if (cVar2 != null) {
            cVar2.b();
        }
        this.S0.d.g.b();
        rwj0 rwj0Var = (rwj0) this.T0.b;
        ValueAnimator valueAnimator = rwj0Var.a;
        valueAnimator.removeAllListeners();
        valueAnimator.removeAllUpdateListeners();
        ValueAnimator valueAnimator2 = rwj0Var.b;
        valueAnimator2.removeAllListeners();
        valueAnimator2.removeAllUpdateListeners();
        rwj0Var.c.cancel();
        this.C1.g.b();
        this.O0.j.b();
        this.M0.f.b();
        ru.yandex.taxi.delivery.impl.requirement.special.a aVar = this.N0;
        ViewGroup viewGroup = aVar.f;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        aVar.e.b();
        a aVar2 = this.x0;
        aVar2.d = null;
        aVar2.c.b();
    }

    @Override // ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e
    public final void applyTheme(ThemeType themeType) {
        this.P0.applyTheme(themeType);
        this.K0.setBackgroundColor(ru.yandex.taxi.design.utils.c.c(xng0.bgMain, this.a));
    }

    public final void c0(ikx0 ikx0Var, int i) {
        View view = this.E0;
        bdc bdcVar = this.l0;
        View view2 = this.a;
        if (i <= 0 || ikx0Var.k == null) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            view.setBackgroundColor(ru.yandex.taxi.design.utils.c.x(view2, bdcVar));
        }
        boolean isEmpty = ikx0Var.i.isEmpty();
        View view3 = this.F0;
        if (isEmpty) {
            view3.setVisibility(8);
        } else {
            view3.setVisibility(0);
            view3.setBackgroundColor(ru.yandex.taxi.design.utils.c.x(view2, bdcVar));
        }
        boolean z = ikx0Var.v;
        View view4 = this.G0;
        if (!z) {
            view4.setVisibility(8);
        } else if (isEmpty) {
            view4.setVisibility(0);
            view4.setBackgroundColor(ru.yandex.taxi.design.utils.c.x(view2, bdcVar));
        } else {
            view4.setVisibility(8);
        }
        boolean z2 = ikx0Var.w;
        View view5 = this.H0;
        if (z2 && !z && isEmpty) {
            view5.setVisibility(0);
            view5.setBackgroundColor(ru.yandex.taxi.design.utils.c.x(view2, bdcVar));
        } else {
            view5.setVisibility(8);
        }
        View view6 = this.I0;
        if ((!isEmpty || z || (i <= 0 && ikx0Var.k == null)) && !z2) {
            view6.setVisibility(8);
        } else {
            view6.setVisibility(0);
            view6.setBackgroundColor(ru.yandex.taxi.design.utils.c.x(view2, bdcVar));
        }
        this.R0.b();
    }
}
