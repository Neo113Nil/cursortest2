package ru.yandex.taxi.logistics.deliveries.map.search;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.al11;
import defpackage.jst;
import defpackage.t1e0;
import defpackage.yk11;
import kotlin.Metadata;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010&\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010'\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010$R\u0016\u0010(\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010$¨\u0006+"}, d2 = {"Lru/yandex/taxi/logistics/deliveries/map/search/TwoPulsingCirclesView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/animation/AnimatorSet;", "createAnimatorSet", "()Landroid/animation/AnimatorSet;", "appearAnimation", "constrictionAnimation", "disappearAnimation", "", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/graphics/PointF;", "anchor", "setAnchorPoint", "(Landroid/graphics/PointF;)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "animatorSet", "Landroid/animation/AnimatorSet;", "", "maxRadius", "F", "innerCircleRadius", "outerCircleRadius", "cx", "cy", "Companion", "al11", "deliveries"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TwoPulsingCirclesView extends View {

    @Deprecated
    public static final long APPEAR_DELAY = 400;

    @Deprecated
    public static final long APPEAR_DURATION = 550;

    @Deprecated
    public static final float CIRCLE_WIDTH = 4.0f;

    @Deprecated
    public static final long CONSTRICTION_DURATION = 450;
    private static final al11 Companion = new al11();

    @Deprecated
    public static final long DISAPPEAR_DURATION = 800;

    @Deprecated
    public static final float MAX_ALPHA = 0.6f;
    private final AnimatorSet animatorSet;
    private float cx;
    private float cy;
    private float innerCircleRadius;
    private float maxRadius;
    private float outerCircleRadius;
    private final Paint paint;

    public TwoPulsingCirclesView(Context context) {
        super(context);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        this.paint = paint;
        this.animatorSet = createAnimatorSet();
    }

    private final AnimatorSet appearAnimation() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 0.6f);
        ofFloat.addUpdateListener(new yk11(this, 3));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.1f, 0.2f);
        ofFloat2.addUpdateListener(new yk11(this, 4));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.6f, 0.7f);
        ofFloat3.addUpdateListener(new yk11(this, 5));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(550L);
        animatorSet.setStartDelay(400L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appearAnimation$lambda$0(TwoPulsingCirclesView twoPulsingCirclesView, ValueAnimator valueAnimator) {
        twoPulsingCirclesView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appearAnimation$lambda$1(TwoPulsingCirclesView twoPulsingCirclesView, ValueAnimator valueAnimator) {
        twoPulsingCirclesView.innerCircleRadius = ((Float) valueAnimator.getAnimatedValue()).floatValue() * twoPulsingCirclesView.maxRadius;
        twoPulsingCirclesView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appearAnimation$lambda$2(TwoPulsingCirclesView twoPulsingCirclesView, ValueAnimator valueAnimator) {
        twoPulsingCirclesView.outerCircleRadius = ((Float) valueAnimator.getAnimatedValue()).floatValue() * twoPulsingCirclesView.maxRadius;
        twoPulsingCirclesView.invalidate();
    }

    private final AnimatorSet constrictionAnimation() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.2f, 0.18f);
        ofFloat.addUpdateListener(new yk11(this, 6));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.7f, 0.69f);
        ofFloat2.addUpdateListener(new yk11(this, 7));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(450L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void constrictionAnimation$lambda$0(TwoPulsingCirclesView twoPulsingCirclesView, ValueAnimator valueAnimator) {
        twoPulsingCirclesView.innerCircleRadius = ((Float) valueAnimator.getAnimatedValue()).floatValue() * twoPulsingCirclesView.maxRadius;
        twoPulsingCirclesView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void constrictionAnimation$lambda$1(TwoPulsingCirclesView twoPulsingCirclesView, ValueAnimator valueAnimator) {
        twoPulsingCirclesView.outerCircleRadius = ((Float) valueAnimator.getAnimatedValue()).floatValue() * twoPulsingCirclesView.maxRadius;
        twoPulsingCirclesView.invalidate();
    }

    private final AnimatorSet createAnimatorSet() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(appearAnimation(), constrictionAnimation(), disappearAnimation());
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new AnimUtils$AnimationEndListener(new t1e0(animatorSet, 2)));
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createAnimatorSet$lambda$0$0(AnimatorSet animatorSet) {
        animatorSet.setCurrentPlayTime(0L);
        animatorSet.start();
    }

    private final AnimatorSet disappearAnimation() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.6f, 0.0f);
        ofFloat.addUpdateListener(new yk11(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.18f, 0.6f);
        ofFloat2.addUpdateListener(new yk11(this, 1));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.69f, 0.8f);
        ofFloat3.addUpdateListener(new yk11(this, 2));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(800L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void disappearAnimation$lambda$0(TwoPulsingCirclesView twoPulsingCirclesView, ValueAnimator valueAnimator) {
        twoPulsingCirclesView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void disappearAnimation$lambda$1(TwoPulsingCirclesView twoPulsingCirclesView, ValueAnimator valueAnimator) {
        twoPulsingCirclesView.innerCircleRadius = ((Float) valueAnimator.getAnimatedValue()).floatValue() * twoPulsingCirclesView.maxRadius;
        twoPulsingCirclesView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void disappearAnimation$lambda$2(TwoPulsingCirclesView twoPulsingCirclesView, ValueAnimator valueAnimator) {
        twoPulsingCirclesView.outerCircleRadius = ((Float) valueAnimator.getAnimatedValue()).floatValue() * twoPulsingCirclesView.maxRadius;
        twoPulsingCirclesView.invalidate();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.animatorSet.start();
        } catch (Exception e) {
            jst.e.k(e, "Failed to start TwoPulsingCircles animation");
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            this.animatorSet.end();
        } catch (Exception e) {
            jst.e.k(e, "Failed to end TwoPulsingCircles animation");
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.drawCircle(this.cx, this.cy, this.innerCircleRadius, this.paint);
        canvas.drawCircle(this.cx, this.cy, this.outerCircleRadius, this.paint);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.maxRadius = Math.min(getMeasuredHeight(), getMeasuredWidth()) / 2.0f;
        if (this.cx == 0.0f && this.cy == 0.0f) {
            this.cx = getMeasuredWidth() / 2.0f;
            this.cy = getMeasuredHeight() / 2.0f;
        }
    }

    public final void setAnchorPoint(PointF anchor) {
        this.cx = anchor.x;
        this.cy = anchor.y;
        invalidate();
    }
}
