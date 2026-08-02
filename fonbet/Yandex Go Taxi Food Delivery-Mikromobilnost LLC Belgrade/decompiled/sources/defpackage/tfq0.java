package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tfq0 implements lfq0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final rbv f;

    public tfq0(String str, String str2, String str3, String str4, boolean z, rbv rbvVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = rbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfq0)) {
            return false;
        }
        tfq0 tfq0Var = (tfq0) obj;
        return jl40.l(this.a, tfq0Var.a) && jl40.l(this.b, tfq0Var.b) && jl40.l(this.c, tfq0Var.c) && jl40.l(this.d, tfq0Var.d) && this.e == tfq0Var.e && jl40.l(this.f, tfq0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int e = unr0.e((b + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        rbv rbvVar = this.f;
        return e + (rbvVar != null ? rbvVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SelectedCardEntity(cardId=", this.a, ", partnerId=", this.b, ", title=");
        g8e.D(v, this.c, ", description=", this.d, ", spoilerEnabled=");
        v.append(this.e);
        v.append(", logo=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
