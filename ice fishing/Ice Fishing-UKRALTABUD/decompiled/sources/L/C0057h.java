package L;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: L.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057h {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f621x = {R.attr.state_pressed};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f622y = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f623a;

    /* renamed from: b, reason: collision with root package name */
    public final StateListDrawable f624b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f625c;

    /* renamed from: d, reason: collision with root package name */
    public final int f626d;

    /* renamed from: e, reason: collision with root package name */
    public final int f627e;

    /* renamed from: f, reason: collision with root package name */
    public final StateListDrawable f628f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f629g;

    /* renamed from: h, reason: collision with root package name */
    public final int f630h;

    /* renamed from: i, reason: collision with root package name */
    public final int f631i;

    /* renamed from: j, reason: collision with root package name */
    public float f632j;

    /* renamed from: k, reason: collision with root package name */
    public float f633k;

    /* renamed from: n, reason: collision with root package name */
    public final RecyclerView f636n;

    /* renamed from: u, reason: collision with root package name */
    public final ValueAnimator f642u;

    /* renamed from: v, reason: collision with root package name */
    public int f643v;

    /* renamed from: w, reason: collision with root package name */
    public final A.b f644w;

    /* renamed from: l, reason: collision with root package name */
    public int f634l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f635m = 0;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f637o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f638p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f639q = 0;
    public int r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f640s = new int[2];

    /* renamed from: t, reason: collision with root package name */
    public final int[] f641t = new int[2];

    public C0057h(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f642u = ofFloat;
        this.f643v = 0;
        A.b bVar = new A.b(1 == true ? 1 : 0, this);
        this.f644w = bVar;
        C0054e c0054e = new C0054e();
        this.f624b = stateListDrawable;
        this.f625c = drawable;
        this.f628f = stateListDrawable2;
        this.f629g = drawable2;
        this.f626d = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f627e = Math.max(i2, drawable.getIntrinsicWidth());
        this.f630h = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f631i = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f623a = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0055f(this));
        ofFloat.addUpdateListener(new C0056g(this));
        RecyclerView recyclerView2 = this.f636n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            x xVar = recyclerView2.f1598n;
            if (xVar != null) {
                xVar.a("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1599o;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f636n;
            recyclerView3.f1600p.remove(this);
            if (recyclerView3.f1601q == this) {
                recyclerView3.f1601q = null;
            }
            ArrayList arrayList2 = this.f636n.f1583d0;
            if (arrayList2 != null) {
                arrayList2.remove(c0054e);
            }
            this.f636n.removeCallbacks(bVar);
        }
        this.f636n = recyclerView;
        if (recyclerView != null) {
            x xVar2 = recyclerView.f1598n;
            if (xVar2 != null) {
                xVar2.a("Cannot add item decoration during a scroll  or layout");
            }
            ArrayList arrayList3 = recyclerView.f1599o;
            if (arrayList3.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            arrayList3.add(this);
            recyclerView.m();
            recyclerView.requestLayout();
            this.f636n.f1600p.add(this);
            RecyclerView recyclerView4 = this.f636n;
            if (recyclerView4.f1583d0 == null) {
                recyclerView4.f1583d0 = new ArrayList();
            }
            recyclerView4.f1583d0.add(c0054e);
        }
    }

    public static int d(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    public final boolean a(float f2, float f3) {
        return f3 >= ((float) (this.f635m - this.f630h)) && f2 >= ((float) (0 - (0 / 2))) && f2 <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f2, float f3) {
        RecyclerView recyclerView = this.f636n;
        Field field = w.x.f3069a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i2 = this.f626d;
        if (z2) {
            if (f2 > i2 / 2) {
                return false;
            }
        } else if (f2 < this.f634l - i2) {
            return false;
        }
        int i3 = 0 / 2;
        return f3 >= ((float) (0 - i3)) && f3 <= ((float) (i3 + 0));
    }

    public final boolean c(MotionEvent motionEvent) {
        int i2 = this.f639q;
        if (i2 == 1) {
            boolean b2 = b(motionEvent.getX(), motionEvent.getY());
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b2 && !a2) {
                return false;
            }
            if (a2) {
                this.r = 1;
                this.f633k = (int) motionEvent.getX();
            } else if (b2) {
                this.r = 2;
                this.f632j = (int) motionEvent.getY();
            }
            e(2);
        } else if (i2 != 2) {
            return false;
        }
        return true;
    }

    public final void e(int i2) {
        A.b bVar = this.f644w;
        StateListDrawable stateListDrawable = this.f624b;
        if (i2 == 2 && this.f639q != 2) {
            stateListDrawable.setState(f621x);
            this.f636n.removeCallbacks(bVar);
        }
        if (i2 == 0) {
            this.f636n.invalidate();
        } else {
            f();
        }
        if (this.f639q == 2 && i2 != 2) {
            stateListDrawable.setState(f622y);
            this.f636n.removeCallbacks(bVar);
            this.f636n.postDelayed(bVar, 1200);
        } else if (i2 == 1) {
            this.f636n.removeCallbacks(bVar);
            this.f636n.postDelayed(bVar, 1500);
        }
        this.f639q = i2;
    }

    public final void f() {
        int i2 = this.f643v;
        ValueAnimator valueAnimator = this.f642u;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f643v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
