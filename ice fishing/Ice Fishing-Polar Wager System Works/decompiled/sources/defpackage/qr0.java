package defpackage;

/* loaded from: classes.dex */
public final class qr0 extends defpackage.gs0 {
    public static final defpackage.qr0 r1MBDhnF = new defpackage.qr0(0, 3, 1);

    @Override // defpackage.gs0
    public final void IHQe1A4L2xu(defpackage.pd pdVar, defpackage.b6 b6Var, defpackage.ia1 ia1Var, defpackage.v01 v01Var, defpackage.hs0 hs0Var) {
        defpackage.F7NU4MC0GW f7nu4mc0gw;
        defpackage.fa1 fa1Var = (defpackage.fa1) pdVar.r1MBDhnF(1);
        defpackage.o10 o10Var = (defpackage.o10) pdVar.r1MBDhnF(0);
        defpackage.wv wvVar = (defpackage.wv) pdVar.r1MBDhnF(2);
        defpackage.ia1 adDC3e2L = fa1Var.adDC3e2L();
        if (hs0Var != null) {
            try {
                f7nu4mc0gw = new defpackage.F7NU4MC0GW(19, hs0Var, ia1Var);
            } catch (java.lang.Throwable th) {
                adDC3e2L.adDC3e2L(false);
                throw th;
            }
        } else {
            f7nu4mc0gw = null;
        }
        if (!wvVar.AARZUJiTa.SiPhmbmu()) {
            defpackage.dh.IHQe1A4L2xu("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        wvVar.xiZrDbcSW0.frpfPPIgqM9O(b6Var, adDC3e2L, v01Var, f7nu4mc0gw);
        adDC3e2L.adDC3e2L(true);
        ia1Var.F7NU4MC0GW();
        o10Var.getClass();
        ia1Var.C0U8sNJm(fa1Var, fa1Var.IHQe1A4L2xu(o10Var));
        ia1Var.ez2rX8ReCYw();
    }
}
