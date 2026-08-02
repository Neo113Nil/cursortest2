package defpackage;

/* loaded from: classes2.dex */
public final class qrc0 {
    public final prc0 a;
    public final Integer b;

    public qrc0(prc0 prc0Var, Integer num) {
        this.a = prc0Var;
        this.b = num;
    }

    public final Integer a() {
        return this.b;
    }

    public final prc0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrc0)) {
            return false;
        }
        qrc0 qrc0Var = (qrc0) obj;
        return this.a.equals(qrc0Var.a) && jl40.l(this.b, qrc0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueTextWidget(text=");
        sb.append(this.a);
        sb.append(", lineHeight=");
        return vfc.o(sb, this.b, ')');
    }
}
