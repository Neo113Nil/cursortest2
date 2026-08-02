package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class v1i {
    public final String a;
    public final String b;
    public final String c;

    public v1i(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1i)) {
            return false;
        }
        v1i v1iVar = (v1i) obj;
        return jl40.l(this.a, v1iVar.a) && jl40.l(this.b, v1iVar.b) && jl40.l(this.c, v1iVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(b64.v("DeliveryCostDetailsItem(title=", this.a, ", price=", this.b, ", description="), this.c, Extension.C_BRAKE);
    }
}
