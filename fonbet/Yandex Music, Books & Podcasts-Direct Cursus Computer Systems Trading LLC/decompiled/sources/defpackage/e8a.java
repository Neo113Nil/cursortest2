package defpackage;

/* loaded from: classes4.dex */
public final class e8a implements f8a {
    public final boolean a;

    public e8a(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e8a) && this.a == ((e8a) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Placeholder(isLoading=", ")", this.a);
    }
}
