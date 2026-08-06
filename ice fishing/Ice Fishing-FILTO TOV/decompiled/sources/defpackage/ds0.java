package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ds0 extends YmKjaVtbfp5Z implements z9, t01 {
    public final n8 JFJ3QoxA;

    public ds0(gh ghVar, n8 n8Var) {
        super(ghVar, true);
        this.JFJ3QoxA = n8Var;
    }

    @Override // defpackage.m40, defpackage.f40, defpackage.z9
    public final void GWasM1elztuh(CancellationException cancellationException) {
        Object TpUsjqg3bxO = TpUsjqg3bxO();
        if (TpUsjqg3bxO instanceof uc) {
            return;
        }
        if ((TpUsjqg3bxO instanceof l40) && ((l40) TpUsjqg3bxO).EljAMC1QTz()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new g40(EXrPz3p7hFb(), null, this);
        }
        M3K9sHhK(cancellationException);
    }

    @Override // defpackage.m40
    public final void M3K9sHhK(CancellationException cancellationException) {
        this.JFJ3QoxA.AvO7iQsrTN(cancellationException, true);
        pog2g9KITJA(cancellationException);
    }

    @Override // defpackage.YmKjaVtbfp5Z
    public final void SyyZR548qbcW(Object obj) {
        d70.E7jCp8Ls(this.JFJ3QoxA);
    }

    @Override // defpackage.t01
    public final Object X1lG3V04pd(vg vgVar, Object obj) {
        return this.JFJ3QoxA.X1lG3V04pd(vgVar, obj);
    }

    @Override // defpackage.z9
    public final Object XnEVoBF0td1l(d71 d71Var) {
        n8 n8Var = this.JFJ3QoxA;
        n8Var.getClass();
        return n8.EXrPz3p7hFb(n8Var, d71Var);
    }

    @Override // defpackage.z9
    public final Object YmKjaVtbfp5Z() {
        return this.JFJ3QoxA.YmKjaVtbfp5Z();
    }

    @Override // defpackage.YmKjaVtbfp5Z
    public final void iriv6doqetn(Throwable th, boolean z) {
        if (this.JFJ3QoxA.AvO7iQsrTN(th, false) || z) {
            return;
        }
        rj0.pog2g9KITJA(this.mOu10nynGul, th);
    }

    @Override // defpackage.z9
    public final m8 iterator() {
        n8 n8Var = this.JFJ3QoxA;
        n8Var.getClass();
        return new m8(n8Var);
    }

    @Override // defpackage.t01
    public final Object mE4lRynR(Object obj) {
        return this.JFJ3QoxA.mE4lRynR(obj);
    }
}
