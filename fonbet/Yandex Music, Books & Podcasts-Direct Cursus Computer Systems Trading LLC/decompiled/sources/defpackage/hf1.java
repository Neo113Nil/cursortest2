package defpackage;

/* loaded from: classes3.dex */
public final class hf1 implements jf1 {
    public final boolean a;

    public hf1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf1) && this.a == ((hf1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Placeholder(isLoading=", ")", this.a);
    }
}
