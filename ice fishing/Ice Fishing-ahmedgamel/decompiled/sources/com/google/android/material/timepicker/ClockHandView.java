package com.google.android.material.timepicker;

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
import com.icefishinggame.icefishinggamemultigames.C5275R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k3.AbstractC4632a;
import l3.AbstractC4661a;

/* loaded from: classes2.dex */
class ClockHandView extends View {

    /* renamed from: A, reason: collision with root package name */
    public final int f36158A;

    /* renamed from: B, reason: collision with root package name */
    public float f36159B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f36160C;

    /* renamed from: D, reason: collision with root package name */
    public double f36161D;

    /* renamed from: E, reason: collision with root package name */
    public int f36162E;

    /* renamed from: F, reason: collision with root package name */
    public int f36163F;

    /* renamed from: n, reason: collision with root package name */
    public final ValueAnimator f36164n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f36165u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f36166v;

    /* renamed from: w, reason: collision with root package name */
    public final int f36167w;

    /* renamed from: x, reason: collision with root package name */
    public final float f36168x;

    /* renamed from: y, reason: collision with root package name */
    public final Paint f36169y;

    /* renamed from: z, reason: collision with root package name */
    public final RectF f36170z;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5275R.attr.materialClockStyle);
        this.f36164n = new ValueAnimator();
        this.f36166v = new ArrayList();
        Paint paint = new Paint();
        this.f36169y = paint;
        this.f36170z = new RectF();
        this.f36163F = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4632a.f38633e, C5275R.attr.materialClockStyle, C5275R.style.Widget_MaterialComponents_TimePicker_Clock);
        t8.g.D(context, C5275R.attr.motionDurationLong2, 200);
        t8.g.E(context, C5275R.attr.motionEasingEmphasizedInterpolator, AbstractC4661a.f38904b);
        this.f36162E = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f36167w = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f36158A = getResources().getDimensionPixelSize(C5275R.dimen.material_clock_hand_stroke_width);
        this.f36168x = r4.getDimensionPixelSize(C5275R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = X.f2054a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i) {
        return i == 2 ? Math.round(this.f36162E * 0.66f) : this.f36162E;
    }

    public final void b(float f3) {
        ValueAnimator valueAnimator = this.f36164n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f9 = f3 % 360.0f;
        this.f36159B = f9;
        this.f36161D = Math.toRadians(f9 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a9 = a(this.f36163F);
        float cos = (((float) Math.cos(this.f36161D)) * a9) + width;
        float sin = (a9 * ((float) Math.sin(this.f36161D))) + height;
        float f10 = this.f36167w;
        this.f36170z.set(cos - f10, sin - f10, cos + f10, sin + f10);
        Iterator it = this.f36166v.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f36156p0 - f9) > 0.001f) {
                clockFaceView.f36156p0 = f9;
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
        float f3 = width;
        float a9 = a(this.f36163F);
        float cos = (((float) Math.cos(this.f36161D)) * a9) + f3;
        float f9 = height;
        float sin = (a9 * ((float) Math.sin(this.f36161D))) + f9;
        Paint paint = this.f36169y;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f36167w, paint);
        double sin2 = Math.sin(this.f36161D);
        paint.setStrokeWidth(this.f36158A);
        canvas.drawLine(f3, f9, width + ((int) (Math.cos(this.f36161D) * r2)), height + ((int) (r2 * sin2)), paint);
        canvas.drawCircle(f3, f9, this.f36168x, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
        if (this.f36164n.isRunning()) {
            return;
        }
        b(this.f36159B);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z6;
        int actionMasked = motionEvent.getActionMasked();
        float x9 = motionEvent.getX();
        float y7 = motionEvent.getY();
        boolean z9 = false;
        if (actionMasked == 0) {
            this.f36160C = false;
            z3 = true;
            z6 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z6 = this.f36160C;
            if (this.f36165u) {
                this.f36163F = ((float) Math.hypot((double) (x9 - ((float) (getWidth() / 2))), (double) (y7 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z3 = false;
        } else {
            z6 = false;
            z3 = false;
        }
        boolean z10 = this.f36160C;
        int degrees = (int) Math.toDegrees(Math.atan2(y7 - (getHeight() / 2), x9 - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f3 = i;
        boolean z11 = this.f36159B != f3;
        if (!z3 || !z11) {
            if (z11 || z6) {
                b(f3);
            }
            this.f36160C = z10 | z9;
            return true;
        }
        z9 = true;
        this.f36160C = z10 | z9;
        return true;
    }
}
