package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ug {
    public final ValueAnimator DK9slbsy;
    public final RecyclerView KlHjfFWx;
    public final StateListDrawable MdtA4re8;
    public final int NCTxEWno;
    public float OnDfzHZD;
    public final int P7K7Inc8;
    public final Drawable Qr9iLBAD;
    public final i1 U0LaHZX7;
    public final int VgvYg0wo;
    public final StateListDrawable b2ZJblxo;
    public final int eVhOlqcC;
    public final int jb9XjC4I;
    public int k3x7lurq;
    public int lDXGDhIF;
    public int lwWCatUu;
    public int ow5vqvCr;
    public final int qoPGr6Ce;
    public float sjUBp5pO;
    public final Drawable wxUZMvaN;
    public int ygLcUYwZ;
    public static final int[] i7xS8jrb = {R.attr.state_pressed};
    public static final int[] Mq3SeTnW = new int[0];
    public int OxcuoDLp = 0;
    public int amk52bBQ = 0;
    public boolean Ey6iv0m0 = false;
    public boolean I5GHvsYW = false;
    public int RXQxj5Oe = 0;
    public int FySoLYna = 0;
    public final int[] gjV1z5T1 = new int[2];
    public final int[] WYNAV5pd = new int[2];

    public ug(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.DK9slbsy = ofFloat;
        this.lwWCatUu = 0;
        i1 i1Var = new i1(5, this);
        this.U0LaHZX7 = i1Var;
        sg sgVar = new sg(this);
        this.MdtA4re8 = stateListDrawable;
        this.wxUZMvaN = drawable;
        this.b2ZJblxo = stateListDrawable2;
        this.Qr9iLBAD = drawable2;
        this.VgvYg0wo = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.P7K7Inc8 = Math.max(i, drawable.getIntrinsicWidth());
        this.jb9XjC4I = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.eVhOlqcC = Math.max(i, drawable2.getIntrinsicWidth());
        this.qoPGr6Ce = i2;
        this.NCTxEWno = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new tg(this));
        ofFloat.addUpdateListener(new u2(1, this));
        RecyclerView recyclerView2 = this.KlHjfFWx;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.sjUBp5pO;
            t10 t10Var = recyclerView2.ygLcUYwZ;
            if (t10Var != null) {
                t10Var.NCTxEWno("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.pRiPUEwG();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.KlHjfFWx;
            recyclerView3.OxcuoDLp.remove(this);
            if (recyclerView3.amk52bBQ == this) {
                recyclerView3.amk52bBQ = null;
            }
            ArrayList arrayList2 = this.KlHjfFWx.Sjrx9cEN;
            if (arrayList2 != null) {
                arrayList2.remove(sgVar);
            }
            this.KlHjfFWx.removeCallbacks(i1Var);
        }
        this.KlHjfFWx = recyclerView;
        ArrayList arrayList3 = recyclerView.sjUBp5pO;
        t10 t10Var2 = recyclerView.ygLcUYwZ;
        if (t10Var2 != null) {
            t10Var2.NCTxEWno("Cannot add item decoration during a scroll  or layout");
        }
        if (arrayList3.isEmpty()) {
            recyclerView.setWillNotDraw(false);
        }
        arrayList3.add(this);
        recyclerView.pRiPUEwG();
        recyclerView.requestLayout();
        this.KlHjfFWx.OxcuoDLp.add(this);
        RecyclerView recyclerView4 = this.KlHjfFWx;
        ArrayList arrayList4 = recyclerView4.Sjrx9cEN;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
            recyclerView4.Sjrx9cEN = arrayList4;
        }
        arrayList4.add(sgVar);
    }

    public static int MdtA4re8(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    public final boolean NCTxEWno(float f, float f2) {
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        int layoutDirection = this.KlHjfFWx.getLayoutDirection();
        int i = this.VgvYg0wo;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.OxcuoDLp - i) {
            return false;
        }
        int i2 = this.ow5vqvCr;
        int i3 = this.k3x7lurq / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void VgvYg0wo() {
        int i = this.lwWCatUu;
        ValueAnimator valueAnimator = this.DK9slbsy;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.lwWCatUu = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    public final boolean qoPGr6Ce(float f, float f2) {
        if (f2 < this.amk52bBQ - this.jb9XjC4I) {
            return false;
        }
        int i = this.lDXGDhIF;
        int i2 = this.ygLcUYwZ;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    public final void wxUZMvaN(int i) {
        RecyclerView recyclerView = this.KlHjfFWx;
        i1 i1Var = this.U0LaHZX7;
        StateListDrawable stateListDrawable = this.MdtA4re8;
        if (i == 2 && this.RXQxj5Oe != 2) {
            stateListDrawable.setState(i7xS8jrb);
            recyclerView.removeCallbacks(i1Var);
        }
        if (i == 0) {
            recyclerView.invalidate();
        } else {
            VgvYg0wo();
        }
        if (this.RXQxj5Oe == 2 && i != 2) {
            stateListDrawable.setState(Mq3SeTnW);
            recyclerView.removeCallbacks(i1Var);
            recyclerView.postDelayed(i1Var, 1200L);
        } else if (i == 1) {
            recyclerView.removeCallbacks(i1Var);
            recyclerView.postDelayed(i1Var, 1500L);
        }
        this.RXQxj5Oe = i;
    }
}
