package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class am extends t8 {
    public boolean D4B4MtvK;
    public float SMax8wMR = -1.0f;
    public int S7WAX0X5 = -1;
    public int CTE3lpUp = -1;
    public e8 B1cjorwa = this.pRiPUEwG;
    public int X1t0wlBd = 0;

    public am() {
        this.nSmgoSB5.clear();
        this.nSmgoSB5.add(this.B1cjorwa);
        int length = this.FXJmAAN1.length;
        for (int i = 0; i < length; i++) {
            this.FXJmAAN1[i] = this.B1cjorwa;
        }
    }

    @Override // defpackage.t8
    public final boolean DK9slbsy() {
        return this.D4B4MtvK;
    }

    @Override // defpackage.t8
    public final boolean MdtA4re8() {
        return true;
    }

    @Override // defpackage.t8
    public final void NCTxEWno(gp gpVar, boolean z) {
        u8 u8Var = this.HdOGZAzC;
        if (u8Var == null) {
            return;
        }
        Object b2ZJblxo = u8Var.b2ZJblxo(2);
        Object b2ZJblxo2 = u8Var.b2ZJblxo(4);
        u8 u8Var2 = this.HdOGZAzC;
        boolean z2 = u8Var2 != null && u8Var2.N2kLh4D5[0] == 2;
        if (this.X1t0wlBd == 0) {
            b2ZJblxo = u8Var.b2ZJblxo(3);
            b2ZJblxo2 = u8Var.b2ZJblxo(5);
            u8 u8Var3 = this.HdOGZAzC;
            z2 = u8Var3 != null && u8Var3.N2kLh4D5[1] == 2;
        }
        if (this.D4B4MtvK) {
            e8 e8Var = this.B1cjorwa;
            if (e8Var.MdtA4re8) {
                r70 k3x7lurq = gpVar.k3x7lurq(e8Var);
                gpVar.wxUZMvaN(k3x7lurq, this.B1cjorwa.MdtA4re8());
                if (this.S7WAX0X5 != -1) {
                    if (z2) {
                        gpVar.P7K7Inc8(gpVar.k3x7lurq(b2ZJblxo2), k3x7lurq, 0, 5);
                    }
                } else if (this.CTE3lpUp != -1 && z2) {
                    r70 k3x7lurq2 = gpVar.k3x7lurq(b2ZJblxo2);
                    gpVar.P7K7Inc8(k3x7lurq, gpVar.k3x7lurq(b2ZJblxo), 0, 5);
                    gpVar.P7K7Inc8(k3x7lurq2, k3x7lurq, 0, 5);
                }
                this.D4B4MtvK = false;
                return;
            }
        }
        if (this.S7WAX0X5 != -1) {
            r70 k3x7lurq3 = gpVar.k3x7lurq(this.B1cjorwa);
            gpVar.VgvYg0wo(k3x7lurq3, gpVar.k3x7lurq(b2ZJblxo), this.S7WAX0X5, 8);
            if (z2) {
                gpVar.P7K7Inc8(gpVar.k3x7lurq(b2ZJblxo2), k3x7lurq3, 0, 5);
                return;
            }
            return;
        }
        if (this.CTE3lpUp != -1) {
            r70 k3x7lurq4 = gpVar.k3x7lurq(this.B1cjorwa);
            r70 k3x7lurq5 = gpVar.k3x7lurq(b2ZJblxo2);
            gpVar.VgvYg0wo(k3x7lurq4, k3x7lurq5, -this.CTE3lpUp, 8);
            if (z2) {
                gpVar.P7K7Inc8(k3x7lurq4, gpVar.k3x7lurq(b2ZJblxo), 0, 5);
                gpVar.P7K7Inc8(k3x7lurq5, k3x7lurq4, 0, 5);
                return;
            }
            return;
        }
        if (this.SMax8wMR != -1.0f) {
            r70 k3x7lurq6 = gpVar.k3x7lurq(this.B1cjorwa);
            r70 k3x7lurq7 = gpVar.k3x7lurq(b2ZJblxo2);
            float f = this.SMax8wMR;
            y0 ow5vqvCr = gpVar.ow5vqvCr();
            ow5vqvCr.wxUZMvaN.b2ZJblxo(k3x7lurq6, -1.0f);
            ow5vqvCr.wxUZMvaN.b2ZJblxo(k3x7lurq7, f);
            gpVar.MdtA4re8(ow5vqvCr);
        }
    }

    @Override // defpackage.t8
    public final boolean WYNAV5pd() {
        return this.D4B4MtvK;
    }

    @Override // defpackage.t8
    public final e8 b2ZJblxo(int i) {
        int k3x7lurq = q70.k3x7lurq(i);
        if (k3x7lurq != 1) {
            if (k3x7lurq != 2) {
                if (k3x7lurq != 3) {
                    if (k3x7lurq != 4) {
                        return null;
                    }
                }
            }
            if (this.X1t0wlBd == 0) {
                return this.B1cjorwa;
            }
            return null;
        }
        if (this.X1t0wlBd == 1) {
            return this.B1cjorwa;
        }
        return null;
    }

    @Override // defpackage.t8
    public final void fVMzMhyS(gp gpVar, boolean z) {
        if (this.HdOGZAzC == null) {
            return;
        }
        e8 e8Var = this.B1cjorwa;
        gpVar.getClass();
        int ygLcUYwZ = gp.ygLcUYwZ(e8Var);
        if (this.X1t0wlBd == 1) {
            this.TrssYQ34 = ygLcUYwZ;
            this.g2aRJUAd = 0;
            eIA6dogk(this.HdOGZAzC.jb9XjC4I());
            aZz0PFXp(0);
            return;
        }
        this.TrssYQ34 = 0;
        this.g2aRJUAd = ygLcUYwZ;
        aZz0PFXp(this.HdOGZAzC.lDXGDhIF());
        eIA6dogk(0);
    }

    public final void hzgxAD8d(int i) {
        this.B1cjorwa.jb9XjC4I(i);
        this.D4B4MtvK = true;
    }

    public final void zCflySGU(int i) {
        e8 e8Var;
        if (this.X1t0wlBd == i) {
            return;
        }
        this.X1t0wlBd = i;
        ArrayList arrayList = this.nSmgoSB5;
        arrayList.clear();
        if (this.X1t0wlBd == 1) {
            e8Var = this.eIA6dogk;
            this.B1cjorwa = e8Var;
        } else {
            e8Var = this.pRiPUEwG;
            this.B1cjorwa = e8Var;
        }
        arrayList.add(e8Var);
        e8[] e8VarArr = this.FXJmAAN1;
        int length = e8VarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            e8VarArr[i2] = this.B1cjorwa;
        }
    }
}
