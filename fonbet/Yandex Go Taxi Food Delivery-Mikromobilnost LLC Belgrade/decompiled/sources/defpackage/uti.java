package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class uti {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final xz3 g;

    public uti(String str, String str2, String str3, String str4, boolean z, boolean z2, xz3 xz3Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = xz3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uti) {
            uti utiVar = (uti) obj;
            return this.a.equals(utiVar.a) && jl40.l(this.b, utiVar.b) && jl40.l(this.c, utiVar.c) && jl40.l(this.d, utiVar.d) && this.e == utiVar.e && this.f == utiVar.f && this.g == utiVar.g;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.g.hashCode() + unr0.e(unr0.e((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliveryToggleUiState(title=", this.a, ", subtitle=", this.b, ", leadImageUrl=");
        g8e.D(v, this.c, ", trailImageUrl=", this.d, ", isChecked=");
        nnm.v(", isEnabled=", ", onCheckedChange=", v, this.e, this.f);
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
