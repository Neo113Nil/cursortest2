package defpackage;

/* loaded from: classes5.dex */
public final class f0u extends j0u {
    public final org a;

    public f0u(org orgVar) {
        this.a = orgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0u) && this.a.equals(((f0u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure: Unable to load log servers with " + this.a;
    }
}
