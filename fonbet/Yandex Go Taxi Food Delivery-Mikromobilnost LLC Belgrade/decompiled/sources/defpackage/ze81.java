package defpackage;

import java.util.Collections;
import yads.aa2;

/* loaded from: classes7.dex */
public final class ze81 implements gz71 {
    public final String a;
    public final dl81 b;
    public final uh81 c;
    public fb81 d;
    public String e;
    public qd81 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public ze81(String str) {
        this.a = str;
        dl81 dl81Var = new dl81(1024);
        this.b = dl81Var;
        this.c = new uh81(dl81Var.a);
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.gz71
    public final void a(yg71 yg71Var, xi11 xi11Var) {
        xi11Var.a();
        xi11Var.b();
        this.d = yg71Var.l(xi11Var.d, 1);
        xi11Var.b();
        this.e = xi11Var.e;
    }

    @Override // defpackage.gz71
    public final void b() {
    }

    @Override // defpackage.gz71
    public final void c(int i, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x017c, code lost:
    
        throw new yads.aa2(null, null, true, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x018b, code lost:
    
        if (r23.l == false) goto L69;
     */
    @Override // defpackage.gz71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(dl81 dl81Var) {
        int a;
        boolean k;
        int i;
        if (this.d == null) {
            ny61.k();
            return;
        }
        while (true) {
            int i2 = dl81Var.c - dl81Var.b;
            if (i2 <= 0) {
                return;
            }
            int i3 = this.g;
            if (i3 != 0) {
                if (i3 != 1) {
                    uh81 uh81Var = this.c;
                    dl81 dl81Var2 = this.b;
                    if (i3 == 2) {
                        int s = ((this.j & (-225)) << 8) | dl81Var.s();
                        this.i = s;
                        if (s > dl81Var2.a.length) {
                            dl81Var2.i(s);
                            byte[] bArr = dl81Var2.a;
                            int length = bArr.length;
                            uh81Var.a = bArr;
                            i = 0;
                            uh81Var.b = 0;
                            uh81Var.c = 0;
                            uh81Var.d = length;
                        } else {
                            i = 0;
                        }
                        this.h = i;
                        this.g = 3;
                    } else {
                        if (i3 != 3) {
                            ny61.k();
                            return;
                        }
                        int min = Math.min(i2, this.i - this.h);
                        dl81Var.d(this.h, min, uh81Var.a);
                        int i4 = this.h + min;
                        this.h = i4;
                        if (i4 == this.i) {
                            uh81Var.f(0);
                            if (!uh81Var.k()) {
                                this.l = true;
                                int a2 = uh81Var.a(1);
                                int a3 = a2 == 1 ? uh81Var.a(1) : 0;
                                this.m = a3;
                                if (a3 != 0) {
                                    throw new aa2(null, null, true, 1);
                                }
                                if (a2 == 1) {
                                    uh81Var.a((uh81Var.a(2) + 1) * 8);
                                }
                                if (!uh81Var.k()) {
                                    throw new aa2(null, null, true, 1);
                                }
                                this.n = uh81Var.a(6);
                                int a4 = uh81Var.a(4);
                                int a5 = uh81Var.a(3);
                                if (a4 != 0 || a5 != 0) {
                                    break;
                                }
                                if (a2 == 0) {
                                    int i5 = uh81Var.i();
                                    int e = uh81Var.e();
                                    a4 a6 = vaa1.a(uh81Var, true);
                                    this.u = a6.a;
                                    this.r = a6.b;
                                    this.t = a6.c;
                                    int e2 = e - uh81Var.e();
                                    uh81Var.f(i5);
                                    byte[] bArr2 = new byte[(e2 + 7) / 8];
                                    uh81Var.d(e2, bArr2);
                                    da81 da81Var = new da81();
                                    da81Var.a = this.e;
                                    da81Var.k = "audio/mp4a-latm";
                                    da81Var.h = this.u;
                                    da81Var.x = this.t;
                                    da81Var.y = this.r;
                                    da81Var.m = Collections.singletonList(bArr2);
                                    da81Var.c = this.a;
                                    qd81 qd81Var = new qd81(da81Var);
                                    if (!qd81Var.equals(this.f)) {
                                        this.f = qd81Var;
                                        this.s = 1024000000 / qd81Var.S;
                                        this.d.k(qd81Var);
                                    }
                                } else {
                                    int e3 = uh81Var.e();
                                    a4 a7 = vaa1.a(uh81Var, true);
                                    this.u = a7.a;
                                    this.r = a7.b;
                                    this.t = a7.c;
                                    uh81Var.h(uh81Var.a((uh81Var.a(2) + 1) * 8) - (e3 - uh81Var.e()));
                                }
                                int a8 = uh81Var.a(3);
                                this.o = a8;
                                if (a8 == 0) {
                                    uh81Var.h(8);
                                } else if (a8 == 1) {
                                    uh81Var.h(9);
                                } else if (a8 == 3 || a8 == 4 || a8 == 5) {
                                    uh81Var.h(6);
                                } else {
                                    if (a8 != 6 && a8 != 7) {
                                        ny61.k();
                                        return;
                                    }
                                    uh81Var.h(1);
                                }
                                boolean k2 = uh81Var.k();
                                this.p = k2;
                                this.q = 0L;
                                if (k2) {
                                    if (a2 == 1) {
                                        this.q = uh81Var.a((uh81Var.a(2) + 1) * 8);
                                    } else {
                                        do {
                                            k = uh81Var.k();
                                            this.q = (this.q << 8) + uh81Var.a(8);
                                        } while (k);
                                    }
                                }
                                if (uh81Var.k()) {
                                    uh81Var.h(8);
                                }
                            }
                            if (this.m != 0) {
                                throw new aa2(null, null, true, 1);
                            }
                            if (this.n != 0) {
                                throw new aa2(null, null, true, 1);
                            }
                            if (this.o != 0) {
                                throw new aa2(null, null, true, 1);
                            }
                            int i6 = 0;
                            do {
                                a = uh81Var.a(8);
                                i6 += a;
                            } while (a == 255);
                            int i7 = uh81Var.i();
                            if ((i7 & 7) == 0) {
                                dl81Var2.m(i7 >> 3);
                            } else {
                                uh81Var.d(i6 * 8, dl81Var2.a);
                                dl81Var2.m(0);
                            }
                            this.d.a(i6, dl81Var2);
                            long j = this.k;
                            if (j != -9223372036854775807L) {
                                this.d.b(j, 1, i6, 0, null);
                                this.k += this.s;
                            }
                            if (this.p) {
                                uh81Var.h((int) this.q);
                            }
                            this.g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int s2 = dl81Var.s();
                    if ((s2 & 224) == 224) {
                        this.j = s2;
                        this.g = 2;
                    } else if (s2 != 86) {
                        this.g = 0;
                    }
                }
            } else if (dl81Var.s() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // defpackage.gz71
    public final void a() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }
}
