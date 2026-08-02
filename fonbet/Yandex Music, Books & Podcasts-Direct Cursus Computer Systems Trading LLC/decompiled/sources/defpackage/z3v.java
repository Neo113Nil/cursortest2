package defpackage;

/* loaded from: classes4.dex */
public final class z3v implements c4v {
    public final boolean a;

    public z3v(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3v) && this.a == ((z3v) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Empty(isLoading=", ")", this.a);
    }
}
