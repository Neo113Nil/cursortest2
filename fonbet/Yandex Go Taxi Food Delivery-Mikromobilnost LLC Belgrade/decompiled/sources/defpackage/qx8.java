package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class qx8 implements rx8 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final cdc e;
    public final cdc f;

    public qx8(String str, String str2, String str3, boolean z, cdc cdcVar, cdc cdcVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = cdcVar;
        this.f = cdcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx8)) {
            return false;
        }
        qx8 qx8Var = (qx8) obj;
        return jl40.l(this.a, qx8Var.a) && jl40.l(this.b, qx8Var.b) && jl40.l(this.c, qx8Var.c) && this.d == qx8Var.d && this.e.equals(qx8Var.e) && this.f.equals(qx8Var.f);
    }

    @Override // defpackage.rx8
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(this.f.a) + oyr.b(this.e.a, unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31);
    }

    @Override // defpackage.rx8
    public final boolean isSelected() {
        return this.d;
    }

    @Override // defpackage.ux8
    public final String k() {
        return this.a;
    }

    @Override // defpackage.rx8
    public final cdc p() {
        return this.e;
    }

    @Override // defpackage.rx8
    public final String s() {
        return this.c;
    }

    public final String toString() {
        StringBuilder v = b64.v("Usual(requirementName=", this.a, ", title=", this.b, ", bigImageUrl=");
        tse0.y(this.c, ", isSelected=", ", buttonBgColor=", v, this.d);
        v.append(this.e);
        v.append(", buttonIconColor=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // defpackage.rx8
    public final cdc u() {
        return this.f;
    }
}
