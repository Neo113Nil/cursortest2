package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class mh0 implements android.text.style.LineHeightSpan {
    public final int GE9mJIPrb8gP;
    public final boolean P05cfTpS5W5L;
    public final boolean QiMR8OkAhezm;
    public int T1fB7bDYiVJQ;
    public final float WDYagTQQm9ns;
    public int XntWc4eZSQ8j;
    public final float e6mdH7fiFuta;
    public final int oh71FJcDz6S2;
    public int Ns0WNyEWdPsk = Integer.MIN_VALUE;
    public int fNwYGHIYeJcR = Integer.MIN_VALUE;
    public int h3m55N1URyyK = Integer.MIN_VALUE;
    public int gUjdnLbkVAaA = Integer.MIN_VALUE;

    public mh0(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.WDYagTQQm9ns = f;
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = z;
        this.P05cfTpS5W5L = z2;
        this.e6mdH7fiFuta = f2;
        this.GE9mJIPrb8gP = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            defpackage.f80.giKS3J6vZuNy("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(java.lang.CharSequence charSequence, int i, int i2, int i3, int i4, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.oh71FJcDz6S2;
        int i7 = this.GE9mJIPrb8gP;
        boolean z3 = this.P05cfTpS5W5L;
        boolean z4 = this.QiMR8OkAhezm;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.Ns0WNyEWdPsk == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int ceil = (int) java.lang.Math.ceil(this.WDYagTQQm9ns);
            int i9 = ceil - i8;
            if (i7 != 1 || i9 > 0) {
                float f = this.e6mdH7fiFuta;
                if (f == -1.0f) {
                    f = java.lang.Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i9 <= 0 ? java.lang.Math.ceil(i9 * f) : java.lang.Math.ceil((1.0f - f) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = ceil2 + i10;
                this.h3m55N1URyyK = i11;
                int i12 = i11 - ceil;
                this.fNwYGHIYeJcR = i12;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i12 = fontMetricsInt.ascent;
                    }
                    this.Ns0WNyEWdPsk = i12;
                    if (z3) {
                        i11 = i10;
                    }
                    this.gUjdnLbkVAaA = i11;
                    this.T1fB7bDYiVJQ = fontMetricsInt.ascent - i12;
                    this.XntWc4eZSQ8j = i11 - i10;
                } else if (i7 == 2) {
                    int i13 = fontMetricsInt.ascent;
                    this.Ns0WNyEWdPsk = z4 ? java.lang.Math.max(i13, i12) : java.lang.Math.min(i13, i12);
                    int i14 = fontMetricsInt.descent;
                    int i15 = this.h3m55N1URyyK;
                    this.gUjdnLbkVAaA = z3 ? java.lang.Math.min(i14, i15) : java.lang.Math.max(i14, i15);
                    this.T1fB7bDYiVJQ = 0;
                    this.XntWc4eZSQ8j = 0;
                }
            } else {
                int i16 = fontMetricsInt.ascent;
                this.fNwYGHIYeJcR = i16;
                int i17 = fontMetricsInt.descent;
                this.h3m55N1URyyK = i17;
                this.Ns0WNyEWdPsk = i16;
                this.gUjdnLbkVAaA = i17;
                this.T1fB7bDYiVJQ = 0;
                this.XntWc4eZSQ8j = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.Ns0WNyEWdPsk : this.fNwYGHIYeJcR;
        fontMetricsInt.descent = z2 ? this.gUjdnLbkVAaA : this.h3m55N1URyyK;
    }
}
