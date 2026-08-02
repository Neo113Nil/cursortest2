package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class m16 implements o16 {
    public final int a;
    public final List b;

    public m16(List list, int i) {
        this.a = i;
        this.b = list;
    }

    public static m16 a(m16 m16Var, int i) {
        m16Var.getClass();
        List list = m16Var.b;
        m16Var.getClass();
        return new m16(list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m16)) {
            return false;
        }
        m16 m16Var = (m16) obj;
        return this.a == m16Var.a && this.b.equals(m16Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + f1d.a(this.a, Integer.hashCode(0) * 31, 31);
    }

    public final String toString() {
        return "Loaded(initialPage=0, selectedPage=" + this.a + ", concertList=" + this.b + ")";
    }
}
