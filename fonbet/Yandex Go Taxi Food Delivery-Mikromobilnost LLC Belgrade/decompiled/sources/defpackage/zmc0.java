package defpackage;

/* loaded from: classes2.dex */
public final class zmc0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Integer f;

    public zmc0(String str, String str2, String str3, String str4, Integer num, Integer num2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
        this.f = num2;
    }

    public final String a() {
        return this.a;
    }

    public final Integer b() {
        return this.f;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmc0)) {
            return false;
        }
        zmc0 zmc0Var = (zmc0) obj;
        return jl40.l(this.a, zmc0Var.a) && jl40.l(this.b, zmc0Var.b) && jl40.l(this.c, zmc0Var.c) && this.d.equals(zmc0Var.d) && jl40.l(this.e, zmc0Var.e) && jl40.l(this.f, zmc0Var.f);
    }

    public final Integer f() {
        return this.e;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int b = unr0.b((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.d);
        Integer num = this.e;
        int hashCode3 = (b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueImageProperty(color=");
        sb.append(this.a);
        sb.append(", metaColor=");
        sb.append(this.b);
        sb.append(", verticalAlignment=");
        sb.append(this.c);
        sb.append(", imageTag=");
        sb.append(this.d);
        sb.append(", width=");
        sb.append(this.e);
        sb.append(", height=");
        return vfc.o(sb, this.f, ')');
    }
}
