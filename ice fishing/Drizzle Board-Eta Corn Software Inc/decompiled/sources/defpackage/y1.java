package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class y1 extends t8 {
    public boolean B1cjorwa;
    public int CTE3lpUp;
    public boolean D4B4MtvK;
    public int S7WAX0X5;
    public t8[] SMax8wMR;
    public int X1t0wlBd;

    @Override // defpackage.t8
    public final boolean DK9slbsy() {
        return this.D4B4MtvK;
    }

    public final int FXJmAAN1() {
        int i = this.CTE3lpUp;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.t8
    public final boolean MdtA4re8() {
        return true;
    }

    @Override // defpackage.t8
    public final void NCTxEWno(gp gpVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        e8[] e8VarArr = this.FXJmAAN1;
        e8 e8Var = this.eIA6dogk;
        e8VarArr[0] = e8Var;
        int i3 = 2;
        e8 e8Var2 = this.pRiPUEwG;
        e8VarArr[2] = e8Var2;
        e8 e8Var3 = this.VhgXwMj9;
        e8VarArr[1] = e8Var3;
        e8 e8Var4 = this.aZz0PFXp;
        e8VarArr[3] = e8Var4;
        for (e8 e8Var5 : e8VarArr) {
            e8Var5.jb9XjC4I = gpVar.k3x7lurq(e8Var5);
        }
        int i4 = this.CTE3lpUp;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        e8 e8Var6 = e8VarArr[i4];
        if (!this.D4B4MtvK) {
            zCflySGU();
        }
        if (this.D4B4MtvK) {
            this.D4B4MtvK = false;
            int i5 = this.CTE3lpUp;
            if (i5 == 0 || i5 == 1) {
                gpVar.wxUZMvaN(e8Var.jb9XjC4I, this.TrssYQ34);
                gpVar.wxUZMvaN(e8Var3.jb9XjC4I, this.TrssYQ34);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    gpVar.wxUZMvaN(e8Var2.jb9XjC4I, this.g2aRJUAd);
                    gpVar.wxUZMvaN(e8Var4.jb9XjC4I, this.g2aRJUAd);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.S7WAX0X5; i6++) {
            t8 t8Var = this.SMax8wMR[i6];
            if ((this.B1cjorwa || t8Var.MdtA4re8()) && ((((i2 = this.CTE3lpUp) == 0 || i2 == 1) && t8Var.N2kLh4D5[0] == 3 && t8Var.eIA6dogk.P7K7Inc8 != null && t8Var.VhgXwMj9.P7K7Inc8 != null) || ((i2 == 2 || i2 == 3) && t8Var.N2kLh4D5[1] == 3 && t8Var.pRiPUEwG.P7K7Inc8 != null && t8Var.aZz0PFXp.P7K7Inc8 != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = e8Var.VgvYg0wo() || e8Var3.VgvYg0wo();
        boolean z4 = e8Var2.VgvYg0wo() || e8Var4.VgvYg0wo();
        int i7 = !(!z2 && (((i = this.CTE3lpUp) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.S7WAX0X5) {
            t8 t8Var2 = this.SMax8wMR[i8];
            if (this.B1cjorwa || t8Var2.MdtA4re8()) {
                r70 k3x7lurq = gpVar.k3x7lurq(t8Var2.FXJmAAN1[this.CTE3lpUp]);
                e8[] e8VarArr2 = t8Var2.FXJmAAN1;
                int i9 = this.CTE3lpUp;
                e8 e8Var7 = e8VarArr2[i9];
                e8Var7.jb9XjC4I = k3x7lurq;
                e8 e8Var8 = e8Var7.P7K7Inc8;
                int i10 = (e8Var8 == null || e8Var8.wxUZMvaN != this) ? 0 : e8Var7.b2ZJblxo;
                if (i9 == 0 || i9 == i3) {
                    r70 r70Var = e8Var6.jb9XjC4I;
                    int i11 = this.X1t0wlBd - i10;
                    y0 ow5vqvCr = gpVar.ow5vqvCr();
                    r70 OnDfzHZD = gpVar.OnDfzHZD();
                    OnDfzHZD.VgvYg0wo = 0;
                    ow5vqvCr.MdtA4re8(r70Var, k3x7lurq, OnDfzHZD, i11);
                    gpVar.MdtA4re8(ow5vqvCr);
                } else {
                    r70 r70Var2 = e8Var6.jb9XjC4I;
                    int i12 = this.X1t0wlBd + i10;
                    y0 ow5vqvCr2 = gpVar.ow5vqvCr();
                    r70 OnDfzHZD2 = gpVar.OnDfzHZD();
                    OnDfzHZD2.VgvYg0wo = 0;
                    ow5vqvCr2.NCTxEWno(r70Var2, k3x7lurq, OnDfzHZD2, i12);
                    gpVar.MdtA4re8(ow5vqvCr2);
                }
                gpVar.VgvYg0wo(e8Var6.jb9XjC4I, k3x7lurq, this.X1t0wlBd + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.CTE3lpUp;
        if (i13 == 0) {
            gpVar.VgvYg0wo(e8Var3.jb9XjC4I, e8Var.jb9XjC4I, 0, 8);
            gpVar.VgvYg0wo(e8Var.jb9XjC4I, this.HdOGZAzC.VhgXwMj9.jb9XjC4I, 0, 4);
            gpVar.VgvYg0wo(e8Var.jb9XjC4I, this.HdOGZAzC.eIA6dogk.jb9XjC4I, 0, 0);
            return;
        }
        if (i13 == 1) {
            gpVar.VgvYg0wo(e8Var.jb9XjC4I, e8Var3.jb9XjC4I, 0, 8);
            gpVar.VgvYg0wo(e8Var.jb9XjC4I, this.HdOGZAzC.eIA6dogk.jb9XjC4I, 0, 4);
            gpVar.VgvYg0wo(e8Var.jb9XjC4I, this.HdOGZAzC.VhgXwMj9.jb9XjC4I, 0, 0);
        } else if (i13 == 2) {
            gpVar.VgvYg0wo(e8Var4.jb9XjC4I, e8Var2.jb9XjC4I, 0, 8);
            gpVar.VgvYg0wo(e8Var2.jb9XjC4I, this.HdOGZAzC.aZz0PFXp.jb9XjC4I, 0, 4);
            gpVar.VgvYg0wo(e8Var2.jb9XjC4I, this.HdOGZAzC.pRiPUEwG.jb9XjC4I, 0, 0);
        } else if (i13 == 3) {
            gpVar.VgvYg0wo(e8Var2.jb9XjC4I, e8Var4.jb9XjC4I, 0, 8);
            gpVar.VgvYg0wo(e8Var2.jb9XjC4I, this.HdOGZAzC.pRiPUEwG.jb9XjC4I, 0, 4);
            gpVar.VgvYg0wo(e8Var2.jb9XjC4I, this.HdOGZAzC.aZz0PFXp.jb9XjC4I, 0, 0);
        }
    }

    @Override // defpackage.t8
    public final boolean WYNAV5pd() {
        return this.D4B4MtvK;
    }

    public final void hzgxAD8d(int i, sh0 sh0Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.S7WAX0X5; i2++) {
            t8 t8Var = this.SMax8wMR[i2];
            ArrayList arrayList2 = sh0Var.qoPGr6Ce;
            if (!arrayList2.contains(t8Var)) {
                arrayList2.add(t8Var);
            }
        }
        for (int i3 = 0; i3 < this.S7WAX0X5; i3++) {
            ra.sjUBp5pO(this.SMax8wMR[i3], i, arrayList, sh0Var);
        }
    }

    @Override // defpackage.t8
    public final String toString() {
        String str = "[Barrier] " + this.hGvurcGl + " {";
        for (int i = 0; i < this.S7WAX0X5; i++) {
            t8 t8Var = this.SMax8wMR[i];
            if (i > 0) {
                str = str.concat(", ");
            }
            str = str + t8Var.hGvurcGl;
        }
        return str.concat("}");
    }

    public final boolean zCflySGU() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.S7WAX0X5;
            if (i4 >= i) {
                break;
            }
            t8 t8Var = this.SMax8wMR[i4];
            if ((this.B1cjorwa || t8Var.MdtA4re8()) && ((((i2 = this.CTE3lpUp) == 0 || i2 == 1) && !t8Var.WYNAV5pd()) || (((i3 = this.CTE3lpUp) == 2 || i3 == 3) && !t8Var.DK9slbsy()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.S7WAX0X5; i6++) {
            t8 t8Var2 = this.SMax8wMR[i6];
            if (this.B1cjorwa || t8Var2.MdtA4re8()) {
                if (!z2) {
                    int i7 = this.CTE3lpUp;
                    if (i7 == 0) {
                        i5 = t8Var2.b2ZJblxo(2).MdtA4re8();
                    } else if (i7 == 1) {
                        i5 = t8Var2.b2ZJblxo(4).MdtA4re8();
                    } else if (i7 == 2) {
                        i5 = t8Var2.b2ZJblxo(3).MdtA4re8();
                    } else if (i7 == 3) {
                        i5 = t8Var2.b2ZJblxo(5).MdtA4re8();
                    }
                    z2 = true;
                }
                int i8 = this.CTE3lpUp;
                if (i8 == 0) {
                    i5 = Math.min(i5, t8Var2.b2ZJblxo(2).MdtA4re8());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, t8Var2.b2ZJblxo(4).MdtA4re8());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, t8Var2.b2ZJblxo(3).MdtA4re8());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, t8Var2.b2ZJblxo(5).MdtA4re8());
                }
            }
        }
        int i9 = i5 + this.X1t0wlBd;
        int i10 = this.CTE3lpUp;
        if (i10 == 0 || i10 == 1) {
            SgZGMMPL(i9, i9);
        } else {
            ytu5o6f4(i9, i9);
        }
        this.D4B4MtvK = true;
        return true;
    }
}
