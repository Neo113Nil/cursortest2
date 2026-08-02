package defpackage;

import java.util.Objects;

/* loaded from: classes10.dex */
public final class sa90 {
    public final Object a;
    public final Object b;

    public sa90(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static sa90 a(Integer num, Integer num2) {
        return new sa90(num, num2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sa90)) {
            return false;
        }
        sa90 sa90Var = (sa90) obj;
        return Objects.equals(sa90Var.a, this.a) && Objects.equals(sa90Var.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.a);
        sb.append(" ");
        return x4e.h(sb, this.b, "}");
    }
}
