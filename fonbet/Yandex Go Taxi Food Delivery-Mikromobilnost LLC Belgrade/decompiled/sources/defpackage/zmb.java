package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zmb implements cnb {
    public final lkb a;
    public final String b;
    public final akb c;

    public zmb(lkb lkbVar, String str, akb akbVar) {
        this.a = lkbVar;
        this.b = str;
        this.c = akbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmb)) {
            return false;
        }
        zmb zmbVar = (zmb) obj;
        return this.a.equals(zmbVar.a) && jl40.l(this.b, zmbVar.b) && this.c.equals(zmbVar.c);
    }

    @Override // defpackage.cnb
    public final snb getAnalytics() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "TripInitError(parameter=" + this.a + ", requestId=" + this.b + ", analytics=" + this.c + Extension.C_BRAKE;
    }
}
