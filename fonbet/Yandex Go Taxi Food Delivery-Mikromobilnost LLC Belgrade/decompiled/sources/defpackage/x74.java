package defpackage;

/* loaded from: classes10.dex */
public final class x74 {
    public final m6f0 a;
    public final jdv b;

    public x74(m6f0 m6f0Var, jdv jdvVar) {
        if (m6f0Var == null) {
            ny61.t("Null processingRequest");
            throw null;
        }
        this.a = m6f0Var;
        this.b = jdvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x74)) {
            return false;
        }
        x74 x74Var = (x74) obj;
        return this.a.equals(x74Var.a) && this.b.equals(x74Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.a + ", imageProxy=" + this.b + "}";
    }
}
