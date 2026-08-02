package defpackage;

/* loaded from: classes4.dex */
public final class m1b implements o1b {
    public final boolean a;

    public m1b(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1b) && this.a == ((m1b) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Placeholder(isLoading=", ")", this.a);
    }
}
