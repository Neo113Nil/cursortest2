package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class t20 implements to {
    public final /* synthetic */ l20 MdtA4re8;
    public final /* synthetic */ oo NCTxEWno;
    public final /* synthetic */ m3 P7K7Inc8;
    public final /* synthetic */ dl Qr9iLBAD;
    public final /* synthetic */ oo VgvYg0wo;
    public final /* synthetic */ qt b2ZJblxo;
    public final /* synthetic */ t9 wxUZMvaN;

    public t20(oo ooVar, l20 l20Var, t9 t9Var, oo ooVar2, m3 m3Var, qt qtVar, dl dlVar) {
        this.NCTxEWno = ooVar;
        this.MdtA4re8 = l20Var;
        this.wxUZMvaN = t9Var;
        this.VgvYg0wo = ooVar2;
        this.P7K7Inc8 = m3Var;
        this.b2ZJblxo = qtVar;
        this.Qr9iLBAD = dlVar;
    }

    @Override // defpackage.to
    public final void P7K7Inc8(vo voVar, oo ooVar) {
        oo ooVar2 = this.NCTxEWno;
        l20 l20Var = this.MdtA4re8;
        if (ooVar == ooVar2) {
            l20Var.NCTxEWno = fn.Ey6iv0m0(this.wxUZMvaN, null, new jh(this.b2ZJblxo, this.Qr9iLBAD, null), 3);
            return;
        }
        if (ooVar == this.VgvYg0wo) {
            vn vnVar = (vn) l20Var.NCTxEWno;
            if (vnVar != null) {
                vnVar.b2ZJblxo(null);
            }
            l20Var.NCTxEWno = null;
        }
        if (ooVar == oo.ON_DESTROY) {
            this.P7K7Inc8.P7K7Inc8(xe0.qoPGr6Ce);
        }
    }
}
