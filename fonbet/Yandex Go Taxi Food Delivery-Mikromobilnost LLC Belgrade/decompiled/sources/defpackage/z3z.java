package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class z3z {
    public final c4z a;
    public final String b;
    public final dnm0 c;
    public final jbe d;
    public final a4z e;
    public final String f;

    public z3z(c4z c4zVar, String str, dnm0 dnm0Var, jbe jbeVar, a4z a4zVar, String str2) {
        this.a = c4zVar;
        this.b = str;
        this.c = dnm0Var;
        this.d = jbeVar;
        this.e = a4zVar;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3z)) {
            return false;
        }
        z3z z3zVar = (z3z) obj;
        return this.a.equals(z3zVar.a) && jl40.l(this.b, z3zVar.b) && this.c.equals(z3zVar.c) && this.d.equals(z3zVar.d) && this.e.equals(z3zVar.e) && jl40.l(this.f, z3zVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str2 = this.f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "LocalNotification(triggers=" + this.a + ", deeplink=" + this.b + ", schedule=" + this.c + ", contactPolicy=" + this.d + ", body=" + this.e + ", metricaContext=" + this.f + Extension.C_BRAKE;
    }
}
