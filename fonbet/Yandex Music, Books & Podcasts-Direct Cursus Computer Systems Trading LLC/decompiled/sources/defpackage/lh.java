package defpackage;

/* loaded from: classes5.dex */
public final class lh {
    public final kh a = new kh();
    public boolean b;
    public int c;
    public long d;
    public long e;

    public final void a(long j) {
        long j2 = j - this.e;
        int i = this.c;
        if (j2 < 3600000) {
            this.c = i + 1;
            return;
        }
        this.a.getClass();
        lyd lydVar = kh.c;
        lydVar.b(i);
        int i2 = (int) (j2 / 3600000);
        if (i2 > 1) {
            lydVar.a(0, i2 - 1);
        }
        this.e = (i2 * 3600000) + this.e;
        this.c = 1;
    }

    public final void b(long j) {
        long j2 = j - this.d;
        boolean z = this.b;
        kh khVar = this.a;
        if (z) {
            khVar.getClass();
            kh.a.b((int) (j2 / 1000));
        } else {
            khVar.getClass();
            kh.b.b((int) (j2 / 1000));
        }
        this.d = j;
    }
}
