package defpackage;

/* loaded from: classes.dex */
public final class x94 extends ppr implements Comparable {
    public long o;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x94 x94Var = (x94) obj;
        if (f(4) != x94Var.f(4)) {
            return f(4) ? 1 : -1;
        }
        long j = this.k - x94Var.k;
        if (j == 0) {
            j = this.o - x94Var.o;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
