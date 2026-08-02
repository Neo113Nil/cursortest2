package defpackage;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ah2 implements r2c {
    public final d7k a;
    public final aa b;
    public final boolean c;
    public final mvt d;
    public int e;
    public t2c f;
    public bh2 g;
    public long h;
    public uk4[] i;
    public long j;
    public uk4 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public ah2(int i, mvt mvtVar) {
        this.d = mvtVar;
        this.c = (i & 1) == 0;
        this.a = new d7k(12);
        this.b = new aa();
        this.f = new d51(28);
        this.i = new uk4[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (uk4 uk4Var : this.i) {
            if (uk4Var.k == 0) {
                uk4Var.i = 0;
            } else {
                uk4Var.i = uk4Var.n[dvt.e(uk4Var.m, j, true)];
            }
        }
        if (j != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        d7k d7kVar = this.a;
        s2cVar.A(d7kVar.a, 0, 12);
        d7kVar.H(0);
        if (d7kVar.j() == 1179011410) {
            d7kVar.I(4);
            if (d7kVar.j() == 541677121) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    @Override // defpackage.r2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(s2c s2cVar, ci0 ci0Var) {
        boolean z;
        int i;
        uk4 uk4Var;
        long j;
        int i2;
        int i3;
        uk4 uk4Var2;
        int i4 = 0;
        if (this.j != -1) {
            long position = s2cVar.getPosition();
            long j2 = this.j;
            if (j2 < position || j2 > 262144 + position) {
                ci0Var.a = j2;
                z = true;
                this.j = -1L;
                if (!z) {
                    return 1;
                }
                int i5 = this.e;
                int i6 = 4;
                uk4 uk4Var3 = null;
                aa aaVar = this.b;
                int i7 = 2;
                d7k d7kVar = this.a;
                switch (i5) {
                    case 0:
                        if (!d(s2cVar)) {
                            throw r7k.a(null, "AVI Header List not found");
                        }
                        s2cVar.y(12);
                        this.e = 1;
                        return 0;
                    case 1:
                        s2cVar.readFully(d7kVar.a, 0, 12);
                        d7kVar.H(0);
                        aaVar.getClass();
                        aaVar.a = d7kVar.j();
                        aaVar.b = d7kVar.j();
                        aaVar.c = 0;
                        if (aaVar.a != 1414744396) {
                            throw r7k.a(null, "LIST expected, found: " + aaVar.a);
                        }
                        int j3 = d7kVar.j();
                        aaVar.c = j3;
                        if (j3 == 1819436136) {
                            this.l = aaVar.b;
                            this.e = 2;
                            return 0;
                        }
                        throw r7k.a(null, "hdrl expected, found: " + aaVar.c);
                    case 2:
                        int i8 = this.l - 4;
                        d7k d7kVar2 = new d7k(i8);
                        s2cVar.readFully(d7kVar2.a, 0, i8);
                        p8g b = p8g.b(1819436136, d7kVar2);
                        int i9 = b.b;
                        if (i9 != 1819436136) {
                            throw r7k.a(null, "Unexpected header list type " + i9);
                        }
                        bh2 bh2Var = (bh2) b.a(bh2.class);
                        if (bh2Var == null) {
                            throw r7k.a(null, "AviHeader not found");
                        }
                        this.g = bh2Var;
                        this.h = bh2Var.c * bh2Var.a;
                        ArrayList arrayList = new ArrayList();
                        ude listIterator = b.a.listIterator(0);
                        int i10 = 0;
                        while (listIterator.hasNext()) {
                            yg2 yg2Var = (yg2) listIterator.next();
                            if (yg2Var.getType() == 1819440243) {
                                p8g p8gVar = (p8g) yg2Var;
                                int i11 = i10 + 1;
                                ch2 ch2Var = (ch2) p8gVar.a(ch2.class);
                                ijr ijrVar = (ijr) p8gVar.a(ijr.class);
                                if (ch2Var == null) {
                                    vq1.n0("AviExtractor", "Missing Stream Header");
                                } else if (ijrVar == null) {
                                    vq1.n0("AviExtractor", "Missing Stream Format");
                                } else {
                                    i = i11;
                                    long j4 = ch2Var.c;
                                    int i12 = dvt.a;
                                    long g0 = dvt.g0(ch2Var.d, ch2Var.b * 1000000, j4, RoundingMode.DOWN);
                                    dsc dscVar = ijrVar.a;
                                    bsc a = dscVar.a();
                                    a.a = Integer.toString(i10);
                                    int i13 = ch2Var.e;
                                    if (i13 != 0) {
                                        a.n = i13;
                                    }
                                    ojr ojrVar = (ojr) p8gVar.a(ojr.class);
                                    if (ojrVar != null) {
                                        a.b = ojrVar.a;
                                    }
                                    int i14 = l5i.i(dscVar.n);
                                    if (i14 == 1 || i14 == i7) {
                                        azs M = this.f.M(i10, i14);
                                        eta.o(a, M);
                                        this.h = Math.max(this.h, g0);
                                        uk4Var = new uk4(i10, ch2Var, M);
                                        if (uk4Var != null) {
                                            arrayList.add(uk4Var);
                                        }
                                        i10 = i;
                                    }
                                    uk4Var = null;
                                    if (uk4Var != null) {
                                    }
                                    i10 = i;
                                }
                                i = i11;
                                uk4Var = null;
                                if (uk4Var != null) {
                                }
                                i10 = i;
                            }
                            i4 = 0;
                            i7 = 2;
                        }
                        int i15 = i4;
                        this.i = (uk4[]) arrayList.toArray(new uk4[i15]);
                        this.f.K();
                        this.e = 3;
                        return i15;
                    case 3:
                        if (this.m != -1) {
                            long position2 = s2cVar.getPosition();
                            long j5 = this.m;
                            if (position2 != j5) {
                                this.j = j5;
                                return 0;
                            }
                        }
                        s2cVar.A(d7kVar.a, 0, 12);
                        s2cVar.n();
                        d7kVar.H(0);
                        aaVar.getClass();
                        aaVar.a = d7kVar.j();
                        aaVar.b = d7kVar.j();
                        aaVar.c = 0;
                        int j6 = d7kVar.j();
                        int i16 = aaVar.a;
                        if (i16 == 1179011410) {
                            s2cVar.y(12);
                            return 0;
                        }
                        if (i16 != 1414744396 || j6 != 1769369453) {
                            this.j = s2cVar.getPosition() + aaVar.b + 8;
                            return 0;
                        }
                        long position3 = s2cVar.getPosition();
                        this.m = position3;
                        this.n = position3 + aaVar.b + 8;
                        if (!this.p) {
                            bh2 bh2Var2 = this.g;
                            bh2Var2.getClass();
                            if ((bh2Var2.b & 16) == 16) {
                                this.e = 4;
                                this.j = this.n;
                                return 0;
                            }
                            this.f.E(new zg2(this.h));
                            this.p = true;
                        }
                        this.j = s2cVar.getPosition() + 12;
                        this.e = 6;
                        return 0;
                    case 4:
                        s2cVar.readFully(d7kVar.a, 0, 8);
                        d7kVar.H(0);
                        int j7 = d7kVar.j();
                        int j8 = d7kVar.j();
                        if (j7 != 829973609) {
                            this.j = s2cVar.getPosition() + j8;
                            return 0;
                        }
                        this.e = 5;
                        this.o = j8;
                        return 0;
                    case 5:
                        d7k d7kVar3 = new d7k(this.o);
                        s2cVar.readFully(d7kVar3.a, 0, this.o);
                        if (d7kVar3.a() < 16) {
                            j = 0;
                        } else {
                            int i17 = d7kVar3.b;
                            d7kVar3.I(8);
                            long j9 = d7kVar3.j();
                            long j10 = this.m;
                            j = j9 > j10 ? 0L : j10 + 8;
                            d7kVar3.H(i17);
                        }
                        while (d7kVar3.a() >= 16) {
                            int j11 = d7kVar3.j();
                            int j12 = d7kVar3.j();
                            long j13 = d7kVar3.j() + j;
                            d7kVar3.I(i6);
                            uk4[] uk4VarArr = this.i;
                            int length = uk4VarArr.length;
                            while (true) {
                                if (i3 < length) {
                                    uk4Var2 = uk4VarArr[i3];
                                    i3 = (uk4Var2.c == j11 || uk4Var2.d == j11) ? 0 : i3 + 1;
                                } else {
                                    uk4Var2 = null;
                                }
                            }
                            if (uk4Var2 != null) {
                                boolean z2 = (j12 & 16) == 16;
                                if (uk4Var2.l == -1) {
                                    uk4Var2.l = j13;
                                }
                                if (z2) {
                                    if (uk4Var2.k == uk4Var2.n.length) {
                                        long[] jArr = uk4Var2.m;
                                        uk4Var2.m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr = uk4Var2.n;
                                        uk4Var2.n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                    }
                                    long[] jArr2 = uk4Var2.m;
                                    int i18 = uk4Var2.k;
                                    jArr2[i18] = j13;
                                    uk4Var2.n[i18] = uk4Var2.j;
                                    uk4Var2.k = i18 + 1;
                                }
                                uk4Var2.j++;
                            }
                            i6 = 4;
                        }
                        for (uk4 uk4Var4 : this.i) {
                            uk4Var4.m = Arrays.copyOf(uk4Var4.m, uk4Var4.k);
                            uk4Var4.n = Arrays.copyOf(uk4Var4.n, uk4Var4.k);
                            if ((uk4Var4.c & 1651965952) == 1651965952 && uk4Var4.a.f != 0 && (i2 = uk4Var4.k) > 0) {
                                uk4Var4.f = i2;
                            }
                        }
                        this.p = true;
                        int length2 = this.i.length;
                        t2c t2cVar = this.f;
                        long j14 = this.h;
                        if (length2 == 0) {
                            t2cVar.E(new zg2(j14));
                        } else {
                            t2cVar.E(new zg2(this, j14, 0));
                        }
                        this.e = 6;
                        this.j = this.m;
                        return 0;
                    case 6:
                        if (s2cVar.getPosition() >= this.n) {
                            return -1;
                        }
                        uk4 uk4Var5 = this.k;
                        if (uk4Var5 != null) {
                            int i19 = uk4Var5.h;
                            int c = i19 - uk4Var5.b.c(s2cVar, i19, false);
                            uk4Var5.h = c;
                            boolean z3 = c == 0;
                            if (z3) {
                                if (uk4Var5.g > 0) {
                                    azs azsVar = uk4Var5.b;
                                    int i20 = uk4Var5.i;
                                    azsVar.a((uk4Var5.e * i20) / uk4Var5.f, Arrays.binarySearch(uk4Var5.n, i20) >= 0 ? 1 : 0, uk4Var5.g, 0, null);
                                }
                                uk4Var5.i++;
                            }
                            if (z3) {
                                this.k = null;
                            }
                            return 0;
                        }
                        if ((s2cVar.getPosition() & 1) == 1) {
                            s2cVar.y(1);
                        }
                        s2cVar.A(d7kVar.a, 0, 12);
                        d7kVar.H(0);
                        int j15 = d7kVar.j();
                        if (j15 == 1414744396) {
                            d7kVar.H(8);
                            s2cVar.y(d7kVar.j() == 1769369453 ? 12 : 8);
                            s2cVar.n();
                            return 0;
                        }
                        int j16 = d7kVar.j();
                        if (j15 == 1263424842) {
                            this.j = s2cVar.getPosition() + j16 + 8;
                            return 0;
                        }
                        s2cVar.y(8);
                        s2cVar.n();
                        for (uk4 uk4Var6 : this.i) {
                            if (uk4Var6.c == j15 || uk4Var6.d == j15) {
                                uk4Var3 = uk4Var6;
                                if (uk4Var3 != null) {
                                    this.j = s2cVar.getPosition() + j16;
                                    return 0;
                                }
                                uk4Var3.g = j16;
                                uk4Var3.h = j16;
                                this.k = uk4Var3;
                                return 0;
                            }
                        }
                        if (uk4Var3 != null) {
                        }
                        break;
                    default:
                        wvs.b();
                        return 0;
                }
            } else {
                s2cVar.y((int) (j2 - position));
            }
        }
        z = false;
        this.j = -1L;
        if (!z) {
        }
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        this.e = 0;
        if (this.c) {
            t2cVar = new z0j(t2cVar, this.d);
        }
        this.f = t2cVar;
        this.j = -1L;
    }

    @Override // defpackage.r2c
    public final void a() {
    }
}
