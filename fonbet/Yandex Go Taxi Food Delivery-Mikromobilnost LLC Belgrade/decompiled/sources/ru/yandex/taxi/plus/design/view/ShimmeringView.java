package ru.yandex.taxi.plus.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.e4i0;
import defpackage.mrg0;
import defpackage.qje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.ShimmeringPaint;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/yandex/taxi/plus/design/view/ShimmeringView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "changed", "left", "top", "right", "bottom", "Lzy11;", "onLayout", "(ZIIII)V", "startShimmer", "()V", "pauseShimmer", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/yandex/taxi/widget/ShimmeringPaint;", "shimmeringPaint", "Lru/yandex/taxi/widget/ShimmeringPaint;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "shimmering", "Z", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "", "radius", "F", "plus_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShimmeringView extends View {
    private final Paint paint;
    private final float radius;
    private final RectF rect;
    private boolean shimmering;
    private final ShimmeringPaint shimmeringPaint;

    public ShimmeringView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Float f;
        ShimmeringPaint shimmeringPaint = new ShimmeringPaint(getContext());
        this.shimmeringPaint = shimmeringPaint;
        Paint paint = new Paint();
        this.paint = paint;
        this.shimmering = true;
        this.rect = new RectF();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e4i0.ShimmeringView);
            f = Float.valueOf(obtainStyledAttributes.getDimension(e4i0.ShimmeringView_corner_radius, context.getResources().getDimension(mrg0.go_design_s_space)));
            obtainStyledAttributes.recycle();
        } else {
            f = null;
        }
        this.radius = f != null ? f.floatValue() : context.getResources().getDimension(mrg0.go_design_s_space);
        int t = qje.t(xng0.bgMinor, getContext());
        shimmeringPaint.setColors(qje.t(xng0.bgMain, getContext()), t);
        shimmeringPaint.setAntiAlias(true);
        paint.setColor(t);
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.shimmering) {
            this.shimmeringPaint.updateShimmering();
            postInvalidateOnAnimation();
        }
        RectF rectF = this.rect;
        float f = this.radius;
        Paint paint = this.shimmeringPaint;
        if (!this.shimmering) {
            paint = null;
        }
        if (paint == null) {
            paint = this.paint;
        }
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.shimmeringPaint.updateOffset(this);
        this.rect.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
    }

    public final void pauseShimmer() {
        this.shimmering = false;
        invalidate();
    }

    public final void startShimmer() {
        this.shimmering = true;
        invalidate();
    }

    public ShimmeringView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ShimmeringView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ShimmeringView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
