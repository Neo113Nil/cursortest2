package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class o21 extends o20 {
    public volatile Object Yi7zF1RB1;

    @Override // defpackage.o20
    public final Object GWasM1elztuh(rx0 rx0Var) {
        if (this.Yi7zF1RB1 == null) {
            return super.GWasM1elztuh(rx0Var);
        }
        Object obj = this.Yi7zF1RB1;
        if (obj != null) {
            return obj;
        }
        o4.jivtDDk9H("Single instance created couldn't return value");
        return null;
    }

    @Override // defpackage.o20
    public final Object Yi7zF1RB1(rx0 rx0Var) {
        if (this.Yi7zF1RB1 == null) {
            synchronized (this) {
                if (!(this.Yi7zF1RB1 != null)) {
                    this.Yi7zF1RB1 = GWasM1elztuh(rx0Var);
                }
            }
        }
        Object obj = this.Yi7zF1RB1;
        if (obj != null) {
            return obj;
        }
        o4.jivtDDk9H("Single instance created couldn't return value");
        return null;
    }
}
