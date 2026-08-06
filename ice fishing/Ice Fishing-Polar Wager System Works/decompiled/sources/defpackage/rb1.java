package defpackage;

/* loaded from: classes.dex */
public final class rb1 extends defpackage.v60 {
    public int adDC3e2L;
    public final /* synthetic */ defpackage.qb1 xiZrDbcSW0;

    public rb1(defpackage.qb1 qb1Var) {
        this.xiZrDbcSW0 = qb1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.adDC3e2L < this.xiZrDbcSW0.adDC3e2L();
    }

    @Override // defpackage.v60
    public final int nextInt() {
        int i = this.adDC3e2L;
        this.adDC3e2L = i + 1;
        return this.xiZrDbcSW0.r1MBDhnF(i);
    }
}
