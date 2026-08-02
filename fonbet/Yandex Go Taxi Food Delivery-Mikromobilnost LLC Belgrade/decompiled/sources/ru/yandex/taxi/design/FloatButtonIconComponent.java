package ru.yandex.taxi.design;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import defpackage.Cfor;
import defpackage.dzg0;
import defpackage.eor;
import defpackage.iz2;
import defpackage.ndh0;
import defpackage.qje;
import defpackage.sph0;
import defpackage.tje;
import defpackage.vng;
import defpackage.xng0;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.buttons.LittleIconCircleButton;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u00060\u001eR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lru/yandex/taxi/widget/buttons/LittleIconCircleButton;", "Leor;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "translateFloatButton", "()F", "getLayoutResource", "()I", "Lzy11;", "onDetachedFromWindow", "()V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "getShadowCropFactor", "show", "hide", "Liz2;", "animationHelper", "Liz2;", "Lfor;", "internalAnimatorDelegate", "Lfor;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public class FloatButtonIconComponent extends LittleIconCircleButton implements eor {
    public static final int $stable = 8;
    private final iz2 animationHelper;
    private final Cfor internalAnimatorDelegate;

    public FloatButtonIconComponent(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.animationHelper = new iz2();
        this.internalAnimatorDelegate = new Cfor(this);
        enableShadow();
        setY(translateFloatButton());
    }

    @Override // ru.yandex.taxi.widget.buttons.IconCircleButton, ru.yandex.taxi.design.CircleButtonComponent, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        getIcon().setBackground(vng.t(dzg0.fab_component_light, getContext()));
        Object tag = getTag(ndh0.circle_btn_icon);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            setIconTintColor(qje.t(num.intValue(), getContext()));
        }
    }

    @Override // ru.yandex.taxi.widget.buttons.LittleIconCircleButton, ru.yandex.taxi.widget.buttons.IconCircleButton, ru.yandex.taxi.design.CircleButtonComponent
    public int getLayoutResource() {
        return sph0.float_button_icon_component;
    }

    @Override // ru.yandex.taxi.design.CircleButtonComponent
    public float getShadowCropFactor() {
        return 3.0f;
    }

    @Override // ru.yandex.taxi.design.CircleButtonComponent, defpackage.eor
    public void hide() {
        Rect rect = xw31.a;
        Drawable background = getBackground();
        if (background != null && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setVisible(false, false);
        }
        this.animationHelper.c(this.internalAnimatorDelegate, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.animationHelper.a();
    }

    @Override // defpackage.eor
    public void show() {
        Rect rect = xw31.a;
        Drawable background = getBackground();
        if (background != null && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setVisible(false, false);
        }
        this.animationHelper.d(this.internalAnimatorDelegate, null);
    }

    public float translateFloatButton() {
        return tje.w(12, getContext());
    }

    public FloatButtonIconComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public FloatButtonIconComponent(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public FloatButtonIconComponent(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ FloatButtonIconComponent(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? xng0.circleButtonComponentStyle : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
