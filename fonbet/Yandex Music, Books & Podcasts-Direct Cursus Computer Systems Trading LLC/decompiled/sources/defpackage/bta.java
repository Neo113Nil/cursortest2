package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class bta implements q2b {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public bta(List list) {
        this.a = 0;
        this.f = list;
        this.g = new azs[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // defpackage.q2b
    public final void b(d7k d7kVar) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (d7kVar.a() == 0) {
                            z2 = false;
                        } else {
                            if (d7kVar.v() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (d7kVar.a() == 0) {
                            z = false;
                        } else {
                            if (d7kVar.v() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                        }
                    }
                    int i = d7kVar.b;
                    int a = d7kVar.a();
                    for (azs azsVar : (azs[]) this.g) {
                        d7kVar.H(i);
                        azsVar.b(d7kVar, a, 0);
                    }
                    this.e += a;
                    break;
                }
                break;
            default:
                d7k d7kVar2 = (d7k) this.f;
                vq1.B((azs) this.g);
                if (this.b) {
                    int a2 = d7kVar.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int min = Math.min(a2, 10 - i2);
                        System.arraycopy(d7kVar.a, d7kVar.b, d7kVar2.a, this.e, min);
                        if (this.e + min == 10) {
                            d7kVar2.H(0);
                            if (73 != d7kVar2.v() || 68 != d7kVar2.v() || 51 != d7kVar2.v()) {
                                vq1.n0("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                                break;
                            } else {
                                d7kVar2.I(3);
                                this.d = d7kVar2.u() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(a2, this.d - this.e);
                    ((azs) this.g).b(d7kVar, min2, 0);
                    this.e += min2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.q2b
    public final void c() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.q2b
    public final void d(boolean z) {
        int i;
        switch (this.a) {
            case 0:
                if (this.b) {
                    vq1.A(this.c != -9223372036854775807L);
                    for (azs azsVar : (azs[]) this.g) {
                        azsVar.a(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                vq1.B((azs) this.g);
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    vq1.A(this.c != -9223372036854775807L);
                    ((azs) this.g).a(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.q2b
    public final void e(t2c t2cVar, cp2 cp2Var) {
        switch (this.a) {
            case 0:
                azs[] azsVarArr = (azs[]) this.g;
                for (int i = 0; i < azsVarArr.length; i++) {
                    fbt fbtVar = (fbt) ((List) this.f).get(i);
                    cp2Var.g();
                    cp2Var.i();
                    azs M = t2cVar.M(cp2Var.c, 3);
                    bsc bscVar = new bsc();
                    cp2Var.i();
                    bscVar.a = (String) cp2Var.e;
                    bscVar.l = l5i.p("video/mp2t");
                    bscVar.m = l5i.p("application/dvbsubs");
                    bscVar.p = Collections.singletonList(fbtVar.b);
                    bscVar.d = fbtVar.a;
                    eta.o(bscVar, M);
                    azsVarArr[i] = M;
                }
                break;
            default:
                cp2Var.g();
                cp2Var.i();
                azs M2 = t2cVar.M(cp2Var.c, 5);
                this.g = M2;
                bsc bscVar2 = new bsc();
                cp2Var.i();
                bscVar2.a = (String) cp2Var.e;
                bscVar2.l = l5i.p("video/mp2t");
                bscVar2.m = l5i.p("application/id3");
                eta.o(bscVar2, M2);
                break;
        }
    }

    @Override // defpackage.q2b
    public final void f(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    public bta() {
        this.a = 1;
        this.f = new d7k(10);
        this.c = -9223372036854775807L;
    }
}
