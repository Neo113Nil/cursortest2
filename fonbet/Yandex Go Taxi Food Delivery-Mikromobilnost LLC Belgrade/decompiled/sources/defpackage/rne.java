package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class rne {
    public final Integer a;
    public final Integer b;
    public final Integer c;

    public rne(Integer num, Integer num2, Integer num3) {
        this.a = num;
        this.b = num2;
        this.c = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rne)) {
            return false;
        }
        rne rneVar = (rne) obj;
        return jl40.l(this.a, rneVar.a) && jl40.l(this.b, rneVar.b) && jl40.l(this.c, rneVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CooldownCondition(code=");
        sb.append(this.a);
        sb.append(", codeRangeLower=");
        sb.append(this.b);
        sb.append(", codeRangeUpper=");
        return oo31.j(sb, this.c, Extension.C_BRAKE);
    }
}
