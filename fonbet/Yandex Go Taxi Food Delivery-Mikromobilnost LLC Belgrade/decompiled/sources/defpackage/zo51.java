package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zo51 extends jo51 {
    public final String a;
    public final String b;
    public final String c;
    public final ief d;
    public final boolean e;

    public zo51(String str, String str2, String str3, ief iefVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = iefVar;
        this.e = z;
    }

    @Override // defpackage.lea0
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo51)) {
            return false;
        }
        zo51 zo51Var = (zo51) obj;
        if (!jl40.l(this.a, zo51Var.a)) {
            return false;
        }
        String str = zo51Var.b;
        String str2 = this.b;
        if (str2 == null) {
            if (str == null) {
                l = true;
            }
            l = false;
        } else {
            if (str != null) {
                l = jl40.l(str2, str);
            }
            l = false;
        }
        return l && jl40.l(this.c, zo51Var.c) && jl40.l(this.d, zo51Var.d) && this.e == zo51Var.e;
    }

    @Override // defpackage.lea0, defpackage.f731
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        String str = this.b;
        StringBuilder v = b64.v("YangoPayWalletPayment(id=", this.a, ", disabled=", str == null ? "null" : of91.e(str), ", moneyLeftPlaceholder=");
        v.append(this.c);
        v.append(", currencyRules=");
        v.append(this.d);
        v.append(", isComplement=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
