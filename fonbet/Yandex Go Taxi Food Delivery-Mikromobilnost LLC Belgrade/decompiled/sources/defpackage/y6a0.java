package defpackage;

/* loaded from: classes2.dex */
public final class y6a0 implements a7a0 {
    public final String a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;

    public y6a0(String str, Integer num, String str2, String str3, String str4) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6a0)) {
            return false;
        }
        y6a0 y6a0Var = (y6a0) obj;
        return jl40.l(this.a, y6a0Var.a) && jl40.l(this.b, y6a0Var.b) && jl40.l(this.c, y6a0Var.c) && jl40.l(this.d, y6a0Var.d) && jl40.l(this.e, y6a0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        return this.e.hashCode() + unr0.b((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(message=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", kind=");
        sb.append(this.d);
        sb.append(", trigger=");
        return b64.p(sb, this.e, ')');
    }
}
