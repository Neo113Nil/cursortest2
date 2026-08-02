package defpackage;

/* loaded from: classes4.dex */
public final class c61 implements e61 {
    public final boolean a;

    public c61(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c61) && this.a == ((c61) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Placeholder(loading=", ")", this.a);
    }
}
