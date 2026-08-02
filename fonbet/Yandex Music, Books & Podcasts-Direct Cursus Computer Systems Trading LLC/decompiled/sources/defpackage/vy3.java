package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class vy3 implements wy3 {
    public final List a;
    public final int b;

    public vy3(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy3)) {
            return false;
        }
        vy3 vy3Var = (vy3) obj;
        return this.a.equals(vy3Var.a) && this.b == vy3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(cards=" + this.a + ", currentIndex=" + this.b + ")";
    }
}
