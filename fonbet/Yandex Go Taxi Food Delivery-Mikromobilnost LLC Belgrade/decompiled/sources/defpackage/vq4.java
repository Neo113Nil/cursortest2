package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vq4 {
    public final String a;
    public final String b;
    public final qfc c;
    public final qfc d;
    public final uq4 e;
    public final v4v f;
    public final u3b1 g;

    public vq4(String str, String str2, qfc qfcVar, qfc qfcVar2, uq4 uq4Var, v4v v4vVar, u3b1 u3b1Var) {
        this.a = str;
        this.b = str2;
        this.c = qfcVar;
        this.d = qfcVar2;
        this.e = uq4Var;
        this.f = v4vVar;
        this.g = u3b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq4)) {
            return false;
        }
        vq4 vq4Var = (vq4) obj;
        return jl40.l(this.a, vq4Var.a) && jl40.l(this.b, vq4Var.b) && jl40.l(this.c, vq4Var.c) && jl40.l(this.d, vq4Var.d) && jl40.l(this.e, vq4Var.e) && jl40.l(this.f, vq4Var.f) && jl40.l(this.g, vq4Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        qfc qfcVar = this.c;
        int hashCode3 = (hashCode2 + (qfcVar == null ? 0 : qfcVar.hashCode())) * 31;
        qfc qfcVar2 = this.d;
        int hashCode4 = (hashCode3 + (qfcVar2 == null ? 0 : qfcVar2.hashCode())) * 31;
        uq4 uq4Var = this.e;
        int hashCode5 = (hashCode4 + (uq4Var == null ? 0 : uq4Var.hashCode())) * 31;
        v4v v4vVar = this.f;
        int hashCode6 = (hashCode5 + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31;
        u3b1 u3b1Var = this.g;
        return hashCode6 + (u3b1Var != null ? u3b1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Layout(title=", this.a, ", subtitle=", this.b, ", titleColor=");
        v.append(this.c);
        v.append(", subtitleColor=");
        v.append(this.d);
        v.append(", advertisementTag=");
        v.append(this.e);
        v.append(", trailIcon=");
        v.append(this.f);
        v.append(", background=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
