package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yvy implements zvy {
    public final String a;
    public final boolean b;

    public yvy(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvy)) {
            return false;
        }
        yvy yvyVar = (yvy) obj;
        return jl40.l(this.a, yvyVar.a) && this.b == yvyVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("LiveLocationTogglePayload(title=", this.a, ", isChecked=", this.b, Extension.C_BRAKE);
    }
}
