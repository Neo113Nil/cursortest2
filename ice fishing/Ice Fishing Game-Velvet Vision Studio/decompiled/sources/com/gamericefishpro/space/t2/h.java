package com.gamericefishpro.space.t2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements LineHeightSpan {
    public int D;
    public int E;
    public final float d;
    public final int e;
    public final boolean i;
    public final boolean v;
    public final float w;
    public final int y;
    public int z = Integer.MIN_VALUE;
    public int A = Integer.MIN_VALUE;
    public int B = Integer.MIN_VALUE;
    public int C = Integer.MIN_VALUE;

    public h(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.d = f;
        this.e = i;
        this.i = z;
        this.v = z2;
        this.w = f2;
        this.y = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            com.gamericefishpro.space.w2.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.e;
        int i7 = this.y;
        boolean z3 = this.v;
        boolean z4 = this.i;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.z == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.d);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.w;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                if (i9 <= 0) {
                    dCeil = Math.ceil(i9 * fAbs);
                } else {
                    dCeil = Math.ceil((1.0f - fAbs) * i9);
                }
                int i10 = (int) dCeil;
                int i11 = fontMetricsInt.descent;
                int i12 = i10 + i11;
                this.B = i12;
                int i13 = i12 - iCeil;
                this.A = i13;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i13 = fontMetricsInt.ascent;
                    }
                    this.z = i13;
                    if (z3) {
                        i12 = i11;
                    }
                    this.C = i12;
                    this.D = fontMetricsInt.ascent - i13;
                    this.E = i12 - i11;
                } else if (i7 == 2) {
                    this.z = z4 ? Math.max(fontMetricsInt.ascent, i13) : Math.min(fontMetricsInt.ascent, i13);
                    this.C = z3 ? Math.min(fontMetricsInt.descent, this.B) : Math.max(fontMetricsInt.descent, this.B);
                    this.D = 0;
                    this.E = 0;
                }
            } else {
                int i14 = fontMetricsInt.ascent;
                this.A = i14;
                int i15 = fontMetricsInt.descent;
                this.B = i15;
                this.z = i14;
                this.C = i15;
                this.D = 0;
                this.E = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.z : this.A;
        fontMetricsInt.descent = z2 ? this.C : this.B;
    }
}
