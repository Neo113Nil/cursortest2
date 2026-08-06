package defpackage;

/* loaded from: classes.dex */
public final class qb1 implements java.lang.Cloneable {
    public /* synthetic */ java.lang.Object[] AARZUJiTa;
    public /* synthetic */ int EXtogiMhuM;
    public /* synthetic */ boolean adDC3e2L;
    public /* synthetic */ int[] xiZrDbcSW0;

    public qb1() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.xiZrDbcSW0 = new int[i4];
        this.AARZUJiTa = new java.lang.Object[i4];
    }

    public final void F7NU4MC0GW(int i, java.lang.Object obj) {
        int G3OKOH3wZRC = defpackage.s21.G3OKOH3wZRC(this.xiZrDbcSW0, this.EXtogiMhuM, i);
        if (G3OKOH3wZRC >= 0) {
            this.AARZUJiTa[G3OKOH3wZRC] = obj;
            return;
        }
        int i2 = ~G3OKOH3wZRC;
        int i3 = this.EXtogiMhuM;
        if (i2 < i3) {
            java.lang.Object[] objArr = this.AARZUJiTa;
            if (objArr[i2] == defpackage.mj1.fnWB2E7cs) {
                this.xiZrDbcSW0[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.adDC3e2L && i3 >= this.xiZrDbcSW0.length) {
            defpackage.mj1.QoRHpC4k(this);
            i2 = ~defpackage.s21.G3OKOH3wZRC(this.xiZrDbcSW0, this.EXtogiMhuM, i);
        }
        int i4 = this.EXtogiMhuM;
        if (i4 >= this.xiZrDbcSW0.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.xiZrDbcSW0 = java.util.Arrays.copyOf(this.xiZrDbcSW0, i8);
            this.AARZUJiTa = java.util.Arrays.copyOf(this.AARZUJiTa, i8);
        }
        int i9 = this.EXtogiMhuM;
        if (i9 - i2 != 0) {
            int[] iArr = this.xiZrDbcSW0;
            int i10 = i2 + 1;
            defpackage.t6.Ye0N2xE9Hc(iArr, iArr, i10, i2, i9);
            java.lang.Object[] objArr2 = this.AARZUJiTa;
            defpackage.t6.wKlPRKlRnfqr(objArr2, objArr2, i10, i2, this.EXtogiMhuM);
        }
        this.xiZrDbcSW0[i2] = i;
        this.AARZUJiTa[i2] = obj;
        this.EXtogiMhuM++;
    }

    /* renamed from: IHQe1A4L2xu, reason: merged with bridge method [inline-methods] */
    public final defpackage.qb1 clone() {
        java.lang.Object clone = super.clone();
        clone.getClass();
        defpackage.qb1 qb1Var = (defpackage.qb1) clone;
        qb1Var.xiZrDbcSW0 = (int[]) this.xiZrDbcSW0.clone();
        qb1Var.AARZUJiTa = (java.lang.Object[]) this.AARZUJiTa.clone();
        return qb1Var;
    }

    public final int adDC3e2L() {
        if (this.adDC3e2L) {
            defpackage.mj1.QoRHpC4k(this);
        }
        return this.EXtogiMhuM;
    }

    public final java.lang.Object oh6vYeIP(int i) {
        java.lang.Object obj;
        int G3OKOH3wZRC = defpackage.s21.G3OKOH3wZRC(this.xiZrDbcSW0, this.EXtogiMhuM, i);
        if (G3OKOH3wZRC < 0 || (obj = this.AARZUJiTa[G3OKOH3wZRC]) == defpackage.mj1.fnWB2E7cs) {
            return null;
        }
        return obj;
    }

    public final int r1MBDhnF(int i) {
        if (this.adDC3e2L) {
            defpackage.mj1.QoRHpC4k(this);
        }
        return this.xiZrDbcSW0[i];
    }

    public final java.lang.String toString() {
        if (adDC3e2L() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.EXtogiMhuM * 28);
        sb.append('{');
        int i = this.EXtogiMhuM;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(r1MBDhnF(i2));
            sb.append('=');
            java.lang.Object xiZrDbcSW0 = xiZrDbcSW0(i2);
            if (xiZrDbcSW0 != this) {
                sb.append(xiZrDbcSW0);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final java.lang.Object xiZrDbcSW0(int i) {
        if (this.adDC3e2L) {
            defpackage.mj1.QoRHpC4k(this);
        }
        java.lang.Object[] objArr = this.AARZUJiTa;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new java.lang.ArrayIndexOutOfBoundsException();
    }
}
