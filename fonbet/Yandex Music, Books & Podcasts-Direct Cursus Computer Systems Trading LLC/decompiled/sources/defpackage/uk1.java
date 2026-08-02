package defpackage;

/* loaded from: classes4.dex */
public final class uk1 implements wk1 {
    public final boolean a;

    public uk1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uk1) && this.a == ((uk1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(3) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return vz1.q("Placeholder(isLoading=", ", count=3)", this.a);
    }
}
