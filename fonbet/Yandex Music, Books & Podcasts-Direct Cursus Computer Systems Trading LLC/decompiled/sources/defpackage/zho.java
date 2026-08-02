package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class zho implements nio {
    public static final int[] h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public final mio a;
    public final boolean b;
    public final int c;
    public azs d;
    public long e;
    public long f;
    public int g;

    public zho(mio mioVar) {
        this.a = mioVar;
        String str = mioVar.c.n;
        str.getClass();
        this.b = "audio/amr-wb".equals(str);
        this.c = mioVar.b;
        this.e = -9223372036854775807L;
        this.g = -1;
        this.f = 0L;
    }

    @Override // defpackage.nio
    public final void b(long j, long j2) {
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.nio
    public final void c(t2c t2cVar, int i2) {
        azs M = t2cVar.M(i2, 1);
        this.d = M;
        M.d(this.a.c);
    }

    @Override // defpackage.nio
    public final void d(long j) {
        this.e = j;
    }

    @Override // defpackage.nio
    public final void e(d7k d7kVar, long j, int i2, boolean z) {
        int a;
        vq1.B(this.d);
        int i3 = this.g;
        if (i3 != -1 && i2 != (a = kio.a(i3))) {
            int i4 = dvt.a;
            Locale locale = Locale.US;
            vq1.n0("RtpAmrReader", dfi.f("Received RTP packet with unexpected sequence number. Expected: ", a, i2, "; received: ", "."));
        }
        d7kVar.I(1);
        int e = (d7kVar.e() >> 3) & 15;
        boolean z2 = (e >= 0 && e <= 8) || e == 15;
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        boolean z3 = this.b;
        sb.append(z3 ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(e);
        vq1.u(sb.toString(), z2);
        int i5 = z3 ? i[e] : h[e];
        int a2 = d7kVar.a();
        vq1.u("compound payload not supported currently", a2 == i5);
        this.d.b(d7kVar, a2, 0);
        this.d.a(o2g.l0(this.f, j, this.c, this.e), 1, a2, 0, null);
        this.g = i2;
    }
}
