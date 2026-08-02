package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class t4r {
    public final String a;
    public final String b;
    public final String c;

    public t4r(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4r)) {
            return false;
        }
        t4r t4rVar = (t4r) obj;
        return jl40.l(this.a, t4rVar.a) && jl40.l(this.b, t4rVar.b) && this.c.equals(t4rVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("FilterItem(id=", this.a, ", name=", this.b, ", avatarUri="), this.c, Extension.C_BRAKE);
    }
}
