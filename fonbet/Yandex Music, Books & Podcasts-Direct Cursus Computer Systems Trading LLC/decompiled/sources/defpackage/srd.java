package defpackage;

/* loaded from: classes.dex */
public final class srd {
    public final azs a;
    public long b;
    public boolean c;
    public int d;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public boolean m;

    public srd(azs azsVar) {
        this.a = azsVar;
    }

    public final void a(int i) {
        long j = this.l;
        if (j != -9223372036854775807L) {
            long j2 = this.b;
            long j3 = this.k;
            if (j2 == j3) {
                return;
            }
            int i2 = (int) (j2 - j3);
            this.a.a(j, this.m ? 1 : 0, i2, i, null);
        }
    }
}
