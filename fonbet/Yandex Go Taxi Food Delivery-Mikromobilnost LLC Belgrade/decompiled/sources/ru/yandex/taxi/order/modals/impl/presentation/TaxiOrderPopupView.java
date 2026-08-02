package ru.yandex.taxi.order.modals.impl.presentation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.b;
import defpackage.a6h0;
import defpackage.c230;
import defpackage.cma1;
import defpackage.guh0;
import defpackage.i4y0;
import defpackage.kux0;
import defpackage.ny61;
import defpackage.oew0;
import defpackage.p2y;
import defpackage.qdb1;
import defpackage.t4y0;
import defpackage.tje;
import kotlin.Metadata;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0018\u0010\u0011J\u000f\u0010\u0019\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0019\u0010\u0011J\u000f\u0010\u001a\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001a\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/order/modals/impl/presentation/TaxiOrderPopupView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lp2y;", "Landroid/content/Context;", "context", "Li4y0;", "presenter", "<init>", "(Landroid/content/Context;Li4y0;)V", "Lc230;", "insetsType", "()Lc230;", "", "isArrowsPermanentlyHidden", "()Z", "Lzy11;", "addCloseButton", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lp2y;", "onAttachedToWindow", "onDetachedFromWindow", "onDismissManually", "Li4y0;", "withCloseButton", "Z", "t4y0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TaxiOrderPopupView extends SlideableBindingModalView<p2y> {
    private final i4y0 presenter;
    private boolean withCloseButton;

    public TaxiOrderPopupView(Context context, i4y0 i4y0Var) {
        super(context);
        this.presenter = i4y0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(TaxiOrderPopupView taxiOrderPopupView) {
        return taxiOrderPopupView.getBinding().a;
    }

    public final void addCloseButton() {
        this.withCloseButton = true;
        qdb1.c(this, new kux0(3, this));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public p2y bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(guh0.layout_taxi_order_popup, parent, false);
        int i = a6h0.button_placeholder;
        if (((PlaceholderView) cma1.O(i, inflate)) != null) {
            i = a6h0.content_group;
            Group group = (Group) cma1.O(i, inflate);
            if (group != null) {
                i = a6h0.content_placeholder;
                if (((PlaceholderView) cma1.O(i, inflate)) != null) {
                    i = a6h0.content_text;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView != null) {
                        i = a6h0.header_icon;
                        ImageView imageView = (ImageView) cma1.O(i, inflate);
                        if (imageView != null) {
                            i = a6h0.icon_placeholder;
                            if (((PlaceholderView) cma1.O(i, inflate)) != null) {
                                i = a6h0.loading_group;
                                Group group2 = (Group) cma1.O(i, inflate);
                                if (group2 != null) {
                                    i = a6h0.title_placeholder;
                                    if (((PlaceholderView) cma1.O(i, inflate)) != null) {
                                        i = a6h0.title_text;
                                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                                        if (robotoTextView2 != null) {
                                            i = a6h0.widgets_layout;
                                            LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                                            if (linearLayout != null) {
                                                return new p2y((ConstraintLayout) inflate, group, robotoTextView, imageView, group2, robotoTextView2, linearLayout);
                                            }
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

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(0, new oew0(11, this), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden, reason: from getter */
    public boolean getRouteSummaryIsVisible() {
        return this.withCloseButton;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i4y0 i4y0Var = this.presenter;
        t4y0 t4y0Var = new t4y0(this);
        i4y0Var.Bg(t4y0Var);
        tje.N(i4y0Var.Jg(), null, null, new TaxiOrderPopupPresenter$attachView$1(i4y0Var, t4y0Var, null), 3);
        b.q(getBinding().f, true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        this.presenter.y.e();
    }
}
