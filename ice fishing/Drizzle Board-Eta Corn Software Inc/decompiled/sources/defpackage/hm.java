package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class hm extends th0 {
    public final void OnDfzHZD(ac acVar) {
        ac acVar2 = this.Qr9iLBAD;
        acVar2.k3x7lurq.add(acVar);
        acVar.ow5vqvCr.add(acVar2);
    }

    @Override // defpackage.th0
    public final void P7K7Inc8() {
        this.MdtA4re8 = null;
        this.Qr9iLBAD.MdtA4re8();
    }

    @Override // defpackage.th0
    public final void VgvYg0wo() {
        t8 t8Var = this.NCTxEWno;
        if (t8Var instanceof y1) {
            int i = ((y1) t8Var).CTE3lpUp;
            ac acVar = this.Qr9iLBAD;
            if (i == 0 || i == 1) {
                t8Var.TrssYQ34 = acVar.b2ZJblxo;
            } else {
                t8Var.g2aRJUAd = acVar.b2ZJblxo;
            }
        }
    }

    @Override // defpackage.th0
    public final boolean k3x7lurq() {
        return false;
    }

    @Override // defpackage.yb
    public final void qoPGr6Ce(yb ybVar) {
        y1 y1Var = (y1) this.NCTxEWno;
        int i = y1Var.CTE3lpUp;
        ac acVar = this.Qr9iLBAD;
        ArrayList arrayList = acVar.ow5vqvCr;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((ac) obj).b2ZJblxo;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            acVar.wxUZMvaN(i3 + y1Var.X1t0wlBd);
        } else {
            acVar.wxUZMvaN(i2 + y1Var.X1t0wlBd);
        }
    }

    @Override // defpackage.th0
    public final void wxUZMvaN() {
        t8 t8Var = this.NCTxEWno;
        if (t8Var instanceof y1) {
            ac acVar = this.Qr9iLBAD;
            acVar.NCTxEWno = true;
            ArrayList arrayList = acVar.ow5vqvCr;
            y1 y1Var = (y1) t8Var;
            int i = y1Var.CTE3lpUp;
            boolean z = y1Var.B1cjorwa;
            int i2 = 0;
            if (i == 0) {
                acVar.VgvYg0wo = 4;
                while (i2 < y1Var.S7WAX0X5) {
                    t8 t8Var2 = y1Var.SMax8wMR[i2];
                    if (z || t8Var2.LvHlPNBd != 8) {
                        ac acVar2 = t8Var2.wxUZMvaN.Qr9iLBAD;
                        acVar2.k3x7lurq.add(acVar);
                        arrayList.add(acVar2);
                    }
                    i2++;
                }
                OnDfzHZD(this.NCTxEWno.wxUZMvaN.Qr9iLBAD);
                OnDfzHZD(this.NCTxEWno.wxUZMvaN.jb9XjC4I);
                return;
            }
            if (i == 1) {
                acVar.VgvYg0wo = 5;
                while (i2 < y1Var.S7WAX0X5) {
                    t8 t8Var3 = y1Var.SMax8wMR[i2];
                    if (z || t8Var3.LvHlPNBd != 8) {
                        ac acVar3 = t8Var3.wxUZMvaN.jb9XjC4I;
                        acVar3.k3x7lurq.add(acVar);
                        arrayList.add(acVar3);
                    }
                    i2++;
                }
                OnDfzHZD(this.NCTxEWno.wxUZMvaN.Qr9iLBAD);
                OnDfzHZD(this.NCTxEWno.wxUZMvaN.jb9XjC4I);
                return;
            }
            if (i == 2) {
                acVar.VgvYg0wo = 6;
                while (i2 < y1Var.S7WAX0X5) {
                    t8 t8Var4 = y1Var.SMax8wMR[i2];
                    if (z || t8Var4.LvHlPNBd != 8) {
                        ac acVar4 = t8Var4.VgvYg0wo.Qr9iLBAD;
                        acVar4.k3x7lurq.add(acVar);
                        arrayList.add(acVar4);
                    }
                    i2++;
                }
                OnDfzHZD(this.NCTxEWno.VgvYg0wo.Qr9iLBAD);
                OnDfzHZD(this.NCTxEWno.VgvYg0wo.jb9XjC4I);
                return;
            }
            if (i != 3) {
                return;
            }
            acVar.VgvYg0wo = 7;
            while (i2 < y1Var.S7WAX0X5) {
                t8 t8Var5 = y1Var.SMax8wMR[i2];
                if (z || t8Var5.LvHlPNBd != 8) {
                    ac acVar5 = t8Var5.VgvYg0wo.jb9XjC4I;
                    acVar5.k3x7lurq.add(acVar);
                    arrayList.add(acVar5);
                }
                i2++;
            }
            OnDfzHZD(this.NCTxEWno.VgvYg0wo.Qr9iLBAD);
            OnDfzHZD(this.NCTxEWno.VgvYg0wo.jb9XjC4I);
        }
    }
}
