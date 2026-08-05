package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class x3 implements Runnable {
    public final /* synthetic */ cs MdtA4re8;
    public final /* synthetic */ y3 NCTxEWno;
    public final /* synthetic */ tg0 VgvYg0wo;
    public final /* synthetic */ yr wxUZMvaN;

    public x3(tg0 tg0Var, y3 y3Var, cs csVar, yr yrVar) {
        this.VgvYg0wo = tg0Var;
        this.NCTxEWno = y3Var;
        this.MdtA4re8 = csVar;
        this.wxUZMvaN = yrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z3 z3Var = (z3) this.VgvYg0wo.MdtA4re8;
        y3 y3Var = this.NCTxEWno;
        if (y3Var != null) {
            z3Var.lwWCatUu = true;
            y3Var.NCTxEWno.MdtA4re8(false);
            z3Var.lwWCatUu = false;
        }
        cs csVar = this.MdtA4re8;
        if (csVar.isEnabled() && csVar.hasSubMenu()) {
            this.wxUZMvaN.OxcuoDLp(csVar, null, 4);
        }
    }
}
