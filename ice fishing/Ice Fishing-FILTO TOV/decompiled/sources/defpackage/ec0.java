package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ec0 implements td0 {
    public td0[] GWasM1elztuh;

    @Override // defpackage.td0
    public final us0 GWasM1elztuh(Class cls) {
        for (td0 td0Var : this.GWasM1elztuh) {
            if (td0Var.Yi7zF1RB1(cls)) {
                return td0Var.GWasM1elztuh(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.td0
    public final boolean Yi7zF1RB1(Class cls) {
        for (td0 td0Var : this.GWasM1elztuh) {
            if (td0Var.Yi7zF1RB1(cls)) {
                return true;
            }
        }
        return false;
    }
}
