package ru.yandex.taxi.plus.badge;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.c4i0;
import defpackage.f4i0;
import defpackage.hk4;
import defpackage.tqg0;
import defpackage.xyt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R$\u0010(\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/yandex/taxi/plus/badge/BadgeContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/RectF;", "clip", "Lzy11;", "clipBackground", "(Landroid/graphics/RectF;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lhk4;", "badgeDecorator", "Lhk4;", "", "value", "isDrawShadow", "Z", "()Z", "setDrawShadow", "(Z)V", "", "getCornerRadius", "()F", "setCornerRadius", "(F)V", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BadgeContainer extends FrameLayout {
    private final hk4 badgeDecorator;
    private boolean isDrawShadow;

    public BadgeContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        hk4 hk4Var = new hk4(context, this);
        this.badgeDecorator = hk4Var;
        this.isDrawShadow = true;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.BadgeView, i, 0);
        try {
            hk4Var.g = obtainStyledAttributes.getDimension(f4i0.BadgeContainer_cornerRadius, hk4Var.g);
            hk4Var.j = hk4Var.a();
            invalidate();
            hk4Var.h = obtainStyledAttributes.getDimension(f4i0.BadgeContainer_shadowRadius, hk4Var.h);
            hk4Var.j = hk4Var.a();
            invalidate();
            hk4Var.c = obtainStyledAttributes.getColor(f4i0.BadgeContainer_shadowColor, context.getColor(tqg0.cashback_shadow_color));
            obtainStyledAttributes.recycle();
            setWillNotDraw(false);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void clipBackground(RectF clip) {
        hk4 hk4Var = this.badgeDecorator;
        hk4Var.i = clip;
        hk4Var.j = hk4Var.a();
        hk4Var.a.invalidate();
    }

    public final float getCornerRadius() {
        return this.badgeDecorator.g;
    }

    /* renamed from: isDrawShadow, reason: from getter */
    public final boolean getIsDrawShadow() {
        return this.isDrawShadow;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        xyt xytVar = this.badgeDecorator.j;
        if (xytVar == null) {
            xytVar = null;
        }
        xytVar.draw(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        hk4 hk4Var = this.badgeDecorator;
        hk4Var.e = h;
        hk4Var.j = hk4Var.a();
        hk4Var.a.invalidate();
    }

    public final void setCornerRadius(float f) {
        hk4 hk4Var = this.badgeDecorator;
        hk4Var.g = f;
        hk4Var.j = hk4Var.a();
        hk4Var.a.invalidate();
    }

    public final void setDrawShadow(boolean z) {
        this.isDrawShadow = z;
        hk4 hk4Var = this.badgeDecorator;
        hk4Var.f = z;
        hk4Var.j = hk4Var.a();
        hk4Var.j = hk4Var.a();
        hk4Var.a.invalidate();
    }

    public BadgeContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BadgeContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BadgeContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
