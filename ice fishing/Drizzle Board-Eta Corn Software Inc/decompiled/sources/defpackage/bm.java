package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class bm extends th0 {
    public final void OnDfzHZD(ac acVar) {
        ac acVar2 = this.Qr9iLBAD;
        acVar2.k3x7lurq.add(acVar);
        acVar.ow5vqvCr.add(acVar2);
    }

    @Override // defpackage.th0
    public final void P7K7Inc8() {
        this.Qr9iLBAD.MdtA4re8();
    }

    @Override // defpackage.th0
    public final void VgvYg0wo() {
        t8 t8Var = this.NCTxEWno;
        int i = ((am) t8Var).X1t0wlBd;
        ac acVar = this.Qr9iLBAD;
        if (i == 1) {
            t8Var.TrssYQ34 = acVar.b2ZJblxo;
        } else {
            t8Var.g2aRJUAd = acVar.b2ZJblxo;
        }
    }

    @Override // defpackage.th0
    public final boolean k3x7lurq() {
        return false;
    }

    @Override // defpackage.yb
    public final void qoPGr6Ce(yb ybVar) {
        ac acVar = this.Qr9iLBAD;
        if (acVar.MdtA4re8 && !acVar.eVhOlqcC) {
            acVar.wxUZMvaN((int) ((((ac) acVar.ow5vqvCr.get(0)).b2ZJblxo * ((am) this.NCTxEWno).SMax8wMR) + 0.5f));
        }
    }

    @Override // defpackage.th0
    public final void wxUZMvaN() {
        t8 t8Var = this.NCTxEWno;
        am amVar = (am) t8Var;
        int i = amVar.S7WAX0X5;
        int i2 = amVar.CTE3lpUp;
        int i3 = amVar.X1t0wlBd;
        ac acVar = this.Qr9iLBAD;
        if (i3 == 1) {
            if (i != -1) {
                acVar.ow5vqvCr.add(t8Var.HdOGZAzC.wxUZMvaN.Qr9iLBAD);
                this.NCTxEWno.HdOGZAzC.wxUZMvaN.Qr9iLBAD.k3x7lurq.add(acVar);
                acVar.P7K7Inc8 = i;
            } else if (i2 != -1) {
                acVar.ow5vqvCr.add(t8Var.HdOGZAzC.wxUZMvaN.jb9XjC4I);
                this.NCTxEWno.HdOGZAzC.wxUZMvaN.jb9XjC4I.k3x7lurq.add(acVar);
                acVar.P7K7Inc8 = -i2;
            } else {
                acVar.NCTxEWno = true;
                acVar.ow5vqvCr.add(t8Var.HdOGZAzC.wxUZMvaN.jb9XjC4I);
                this.NCTxEWno.HdOGZAzC.wxUZMvaN.jb9XjC4I.k3x7lurq.add(acVar);
            }
            OnDfzHZD(this.NCTxEWno.wxUZMvaN.Qr9iLBAD);
            OnDfzHZD(this.NCTxEWno.wxUZMvaN.jb9XjC4I);
            return;
        }
        if (i != -1) {
            acVar.ow5vqvCr.add(t8Var.HdOGZAzC.VgvYg0wo.Qr9iLBAD);
            this.NCTxEWno.HdOGZAzC.VgvYg0wo.Qr9iLBAD.k3x7lurq.add(acVar);
            acVar.P7K7Inc8 = i;
        } else if (i2 != -1) {
            acVar.ow5vqvCr.add(t8Var.HdOGZAzC.VgvYg0wo.jb9XjC4I);
            this.NCTxEWno.HdOGZAzC.VgvYg0wo.jb9XjC4I.k3x7lurq.add(acVar);
            acVar.P7K7Inc8 = -i2;
        } else {
            acVar.NCTxEWno = true;
            acVar.ow5vqvCr.add(t8Var.HdOGZAzC.VgvYg0wo.jb9XjC4I);
            this.NCTxEWno.HdOGZAzC.VgvYg0wo.jb9XjC4I.k3x7lurq.add(acVar);
        }
        OnDfzHZD(this.NCTxEWno.VgvYg0wo.Qr9iLBAD);
        OnDfzHZD(this.NCTxEWno.VgvYg0wo.jb9XjC4I);
    }
}
