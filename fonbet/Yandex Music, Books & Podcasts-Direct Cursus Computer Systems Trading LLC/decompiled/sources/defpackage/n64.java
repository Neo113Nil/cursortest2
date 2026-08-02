package defpackage;

/* loaded from: classes4.dex */
public final class n64 {
    public final v84 a;

    public n64(v84 v84Var) {
        this.a = v84Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n64) && this.a == ((n64) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CastConfig(castTypeSupport=" + this.a + ")";
    }
}
