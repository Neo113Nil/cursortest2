package defpackage;

/* loaded from: classes4.dex */
public final class zsw {
    public final boolean a;

    public zsw(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zsw) && this.a == ((zsw) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("YnisonTransitionParams(playing=", ")", this.a);
    }
}
