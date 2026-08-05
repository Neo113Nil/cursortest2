package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class j8 {
    public int MdtA4re8;
    public int NCTxEWno;
    public int P7K7Inc8;
    public final /* synthetic */ ConstraintLayout Qr9iLBAD;
    public int VgvYg0wo;
    public int b2ZJblxo;
    public final ConstraintLayout qoPGr6Ce;
    public int wxUZMvaN;

    public j8(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.Qr9iLBAD = constraintLayout;
        this.qoPGr6Ce = constraintLayout2;
    }

    public static boolean qoPGr6Ce(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void NCTxEWno(t8 t8Var, e2 e2Var) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int max2;
        boolean z;
        int baseline;
        int i;
        e8 e8Var = t8Var.VhgXwMj9;
        e8 e8Var2 = t8Var.eIA6dogk;
        if (t8Var.LvHlPNBd == 8) {
            e2Var.VgvYg0wo = 0;
            e2Var.P7K7Inc8 = 0;
            e2Var.b2ZJblxo = 0;
            return;
        }
        if (t8Var.HdOGZAzC == null) {
            return;
        }
        j70 j70Var = ConstraintLayout.OxcuoDLp;
        int i2 = e2Var.qoPGr6Ce;
        int i3 = e2Var.NCTxEWno;
        int i4 = e2Var.MdtA4re8;
        int i5 = e2Var.wxUZMvaN;
        int i6 = this.NCTxEWno + this.MdtA4re8;
        int i7 = this.wxUZMvaN;
        View view = t8Var.Sjrx9cEN;
        int k3x7lurq = q70.k3x7lurq(i2);
        if (k3x7lurq == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (k3x7lurq == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.P7K7Inc8, i7, -2);
        } else if (k3x7lurq == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.P7K7Inc8, i7, -2);
            boolean z2 = t8Var.amk52bBQ == 1;
            int i8 = e2Var.eVhOlqcC;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == t8Var.jb9XjC4I();
                if (e2Var.eVhOlqcC == 2 || !z2 || ((z2 && z3) || t8Var.WYNAV5pd())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(t8Var.lDXGDhIF(), 1073741824);
                }
            }
        } else if (k3x7lurq != 3) {
            makeMeasureSpec = 0;
        } else {
            int i9 = this.P7K7Inc8;
            int i10 = e8Var2 != null ? e8Var2.b2ZJblxo : 0;
            if (e8Var != null) {
                i10 += e8Var.b2ZJblxo;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int k3x7lurq2 = q70.k3x7lurq(i3);
        if (k3x7lurq2 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (k3x7lurq2 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.b2ZJblxo, i6, -2);
        } else if (k3x7lurq2 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.b2ZJblxo, i6, -2);
            boolean z4 = t8Var.KlHjfFWx == 1;
            int i11 = e2Var.eVhOlqcC;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == t8Var.lDXGDhIF();
                if (e2Var.eVhOlqcC == 2 || !z4 || ((z4 && z5) || t8Var.DK9slbsy())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(t8Var.jb9XjC4I(), 1073741824);
                }
            }
        } else if (k3x7lurq2 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i12 = this.b2ZJblxo;
            int i13 = e8Var2 != null ? t8Var.pRiPUEwG.b2ZJblxo : 0;
            if (e8Var != null) {
                i13 += t8Var.aZz0PFXp.b2ZJblxo;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        u8 u8Var = t8Var.HdOGZAzC;
        ConstraintLayout constraintLayout = this.Qr9iLBAD;
        if (u8Var != null && w30.amk52bBQ(constraintLayout.eVhOlqcC, 256) && view.getMeasuredWidth() == t8Var.lDXGDhIF() && view.getMeasuredWidth() < u8Var.lDXGDhIF() && view.getMeasuredHeight() == t8Var.jb9XjC4I() && view.getMeasuredHeight() < u8Var.jb9XjC4I() && view.getBaseline() == t8Var.ESscZ9M1 && !t8Var.gjV1z5T1() && qoPGr6Ce(t8Var.SgZGMMPL, makeMeasureSpec, t8Var.lDXGDhIF()) && qoPGr6Ce(t8Var.ytu5o6f4, makeMeasureSpec2, t8Var.jb9XjC4I())) {
            e2Var.VgvYg0wo = t8Var.lDXGDhIF();
            e2Var.P7K7Inc8 = t8Var.jb9XjC4I();
            e2Var.b2ZJblxo = t8Var.ESscZ9M1;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && t8Var.KRabZ4CU > 0.0f;
        boolean z11 = z7 && t8Var.KRabZ4CU > 0.0f;
        if (view == null) {
            return;
        }
        i8 i8Var = (i8) view.getLayoutParams();
        int i14 = e2Var.eVhOlqcC;
        if (i14 != 1 && i14 != 2 && z6 && t8Var.amk52bBQ == 0 && z7 && t8Var.KlHjfFWx == 0) {
            i = -1;
            z = false;
            baseline = 0;
            max2 = 0;
            max = 0;
        } else {
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            t8Var.SgZGMMPL = makeMeasureSpec;
            t8Var.ytu5o6f4 = makeMeasureSpec2;
            t8Var.b2ZJblxo = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = t8Var.I5GHvsYW;
            max = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
            int i16 = t8Var.RXQxj5Oe;
            if (i16 > 0) {
                max = Math.min(i16, max);
            }
            int i17 = t8Var.gjV1z5T1;
            max2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = makeMeasureSpec2;
            int i19 = t8Var.WYNAV5pd;
            if (i19 > 0) {
                max2 = Math.min(i19, max2);
            }
            if (!w30.amk52bBQ(constraintLayout.eVhOlqcC, 1)) {
                if (z10 && z8) {
                    max = (int) ((max2 * t8Var.KRabZ4CU) + 0.5f);
                } else if (z11 && z9) {
                    max2 = (int) ((max / t8Var.KRabZ4CU) + 0.5f);
                }
            }
            if (measuredWidth == max && measuredHeight == max2) {
                baseline = baseline2;
                i = -1;
                z = false;
            } else {
                if (measuredWidth != max) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                }
                int makeMeasureSpec3 = measuredHeight != max2 ? View.MeasureSpec.makeMeasureSpec(max2, 1073741824) : i18;
                view.measure(makeMeasureSpec, makeMeasureSpec3);
                t8Var.SgZGMMPL = makeMeasureSpec;
                t8Var.ytu5o6f4 = makeMeasureSpec3;
                z = false;
                t8Var.b2ZJblxo = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredWidth2;
                max2 = measuredHeight2;
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        e2Var.jb9XjC4I = (max == e2Var.MdtA4re8 && max2 == e2Var.wxUZMvaN) ? z : true;
        boolean z13 = i8Var.pP9Y2m6O ? true : z12;
        if (z13 && baseline != -1 && t8Var.ESscZ9M1 != baseline) {
            e2Var.jb9XjC4I = true;
        }
        e2Var.VgvYg0wo = max;
        e2Var.P7K7Inc8 = max2;
        e2Var.Qr9iLBAD = z13;
        e2Var.b2ZJblxo = baseline;
    }
}
