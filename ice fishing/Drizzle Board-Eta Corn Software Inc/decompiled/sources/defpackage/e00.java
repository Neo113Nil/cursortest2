package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class e00 extends y0 {
    public r70[] P7K7Inc8;
    public int Qr9iLBAD;
    public r70[] b2ZJblxo;
    public mcXgUFR8 jb9XjC4I;

    @Override // defpackage.y0
    public final boolean VgvYg0wo() {
        return this.Qr9iLBAD == 0;
    }

    public final void eVhOlqcC(r70 r70Var) {
        int i;
        r70[] r70VarArr;
        int i2 = this.Qr9iLBAD + 1;
        r70[] r70VarArr2 = this.P7K7Inc8;
        if (i2 > r70VarArr2.length) {
            r70[] r70VarArr3 = (r70[]) Arrays.copyOf(r70VarArr2, r70VarArr2.length * 2);
            this.P7K7Inc8 = r70VarArr3;
            this.b2ZJblxo = (r70[]) Arrays.copyOf(r70VarArr3, r70VarArr3.length * 2);
        }
        r70[] r70VarArr4 = this.P7K7Inc8;
        int i3 = this.Qr9iLBAD;
        r70VarArr4[i3] = r70Var;
        int i4 = i3 + 1;
        this.Qr9iLBAD = i4;
        if (i4 > 1 && r70VarArr4[i3].MdtA4re8 > r70Var.MdtA4re8) {
            int i5 = 0;
            while (true) {
                i = this.Qr9iLBAD;
                r70VarArr = this.b2ZJblxo;
                if (i5 >= i) {
                    break;
                }
                r70VarArr[i5] = this.P7K7Inc8[i5];
                i5++;
            }
            Arrays.sort(r70VarArr, 0, i, new sc(6));
            for (int i6 = 0; i6 < this.Qr9iLBAD; i6++) {
                this.P7K7Inc8[i6] = this.b2ZJblxo[i6];
            }
        }
        r70Var.NCTxEWno = true;
        r70Var.qoPGr6Ce(this);
    }

    @Override // defpackage.y0
    public final void jb9XjC4I(gp gpVar, y0 y0Var, boolean z) {
        r70 r70Var = y0Var.qoPGr6Ce;
        if (r70Var == null) {
            return;
        }
        float[] fArr = r70Var.jb9XjC4I;
        r0 r0Var = y0Var.wxUZMvaN;
        int wxUZMvaN = r0Var.wxUZMvaN();
        for (int i = 0; i < wxUZMvaN; i++) {
            r70 VgvYg0wo = r0Var.VgvYg0wo(i);
            float P7K7Inc8 = r0Var.P7K7Inc8(i);
            mcXgUFR8 mcxgufr8 = this.jb9XjC4I;
            mcxgufr8.MdtA4re8 = VgvYg0wo;
            if (VgvYg0wo.NCTxEWno) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((r70) mcxgufr8.MdtA4re8).jb9XjC4I;
                    float f = (fArr[i2] * P7K7Inc8) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((r70) mcxgufr8.MdtA4re8).jb9XjC4I[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((e00) mcxgufr8.wxUZMvaN).k3x7lurq((r70) mcxgufr8.MdtA4re8);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * P7K7Inc8;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((r70) mcxgufr8.MdtA4re8).jb9XjC4I[i3] = f3;
                    } else {
                        ((r70) mcxgufr8.MdtA4re8).jb9XjC4I[i3] = 0.0f;
                    }
                }
                eVhOlqcC(VgvYg0wo);
            }
            this.NCTxEWno = (y0Var.NCTxEWno * P7K7Inc8) + this.NCTxEWno;
        }
        k3x7lurq(r70Var);
    }

    public final void k3x7lurq(r70 r70Var) {
        int i = 0;
        while (i < this.Qr9iLBAD) {
            if (this.P7K7Inc8[i] == r70Var) {
                while (true) {
                    int i2 = this.Qr9iLBAD;
                    if (i >= i2 - 1) {
                        this.Qr9iLBAD = i2 - 1;
                        r70Var.NCTxEWno = false;
                        return;
                    } else {
                        r70[] r70VarArr = this.P7K7Inc8;
                        int i3 = i + 1;
                        r70VarArr[i] = r70VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.y0
    public final String toString() {
        mcXgUFR8 mcxgufr8 = this.jb9XjC4I;
        String str = " goal -> (" + this.NCTxEWno + ") : ";
        for (int i = 0; i < this.Qr9iLBAD; i++) {
            mcxgufr8.MdtA4re8 = this.P7K7Inc8[i];
            str = str + mcxgufr8 + " ";
        }
        return str;
    }

    @Override // defpackage.y0
    public final r70 wxUZMvaN(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.Qr9iLBAD; i2++) {
            r70[] r70VarArr = this.P7K7Inc8;
            r70 r70Var = r70VarArr[i2];
            if (!zArr[r70Var.MdtA4re8]) {
                mcXgUFR8 mcxgufr8 = this.jb9XjC4I;
                mcxgufr8.MdtA4re8 = r70Var;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((r70) mcxgufr8.MdtA4re8).jb9XjC4I[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    r70 r70Var2 = r70VarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = r70Var2.jb9XjC4I[i3];
                            float f3 = ((r70) mcxgufr8.MdtA4re8).jb9XjC4I[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.P7K7Inc8[i];
    }
}
