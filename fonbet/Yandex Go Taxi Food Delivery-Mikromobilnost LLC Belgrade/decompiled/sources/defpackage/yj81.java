package defpackage;

/* loaded from: classes7.dex */
public final class yj81 implements Comparable {
    public final long a;
    public final no71 b;

    public yj81(long j, no71 no71Var) {
        this.a = j;
        this.b = no71Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((yj81) obj).a;
        int i = rf71.a;
        long j2 = this.a;
        if (j2 < j) {
            return -1;
        }
        return j2 == j ? 0 : 1;
    }
}
