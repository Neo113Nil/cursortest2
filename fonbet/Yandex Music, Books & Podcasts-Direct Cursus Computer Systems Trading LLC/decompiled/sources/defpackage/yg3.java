package defpackage;

import androidx.media3.extractor.FlacStreamMetadata;

/* loaded from: classes.dex */
public final class yg3 implements unj, bfi, rzt {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public yg3(long j, int i) {
        vq1.A(((l60) this.c) == null);
        this.a = j;
        this.b = j + i;
    }

    @Override // defpackage.rzt
    public cn0 A(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        return ((tzt) this.c).A(d(j), cn0Var, cn0Var2, f(j, cn0Var, cn0Var3, cn0Var2));
    }

    @Override // defpackage.rzt
    public boolean a() {
        return true;
    }

    @Override // defpackage.bfi
    public boolean b(long j, zdp zdpVar) {
        wof wofVar = (wof) ((hep) this.c).invoke();
        if (wofVar == null) {
            return false;
        }
        bfp bfpVar = (bfp) this.d;
        long j2 = this.b;
        if (!wofVar.d()) {
            return false;
        }
        lh0 lh0Var = bfpVar.f;
        if (lh0Var != null) {
            lh0Var.invoke(Boolean.FALSE, wofVar, new enj(j), zdpVar);
        }
        this.a = j;
        return cfp.a(bfpVar, j2);
    }

    @Override // defpackage.unj
    public long c(s2c s2cVar) {
        long j = this.b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.b = -1L;
        return j2;
    }

    public long d(long j) {
        long j2 = this.b;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.a;
        long j5 = j3 / j4;
        return (((jyn) this.d) == jyn.a || j5 % ((long) 2) == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    @Override // defpackage.unj
    public fap e() {
        vq1.A(this.a != -1);
        return new zg2((FlacStreamMetadata) this.c, this.a, 1);
    }

    public cn0 f(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        long j2 = this.b;
        long j3 = j + j2;
        long j4 = this.a;
        return j3 > j4 ? ((tzt) this.c).x(j4 - j2, cn0Var, cn0Var3, cn0Var2) : cn0Var2;
    }

    @Override // defpackage.unj
    public void g(long j) {
        long[] jArr = ((vgc) this.d).a;
        this.b = jArr[dvt.e(jArr, j, true)];
    }

    @Override // defpackage.bfi
    public void i() {
        dep depVar = ((bfp) this.d).h;
        if (depVar != null) {
            depVar.invoke();
        }
    }

    @Override // defpackage.bfi
    public boolean l(long j, zdp zdpVar) {
        wof wofVar = (wof) ((hep) this.c).invoke();
        if (wofVar == null) {
            return true;
        }
        bfp bfpVar = (bfp) this.d;
        long j2 = this.b;
        if (!wofVar.d() || !cfp.a(bfpVar, j2)) {
            return false;
        }
        if (!bfpVar.b(wofVar, j, this.a, zdpVar, false)) {
            return true;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.rzt
    public long m(cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.rzt
    public cn0 x(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        return ((tzt) this.c).x(d(j), cn0Var, cn0Var2, f(j, cn0Var, cn0Var3, cn0Var2));
    }

    public yg3(long j, String str, long j2, byte[] bArr) {
        this.c = str;
        this.d = bArr;
        this.a = j;
        this.b = j2;
    }
}
