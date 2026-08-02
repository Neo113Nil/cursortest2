package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class tkp0 {
    public final a5z0 a;
    public final Integer b;
    public final Integer c;

    public tkp0(a5z0 a5z0Var, Integer num, Integer num2) {
        this.a = a5z0Var;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkp0)) {
            return false;
        }
        tkp0 tkp0Var = (tkp0) obj;
        return jl40.l(this.a, tkp0Var.a) && jl40.l(this.b, tkp0Var.b) && jl40.l(this.c, tkp0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollableRowTileState(tile=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return oo31.j(sb, this.c, Extension.C_BRAKE);
    }
}
