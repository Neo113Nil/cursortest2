package defpackage;

/* loaded from: classes8.dex */
public class q30 {
    public final p30 a = new p30();
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
        vku vkuVar = p30.c;
        vkuVar.b(i);
        int i2 = (int) (j2 / 3600000);
        if (i2 > 1) {
            vkuVar.a(0, i2 - 1);
        }
        this.e = (i2 * 3600000) + this.e;
        this.c = 1;
    }

    public final void b(long j) {
        long j2 = j - this.d;
        boolean z = this.b;
        p30 p30Var = this.a;
        if (z) {
            p30Var.getClass();
            p30.a.b((int) (j2 / 1000));
        } else {
            p30Var.getClass();
            p30.b.b((int) (j2 / 1000));
        }
        this.d = j;
    }
}
