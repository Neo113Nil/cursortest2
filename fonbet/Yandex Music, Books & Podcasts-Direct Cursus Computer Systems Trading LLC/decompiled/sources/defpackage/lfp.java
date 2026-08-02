package defpackage;

/* loaded from: classes.dex */
public final class lfp implements tkd {
    public final ifp a;

    public lfp(ifp ifpVar) {
        this.a = ifpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lfp) && this.a.equals(((lfp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SemanticsModifier(configuration=" + this.a + ')';
    }
}
