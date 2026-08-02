package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zkg {
    public final String a;
    public final String b;

    public zkg(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkg)) {
            return false;
        }
        zkg zkgVar = (zkg) obj;
        return jl40.l(this.a, zkgVar.a) && jl40.l(this.b, zkgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Color(light=", this.a, ", dark=", this.b, Extension.C_BRAKE);
    }
}
