package defpackage;

/* loaded from: classes3.dex */
public final class zi1 implements fj1 {
    public final boolean a;

    public zi1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zi1) && this.a == ((zi1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Error(offlineMode=", ")", this.a);
    }
}
