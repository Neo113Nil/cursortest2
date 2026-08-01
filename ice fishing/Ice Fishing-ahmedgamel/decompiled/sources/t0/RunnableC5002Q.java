package t0;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.C2780Sl;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: t0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5002Q implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public int f40585n;

    /* renamed from: u, reason: collision with root package name */
    public int f40586u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f40587v;

    /* renamed from: w, reason: collision with root package name */
    public Interpolator f40588w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f40589x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f40590y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f40591z;

    public RunnableC5002Q(RecyclerView recyclerView) {
        this.f40591z = recyclerView;
        G0.b bVar = RecyclerView.f5210a1;
        this.f40588w = bVar;
        this.f40589x = false;
        this.f40590y = false;
        this.f40587v = new OverScroller(recyclerView.getContext(), bVar);
    }

    public final void a() {
        if (this.f40589x) {
            this.f40590y = true;
            return;
        }
        RecyclerView recyclerView = this.f40591z;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = O.X.f2054a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i, int i6, int i9, BaseInterpolator baseInterpolator) {
        int i10;
        RecyclerView recyclerView = this.f40591z;
        if (i9 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i6);
            boolean z3 = abs > abs2;
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i6 * i6) + (i * i));
            int width = z3 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i11 = width / 2;
            float f3 = width;
            float f9 = i11;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f3) - 0.5f) * 0.47123894f)) * f9) + f9;
            if (sqrt > 0) {
                i10 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z3) {
                    abs = abs2;
                }
                i10 = (int) (((abs / f3) + 1.0f) * 300.0f);
            }
            i9 = Math.min(i10, 2000);
        }
        int i12 = i9;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f5210a1;
        }
        if (this.f40588w != interpolator) {
            this.f40588w = interpolator;
            this.f40587v = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f40586u = 0;
        this.f40585n = 0;
        recyclerView.setScrollState(2);
        this.f40587v.startScroll(0, 0, i, i6, i12);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i6;
        int i9;
        int i10;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f40591z;
        if (recyclerView.f5218E == null) {
            recyclerView.removeCallbacks(this);
            this.f40587v.abortAnimation();
            return;
        }
        this.f40590y = false;
        this.f40589x = true;
        recyclerView.m();
        OverScroller overScroller = this.f40587v;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i11 = currX - this.f40585n;
            int i12 = currY - this.f40586u;
            this.f40585n = currX;
            this.f40586u = currY;
            int[] iArr = recyclerView.f5250U0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean r9 = recyclerView.r(i11, i12, 1, iArr, null);
            int[] iArr2 = recyclerView.f5250U0;
            if (r9) {
                i = i11 - iArr2[0];
                i6 = i12 - iArr2[1];
            } else {
                i = i11;
                i6 = i12;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i, i6);
            }
            if (recyclerView.f5216D != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.X(i, i6, iArr2);
                i9 = iArr2[0];
                i10 = iArr2[1];
                i -= i9;
                i6 -= i10;
                C5024s c5024s = recyclerView.f5218E.f40544e;
                if (c5024s != null && !c5024s.f40763d && c5024s.f40764e) {
                    int b9 = recyclerView.f5227I0.b();
                    if (b9 == 0) {
                        c5024s.i();
                    } else if (c5024s.f40760a >= b9) {
                        c5024s.f40760a = b9 - 1;
                        c5024s.g(i9, i10);
                    } else {
                        c5024s.g(i9, i10);
                    }
                }
            } else {
                i9 = 0;
                i10 = 0;
            }
            if (!recyclerView.f5220F.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f5250U0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.s(i9, i10, i, i6, null, 1, iArr3);
            int i13 = i - iArr2[0];
            int i14 = i6 - iArr2[1];
            if (i9 != 0 || i10 != 0) {
                recyclerView.t(i9, i10);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z3 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i13 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i14 != 0));
            C5024s c5024s2 = recyclerView.f5218E.f40544e;
            if ((c5024s2 == null || !c5024s2.f40763d) && z3) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i15 = i13 < 0 ? -currVelocity : i13 > 0 ? currVelocity : 0;
                    if (i14 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i14 <= 0) {
                        currVelocity = 0;
                    }
                    if (i15 < 0) {
                        recyclerView.v();
                        if (recyclerView.f5253W.isFinished()) {
                            recyclerView.f5253W.onAbsorb(-i15);
                        }
                    } else if (i15 > 0) {
                        recyclerView.w();
                        if (recyclerView.f5258o0.isFinished()) {
                            recyclerView.f5258o0.onAbsorb(i15);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.f5257n0.isFinished()) {
                            recyclerView.f5257n0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.f5259p0.isFinished()) {
                            recyclerView.f5259p0.onAbsorb(currVelocity);
                        }
                    }
                    if (i15 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = O.X.f2054a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C2780Sl c2780Sl = recyclerView.f5225H0;
                int[] iArr4 = c2780Sl.f27546c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c2780Sl.f27547d = 0;
            } else {
                a();
                RunnableC5018m runnableC5018m = recyclerView.f5223G0;
                if (runnableC5018m != null) {
                    runnableC5018m.a(recyclerView, i9, i10);
                }
            }
        }
        C5024s c5024s3 = recyclerView.f5218E.f40544e;
        if (c5024s3 != null && c5024s3.f40763d) {
            c5024s3.g(0, 0);
        }
        this.f40589x = false;
        if (!this.f40590y) {
            recyclerView.setScrollState(0);
            recyclerView.c0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = O.X.f2054a;
            recyclerView.postOnAnimation(this);
        }
    }
}
