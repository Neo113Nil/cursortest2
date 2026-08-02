package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class qvd {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final n7v f;
    public final String g;
    public final String h;
    public final idj0 i;

    public qvd(String str, String str2, String str3, String str4, String str5, n7v n7vVar, String str6, String str7, idj0 idj0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = n7vVar;
        this.g = str6;
        this.h = str7;
        this.i = idj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvd)) {
            return false;
        }
        qvd qvdVar = (qvd) obj;
        return jl40.l(this.a, qvdVar.a) && jl40.l(this.b, qvdVar.b) && jl40.l(this.c, qvdVar.c) && jl40.l(this.d, qvdVar.d) && jl40.l(this.e, qvdVar.e) && jl40.l(this.f, qvdVar.f) && jl40.l(this.g, qvdVar.g) && jl40.l(this.h, qvdVar.h) && jl40.l(this.i, qvdVar.i);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        n7v n7vVar = this.f;
        int b2 = unr0.b(unr0.b((b + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31, 31, this.g), 31, this.h);
        idj0 idj0Var = this.i;
        return b2 + (idj0Var != null ? idj0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CompoundSelectItem(title=", this.a, ", titlePopup=", this.b, ", titleOnLabel=");
        g8e.D(v, this.c, ", description=", this.d, ", trailPlaceholder=");
        v.append(this.e);
        v.append(", icon=");
        v.append(this.f);
        v.append(", titleSelected=");
        g8e.D(v, this.g, ", cancelButton=", this.h, ", badge=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
