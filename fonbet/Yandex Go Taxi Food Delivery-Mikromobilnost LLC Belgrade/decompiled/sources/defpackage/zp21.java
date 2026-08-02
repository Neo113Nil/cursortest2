package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class zp21 {
    public final String a;
    public final String b;

    public zp21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp21)) {
            return false;
        }
        zp21 zp21Var = (zp21) obj;
        return jl40.l(this.a, zp21Var.a) && jl40.l(this.b, zp21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("UserPhoto(id=", this.a, ", status=", this.b, Extension.C_BRAKE);
    }
}
