package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class w0f {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final b151 d;
    public final b151 e;

    public w0f(String str, boolean z, boolean z2, x9x0 x9x0Var, x9x0 x9x0Var2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = x9x0Var;
        this.e = x9x0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0f)) {
            return false;
        }
        w0f w0fVar = (w0f) obj;
        return jl40.l(this.a, w0fVar.a) && this.b == w0fVar.b && this.c == w0fVar.c && jl40.l(this.d, w0fVar.d) && jl40.l(this.e, w0fVar.e);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        b151 b151Var = this.d;
        int hashCode = (e + (b151Var == null ? 0 : b151Var.hashCode())) * 31;
        b151 b151Var2 = this.e;
        return hashCode + (b151Var2 != null ? b151Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("CounterState(label=", this.a, ", canDecrement=", ", canIncrement=", this.b);
        l.append(this.c);
        l.append(", incrementAction=");
        l.append(this.d);
        l.append(", decrementAction=");
        l.append(this.e);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
