package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class w9 implements q2b {
    public final /* synthetic */ int a;
    public final v94 b;
    public final d7k c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public azs h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public dsc m;
    public int n;
    public long o;

    public w9(int i, int i2, String str, String str2) {
        this.a = i2;
        switch (i2) {
            case 1:
                v94 v94Var = new v94(new byte[16], 16);
                this.b = v94Var;
                this.c = new d7k(v94Var.b);
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
            default:
                v94 v94Var2 = new v94(new byte[128], 128);
                this.b = v94Var2;
                this.c = new d7k(v94Var2.b);
                this.i = 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
        }
    }

    @Override // defpackage.q2b
    public final void b(d7k d7kVar) {
        switch (this.a) {
            case 0:
                vq1.B(this.h);
                while (d7kVar.a() > 0) {
                    int i = this.i;
                    d7k d7kVar2 = this.c;
                    if (i == 0) {
                        while (true) {
                            if (d7kVar.a() <= 0) {
                                break;
                            }
                            if (this.k) {
                                int v = d7kVar.v();
                                if (v == 119) {
                                    this.k = false;
                                    this.i = 1;
                                    byte[] bArr = d7kVar2.a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.j = 2;
                                } else {
                                    this.k = v == 11;
                                }
                            } else {
                                this.k = d7kVar.v() == 11;
                            }
                        }
                    } else if (i == 1) {
                        byte[] bArr2 = d7kVar2.a;
                        int min = Math.min(d7kVar.a(), 128 - this.j);
                        d7kVar.f(bArr2, this.j, min);
                        int i2 = this.j + min;
                        this.j = i2;
                        if (i2 == 128) {
                            v94 v94Var = this.b;
                            v94Var.q(0);
                            x9 G = nt0.G(v94Var);
                            int i3 = G.e;
                            int i4 = G.a;
                            int i5 = G.b;
                            String str = (String) G.f;
                            dsc dscVar = this.m;
                            if (dscVar == null || i5 != dscVar.D || i4 != dscVar.E || !Objects.equals(str, dscVar.n)) {
                                bsc bscVar = new bsc();
                                bscVar.a = this.g;
                                bscVar.l = l5i.p(this.f);
                                bscVar.m = l5i.p(str);
                                bscVar.C = i5;
                                bscVar.D = i4;
                                bscVar.d = this.d;
                                bscVar.f = this.e;
                                bscVar.i = i3;
                                if ("audio/ac3".equals(str)) {
                                    bscVar.h = i3;
                                }
                                dsc dscVar2 = new dsc(bscVar);
                                this.m = dscVar2;
                                this.h.d(dscVar2);
                            }
                            this.n = G.c;
                            this.l = (G.d * 1000000) / this.m.E;
                            d7kVar2.H(0);
                            this.h.b(d7kVar2, 128, 0);
                            this.i = 2;
                        }
                    } else if (i == 2) {
                        int min2 = Math.min(d7kVar.a(), this.n - this.j);
                        this.h.b(d7kVar, min2, 0);
                        int i6 = this.j + min2;
                        this.j = i6;
                        if (i6 == this.n) {
                            vq1.A(this.o != -9223372036854775807L);
                            this.h.a(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = 0;
                        }
                    }
                }
                break;
            default:
                vq1.B(this.h);
                while (d7kVar.a() > 0) {
                    int i7 = this.i;
                    d7k d7kVar3 = this.c;
                    if (i7 == 0) {
                        while (d7kVar.a() > 0) {
                            if (this.k) {
                                int v2 = d7kVar.v();
                                this.k = v2 == 172;
                                if (v2 == 64 || v2 == 65) {
                                    boolean z = v2 == 65;
                                    this.i = 1;
                                    byte[] bArr3 = d7kVar3.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (z ? 65 : 64);
                                    this.j = 2;
                                }
                            } else {
                                this.k = d7kVar.v() == 172;
                            }
                        }
                    } else if (i7 == 1) {
                        byte[] bArr4 = d7kVar3.a;
                        int min3 = Math.min(d7kVar.a(), 16 - this.j);
                        d7kVar.f(bArr4, this.j, min3);
                        int i8 = this.j + min3;
                        this.j = i8;
                        if (i8 == 16) {
                            v94 v94Var2 = this.b;
                            v94Var2.q(0);
                            aa O = ot0.O(v94Var2);
                            int i9 = O.a;
                            dsc dscVar3 = this.m;
                            if (dscVar3 == null || 2 != dscVar3.D || i9 != dscVar3.E || !"audio/ac4".equals(dscVar3.n)) {
                                bsc bscVar2 = new bsc();
                                bscVar2.a = this.g;
                                bscVar2.l = l5i.p(this.f);
                                bscVar2.m = l5i.p("audio/ac4");
                                bscVar2.C = 2;
                                bscVar2.D = i9;
                                bscVar2.d = this.d;
                                bscVar2.f = this.e;
                                dsc dscVar4 = new dsc(bscVar2);
                                this.m = dscVar4;
                                this.h.d(dscVar4);
                            }
                            this.n = O.b;
                            this.l = (O.c * 1000000) / this.m.E;
                            d7kVar3.H(0);
                            this.h.b(d7kVar3, 16, 0);
                            this.i = 2;
                        }
                    } else if (i7 == 2) {
                        int min4 = Math.min(d7kVar.a(), this.n - this.j);
                        this.h.b(d7kVar, min4, 0);
                        int i10 = this.j + min4;
                        this.j = i10;
                        if (i10 == this.n) {
                            vq1.A(this.o != -9223372036854775807L);
                            this.h.a(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.q2b
    public final void c() {
        switch (this.a) {
            case 0:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
            default:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.q2b
    public final void d(boolean z) {
        int i = this.a;
    }

    @Override // defpackage.q2b
    public final void e(t2c t2cVar, cp2 cp2Var) {
        switch (this.a) {
            case 0:
                cp2Var.g();
                cp2Var.i();
                this.g = (String) cp2Var.e;
                cp2Var.i();
                this.h = t2cVar.M(cp2Var.c, 1);
                break;
            default:
                cp2Var.g();
                cp2Var.i();
                this.g = (String) cp2Var.e;
                cp2Var.i();
                this.h = t2cVar.M(cp2Var.c, 1);
                break;
        }
    }

    @Override // defpackage.q2b
    public final void f(int i, long j) {
        switch (this.a) {
            case 0:
                this.o = j;
                break;
            default:
                this.o = j;
                break;
        }
    }

    private final void a(boolean z) {
    }

    private final void g(boolean z) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w9(String str) {
        this(0, 0, null, str);
        this.a = 0;
    }
}
