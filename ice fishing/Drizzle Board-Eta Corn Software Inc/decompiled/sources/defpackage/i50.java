package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class i50 implements to, AutoCloseable {
    public final h50 MdtA4re8;
    public final String NCTxEWno;
    public boolean wxUZMvaN;

    public i50(String str, h50 h50Var) {
        this.NCTxEWno = str;
        this.MdtA4re8 = h50Var;
    }

    @Override // defpackage.to
    public final void P7K7Inc8(vo voVar, oo ooVar) {
        if (ooVar == oo.ON_DESTROY) {
            this.wxUZMvaN = false;
            voVar.b2ZJblxo().P7K7Inc8(this);
        }
    }

    public final void VgvYg0wo(mcXgUFR8 mcxgufr8, xo xoVar) {
        mcxgufr8.getClass();
        xoVar.getClass();
        if (this.wxUZMvaN) {
            m1.Ey6iv0m0("Already attached to lifecycleOwner");
            return;
        }
        this.wxUZMvaN = true;
        xoVar.qoPGr6Ce(this);
        mcxgufr8.eIA6dogk(this.NCTxEWno, (ui) this.MdtA4re8.qoPGr6Ce.P7K7Inc8);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
