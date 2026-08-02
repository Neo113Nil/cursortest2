package com.knotapi.knot.ui.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.knotapi.knot.services.Reporter;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
public class KnotSpinnerView extends View {
    private static final float ARC_SWEEP_ANGLE = 148.24f;
    private static final long CIRCLE_ROTATION_DURATION = 1750;
    private static final int DEFAULT_SIZE_DP = 48;
    private static final long GLOBAL_ROTATION_DURATION = 3000;
    private static final int STROKE_WIDTH_DP = 2;
    private RectF arcBounds;
    private ValueAnimator fastAnimator;
    private Paint fastCirclePaint;
    private float fastCircleRotation;
    private ValueAnimator globalAnimator;
    private float globalRotation;
    private ValueAnimator slowAnimator;
    private Paint slowCirclePaint;
    private float slowCircleRotation;
    private float strokeWidth;
    private int viewSize;

    public KnotSpinnerView(Context context) {
        super(context);
        this.globalRotation = RecyclerView.DECELERATION_RATE;
        this.slowCircleRotation = RecyclerView.DECELERATION_RATE;
        this.fastCircleRotation = RecyclerView.DECELERATION_RATE;
        init(context);
    }

    private ValueAnimator createAnimator(float f, float f2, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(j);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }

    private Paint createPaint(float f) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        return paint;
    }

    private ValueAnimator.AnimatorUpdateListener createSafeUpdateListener(String str, Consumer<Float> consumer) {
        return new KnotSpinnerView$$ExternalSyntheticLambda3(0, consumer, str);
    }

    private void drawCircle(Canvas canvas, float f, Paint paint, float f2, float f3) {
        canvas.save();
        canvas.rotate(f, f2, f3);
        canvas.drawArc(this.arcBounds, -90.0f, ARC_SWEEP_ANGLE, false, paint);
        canvas.restore();
    }

    private float easeInOut(float f) {
        if (f < 0.5f) {
            return 2.0f * f * f;
        }
        try {
            return 1.0f - (((float) Math.pow(((-2.0f) * f) + 2.0f, 2.0d)) / 2.0f);
        } catch (Exception e) {
            Reporter.error(e, "KnotSpinnerView.easeInOut error");
            return f;
        }
    }

    private void init(Context context) {
        if (context == null) {
            return;
        }
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                return;
            }
            float f = resources.getDisplayMetrics().density;
            if (f <= RecyclerView.DECELERATION_RATE) {
                f = 1.0f;
            }
            float f2 = 2.0f * f;
            this.strokeWidth = f2;
            this.viewSize = (int) (f * 48.0f);
            this.slowCirclePaint = createPaint(f2);
            this.fastCirclePaint = createPaint(this.strokeWidth);
            this.arcBounds = new RectF();
            setupAnimations();
        } catch (Exception e) {
            Reporter.error(e, "KnotSpinnerView.init error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createSafeUpdateListener$0(Consumer consumer, String str, ValueAnimator valueAnimator) {
        try {
            Float f = (Float) valueAnimator.getAnimatedValue();
            f.getClass();
            consumer.accept(f);
        } catch (Exception e) {
            Reporter.error(e, "KnotSpinnerView." + str + " update error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupAnimations$1(Float f) {
        this.globalRotation = f.floatValue();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupAnimations$2(Float f) {
        this.slowCircleRotation = f.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupAnimations$3(Float f) {
        if (f.floatValue() <= 0.65f) {
            this.fastCircleRotation = easeInOut(f.floatValue() / 0.65f) * 360.0f;
        } else {
            this.fastCircleRotation = 360.0f;
        }
    }

    private void safeStartAnimator(ValueAnimator valueAnimator) {
        if (valueAnimator == null || valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.start();
    }

    private void safeStopAnimator(ValueAnimator valueAnimator) {
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    private void setupAnimations() {
        try {
            ValueAnimator createAnimator = createAnimator(RecyclerView.DECELERATION_RATE, 360.0f, GLOBAL_ROTATION_DURATION);
            this.globalAnimator = createAnimator;
            createAnimator.addUpdateListener(createSafeUpdateListener("globalAnimator", new KnotSpinnerView$$ExternalSyntheticLambda0(this, 0)));
            ValueAnimator createAnimator2 = createAnimator(RecyclerView.DECELERATION_RATE, 360.0f, CIRCLE_ROTATION_DURATION);
            this.slowAnimator = createAnimator2;
            createAnimator2.addUpdateListener(createSafeUpdateListener("slowAnimator", new KnotSpinnerView$$ExternalSyntheticLambda0(this, 1)));
            ValueAnimator createAnimator3 = createAnimator(RecyclerView.DECELERATION_RATE, 1.0f, CIRCLE_ROTATION_DURATION);
            this.fastAnimator = createAnimator3;
            createAnimator3.addUpdateListener(createSafeUpdateListener("fastAnimator", new KnotSpinnerView$$ExternalSyntheticLambda0(this, 2)));
        } catch (Exception e) {
            Reporter.error(e, "KnotSpinnerView.setupAnimations error");
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            startAnimation();
        } catch (Exception e) {
            Reporter.error(e, "KnotSpinnerView.onAttachedToWindow error");
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        try {
            try {
                stopAnimation();
            } catch (Exception e) {
                Reporter.error(e, "KnotSpinnerView.onDetachedFromWindow error");
            }
        } finally {
            super.onDetachedFromWindow();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            if (this.slowCirclePaint != null && this.fastCirclePaint != null && this.arcBounds != null) {
                int width = getWidth();
                int height = getHeight();
                if (width > 0 && height > 0) {
                    float f = width / 2.0f;
                    float f2 = height / 2.0f;
                    canvas.save();
                    canvas.rotate(this.globalRotation, f, f2);
                    drawCircle(canvas, this.slowCircleRotation, this.slowCirclePaint, f, f2);
                    drawCircle(canvas, this.fastCircleRotation, this.fastCirclePaint, f, f2);
                    canvas.restore();
                }
            }
        } catch (Exception e) {
            Reporter.error(e, "KnotSpinnerView.onDraw error");
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        try {
            int min = Math.min(View.resolveSize(this.viewSize, i), View.resolveSize(this.viewSize, i2));
            setMeasuredDimension(min, min);
        } catch (Exception e) {
            Reporter.error(e, "KnotSpinnerView.onMeasure error");
            int i3 = this.viewSize;
            setMeasuredDimension(i3, i3);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        RectF rectF;
        try {
            super.onSizeChanged(i, i2, i3, i4);
            if (i <= 0 || i2 <= 0 || (rectF = this.arcBounds) == null) {
                return;
            }
            float f = this.strokeWidth / 2.0f;
            rectF.set(f, f, i - f, i2 - f);
        } catch (Exception e) {
            Reporter.error(e, "KnotSpinnerView.onSizeChanged error");
        }
    }

    public void startAnimation() {
        try {
            safeStartAnimator(this.globalAnimator);
            safeStartAnimator(this.slowAnimator);
            safeStartAnimator(this.fastAnimator);
        } catch (Exception e) {
            Reporter.error(e, "KnotSpinnerView.startAnimation error");
        }
    }

    public void stopAnimation() {
        try {
            safeStopAnimator(this.globalAnimator);
            safeStopAnimator(this.slowAnimator);
            safeStopAnimator(this.fastAnimator);
        } catch (Exception e) {
            Reporter.error(e, "KnotSpinnerView.stopAnimation error");
        }
    }

    public KnotSpinnerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.globalRotation = RecyclerView.DECELERATION_RATE;
        this.slowCircleRotation = RecyclerView.DECELERATION_RATE;
        this.fastCircleRotation = RecyclerView.DECELERATION_RATE;
        init(context);
    }

    public KnotSpinnerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.globalRotation = RecyclerView.DECELERATION_RATE;
        this.slowCircleRotation = RecyclerView.DECELERATION_RATE;
        this.fastCircleRotation = RecyclerView.DECELERATION_RATE;
        init(context);
    }
}
