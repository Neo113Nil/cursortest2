package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ia extends ja {
    public final Throwable GWasM1elztuh;

    public ia(Throwable th) {
        this.GWasM1elztuh = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ia) {
            return o30.rQPn8YBR(this.GWasM1elztuh, ((ia) obj).GWasM1elztuh);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.GWasM1elztuh;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.ja
    public final String toString() {
        return "Closed(" + this.GWasM1elztuh + ')';
    }
}
