package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.media3.ui.DefaultTimeBar$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import com.squareup.cash.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class ClockHandView extends View {
    public static final /* synthetic */ int $r8$clinit = 0;
    public boolean animatingOnTouchUp;
    public final int animationDuration;
    public final TimeInterpolator animationInterpolator;
    public final float centerDotRadius;
    public boolean changedDuringTouch;
    public int circleRadius;
    public int currentLevel;
    public double degRad;
    public boolean isMultiLevel;
    public final ArrayList listeners;
    public float originalDeg;
    public final Paint paint;
    public final ValueAnimator rotationAnimator;
    public final RectF selectorBox;
    public final int selectorRadius;
    public final int selectorStrokeWidth;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$1, reason: invalid class name */
    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface OnActionUpListener {
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.rotationAnimator = valueAnimator;
        this.listeners = new ArrayList();
        Paint paint = new Paint();
        this.paint = paint;
        this.selectorBox = new RectF();
        this.currentLevel = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClockHandView, i, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.animationDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationLong2, 200);
        this.animationInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.selectorRadius = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.selectorStrokeWidth = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.centerDotRadius = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(RecyclerView.DECELERATION_RATE);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1(this, 10));
        valueAnimator.addListener(new AnonymousClass1());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.currentLevel;
        int i2 = this.circleRadius;
        if (i == 2) {
            i2 = Math.round(i2 * 0.66f);
        }
        float f = width;
        float f2 = i2;
        float cos = (((float) Math.cos(this.degRad)) * f2) + f;
        float f3 = height;
        float sin = (f2 * ((float) Math.sin(this.degRad))) + f3;
        Paint paint = this.paint;
        paint.setStrokeWidth(RecyclerView.DECELERATION_RATE);
        canvas.drawCircle(cos, sin, this.selectorRadius, paint);
        double sin2 = Math.sin(this.degRad);
        paint.setStrokeWidth(this.selectorStrokeWidth);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.degRad) * r3)), height + ((int) (r3 * sin2)), paint);
        canvas.drawCircle(f, f3, this.centerDotRadius, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.rotationAnimator.isRunning()) {
            return;
        }
        setHandRotation(this.originalDeg);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked == 0) {
            this.changedDuringTouch = false;
            z = true;
            z2 = false;
            z3 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z3 = this.changedDuringTouch;
            z2 = actionMasked == 1;
            if (this.isMultiLevel) {
                this.currentLevel = MathUtils.dist((float) (getWidth() / 2), (float) (getHeight() / 2), x, y) <= ((float) Math.round(((float) this.circleRadius) * 0.66f)) + ViewUtils.dpToPx(getContext(), 12) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z3 = false;
            z = false;
        }
        boolean z5 = this.changedDuringTouch;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z6 = this.originalDeg != f;
        if (!z || !z6) {
            if (z6 || z3) {
                if (z2 && this.animatingOnTouchUp) {
                    z4 = true;
                }
                setHandRotation(f, z4);
            }
            this.changedDuringTouch = z5 | z4;
            return true;
        }
        z4 = true;
        this.changedDuringTouch = z5 | z4;
        return true;
    }

    public void setAnimateOnTouchUp(boolean z) {
        this.animatingOnTouchUp = z;
    }

    public void setCircleRadius(int i) {
        this.circleRadius = i;
        invalidate();
    }

    public void setHandRotation(float f, boolean z) {
        ValueAnimator valueAnimator = this.rotationAnimator;
        valueAnimator.cancel();
        if (!z) {
            setHandRotationInternal(f);
            return;
        }
        float f2 = this.originalDeg;
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));
        valueAnimator.setFloatValues(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        valueAnimator.setDuration(this.animationDuration);
        valueAnimator.setInterpolator(this.animationInterpolator);
        valueAnimator.start();
    }

    public final void setHandRotationInternal(float f) {
        float f2 = f % 360.0f;
        this.originalDeg = f2;
        this.degRad = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.currentLevel;
        int i2 = this.circleRadius;
        if (i == 2) {
            i2 = Math.round(i2 * 0.66f);
        }
        float f3 = width;
        float f4 = i2;
        float cos = (((float) Math.cos(this.degRad)) * f4) + f3;
        float sin = (f4 * ((float) Math.sin(this.degRad))) + height;
        float f5 = this.selectorRadius;
        this.selectorBox.set(cos - f5, sin - f5, cos + f5, sin + f5);
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) it.next();
            if (Math.abs(clockFaceView.currentHandRotation - f2) > 0.001f) {
                clockFaceView.currentHandRotation = f2;
                clockFaceView.findIntersectingTextView();
            }
        }
        invalidate();
    }

    public void setOnActionUpListener(OnActionUpListener onActionUpListener) {
    }

    public void setHandRotation(float f) {
        setHandRotation(f, false);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }
}
