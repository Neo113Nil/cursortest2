package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class hc1 extends qx0 {
    public final ThreadLocal rQPn8YBR;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hc1(vg vgVar, gh ghVar) {
        super(vgVar, ghVar.E7jCp8Ls(r0) == null ? ghVar.mOu10nynGul(r0) : ghVar);
        r9 r9Var = r9.AvO7iQsrTN;
        this.rQPn8YBR = new ThreadLocal();
        if (vgVar.OOA6hdeuvCS().E7jCp8Ls(b9xEq24R1.arNh8D4Z5gB) instanceof ih) {
            return;
        }
        Object M3K9sHhK = p.M3K9sHhK(ghVar, null);
        p.jivtDDk9H(ghVar, M3K9sHhK);
        jed7WnvkLvFq(ghVar, M3K9sHhK);
    }

    public final boolean JB4pnjMK() {
        boolean z = this.threadLocalIsSet && this.rQPn8YBR.get() == null;
        this.rQPn8YBR.remove();
        return !z;
    }

    @Override // defpackage.qx0, defpackage.m40
    public final void arNh8D4Z5gB(Object obj) {
        if (this.threadLocalIsSet) {
            rn0 rn0Var = (rn0) this.rQPn8YBR.get();
            if (rn0Var != null) {
                p.jivtDDk9H((gh) rn0Var.OOA6hdeuvCS, rn0Var.EljAMC1QTz);
            }
            this.rQPn8YBR.remove();
        }
        Object ozMwhSAI = vc0.ozMwhSAI(obj);
        vg vgVar = this.JFJ3QoxA;
        gh OOA6hdeuvCS = vgVar.OOA6hdeuvCS();
        Object M3K9sHhK = p.M3K9sHhK(OOA6hdeuvCS, null);
        hc1 qugwajBSa59j = M3K9sHhK != p.EXrPz3p7hFb ? o30.qugwajBSa59j(vgVar, OOA6hdeuvCS, M3K9sHhK) : null;
        try {
            this.JFJ3QoxA.AvO7iQsrTN(ozMwhSAI);
            if (qugwajBSa59j == null || qugwajBSa59j.JB4pnjMK()) {
                p.jivtDDk9H(OOA6hdeuvCS, M3K9sHhK);
            }
        } catch (Throwable th) {
            if (qugwajBSa59j == null || qugwajBSa59j.JB4pnjMK()) {
                p.jivtDDk9H(OOA6hdeuvCS, M3K9sHhK);
            }
            throw th;
        }
    }

    public final void jed7WnvkLvFq(gh ghVar, Object obj) {
        this.threadLocalIsSet = true;
        this.rQPn8YBR.set(new rn0(ghVar, obj));
    }
}
