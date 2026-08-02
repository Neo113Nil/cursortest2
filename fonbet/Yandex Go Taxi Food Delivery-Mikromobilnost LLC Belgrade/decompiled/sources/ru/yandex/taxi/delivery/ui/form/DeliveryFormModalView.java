package ru.yandex.taxi.delivery.ui.form;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.c230;
import defpackage.cfv0;
import defpackage.cma1;
import defpackage.deh0;
import defpackage.f0h0;
import defpackage.gtq0;
import defpackage.hgr0;
import defpackage.hqh0;
import defpackage.jqr;
import defpackage.mai;
import defpackage.mki;
import defpackage.mrg0;
import defpackage.mth;
import defpackage.nn50;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pvi;
import defpackage.qje;
import defpackage.rai;
import defpackage.tje;
import defpackage.tpr;
import defpackage.wai;
import defpackage.x5i;
import defpackage.x95;
import defpackage.xng0;
import defpackage.y5i;
import kotlin.Metadata;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.delivery.extracted_form_common_data.api.DeliveryDataProvider$UpdateState;
import ru.yandex.taxi.delivery.interactors.p;
import ru.yandex.taxi.delivery.ui.requirement.DeliveryRequirementView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;
import ru.yandex.taxi.widget.scroll.ShadowScrollIndicator;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00017B;\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0012H\u0014¢\u0006\u0004\b!\u0010\u0014J\u000f\u0010\"\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\"\u0010\u0014J\u000f\u0010#\u001a\u00020\u0012H\u0014¢\u0006\u0004\b#\u0010\u0014J\u000f\u0010$\u001a\u00020\u0012H\u0014¢\u0006\u0004\b$\u0010\u0014J\u000f\u0010%\u001a\u00020\u0012H\u0014¢\u0006\u0004\b%\u0010\u0014J\u000f\u0010&\u001a\u00020\u0012H\u0014¢\u0006\u0004\b&\u0010\u0014J\u000f\u0010'\u001a\u00020\u0012H\u0014¢\u0006\u0004\b'\u0010\u0014J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u00100\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u00106R\u0018\u00108\u001a\u000607R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00178TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lru/yandex/taxi/delivery/ui/form/DeliveryFormModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lpvi;", "Lcfv0;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lru/yandex/taxi/delivery/ui/form/e;", "presenter", "Lmki;", "blocksAdapter", "Lmai;", "actionBus", "Lru/yandex/taxi/design/utils/a;", "overlayShadowUtil", "<init>", "(Landroid/content/Context;Lpav;Lru/yandex/taxi/delivery/ui/form/e;Lmki;Lmai;Lru/yandex/taxi/design/utils/a;)V", "Lzy11;", "applyBottomViewBackground", "()V", "Landroid/graphics/drawable/Drawable;", "shadow", "", "shadowHeight", "setBottomShadow", "(Landroid/graphics/drawable/Drawable;I)V", "radius", "createBottomShadow", "(I)Landroid/graphics/drawable/Drawable;", "Lc230;", "insetsType", "()Lc230;", "onDismissManually", "onModalViewDisappear", "onAttachedToWindow", "onDetachedFromWindow", "onSlideOut", "onBackPressed", "onTouchOutside", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lpvi;", "Lru/yandex/taxi/delivery/ui/form/e;", "Lmki;", "Lru/yandex/taxi/design/utils/a;", "getOverlayShadowUtil", "()Lru/yandex/taxi/design/utils/a;", "Lrai;", "mvp", "Lrai;", "Lnn50;", "onScrollListener", "Lnn50;", "Lru/yandex/taxi/delivery/ui/requirement/DeliveryRequirementView;", "requirementView", "Lru/yandex/taxi/delivery/ui/requirement/DeliveryRequirementView;", "getCornerRadius", "()I", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryFormModalView extends SlideableBindingModalView<pvi> implements cfv0 {
    private final mki blocksAdapter;
    private final rai mvp;
    private final nn50 onScrollListener;
    private final ru.yandex.taxi.design.utils.a overlayShadowUtil;
    private e presenter;
    private final DeliveryRequirementView requirementView;

    public DeliveryFormModalView(Context context, pav pavVar, e eVar, mki mkiVar, mai maiVar, ru.yandex.taxi.design.utils.a aVar) {
        super(context);
        this.presenter = eVar;
        this.blocksAdapter = mkiVar;
        this.overlayShadowUtil = aVar;
        this.mvp = new rai(this, maiVar);
        this.onScrollListener = new x95(2, this);
        DeliveryRequirementView deliveryRequirementView = new DeliveryRequirementView(context, pavVar);
        this.requirementView = deliveryRequirementView;
        getBinding().f.addView(deliveryRequirementView);
        getBinding().c.setItemAnimator(null);
        getBinding().e.setVisibility(8);
    }

    private final void applyBottomViewBackground() {
        GoImageView goImageView = getBinding().d;
        goImageView.setImageResource(f0h0.bg_rounded_24dp_modal_view);
        goImageView.setImageTintList(ColorStateList.valueOf(qje.t(xng0.bgFloating, goImageView.getContext())));
    }

    private final Drawable createBottomShadow(int radius) {
        ru.yandex.taxi.design.utils.a aVar = this.overlayShadowUtil;
        Context context = getContext();
        Context context2 = getContext();
        return gtq0.v(aVar, context, radius, new hgr0(0.0f, tje.w(-4, context2), tje.w(20, context2), qje.u(context2.getTheme(), xng0.effectShadowTop)), 0, 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScrollListener$lambda$0(DeliveryFormModalView deliveryFormModalView, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        e eVar = deliveryFormModalView.presenter;
        eVar.getClass();
        if (i2 == 0) {
            return;
        }
        eVar.m0.g(Boolean.valueOf(i2 < i4));
    }

    private final void setBottomShadow(Drawable shadow, int shadowHeight) {
        Rect rect = new Rect();
        shadow.getPadding(rect);
        GoImageView goImageView = getBinding().b;
        goImageView.setBackground(shadow);
        ViewGroup.LayoutParams layoutParams = goImageView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(-rect.left, (-rect.top) - shadowHeight, -rect.right, -rect.bottom);
        goImageView.setLayoutParams(marginLayoutParams);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        applyBottomViewBackground();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public pvi bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = LayoutInflater.from(getContext()).inflate(hqh0.delivery_united_summary_view, getCardContentContainer(), false);
        int i = deh0.delivery_form_bottom_shadow;
        GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
        if (goImageView != null) {
            i = deh0.delivery_points_recycler;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
            if (recyclerView != null) {
                i = deh0.delivery_united_summary_bottom_background;
                GoImageView goImageView2 = (GoImageView) cma1.O(i, inflate);
                if (goImageView2 != null) {
                    i = deh0.delivery_united_summary_order_button;
                    ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                    if (listItemComponent != null) {
                        i = deh0.delivery_united_summary_requirement;
                        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                        if (frameLayout != null) {
                            i = deh0.delivery_united_summary_scroll;
                            NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) cma1.O(i, inflate);
                            if (nestedScrollViewAdvanced != null) {
                                i = deh0.delivery_united_summary_shadow;
                                ShadowScrollIndicator shadowScrollIndicator = (ShadowScrollIndicator) cma1.O(i, inflate);
                                if (shadowScrollIndicator != null) {
                                    return new pvi((ConstraintLayout) inflate, goImageView, recyclerView, goImageView2, listItemComponent, frameLayout, nestedScrollViewAdvanced, shadowScrollIndicator);
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.r(mrg0.modal_view_corner_radius_big, getContext());
    }

    public final ru.yandex.taxi.design.utils.a getOverlayShadowUtil() {
        return this.overlayShadowUtil;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object value;
        super.onAttachedToWindow();
        e eVar = this.presenter;
        rai raiVar = this.mvp;
        eVar.Bg(raiVar);
        kotlinx.coroutines.flow.e.H(eVar.Jg(), new jqr(new mth(eVar.Q.a, 6), new DeliveryFormPresenter$subscribeRecyclerContentRendering$1(eVar, null), 3));
        kotlinx.coroutines.flow.e.H(eVar.Jg(), new jqr(eVar.M.b, new DeliveryFormPresenter$subscribeActionBusHandling$1(2, eVar, e.class, "handleAction", "handleAction(Lru/yandex/taxi/delivery/extracted_delivery_form/ui/unitedsummary/Action;)V", 4), 3));
        kotlinx.coroutines.flow.e.H(eVar.Jg(), new jqr(kotlinx.coroutines.flow.e.n(new mth(eVar.Mg(), 6), eVar.o0, eVar.j0.d(), new DeliveryFormPresenter$subscribeFormRendering$1(4, null)), new DeliveryFormPresenter$subscribeFormRendering$2(2, eVar.Dg(), wai.class, "renderForm", "renderForm(Lru/yandex/taxi/delivery/extracted_delivery_form/ui/unitedsummary/DeliveryFormVo;)V", 4), 3));
        kotlinx.coroutines.flow.e.H(eVar.Jg(), new jqr(kotlinx.coroutines.flow.e.o(eVar.m0), new DeliveryFormPresenter$subscribeScrollEvents$1(eVar, null), 3));
        y5i y5iVar = eVar.I;
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.d(y5iVar.k));
        tpr t2 = kotlinx.coroutines.flow.e.t(new mth(eVar.Mg(), 6));
        p pVar = eVar.V;
        kotlinx.coroutines.flow.e.H(eVar.Jg(), new jqr(new mth(new j0(null, kotlinx.coroutines.flow.e.m(t, t2, kotlinx.coroutines.flow.e.t(new d(new m0(pVar.c, eVar.Mg(), new DeliveryFormPresenter$requirementsStateFlow$1(eVar, null)))), kotlinx.coroutines.flow.e.t(eVar.d0.a()), new DeliveryFormPresenter$subscribeSectionsUpdating$2(5, null)), new DeliveryFormPresenter$subscribeSectionsUpdating$$inlined$withPreviousEmit$1(3, null)), 6), new DeliveryFormPresenter$subscribeSectionsUpdating$3(eVar, null), 3));
        kotlinx.coroutines.flow.e.H(eVar.Jg(), new jqr(new b(kotlinx.coroutines.flow.e.d(eVar.T.a)), new DeliveryFormPresenter$subscribeFieldFocusChanges$2(eVar, null), 3));
        kotlinx.coroutines.flow.e.H(eVar.Jg(), new jqr(new m0(pVar.c, eVar.Mg(), new DeliveryFormPresenter$requirementsStateFlow$1(eVar, null)), new DeliveryFormPresenter$subscribeRequirementRendering$1(eVar, null), 3));
        ru.yandex.taxi.logistics.photocomment.b bVar = eVar.S;
        bVar.m = new DeliveryFormPresenter$attachView$1(0, raiVar, wai.class, "focusView", "focusView()V", 0);
        kotlinx.coroutines.flow.e.H(eVar.Jg(), bVar.d());
        DeliveryDataProvider$UpdateState deliveryDataProvider$UpdateState = DeliveryDataProvider$UpdateState.NEED_UPDATE;
        y5iVar.i = deliveryDataProvider$UpdateState;
        r0 r0Var = y5iVar.k;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, new x5i(((x5i) value).a, deliveryDataProvider$UpdateState)));
        getBinding().c.setAdapter(this.blocksAdapter);
        getBinding().g.setOnScrollChangeListener(this.onScrollListener);
        applyBottomViewBackground();
        setBottomShadow(createBottomShadow(tje.u(24, getContext())), tje.u(4, getContext()));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.presenter.B.a("back_button");
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        getBinding().c.setAdapter(null);
        getBinding().g.setOnScrollChangeListener((nn50) null);
        getBinding().f.setOnClickListener(null);
        getBinding().e.setDebounceClickListener(null);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        super.onDismissManually();
        this.mvp.hideKeyboard();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        this.presenter.x.a();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        super.onSlideOut();
        this.presenter.B.a("pull");
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        this.presenter.B.a("out_card");
    }
}
