package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import defpackage.aog0;
import defpackage.cma1;
import defpackage.eor;
import defpackage.f1h0;
import defpackage.jl40;
import defpackage.mrg0;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001e\u0010\u0016R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/yandex/taxi/design/FloatButtonSingleComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Leor;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "initView", "()V", "", "applyTitleAlignment", "()Z", "backgroundResourceId", "()I", "Landroid/view/ViewGroup$LayoutParams;", "params", "setLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "show", "hide", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "layoutParams", "onLayoutParamsInit", "Landroid/graphics/drawable/Drawable;", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public class FloatButtonSingleComponent extends ListItemComponent implements eor {
    public static final int $stable = 8;
    private final Drawable backgroundDrawable;

    public FloatButtonSingleComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.backgroundDrawable = tje.y(backgroundResourceId(), getContext());
        initView();
    }

    private final void initView() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (jl40.l(getBackground(), this.backgroundDrawable) || layoutParams == null) {
            return;
        }
        setBackground(this.backgroundDrawable);
        layoutParams.width = -2;
        layoutParams.height = tje.v(getContext(), 88.0f);
        onLayoutParamsInit(layoutParams);
        setLayoutParams(layoutParams);
        xw31.I(this, null, null, null, Integer.valueOf(tje.v(getContext(), 28.0f)));
        setTitleTypeface(3);
        setTitleTextSizePx(tje.r(mrg0.go_design_m_space, getContext()));
        if (applyTitleAlignment()) {
            setTitleAlignment(1);
        }
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        setBackgroundTintList(ColorStateList.valueOf(qje.t(xng0.bgMain, getContext())));
        setBackgroundTintMode(PorterDuff.Mode.MULTIPLY);
    }

    public boolean applyTitleAlignment() {
        return true;
    }

    public int backgroundResourceId() {
        return f1h0.fab_button_component_background;
    }

    @Override // defpackage.eor
    public void hide() {
        cma1.N(this);
    }

    public void onLayoutParamsInit(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        super.setLayoutParams(params);
        initView();
    }

    @Override // defpackage.eor
    public void show() {
        cma1.K(this);
    }

    public FloatButtonSingleComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FloatButtonSingleComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ FloatButtonSingleComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? aog0.floatButtonSingleComponentStyle : i);
    }
}
