package defpackage;

/* loaded from: classes4.dex */
public final class e31 implements g31 {
    public final boolean a;

    public e31(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e31) && this.a == ((e31) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Placeholder(loading=", ")", this.a);
    }
}
