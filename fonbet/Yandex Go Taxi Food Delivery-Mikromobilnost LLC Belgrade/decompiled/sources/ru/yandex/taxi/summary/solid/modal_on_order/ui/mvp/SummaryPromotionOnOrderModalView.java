package ru.yandex.taxi.summary.solid.modal_on_order.ui.mvp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.b;
import com.yandex.go.summary.analytics.CancelModalCardAnalytics$ReorderModalButton;
import com.yandex.go.summary.analytics.CancelModalCardAnalytics$ReorderModalType;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.b1;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.fmv0;
import defpackage.gmv0;
import defpackage.is60;
import defpackage.jmv0;
import defpackage.kmv0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.p230;
import defpackage.pdc;
import defpackage.pex0;
import defpackage.qdb1;
import defpackage.tje;
import defpackage.ufu;
import defpackage.vmv0;
import defpackage.wfh0;
import defpackage.wiq0;
import defpackage.wrh0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zxs0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.communications.model.widgets.e0;
import ru.yandex.taxi.communications.model.widgets.x;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001d\u0010\u0015J\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#¨\u0006%"}, d2 = {"Lru/yandex/taxi/summary/solid/modal_on_order/ui/mvp/SummaryPromotionOnOrderModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lvmv0;", "Landroid/content/Context;", "context", "Lpdc;", "colorConverter", "Lkmv0;", "presenter", "<init>", "(Landroid/content/Context;Lpdc;Lkmv0;)V", "Lru/yandex/taxi/communications/model/widgets/ActionButton;", "button", "Lzy11;", "setupOrderButton", "(Lru/yandex/taxi/communications/model/widgets/ActionButton;)V", "setupCancelButton", "Lru/yandex/taxi/design/ButtonComponent;", "createButton", "(Lru/yandex/taxi/communications/model/widgets/ActionButton;)Lru/yandex/taxi/design/ButtonComponent;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lvmv0;", "onBackPressed", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lpdc;", "Lkmv0;", "gmv0", "solid"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SummaryPromotionOnOrderModalView extends SlideableBindingModalView<vmv0> {
    private final pdc colorConverter;
    private final kmv0 presenter;

    public SummaryPromotionOnOrderModalView(Context context, pdc pdcVar, kmv0 kmv0Var) {
        super(context);
        this.colorConverter = pdcVar;
        this.presenter = kmv0Var;
        qdb1.b(this, new fmv0(kmv0Var, 1));
        setDismissOnTouchOutside(false);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        b.q(getBinding().e, true);
    }

    public static final /* synthetic */ vmv0 access$getBinding(SummaryPromotionOnOrderModalView summaryPromotionOnOrderModalView) {
        return summaryPromotionOnOrderModalView.getBinding();
    }

    private final ButtonComponent createButton(ActionButton button) {
        ButtonComponent buttonComponent = new ButtonComponent(getContext(), null, 0, 6, null);
        buttonComponent.setText(button.b);
        buttonComponent.setTextSize(0, tje.r(mrg0.component_text_size_body, getContext()));
        buttonComponent.setButtonSize(3);
        buttonComponent.setRoundedCornersRadius(tje.r(mrg0.go_design_m_space, getContext()));
        buttonComponent.setButtonBackground(((ufu) this.colorConverter).e(button.c));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        buttonComponent.setLayoutParams(layoutParams);
        xw31.E(buttonComponent, null, Integer.valueOf(tje.u(4, getContext())), null, null);
        return buttonComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupCancelButton(ActionButton button) {
        ButtonComponent createButton = createButton(button);
        createButton.setButtonTitleColor(new bdc(xng0.textOnControlMinor));
        createButton.setDebounceClickListener(new fmv0(this.presenter, 0));
        getBinding().b.addView(createButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupOrderButton(ActionButton button) {
        ButtonComponent createButton = createButton(button);
        createButton.setTextTypeface(3);
        createButton.setButtonTitleColor(new bdc(xng0.textOnControl));
        createButton.setDebounceClickListener(new fmv0(this.presenter, 2));
        getBinding().b.addView(createButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupOrderButton$onAcceptActionSelected(kmv0 kmv0Var) {
        zxs0 zxs0Var = kmv0Var.A;
        ((b1) zxs0Var.a).h(CancelModalCardAnalytics$ReorderModalType.REORDER, CancelModalCardAnalytics$ReorderModalButton.Order, kmv0Var.z.a);
        kmv0Var.x.invoke();
        ((jmv0) kmv0Var.Dg()).dismiss();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        LinearLayout linearLayout = getBinding().b;
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            ButtonComponent buttonComponent = childAt instanceof ButtonComponent ? (ButtonComponent) childAt : null;
            if (buttonComponent != null) {
                buttonComponent.applyTheme(themeType);
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public vmv0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(wrh0.summary_promotions_order_button_modal_view, parent, false);
        int i = wfh0.buttons;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
        if (linearLayout != null) {
            i = wfh0.icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
            if (appCompatImageView != null) {
                i = wfh0.text;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = wfh0.title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        return new vmv0((LinearLayout) inflate, linearLayout, appCompatImageView, robotoTextView, robotoTextView2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        is60 is60Var;
        ActionButton.ButtonActionType b;
        String name;
        super.onAttachedToWindow();
        kmv0 kmv0Var = this.presenter;
        gmv0 gmv0Var = new gmv0(this);
        kmv0Var.Bg(gmv0Var);
        zxs0 zxs0Var = kmv0Var.A;
        p230 p230Var = kmv0Var.z;
        String str = p230Var.a;
        List<ActionButton> list = p230Var.e;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            ru.yandex.taxi.communications.model.widgets.b bVar = ((ActionButton) it.next()).e;
            if (bVar != null && (b = bVar.b()) != null && (name = b.name()) != null) {
                str2 = name.toLowerCase(Locale.ROOT);
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        pex0 m = ((k) ((wiq0) zxs0Var.b)).m();
        String a = (m == null || (is60Var = m.J0.b) == null) ? null : is60Var.a();
        if (a == null) {
            a = "";
        }
        b1 b1Var = (b1) zxs0Var.a;
        CancelModalCardAnalytics$ReorderModalType cancelModalCardAnalytics$ReorderModalType = CancelModalCardAnalytics$ReorderModalType.REORDER;
        b1Var.getClass();
        b1Var.o("CancelModalCard.Shown", kotlin.collections.b.i(new Pair("type", cancelModalCardAnalytics$ReorderModalType.getEventValue()), new Pair("offer_id", a), new Pair("button_list", arrayList), new Pair("modal_id", str)));
        SummaryPromotionOnOrderModalView summaryPromotionOnOrderModalView = gmv0Var.a;
        vmv0 access$getBinding = access$getBinding(summaryPromotionOnOrderModalView);
        Drawable drawable = p230Var.b;
        if (drawable != null) {
            access$getBinding.c.setImageDrawable(drawable);
        }
        access$getBinding.e.setText(p230Var.c);
        access$getBinding.d.setText(p230Var.d);
        access$getBinding.b.removeAllViews();
        for (ActionButton actionButton : list) {
            ru.yandex.taxi.communications.model.widgets.b bVar2 = actionButton.e;
            if (bVar2 instanceof e0) {
                summaryPromotionOnOrderModalView.setupOrderButton(actionButton);
            } else if (bVar2 instanceof x) {
                summaryPromotionOnOrderModalView.setupCancelButton(actionButton);
            }
        }
        xw31.E(access$getBinding(summaryPromotionOnOrderModalView).b, null, null, null, Integer.valueOf(tje.r(mrg0.go_design_s_space, summaryPromotionOnOrderModalView.getContext())));
        xw31.E(access$getBinding(summaryPromotionOnOrderModalView).b, null, Integer.valueOf(tje.r(mrg0.go_design_m_space, summaryPromotionOnOrderModalView.getContext())), null, null);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.presenter.Kg();
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }
}
