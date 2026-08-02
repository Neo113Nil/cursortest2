package defpackage;

/* loaded from: classes.dex */
public final class cu6 extends jf0 {
    public final bcx q;

    public cu6(bcx bcxVar) {
        this.q = bcxVar;
    }

    @Override // defpackage.jf0
    public final int v(int i, xof xofVar, ksk kskVar, int i2) {
        int s = this.q.s(kskVar);
        if (s == Integer.MIN_VALUE) {
            return 0;
        }
        int i3 = i2 - s;
        return xofVar == xof.b ? i - i3 : i3;
    }

    @Override // defpackage.jf0
    public final Integer x(ksk kskVar) {
        return Integer.valueOf(this.q.s(kskVar));
    }
}
