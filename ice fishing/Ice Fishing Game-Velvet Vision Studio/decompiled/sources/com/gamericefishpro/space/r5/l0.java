package com.gamericefishpro.space.r5;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Runnable {
    public int d;
    public int e;
    public OverScroller i;
    public Interpolator v;
    public boolean w;
    public boolean y;
    public final /* synthetic */ RecyclerView z;

    public l0(RecyclerView recyclerView) {
        this.z = recyclerView;
        com.gamericefishpro.space.k4.c cVar = RecyclerView.F0;
        this.v = cVar;
        this.w = false;
        this.y = false;
        this.i = new OverScroller(recyclerView.getContext(), cVar);
    }

    public final void a() {
        if (this.w) {
            this.y = true;
            return;
        }
        RecyclerView recyclerView = this.z;
        recyclerView.removeCallbacks(this);
        Field field = com.gamericefishpro.space.d4.l0.a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        RecyclerView recyclerView = this.z;
        int[] iArr = recyclerView.A0;
        if (recyclerView.C == null) {
            recyclerView.removeCallbacks(this);
            this.i.abortAnimation();
            return;
        }
        this.y = false;
        this.w = true;
        recyclerView.g();
        OverScroller overScroller = this.i;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i4 = currX - this.d;
            int i5 = currY - this.e;
            this.d = currX;
            this.e = currY;
            int[] iArr2 = recyclerView.A0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.j(i4, i5, 1, iArr2, null)) {
                i = i4 - iArr[0];
                i2 = i5 - iArr[1];
            } else {
                i = i4;
                i2 = i5;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.f(i, i2);
            }
            if (!recyclerView.E.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.A0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.k(0, 0, i, i2, null, 1, iArr3);
            int i6 = i - iArr[0];
            int i7 = i2 - iArr[1];
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
            recyclerView.C.getClass();
            if (z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i6 < 0) {
                        i3 = -currVelocity;
                    } else {
                        i3 = i6 > 0 ? currVelocity : 0;
                    }
                    if (i7 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i7 <= 0) {
                        currVelocity = 0;
                    }
                    if (i3 < 0) {
                        recyclerView.m();
                        if (recyclerView.U.isFinished()) {
                            recyclerView.U.onAbsorb(-i3);
                        }
                    } else if (i3 > 0) {
                        recyclerView.n();
                        if (recyclerView.W.isFinished()) {
                            recyclerView.W.onAbsorb(i3);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.o();
                        if (recyclerView.V.isFinished()) {
                            recyclerView.V.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.l();
                        if (recyclerView.a0.isFinished()) {
                            recyclerView.a0.onAbsorb(currVelocity);
                        }
                    }
                    if (i3 != 0 || currVelocity != 0) {
                        Field field = com.gamericefishpro.space.d4.l0.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                com.gamericefishpro.space.d9.d dVar = recyclerView.r0;
                dVar.getClass();
                dVar.c = 0;
            } else {
                a();
                l lVar = recyclerView.q0;
                if (lVar != null) {
                    lVar.a(recyclerView, 0, 0);
                }
            }
        }
        recyclerView.C.getClass();
        this.w = false;
        if (!this.y) {
            recyclerView.setScrollState(0);
            recyclerView.H(1);
        } else {
            recyclerView.removeCallbacks(this);
            Field field2 = com.gamericefishpro.space.d4.l0.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
