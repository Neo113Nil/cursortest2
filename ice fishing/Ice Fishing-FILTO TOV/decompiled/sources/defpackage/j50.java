package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class j50 implements bu0, jh {
    public final ug AvO7iQsrTN;
    public final lv EljAMC1QTz;
    public final gh OOA6hdeuvCS;
    public f51 encWxUiV2;

    public j50(gh ghVar, lv lvVar) {
        this.OOA6hdeuvCS = ghVar;
        this.EljAMC1QTz = lvVar;
        this.AvO7iQsrTN = fb1.X1lG3V04pd(ghVar.mOu10nynGul(this));
    }

    @Override // defpackage.gh
    public final eh E7jCp8Ls(fh fhVar) {
        return n30.arNh8D4Z5gB(this, fhVar);
    }

    @Override // defpackage.bu0
    public final void OOA6hdeuvCS() {
        f51 f51Var = this.encWxUiV2;
        if (f51Var != null) {
            f51Var.M3K9sHhK(new uu(1));
        }
        this.encWxUiV2 = null;
    }

    @Override // defpackage.gh
    public final Object WIEu4Ya2g8(lv lvVar, Object obj) {
        return lvVar.EljAMC1QTz(obj, this);
    }

    @Override // defpackage.bu0
    public final void X1lG3V04pd() {
        f51 f51Var = this.encWxUiV2;
        if (f51Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            f51Var.GWasM1elztuh(cancellationException);
        }
        this.encWxUiV2 = fb1.MZhzXH72(this.AvO7iQsrTN, null, this.EljAMC1QTz, 3);
    }

    @Override // defpackage.eh
    public final fh getKey() {
        return b9xEq24R1.pog2g9KITJA;
    }

    @Override // defpackage.gh
    public final gh jivtDDk9H(fh fhVar) {
        return n30.DmJncFq5(this, fhVar);
    }

    @Override // defpackage.gh
    public final gh mOu10nynGul(gh ghVar) {
        return n30.HFYAaqMd6(this, ghVar);
    }

    @Override // defpackage.jh
    public final void uFEq9NpZ(gh ghVar, Throwable th) {
        bf bfVar = (bf) ghVar.E7jCp8Ls(bf.EljAMC1QTz);
        if (bfVar != null) {
            p.arNh8D4Z5gB(th, new h2(2, bfVar, this));
        }
        jh jhVar = (jh) this.OOA6hdeuvCS.E7jCp8Ls(b9xEq24R1.pog2g9KITJA);
        if (jhVar == null) {
            throw th;
        }
        jhVar.uFEq9NpZ(ghVar, th);
    }

    @Override // defpackage.bu0
    public final void xqGvceK5x() {
        f51 f51Var = this.encWxUiV2;
        if (f51Var != null) {
            f51Var.M3K9sHhK(new uu(1));
        }
        this.encWxUiV2 = null;
    }
}
