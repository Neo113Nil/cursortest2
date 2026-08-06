package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class r91 extends qx0 implements Runnable {
    public final long rQPn8YBR;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r91(long j, s91 s91Var) {
        super(s91Var, r0);
        gh ghVar = s91Var.EljAMC1QTz;
        ghVar.getClass();
        this.rQPn8YBR = j;
    }

    @Override // defpackage.m40
    public final String MItybXapHX() {
        return super.MItybXapHX() + "(timeMillis=" + this.rQPn8YBR + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        o30.M3K9sHhK(this.mOu10nynGul);
        pog2g9KITJA(new q91("Timed out waiting for " + this.rQPn8YBR + " ms", this));
    }
}
