package defpackage;

/* loaded from: classes4.dex */
public final class k5k implements l5k {
    public final boolean a;

    public k5k(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5k) && this.a == ((k5k) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Success(hasShortcuts=", ")", this.a);
    }
}
