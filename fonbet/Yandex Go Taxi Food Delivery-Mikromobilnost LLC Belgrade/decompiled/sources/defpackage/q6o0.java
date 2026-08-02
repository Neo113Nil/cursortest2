package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class q6o0 implements w201 {
    public final String a;
    public final i501 b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final zuo0 g;

    public q6o0(String str, i501 i501Var, String str2, String str3, int i, int i2, zuo0 zuo0Var) {
        this.a = str;
        this.b = i501Var;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = i2;
        this.g = zuo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6o0)) {
            return false;
        }
        q6o0 q6o0Var = (q6o0) obj;
        return jl40.l(this.a, q6o0Var.a) && jl40.l(this.b, q6o0Var.b) && jl40.l(this.c, q6o0Var.c) && jl40.l(this.d, q6o0Var.d) && this.e == q6o0Var.e && this.f == q6o0Var.f && jl40.l(this.g, q6o0Var.g);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int b = unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return this.g.hashCode() + oyr.b(this.f, oyr.b(this.e, (b + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    @Override // defpackage.w201
    public final i501 q() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScootersOrderTracking(id=");
        sb.append(this.a);
        sb.append(", cardSwipeBehaviour=");
        sb.append(this.b);
        sb.append(", title=");
        g8e.D(sb, this.c, ", subtitle=", this.d, ", titleColor=");
        vfc.u(this.e, this.f, ", subtitleColor=", ", sessionState=", sb);
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
