package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tmb implements cnb {
    public final String a;
    public final String b;
    public final String c;
    public final akb d;

    public tmb(String str, String str2, String str3, akb akbVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = akbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmb)) {
            return false;
        }
        tmb tmbVar = (tmb) obj;
        return jl40.l(this.a, tmbVar.a) && jl40.l(this.b, tmbVar.b) && jl40.l(this.c, tmbVar.c) && this.d.equals(tmbVar.d);
    }

    @Override // defpackage.cnb
    public final snb getAnalytics() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("PaymentDeclinedError(tripId=", this.a, ", orderId=", this.b, ", requestId=");
        v.append(this.c);
        v.append(", analytics=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
