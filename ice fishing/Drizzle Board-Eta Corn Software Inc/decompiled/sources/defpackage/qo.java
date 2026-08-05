package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class qo implements to, t9 {
    public final l9 MdtA4re8;
    public final xo NCTxEWno;

    public qo(xo xoVar, l9 l9Var) {
        vn vnVar;
        l9Var.getClass();
        this.NCTxEWno = xoVar;
        this.MdtA4re8 = l9Var;
        if (xoVar.MdtA4re8 != po.NCTxEWno || (vnVar = (vn) l9Var.OnDfzHZD(re.VgvYg0wo)) == null) {
            return;
        }
        vnVar.b2ZJblxo(null);
    }

    @Override // defpackage.to
    public final void P7K7Inc8(vo voVar, oo ooVar) {
        xo xoVar = this.NCTxEWno;
        if (xoVar.MdtA4re8.compareTo(po.NCTxEWno) <= 0) {
            xoVar.P7K7Inc8(this);
            vn vnVar = (vn) this.MdtA4re8.OnDfzHZD(re.VgvYg0wo);
            if (vnVar != null) {
                vnVar.b2ZJblxo(null);
            }
        }
    }

    @Override // defpackage.t9
    public final l9 VgvYg0wo() {
        return this.MdtA4re8;
    }
}
