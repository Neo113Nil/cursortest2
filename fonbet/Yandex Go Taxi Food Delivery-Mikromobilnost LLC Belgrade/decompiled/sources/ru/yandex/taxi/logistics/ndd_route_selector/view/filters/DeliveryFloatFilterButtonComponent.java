package ru.yandex.taxi.logistics.ndd_route_selector.view.filters;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.cma1;
import defpackage.eor;
import defpackage.f1h0;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import defpackage.xw31;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/yandex/taxi/logistics/ndd_route_selector/view/filters/DeliveryFloatFilterButtonComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Leor;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "init", "()V", "Landroid/view/ViewGroup$LayoutParams;", "params", "setLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "count", "setCounter", "(I)V", "show", "hide", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/graphics/drawable/Drawable;", C0553n3.g, "Landroid/graphics/drawable/Drawable;", "Lru/yandex/taxi/widget/RobotoTextView;", "counterView", "Lru/yandex/taxi/widget/RobotoTextView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DeliveryFloatFilterButtonComponent extends ListItemComponent implements eor {
    private final Drawable background;
    private final RobotoTextView counterView;

    public DeliveryFloatFilterButtonComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.background = tje.y(f1h0.fab_rectangle_background, getContext());
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        robotoTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        robotoTextView.setVisibility(8);
        robotoTextView.setTextAlignment(4);
        robotoTextView.setGravity(17);
        robotoTextView.setTextColor(robotoTextView.getContext().getColor(mqg0.white));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setSize(tje.u(19, robotoTextView.getContext()), tje.u(19, robotoTextView.getContext()));
        gradientDrawable.setCornerRadius(tje.w(24, robotoTextView.getContext()));
        gradientDrawable.setTint(robotoTextView.getContext().getColor(mqg0.component_cinnaban_toxic));
        robotoTextView.setBackground(gradientDrawable);
        robotoTextView.setTextSize(13.0f);
        robotoTextView.setTextTypeface(5);
        xw31.F(robotoTextView, Integer.valueOf(tje.u(6, robotoTextView.getContext())), null, null, null);
        this.counterView = robotoTextView;
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        setBackgroundTintList(ColorStateList.valueOf(qje.t(xng0.bgMain, getContext())));
        setBackgroundTintMode(PorterDuff.Mode.MULTIPLY);
    }

    @Override // defpackage.eor
    public void hide() {
        cma1.N(this);
    }

    public final void init() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (getBackground() == this.background || layoutParams == null) {
            return;
        }
        this.leadFrame.setMinimumWidth(0);
        this.trailFrame.setMinimumWidth(0);
        this.leadFrame.setIconSize(tje.u(36, getContext()), tje.u(36, getContext()));
        this.leadFrame.setIconPadding(tje.u(6, getContext()), tje.u(6, getContext()), tje.u(6, getContext()), tje.u(6, getContext()));
        setBackground(this.background);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = -2;
        layoutParams2.height = tje.u(56, getContext());
        setLayoutParams(layoutParams2);
        xw31.I(this, null, null, null, Integer.valueOf(tje.u(8, getContext())));
        xw31.J(this, Integer.valueOf(tje.u(6, getContext())), null, null, null);
        xw31.J(this, null, null, Integer.valueOf(tje.u(16, getContext())), null);
        setTitleTextSizePx(tje.r(mrg0.go_design_m_space, getContext()));
        setTrailView(this.counterView);
        setTrailVerticalGravity(0);
    }

    public final void setCounter(int count) {
        this.counterView.setText(String.valueOf(count));
        this.counterView.setVisibility(count != 0 ? 0 : 8);
        xw31.J(this, null, null, Integer.valueOf(tje.u(count != 0 ? 12 : 16, getContext())), null);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        super.setLayoutParams(params);
        init();
    }

    @Override // defpackage.eor
    public void show() {
        cma1.K(this);
    }

    public /* synthetic */ DeliveryFloatFilterButtonComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
