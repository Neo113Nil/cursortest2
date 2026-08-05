package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class cd0 extends f50 {
    public boolean P7K7Inc8;
    public final /* synthetic */ Object Qr9iLBAD;
    public final /* synthetic */ int VgvYg0wo;
    public int b2ZJblxo;

    public cd0(yg0 yg0Var) {
        this.VgvYg0wo = 1;
        this.Qr9iLBAD = yg0Var;
        this.P7K7Inc8 = false;
        this.b2ZJblxo = 0;
    }

    @Override // defpackage.f50, defpackage.zg0
    public final void MdtA4re8() {
        int i = this.VgvYg0wo;
        Object obj = this.Qr9iLBAD;
        switch (i) {
            case 0:
                ((dd0) obj).qoPGr6Ce.setVisibility(0);
                break;
            default:
                if (!this.P7K7Inc8) {
                    this.P7K7Inc8 = true;
                    zg0 zg0Var = ((yg0) obj).wxUZMvaN;
                    if (zg0Var != null) {
                        zg0Var.MdtA4re8();
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.f50, defpackage.zg0
    public void NCTxEWno() {
        switch (this.VgvYg0wo) {
            case 0:
                this.P7K7Inc8 = true;
                break;
        }
    }

    @Override // defpackage.zg0
    public final void qoPGr6Ce() {
        int i = this.VgvYg0wo;
        Object obj = this.Qr9iLBAD;
        switch (i) {
            case 0:
                if (!this.P7K7Inc8) {
                    ((dd0) obj).qoPGr6Ce.setVisibility(this.b2ZJblxo);
                    break;
                }
                break;
            default:
                int i2 = this.b2ZJblxo + 1;
                this.b2ZJblxo = i2;
                yg0 yg0Var = (yg0) obj;
                if (i2 == yg0Var.qoPGr6Ce.size()) {
                    zg0 zg0Var = yg0Var.wxUZMvaN;
                    if (zg0Var != null) {
                        zg0Var.qoPGr6Ce();
                    }
                    this.b2ZJblxo = 0;
                    this.P7K7Inc8 = false;
                    yg0Var.VgvYg0wo = false;
                    break;
                }
                break;
        }
    }

    public cd0(dd0 dd0Var, int i) {
        this.VgvYg0wo = 0;
        this.Qr9iLBAD = dd0Var;
        this.b2ZJblxo = i;
        this.P7K7Inc8 = false;
    }
}
