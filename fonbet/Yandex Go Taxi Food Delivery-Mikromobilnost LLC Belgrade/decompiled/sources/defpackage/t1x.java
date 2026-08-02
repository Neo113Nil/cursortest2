package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class t1x implements a2x {
    public static final s1x Companion = new s1x();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Integer f;

    public /* synthetic */ t1x(int i, String str, String str2, String str3, String str4, Integer num, Integer num2) {
        if (63 != (i & 63)) {
            qje.Z(i, 63, r1x.a.getDescriptor());
            throw null;
        }
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
        return this.c;
    }

    public final Integer e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1x)) {
            return false;
        }
        t1x t1xVar = (t1x) obj;
        return jl40.l(this.a, t1xVar.a) && jl40.l(this.b, t1xVar.b) && jl40.l(this.c, t1xVar.c) && jl40.l(this.d, t1xVar.d) && jl40.l(this.e, t1xVar.e) && jl40.l(this.f, t1xVar.f);
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
        StringBuilder sb = new StringBuilder("Image(color=");
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

    public t1x(String str, String str2, String str3, String str4, Integer num, Integer num2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
        this.f = num2;
    }
}
