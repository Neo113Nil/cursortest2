package defpackage;

/* loaded from: classes.dex */
public final class i6 implements defpackage.h6, defpackage.j6 {
    public final defpackage.k00 AARZUJiTa;
    public final float EXtogiMhuM;
    public final float adDC3e2L;
    public final boolean xiZrDbcSW0;

    public i6(float f, boolean z, defpackage.k00 k00Var) {
        this.adDC3e2L = f;
        this.xiZrDbcSW0 = z;
        this.AARZUJiTa = k00Var;
        this.EXtogiMhuM = f;
    }

    @Override // defpackage.h6
    public final void AARZUJiTa(defpackage.ki0 ki0Var, int i, int[] iArr, defpackage.w90 w90Var, int[] iArr2) {
        int i2;
        int i3;
        if (iArr.length == 0) {
            return;
        }
        int yIx6ChFVk = ki0Var.yIx6ChFVk(this.adDC3e2L);
        if (this.xiZrDbcSW0 && w90Var == defpackage.w90.xiZrDbcSW0) {
            int length = iArr.length - 1;
            i2 = 0;
            i3 = 0;
            while (-1 < length) {
                int i4 = iArr[length];
                int min = java.lang.Math.min(i2, i - i4);
                iArr2[length] = min;
                int min2 = java.lang.Math.min(yIx6ChFVk, (i - min) - i4);
                int i5 = iArr2[length] + i4 + min2;
                length--;
                i3 = min2;
                i2 = i5;
            }
        } else {
            int length2 = iArr.length;
            i2 = 0;
            i3 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i6 < length2) {
                int i8 = iArr[i6];
                int min3 = java.lang.Math.min(i2, i - i8);
                iArr2[i7] = min3;
                int min4 = java.lang.Math.min(yIx6ChFVk, (i - min3) - i8);
                int i9 = iArr2[i7] + i8 + min4;
                i6++;
                i3 = min4;
                i2 = i9;
                i7++;
            }
        }
        int i10 = i2 - i3;
        if (i10 < i) {
            int intValue = ((java.lang.Number) this.AARZUJiTa.adDC3e2L(java.lang.Integer.valueOf(i - i10), w90Var)).intValue();
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + intValue;
            }
        }
    }

    @Override // defpackage.j6
    public final void EXtogiMhuM(int i, defpackage.ki0 ki0Var, int[] iArr, int[] iArr2) {
        AARZUJiTa(ki0Var, i, iArr, defpackage.w90.adDC3e2L, iArr2);
    }

    @Override // defpackage.h6, defpackage.j6
    public final float IHQe1A4L2xu() {
        return this.EXtogiMhuM;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.i6)) {
            return false;
        }
        defpackage.i6 i6Var = (defpackage.i6) obj;
        return defpackage.uq.oh6vYeIP(this.adDC3e2L, i6Var.adDC3e2L) && this.xiZrDbcSW0 == i6Var.xiZrDbcSW0 && this.AARZUJiTa.equals(i6Var.AARZUJiTa);
    }

    public final int hashCode() {
        return this.AARZUJiTa.hashCode() + defpackage.fx0.adDC3e2L(java.lang.Float.hashCode(this.adDC3e2L) * 31, 31, this.xiZrDbcSW0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.xiZrDbcSW0 ? "" : "Absolute");
        sb.append("Arrangement#spacedAligned(");
        sb.append((java.lang.Object) defpackage.uq.r1MBDhnF(this.adDC3e2L));
        sb.append(", ");
        sb.append(this.AARZUJiTa);
        sb.append(')');
        return sb.toString();
    }
}
