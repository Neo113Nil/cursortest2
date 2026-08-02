package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wsy0 implements sqn {
    public final String a;
    public final lzr b;
    public final int c;
    public final long d;
    public final eyr e;
    public final ldc f;

    public wsy0(String str, lzr lzrVar, int i, long j, lyy lyyVar, ldc ldcVar) {
        this.a = str;
        this.b = lzrVar;
        this.c = i;
        this.d = j;
        this.e = lyyVar;
        this.f = ldcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsy0)) {
            return false;
        }
        wsy0 wsy0Var = (wsy0) obj;
        return jl40.l(this.a, wsy0Var.a) && jl40.l(this.b, wsy0Var.b) && this.c == wsy0Var.c && sty0.a(this.d, wsy0Var.d) && jl40.l(this.e, wsy0Var.e) && jl40.l(this.f, wsy0Var.f);
    }

    public final int hashCode() {
        int b = oyr.b(this.c, ((this.a.hashCode() * 31) + this.b.a) * 31, 31);
        tty0[] tty0VarArr = sty0.b;
        int c = qv10.c(b, 31, this.d);
        eyr eyrVar = this.e;
        int hashCode = (c + (eyrVar == null ? 0 : eyrVar.hashCode())) * 31;
        ldc ldcVar = this.f;
        return hashCode + (ldcVar != null ? Long.hashCode(ldcVar.a) : 0);
    }

    public final String toString() {
        String a = hzr.a(this.c);
        String e = sty0.e(this.d);
        StringBuilder sb = new StringBuilder("TextState(text=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        g8e.D(sb, a, ", fontSize=", e, ", fontFamily=");
        sb.append(this.e);
        sb.append(", textColor=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
