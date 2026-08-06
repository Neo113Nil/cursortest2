package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class s4 implements r4, t4 {
    public final float AvO7iQsrTN;
    public final o4 EljAMC1QTz;
    public final float OOA6hdeuvCS;

    public s4(float f, o4 o4Var) {
        this.OOA6hdeuvCS = f;
        this.EljAMC1QTz = o4Var;
        this.AvO7iQsrTN = f;
    }

    @Override // defpackage.r4
    public final void EljAMC1QTz(el elVar, int i, int[] iArr, p50 p50Var, int[] iArr2) {
        int i2;
        int round;
        if (iArr.length == 0) {
            return;
        }
        int rezfBrjOrqK = elVar.rezfBrjOrqK(this.OOA6hdeuvCS);
        boolean z = p50Var == p50.EljAMC1QTz;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int max = Math.max(0, i - iArr[i3]);
                iArr2[i5] = max;
                i4 = Math.min(rezfBrjOrqK, max);
                i = iArr2[i5] - i4;
                i3++;
                i5++;
            }
            i2 = i + i4;
        } else {
            int length2 = iArr.length;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i6 < length2) {
                int i10 = iArr[i6];
                int min = Math.min(i7, i - i10);
                iArr2[i9] = min;
                int min2 = Math.min(rezfBrjOrqK, (i - min) - i10);
                int i11 = iArr2[i9] + i10 + min2;
                i6++;
                i8 = min2;
                i7 = i11;
                i9++;
            }
            i2 = i - (i7 - i8);
        }
        if (i2 > 0) {
            int i12 = this.EljAMC1QTz.OOA6hdeuvCS;
            p50 p50Var2 = p50.OOA6hdeuvCS;
            switch (i12) {
                case 0:
                    round = Math.round((1.0f + (p50Var != p50Var2 ? 1.0f : -1.0f)) * (i2 / 2.0f));
                    break;
                default:
                    round = Math.round((1.0f + (p50Var != p50Var2 ? 0.0f * (-1.0f) : 0.0f)) * ((i2 + 0) / 2.0f));
                    break;
            }
            if (z) {
                round -= i2;
            }
            if (round != 0) {
                int length3 = iArr2.length;
                for (int i13 = 0; i13 < length3; i13++) {
                    iArr2[i13] = iArr2[i13] + round;
                }
            }
        }
    }

    @Override // defpackage.r4, defpackage.t4
    public final float GWasM1elztuh() {
        return this.AvO7iQsrTN;
    }

    @Override // defpackage.t4
    public final void encWxUiV2(int i, dd0 dd0Var, int[] iArr, int[] iArr2) {
        EljAMC1QTz(dd0Var, i, iArr, p50.OOA6hdeuvCS, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return cn.Yi7zF1RB1(this.OOA6hdeuvCS, s4Var.OOA6hdeuvCS) && this.EljAMC1QTz.equals(s4Var.EljAMC1QTz);
    }

    public final int hashCode() {
        return this.EljAMC1QTz.hashCode() + mr0.xqGvceK5x(Float.hashCode(this.OOA6hdeuvCS) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) cn.X1lG3V04pd(this.OOA6hdeuvCS)) + ", " + this.EljAMC1QTz + ')';
    }
}
