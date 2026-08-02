package defpackage;

/* loaded from: classes.dex */
public final class vpr implements azs {
    public final azs a;
    public final spr b;
    public upr g;
    public dsc h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = dvt.c;
    public final d7k c = new d7k();

    public vpr(azs azsVar, spr sprVar) {
        this.a = azsVar;
        this.b = sprVar;
    }

    @Override // defpackage.azs
    public final void a(long j, int i, int i2, int i3, zys zysVar) {
        if (this.g == null) {
            this.a.a(j, i, i2, i3, zysVar);
            return;
        }
        vq1.u("DRM on subtitles is not supported", zysVar == null);
        int i4 = (this.e - i3) - i2;
        try {
            this.g.i(this.f, i4, i2, tpr.c, new aj7(this, j, i));
        } catch (RuntimeException e) {
            if (!this.i) {
                throw e;
            }
            vq1.o0("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.d = i5;
        if (i5 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // defpackage.azs
    public final void b(d7k d7kVar, int i, int i2) {
        if (this.g == null) {
            this.a.b(d7kVar, i, i2);
            return;
        }
        e(i);
        d7kVar.f(this.f, this.e, i);
        this.e += i;
    }

    @Override // defpackage.azs
    public final int c(ma7 ma7Var, int i, boolean z) {
        if (this.g == null) {
            return this.a.c(ma7Var, i, z);
        }
        e(i);
        int read = ma7Var.read(this.f, this.e, i);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z) {
            return -1;
        }
        xq0.v();
        return 0;
    }

    @Override // defpackage.azs
    public final void d(dsc dscVar) {
        dscVar.n.getClass();
        String str = dscVar.n;
        vq1.v(l5i.i(str) == 3);
        boolean equals = dscVar.equals(this.h);
        spr sprVar = this.b;
        if (!equals) {
            this.h = dscVar;
            this.g = sprVar.d(dscVar) ? sprVar.f(dscVar) : null;
        }
        upr uprVar = this.g;
        azs azsVar = this.a;
        if (uprVar == null) {
            azsVar.d(dscVar);
            return;
        }
        bsc a = dscVar.a();
        a.m = l5i.p("application/x-media3-cues");
        a.j = str;
        a.r = Long.MAX_VALUE;
        a.I = sprVar.l(dscVar);
        eta.o(a, azsVar);
    }

    public final void e(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int max = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}
