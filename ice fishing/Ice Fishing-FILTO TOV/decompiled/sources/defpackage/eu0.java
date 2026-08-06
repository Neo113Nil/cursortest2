package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class eu0 implements ph, bu0 {
    public static final r9 encWxUiV2 = new r9(0);
    public volatile gh AvO7iQsrTN;
    public final eu0 EljAMC1QTz = this;
    public final gh OOA6hdeuvCS;

    public eu0(gh ghVar) {
        this.OOA6hdeuvCS = ghVar;
    }

    @Override // defpackage.ph
    public final gh EljAMC1QTz() {
        gh ghVar;
        gh ghVar2 = this.AvO7iQsrTN;
        if (ghVar2 == null || ghVar2 == encWxUiV2) {
            bf bfVar = (bf) this.OOA6hdeuvCS.E7jCp8Ls(bf.EljAMC1QTz);
            gh du0Var = bfVar != null ? new du0(bfVar, this) : vp.OOA6hdeuvCS;
            synchronized (this.EljAMC1QTz) {
                try {
                    gh ghVar3 = this.AvO7iQsrTN;
                    if (ghVar3 == null) {
                        gh ghVar4 = this.OOA6hdeuvCS;
                        ghVar = ghVar4.mOu10nynGul(new h40((f40) ghVar4.E7jCp8Ls(b9xEq24R1.VeqTn1PQw7))).mOu10nynGul(vp.OOA6hdeuvCS).mOu10nynGul(du0Var);
                    } else if (ghVar3 == encWxUiV2) {
                        gh ghVar5 = this.OOA6hdeuvCS;
                        h40 h40Var = new h40((f40) ghVar5.E7jCp8Ls(b9xEq24R1.VeqTn1PQw7));
                        h40Var.pog2g9KITJA(new uu(0));
                        ghVar = ghVar5.mOu10nynGul(h40Var).mOu10nynGul(vp.OOA6hdeuvCS).mOu10nynGul(du0Var);
                    } else {
                        ghVar = ghVar3;
                    }
                    this.AvO7iQsrTN = ghVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ghVar2 = ghVar;
        }
        ghVar2.getClass();
        return ghVar2;
    }

    public final void GWasM1elztuh() {
        synchronized (this.EljAMC1QTz) {
            try {
                gh ghVar = this.AvO7iQsrTN;
                if (ghVar == null) {
                    this.AvO7iQsrTN = encWxUiV2;
                } else {
                    uu uuVar = new uu(0);
                    f40 f40Var = (f40) ghVar.E7jCp8Ls(b9xEq24R1.VeqTn1PQw7);
                    if (f40Var != null) {
                        f40Var.GWasM1elztuh(uuVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bu0
    public final void OOA6hdeuvCS() {
        GWasM1elztuh();
    }

    @Override // defpackage.bu0
    public final void xqGvceK5x() {
        GWasM1elztuh();
    }

    @Override // defpackage.bu0
    public final void X1lG3V04pd() {
    }
}
