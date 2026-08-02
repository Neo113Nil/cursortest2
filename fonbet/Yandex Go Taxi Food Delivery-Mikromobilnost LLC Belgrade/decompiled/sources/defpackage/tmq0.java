package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tmq0 {
    public final String a;
    public final String b;
    public final rbv c;
    public final boolean d;

    public tmq0(String str, String str2, rbv rbvVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = rbvVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmq0)) {
            return false;
        }
        tmq0 tmq0Var = (tmq0) obj;
        return jl40.l(this.a, tmq0Var.a) && jl40.l(this.b, tmq0Var.b) && this.c.equals(tmq0Var.c) && this.d == tmq0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ly3.c(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("State(id=", this.a, ", title=", this.b, ", icon=");
        v.append(this.c);
        v.append(", selected=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
