package defpackage;

/* loaded from: classes.dex */
public final class ke0 implements android.text.style.LineHeightSpan {
    public final boolean AARZUJiTa;
    public final boolean EXtogiMhuM;
    public int QoRHpC4k;
    public final int SH1y5HwkJhh;
    public final float adDC3e2L;
    public int cnag84Bm;
    public final float riuEU0zW4;
    public final int xiZrDbcSW0;
    public int ez2rX8ReCYw = Integer.MIN_VALUE;
    public int JlrlGoKF = Integer.MIN_VALUE;
    public int DFo87pBq1E5 = Integer.MIN_VALUE;
    public int SyNS6RMn = Integer.MIN_VALUE;

    public ke0(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.adDC3e2L = f;
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = z;
        this.EXtogiMhuM = z2;
        this.riuEU0zW4 = f2;
        this.SH1y5HwkJhh = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            defpackage.y50.oh6vYeIP("topRatio should be in [0..1] range or -1");
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
        boolean z2 = i2 == this.xiZrDbcSW0;
        int i7 = this.SH1y5HwkJhh;
        boolean z3 = this.EXtogiMhuM;
        boolean z4 = this.AARZUJiTa;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.ez2rX8ReCYw == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int ceil = (int) java.lang.Math.ceil(this.adDC3e2L);
            int i9 = ceil - i8;
            if (i7 != 1 || i9 > 0) {
                float f = this.riuEU0zW4;
                if (f == -1.0f) {
                    f = java.lang.Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i9 <= 0 ? java.lang.Math.ceil(i9 * f) : java.lang.Math.ceil((1.0f - f) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = ceil2 + i10;
                this.DFo87pBq1E5 = i11;
                int i12 = i11 - ceil;
                this.JlrlGoKF = i12;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i12 = fontMetricsInt.ascent;
                    }
                    this.ez2rX8ReCYw = i12;
                    if (z3) {
                        i11 = i10;
                    }
                    this.SyNS6RMn = i11;
                    this.cnag84Bm = fontMetricsInt.ascent - i12;
                    this.QoRHpC4k = i11 - i10;
                } else if (i7 == 2) {
                    int i13 = fontMetricsInt.ascent;
                    this.ez2rX8ReCYw = z4 ? java.lang.Math.max(i13, i12) : java.lang.Math.min(i13, i12);
                    int i14 = fontMetricsInt.descent;
                    int i15 = this.DFo87pBq1E5;
                    this.SyNS6RMn = z3 ? java.lang.Math.min(i14, i15) : java.lang.Math.max(i14, i15);
                    this.cnag84Bm = 0;
                    this.QoRHpC4k = 0;
                }
            } else {
                int i16 = fontMetricsInt.ascent;
                this.JlrlGoKF = i16;
                int i17 = fontMetricsInt.descent;
                this.DFo87pBq1E5 = i17;
                this.ez2rX8ReCYw = i16;
                this.SyNS6RMn = i17;
                this.cnag84Bm = 0;
                this.QoRHpC4k = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.ez2rX8ReCYw : this.JlrlGoKF;
        fontMetricsInt.descent = z2 ? this.SyNS6RMn : this.DFo87pBq1E5;
    }
}
