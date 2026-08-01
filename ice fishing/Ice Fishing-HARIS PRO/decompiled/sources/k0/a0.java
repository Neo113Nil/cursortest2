package k0;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f3437a;

    /* renamed from: b, reason: collision with root package name */
    public int f3438b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f3439c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f3440d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3441f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3442g;

    public a0(RecyclerView recyclerView) {
        this.f3442g = recyclerView;
        U.d dVar = RecyclerView.H0;
        this.f3440d = dVar;
        this.e = false;
        this.f3441f = false;
        this.f3439c = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.f3442g;
        recyclerView.setScrollState(2);
        this.f3438b = 0;
        this.f3437a = 0;
        Interpolator interpolator = this.f3440d;
        U.d dVar = RecyclerView.H0;
        if (interpolator != dVar) {
            this.f3440d = dVar;
            this.f3439c = new OverScroller(recyclerView.getContext(), dVar);
        }
        this.f3439c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.e) {
            this.f3441f = true;
            return;
        }
        RecyclerView recyclerView = this.f3442g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = O.K.f747a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        RecyclerView recyclerView = this.f3442g;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z2 = abs > abs2;
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z2) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.H0;
        }
        if (this.f3440d != interpolator) {
            this.f3440d = interpolator;
            this.f3439c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f3438b = 0;
        this.f3437a = 0;
        recyclerView.setScrollState(2);
        this.f3439c.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f3442g;
        if (recyclerView.f2162n == null) {
            recyclerView.removeCallbacks(this);
            this.f3439c.abortAnimation();
            return;
        }
        this.f3441f = false;
        this.e = true;
        recyclerView.p();
        OverScroller overScroller = this.f3439c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f3437a;
            int i6 = currY - this.f3438b;
            this.f3437a = currX;
            this.f3438b = currY;
            int o2 = RecyclerView.o(i5, recyclerView.f2124H, recyclerView.J, recyclerView.getWidth());
            int o3 = RecyclerView.o(i6, recyclerView.f2125I, recyclerView.f2126K, recyclerView.getHeight());
            int[] iArr = recyclerView.s0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean u2 = recyclerView.u(o2, o3, 1, iArr, null);
            int[] iArr2 = recyclerView.s0;
            if (u2) {
                o2 -= iArr2[0];
                o3 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o2, o3);
            }
            if (recyclerView.f2160m != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.e0(o2, o3, iArr2);
                int i7 = iArr2[0];
                int i8 = iArr2[1];
                int i9 = o2 - i7;
                int i10 = o3 - i8;
                C0209x c0209x = recyclerView.f2162n.e;
                if (c0209x != null && !c0209x.f3617d && c0209x.e) {
                    int b2 = recyclerView.f2151g0.b();
                    if (b2 == 0) {
                        c0209x.i();
                    } else if (c0209x.f3614a >= b2) {
                        c0209x.f3614a = b2 - 1;
                        c0209x.g(i7, i8);
                    } else {
                        c0209x.g(i7, i8);
                    }
                }
                i4 = i7;
                i = i9;
                i2 = i10;
                i3 = i8;
            } else {
                i = o2;
                i2 = o3;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f2166p.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.s0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i11 = i3;
            recyclerView.v(i4, i3, i, i2, null, 1, iArr3);
            int i12 = i - iArr2[0];
            int i13 = i2 - iArr2[1];
            if (i4 != 0 || i11 != 0) {
                recyclerView.w(i4, i11);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            C0209x c0209x2 = recyclerView.f2162n.e;
            if ((c0209x2 == null || !c0209x2.f3617d) && z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.y();
                        if (recyclerView.f2124H.isFinished()) {
                            recyclerView.f2124H.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.z();
                        if (recyclerView.J.isFinished()) {
                            recyclerView.J.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.f2125I.isFinished()) {
                            recyclerView.f2125I.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.f2126K.isFinished()) {
                            recyclerView.f2126K.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = O.K.f747a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f2114F0) {
                    C0201o c0201o = recyclerView.f2149f0;
                    int[] iArr4 = c0201o.f3575c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c0201o.f3576d = 0;
                }
            } else {
                b();
                RunnableC0203q runnableC0203q = recyclerView.f2147e0;
                if (runnableC0203q != null) {
                    runnableC0203q.a(recyclerView, i4, i11);
                }
            }
        }
        C0209x c0209x3 = recyclerView.f2162n.e;
        if (c0209x3 != null && c0209x3.f3617d) {
            c0209x3.g(0, 0);
        }
        this.e = false;
        if (!this.f3441f) {
            recyclerView.setScrollState(0);
            recyclerView.k0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = O.K.f747a;
            recyclerView.postOnAnimation(this);
        }
    }
}
