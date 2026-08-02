package ru.yandex.taxi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.c4i0;
import defpackage.u8b1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010!\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/yandex/taxi/widget/MaskedShimmeringBar;", "Lru/yandex/taxi/widget/ShimmeringBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "desiredSize", "measureSpec", "measureDimension", "(II)I", "Landroid/graphics/Bitmap;", "bitmap", "Lzy11;", "setMaskBitmap", "(Landroid/graphics/Bitmap;)V", "resource", "setMaskResource", "(I)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "maskPaint", "Landroid/graphics/Paint;", "maskBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/RectF;", "maskRect", "Landroid/graphics/RectF;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MaskedShimmeringBar extends ShimmeringBar {
    private Bitmap maskBitmap;
    private final Paint maskPaint;
    private final RectF maskRect;

    public MaskedShimmeringBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.maskPaint = paint;
        this.maskRect = new RectF();
        setLayerType(2, null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c4i0.MaskedShimmeringBar, i, i2);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(c4i0.MaskedShimmeringBar_mask, 0);
            if (resourceId != 0) {
                this.maskBitmap = u8b1.h(resourceId, context).extractAlpha();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final int measureDimension(int desiredSize, int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == 1073741824) {
            if (size != 0) {
                return size;
            }
        } else if (mode == Integer.MIN_VALUE) {
            return Math.min(desiredSize, size);
        }
        return desiredSize;
    }

    @Override // ru.yandex.taxi.widget.ShimmeringBar, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.maskBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.maskRect, this.maskPaint);
        }
    }

    @Override // ru.yandex.taxi.widget.ShimmeringBar, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.maskRect.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Bitmap bitmap = this.maskBitmap;
        if (bitmap == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        setMeasuredDimension(measureDimension(getPaddingRight() + getPaddingLeft() + bitmap.getWidth(), widthMeasureSpec), measureDimension(getPaddingBottom() + getPaddingTop() + bitmap.getHeight(), heightMeasureSpec));
    }

    public final void setMaskBitmap(Bitmap bitmap) {
        this.maskBitmap = bitmap.extractAlpha();
    }

    public final void setMaskResource(int resource) {
        this.maskBitmap = u8b1.h(resource, getContext()).extractAlpha();
    }

    public MaskedShimmeringBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public MaskedShimmeringBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public MaskedShimmeringBar(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ MaskedShimmeringBar(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
