package ru.yandex.taxi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.c4i0;
import defpackage.kyk0;
import defpackage.lyk0;
import defpackage.myk0;
import defpackage.o8k0;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u001bJ-\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010 J\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/yandex/taxi/widget/RoundedCornersImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "w", "h", "oldw", "oldh", "Lzy11;", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "setCornerRadius", "(F)V", "radiusX", "radiusY", "(FF)V", "leftTop", "rightTop", "rightBottom", "leftBottom", "(FFFF)V", "color", "setRoundedBackgroundColor", "(I)V", "Lkyk0;", "roundedCornersViewHelper", "Lkyk0;", "Landroid/graphics/Paint;", "roundedBackgroundColorPaint", "Landroid/graphics/Paint;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class RoundedCornersImageView extends AppCompatImageView {
    private Paint roundedBackgroundColorPaint;
    private final kyk0 roundedCornersViewHelper;

    public RoundedCornersImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.RoundedCornersImageView, i, 0);
        float dimension = obtainStyledAttributes.getDimension(c4i0.RoundedCornersImageView_cornerRadius, 0.0f);
        int integer = obtainStyledAttributes.getInteger(c4i0.RoundedCornersImageView_rounded_corners_mode, 0);
        obtainStyledAttributes.recycle();
        kyk0 myk0Var = integer == 0 ? new myk0(this) : new lyk0(this);
        this.roundedCornersViewHelper = myk0Var;
        myk0Var.b(dimension, dimension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onDraw$lambda$0(RoundedCornersImageView roundedCornersImageView, Canvas canvas) {
        Canvas canvas2;
        Paint paint = roundedCornersImageView.roundedBackgroundColorPaint;
        if (paint != null) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, roundedCornersImageView.getWidth(), roundedCornersImageView.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
        return zy11.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        this.roundedCornersViewHelper.a(canvas, new o8k0(7, this, canvas));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.roundedCornersViewHelper.d(w, h);
    }

    public final void setCornerRadius(float cornerRadius) {
        this.roundedCornersViewHelper.b(cornerRadius, cornerRadius);
    }

    public final void setRoundedBackgroundColor(int color) {
        if (this.roundedBackgroundColorPaint == null) {
            Paint paint = new Paint();
            this.roundedBackgroundColorPaint = paint;
            paint.setAntiAlias(true);
        }
        Paint paint2 = this.roundedBackgroundColorPaint;
        if (paint2 != null) {
            paint2.setColor(color);
        }
        invalidate();
    }

    public final void setCornerRadius(float radiusX, float radiusY) {
        this.roundedCornersViewHelper.b(radiusX, radiusY);
    }

    public final void setCornerRadius(float leftTop, float rightTop, float rightBottom, float leftBottom) {
        this.roundedCornersViewHelper.c(leftTop, rightTop, rightBottom, leftBottom);
    }

    public RoundedCornersImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RoundedCornersImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ RoundedCornersImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.roundedCornersImageViewStyle : i);
    }
}
