package defpackage;

/* loaded from: classes.dex */
public final class vf0 implements java.lang.Cloneable {
    public /* synthetic */ java.lang.Object[] AARZUJiTa;
    public /* synthetic */ int EXtogiMhuM;
    public /* synthetic */ boolean adDC3e2L;
    public /* synthetic */ long[] xiZrDbcSW0;

    public vf0(int i) {
        if (i == 0) {
            this.xiZrDbcSW0 = defpackage.s21.F7NU4MC0GW;
            this.AARZUJiTa = defpackage.s21.adDC3e2L;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.xiZrDbcSW0 = new long[i5];
        this.AARZUJiTa = new java.lang.Object[i5];
    }

    public final int F7NU4MC0GW() {
        if (this.adDC3e2L) {
            int i = this.EXtogiMhuM;
            long[] jArr = this.xiZrDbcSW0;
            java.lang.Object[] objArr = this.AARZUJiTa;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object obj = objArr[i3];
                if (obj != defpackage.gq1.JlrlGoKF) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.adDC3e2L = false;
            this.EXtogiMhuM = i2;
        }
        return this.EXtogiMhuM;
    }

    public final long IHQe1A4L2xu(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.EXtogiMhuM)) {
            defpackage.db.fnWB2E7cs(defpackage.fx0.SH1y5HwkJhh("Expected index to be within 0..size()-1, but was ", i));
            return 0L;
        }
        if (this.adDC3e2L) {
            long[] jArr = this.xiZrDbcSW0;
            java.lang.Object[] objArr = this.AARZUJiTa;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                java.lang.Object obj = objArr[i4];
                if (obj != defpackage.gq1.JlrlGoKF) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.adDC3e2L = false;
            this.EXtogiMhuM = i3;
        }
        return this.xiZrDbcSW0[i];
    }

    public final java.lang.Object adDC3e2L(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.EXtogiMhuM)) {
            defpackage.db.fnWB2E7cs(defpackage.fx0.SH1y5HwkJhh("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        if (this.adDC3e2L) {
            long[] jArr = this.xiZrDbcSW0;
            java.lang.Object[] objArr = this.AARZUJiTa;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                java.lang.Object obj = objArr[i4];
                if (obj != defpackage.gq1.JlrlGoKF) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.adDC3e2L = false;
            this.EXtogiMhuM = i3;
        }
        return this.AARZUJiTa[i];
    }

    public final java.lang.Object clone() {
        java.lang.Object clone = super.clone();
        clone.getClass();
        defpackage.vf0 vf0Var = (defpackage.vf0) clone;
        vf0Var.xiZrDbcSW0 = (long[]) this.xiZrDbcSW0.clone();
        vf0Var.AARZUJiTa = (java.lang.Object[]) this.AARZUJiTa.clone();
        return vf0Var;
    }

    public final void oh6vYeIP(long j, java.lang.Object obj) {
        java.lang.Object obj2 = defpackage.gq1.JlrlGoKF;
        int kd6TUFXn = defpackage.s21.kd6TUFXn(this.xiZrDbcSW0, this.EXtogiMhuM, j);
        if (kd6TUFXn >= 0) {
            this.AARZUJiTa[kd6TUFXn] = obj;
            return;
        }
        int i = ~kd6TUFXn;
        int i2 = this.EXtogiMhuM;
        if (i < i2) {
            java.lang.Object[] objArr = this.AARZUJiTa;
            if (objArr[i] == obj2) {
                this.xiZrDbcSW0[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.adDC3e2L) {
            long[] jArr = this.xiZrDbcSW0;
            if (i2 >= jArr.length) {
                java.lang.Object[] objArr2 = this.AARZUJiTa;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    java.lang.Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.adDC3e2L = false;
                this.EXtogiMhuM = i3;
                i = ~defpackage.s21.kd6TUFXn(this.xiZrDbcSW0, i3, j);
            }
        }
        int i5 = this.EXtogiMhuM;
        if (i5 >= this.xiZrDbcSW0.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.xiZrDbcSW0 = java.util.Arrays.copyOf(this.xiZrDbcSW0, i9);
            this.AARZUJiTa = java.util.Arrays.copyOf(this.AARZUJiTa, i9);
        }
        int i10 = this.EXtogiMhuM;
        if (i10 - i != 0) {
            long[] jArr2 = this.xiZrDbcSW0;
            int i11 = i + 1;
            defpackage.t6.EoOhNTTfIN7K(jArr2, jArr2, i11, i, i10);
            java.lang.Object[] objArr3 = this.AARZUJiTa;
            defpackage.t6.wKlPRKlRnfqr(objArr3, objArr3, i11, i, this.EXtogiMhuM);
        }
        this.xiZrDbcSW0[i] = j;
        this.AARZUJiTa[i] = obj;
        this.EXtogiMhuM++;
    }

    public final void r1MBDhnF(long j) {
        int kd6TUFXn = defpackage.s21.kd6TUFXn(this.xiZrDbcSW0, this.EXtogiMhuM, j);
        if (kd6TUFXn >= 0) {
            java.lang.Object[] objArr = this.AARZUJiTa;
            java.lang.Object obj = objArr[kd6TUFXn];
            java.lang.Object obj2 = defpackage.gq1.JlrlGoKF;
            if (obj != obj2) {
                objArr[kd6TUFXn] = obj2;
                this.adDC3e2L = true;
            }
        }
    }

    public final java.lang.String toString() {
        if (F7NU4MC0GW() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.EXtogiMhuM * 28);
        sb.append('{');
        int i = this.EXtogiMhuM;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(IHQe1A4L2xu(i2));
            sb.append('=');
            java.lang.Object adDC3e2L = adDC3e2L(i2);
            if (adDC3e2L != sb) {
                sb.append(adDC3e2L);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ vf0() {
        this(10);
    }
}
