package defpackage;

/* loaded from: classes.dex */
public abstract class gs2 implements eih {
    public final long a;
    public final long b;
    public long c;

    public gs2(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = j - 1;
    }

    public final void a() {
        long j = this.c;
        if (j < this.a || j > this.b) {
            wvs.n();
        }
    }

    @Override // defpackage.eih
    public final boolean next() {
        long j = this.c + 1;
        this.c = j;
        return !(j > this.b);
    }
}
