package defpackage;

/* loaded from: classes4.dex */
public final class n8k implements p8k {
    public final boolean a;

    public n8k(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8k) && this.a == ((n8k) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Track(available=", ")", this.a);
    }
}
