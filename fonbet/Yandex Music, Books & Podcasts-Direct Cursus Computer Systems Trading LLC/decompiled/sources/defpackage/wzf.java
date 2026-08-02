package defpackage;

/* loaded from: classes3.dex */
public final class wzf {
    public final boolean a;

    public wzf(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wzf) && this.a == ((wzf) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("LikeEvent(shouldNotifyUser=", ")", this.a);
    }
}
