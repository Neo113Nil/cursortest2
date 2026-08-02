package defpackage;

/* loaded from: classes4.dex */
public final class dt5 {
    public final boolean a;

    public dt5(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dt5) && this.a == ((dt5) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Placeholder(isShimmer=", ")", this.a);
    }
}
