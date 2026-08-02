package t0;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.C2817Tl;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: t0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4999O implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public int f40635n;

    /* renamed from: u, reason: collision with root package name */
    public int f40636u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f40637v;

    /* renamed from: w, reason: collision with root package name */
    public Interpolator f40638w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f40639x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f40640y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f40641z;

    public RunnableC4999O(RecyclerView recyclerView) {
        this.f40641z = recyclerView;
        G0.b bVar = RecyclerView.f5177V0;
        this.f40638w = bVar;
        this.f40639x = false;
        this.f40640y = false;
        this.f40637v = new OverScroller(recyclerView.getContext(), bVar);
    }

    public final void a() {
        if (this.f40639x) {
            this.f40640y = true;
            return;
        }
        RecyclerView recyclerView = this.f40641z;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = O.X.f2142a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i, int i4, int i6, BaseInterpolator baseInterpolator) {
        int i9;
        RecyclerView recyclerView = this.f40641z;
        if (i6 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i4);
            boolean z6 = abs > abs2;
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i4 * i4) + (i * i));
            int width = z6 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i10 = width / 2;
            float f2 = width;
            float f9 = i10;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f9) + f9;
            if (sqrt > 0) {
                i9 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z6) {
                    abs = abs2;
                }
                i9 = (int) (((abs / f2) + 1.0f) * 300.0f);
            }
            i6 = Math.min(i9, 2000);
        }
        int i11 = i6;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f5177V0;
        }
        if (this.f40638w != interpolator) {
            this.f40638w = interpolator;
            this.f40637v = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f40636u = 0;
        this.f40635n = 0;
        recyclerView.setScrollState(2);
        this.f40637v.startScroll(0, 0, i, i4, i11);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i4;
        int i6;
        int i9;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f40641z;
        if (recyclerView.f5185E == null) {
            recyclerView.removeCallbacks(this);
            this.f40637v.abortAnimation();
            return;
        }
        this.f40640y = false;
        this.f40639x = true;
        recyclerView.m();
        OverScroller overScroller = this.f40637v;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i10 = currX - this.f40635n;
            int i11 = currY - this.f40636u;
            this.f40635n = currX;
            this.f40636u = currY;
            int[] iArr = recyclerView.f5207P0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean r9 = recyclerView.r(i10, i11, 1, iArr, null);
            int[] iArr2 = recyclerView.f5207P0;
            if (r9) {
                i = i10 - iArr2[0];
                i4 = i11 - iArr2[1];
            } else {
                i = i10;
                i4 = i11;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i, i4);
            }
            if (recyclerView.f5183D != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.X(i, i4, iArr2);
                i6 = iArr2[0];
                i9 = iArr2[1];
                i -= i6;
                i4 -= i9;
                C5022r c5022r = recyclerView.f5185E.f40594e;
                if (c5022r != null && !c5022r.f40810d && c5022r.f40811e) {
                    int b9 = recyclerView.f5184D0.b();
                    if (b9 == 0) {
                        c5022r.i();
                    } else if (c5022r.f40807a >= b9) {
                        c5022r.f40807a = b9 - 1;
                        c5022r.g(i6, i9);
                    } else {
                        c5022r.g(i6, i9);
                    }
                }
            } else {
                i6 = 0;
                i9 = 0;
            }
            if (!recyclerView.f5187F.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f5207P0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.s(i6, i9, i, i4, null, 1, iArr3);
            int i12 = i - iArr2[0];
            int i13 = i4 - iArr2[1];
            if (i6 != 0 || i9 != 0) {
                recyclerView.t(i6, i9);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z6 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            C5022r c5022r2 = recyclerView.f5185E.f40594e;
            if ((c5022r2 == null || !c5022r2.f40810d) && z6) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.v();
                        if (recyclerView.f5217W.isFinished()) {
                            recyclerView.f5217W.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.w();
                        if (recyclerView.f5219j0.isFinished()) {
                            recyclerView.f5219j0.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.f5218i0.isFinished()) {
                            recyclerView.f5218i0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.f5220k0.isFinished()) {
                            recyclerView.f5220k0.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = O.X.f2142a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C2817Tl c2817Tl = recyclerView.C0;
                int[] iArr4 = c2817Tl.f28575c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c2817Tl.f28576d = 0;
            } else {
                a();
                RunnableC5017m runnableC5017m = recyclerView.f5181B0;
                if (runnableC5017m != null) {
                    runnableC5017m.a(recyclerView, i6, i9);
                }
            }
        }
        C5022r c5022r3 = recyclerView.f5185E.f40594e;
        if (c5022r3 != null && c5022r3.f40810d) {
            c5022r3.g(0, 0);
        }
        this.f40639x = false;
        if (!this.f40640y) {
            recyclerView.setScrollState(0);
            recyclerView.c0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = O.X.f2142a;
            recyclerView.postOnAnimation(this);
        }
    }
}
