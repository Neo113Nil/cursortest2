package defpackage;

/* loaded from: classes5.dex */
public final class fij extends aij {
    public final suh a;

    public fij(suh suhVar) {
        this.a = suhVar;
    }

    @Override // defpackage.aij
    public final void c(wjj wjjVar) {
        eij eijVar = new eij(wjjVar);
        wjjVar.b(eijVar);
        try {
            this.a.a(eijVar);
        } catch (Throwable th) {
            leu.a0(th);
            if (eijVar.d(th)) {
                return;
            }
            y5g.g0(th);
        }
    }
}
