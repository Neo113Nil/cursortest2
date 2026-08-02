package defpackage;

/* loaded from: classes4.dex */
public final class blv extends flv {
    public final boolean a;

    public blv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof blv) && this.a == ((blv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Prev(isPrevPossible=", ")", this.a);
    }
}
