package defpackage;

/* loaded from: classes.dex */
public final class hbp implements Comparable {
    public final long a;
    public final nb7 b;

    public hbp(long j, nb7 nb7Var) {
        this.a = j;
        this.b = nb7Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((hbp) obj).a;
        int i = dvt.a;
        long j2 = this.a;
        if (j2 < j) {
            return -1;
        }
        return j2 == j ? 0 : 1;
    }
}
