package defpackage;

/* loaded from: classes4.dex */
public final class q3i implements t3i {
    public final boolean a;

    public q3i(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q3i) && this.a == ((q3i) obj).a;
    }

    @Override // defpackage.t3i
    public final Object getValue() {
        return Boolean.valueOf(this.a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Boolean(value=", ")", this.a);
    }
}
