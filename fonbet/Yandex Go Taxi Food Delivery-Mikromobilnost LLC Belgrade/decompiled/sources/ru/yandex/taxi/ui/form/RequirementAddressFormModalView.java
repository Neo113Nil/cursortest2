package ru.yandex.taxi.ui.form;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.preorder.requirements.RequirementAddressInfo;
import com.yandex.go.taxi.order.models.api.preorder.requirements.RequirementAddressRouteInfo;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.acj0;
import defpackage.bcj0;
import defpackage.bl21;
import defpackage.c230;
import defpackage.cma1;
import defpackage.dcj0;
import defpackage.evu0;
import defpackage.f580;
import defpackage.fmw0;
import defpackage.gbj0;
import defpackage.hcj0;
import defpackage.hfh0;
import defpackage.irh0;
import defpackage.jqr;
import defpackage.jr10;
import defpackage.mb30;
import defpackage.mcj0;
import defpackage.mrg0;
import defpackage.nbj0;
import defpackage.ny61;
import defpackage.oxe0;
import defpackage.pv70;
import defpackage.qcj0;
import defpackage.rcj0;
import defpackage.tje;
import defpackage.ubj0;
import defpackage.vbj0;
import defpackage.vyf0;
import defpackage.xu0;
import defpackage.zbj0;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.domain.ContactSelectionStrategy;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB!\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0014\u0010\u0010J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0018\u0010\u001e\u001a\u00060\u001dR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/yandex/taxi/ui/form/RequirementAddressFormModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lqcj0;", "Landroid/content/Context;", "context", "Ldcj0;", "presenter", "Lf580;", "analytics", "<init>", "(Landroid/content/Context;Ldcj0;Lf580;)V", "Lc230;", "insetsType", "()Lc230;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onDismissManually", "onSlideOut", "onModalViewDisappear", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lqcj0;", "Ldcj0;", "Lf580;", "Lacj0;", "mvpView", "Lacj0;", "Lubj0;", "adapter", "Lubj0;", "", "getCornerRadius", "()I", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "address"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequirementAddressFormModalView extends SlideableBindingModalView<qcj0> {
    private final ubj0 adapter;
    private final f580 analytics;
    private final acj0 mvpView;
    private final dcj0 presenter;

    public RequirementAddressFormModalView(Context context, dcj0 dcj0Var, f580 f580Var) {
        super(context);
        this.presenter = dcj0Var;
        this.analytics = f580Var;
        this.mvpView = new acj0(this);
        this.adapter = new ubj0(new RequirementAddressFormModalView$adapter$1(0, dcj0Var, dcj0.class, "selectPhone", "selectPhone()V", 0), new RequirementAddressFormModalView$adapter$2(3, dcj0Var, dcj0.class, "saveFieldData", "saveFieldData(Lru/yandex/taxi/domain/RequirementAddressInputType;Ljava/lang/String;Z)V", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(RequirementAddressFormModalView requirementAddressFormModalView) {
        return requirementAddressFormModalView.getBinding().b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(RequirementAddressFormModalView requirementAddressFormModalView) {
        mb30 mb30Var = requirementAddressFormModalView.analytics.d;
        mb30Var.getClass();
        mb30Var.a.a("MoveThingsDetailsCard.Confirm", new HashMap(), 1, new HashMap());
        requirementAddressFormModalView.dismiss();
        dcj0 dcj0Var = requirementAddressFormModalView.presenter;
        jr10 jr10Var = dcj0Var.z;
        jr10Var.d.f(new bl21(jr10Var.b.c().c, 2));
        nbj0 nbj0Var = jr10Var.b.c().d;
        if (nbj0Var != null) {
            jr10Var.c.k(nbj0Var.a, nbj0Var.b);
        }
        Preorder preorder = jr10Var.a.a;
        rcj0 rcj0Var = jr10Var.e;
        zbj0 c = jr10Var.b.c();
        rcj0Var.getClass();
        xu0 xu0Var = c.a;
        RequirementAddressInfo requirementAddressInfo = new RequirementAddressInfo(xu0Var.b, xu0Var.d, xu0Var.c, xu0Var.e);
        xu0 xu0Var2 = c.b;
        RequirementAddressInfo requirementAddressInfo2 = xu0Var2 == null ? null : new RequirementAddressInfo(xu0Var2.b, xu0Var2.d, xu0Var2.c, xu0Var2.e);
        nbj0 nbj0Var2 = c.d;
        preorder.K = new RequirementAddressRouteInfo(requirementAddressInfo, requirementAddressInfo2, nbj0Var2 != null ? nbj0Var2.a : null);
        dcj0Var.x.a.n();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public qcj0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = LayoutInflater.from(getContext()).inflate(irh0.requirement_address_modal_view, getCardContentContainer(), false);
        int i = hfh0.bottom_container;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
        if (linearLayout != null) {
            i = hfh0.content_recycler_view;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
            if (recyclerView != null) {
                i = hfh0.order_button;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                if (listItemComponent != null) {
                    i = hfh0.requirement_address_promo_icon;
                    ImageView imageView = (ImageView) cma1.O(i, inflate);
                    if (imageView != null) {
                        i = hfh0.requirement_address_promo_icon_shimmering;
                        ShimmeringFrameLayout shimmeringFrameLayout = (ShimmeringFrameLayout) cma1.O(i, inflate);
                        if (shimmeringFrameLayout != null) {
                            i = hfh0.requirement_address_promo_info;
                            LinearLayout linearLayout2 = (LinearLayout) cma1.O(i, inflate);
                            if (linearLayout2 != null) {
                                i = hfh0.requirement_address_promo_info_text;
                                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                                if (robotoTextView != null) {
                                    i = hfh0.requirement_address_scroll_view;
                                    if (((NestedScrollViewAdvanced) cma1.O(i, inflate)) != null) {
                                        i = hfh0.shadow;
                                        if (((ImageView) cma1.O(i, inflate)) != null) {
                                            return new qcj0((ConstraintLayout) inflate, linearLayout, recyclerView, listItemComponent, imageView, shimmeringFrameLayout, linearLayout2, robotoTextView);
                                        }
                                    }
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

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(0, new vyf0(19, this), true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        gbj0 gbj0Var;
        hcj0 hcj0Var;
        mcj0 mcj0Var;
        super.onAttachedToWindow();
        dcj0 dcj0Var = this.presenter;
        acj0 acj0Var = this.mvpView;
        dcj0Var.Bg(acj0Var);
        fmw0 b = dcj0Var.C.b();
        int i = 3;
        if (b == null || (gbj0Var = b.o) == null || (hcj0Var = gbj0Var.a) == null || (mcj0Var = hcj0Var.a) == null) {
            ((bcj0) dcj0Var.Dg()).S8();
        } else {
            ((bcj0) dcj0Var.Dg()).L5(mcj0Var.b);
            String str = mcj0Var.a;
            if (evu0.J(str)) {
                ((bcj0) dcj0Var.Dg()).Wb(null);
            } else {
                tje.N(dcj0Var.Jg(), null, null, new RequirementAddressFormPresenter$bindPromoBlock$1(dcj0Var, str, null), 3);
            }
        }
        pv70 g = dcj0Var.A.g();
        if (g != null) {
            String b2 = g.b();
            String a = g.a();
            ContactSelectionStrategy contactSelectionStrategy = ContactSelectionStrategy.FROM_ORDER;
            nbj0 nbj0Var = new nbj0(b2, a, contactSelectionStrategy);
            vbj0 vbj0Var = dcj0Var.B;
            nbj0 nbj0Var2 = vbj0Var.d;
            if (nbj0Var2 == null) {
                vbj0Var.d = nbj0Var;
            } else if (nbj0Var2.c == contactSelectionStrategy) {
                vbj0Var.d = nbj0Var;
            }
        }
        e.H(dcj0Var.Jg(), new jqr(dcj0Var.y.a(), new RequirementAddressFormPresenter$attachView$1(2, acj0Var, bcj0.class, "renderState", "renderState(Lru/yandex/taxi/ui/form/state/RequirementAddressViewState;)V", 4), i));
        getBinding().c.setAdapter(this.adapter);
        getBinding().d.setDebounceClickListener(new oxe0(26, this));
        c.z(new RequirementAddressFormModalView$onAttachedToWindow$2(0, this.presenter, dcj0.class, "showDetails", "showDetails()V", 0), getBinding().g);
        mb30 mb30Var = this.analytics.d;
        String lowerCase = "summary".toLowerCase(Locale.ROOT);
        mb30Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", lowerCase);
        mb30Var.a.a("MoveThingsDetailsCard.Shown", hashMap, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mb30 mb30Var = this.analytics.d;
        mb30Var.getClass();
        mb30Var.a.a("MoveThingsDetailsCard.Closed", new HashMap(), 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        this.mvpView.hideKeyboard();
        this.presenter.x.a.o();
        super.onDismissManually();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        this.presenter.Cg();
        super.onModalViewDisappear();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        this.mvpView.hideKeyboard();
        super.onSlideOut();
    }
}
