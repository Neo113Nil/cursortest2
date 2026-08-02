package defpackage;

import defpackage.ms30;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class zt30 {
    public final String a;
    public final ms30.a b;
    public final MtTransportType c;
    public final kdc d;
    public final rr30 e;
    public final String f;

    public zt30(String str, ms30.a aVar, MtTransportType mtTransportType, kdc kdcVar, rr30 rr30Var, String str2) {
        this.a = str;
        this.b = aVar;
        this.c = mtTransportType;
        this.d = kdcVar;
        this.e = rr30Var;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt30)) {
            return false;
        }
        zt30 zt30Var = (zt30) obj;
        return jl40.l(this.a, zt30Var.a) && jl40.l(this.b, zt30Var.b) && this.c == zt30Var.c && jl40.l(this.d, zt30Var.d) && jl40.l(this.e, zt30Var.e) && jl40.l(this.f, zt30Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        kdc kdcVar = this.d;
        int hashCode2 = (hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        rr30 rr30Var = this.e;
        int hashCode3 = (hashCode2 + (rr30Var == null ? 0 : rr30Var.hashCode())) * 31;
        String str = this.f;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MatchedContent(id=" + this.a + ", content=" + this.b + ", transportType=" + this.c + ", transportColor=" + this.d + ", iconBackgroundColor=" + this.e + ", deeplink=" + this.f + Extension.C_BRAKE;
    }
}
