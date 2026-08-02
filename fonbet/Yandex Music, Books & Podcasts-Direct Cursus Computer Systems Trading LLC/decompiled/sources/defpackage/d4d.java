package defpackage;

/* loaded from: classes3.dex */
public final class d4d {
    public final boolean a;

    public d4d(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d4d) && this.a == ((d4d) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("GenerativeFeedbackResult(reloadStream=", ")", this.a);
    }
}
