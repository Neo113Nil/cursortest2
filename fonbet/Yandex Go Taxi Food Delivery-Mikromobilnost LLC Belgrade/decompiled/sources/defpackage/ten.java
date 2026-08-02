package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ten {
    public final String a;
    public final zzs b;
    public final String c;
    public final ven d;

    public ten(String str, zzs zzsVar, String str2, ven venVar) {
        this.a = str;
        this.b = zzsVar;
        this.c = str2;
        this.d = venVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ten)) {
            return false;
        }
        ten tenVar = (ten) obj;
        return jl40.l(this.a, tenVar.a) && this.b.equals(tenVar.b) && jl40.l(this.c, tenVar.c) && jl40.l(this.d, tenVar.d);
    }

    public final int hashCode() {
        int b = nnm.b(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        ven venVar = this.d;
        return hashCode + (venVar != null ? venVar.hashCode() : 0);
    }

    public final String toString() {
        return "EatsOrderCourier(orderId=" + this.a + ", location=" + this.b + ", imageTag=" + this.c + ", placemark=" + this.d + Extension.C_BRAKE;
    }
}
