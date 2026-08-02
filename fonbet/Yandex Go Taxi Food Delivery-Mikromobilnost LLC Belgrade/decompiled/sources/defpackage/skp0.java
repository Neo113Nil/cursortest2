package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class skp0 {
    public final y4z0 a;
    public final Integer b;
    public final Integer c;

    public skp0(y4z0 y4z0Var, Integer num, Integer num2) {
        this.a = y4z0Var;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skp0)) {
            return false;
        }
        skp0 skp0Var = (skp0) obj;
        return this.a.equals(skp0Var.a) && jl40.l(this.b, skp0Var.b) && jl40.l(this.c, skp0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollableRowTileModel(tile=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return oo31.j(sb, this.c, Extension.C_BRAKE);
    }
}
