package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class x6i extends a7i {
    public final jw40 a;
    public final String b;
    public final String c;

    public x6i(jw40 jw40Var, String str, String str2) {
        this.a = jw40Var;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.a7i
    public final String a() {
        return this.c;
    }

    @Override // defpackage.a7i
    public final String b() {
        return this.b;
    }

    public final jw40 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6i)) {
            return false;
        }
        x6i x6iVar = (x6i) obj;
        return jl40.l(this.a, x6iVar.a) && jl40.l(this.b, x6iVar.b) && jl40.l(this.c, x6iVar.c);
    }

    public final int hashCode() {
        jw40 jw40Var = this.a;
        return this.c.hashCode() + unr0.b((jw40Var == null ? 0 : jw40Var.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditFailed(dialog=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", deliveryId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
