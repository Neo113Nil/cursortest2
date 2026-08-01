package com.google.android.material.timepicker;

import O.K;
import a.AbstractC0078a;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import u0.AbstractC0358a;
import v0.AbstractC0360a;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f2681v = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f2682a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeInterpolator f2683b;

    /* renamed from: c, reason: collision with root package name */
    public final ValueAnimator f2684c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2685d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public float f2686f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2687g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2688h;
    public boolean i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2689k;

    /* renamed from: l, reason: collision with root package name */
    public final float f2690l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f2691m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f2692n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2693o;

    /* renamed from: p, reason: collision with root package name */
    public float f2694p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2695q;

    /* renamed from: r, reason: collision with root package name */
    public m f2696r;

    /* renamed from: s, reason: collision with root package name */
    public double f2697s;

    /* renamed from: t, reason: collision with root package name */
    public int f2698t;

    /* renamed from: u, reason: collision with root package name */
    public int f2699u;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f2684c = new ValueAnimator();
        this.j = new ArrayList();
        Paint paint = new Paint();
        this.f2691m = paint;
        this.f2692n = new RectF();
        this.f2699u = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0358a.f4445h, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f2682a = AbstractC0078a.W(context, R.attr.motionDurationLong2, 200);
        this.f2683b = AbstractC0078a.X(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0360a.f4481b);
        this.f2698t = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f2689k = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f2693o = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f2690l = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        c(RecyclerView.f2111C0, false);
        this.f2688h = ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = K.f747a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final int a(float f2, float f3) {
        int degrees = (int) Math.toDegrees(Math.atan2(f3 - (getHeight() / 2), f2 - (getWidth() / 2)));
        int i = degrees + 90;
        return i < 0 ? degrees + 450 : i;
    }

    public final int b(int i) {
        return i == 2 ? Math.round(this.f2698t * 0.66f) : this.f2698t;
    }

    public final void c(float f2, boolean z2) {
        ValueAnimator valueAnimator = this.f2684c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z2) {
            d(f2, false);
            return;
        }
        float f3 = this.f2694p;
        if (Math.abs(f3 - f2) > 180.0f) {
            if (f3 > 180.0f && f2 < 180.0f) {
                f2 += 360.0f;
            }
            if (f3 < 180.0f && f2 > 180.0f) {
                f3 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f3), Float.valueOf(f2));
        valueAnimator.setFloatValues(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        valueAnimator.setDuration(this.f2682a);
        valueAnimator.setInterpolator(this.f2683b);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.f2681v;
                ClockHandView clockHandView = ClockHandView.this;
                clockHandView.getClass();
                clockHandView.d(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        valueAnimator.addListener(new e());
        valueAnimator.start();
    }

    public final void d(float f2, boolean z2) {
        float f3 = f2 % 360.0f;
        this.f2694p = f3;
        this.f2697s = Math.toRadians(f3 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float b2 = b(this.f2699u);
        float cos = (((float) Math.cos(this.f2697s)) * b2) + width;
        float sin = (b2 * ((float) Math.sin(this.f2697s))) + height;
        float f4 = this.f2689k;
        this.f2692n.set(cos - f4, sin - f4, cos + f4, sin + f4);
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((f) it.next()).d(f3, z2);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f2 = width;
        float b2 = b(this.f2699u);
        float cos = (((float) Math.cos(this.f2697s)) * b2) + f2;
        float f3 = height;
        float sin = (b2 * ((float) Math.sin(this.f2697s))) + f3;
        Paint paint = this.f2691m;
        paint.setStrokeWidth(RecyclerView.f2111C0);
        canvas.drawCircle(cos, sin, this.f2689k, paint);
        double sin2 = Math.sin(this.f2697s);
        paint.setStrokeWidth(this.f2693o);
        canvas.drawLine(f2, f3, width + ((int) (Math.cos(this.f2697s) * r12)), height + ((int) (r12 * sin2)), paint);
        canvas.drawCircle(f2, f3, this.f2690l, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        if (this.f2684c.isRunning()) {
            return;
        }
        c(this.f2694p, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        m mVar;
        k kVar;
        int i;
        int i2;
        TimePickerView timePickerView;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i3 = (int) (x2 - this.e);
                int i4 = (int) (y2 - this.f2686f);
                this.f2687g = (i4 * i4) + (i3 * i3) > this.f2688h;
                z4 = this.f2695q;
                z3 = actionMasked == 1;
                if (this.i) {
                    this.f2699u = ((float) Math.hypot((double) (x2 - ((float) (getWidth() / 2))), (double) (y2 - ((float) (getHeight() / 2))))) > ((float) b(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 1 : 2;
                }
                z2 = false;
            } else {
                z3 = false;
                z2 = false;
                z4 = false;
            }
        } else {
            this.e = x2;
            this.f2686f = y2;
            this.f2687g = true;
            this.f2695q = false;
            z2 = true;
            z3 = false;
            z4 = false;
        }
        boolean z7 = this.f2695q;
        float a2 = a(x2, y2);
        boolean z8 = this.f2694p != a2;
        if (!z2 || !z8) {
            if (!z8 && !z4) {
                z5 = false;
                z6 = z5 | z7;
                this.f2695q = z6;
                if (z6 && z3 && (mVar = this.f2696r) != null) {
                    float a3 = a(x2, y2);
                    boolean z9 = this.f2687g;
                    mVar.e = true;
                    kVar = mVar.f2751b;
                    i = kVar.e;
                    int i5 = kVar.f2743d;
                    i2 = kVar.f2744f;
                    timePickerView = mVar.f2750a;
                    if (i2 != 10) {
                        timePickerView.f2722s.c(mVar.f2753d, false);
                        AccessibilityManager accessibilityManager = (AccessibilityManager) timePickerView.getContext().getSystemService(AccessibilityManager.class);
                        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                            mVar.a(12, true);
                        }
                    } else {
                        int round = Math.round(a3);
                        if (!z9) {
                            kVar.e = (((round + 15) / 30) * 5) % 60;
                            mVar.f2752c = r12 * 6;
                        }
                        timePickerView.f2722s.c(mVar.f2752c, z9);
                    }
                    mVar.e = false;
                    mVar.b();
                    if (kVar.e == i || kVar.f2743d != i5) {
                        timePickerView.performHapticFeedback(4);
                    }
                }
                return true;
            }
            c(a2, z3 && this.f2685d);
        }
        z5 = true;
        z6 = z5 | z7;
        this.f2695q = z6;
        if (z6) {
            float a32 = a(x2, y2);
            boolean z92 = this.f2687g;
            mVar.e = true;
            kVar = mVar.f2751b;
            i = kVar.e;
            int i52 = kVar.f2743d;
            i2 = kVar.f2744f;
            timePickerView = mVar.f2750a;
            if (i2 != 10) {
            }
            mVar.e = false;
            mVar.b();
            if (kVar.e == i) {
            }
            timePickerView.performHapticFeedback(4);
        }
        return true;
    }
}
