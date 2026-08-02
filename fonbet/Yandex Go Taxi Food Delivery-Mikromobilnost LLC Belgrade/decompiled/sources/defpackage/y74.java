package defpackage;

/* loaded from: classes10.dex */
public final class y74 extends p7f0 {
    public final Integer a;

    public y74(Integer num) {
        this.a = num;
    }

    @Override // defpackage.p7f0
    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p7f0)) {
            return false;
        }
        p7f0 p7f0Var = (p7f0) obj;
        Integer num = this.a;
        return num == null ? p7f0Var.a() == null : num.equals(p7f0Var.a());
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return oo31.j(new StringBuilder("ProductData{productId="), this.a, "}");
    }
}
