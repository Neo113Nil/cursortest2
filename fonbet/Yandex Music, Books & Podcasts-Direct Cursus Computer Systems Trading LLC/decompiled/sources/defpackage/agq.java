package defpackage;

/* loaded from: classes.dex */
public final class agq implements aoo {
    public final long a;
    public boolean b;
    public long c;

    public agq(long j) {
        dsc dscVar = bgq.j;
        this.a = dvt.v(2) * 2 * ((j * 44100) / 1000000);
        a(0L);
    }

    public final void a(long j) {
        dsc dscVar = bgq.j;
        this.c = dvt.j(dvt.v(2) * 2 * ((j * 44100) / 1000000), 0L, this.a);
    }

    @Override // defpackage.aoo
    public final boolean p() {
        return true;
    }

    @Override // defpackage.aoo
    public final int q(qdc qdcVar, qg7 qg7Var, int i) {
        if (!this.b || (i & 2) != 0) {
            qdcVar.c = bgq.j;
            this.b = true;
            return -5;
        }
        long j = this.c;
        long j2 = this.a - j;
        if (j2 == 0) {
            qg7Var.b(4);
            return -4;
        }
        dsc dscVar = bgq.j;
        qg7Var.k = ((j / 4) * 1000000) / 44100;
        qg7Var.b(1);
        byte[] bArr = bgq.l;
        int min = (int) Math.min(bArr.length, j2);
        if ((i & 4) == 0) {
            qg7Var.B(min);
            qg7Var.i.put(bArr, 0, min);
        }
        if ((i & 1) == 0) {
            this.c += min;
        }
        return -4;
    }

    @Override // defpackage.aoo
    public final int x(long j) {
        long j2 = this.c;
        a(j);
        return (int) ((this.c - j2) / bgq.l.length);
    }

    @Override // defpackage.aoo
    public final void b() {
    }
}
