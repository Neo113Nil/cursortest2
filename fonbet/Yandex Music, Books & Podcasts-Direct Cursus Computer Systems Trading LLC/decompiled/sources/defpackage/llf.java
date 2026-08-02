package defpackage;

/* loaded from: classes4.dex */
public final class llf {
    public final boolean a;
    public final boolean b;

    public llf(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llf)) {
            return false;
        }
        llf llfVar = (llf) obj;
        return this.a == llfVar.a && this.b == llfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("PlayingState(loading=", this.a, ", playing=", this.b, ")");
    }
}
