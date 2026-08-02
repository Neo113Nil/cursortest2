package ru.yandex.taxi.altpins.order_for_another.modal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.b;
import defpackage.bdh0;
import defpackage.cma1;
import defpackage.gph0;
import defpackage.kw1;
import defpackage.lw1;
import defpackage.mw1;
import defpackage.nw1;
import defpackage.ny61;
import defpackage.rw1;
import kotlin.Metadata;
import ru.yandex.taxi.altpins.order_for_another.modal.AlternativeDestinationForAnotherModalView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0014B\u0019\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0018\u0010\u0015\u001a\u00060\u0014R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/altpins/order_for_another/modal/AlternativeDestinationForAnotherModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lmw1;", "Landroid/content/Context;", "context", "Lrw1;", "presenter", "<init>", "(Landroid/content/Context;Lrw1;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lmw1;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lrw1;", "Llw1;", "innerView", "Llw1;", "Companion", "kw1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AlternativeDestinationForAnotherModalView extends SlideableBindingModalView<mw1> {
    private static final kw1 Companion = new kw1();
    private static final float PRIMARY_BUTTON_LETTER_SPACING = -0.005f;
    private static final float TITLE_LETTER_SPACING = -0.01f;
    private final lw1 innerView;
    private final rw1 presenter;

    public AlternativeDestinationForAnotherModalView(Context context, rw1 rw1Var) {
        super(context);
        this.presenter = rw1Var;
        this.innerView = new lw1(this);
        final int i = 1;
        b.q(getBinding().d, true);
        getBinding().d.setLetterSpacing(-0.01f);
        ButtonComponent buttonComponent = getBinding().b;
        buttonComponent.setTextTypeface(3);
        buttonComponent.setLetterSpacing(-0.005f);
        final int i2 = 0;
        buttonComponent.setDebounceClickListener(new Runnable(this) { // from class: jw1
            public final /* synthetic */ AlternativeDestinationForAnotherModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                AlternativeDestinationForAnotherModalView alternativeDestinationForAnotherModalView = this.b;
                switch (i3) {
                    case 0:
                        AlternativeDestinationForAnotherModalView.lambda$0$0(alternativeDestinationForAnotherModalView);
                        break;
                    default:
                        AlternativeDestinationForAnotherModalView._init_$lambda$1(alternativeDestinationForAnotherModalView);
                        break;
                }
            }
        });
        getBinding().c.setDebounceClickListener(new Runnable(this) { // from class: jw1
            public final /* synthetic */ AlternativeDestinationForAnotherModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                AlternativeDestinationForAnotherModalView alternativeDestinationForAnotherModalView = this.b;
                switch (i3) {
                    case 0:
                        AlternativeDestinationForAnotherModalView.lambda$0$0(alternativeDestinationForAnotherModalView);
                        break;
                    default:
                        AlternativeDestinationForAnotherModalView._init_$lambda$1(alternativeDestinationForAnotherModalView);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(AlternativeDestinationForAnotherModalView alternativeDestinationForAnotherModalView) {
        rw1 rw1Var = alternativeDestinationForAnotherModalView.presenter;
        rw1Var.x.invoke();
        ((nw1) rw1Var.Dg()).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$0(AlternativeDestinationForAnotherModalView alternativeDestinationForAnotherModalView) {
        rw1 rw1Var = alternativeDestinationForAnotherModalView.presenter;
        rw1Var.y.invoke();
        ((nw1) rw1Var.Dg()).dismiss();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public mw1 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(gph0.alternative_destination_for_another_modal_view, parent, false);
        int i = bdh0.buttons;
        if (((LinearLayout) cma1.O(i, inflate)) != null) {
            i = bdh0.primary_button_with_decline_action;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = bdh0.secondary_button_with_confirm_action;
                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent2 != null) {
                    i = bdh0.text;
                    if (((RobotoTextView) cma1.O(i, inflate)) != null) {
                        i = bdh0.title;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView != null) {
                            return new mw1((LinearLayout) inflate, buttonComponent, buttonComponent2, robotoTextView);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Bg(this.innerView);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
