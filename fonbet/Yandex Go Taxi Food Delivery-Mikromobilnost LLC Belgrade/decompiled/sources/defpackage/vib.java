package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vib implements wib {
    public final String a;
    public final boolean b;

    public vib(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vib)) {
            return false;
        }
        vib vibVar = (vib) obj;
        return jl40.l(this.a, vibVar.a) && this.b == vibVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("TripToggleChange(property=", this.a, ", value=", this.b, Extension.C_BRAKE);
    }
}
