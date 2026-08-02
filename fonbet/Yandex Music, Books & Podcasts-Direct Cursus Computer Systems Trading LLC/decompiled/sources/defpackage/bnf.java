package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public final class bnf implements q2b {
    public final String a;
    public final int b;
    public final d7k c;
    public final v94 d;
    public azs e;
    public String f;
    public dsc g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public bnf(String str, int i) {
        this.a = str;
        this.b = i;
        d7k d7kVar = new d7k(1024);
        this.c = d7kVar;
        byte[] bArr = d7kVar.a;
        this.d = new v94(bArr, bArr.length);
        this.l = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x019c, code lost:
    
        if (r23.m == false) goto L89;
     */
    @Override // defpackage.q2b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(d7k d7kVar) {
        int i;
        int i2;
        boolean h;
        vq1.B(this.e);
        while (d7kVar.a() > 0) {
            int i3 = this.h;
            if (i3 != 0) {
                if (i3 != 1) {
                    d7k d7kVar2 = this.c;
                    v94 v94Var = this.d;
                    if (i3 == 2) {
                        int v = ((this.k & (-225)) << 8) | d7kVar.v();
                        this.j = v;
                        if (v > d7kVar2.a.length) {
                            d7kVar2.E(v);
                            byte[] bArr = d7kVar2.a;
                            v94Var.getClass();
                            v94Var.o(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i3 != 3) {
                            e7o.n();
                            return;
                        }
                        int min = Math.min(d7kVar.a(), this.j - this.i);
                        d7kVar.f(v94Var.b, this.i, min);
                        int i4 = this.i + min;
                        this.i = i4;
                        if (i4 == this.j) {
                            v94Var.q(0);
                            if (!v94Var.h()) {
                                this.m = true;
                                int i5 = v94Var.i(1);
                                int i6 = i5 == 1 ? v94Var.i(1) : 0;
                                this.n = i6;
                                if (i6 != 0) {
                                    throw r7k.a(null, null);
                                }
                                if (i5 == 1) {
                                    v94Var.i((v94Var.i(2) + 1) * 8);
                                }
                                if (!v94Var.h()) {
                                    throw r7k.a(null, null);
                                }
                                this.o = v94Var.i(6);
                                int i7 = v94Var.i(4);
                                int i8 = v94Var.i(3);
                                if (i7 != 0 || i8 != 0) {
                                    throw r7k.a(null, null);
                                }
                                if (i5 == 0) {
                                    int g = v94Var.g();
                                    int b = v94Var.b();
                                    c1 x0 = zsd.x0(v94Var, true);
                                    this.v = x0.a;
                                    this.s = x0.b;
                                    this.u = x0.c;
                                    int b2 = b - v94Var.b();
                                    v94Var.q(g);
                                    byte[] bArr2 = new byte[(b2 + 7) / 8];
                                    v94Var.j(b2, bArr2);
                                    bsc bscVar = new bsc();
                                    bscVar.a = this.f;
                                    bscVar.l = l5i.p("video/mp2t");
                                    bscVar.m = l5i.p("audio/mp4a-latm");
                                    bscVar.j = this.v;
                                    bscVar.C = this.u;
                                    bscVar.D = this.s;
                                    bscVar.p = Collections.singletonList(bArr2);
                                    bscVar.d = this.a;
                                    bscVar.f = this.b;
                                    dsc dscVar = new dsc(bscVar);
                                    if (!dscVar.equals(this.g)) {
                                        this.g = dscVar;
                                        this.t = 1024000000 / dscVar.E;
                                        this.e.d(dscVar);
                                    }
                                } else {
                                    int b3 = v94Var.b();
                                    c1 x02 = zsd.x0(v94Var, true);
                                    this.v = x02.a;
                                    this.s = x02.b;
                                    this.u = x02.c;
                                    v94Var.t(v94Var.i((v94Var.i(2) + 1) * 8) - (b3 - v94Var.b()));
                                }
                                int i9 = v94Var.i(3);
                                this.p = i9;
                                if (i9 == 0) {
                                    v94Var.t(8);
                                } else if (i9 == 1) {
                                    v94Var.t(9);
                                } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                                    v94Var.t(6);
                                } else {
                                    if (i9 != 6 && i9 != 7) {
                                        e7o.n();
                                        return;
                                    }
                                    v94Var.t(1);
                                }
                                boolean h2 = v94Var.h();
                                this.q = h2;
                                this.r = 0L;
                                if (h2) {
                                    if (i5 == 1) {
                                        this.r = v94Var.i((v94Var.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            h = v94Var.h();
                                            this.r = (this.r << 8) + v94Var.i(8);
                                        } while (h);
                                    }
                                }
                                if (v94Var.h()) {
                                    v94Var.t(8);
                                }
                            }
                            if (this.n != 0) {
                                throw r7k.a(null, null);
                            }
                            if (this.o != 0) {
                                throw r7k.a(null, null);
                            }
                            if (this.p != 0) {
                                throw r7k.a(null, null);
                            }
                            int i10 = 0;
                            do {
                                i = v94Var.i(8);
                                i10 += i;
                            } while (i == 255);
                            int g2 = v94Var.g();
                            if ((g2 & 7) == 0) {
                                d7kVar2.H(g2 >> 3);
                                i2 = 0;
                            } else {
                                v94Var.j(i10 * 8, d7kVar2.a);
                                i2 = 0;
                                d7kVar2.H(0);
                            }
                            this.e.b(d7kVar2, i10, i2);
                            vq1.A(this.l != -9223372036854775807L);
                            this.e.a(this.l, 1, i10, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                v94Var.t((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int v2 = d7kVar.v();
                    if ((v2 & 224) == 224) {
                        this.k = v2;
                        this.h = 2;
                    } else if (v2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (d7kVar.v() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // defpackage.q2b
    public final void c() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // defpackage.q2b
    public final void e(t2c t2cVar, cp2 cp2Var) {
        cp2Var.g();
        cp2Var.i();
        this.e = t2cVar.M(cp2Var.c, 1);
        cp2Var.i();
        this.f = (String) cp2Var.e;
    }

    @Override // defpackage.q2b
    public final void f(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.q2b
    public final void d(boolean z) {
    }
}
