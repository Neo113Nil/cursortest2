package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class YmKjaVtbfp5Z extends m40 implements vg, ph {
    public final gh mOu10nynGul;

    public YmKjaVtbfp5Z(gh ghVar, boolean z) {
        super(z);
        z19UFEN2I((f40) ghVar.E7jCp8Ls(b9xEq24R1.VeqTn1PQw7));
        this.mOu10nynGul = ghVar.mOu10nynGul(this);
    }

    @Override // defpackage.vg
    public final void AvO7iQsrTN(Object obj) {
        Throwable GWasM1elztuh = tu0.GWasM1elztuh(obj);
        if (GWasM1elztuh != null) {
            obj = new uc(GWasM1elztuh, false);
        }
        Object J3Xc8BaqpN8 = J3Xc8BaqpN8(obj);
        if (J3Xc8BaqpN8 == p.EljAMC1QTz) {
            return;
        }
        arNh8D4Z5gB(J3Xc8BaqpN8);
    }

    @Override // defpackage.m40
    public final String EXrPz3p7hFb() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.ph
    public final gh EljAMC1QTz() {
        return this.mOu10nynGul;
    }

    @Override // defpackage.m40
    public final void Fm8W7vP7q(Object obj) {
        if (!(obj instanceof uc)) {
            SyyZR548qbcW(obj);
        } else {
            uc ucVar = (uc) obj;
            iriv6doqetn(ucVar.GWasM1elztuh, uc.Yi7zF1RB1.get(ucVar) != 0);
        }
    }

    @Override // defpackage.vg
    public final gh OOA6hdeuvCS() {
        return this.mOu10nynGul;
    }

    @Override // defpackage.m40
    public final void VeqTn1PQw7(vc vcVar) {
        rj0.pog2g9KITJA(this.mOu10nynGul, vcVar);
    }

    public final void rASgSCrgZkT7(sh shVar, YmKjaVtbfp5Z ymKjaVtbfp5Z, lv lvVar) {
        Object EljAMC1QTz;
        int ordinal = shVar.ordinal();
        kc1 kc1Var = kc1.GWasM1elztuh;
        if (ordinal == 0) {
            try {
                o30.TpUsjqg3bxO(rj0.M3K9sHhK(rj0.mE4lRynR(ymKjaVtbfp5Z, this, lvVar)), kc1Var);
                return;
            } finally {
                AvO7iQsrTN(new su0(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                lvVar.getClass();
                rj0.M3K9sHhK(rj0.mE4lRynR(ymKjaVtbfp5Z, this, lvVar)).AvO7iQsrTN(kc1Var);
                return;
            }
            if (ordinal != 3) {
                o4.xqGvceK5x();
                return;
            }
            try {
                gh ghVar = this.mOu10nynGul;
                Object M3K9sHhK = p.M3K9sHhK(ghVar, null);
                try {
                    if (lvVar instanceof h6) {
                        fb1.XnEVoBF0td1l(2, lvVar);
                        EljAMC1QTz = lvVar.EljAMC1QTz(ymKjaVtbfp5Z, this);
                    } else {
                        EljAMC1QTz = rj0.TpUsjqg3bxO(lvVar, ymKjaVtbfp5Z, this);
                    }
                    p.jivtDDk9H(ghVar, M3K9sHhK);
                    if (EljAMC1QTz != qh.OOA6hdeuvCS) {
                        AvO7iQsrTN(EljAMC1QTz);
                    }
                } catch (Throwable th) {
                    p.jivtDDk9H(ghVar, M3K9sHhK);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }

    public void SyyZR548qbcW(Object obj) {
    }

    public void iriv6doqetn(Throwable th, boolean z) {
    }
}
