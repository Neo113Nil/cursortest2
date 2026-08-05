package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class y0 {
    public final r0 wxUZMvaN;
    public r70 qoPGr6Ce = null;
    public float NCTxEWno = 0.0f;
    public final ArrayList MdtA4re8 = new ArrayList();
    public boolean VgvYg0wo = false;

    public y0(f0 f0Var) {
        this.wxUZMvaN = new r0(this, f0Var);
    }

    public final void MdtA4re8(r70 r70Var, r70 r70Var2, r70 r70Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.NCTxEWno = i;
        }
        r0 r0Var = this.wxUZMvaN;
        if (z) {
            r0Var.b2ZJblxo(r70Var, 1.0f);
            r0Var.b2ZJblxo(r70Var2, -1.0f);
            r0Var.b2ZJblxo(r70Var3, 1.0f);
        } else {
            r0Var.b2ZJblxo(r70Var, -1.0f);
            r0Var.b2ZJblxo(r70Var2, 1.0f);
            r0Var.b2ZJblxo(r70Var3, -1.0f);
        }
    }

    public final void NCTxEWno(r70 r70Var, r70 r70Var2, r70 r70Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.NCTxEWno = i;
        }
        r0 r0Var = this.wxUZMvaN;
        if (z) {
            r0Var.b2ZJblxo(r70Var, 1.0f);
            r0Var.b2ZJblxo(r70Var2, -1.0f);
            r0Var.b2ZJblxo(r70Var3, -1.0f);
        } else {
            r0Var.b2ZJblxo(r70Var, -1.0f);
            r0Var.b2ZJblxo(r70Var2, 1.0f);
            r0Var.b2ZJblxo(r70Var3, 1.0f);
        }
    }

    public final r70 P7K7Inc8(boolean[] zArr, r70 r70Var) {
        int i;
        r0 r0Var = this.wxUZMvaN;
        int wxUZMvaN = r0Var.wxUZMvaN();
        r70 r70Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < wxUZMvaN; i2++) {
            float P7K7Inc8 = r0Var.P7K7Inc8(i2);
            if (P7K7Inc8 < 0.0f) {
                r70 VgvYg0wo = r0Var.VgvYg0wo(i2);
                if ((zArr == null || !zArr[VgvYg0wo.MdtA4re8]) && VgvYg0wo != r70Var && (((i = VgvYg0wo.OnDfzHZD) == 3 || i == 4) && P7K7Inc8 < f)) {
                    f = P7K7Inc8;
                    r70Var2 = VgvYg0wo;
                }
            }
        }
        return r70Var2;
    }

    public final void Qr9iLBAD(gp gpVar, r70 r70Var, boolean z) {
        if (r70Var.b2ZJblxo) {
            r0 r0Var = this.wxUZMvaN;
            float MdtA4re8 = r0Var.MdtA4re8(r70Var);
            this.NCTxEWno = (r70Var.P7K7Inc8 * MdtA4re8) + this.NCTxEWno;
            r0Var.Qr9iLBAD(r70Var, z);
            if (z) {
                r70Var.NCTxEWno(this);
            }
            if (r0Var.wxUZMvaN() == 0) {
                this.VgvYg0wo = true;
                gpVar.NCTxEWno = true;
            }
        }
    }

    public boolean VgvYg0wo() {
        return this.qoPGr6Ce == null && this.NCTxEWno == 0.0f && this.wxUZMvaN.wxUZMvaN() == 0;
    }

    public final void b2ZJblxo(r70 r70Var) {
        r70 r70Var2 = this.qoPGr6Ce;
        r0 r0Var = this.wxUZMvaN;
        if (r70Var2 != null) {
            r0Var.b2ZJblxo(r70Var2, -1.0f);
            this.qoPGr6Ce.wxUZMvaN = -1;
            this.qoPGr6Ce = null;
        }
        float Qr9iLBAD = r0Var.Qr9iLBAD(r70Var, true) * (-1.0f);
        this.qoPGr6Ce = r70Var;
        if (Qr9iLBAD == 1.0f) {
            return;
        }
        this.NCTxEWno /= Qr9iLBAD;
        int i = r0Var.Qr9iLBAD;
        for (int i2 = 0; i != -1 && i2 < r0Var.qoPGr6Ce; i2++) {
            float[] fArr = r0Var.b2ZJblxo;
            fArr[i] = fArr[i] / Qr9iLBAD;
            i = r0Var.P7K7Inc8[i];
        }
    }

    public void jb9XjC4I(gp gpVar, y0 y0Var, boolean z) {
        r0 r0Var = this.wxUZMvaN;
        r0Var.getClass();
        float MdtA4re8 = r0Var.MdtA4re8(y0Var.qoPGr6Ce);
        r0Var.Qr9iLBAD(y0Var.qoPGr6Ce, z);
        r0 r0Var2 = y0Var.wxUZMvaN;
        int wxUZMvaN = r0Var2.wxUZMvaN();
        for (int i = 0; i < wxUZMvaN; i++) {
            r70 VgvYg0wo = r0Var2.VgvYg0wo(i);
            r0Var.qoPGr6Ce(VgvYg0wo, r0Var2.MdtA4re8(VgvYg0wo) * MdtA4re8, z);
        }
        this.NCTxEWno = (y0Var.NCTxEWno * MdtA4re8) + this.NCTxEWno;
        if (z) {
            y0Var.qoPGr6Ce.NCTxEWno(this);
        }
        if (this.qoPGr6Ce == null || r0Var.wxUZMvaN() != 0) {
            return;
        }
        this.VgvYg0wo = true;
        gpVar.NCTxEWno = true;
    }

    public final void qoPGr6Ce(gp gpVar, int i) {
        r70 eVhOlqcC = gpVar.eVhOlqcC(i);
        r0 r0Var = this.wxUZMvaN;
        r0Var.b2ZJblxo(eVhOlqcC, 1.0f);
        r0Var.b2ZJblxo(gpVar.eVhOlqcC(i), -1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z;
        String concat = (this.qoPGr6Ce == null ? "0" : "" + this.qoPGr6Ce).concat(" = ");
        if (this.NCTxEWno != 0.0f) {
            concat = concat + this.NCTxEWno;
            z = true;
        } else {
            z = false;
        }
        r0 r0Var = this.wxUZMvaN;
        int wxUZMvaN = r0Var.wxUZMvaN();
        for (int i = 0; i < wxUZMvaN; i++) {
            r70 VgvYg0wo = r0Var.VgvYg0wo(i);
            if (VgvYg0wo != null) {
                float P7K7Inc8 = r0Var.P7K7Inc8(i);
                if (P7K7Inc8 != 0.0f) {
                    String r70Var = VgvYg0wo.toString();
                    if (!z) {
                        if (P7K7Inc8 < 0.0f) {
                            concat = concat.concat("- ");
                            P7K7Inc8 *= -1.0f;
                        }
                        concat = P7K7Inc8 == 1.0f ? concat.concat(r70Var) : concat + P7K7Inc8 + " " + r70Var;
                        z = true;
                    } else if (P7K7Inc8 > 0.0f) {
                        concat = concat.concat(" + ");
                        if (P7K7Inc8 == 1.0f) {
                        }
                        z = true;
                    } else {
                        concat = concat.concat(" - ");
                        P7K7Inc8 *= -1.0f;
                        if (P7K7Inc8 == 1.0f) {
                        }
                        z = true;
                    }
                }
            }
        }
        return !z ? concat.concat("0.0") : concat;
    }

    public r70 wxUZMvaN(boolean[] zArr) {
        return P7K7Inc8(zArr, null);
    }
}
