package ru.yandex.taxi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.c4i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b \n\u0002\u0010\t\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010'\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u00107\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010=\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010'\u001a\u0004\b>\u00104\"\u0004\b?\u00106R*\u0010A\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010'\u001a\u0004\bA\u00104\"\u0004\bB\u00106R$\u0010F\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010:\"\u0004\bE\u0010<R\u0011\u0010\u000b\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bG\u0010:R&\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00068G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010:\"\u0004\bI\u0010<R&\u0010J\u001a\u00020,2\b\b\u0001\u0010J\u001a\u00020,8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u00100\"\u0004\bL\u00102R$\u0010S\u001a\u00020M2\u0006\u0010N\u001a\u00020M8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010V\u001a\u00020,2\u0006\u0010@\u001a\u00020,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u00100\"\u0004\bU\u00102¨\u0006W"}, d2 = {"Lru/yandex/taxi/widget/ShimmeringFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "centerColor", "edgeColor", "Lzy11;", "setColors", "(II)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "restartShimmering", "()V", "initAttributes", "(Landroid/util/AttributeSet;I)V", "Lru/yandex/taxi/widget/ShimmeringPaint;", "paint", "Lru/yandex/taxi/widget/ShimmeringPaint;", "gradientWidthWrapContent", "Z", "scrolledHorizontally", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "", "shimmeringCornerRadius", "F", "getShimmeringCornerRadius", "()F", "setShimmeringCornerRadius", "(F)V", "isShimmeringMultiMode", "()Z", "setShimmeringMultiMode", "(Z)V", "repeatCount", CA20Status.STATUS_USER_I, "getRepeatCount", "()I", "setRepeatCount", "(I)V", "disableTouchEvents", "getDisableTouchEvents", "setDisableTouchEvents", "value", "isShimmering", "setShimmering", "gradientWidth", "getShimmeringWidth", "setShimmeringWidth", "shimmeringWidth", "getEdgeColor", "getCenterColor", "setCenterColor", "centerOffset", "getCenterOffset", "setCenterOffset", "", "duration", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "animationDuration", "getAngle", "setAngle", "angle", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ShimmeringFrameLayout extends FrameLayout {
    private boolean disableTouchEvents;
    private boolean gradientWidthWrapContent;
    private boolean isShimmering;
    private boolean isShimmeringMultiMode;
    private final ShimmeringPaint paint;
    private final RectF rect;
    private int repeatCount;
    private boolean scrolledHorizontally;
    private float shimmeringCornerRadius;

    public ShimmeringFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.paint = new ShimmeringPaint(context);
        this.rect = new RectF();
        this.repeatCount = -1;
        initAttributes(attributeSet, i);
        this.isShimmering = true;
    }

    private final void initAttributes(AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, c4i0.ShimmeringFrameLayout, defStyleAttr, 0);
        try {
            this.paint.setDuration(obtainStyledAttributes.getInt(c4i0.ShimmeringFrameLayout_shimmeringDuration, (int) r7.getDuration()));
            int layoutDimension = obtainStyledAttributes.getLayoutDimension(c4i0.ShimmeringFrameLayout_shimmeringWidth, this.paint.getGradientWidth());
            if (layoutDimension == -2) {
                this.gradientWidthWrapContent = true;
            } else {
                this.paint.setGradientWidth(layoutDimension);
            }
            ShimmeringPaint shimmeringPaint = this.paint;
            shimmeringPaint.setColors(obtainStyledAttributes.getColor(c4i0.ShimmeringFrameLayout_shimmeringCenterColor, shimmeringPaint.getCenterColor()), obtainStyledAttributes.getColor(c4i0.ShimmeringFrameLayout_shimmeringEdgeColor, this.paint.getEdgeColor()));
            this.paint.setCenterOffset(obtainStyledAttributes.getFloat(c4i0.ShimmeringFrameLayout_shimmeringCenterOffset, 0.5f));
            this.isShimmeringMultiMode = obtainStyledAttributes.getBoolean(c4i0.ShimmeringFrameLayout_shimmeringMultiMode, this.isShimmeringMultiMode);
            this.scrolledHorizontally = obtainStyledAttributes.getBoolean(c4i0.ShimmeringBar_scrolledHorizontally, false);
            this.paint.setAngle(obtainStyledAttributes.getFloat(c4i0.ShimmeringFrameLayout_shimmeringAngle, getAngle()));
            this.shimmeringCornerRadius = obtainStyledAttributes.getDimension(c4i0.ShimmeringFrameLayout_shimmeringCornerRadius, this.shimmeringCornerRadius);
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z = this.scrolledHorizontally;
        ShimmeringPaint shimmeringPaint = this.paint;
        if (z) {
            shimmeringPaint.updateShimmering(this);
        } else {
            shimmeringPaint.updateShimmering();
        }
        if (this.isShimmering) {
            RectF rectF = this.rect;
            float f = this.shimmeringCornerRadius;
            canvas.drawRoundRect(rectF, f, f, this.paint);
            if (this.isShimmeringMultiMode) {
                float f2 = -getWidth();
                canvas.translate(f2, 0.0f);
                RectF rectF2 = this.rect;
                float f3 = this.shimmeringCornerRadius;
                canvas.drawRoundRect(rectF2, f3, f3, this.paint);
                canvas.translate(r0 * 2, 0.0f);
                RectF rectF3 = this.rect;
                float f4 = this.shimmeringCornerRadius;
                canvas.drawRoundRect(rectF3, f4, f4, this.paint);
                canvas.translate(f2, 0.0f);
            }
            postInvalidateOnAnimation();
        }
    }

    public final float getAngle() {
        return this.paint.getAngle();
    }

    public final long getAnimationDuration() {
        return this.paint.getDuration();
    }

    public final int getCenterColor() {
        return this.paint.getCenterColor();
    }

    public final float getCenterOffset() {
        return this.paint.getCenterOffset();
    }

    public final boolean getDisableTouchEvents() {
        return this.disableTouchEvents;
    }

    public final int getEdgeColor() {
        return this.paint.getEdgeColor();
    }

    public final int getRepeatCount() {
        return this.repeatCount;
    }

    public final float getShimmeringCornerRadius() {
        return this.shimmeringCornerRadius;
    }

    public final int getShimmeringWidth() {
        return this.paint.getGradientWidth();
    }

    /* renamed from: isShimmering, reason: from getter */
    public final boolean getIsShimmering() {
        return this.isShimmering;
    }

    /* renamed from: isShimmeringMultiMode, reason: from getter */
    public final boolean getIsShimmeringMultiMode() {
        return this.isShimmeringMultiMode;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (this.disableTouchEvents) {
            return true;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.paint.updateOffset(this);
        this.rect.set(0.0f, 0.0f, getWidth(), getHeight());
        if (this.gradientWidthWrapContent) {
            this.paint.setGradientWidth(right - left);
        }
    }

    public final void restartShimmering() {
        this.paint.restartShimmering();
    }

    public final void setAngle(float f) {
        if (this.paint.getAngle() == f) {
            return;
        }
        this.paint.setAngle(f);
        invalidate();
    }

    public final void setAnimationDuration(long j) {
        if (this.paint.getDuration() != j) {
            this.paint.setDuration(j);
            invalidate();
        }
    }

    public final void setCenterColor(int i) {
        if (this.paint.getCenterColor() != i) {
            this.paint.setCenterColor(i);
            invalidate();
        }
    }

    public final void setCenterOffset(float f) {
        if (this.paint.getCenterOffset() == f) {
            return;
        }
        this.paint.setCenterOffset(f);
        invalidate();
    }

    public final void setColors(int centerColor, int edgeColor) {
        this.paint.setColors(centerColor, edgeColor);
    }

    public final void setDisableTouchEvents(boolean z) {
        this.disableTouchEvents = z;
    }

    public final void setRepeatCount(int i) {
        if (this.repeatCount != i) {
            this.repeatCount = i;
            this.paint.setRepeatCount(i);
            invalidate();
        }
    }

    public final void setShimmering(boolean z) {
        if (this.isShimmering != z) {
            this.isShimmering = z;
            ShimmeringPaint shimmeringPaint = this.paint;
            if (!z) {
                shimmeringPaint.disableShimmering();
            } else {
                shimmeringPaint.enableShimmering();
                invalidate();
            }
        }
    }

    public final void setShimmeringCornerRadius(float f) {
        this.shimmeringCornerRadius = f;
    }

    public final void setShimmeringMultiMode(boolean z) {
        this.isShimmeringMultiMode = z;
    }

    public final void setShimmeringWidth(int i) {
        if (i == -2) {
            this.gradientWidthWrapContent = true;
            this.paint.setGradientWidth(getWidth());
        } else {
            this.paint.setGradientWidth(i);
        }
        invalidate();
    }

    public ShimmeringFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ShimmeringFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ShimmeringFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
