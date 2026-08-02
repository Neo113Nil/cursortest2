package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class v0y0 {
    public final String a;
    public final String b;
    public final String c;

    public v0y0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0y0)) {
            return false;
        }
        v0y0 v0y0Var = (v0y0) obj;
        return jl40.l(this.a, v0y0Var.a) && jl40.l(this.b, v0y0Var.b) && jl40.l(this.c, v0y0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("KeyRecord(zoneName=", this.a, ", tariffClass=", this.b, ", offerId="), this.c, Extension.C_BRAKE);
    }
}
