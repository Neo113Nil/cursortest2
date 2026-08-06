package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xj0 implements defpackage.d11 {
    public defpackage.u90 P05cfTpS5W5L;
    public defpackage.sc0 QiMR8OkAhezm;
    public final defpackage.k0 WDYagTQQm9ns;
    public defpackage.l90 e6mdH7fiFuta;
    public defpackage.u90 oh71FJcDz6S2;

    public xj0(defpackage.k0 k0Var) {
        this.WDYagTQQm9ns = k0Var;
    }

    @Override // defpackage.d11
    public final long ZpBGe2uQfcn8(defpackage.q90 q90Var, long j, defpackage.sc0 sc0Var, long j2) {
        defpackage.l90 l90Var = this.e6mdH7fiFuta;
        if (l90Var != null) {
            defpackage.u90 u90Var = this.oh71FJcDz6S2;
            if ((u90Var == null ? false : defpackage.u90.ZpBGe2uQfcn8(u90Var.ZpBGe2uQfcn8, j)) && this.QiMR8OkAhezm == sc0Var) {
                defpackage.u90 u90Var2 = this.P05cfTpS5W5L;
                if (u90Var2 != null ? defpackage.u90.ZpBGe2uQfcn8(u90Var2.ZpBGe2uQfcn8, j2) : false) {
                    return l90Var.ZpBGe2uQfcn8;
                }
            }
        }
        long ZpBGe2uQfcn8 = this.WDYagTQQm9ns.ZpBGe2uQfcn8(q90Var, j, sc0Var, j2);
        this.oh71FJcDz6S2 = new defpackage.u90(j);
        this.QiMR8OkAhezm = sc0Var;
        this.P05cfTpS5W5L = new defpackage.u90(j2);
        this.e6mdH7fiFuta = new defpackage.l90(ZpBGe2uQfcn8);
        return ZpBGe2uQfcn8;
    }
}
