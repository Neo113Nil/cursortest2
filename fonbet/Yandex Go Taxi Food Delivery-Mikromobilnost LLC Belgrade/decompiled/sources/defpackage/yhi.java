package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class yhi extends lea0 {
    public final String a;
    public final String b;
    public final xhi c;
    public final String d;

    public yhi(String str, String str2, xhi xhiVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = xhiVar;
        this.d = str3;
    }

    @Override // defpackage.lea0
    public final String b() {
        return this.b;
    }

    @Override // defpackage.lea0
    public final PaymentMethod$Type c() {
        return PaymentMethod$Type.CARGO_CORP;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof yhi) {
                yhi yhiVar = (yhi) obj;
                if (jl40.l(this.a, yhiVar.a)) {
                    String str = yhiVar.b;
                    String str2 = this.b;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals && this.c.equals(yhiVar.c) && jl40.l(this.d, yhiVar.d)) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (str != null) {
                            equals = str2.equals(str);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final xhi f() {
        return this.c;
    }

    @Override // defpackage.lea0, defpackage.f731
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        String str = this.b;
        StringBuilder v = b64.v("DeliveryPayment(id=", this.a, ", disabled=", str == null ? "null" : of91.e(str), ", display=");
        v.append(this.c);
        v.append(", clientTypeCode=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
