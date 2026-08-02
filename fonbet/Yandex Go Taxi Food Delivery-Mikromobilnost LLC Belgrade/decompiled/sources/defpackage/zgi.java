package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class zgi {
    public final boolean a;
    public final ihi b;
    public final khi c;
    public final jhi d;

    public zgi(boolean z, ihi ihiVar, khi khiVar, jhi jhiVar) {
        this.a = z;
        this.b = ihiVar;
        this.c = khiVar;
        this.d = jhiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgi)) {
            return false;
        }
        zgi zgiVar = (zgi) obj;
        return this.a == zgiVar.a && this.b.equals(zgiVar.b) && this.c.equals(zgiVar.c) && this.d.equals(zgiVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DeliveryPaidInsuranceInfoModel(isEnabled=" + this.a + ", screen=" + this.b + ", summaryListItem=" + this.c + ", summaryBubble=" + this.d + Extension.C_BRAKE;
    }
}
