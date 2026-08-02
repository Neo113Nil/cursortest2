package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class tau {
    public final String a;
    public final boolean b;

    public tau(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tau)) {
            return false;
        }
        tau tauVar = (tau) obj;
        return jl40.l(this.a, tauVar.a) && this.b == tauVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + unr0.e(this.a.hashCode() * 31, 31, true);
    }

    public final String toString() {
        return xvz.k("HeaderLogoState(imageTag=", this.a, ", smoothChanging=true, isLogoShort=", this.b, Extension.C_BRAKE);
    }
}
