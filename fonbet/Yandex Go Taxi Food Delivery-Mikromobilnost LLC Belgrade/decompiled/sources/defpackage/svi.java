package defpackage;

/* loaded from: classes5.dex */
public final class svi implements uni {
    public final String a;
    public final boolean b;

    public svi(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svi)) {
            return false;
        }
        svi sviVar = (svi) obj;
        return jl40.l(this.a, sviVar.a) && this.b == sviVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + unr0.e(unr0.e(this.a.hashCode() * 31, 31, false), 31, this.b);
    }

    public final String toString() {
        return xvz.k("DeliveryWebViewArgs(url=", this.a, ", isFullscreen=false, shouldAuthorize=", this.b, ", shouldShowCloseButton=false)");
    }
}
