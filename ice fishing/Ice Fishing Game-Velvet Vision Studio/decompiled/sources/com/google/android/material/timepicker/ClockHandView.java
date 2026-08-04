package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.gamericefishpro.space.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int G = 0;
    public final int A;
    public float B;
    public boolean C;
    public double D;
    public int E;
    public int F;
    public final ValueAnimator d;
    public boolean e;
    public final ArrayList i;
    public final int v;
    public final float w;
    public final Paint y;
    public final RectF z;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.d = valueAnimator;
        this.i = new ArrayList();
        Paint paint = new Paint();
        this.y = paint;
        this.z = new RectF();
        this.F = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.gamericefishpro.space.s9.a.e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        com.gamericefishpro.space.a.a.B(context, R.attr.motionDurationLong2, 200);
        com.gamericefishpro.space.a.a.C(context, R.attr.motionEasingEmphasizedInterpolator, com.gamericefishpro.space.t9.a.b);
        this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.A = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.w = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.G;
                this.a.c(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new com.gamericefishpro.space.pa.a());
    }

    public final int a(int i) {
        return i == 2 ? Math.round(this.E * 0.66f) : this.E;
    }

    public final void b(float f) {
        this.d.cancel();
        c(f);
    }

    public final void c(float f) {
        float f2 = f % 360.0f;
        this.B = f2;
        this.D = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.F);
        float fCos = (((float) Math.cos(this.D)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.D))) + height;
        float f3 = this.v;
        this.z.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ClockFaceView clockFaceView = (ClockFaceView) ((com.gamericefishpro.space.pa.b) obj);
            if (Math.abs(clockFaceView.e0 - f2) > 0.001f) {
                clockFaceView.e0 = f2;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iA = a(this.F);
        float f = width;
        float f2 = iA;
        float fCos = (((float) Math.cos(this.D)) * f2) + f;
        float f3 = height;
        float fSin = (f2 * ((float) Math.sin(this.D))) + f3;
        Paint paint = this.y;
        paint.setStrokeWidth(0.0f);
        int i = this.v;
        canvas.drawCircle(fCos, fSin, i, paint);
        double dSin = Math.sin(this.D);
        double d = iA - i;
        paint.setStrokeWidth(this.A);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.D) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f3, this.w, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.d.isRunning()) {
            return;
        }
        b(this.B);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.C = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.C;
            if (this.e) {
                this.F = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.C;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.B != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            b(f);
            z3 = true;
        }
        this.C = z4 | z3;
        return true;
    }
}
