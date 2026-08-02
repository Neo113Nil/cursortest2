package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class st8 implements ut8 {
    public final String a;
    public final String b;
    public final String c;
    public final bu8 d;

    public st8(String str, String str2, String str3, bu8 bu8Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bu8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof st8) {
            st8 st8Var = (st8) obj;
            return jl40.l(this.a, st8Var.a) && jl40.l(this.b, st8Var.b) && jl40.l(this.c, st8Var.c) && this.d == st8Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("Success(title=", this.a, ", subtitle=", this.b, ", buttonText=");
        v.append(this.c);
        v.append(", onDone=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
