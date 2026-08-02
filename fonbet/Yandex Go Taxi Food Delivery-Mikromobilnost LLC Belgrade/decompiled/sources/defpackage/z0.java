package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class z0 {
    public final String a;
    public final String b;
    public final String c;
    public final r5v0 d;
    public final String e;
    public final String f;
    public final c47 g;

    public z0(String str, String str2, String str3, r5v0 r5v0Var, String str4, String str5, c47 c47Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = r5v0Var;
        this.e = str4;
        this.f = str5;
        this.g = c47Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return jl40.l(this.a, z0Var.a) && jl40.l(this.b, z0Var.b) && jl40.l(this.c, z0Var.c) && this.d.equals(z0Var.d) && jl40.l(this.e, z0Var.e) && jl40.l(this.f, z0Var.f) && this.g.equals(z0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((this.d.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31, 31, this.e);
        String str2 = this.f;
        return this.g.hashCode() + ((b + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("AIRequirementsCommentUiState(title=", this.a, ", initialInput=", this.b, ", inputHint=");
        v.append(this.c);
        v.append(", suggestListState=");
        v.append(this.d);
        v.append(", buttonDescription=");
        g8e.D(v, this.e, ", descriptionIconTag=", this.f, ", buttonState=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
