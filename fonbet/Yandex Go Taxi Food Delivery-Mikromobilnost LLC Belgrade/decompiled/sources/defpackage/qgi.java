package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qgi {
    public final String a;
    public final String b;
    public final boolean c;
    public final bhh d;
    public final amh e;

    public qgi(String str, String str2, boolean z, bhh bhhVar, amh amhVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = bhhVar;
        this.e = amhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qgi) {
            qgi qgiVar = (qgi) obj;
            return this.a.equals(qgiVar.a) && jl40.l(this.b, qgiVar.b) && this.c == qgiVar.c && this.d == qgiVar.d && this.e == qgiVar.e;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + unr0.e(unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, true)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliveryPaidInsuranceBadgeState(title=", this.a, ", trailText=", this.b, ", isChecked=");
        v.append(this.c);
        v.append(", isEnabled=true, onCheckedChange=");
        v.append(this.d);
        v.append(", badgeBodyClickAction=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
