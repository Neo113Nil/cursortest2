package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.main.map.a;

/* loaded from: classes6.dex */
public final class uwt extends wwt {
    public final String a;
    public final String b;
    public final String c;
    public final sls d;
    public final a e;

    public uwt(String str, String str2, String str3, sls slsVar, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = slsVar;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uwt) {
            uwt uwtVar = (uwt) obj;
            return jl40.l(this.a, uwtVar.a) && jl40.l(this.b, uwtVar.b) && jl40.l(this.c, uwtVar.c) && this.d.equals(uwtVar.d) && this.e == uwtVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return hashCode() + nnm.a(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("Active(title=", this.a, ", acceptTitle=", this.b, ", declineTitle=");
        v.append(this.c);
        v.append(", onAccept=");
        v.append(this.d);
        v.append(", onDecline=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
