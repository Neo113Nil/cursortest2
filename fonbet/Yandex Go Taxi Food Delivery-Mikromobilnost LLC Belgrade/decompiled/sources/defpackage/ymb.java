package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ymb implements cnb {
    public final String a;
    public final String b;
    public final akb c;

    public ymb(String str, String str2, akb akbVar) {
        this.a = str;
        this.b = str2;
        this.c = akbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymb)) {
            return false;
        }
        ymb ymbVar = (ymb) obj;
        return jl40.l(this.a, ymbVar.a) && jl40.l(this.b, ymbVar.b) && this.c.equals(ymbVar.c);
    }

    @Override // defpackage.cnb
    public final snb getAnalytics() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("TripGetError(tripId=", this.a, ", requestId=", this.b, ", analytics=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
