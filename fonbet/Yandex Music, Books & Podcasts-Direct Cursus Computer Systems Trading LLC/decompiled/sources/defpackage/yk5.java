package defpackage;

/* loaded from: classes5.dex */
public final class yk5 implements hq4 {
    public final Comparable a;
    public final Comparable b;

    public yk5(Comparable comparable, Comparable comparable2) {
        this.a = comparable;
        this.b = comparable2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yk5)) {
            return false;
        }
        if (isEmpty() && ((yk5) obj).isEmpty()) {
            return true;
        }
        yk5 yk5Var = (yk5) obj;
        return this.a.equals(yk5Var.a) && this.b.equals(yk5Var.b);
    }

    @Override // defpackage.hq4
    public final Comparable g() {
        return this.a;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.hq4
    public final boolean isEmpty() {
        return this.a.compareTo(this.b) > 0;
    }

    @Override // defpackage.hq4
    public final Comparable m() {
        return this.b;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
