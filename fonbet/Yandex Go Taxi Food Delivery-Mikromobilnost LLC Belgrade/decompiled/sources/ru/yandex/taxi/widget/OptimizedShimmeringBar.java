package ru.yandex.taxi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.state.db.StateEntry;
import defpackage.bdc;
import defpackage.c4i0;
import defpackage.cdc;
import defpackage.kdc;
import defpackage.mrg0;
import defpackage.nd70;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.s8o;
import defpackage.tje;
import defpackage.xng0;
import defpackage.yv31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 L2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001MB1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ7\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0014¢\u0006\u0004\b%\u0010\u000fJ\u000f\u0010&\u001a\u00020\rH\u0014¢\u0006\u0004\b&\u0010\u000fJ\u001f\u0010)\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\bH\u0014¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\rH\u0016¢\u0006\u0004\b/\u0010\u000fJ\u0017\u00101\u001a\u00020\r2\b\b\u0001\u00100\u001a\u00020\b¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\r2\b\b\u0001\u00100\u001a\u00020\b¢\u0006\u0004\b3\u00102J\u0017\u00105\u001a\u00020\r2\b\b\u0001\u00104\u001a\u00020\b¢\u0006\u0004\b5\u00102R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0016\u0010F\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010@R*\u0010H\u001a\u00020\u00132\u0006\u0010G\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010@\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lru/yandex/taxi/widget/OptimizedShimmeringBar;", "Landroid/view/View;", "Lnwy0;", "Lyv31;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "startAnimatingIfNeeded", "()V", "stopAnimating", "rebuildPath", "applyShimmeringColors", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onAttachedToWindow", "onDetachedFromWindow", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onTransitionEnd", "color", "setCenterColor", "(I)V", "setEdgeColor", "width", "setGradientWidth", "Lru/yandex/taxi/widget/OptimizedShimmeringPaint;", "paint", "Lru/yandex/taxi/widget/OptimizedShimmeringPaint;", "Landroid/graphics/Path;", StateEntry.COLUMN_PATH, "Landroid/graphics/Path;", "Landroid/graphics/RectF;", "pathRect", "Landroid/graphics/RectF;", "isAnimationDisabled", "Z", "isHorizontallyScrollable", "Lkdc;", OptimizedShimmeringBar.CENTER_COLOR_ATTR, "Lkdc;", OptimizedShimmeringBar.EDGE_COLOR_ATTR, "isAnimating", "value", "isShimmering", "()Z", "setShimmering", "(Z)V", "Companion", "nd70", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class OptimizedShimmeringBar extends View implements nwy0, yv31 {
    private static final String CENTER_COLOR_ATTR = "centerColor";
    private static final String EDGE_COLOR_ATTR = "edgeColor";
    private kdc centerColor;
    private kdc edgeColor;
    private boolean isAnimating;
    private final boolean isAnimationDisabled;
    private final boolean isHorizontallyScrollable;
    private boolean isShimmering;
    private final OptimizedShimmeringPaint paint;
    private final Path path;
    private final RectF pathRect;
    public static final nd70 Companion = new nd70();
    private static final int CENTER_COLOR_STYLE = c4i0.ShimmeringBar_centerColor;
    private static final int EDGE_COLOR_STYLE = c4i0.ShimmeringBar_edgeColor;

    public OptimizedShimmeringBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        OptimizedShimmeringPaint optimizedShimmeringPaint = new OptimizedShimmeringPaint(context);
        this.paint = optimizedShimmeringPaint;
        this.path = new Path();
        this.pathRect = new RectF();
        this.isAnimationDisabled = tje.d(context);
        this.centerColor = new bdc(xng0.shimmeringCenterColor);
        this.edgeColor = new bdc(xng0.bgMinor);
        this.isShimmering = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c4i0.ShimmeringBar, i, i2);
        try {
            float dimension = obtainStyledAttributes.getDimension(c4i0.ShimmeringBar_barCornerRadius, tje.r(mrg0.go_design_s_space, getContext()));
            this.isHorizontallyScrollable = obtainStyledAttributes.getBoolean(c4i0.ShimmeringBar_scrolledHorizontally, false);
            optimizedShimmeringPaint.setPathEffect(new CornerPathEffect(dimension));
            optimizedShimmeringPaint.setGradientWidth(tje.v(getContext(), obtainStyledAttributes.getDimension(c4i0.ShimmeringBar_gradientWidth, optimizedShimmeringPaint.getGradientWidth())));
            if (attributeSet != null) {
                kdc T = qje.T(attributeSet, obtainStyledAttributes, CENTER_COLOR_ATTR, CENTER_COLOR_STYLE, null);
                if (T != null) {
                    this.centerColor = T;
                }
                kdc T2 = qje.T(attributeSet, obtainStyledAttributes, EDGE_COLOR_ATTR, EDGE_COLOR_STYLE, null);
                if (T2 != null) {
                    this.edgeColor = T2;
                }
            }
            applyShimmeringColors();
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void applyShimmeringColors() {
        this.paint.setColors(s8o.m(this.centerColor, getContext()), s8o.m(this.edgeColor, getContext()));
    }

    private final void rebuildPath() {
        this.pathRect.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.path.reset();
        this.path.addRect(this.pathRect, Path.Direction.CW);
    }

    private final void startAnimatingIfNeeded() {
        if (!this.isAnimating && this.isShimmering && isAttachedToWindow() && isShown() && !this.isAnimationDisabled) {
            this.isAnimating = true;
            invalidate();
        }
    }

    private final void stopAnimating() {
        if (this.isAnimating) {
            this.isAnimating = false;
            if (isAttachedToWindow()) {
                invalidate();
            }
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        applyShimmeringColors();
        invalidate();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    /* renamed from: isShimmering, reason: from getter */
    public final boolean getIsShimmering() {
        return this.isShimmering;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startAnimatingIfNeeded();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopAnimating();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.isAnimating) {
            boolean z = this.isHorizontallyScrollable;
            OptimizedShimmeringPaint optimizedShimmeringPaint = this.paint;
            if (z) {
                optimizedShimmeringPaint.updateShimmering(this);
            } else {
                optimizedShimmeringPaint.updateShimmering();
            }
            canvas.drawPath(this.path, this.paint);
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.paint.updateOffset(this);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        rebuildPath();
    }

    @Override // defpackage.yv31
    public void onTransitionEnd() {
        this.paint.updateOffset(this);
        if (this.isShimmering && isAttachedToWindow() && isShown()) {
            this.paint.restartShimmering();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        if (isAttachedToWindow()) {
            if (isShown()) {
                startAnimatingIfNeeded();
            } else {
                stopAnimating();
            }
        }
    }

    public final void setCenterColor(int color) {
        this.centerColor = new cdc(color);
        applyShimmeringColors();
    }

    public final void setEdgeColor(int color) {
        this.edgeColor = new cdc(color);
        applyShimmeringColors();
    }

    public final void setGradientWidth(int width) {
        this.paint.setGradientWidth(width);
    }

    public final void setShimmering(boolean z) {
        if (this.isShimmering != z) {
            this.isShimmering = z;
            OptimizedShimmeringPaint optimizedShimmeringPaint = this.paint;
            if (z) {
                optimizedShimmeringPaint.enableShimmering();
                startAnimatingIfNeeded();
            } else {
                optimizedShimmeringPaint.disableShimmering();
                stopAnimating();
            }
        }
    }

    public OptimizedShimmeringBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public OptimizedShimmeringBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public OptimizedShimmeringBar(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ OptimizedShimmeringBar(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
