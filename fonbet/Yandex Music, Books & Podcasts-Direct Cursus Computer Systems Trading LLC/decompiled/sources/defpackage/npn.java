package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class npn implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ RecyclerView g;

    public npn(RecyclerView recyclerView) {
        this.g = recyclerView;
        q0f q0fVar = RecyclerView.q1;
        this.d = q0fVar;
        this.e = false;
        this.f = false;
        this.c = new OverScroller(recyclerView.getContext(), q0fVar);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.g;
        recyclerView.setScrollState(2);
        this.b = 0;
        this.a = 0;
        Interpolator interpolator = this.d;
        q0f q0fVar = RecyclerView.q1;
        if (interpolator != q0fVar) {
            this.d = q0fVar;
            this.c = new OverScroller(recyclerView.getContext(), q0fVar);
        }
        this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.e) {
            this.f = true;
            return;
        }
        RecyclerView recyclerView = this.g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = wdu.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.g;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.q1;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.g;
        int[] iArr = recyclerView.a1;
        if (recyclerView.n == null) {
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.f = false;
        this.e = true;
        recyclerView.z();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.a;
            int i6 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int y = RecyclerView.y(i5, recyclerView.I, recyclerView.K, recyclerView.getWidth());
            int y2 = RecyclerView.y(i6, recyclerView.J, recyclerView.L, recyclerView.getHeight());
            int[] iArr2 = recyclerView.a1;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.F(y, y2, 1, iArr2, null)) {
                y -= iArr[0];
                y2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.x(y, y2);
            }
            if (recyclerView.m != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.y0(y, y2, iArr);
                int i7 = iArr[0];
                int i8 = iArr[1];
                int i9 = y - i7;
                int i10 = y2 - i8;
                i7g i7gVar = recyclerView.n.e;
                if (i7gVar != null && !i7gVar.d && i7gVar.e) {
                    int b = recyclerView.N0.b();
                    if (b == 0) {
                        i7gVar.k();
                    } else if (i7gVar.a >= b) {
                        i7gVar.a = b - 1;
                        i7gVar.i(i7, i8);
                    } else {
                        i7gVar.i(i7, i8);
                    }
                }
                i = i9;
                i3 = i7;
                i2 = i10;
                i4 = i8;
            } else {
                i = y;
                i2 = y2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.p.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.a1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.G(i3, i4, i, i2, null, 1, iArr3);
            int i11 = i - iArr[0];
            int i12 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.H(i3, i4);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            i7g i7gVar2 = recyclerView.n.e;
            if ((i7gVar2 == null || !i7gVar2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        recyclerView.J();
                        if (recyclerView.I.isFinished()) {
                            recyclerView.I.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        recyclerView.K();
                        if (recyclerView.K.isFinished()) {
                            recyclerView.K.onAbsorb(i13);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.L();
                        if (recyclerView.J.isFinished()) {
                            recyclerView.J.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.I();
                        if (recyclerView.L.isFinished()) {
                            recyclerView.L.onAbsorb(currVelocity);
                        }
                    }
                    if (i13 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.o1) {
                    ll4 ll4Var = recyclerView.M0;
                    int[] iArr4 = ll4Var.c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    ll4Var.d = 0;
                }
            } else {
                b();
                m1d m1dVar = recyclerView.L0;
                if (m1dVar != null) {
                    m1dVar.a(recyclerView, i3, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                son.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        i7g i7gVar3 = recyclerView.n.e;
        if (i7gVar3 != null && i7gVar3.d) {
            i7gVar3.i(0, 0);
        }
        this.e = false;
        if (!this.f) {
            recyclerView.setScrollState(0);
            recyclerView.f(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = wdu.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
