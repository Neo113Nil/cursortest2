package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class u09 {
    public final sbv a;
    public final String b;
    public final Integer c;
    public final ul4 d;

    public u09(sbv sbvVar, String str, Integer num, ul4 ul4Var) {
        this.a = sbvVar;
        this.b = str;
        this.c = num;
        this.d = ul4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u09)) {
            return false;
        }
        u09 u09Var = (u09) obj;
        return this.a.equals(u09Var.a) && jl40.l(this.b, u09Var.b) && jl40.l(this.c, u09Var.c) && jl40.l(this.d, u09Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ul4 ul4Var = this.d;
        return hashCode3 + (ul4Var != null ? ul4Var.hashCode() : 0);
    }

    public final String toString() {
        return "Image(image=" + this.a + ", backgroundColor=" + this.b + ", cornerRadius=" + this.c + ", badge=" + this.d + Extension.C_BRAKE;
    }
}
