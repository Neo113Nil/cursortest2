package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class jl1 implements defpackage.d20 {
    public final /* synthetic */ defpackage.cd1 GE9mJIPrb8gP;
    public final /* synthetic */ defpackage.vk1 Ns0WNyEWdPsk;
    public final /* synthetic */ defpackage.c20 P05cfTpS5W5L;
    public final /* synthetic */ defpackage.in0 QiMR8OkAhezm;
    public final /* synthetic */ java.lang.String WDYagTQQm9ns;
    public final /* synthetic */ defpackage.c20 e6mdH7fiFuta;
    public final /* synthetic */ defpackage.p81 oh71FJcDz6S2;

    public jl1(java.lang.String str, defpackage.p81 p81Var, defpackage.in0 in0Var, defpackage.c20 c20Var, defpackage.c20 c20Var2, defpackage.cd1 cd1Var, defpackage.vk1 vk1Var) {
        this.WDYagTQQm9ns = str;
        this.oh71FJcDz6S2 = p81Var;
        this.QiMR8OkAhezm = in0Var;
        this.P05cfTpS5W5L = c20Var;
        this.e6mdH7fiFuta = c20Var2;
        this.GE9mJIPrb8gP = cd1Var;
        this.Ns0WNyEWdPsk = vk1Var;
    }

    @Override // defpackage.d20
    public final java.lang.Object JhCgjQRTAOCT(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.c20 c20Var = (defpackage.c20) obj;
        defpackage.e30 e30Var = (defpackage.e30) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= e30Var.P05cfTpS5W5L(c20Var) ? 4 : 2;
        }
        if (e30Var.zJPqDeoF0Os1(intValue & 1, (intValue & 19) != 18)) {
            defpackage.pa1.gUjdnLbkVAaA.P05cfTpS5W5L(this.WDYagTQQm9ns, c20Var, this.oh71FJcDz6S2, this.QiMR8OkAhezm, this.P05cfTpS5W5L, this.e6mdH7fiFuta, this.GE9mJIPrb8gP, this.Ns0WNyEWdPsk, null, null, e30Var, (intValue << 3) & 112);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        return defpackage.gs1.ZpBGe2uQfcn8;
    }
}
