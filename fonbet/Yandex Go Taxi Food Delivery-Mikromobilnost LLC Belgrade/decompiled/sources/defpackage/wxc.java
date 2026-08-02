package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class wxc extends lea0 {
    public final String a;
    public final PaymentMethod$Type b;
    public final String c;
    public final vxc d;
    public final String e;

    public wxc(String str, PaymentMethod$Type paymentMethod$Type, String str2, vxc vxcVar, String str3) {
        this.a = str;
        this.b = paymentMethod$Type;
        this.c = str2;
        this.d = vxcVar;
        this.e = str3;
    }

    @Override // defpackage.lea0
    public final String b() {
        return this.c;
    }

    @Override // defpackage.lea0
    public final PaymentMethod$Type c() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean a;
        if (this != obj) {
            if (obj instanceof wxc) {
                wxc wxcVar = (wxc) obj;
                if (jl40.l(this.a, wxcVar.a) && this.b == wxcVar.b) {
                    String str = wxcVar.c;
                    String str2 = this.c;
                    if (str2 == null) {
                        if (str == null) {
                            a = true;
                            if (a && this.d.equals(wxcVar.d) && jl40.l(this.e, wxcVar.e)) {
                            }
                        }
                        a = false;
                        if (a) {
                        }
                    } else {
                        if (str != null) {
                            a = of91.a(str2, str);
                            if (a) {
                            }
                        }
                        a = false;
                        if (a) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.lea0, defpackage.f731
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (str == null ? 0 : of91.b(str))) * 31)) * 31);
    }

    public final String toString() {
        String str = this.c;
        String e = str == null ? "null" : of91.e(str);
        StringBuilder sb = new StringBuilder("ComplementPayment(id=");
        sb.append(this.a);
        sb.append(", paymentMethodsType=");
        sb.append(this.b);
        sb.append(", disabled=");
        sb.append(e);
        sb.append(", complementAttributes=");
        sb.append(this.d);
        sb.append(", iconTag=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
