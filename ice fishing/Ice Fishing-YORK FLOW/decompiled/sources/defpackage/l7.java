package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class l7 implements defpackage.k7, defpackage.m7 {
    public final float QiMR8OkAhezm;
    public final float WDYagTQQm9ns;
    public final defpackage.h7 oh71FJcDz6S2;

    public l7(float f, defpackage.h7 h7Var) {
        this.WDYagTQQm9ns = f;
        this.oh71FJcDz6S2 = h7Var;
        this.QiMR8OkAhezm = f;
    }

    @Override // defpackage.k7
    public final void JhCgjQRTAOCT(defpackage.hp hpVar, int i, int[] iArr, defpackage.sc0 sc0Var, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int OVwOqzUGHcCU = hpVar.OVwOqzUGHcCU(this.WDYagTQQm9ns);
        boolean z = sc0Var == defpackage.sc0.oh71FJcDz6S2;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int max = java.lang.Math.max(0, i - iArr[i3]);
                iArr2[i5] = max;
                i4 = java.lang.Math.min(OVwOqzUGHcCU, max);
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
                int min = java.lang.Math.min(i7, i - i10);
                iArr2[i9] = min;
                int min2 = java.lang.Math.min(OVwOqzUGHcCU, (i - min) - i10);
                int i11 = iArr2[i9] + i10 + min2;
                i6++;
                i8 = min2;
                i7 = i11;
                i9++;
            }
            i2 = i - (i7 - i8);
        }
        if (i2 > 0) {
            int round = java.lang.Math.round((1.0f + (sc0Var == defpackage.sc0.WDYagTQQm9ns ? -1.0f : 1.0f)) * (i2 / 2.0f));
            if (z) {
                round -= i2;
            }
            if (round != 0) {
                int length3 = iArr2.length;
                for (int i12 = 0; i12 < length3; i12++) {
                    iArr2[i12] = iArr2[i12] + round;
                }
            }
        }
    }

    @Override // defpackage.m7
    public final void WDYagTQQm9ns(int i, defpackage.xk0 xk0Var, int[] iArr, int[] iArr2) {
        JhCgjQRTAOCT(xk0Var, i, iArr, defpackage.sc0.WDYagTQQm9ns, iArr2);
    }

    @Override // defpackage.k7, defpackage.m7
    public final float ZpBGe2uQfcn8() {
        return this.QiMR8OkAhezm;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.l7) {
            defpackage.l7 l7Var = (defpackage.l7) obj;
            return defpackage.or.giKS3J6vZuNy(this.WDYagTQQm9ns, l7Var.WDYagTQQm9ns) && this.oh71FJcDz6S2 == l7Var.oh71FJcDz6S2;
        }
        return false;
    }

    public final int hashCode() {
        return this.oh71FJcDz6S2.hashCode() + defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT(java.lang.Float.hashCode(this.WDYagTQQm9ns) * 31, 31, true);
    }

    public final java.lang.String toString() {
        return "Arrangement#spacedAligned(" + ((java.lang.Object) defpackage.or.fWTAfUmVKrZq(this.WDYagTQQm9ns)) + ", " + this.oh71FJcDz6S2 + ')';
    }
}
