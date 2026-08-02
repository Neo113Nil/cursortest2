package defpackage;

/* loaded from: classes4.dex */
public final class v5t {
    public final boolean a;
    public final boolean b;

    public v5t(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5t)) {
            return false;
        }
        v5t v5tVar = (v5t) obj;
        return this.a == v5tVar.a && this.b == v5tVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("TrailerState(isPlaying=", this.a, ", isMuted=", this.b, ")");
    }
}
