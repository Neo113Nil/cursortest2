package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class q6o {
    public final int a;
    public final String b;
    public final String c;
    public final zrm d;

    public q6o(int i, String str, String str2, zrm zrmVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = zrmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6o)) {
            return false;
        }
        q6o q6oVar = (q6o) obj;
        return this.a == q6oVar.a && jl40.l(this.b, q6oVar.b) && jl40.l(this.c, q6oVar.c) && jl40.l(this.d, q6oVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        zrm zrmVar = this.d;
        return b + (zrmVar == null ? 0 : zrmVar.hashCode());
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "ErrorContentState(toolbarTitle=null, icon=", ", title=", this.b, ", subtitle=");
        v.append(this.c);
        v.append(", button=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
