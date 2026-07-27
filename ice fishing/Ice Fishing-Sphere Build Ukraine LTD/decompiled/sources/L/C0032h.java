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
public final class C0032h {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f543x = {R.attr.state_pressed};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f544y = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f545a;

    /* renamed from: b, reason: collision with root package name */
    public final StateListDrawable f546b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f547c;

    /* renamed from: d, reason: collision with root package name */
    public final int f548d;

    /* renamed from: e, reason: collision with root package name */
    public final int f549e;

    /* renamed from: f, reason: collision with root package name */
    public final StateListDrawable f550f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f551g;

    /* renamed from: h, reason: collision with root package name */
    public final int f552h;

    /* renamed from: i, reason: collision with root package name */
    public final int f553i;

    /* renamed from: j, reason: collision with root package name */
    public float f554j;

    /* renamed from: k, reason: collision with root package name */
    public float f555k;

    /* renamed from: n, reason: collision with root package name */
    public final RecyclerView f558n;

    /* renamed from: u, reason: collision with root package name */
    public final ValueAnimator f564u;

    /* renamed from: v, reason: collision with root package name */
    public int f565v;

    /* renamed from: w, reason: collision with root package name */
    public final A.b f566w;

    /* renamed from: l, reason: collision with root package name */
    public int f556l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f557m = 0;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f559o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f560p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f561q = 0;
    public int r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f562s = new int[2];

    /* renamed from: t, reason: collision with root package name */
    public final int[] f563t = new int[2];

    public C0032h(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f564u = ofFloat;
        this.f565v = 0;
        A.b bVar = new A.b(1 == true ? 1 : 0, this);
        this.f566w = bVar;
        C0029e c0029e = new C0029e();
        this.f546b = stateListDrawable;
        this.f547c = drawable;
        this.f550f = stateListDrawable2;
        this.f551g = drawable2;
        this.f548d = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f549e = Math.max(i2, drawable.getIntrinsicWidth());
        this.f552h = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f553i = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f545a = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0030f(this));
        ofFloat.addUpdateListener(new C0031g(this));
        RecyclerView recyclerView2 = this.f558n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            x xVar = recyclerView2.f1605m;
            if (xVar != null) {
                xVar.a("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1606n;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f558n;
            recyclerView3.f1607o.remove(this);
            if (recyclerView3.f1608p == this) {
                recyclerView3.f1608p = null;
            }
            ArrayList arrayList2 = this.f558n.f1590c0;
            if (arrayList2 != null) {
                arrayList2.remove(c0029e);
            }
            this.f558n.removeCallbacks(bVar);
        }
        this.f558n = recyclerView;
        if (recyclerView != null) {
            x xVar2 = recyclerView.f1605m;
            if (xVar2 != null) {
                xVar2.a("Cannot add item decoration during a scroll  or layout");
            }
            ArrayList arrayList3 = recyclerView.f1606n;
            if (arrayList3.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            arrayList3.add(this);
            recyclerView.m();
            recyclerView.requestLayout();
            this.f558n.f1607o.add(this);
            RecyclerView recyclerView4 = this.f558n;
            if (recyclerView4.f1590c0 == null) {
                recyclerView4.f1590c0 = new ArrayList();
            }
            recyclerView4.f1590c0.add(c0029e);
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
        return f3 >= ((float) (this.f557m - this.f552h)) && f2 >= ((float) (0 - (0 / 2))) && f2 <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f2, float f3) {
        RecyclerView recyclerView = this.f558n;
        Field field = w.x.f3074a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i2 = this.f548d;
        if (z2) {
            if (f2 > i2 / 2) {
                return false;
            }
        } else if (f2 < this.f556l - i2) {
            return false;
        }
        int i3 = 0 / 2;
        return f3 >= ((float) (0 - i3)) && f3 <= ((float) (i3 + 0));
    }

    public final boolean c(MotionEvent motionEvent) {
        int i2 = this.f561q;
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
                this.f555k = (int) motionEvent.getX();
            } else if (b2) {
                this.r = 2;
                this.f554j = (int) motionEvent.getY();
            }
            e(2);
        } else if (i2 != 2) {
            return false;
        }
        return true;
    }

    public final void e(int i2) {
        A.b bVar = this.f566w;
        StateListDrawable stateListDrawable = this.f546b;
        if (i2 == 2 && this.f561q != 2) {
            stateListDrawable.setState(f543x);
            this.f558n.removeCallbacks(bVar);
        }
        if (i2 == 0) {
            this.f558n.invalidate();
        } else {
            f();
        }
        if (this.f561q == 2 && i2 != 2) {
            stateListDrawable.setState(f544y);
            this.f558n.removeCallbacks(bVar);
            this.f558n.postDelayed(bVar, 1200);
        } else if (i2 == 1) {
            this.f558n.removeCallbacks(bVar);
            this.f558n.postDelayed(bVar, 1500);
        }
        this.f561q = i2;
    }

    public final void f() {
        int i2 = this.f565v;
        ValueAnimator valueAnimator = this.f564u;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f565v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
