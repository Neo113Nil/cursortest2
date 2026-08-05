package defpackage;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class f20 implements Runnable {
    public int MdtA4re8;
    public int NCTxEWno;
    public boolean P7K7Inc8;
    public final /* synthetic */ RecyclerView Qr9iLBAD;
    public Interpolator VgvYg0wo;
    public boolean b2ZJblxo;
    public OverScroller wxUZMvaN;

    public f20(RecyclerView recyclerView) {
        this.Qr9iLBAD = recyclerView;
        k10 k10Var = RecyclerView.d3vfVszL;
        this.VgvYg0wo = k10Var;
        this.P7K7Inc8 = false;
        this.b2ZJblxo = false;
        this.wxUZMvaN = new OverScroller(recyclerView.getContext(), k10Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.Qr9iLBAD;
        int[] iArr = recyclerView.N2kLh4D5;
        if (recyclerView.ygLcUYwZ == null) {
            recyclerView.removeCallbacks(this);
            this.wxUZMvaN.abortAnimation();
            return;
        }
        this.b2ZJblxo = false;
        this.P7K7Inc8 = true;
        recyclerView.eVhOlqcC();
        OverScroller overScroller = this.wxUZMvaN;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.NCTxEWno;
            int i6 = currY - this.MdtA4re8;
            this.NCTxEWno = currX;
            this.MdtA4re8 = currY;
            int[] iArr2 = recyclerView.N2kLh4D5;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.lDXGDhIF(i5, i6, 1, iArr2, null)) {
                i = i5 - iArr[0];
                i2 = i6 - iArr[1];
            } else {
                i = i5;
                i2 = i6;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.jb9XjC4I(i, i2);
            }
            if (recyclerView.OnDfzHZD != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.ZyZthT5G(i, i2, iArr);
                i3 = iArr[0];
                i4 = iArr[1];
                i -= i3;
                i2 -= i4;
                recyclerView.ygLcUYwZ.getClass();
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.sjUBp5pO.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.N2kLh4D5;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.sjUBp5pO(i3, i4, i, i2, null, 1, iArr3);
            int i7 = i - iArr[0];
            int i8 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.OxcuoDLp(i3, i4);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i7 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i8 != 0));
            recyclerView.ygLcUYwZ.getClass();
            if (z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i9 = i7 < 0 ? -currVelocity : i7 > 0 ? currVelocity : 0;
                    if (i8 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i8 <= 0) {
                        currVelocity = 0;
                    }
                    if (i9 < 0) {
                        recyclerView.KlHjfFWx();
                        if (recyclerView.eIA6dogk.isFinished()) {
                            recyclerView.eIA6dogk.onAbsorb(-i9);
                        }
                    } else if (i9 > 0) {
                        recyclerView.Ey6iv0m0();
                        if (recyclerView.VhgXwMj9.isFinished()) {
                            recyclerView.VhgXwMj9.onAbsorb(i9);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.I5GHvsYW();
                        if (recyclerView.pRiPUEwG.isFinished()) {
                            recyclerView.pRiPUEwG.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.amk52bBQ();
                        if (recyclerView.aZz0PFXp.isFinished()) {
                            recyclerView.aZz0PFXp.onAbsorb(currVelocity);
                        }
                    }
                    if (i9 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                pl plVar = recyclerView.LfKQckgD;
                int[] iArr4 = plVar.MdtA4re8;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                plVar.wxUZMvaN = 0;
            } else {
                if (this.P7K7Inc8) {
                    this.b2ZJblxo = true;
                } else {
                    recyclerView.removeCallbacks(this);
                    WeakHashMap weakHashMap2 = hg0.qoPGr6Ce;
                    recyclerView.postOnAnimation(this);
                }
                rl rlVar = recyclerView.VGmz0ccI;
                if (rlVar != null) {
                    rlVar.qoPGr6Ce(recyclerView, i3, i4);
                }
            }
        }
        recyclerView.ygLcUYwZ.getClass();
        this.P7K7Inc8 = false;
        if (!this.b2ZJblxo) {
            recyclerView.setScrollState(0);
            recyclerView.TrssYQ34(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap3 = hg0.qoPGr6Ce;
            recyclerView.postOnAnimation(this);
        }
    }
}
