package defpackage;

/* loaded from: classes6.dex */
public final class oju {
    public final int a;

    public oju(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oju) && this.a == ((oju) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "ActivityIdentity(identityHashCode=", ")");
    }
}
