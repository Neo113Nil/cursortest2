package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class x011 {
    public final String a;
    public final String b;
    public final String c;
    public final kdc d;

    public x011(kdc kdcVar, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x011)) {
            return false;
        }
        x011 x011Var = (x011) obj;
        return jl40.l(this.a, x011Var.a) && jl40.l(this.b, x011Var.b) && jl40.l(this.c, x011Var.c) && jl40.l(this.d, x011Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("TransportCardAction(text=", this.a, ", deeplink=", this.b, ", type=");
        v.append(this.c);
        v.append(", buttonColor=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
