package defpackage;

/* loaded from: classes.dex */
public final class xib implements aoo {
    public final dsc a;
    public long[] c;
    public boolean d;
    public zib e;
    public boolean f;
    public int g;
    public final pt0 b = new pt0(26);
    public long h = -9223372036854775807L;

    public xib(zib zibVar, dsc dscVar, boolean z) {
        this.a = dscVar;
        this.e = zibVar;
        this.c = zibVar.b;
        a(zibVar, z);
    }

    public final void a(zib zibVar, boolean z) {
        int i = this.g;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.d = z;
        this.e = zibVar;
        long[] jArr = zibVar.b;
        this.c = jArr;
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.g = dvt.a(jArr, j2, false);
            }
        } else {
            int a = dvt.a(jArr, j3, true);
            this.g = a;
            if (this.d && a == this.c.length) {
                j = j3;
            }
            this.h = j;
        }
    }

    @Override // defpackage.aoo
    public final boolean p() {
        return true;
    }

    @Override // defpackage.aoo
    public final int q(qdc qdcVar, qg7 qg7Var, int i) {
        int i2 = this.g;
        boolean z = i2 == this.c.length;
        if (z && !this.d) {
            qg7Var.b = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.f) {
            qdcVar.c = this.a;
            this.f = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.g = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] r = this.b.r(this.e.a[i2]);
            qg7Var.B(r.length);
            qg7Var.i.put(r);
        }
        qg7Var.k = this.c[i2];
        qg7Var.b = 1;
        return -4;
    }

    @Override // defpackage.aoo
    public final int x(long j) {
        int max = Math.max(this.g, dvt.a(this.c, j, true));
        int i = max - this.g;
        this.g = max;
        return i;
    }

    @Override // defpackage.aoo
    public final void b() {
    }
}
