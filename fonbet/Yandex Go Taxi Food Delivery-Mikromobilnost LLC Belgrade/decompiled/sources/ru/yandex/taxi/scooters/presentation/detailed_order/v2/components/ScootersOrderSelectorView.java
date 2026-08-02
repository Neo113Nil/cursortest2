package ru.yandex.taxi.scooters.presentation.detailed_order.v2.components;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoConstraintLayout;
import defpackage.c90;
import defpackage.cma1;
import defpackage.dzg0;
import defpackage.ehn0;
import defpackage.f1h0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.p6o0;
import defpackage.pfh0;
import defpackage.qje;
import defpackage.qrh0;
import defpackage.sgn0;
import defpackage.sls;
import defpackage.tb;
import defpackage.tgn0;
import defpackage.tje;
import defpackage.tls;
import defpackage.ugn0;
import defpackage.v3n0;
import defpackage.vgn0;
import defpackage.vng;
import defpackage.wgn0;
import defpackage.xng0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.SegmentedComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.buttons.CircleButtonImageView;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\n2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R$\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/ScootersOrderSelectorView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "applySelectorTheme", "()V", "Lru/yandex/taxi/widget/RobotoTextView;", "itemView", "updateSelectorItemTextColor", "(Lru/yandex/taxi/widget/RobotoTextView;)V", "onAttachedToWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "applyThemeForChildrenByDefault", "()Z", "Lkotlin/Function1;", "", "listener", "setOnChangeScooterListener", "(Ltls;)V", "Lkotlin/Function0;", "setOnOneMoreScooterListener", "(Lsls;)V", "Lwgn0;", "model", "render", "(Lwgn0;)V", "Lp6o0;", "binding", "Lp6o0;", "currentModel", "Lwgn0;", "", "selectorItemViews", "Ljava/util/List;", "onOneMoreScooterListener", "Lsls;", "onChangeScooterListener", "Ltls;", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersOrderSelectorView extends GoConstraintLayout {
    public static final int $stable = 8;
    private final p6o0 binding;
    private wgn0 currentModel;
    private tls onChangeScooterListener;
    private sls onOneMoreScooterListener;
    private final List<RobotoTextView> selectorItemViews;

    public ScootersOrderSelectorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        LayoutInflater.from(context).inflate(qrh0.scooters_order_selector_view, this);
        int i2 = pfh0.book_another_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i2, this);
        if (buttonComponent != null) {
            i2 = pfh0.selector_plus_button;
            CircleButtonImageView circleButtonImageView = (CircleButtonImageView) cma1.O(i2, this);
            if (circleButtonImageView != null) {
                i2 = pfh0.selector_view;
                SegmentedComponent segmentedComponent = (SegmentedComponent) cma1.O(i2, this);
                if (segmentedComponent != null) {
                    this.binding = new p6o0(this, buttonComponent, circleButtonImageView, segmentedComponent);
                    this.selectorItemViews = new ArrayList();
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void applySelectorTheme() {
        SegmentedComponent segmentedComponent = this.binding.d;
        segmentedComponent.setSelectedTabIndicatorColor(qje.t(xng0.controlMinor, segmentedComponent.getContext()));
        segmentedComponent.setBackgroundRectColor(qje.t(xng0.bgFloating, segmentedComponent.getContext()));
        segmentedComponent.setBackgroundCornerRadiusPx(tje.v(segmentedComponent.getContext(), 44.0f));
        ButtonComponent buttonComponent = this.binding.b;
        buttonComponent.setRippleColor(qje.t(xng0.bgRipple, buttonComponent.getContext()));
        buttonComponent.setTextIcon(f1h0.ic_plus_fill);
        this.binding.c.setBackground(vng.t(dzg0.fab_component_light, getContext()));
        this.binding.c.setImageResource(f1h0.ic_plus_fill);
        this.binding.c.setImageTintList(ColorStateList.valueOf(qje.t(xng0.textMain, getContext())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0$0(ScootersOrderSelectorView scootersOrderSelectorView) {
        sls slsVar = scootersOrderSelectorView.onOneMoreScooterListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$1(ScootersOrderSelectorView scootersOrderSelectorView) {
        sls slsVar = scootersOrderSelectorView.onOneMoreScooterListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$0(Integer num) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$2(ScootersOrderSelectorView scootersOrderSelectorView, wgn0 wgn0Var, Integer num) {
        tls tlsVar = scootersOrderSelectorView.onChangeScooterListener;
        if (tlsVar != null) {
            tlsVar.invoke(((ugn0) ((vgn0) wgn0Var).a.get(num.intValue())).a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectorItemTextColor(RobotoTextView itemView) {
        itemView.setTextColor(qje.t(itemView.isSelected() ? xng0.textMain : xng0.textMinor, getContext()));
    }

    @Override // com.yandex.go.design.view.GoConstraintLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        applySelectorTheme();
        Iterator<T> it = this.selectorItemViews.iterator();
        while (it.hasNext()) {
            updateSelectorItemTextColor((RobotoTextView) it.next());
        }
    }

    @Override // com.yandex.go.design.view.GoConstraintLayout, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        applySelectorTheme();
        ButtonComponent buttonComponent = this.binding.b;
        buttonComponent.setText(buttonComponent.getContext().getString(kyh0.scooters_order_take_one_more));
        buttonComponent.setTextTypeface(5);
        buttonComponent.setDebounceClickListener(new v3n0(16, this));
        c.z(new ehn0(13, this), this.binding.c);
    }

    public final void render(wgn0 model) {
        if (jl40.l(this.currentModel, model)) {
            return;
        }
        this.currentModel = model;
        int i = 8;
        this.binding.a.setVisibility(!(model instanceof tgn0) ? 0 : 8);
        this.binding.b.setVisibility(model instanceof sgn0 ? 0 : 8);
        boolean z = model instanceof vgn0;
        this.binding.d.setVisibility(z ? 0 : 8);
        this.binding.c.setVisibility((z && ((vgn0) model).c) ? 0 : 8);
        List<RobotoTextView> list = this.selectorItemViews;
        if (!z) {
            list.clear();
            return;
        }
        list.clear();
        this.binding.d.clearTabs();
        this.binding.d.setUserSelectionChangeListener(new c90(16));
        vgn0 vgn0Var = (vgn0) model;
        for (ugn0 ugn0Var : vgn0Var.a) {
            RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
            robotoTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            robotoTextView.setText(ugn0Var.b);
            robotoTextView.setGravity(17);
            robotoTextView.setPadding(tje.u(16, robotoTextView.getContext()), robotoTextView.getPaddingTop(), tje.u(16, robotoTextView.getContext()), robotoTextView.getPaddingBottom());
            updateSelectorItemTextColor(robotoTextView);
            this.selectorItemViews.add(robotoTextView);
            tb tbVar = new tb(i, this, robotoTextView);
            this.binding.d.addCustomViewTab(robotoTextView, tbVar, tbVar);
        }
        this.binding.d.setSelectedTab(vgn0Var.b);
        this.binding.d.setUserSelectionChangeListener(new tb(9, this, vgn0Var));
    }

    public final void setOnChangeScooterListener(tls listener) {
        this.onChangeScooterListener = listener;
    }

    public final void setOnOneMoreScooterListener(sls listener) {
        this.onOneMoreScooterListener = listener;
    }

    public ScootersOrderSelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ScootersOrderSelectorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ScootersOrderSelectorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
