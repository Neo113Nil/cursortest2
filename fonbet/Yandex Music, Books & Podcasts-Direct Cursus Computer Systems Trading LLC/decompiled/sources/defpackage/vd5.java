package defpackage;

/* loaded from: classes4.dex */
public final class vd5 implements xd5 {
    public final boolean a;

    public vd5(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vd5) && this.a == ((vd5) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Placeholder(loading=", ")", this.a);
    }
}
