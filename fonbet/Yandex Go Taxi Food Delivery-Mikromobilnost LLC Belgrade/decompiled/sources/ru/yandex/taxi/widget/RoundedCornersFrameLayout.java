package ru.yandex.taxi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.c4i0;
import defpackage.kyk0;
import defpackage.lyk0;
import defpackage.mw0;
import defpackage.myk0;
import defpackage.xmf0;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u001bJ-\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/yandex/taxi/widget/RoundedCornersFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "w", "h", "oldw", "oldh", "Lzy11;", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "setCornerRadius", "(F)V", "radiusX", "radiusY", "(FF)V", "leftTop", "rightTop", "rightBottom", "leftBottom", "(FFFF)V", "Lkyk0;", "roundedCornersViewHelper", "Lkyk0;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class RoundedCornersFrameLayout extends FrameLayout {
    private final kyk0 roundedCornersViewHelper;

    public RoundedCornersFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.RoundedCornersFrameLayout, i, 0);
        boolean z = obtainStyledAttributes.getBoolean(c4i0.RoundedCornersFrameLayout_useScaleFix, true);
        float dimension = obtainStyledAttributes.getDimension(c4i0.RoundedCornersFrameLayout_allCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(c4i0.RoundedCornersFrameLayout_leftTopCornerRadius, -1.0f);
        dimension2 = dimension2 < 0.0f ? dimension : dimension2;
        float dimension3 = obtainStyledAttributes.getDimension(c4i0.RoundedCornersFrameLayout_rightTopCornerRadius, -1.0f);
        dimension3 = dimension3 < 0.0f ? dimension : dimension3;
        float dimension4 = obtainStyledAttributes.getDimension(c4i0.RoundedCornersFrameLayout_rightBottomCornerRadius, -1.0f);
        dimension4 = dimension4 < 0.0f ? dimension : dimension4;
        float dimension5 = obtainStyledAttributes.getDimension(c4i0.RoundedCornersFrameLayout_leftBottomCornerRadius, -1.0f);
        dimension = dimension5 >= 0.0f ? dimension5 : dimension;
        obtainStyledAttributes.recycle();
        kyk0 myk0Var = z ? new myk0(this) : new lyk0(this);
        this.roundedCornersViewHelper = myk0Var;
        myk0Var.c(dimension2, dimension3, dimension4, dimension);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        kyk0 kyk0Var = this.roundedCornersViewHelper;
        xmf0 xmf0Var = new xmf0(29, this, canvas);
        kyk0Var.getClass();
        kyk0Var.a(canvas, new mw0(4, xmf0Var));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.roundedCornersViewHelper.d(w, h);
    }

    public final void setCornerRadius(float cornerRadius) {
        this.roundedCornersViewHelper.b(cornerRadius, cornerRadius);
    }

    public final void setCornerRadius(float radiusX, float radiusY) {
        this.roundedCornersViewHelper.b(radiusX, radiusY);
    }

    public final void setCornerRadius(float leftTop, float rightTop, float rightBottom, float leftBottom) {
        this.roundedCornersViewHelper.c(leftTop, rightTop, rightBottom, leftBottom);
    }

    public RoundedCornersFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RoundedCornersFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ RoundedCornersFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.roundedCornersImageViewStyle : i);
    }
}
