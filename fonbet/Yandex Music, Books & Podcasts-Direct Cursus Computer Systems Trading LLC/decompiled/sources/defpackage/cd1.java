package defpackage;

/* loaded from: classes3.dex */
public final class cd1 implements ed1 {
    public final boolean a;

    public cd1(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ed1
    public final thj a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd1) && this.a == ((cd1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Placeholder(isLoading=", ")", this.a);
    }
}
