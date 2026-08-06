package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class fOrlzjnNBRYQ extends defpackage.q8 implements defpackage.cz {
    public final android.graphics.Rect GE9mJIPrb8gP = new android.graphics.Rect();
    public final android.view.autofill.AutofillId Ns0WNyEWdPsk;
    public final defpackage.u31 P05cfTpS5W5L;
    public final defpackage.u QiMR8OkAhezm;
    public final defpackage.k0 WDYagTQQm9ns;
    public final java.lang.String e6mdH7fiFuta;
    public final defpackage.hn0 fNwYGHIYeJcR;
    public boolean h3m55N1URyyK;
    public final defpackage.mb1 oh71FJcDz6S2;

    public fOrlzjnNBRYQ(defpackage.k0 k0Var, defpackage.mb1 mb1Var, defpackage.u uVar, defpackage.u31 u31Var, java.lang.String str) {
        this.WDYagTQQm9ns = k0Var;
        this.oh71FJcDz6S2 = mb1Var;
        this.QiMR8OkAhezm = uVar;
        this.P05cfTpS5W5L = u31Var;
        this.e6mdH7fiFuta = str;
        uVar.setImportantForAutofill(1);
        defpackage.LCK4GGEwbWAr WmetiUbpKU9I = defpackage.b80.WmetiUbpKU9I(uVar);
        android.view.autofill.AutofillId WDYagTQQm9ns = WmetiUbpKU9I != null ? defpackage.PS16moFv2oLu.WDYagTQQm9ns(WmetiUbpKU9I.ZpBGe2uQfcn8) : null;
        if (WDYagTQQm9ns == null) {
            throw defpackage.pVQOaWB9QMo4.oh71FJcDz6S2("Required value was null.");
        }
        this.Ns0WNyEWdPsk = WDYagTQQm9ns;
        this.fNwYGHIYeJcR = new defpackage.hn0();
    }

    @Override // defpackage.cz
    public final void ZpBGe2uQfcn8(defpackage.nz nzVar, defpackage.nz nzVar2) {
        defpackage.jd0 UmgHb6n58gfG;
        defpackage.fb1 IJ0hOnjhPOri;
        defpackage.jd0 UmgHb6n58gfG2;
        defpackage.fb1 IJ0hOnjhPOri2;
        if (nzVar != null && (UmgHb6n58gfG2 = defpackage.la0.UmgHb6n58gfG(nzVar)) != null && (IJ0hOnjhPOri2 = UmgHb6n58gfG2.IJ0hOnjhPOri()) != null) {
            defpackage.yn0 yn0Var = IJ0hOnjhPOri2.WDYagTQQm9ns;
            if (yn0Var.giKS3J6vZuNy(defpackage.eb1.QiMR8OkAhezm) || yn0Var.giKS3J6vZuNy(defpackage.eb1.P05cfTpS5W5L)) {
                ((android.view.autofill.AutofillManager) this.WDYagTQQm9ns.oh71FJcDz6S2).notifyViewExited(this.QiMR8OkAhezm, UmgHb6n58gfG2.oh71FJcDz6S2);
            }
        }
        if (nzVar2 == null || (UmgHb6n58gfG = defpackage.la0.UmgHb6n58gfG(nzVar2)) == null || (IJ0hOnjhPOri = UmgHb6n58gfG.IJ0hOnjhPOri()) == null) {
            return;
        }
        defpackage.yn0 yn0Var2 = IJ0hOnjhPOri.WDYagTQQm9ns;
        if (yn0Var2.giKS3J6vZuNy(defpackage.eb1.QiMR8OkAhezm) || yn0Var2.giKS3J6vZuNy(defpackage.eb1.P05cfTpS5W5L)) {
            int i = UmgHb6n58gfG.oh71FJcDz6S2;
            this.P05cfTpS5W5L.giKS3J6vZuNy.QiMR8OkAhezm(i, new defpackage.DXtOZGT8vVUK(this, i));
        }
    }
}
