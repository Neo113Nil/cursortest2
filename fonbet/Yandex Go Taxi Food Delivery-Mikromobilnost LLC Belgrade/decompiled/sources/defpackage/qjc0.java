package defpackage;

/* loaded from: classes2.dex */
public final class qjc0 {
    public final String a;
    public final Integer b;
    public final double c;

    public qjc0(String str, Integer num, double d) {
        this.a = str;
        this.b = num;
        this.c = d;
    }

    public final String a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final double c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjc0)) {
            return false;
        }
        qjc0 qjc0Var = (qjc0) obj;
        return this.a.equals(qjc0Var.a) && jl40.l(this.b, qjc0Var.b) && Double.compare(this.c, qjc0Var.c) == 0;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return Double.hashCode(this.c) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueColor(color=");
        sb.append(this.a);
        sb.append(", opacity=");
        sb.append(this.b);
        sb.append(", position=");
        return unr0.q(sb, this.c, ')');
    }
}
