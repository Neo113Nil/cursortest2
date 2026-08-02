package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class x101 {
    public final String a;
    public final String b;
    public final String c;

    public x101(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x101)) {
            return false;
        }
        x101 x101Var = (x101) obj;
        return jl40.l(this.a, x101Var.a) && jl40.l(this.b, x101Var.b) && jl40.l(this.c, x101Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("TrackedActiveOrderModel(serviceIdentifier=", this.a, ", statusIdentifier=", this.b, ", id="), this.c, Extension.C_BRAKE);
    }
}
