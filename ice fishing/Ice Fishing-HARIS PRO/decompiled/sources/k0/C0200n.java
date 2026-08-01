package k0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: k0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0200n extends H {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f3546C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f3547D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f3548A;

    /* renamed from: B, reason: collision with root package name */
    public final B0.j f3549B;

    /* renamed from: a, reason: collision with root package name */
    public final int f3550a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3551b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f3552c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f3553d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3554f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f3555g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f3556h;
    public final int i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public int f3557k;

    /* renamed from: l, reason: collision with root package name */
    public int f3558l;

    /* renamed from: m, reason: collision with root package name */
    public float f3559m;

    /* renamed from: n, reason: collision with root package name */
    public int f3560n;

    /* renamed from: o, reason: collision with root package name */
    public int f3561o;

    /* renamed from: p, reason: collision with root package name */
    public float f3562p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f3565s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f3572z;

    /* renamed from: q, reason: collision with root package name */
    public int f3563q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f3564r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3566t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3567u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f3568v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f3569w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f3570x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f3571y = new int[2];

    public C0200n(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.f2111C0, 1.0f);
        this.f3572z = ofFloat;
        this.f3548A = 0;
        B0.j jVar = new B0.j(10, this);
        this.f3549B = jVar;
        C0198l c0198l = new C0198l(this);
        this.f3552c = stateListDrawable;
        this.f3553d = drawable;
        this.f3555g = stateListDrawable2;
        this.f3556h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3554f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3550a = i2;
        this.f3551b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0199m(this));
        ofFloat.addUpdateListener(new B0.d(3, this));
        RecyclerView recyclerView2 = this.f3565s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            K k2 = recyclerView2.f2162n;
            if (k2 != null) {
                k2.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f2166p;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.Q();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f3565s;
            recyclerView3.f2168q.remove(this);
            if (recyclerView3.f2170r == this) {
                recyclerView3.f2170r = null;
            }
            ArrayList arrayList2 = this.f3565s.f2154i0;
            if (arrayList2 != null) {
                arrayList2.remove(c0198l);
            }
            this.f3565s.removeCallbacks(jVar);
        }
        this.f3565s = recyclerView;
        if (recyclerView != null) {
            recyclerView.i(this);
            this.f3565s.f2168q.add(this);
            this.f3565s.j(c0198l);
        }
    }

    public static int e(float f2, float f3, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f3 - f2) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // k0.H
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f3563q;
        RecyclerView recyclerView2 = this.f3565s;
        if (i != recyclerView2.getWidth() || this.f3564r != recyclerView2.getHeight()) {
            this.f3563q = recyclerView2.getWidth();
            this.f3564r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f3548A != 0) {
            if (this.f3566t) {
                int i2 = this.f3563q;
                int i3 = this.e;
                int i4 = i2 - i3;
                int i5 = this.f3558l;
                int i6 = this.f3557k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f3552c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f3564r;
                int i9 = this.f3554f;
                Drawable drawable = this.f3553d;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = O.K.f747a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, RecyclerView.f2111C0);
                    drawable.draw(canvas);
                    canvas.translate(RecyclerView.f2111C0, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f3567u) {
                int i10 = this.f3564r;
                int i11 = this.i;
                int i12 = i10 - i11;
                int i13 = this.f3561o;
                int i14 = this.f3560n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f3555g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f3563q;
                int i17 = this.j;
                Drawable drawable2 = this.f3556h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(RecyclerView.f2111C0, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, RecyclerView.f2111C0);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean c(float f2, float f3) {
        if (f3 >= this.f3564r - this.i) {
            int i = this.f3561o;
            int i2 = this.f3560n;
            if (f2 >= i - (i2 / 2) && f2 <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f2, float f3) {
        RecyclerView recyclerView = this.f3565s;
        WeakHashMap weakHashMap = O.K.f747a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i = this.e;
        if (z2) {
            if (f2 > i) {
                return false;
            }
        } else if (f2 < this.f3563q - i) {
            return false;
        }
        int i2 = this.f3558l;
        int i3 = this.f3557k / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    public final void f(int i) {
        B0.j jVar = this.f3549B;
        StateListDrawable stateListDrawable = this.f3552c;
        if (i == 2 && this.f3568v != 2) {
            stateListDrawable.setState(f3546C);
            this.f3565s.removeCallbacks(jVar);
        }
        if (i == 0) {
            this.f3565s.invalidate();
        } else {
            g();
        }
        if (this.f3568v == 2 && i != 2) {
            stateListDrawable.setState(f3547D);
            this.f3565s.removeCallbacks(jVar);
            this.f3565s.postDelayed(jVar, 1200);
        } else if (i == 1) {
            this.f3565s.removeCallbacks(jVar);
            this.f3565s.postDelayed(jVar, 1500);
        }
        this.f3568v = i;
    }

    public final void g() {
        int i = this.f3548A;
        ValueAnimator valueAnimator = this.f3572z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f3548A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
