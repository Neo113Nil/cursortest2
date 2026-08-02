package com.google.android.material.timepicker;

import N3.C;
import O.X;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m3.AbstractC4742a;
import n3.AbstractC4770a;

/* loaded from: classes2.dex */
class ClockHandView extends View {

    /* renamed from: A, reason: collision with root package name */
    public final int f36925A;

    /* renamed from: B, reason: collision with root package name */
    public float f36926B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f36927C;

    /* renamed from: D, reason: collision with root package name */
    public double f36928D;

    /* renamed from: E, reason: collision with root package name */
    public int f36929E;

    /* renamed from: F, reason: collision with root package name */
    public int f36930F;

    /* renamed from: n, reason: collision with root package name */
    public final ValueAnimator f36931n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f36932u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f36933v;

    /* renamed from: w, reason: collision with root package name */
    public final int f36934w;

    /* renamed from: x, reason: collision with root package name */
    public final float f36935x;

    /* renamed from: y, reason: collision with root package name */
    public final Paint f36936y;

    /* renamed from: z, reason: collision with root package name */
    public final RectF f36937z;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5248R.attr.materialClockStyle);
        this.f36931n = new ValueAnimator();
        this.f36933v = new ArrayList();
        Paint paint = new Paint();
        this.f36936y = paint;
        this.f36937z = new RectF();
        this.f36930F = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4742a.f39422e, C5248R.attr.materialClockStyle, C5248R.style.Widget_MaterialComponents_TimePicker_Clock);
        C.R(context, C5248R.attr.motionDurationLong2, 200);
        C.S(context, C5248R.attr.motionEasingEmphasizedInterpolator, AbstractC4770a.f39642b);
        this.f36929E = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f36934w = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f36925A = getResources().getDimensionPixelSize(C5248R.dimen.material_clock_hand_stroke_width);
        this.f36935x = r4.getDimensionPixelSize(C5248R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = X.f2142a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i) {
        return i == 2 ? Math.round(this.f36929E * 0.66f) : this.f36929E;
    }

    public final void b(float f2) {
        ValueAnimator valueAnimator = this.f36931n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f9 = f2 % 360.0f;
        this.f36926B = f9;
        this.f36928D = Math.toRadians(f9 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a9 = a(this.f36930F);
        float cos = (((float) Math.cos(this.f36928D)) * a9) + width;
        float sin = (a9 * ((float) Math.sin(this.f36928D))) + height;
        float f10 = this.f36934w;
        this.f36937z.set(cos - f10, sin - f10, cos + f10, sin + f10);
        Iterator it = this.f36933v.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f36923k0 - f9) > 0.001f) {
                clockFaceView.f36923k0 = f9;
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
        float f2 = width;
        float a9 = a(this.f36930F);
        float cos = (((float) Math.cos(this.f36928D)) * a9) + f2;
        float f9 = height;
        float sin = (a9 * ((float) Math.sin(this.f36928D))) + f9;
        Paint paint = this.f36936y;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f36934w, paint);
        double sin2 = Math.sin(this.f36928D);
        paint.setStrokeWidth(this.f36925A);
        canvas.drawLine(f2, f9, width + ((int) (Math.cos(this.f36928D) * r2)), height + ((int) (r2 * sin2)), paint);
        canvas.drawCircle(f2, f9, this.f36935x, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
        if (this.f36931n.isRunning()) {
            return;
        }
        b(this.f36926B);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        boolean z9;
        int actionMasked = motionEvent.getActionMasked();
        float x9 = motionEvent.getX();
        float y7 = motionEvent.getY();
        boolean z10 = false;
        if (actionMasked == 0) {
            this.f36927C = false;
            z6 = true;
            z9 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z9 = this.f36927C;
            if (this.f36932u) {
                this.f36930F = ((float) Math.hypot((double) (x9 - ((float) (getWidth() / 2))), (double) (y7 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z6 = false;
        } else {
            z9 = false;
            z6 = false;
        }
        boolean z11 = this.f36927C;
        int degrees = (int) Math.toDegrees(Math.atan2(y7 - (getHeight() / 2), x9 - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f2 = i;
        boolean z12 = this.f36926B != f2;
        if (!z6 || !z12) {
            if (z12 || z9) {
                b(f2);
            }
            this.f36927C = z11 | z10;
            return true;
        }
        z10 = true;
        this.f36927C = z11 | z10;
        return true;
    }
}
