package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ync implements r2c {
    public final d7k a = new d7k(4);
    public final d7k b = new d7k(9);
    public final d7k c = new d7k(11);
    public final d7k d = new d7k();
    public final awo e;
    public t2c f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public py1 o;
    public ucu p;

    public ync() {
        awo awoVar = new awo(new z48());
        awoVar.b = -9223372036854775807L;
        awoVar.c = new long[0];
        awoVar.d = new long[0];
        this.e = awoVar;
        this.g = 1;
    }

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    public final d7k c(s2c s2cVar) {
        int i = this.l;
        d7k d7kVar = this.d;
        byte[] bArr = d7kVar.a;
        if (i > bArr.length) {
            d7kVar.F(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            d7kVar.H(0);
        }
        d7kVar.G(this.l);
        s2cVar.readFully(d7kVar.a, 0, this.l);
        return d7kVar;
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        d7k d7kVar = this.a;
        gm7 gm7Var = (gm7) s2cVar;
        gm7Var.l(d7kVar.a, 0, 3, false);
        d7kVar.H(0);
        if (d7kVar.y() == 4607062) {
            gm7Var.l(d7kVar.a, 0, 2, false);
            d7kVar.H(0);
            if ((d7kVar.B() & 250) == 0) {
                gm7Var.l(d7kVar.a, 0, 4, false);
                d7kVar.H(0);
                int h = d7kVar.h();
                gm7Var.f = 0;
                gm7Var.c(h, false);
                gm7Var.l(d7kVar.a, 0, 4, false);
                d7kVar.H(0);
                if (d7kVar.h() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0009 A[SYNTHETIC] */
    @Override // defpackage.r2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(s2c s2cVar, ci0 ci0Var) {
        long j;
        long j2;
        int i;
        int i2;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        vq1.B(this.f);
        while (true) {
            int i3 = this.g;
            if (i3 == 1) {
                d7k d7kVar = this.b;
                if (!s2cVar.o(d7kVar.a, 0, 9, true)) {
                    return -1;
                }
                d7kVar.H(0);
                d7kVar.I(4);
                int v = d7kVar.v();
                boolean z4 = (v & 4) != 0;
                boolean z5 = (v & 1) != 0;
                if (z4 && this.o == null) {
                    this.o = new py1(this.f.M(8, 1));
                }
                if (z5 && this.p == null) {
                    this.p = new ucu(this.f.M(9, 2));
                }
                this.f.K();
                this.j = d7kVar.h() - 5;
                this.g = 2;
            } else if (i3 == 2) {
                s2cVar.y(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i3 == 3) {
                d7k d7kVar2 = this.c;
                if (!s2cVar.o(d7kVar2.a, 0, 11, true)) {
                    return -1;
                }
                d7kVar2.H(0);
                this.k = d7kVar2.v();
                this.l = d7kVar2.y();
                this.m = d7kVar2.y();
                this.m = ((d7kVar2.v() << 24) | this.m) * 1000;
                d7kVar2.I(3);
                this.g = 4;
            } else {
                if (i3 != 4) {
                    e7o.n();
                    return 0;
                }
                boolean z6 = this.h;
                awo awoVar = this.e;
                if (z6) {
                    j = this.i + this.m;
                } else if (awoVar.b == -9223372036854775807L) {
                    j2 = 0;
                    i = this.k;
                    if (i == 8 || this.o == null) {
                        i2 = 0;
                        if (i == 9 || this.p == null) {
                            j3 = -9223372036854775807L;
                            if (i == 18 || this.n) {
                                s2cVar.y(this.l);
                                z = false;
                                z2 = false;
                            } else {
                                d7k c = c(s2cVar);
                                awoVar.getClass();
                                awoVar.getClass();
                                if (c.v() == 2 && "onMetaData".equals(awo.I(c)) && c.a() != 0 && c.v() == 8) {
                                    HashMap H = awo.H(c);
                                    Object obj = H.get("duration");
                                    double d = 1000000.0d;
                                    if (obj instanceof Double) {
                                        double doubleValue = ((Double) obj).doubleValue();
                                        if (doubleValue > 0.0d) {
                                            awoVar.b = (long) (doubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = H.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            awoVar.c = new long[size];
                                            awoVar.d = new long[size];
                                            int i4 = 0;
                                            while (i4 < size) {
                                                Object obj5 = list.get(i4);
                                                Object obj6 = list2.get(i4);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    awoVar.c = new long[0];
                                                    awoVar.d = new long[0];
                                                    break;
                                                }
                                                double d2 = d;
                                                awoVar.c[i4] = (long) (((Double) obj6).doubleValue() * d2);
                                                awoVar.d[i4] = ((Double) obj5).longValue();
                                                i4++;
                                                d = d2;
                                            }
                                        }
                                    }
                                }
                                long j4 = awoVar.b;
                                if (j4 != -9223372036854775807L) {
                                    this.f.E(new wie(j4, awoVar.d, awoVar.c));
                                    this.n = true;
                                }
                                z2 = false;
                            }
                        } else {
                            if (!this.n) {
                                this.f.E(new zg2(-9223372036854775807L));
                                this.n = true;
                            }
                            ucu ucuVar = this.p;
                            d7k c2 = c(s2cVar);
                            ucuVar.getClass();
                            int v2 = c2.v();
                            int i5 = (v2 >> 4) & 15;
                            int i6 = v2 & 15;
                            if (i6 != 7) {
                                throw new o9r(k5r.i(i6, "Video format not supported: "), 1);
                            }
                            ucuVar.g = i5;
                            if (i5 != 5) {
                                d7k d7kVar3 = ucuVar.b;
                                azs azsVar = (azs) ucuVar.a;
                                d7k d7kVar4 = ucuVar.c;
                                int v3 = c2.v();
                                byte[] bArr = c2.a;
                                int i7 = c2.b;
                                j3 = -9223372036854775807L;
                                int i8 = i7 + 1;
                                c2.b = i8;
                                int i9 = ((bArr[i7] & 255) << 24) >> 8;
                                c2.b = i7 + 2;
                                int i10 = ((bArr[i8] & 255) << 8) | i9;
                                c2.b = i7 + 3;
                                long j5 = (((bArr[r5] & 255) | i10) * 1000) + j2;
                                boolean z7 = false;
                                if (v3 == 0 && !ucuVar.e) {
                                    byte[] bArr2 = new byte[c2.a()];
                                    d7k d7kVar5 = new d7k(bArr2);
                                    c2.f(bArr2, 0, c2.a());
                                    rg2 a = rg2.a(d7kVar5);
                                    ucuVar.d = a.b;
                                    bsc bscVar = new bsc();
                                    bscVar.l = l5i.p("video/x-flv");
                                    bscVar.m = l5i.p("video/avc");
                                    bscVar.j = a.l;
                                    bscVar.t = a.c;
                                    bscVar.u = a.d;
                                    bscVar.x = a.k;
                                    bscVar.p = a.a;
                                    eta.o(bscVar, azsVar);
                                    ucuVar.e = true;
                                } else if (v3 == 1 && ucuVar.e) {
                                    int i11 = ucuVar.g == 1 ? 1 : 0;
                                    if (ucuVar.f || i11 != 0) {
                                        byte[] bArr3 = d7kVar4.a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i12 = 4 - ucuVar.d;
                                        int i13 = 0;
                                        while (c2.a() > 0) {
                                            c2.f(d7kVar4.a, i12, ucuVar.d);
                                            d7kVar4.H(0);
                                            int z8 = d7kVar4.z();
                                            d7kVar3.H(0);
                                            azsVar.b(d7kVar3, 4, 0);
                                            azsVar.b(c2, z8, 0);
                                            i13 = i13 + 4 + z8;
                                        }
                                        ((azs) ucuVar.a).a(j5, i11, i13, 0, null);
                                        ucuVar.f = true;
                                        z7 = true;
                                    }
                                }
                                if (z7) {
                                    z3 = true;
                                    z2 = z3;
                                }
                            } else {
                                j3 = -9223372036854775807L;
                            }
                            z3 = false;
                            z2 = z3;
                        }
                        z = true;
                    } else {
                        if (!this.n) {
                            this.f.E(new zg2(-9223372036854775807L));
                            this.n = true;
                        }
                        py1 py1Var = this.o;
                        d7k c3 = c(s2cVar);
                        azs azsVar2 = (azs) py1Var.a;
                        if (py1Var.b) {
                            i2 = 0;
                            c3.I(1);
                        } else {
                            int v4 = c3.v();
                            int i14 = (v4 >> 4) & 15;
                            py1Var.d = i14;
                            i2 = 0;
                            if (i14 == 2) {
                                int i15 = py1.e[(v4 >> 2) & 3];
                                bsc bscVar2 = new bsc();
                                bscVar2.l = l5i.p("video/x-flv");
                                bscVar2.m = l5i.p("audio/mpeg");
                                bscVar2.C = 1;
                                bscVar2.D = i15;
                                eta.o(bscVar2, azsVar2);
                                py1Var.c = true;
                            } else if (i14 == 7 || i14 == 8) {
                                String str = i14 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                bsc bscVar3 = new bsc();
                                bscVar3.l = l5i.p("video/x-flv");
                                bscVar3.m = l5i.p(str);
                                bscVar3.C = 1;
                                bscVar3.D = 8000;
                                eta.o(bscVar3, azsVar2);
                                py1Var.c = true;
                            } else if (i14 != 10) {
                                throw new o9r("Audio format not supported: " + py1Var.d, 1);
                            }
                            py1Var.b = true;
                        }
                        azs azsVar3 = (azs) py1Var.a;
                        z2 = false;
                        if (py1Var.d == 2) {
                            int a2 = c3.a();
                            azsVar3.b(c3, a2, 0);
                            ((azs) py1Var.a).a(j2, 1, a2, 0, null);
                        } else {
                            int v5 = c3.v();
                            if (v5 == 0 && !py1Var.c) {
                                int a3 = c3.a();
                                byte[] bArr4 = new byte[a3];
                                c3.f(bArr4, 0, a3);
                                c1 x0 = zsd.x0(new v94(bArr4, a3), false);
                                bsc bscVar4 = new bsc();
                                bscVar4.l = l5i.p("video/x-flv");
                                bscVar4.m = l5i.p("audio/mp4a-latm");
                                bscVar4.j = x0.a;
                                bscVar4.C = x0.c;
                                bscVar4.D = x0.b;
                                bscVar4.p = Collections.singletonList(bArr4);
                                eta.o(bscVar4, azsVar3);
                                py1Var.c = true;
                            } else if (py1Var.d != 10 || v5 == 1) {
                                int a4 = c3.a();
                                azsVar3.b(c3, a4, 0);
                                ((azs) py1Var.a).a(j2, 1, a4, 0, null);
                            }
                            z = true;
                            j3 = -9223372036854775807L;
                        }
                        z2 = true;
                        z = true;
                        j3 = -9223372036854775807L;
                    }
                    if (!this.h && z2) {
                        this.h = true;
                        this.i = awoVar.b != j3 ? -this.m : 0L;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (!z) {
                        return i2;
                    }
                } else {
                    j = this.m;
                }
                j2 = j;
                i = this.k;
                if (i == 8) {
                }
                i2 = 0;
                if (i == 9) {
                }
                j3 = -9223372036854775807L;
                if (i == 18) {
                }
                s2cVar.y(this.l);
                z = false;
                z2 = false;
                if (!this.h) {
                    this.h = true;
                    this.i = awoVar.b != j3 ? -this.m : 0L;
                }
                this.j = 4;
                this.g = 2;
                if (!z) {
                }
            }
        }
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        this.f = t2cVar;
    }

    @Override // defpackage.r2c
    public final void a() {
    }
}
