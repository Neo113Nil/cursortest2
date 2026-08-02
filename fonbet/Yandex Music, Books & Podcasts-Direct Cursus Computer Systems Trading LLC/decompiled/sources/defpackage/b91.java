package defpackage;

/* loaded from: classes3.dex */
public final class b91 implements d91 {
    public final boolean a;

    public b91(boolean z) {
        this.a = z;
    }

    @Override // defpackage.d91
    public final thj a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b91) && this.a == ((b91) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Placeholder(isLoading=", ")", this.a);
    }
}
