package defpackage;

/* loaded from: classes3.dex */
public final class fqn implements gqn {
    public final xpn a;

    public fqn(xpn xpnVar) {
        this.a = xpnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fqn) && this.a.equals(((fqn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(session=" + this.a + ")";
    }
}
