package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class rjt extends tjt {
    public final long a;
    public final String b;
    public final int c;
    public final long d;
    public final String e;

    public rjt(int i, long j, long j2, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = j2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjt)) {
            return false;
        }
        rjt rjtVar = (rjt) obj;
        return this.a == rjtVar.a && this.b.equals(rjtVar.b) && this.c == rjtVar.c && this.d == rjtVar.d && jl40.l(this.e, rjtVar.e);
    }

    public final int hashCode() {
        int c = qv10.c(oyr.b(this.c, unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder k = x4e.k("Group(id=", this.a, ", name=", this.b);
        n.A(k, ", membersCount=", this.c, ", organizationId=");
        uw51.v(this.d, ", organizationName=", this.e, k);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
