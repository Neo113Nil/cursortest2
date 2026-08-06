package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ka0 implements LineHeightSpan {
    public final boolean AvO7iQsrTN;
    public final int EljAMC1QTz;
    public final int JFJ3QoxA;
    public final float OOA6hdeuvCS;
    public int WIEu4Ya2g8;
    public final boolean encWxUiV2;
    public int iwATDS1i01k;
    public final float mOu10nynGul;
    public int rQPn8YBR = Integer.MIN_VALUE;
    public int E7jCp8Ls = Integer.MIN_VALUE;
    public int XnEVoBF0td1l = Integer.MIN_VALUE;
    public int uFEq9NpZ = Integer.MIN_VALUE;

    public ka0(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.OOA6hdeuvCS = f;
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = z;
        this.encWxUiV2 = z2;
        this.mOu10nynGul = f2;
        this.JFJ3QoxA = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            u10.Yi7zF1RB1("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.EljAMC1QTz;
        int i7 = this.JFJ3QoxA;
        boolean z3 = this.encWxUiV2;
        boolean z4 = this.AvO7iQsrTN;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.rQPn8YBR == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int ceil = (int) Math.ceil(this.OOA6hdeuvCS);
            int i9 = ceil - i8;
            if (i7 != 1 || i9 > 0) {
                float f = this.mOu10nynGul;
                if (f == -1.0f) {
                    f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i9 <= 0 ? Math.ceil(i9 * f) : Math.ceil((1.0f - f) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = ceil2 + i10;
                this.XnEVoBF0td1l = i11;
                int i12 = i11 - ceil;
                this.E7jCp8Ls = i12;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i12 = fontMetricsInt.ascent;
                    }
                    this.rQPn8YBR = i12;
                    if (z3) {
                        i11 = i10;
                    }
                    this.uFEq9NpZ = i11;
                    this.iwATDS1i01k = fontMetricsInt.ascent - i12;
                    this.WIEu4Ya2g8 = i11 - i10;
                } else if (i7 == 2) {
                    int i13 = fontMetricsInt.ascent;
                    this.rQPn8YBR = z4 ? Math.max(i13, i12) : Math.min(i13, i12);
                    int i14 = fontMetricsInt.descent;
                    int i15 = this.XnEVoBF0td1l;
                    this.uFEq9NpZ = z3 ? Math.min(i14, i15) : Math.max(i14, i15);
                    this.iwATDS1i01k = 0;
                    this.WIEu4Ya2g8 = 0;
                }
            } else {
                int i16 = fontMetricsInt.ascent;
                this.E7jCp8Ls = i16;
                int i17 = fontMetricsInt.descent;
                this.XnEVoBF0td1l = i17;
                this.rQPn8YBR = i16;
                this.uFEq9NpZ = i17;
                this.iwATDS1i01k = 0;
                this.WIEu4Ya2g8 = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.rQPn8YBR : this.E7jCp8Ls;
        fontMetricsInt.descent = z2 ? this.uFEq9NpZ : this.XnEVoBF0td1l;
    }
}
