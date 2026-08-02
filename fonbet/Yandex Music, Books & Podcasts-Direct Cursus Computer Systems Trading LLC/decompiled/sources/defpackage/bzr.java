package defpackage;

/* loaded from: classes4.dex */
public final class bzr {
    public final boolean a;
    public final boolean b;

    public bzr(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzr)) {
            return false;
        }
        bzr bzrVar = (bzr) obj;
        return this.a == bzrVar.a && this.b == bzrVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("SystemBarsIconsState(statusIconsDark=", this.a, ", navigationIconsDark=", this.b, ")");
    }
}
