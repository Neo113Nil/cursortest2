package defpackage;

/* loaded from: classes3.dex */
public final class xsp implements zsp {
    public final boolean a;

    public xsp(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsp) && this.a == ((xsp) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Available(shuffled=", ")", this.a);
    }
}
