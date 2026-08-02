package defpackage;

/* loaded from: classes3.dex */
public final class z6c implements a7c {
    public final boolean a;

    public z6c(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z6c) && this.a == ((z6c) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Placeholder(isLoading=", ")", this.a);
    }
}
