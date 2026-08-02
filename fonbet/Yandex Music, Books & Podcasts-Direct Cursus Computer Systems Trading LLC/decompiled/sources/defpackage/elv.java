package defpackage;

/* loaded from: classes4.dex */
public final class elv extends flv {
    public final boolean a;

    public elv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof elv) && this.a == ((elv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Skip(isSkipPossible=", ")", this.a);
    }
}
