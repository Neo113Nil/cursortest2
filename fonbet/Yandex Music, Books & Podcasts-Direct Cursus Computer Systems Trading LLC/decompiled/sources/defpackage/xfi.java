package defpackage;

import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xfi implements r2c, fap {
    public wfi[] A;
    public long[][] B;
    public int C;
    public long D;
    public int E;
    public uei F;
    public final spr a;
    public final int b;
    public final d7k c;
    public final d7k d;
    public final d7k e;
    public final d7k f;
    public final ArrayDeque g;
    public final wap h;
    public final ArrayList i;
    public qsn j;
    public int k;
    public int l;
    public long m;
    public int n;
    public d7k o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public long w;
    public boolean x;
    public long y;
    public t2c z;

    public xfi(spr sprVar, int i) {
        this.a = sprVar;
        this.b = i;
        ude udeVar = yde.b;
        this.j = qsn.e;
        this.k = (i & 4) != 0 ? 3 : 0;
        this.h = new wap();
        this.i = new ArrayList();
        this.f = new d7k(16);
        this.g = new ArrayDeque();
        this.c = new d7k(zc4.h);
        this.d = new d7k(6);
        this.e = new d7k();
        this.p = -1;
        this.z = t2c.g0;
        this.A = new wfi[0];
    }

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        this.g.clear();
        this.n = 0;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        if (j == 0) {
            if (this.k != 3) {
                this.k = 0;
                this.n = 0;
                return;
            } else {
                wap wapVar = this.h;
                wapVar.a.clear();
                wapVar.b = 0;
                this.i.clear();
                return;
            }
        }
        for (wfi wfiVar : this.A) {
            o0t o0tVar = wfiVar.b;
            int e = dvt.e(o0tVar.f, j2, false);
            while (true) {
                if (e < 0) {
                    e = -1;
                    break;
                } else if ((o0tVar.g[e] & 1) != 0) {
                    break;
                } else {
                    e--;
                }
            }
            if (e == -1) {
                e = o0tVar.a(j2);
            }
            wfiVar.e = e;
            wat watVar = wfiVar.d;
            if (watVar != null) {
                watVar.b = false;
                watVar.c = 0;
            }
        }
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        qsn qsnVar;
        x2r Z = leu.Z(s2cVar, false, (this.b & 2) != 0);
        if (Z != null) {
            qsnVar = yde.y(Z);
        } else {
            ude udeVar = yde.b;
            qsnVar = qsn.e;
        }
        this.j = qsnVar;
        return Z == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4 A[EDGE_INSN: B:70:0x00e4->B:71:0x00e4 BREAK  A[LOOP:1: B:29:0x006b->B:58:0x00e0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    @Override // defpackage.fap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final eap e(long j) {
        long j2;
        long j3;
        long j4;
        int i;
        wfi[] wfiVarArr;
        int i2;
        int i3;
        long j5;
        int a;
        wfi[] wfiVarArr2 = this.A;
        int length = wfiVarArr2.length;
        iap iapVar = iap.c;
        if (length == 0) {
            return new eap(iapVar, iapVar);
        }
        int i4 = this.C;
        boolean z = false;
        int i5 = -1;
        long j6 = -1;
        if (i4 != -1) {
            o0t o0tVar = wfiVarArr2[i4].b;
            long[] jArr = o0tVar.f;
            int e = dvt.e(jArr, j, false);
            while (true) {
                if (e < 0) {
                    e = -1;
                    break;
                }
                if ((o0tVar.g[e] & 1) != 0) {
                    break;
                }
                e--;
            }
            if (e == -1) {
                e = o0tVar.a(j);
            }
            long[] jArr2 = o0tVar.c;
            if (e == -1) {
                return new eap(iapVar, iapVar);
            }
            j3 = jArr[e];
            j2 = jArr2[e];
            if (j3 < j && e < o0tVar.b - 1 && (a = o0tVar.a(j)) != -1 && a != e) {
                j4 = jArr[a];
                j6 = jArr2[a];
                i = 0;
                long j7 = j2;
                while (true) {
                    wfiVarArr = this.A;
                    if (i < wfiVarArr.length) {
                        break;
                    }
                    if (i != this.C) {
                        o0t o0tVar2 = wfiVarArr[i].b;
                        long[] jArr3 = o0tVar2.c;
                        int[] iArr = o0tVar2.g;
                        long[] jArr4 = o0tVar2.f;
                        int e2 = dvt.e(jArr4, j3, z);
                        while (true) {
                            if (e2 < 0) {
                                i3 = i5;
                                break;
                            }
                            if ((iArr[e2] & 1) != 0) {
                                i3 = e2;
                                break;
                            }
                            e2--;
                        }
                        if (i3 == i5) {
                            i3 = o0tVar2.a(j3);
                        }
                        if (i3 == i5) {
                            j5 = j6;
                        } else {
                            j5 = j6;
                            j7 = Math.min(jArr3[i3], j7);
                        }
                        if (j4 != -9223372036854775807L) {
                            z = false;
                            int e3 = dvt.e(jArr4, j4, false);
                            while (true) {
                                if (e3 < 0) {
                                    e3 = -1;
                                    break;
                                }
                                if ((iArr[e3] & 1) != 0) {
                                    break;
                                }
                                e3--;
                            }
                            i2 = -1;
                            if (e3 == -1) {
                                e3 = o0tVar2.a(j4);
                            }
                            j6 = e3 == -1 ? j5 : Math.min(jArr3[e3], j5);
                        } else {
                            j6 = j5;
                            z = false;
                            i2 = -1;
                        }
                    } else {
                        i2 = i5;
                    }
                    i++;
                    i5 = i2;
                }
                iap iapVar2 = new iap(j3, j7);
                return j4 != -9223372036854775807L ? new eap(iapVar2, iapVar2) : new eap(iapVar2, new iap(j4, j6));
            }
        } else {
            j2 = Long.MAX_VALUE;
            j3 = j;
        }
        j4 = -9223372036854775807L;
        i = 0;
        long j72 = j2;
        while (true) {
            wfiVarArr = this.A;
            if (i < wfiVarArr.length) {
            }
            i++;
            i5 = i2;
        }
        iap iapVar22 = new iap(j3, j72);
        if (j4 != -9223372036854775807L) {
        }
    }

    @Override // defpackage.fap
    public final boolean g() {
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:154:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0523 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0714 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0006 A[SYNTHETIC] */
    @Override // defpackage.r2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(s2c s2cVar, ci0 ci0Var) {
        char c;
        char c2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        d7k d7kVar;
        int i7;
        char c3;
        boolean z;
        ufi ufiVar;
        boolean z2;
        while (true) {
            int i8 = this.k;
            ArrayDeque arrayDeque = this.g;
            int i9 = this.b;
            d7k d7kVar2 = this.e;
            int i10 = 4;
            int i11 = 0;
            char c4 = 2;
            if (i8 == 0) {
                int i12 = this.n;
                d7k d7kVar3 = this.f;
                if (i12 == 0) {
                    if (s2cVar.o(d7kVar3.a, 0, 8, true)) {
                        this.n = 8;
                        d7kVar3.H(0);
                        this.m = d7kVar3.x();
                        this.l = d7kVar3.h();
                    } else {
                        if (this.E == 2 && (i9 & 2) != 0) {
                            azs M = this.z.M(0, 4);
                            uei ueiVar = this.F;
                            u2i u2iVar = ueiVar == null ? null : new u2i(ueiVar);
                            bsc bscVar = new bsc();
                            bscVar.k = u2iVar;
                            eta.o(bscVar, M);
                            this.z.K();
                            this.z.E(new zg2(-9223372036854775807L));
                        }
                        z2 = false;
                        if (z2) {
                            return -1;
                        }
                    }
                }
                long j2 = this.m;
                if (j2 == 1) {
                    s2cVar.readFully(d7kVar3.a, 8, 8);
                    this.n += 8;
                    this.m = d7kVar3.A();
                } else if (j2 == 0) {
                    long length = s2cVar.getLength();
                    if (length == -1 && (ufiVar = (ufi) arrayDeque.peek()) != null) {
                        length = ufiVar.g;
                    }
                    if (length != -1) {
                        this.m = (length - s2cVar.getPosition()) + this.n;
                    }
                }
                long j3 = this.m;
                int i13 = this.n;
                if (j3 < i13) {
                    throw r7k.c("Atom size less than header length (unsupported).");
                }
                int i14 = this.l;
                if (i14 == 1836019574 || i14 == 1953653099 || i14 == 1835297121 || i14 == 1835626086 || i14 == 1937007212 || i14 == 1701082227 || i14 == 1835365473 || i14 == 1635284069) {
                    long position = s2cVar.getPosition();
                    long j4 = this.m;
                    long j5 = this.n;
                    long j6 = (position + j4) - j5;
                    if (j4 != j5 && this.l == 1835365473) {
                        d7kVar2.E(8);
                        s2cVar.A(d7kVar2.a, 0, 8);
                        byte[] bArr = ch3.a;
                        int i15 = d7kVar2.b;
                        d7kVar2.I(4);
                        if (d7kVar2.h() != 1751411826) {
                            i15 += 4;
                        }
                        d7kVar2.H(i15);
                        s2cVar.y(d7kVar2.b);
                        s2cVar.n();
                    }
                    arrayDeque.push(new ufi(this.l, j6));
                    if (this.m == this.n) {
                        m(j6);
                    } else {
                        this.k = 0;
                        this.n = 0;
                    }
                } else if (i14 == 1835296868 || i14 == 1836476516 || i14 == 1751411826 || i14 == 1937011556 || i14 == 1937011827 || i14 == 1937011571 || i14 == 1668576371 || i14 == 1701606260 || i14 == 1937011555 || i14 == 1937011578 || i14 == 1937013298 || i14 == 1937007471 || i14 == 1668232756 || i14 == 1953196132 || i14 == 1718909296 || i14 == 1969517665 || i14 == 1801812339 || i14 == 1768715124) {
                    vq1.A(i13 == 8);
                    vq1.A(this.m <= 2147483647L);
                    d7k d7kVar4 = new d7k((int) this.m);
                    System.arraycopy(d7kVar3.a, 0, d7kVar4.a, 0, 8);
                    this.o = d7kVar4;
                    this.k = 1;
                } else {
                    long position2 = s2cVar.getPosition();
                    long j7 = this.n;
                    long j8 = position2 - j7;
                    if (this.l == 1836086884) {
                        this.F = new uei(0L, j8, -9223372036854775807L, j8 + j7, this.m - j7);
                    }
                    this.o = null;
                    this.k = 1;
                }
                z2 = true;
                if (z2) {
                }
            } else {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            e7o.n();
                            return 0;
                        }
                        wap wapVar = this.h;
                        ArrayList arrayList = wapVar.a;
                        int i16 = wapVar.b;
                        if (i16 != 0) {
                            if (i16 != 1) {
                                short s = 2817;
                                short s2 = 2816;
                                short s3 = 2192;
                                if (i16 == 2) {
                                    long length2 = s2cVar.getLength();
                                    int i17 = wapVar.c - 20;
                                    d7k d7kVar5 = new d7k(i17);
                                    s2cVar.readFully(d7kVar5.a, 0, i17);
                                    int i18 = 0;
                                    while (i18 < i17 / 12) {
                                        d7kVar5.I(2);
                                        short l = d7kVar5.l();
                                        if (l != s3 && l != s2 && l != s && l != 2819) {
                                            if (l != 2820) {
                                                d7kVar5.I(8);
                                                j = length2;
                                                d7kVar = d7kVar5;
                                                i18++;
                                                length2 = j;
                                                d7kVar5 = d7kVar;
                                                s3 = 2192;
                                                s = 2817;
                                                s2 = 2816;
                                            }
                                        }
                                        j = length2;
                                        d7kVar = d7kVar5;
                                        arrayList.add(new vap((j - wapVar.c) - d7kVar5.j(), d7kVar.j()));
                                        i18++;
                                        length2 = j;
                                        d7kVar5 = d7kVar;
                                        s3 = 2192;
                                        s = 2817;
                                        s2 = 2816;
                                    }
                                    if (arrayList.isEmpty()) {
                                        ci0Var.a = 0L;
                                    } else {
                                        wapVar.b = 3;
                                        ci0Var.a = ((vap) arrayList.get(0)).a;
                                    }
                                } else {
                                    if (i16 != 3) {
                                        e7o.n();
                                        return 0;
                                    }
                                    long position3 = s2cVar.getPosition();
                                    int length3 = (int) ((s2cVar.getLength() - s2cVar.getPosition()) - wapVar.c);
                                    d7k d7kVar6 = new d7k(length3);
                                    s2cVar.readFully(d7kVar6.a, 0, length3);
                                    int i19 = 0;
                                    while (i19 < arrayList.size()) {
                                        vap vapVar = (vap) arrayList.get(i19);
                                        int i20 = i11;
                                        d7kVar6.H((int) (vapVar.a - position3));
                                        d7kVar6.I(i10);
                                        int j9 = d7kVar6.j();
                                        Charset charset = StandardCharsets.UTF_8;
                                        int i21 = i20;
                                        String t = d7kVar6.t(j9, charset);
                                        switch (t.hashCode()) {
                                            case -1711564334:
                                                if (t.equals("SlowMotion_Data")) {
                                                    i7 = i21;
                                                    break;
                                                }
                                                break;
                                            case -1332107749:
                                                if (t.equals("Super_SlowMotion_Edit_Data")) {
                                                    i7 = 1;
                                                    break;
                                                }
                                                break;
                                            case -1251387154:
                                                if (t.equals("Super_SlowMotion_Data")) {
                                                    i7 = 2;
                                                    break;
                                                }
                                                break;
                                            case -830665521:
                                                if (t.equals("Super_SlowMotion_Deflickering_On")) {
                                                    i7 = 3;
                                                    break;
                                                }
                                                break;
                                            case 1760745220:
                                                if (t.equals("Super_SlowMotion_BGM")) {
                                                    i7 = 4;
                                                    break;
                                                }
                                                break;
                                        }
                                        i7 = -1;
                                        switch (i7) {
                                            case 0:
                                                c3 = 2192;
                                                break;
                                            case 1:
                                                c3 = 2819;
                                                break;
                                            case 2:
                                                c3 = 2816;
                                                break;
                                            case 3:
                                                c3 = 2820;
                                                break;
                                            case 4:
                                                c3 = 2817;
                                                break;
                                            default:
                                                throw r7k.a(null, "Invalid SEF name");
                                        }
                                        int i22 = vapVar.b - (j9 + 8);
                                        if (c3 == 2192) {
                                            ArrayList arrayList2 = new ArrayList();
                                            List f = wap.e.f(d7kVar6.t(i22, charset));
                                            int i23 = i21;
                                            while (i23 < f.size()) {
                                                List f2 = wap.d.f((CharSequence) f.get(i23));
                                                if (f2.size() != 3) {
                                                    throw r7k.a(null, null);
                                                }
                                                try {
                                                    arrayList2.add(new qxq(1 << (Integer.parseInt((String) f2.get(2)) - 1), Long.parseLong((String) f2.get(i21)), Long.parseLong((String) f2.get(1))));
                                                    i23++;
                                                    i21 = 0;
                                                } catch (NumberFormatException e) {
                                                    throw r7k.a(e, null);
                                                }
                                            }
                                            this.i.add(new rxq(arrayList2));
                                        } else if (c3 != 2816 && c3 != 2817 && c3 != 2819 && c3 != 2820) {
                                            e7o.n();
                                            return i21;
                                        }
                                        i19++;
                                        i11 = 0;
                                        i10 = 4;
                                    }
                                    ci0Var.a = 0L;
                                }
                            } else {
                                d7k d7kVar7 = new d7k(8);
                                s2cVar.readFully(d7kVar7.a, 0, 8);
                                wapVar.c = d7kVar7.j() + 8;
                                if (d7kVar7.h() != 1397048916) {
                                    ci0Var.a = 0L;
                                } else {
                                    ci0Var.a = s2cVar.getPosition() - (wapVar.c - 12);
                                    wapVar.b = 2;
                                }
                            }
                            i6 = 1;
                        } else {
                            long length4 = s2cVar.getLength();
                            ci0Var.a = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                            i6 = 1;
                            wapVar.b = 1;
                        }
                        if (ci0Var.a != 0) {
                            return i6;
                        }
                        this.k = 0;
                        this.n = 0;
                        return i6;
                    }
                    long position4 = s2cVar.getPosition();
                    if (this.p == -1) {
                        int i24 = 0;
                        int i25 = -1;
                        int i26 = -1;
                        boolean z3 = true;
                        boolean z4 = true;
                        long j10 = Long.MAX_VALUE;
                        long j11 = Long.MAX_VALUE;
                        long j12 = Long.MAX_VALUE;
                        while (true) {
                            wfi[] wfiVarArr = this.A;
                            if (i24 >= wfiVarArr.length) {
                                break;
                            }
                            wfi wfiVar = wfiVarArr[i24];
                            int i27 = wfiVar.e;
                            o0t o0tVar = wfiVar.b;
                            char c5 = c4;
                            if (i27 != o0tVar.b) {
                                long j13 = o0tVar.c[i27];
                                long[][] jArr = this.B;
                                int i28 = dvt.a;
                                long j14 = jArr[i24][i27];
                                long j15 = j13 - position4;
                                boolean z5 = j15 < 0 || j15 >= 262144;
                                if ((!z5 && z3) || (z5 == z3 && j15 < j12)) {
                                    i26 = i24;
                                    z3 = z5;
                                    j11 = j14;
                                    j12 = j15;
                                }
                                if (j14 < j10) {
                                    i25 = i24;
                                    z4 = z5;
                                    j10 = j14;
                                }
                            }
                            i24++;
                            c4 = c5;
                        }
                        c = c4;
                        if (j10 == Long.MAX_VALUE || !z4 || j11 < j10 + 10485760) {
                            i25 = i26;
                        }
                        this.p = i25;
                        if (i25 == -1) {
                            return -1;
                        }
                    } else {
                        c = 2;
                    }
                    wfi wfiVar2 = this.A[this.p];
                    azs azsVar = wfiVar2.c;
                    o0t o0tVar2 = wfiVar2.b;
                    oqs oqsVar = wfiVar2.a;
                    int i29 = wfiVar2.e;
                    long[] jArr2 = o0tVar2.c;
                    int[] iArr = o0tVar2.d;
                    long j16 = jArr2[i29] + this.y;
                    int i30 = iArr[i29];
                    wat watVar = wfiVar2.d;
                    long j17 = (j16 - position4) + this.q;
                    if (j17 < 0 || j17 >= 262144) {
                        ci0Var.a = j16;
                        return 1;
                    }
                    int i31 = oqsVar.h;
                    int i32 = oqsVar.k;
                    dsc dscVar = oqsVar.g;
                    if (i31 == 1) {
                        j17 += 8;
                        i30 -= 8;
                    }
                    int i33 = i30;
                    s2cVar.y((int) j17);
                    String str = dscVar.n;
                    String str2 = dscVar.n;
                    if (!Objects.equals(str, "video/avc") ? !(!Objects.equals(str2, "video/hevc") || (i9 & 128) == 0) : (i9 & 32) != 0) {
                        c2 = 1;
                        this.t = true;
                    } else {
                        c2 = 1;
                    }
                    if (i32 != 0) {
                        d7k d7kVar8 = this.d;
                        byte[] bArr2 = d7kVar8.a;
                        bArr2[0] = 0;
                        bArr2[c2] = 0;
                        bArr2[c] = 0;
                        int i34 = 4 - i32;
                        int i35 = i33 + i34;
                        while (this.r < i35) {
                            int i36 = this.s;
                            if (i36 == 0) {
                                if (this.t || zc4.N(dscVar) + i32 > iArr[i29] - this.q) {
                                    i4 = i32;
                                    i5 = 0;
                                } else {
                                    i5 = zc4.N(dscVar);
                                    i4 = i32 + i5;
                                }
                                s2cVar.readFully(bArr2, i34, i4);
                                i2 = i35;
                                this.q += i4;
                                d7kVar8.H(0);
                                int h = d7kVar8.h();
                                if (h < 0) {
                                    throw r7k.a(null, "Invalid NAL length");
                                }
                                this.s = h - i5;
                                d7k d7kVar9 = this.c;
                                d7kVar9.H(0);
                                i3 = i34;
                                azsVar.b(d7kVar9, 4, 0);
                                this.r += 4;
                                if (i5 > 0) {
                                    azsVar.b(d7kVar8, i5, 0);
                                    int i37 = i5;
                                    this.r += i37;
                                    if (zc4.G(bArr2, i37, dscVar)) {
                                        this.t = true;
                                    }
                                }
                            } else {
                                i2 = i35;
                                i3 = i34;
                                int c6 = azsVar.c(s2cVar, i36, false);
                                this.q += c6;
                                this.r += c6;
                                this.s -= c6;
                            }
                            i35 = i2;
                            i34 = i3;
                        }
                        i = i35;
                    } else {
                        if ("audio/ac4".equals(str2)) {
                            if (this.r == 0) {
                                ot0.D(i33, d7kVar2);
                                azsVar.b(d7kVar2, 7, 0);
                                this.r += 7;
                            }
                            i33 += 7;
                        } else if (watVar != null) {
                            watVar.c(s2cVar);
                        }
                        while (true) {
                            int i38 = this.r;
                            if (i38 >= i33) {
                                break;
                            }
                            int c7 = azsVar.c(s2cVar, i33 - i38, false);
                            this.q += c7;
                            this.r += c7;
                            this.s -= c7;
                        }
                        i = i33;
                    }
                    long j18 = o0tVar2.f[i29];
                    int i39 = o0tVar2.g[i29];
                    if (!this.t) {
                        i39 |= 67108864;
                    }
                    int i40 = i39;
                    if (watVar != null) {
                        watVar.b(azsVar, j18, i40, i, 0, null);
                        if (i29 + 1 == o0tVar2.b) {
                            watVar.a(azsVar, null);
                        }
                    } else {
                        azsVar.a(j18, i40, i, 0, null);
                    }
                    wfiVar2.e++;
                    this.p = -1;
                    this.q = 0;
                    this.r = 0;
                    this.s = 0;
                    this.t = false;
                    return 0;
                }
                long j19 = this.m - this.n;
                long position5 = s2cVar.getPosition() + j19;
                d7k d7kVar10 = this.o;
                if (d7kVar10 != null) {
                    s2cVar.readFully(d7kVar10.a, this.n, (int) j19);
                    if (this.l == 1718909296) {
                        this.u = true;
                        d7kVar10.H(8);
                        int h2 = d7kVar10.h();
                        int i41 = h2 != 1751476579 ? h2 != 1903435808 ? 0 : 1 : 2;
                        if (i41 == 0) {
                            d7kVar10.I(4);
                            while (true) {
                                if (d7kVar10.a() <= 0) {
                                    i41 = 0;
                                    break;
                                }
                                int h3 = d7kVar10.h();
                                i41 = h3 != 1751476579 ? h3 != 1903435808 ? 0 : 1 : 2;
                                if (i41 != 0) {
                                    break;
                                }
                            }
                        }
                        this.E = i41;
                    } else if (!arrayDeque.isEmpty()) {
                        ((ufi) arrayDeque.peek()).h.add(new vfi(this.l, d7kVar10));
                    }
                } else {
                    if (!this.u && this.l == 1835295092) {
                        this.E = 1;
                    }
                    if (j19 < 262144) {
                        s2cVar.y((int) j19);
                    } else {
                        ci0Var.a = s2cVar.getPosition() + j19;
                        z = true;
                        m(position5);
                        if (this.v) {
                            this.x = true;
                            ci0Var.a = this.w;
                            this.v = false;
                            z = true;
                        }
                        if (!((z || this.k == 2) ? false : true)) {
                            return 1;
                        }
                    }
                }
                z = false;
                m(position5);
                if (this.v) {
                }
                if (!((z || this.k == 2) ? false : true)) {
                }
            }
        }
    }

    @Override // defpackage.r2c
    public final List i() {
        return this.j;
    }

    @Override // defpackage.fap
    public final long k() {
        return this.D;
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        if ((this.b & 16) == 0) {
            t2cVar = new z0j(t2cVar, this.a);
        }
        this.z = t2cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x020f, code lost:
    
        r7.H(r8);
        r8 = r8 + r15;
        r7.I(8);
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x021d, code lost:
    
        r9 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x021f, code lost:
    
        if (r9 >= r8) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0221, code lost:
    
        r9 = r7.h() + r9;
        r13 = r7.h();
        r32 = r0;
        r0 = (r13 >> 24) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE;
        r33 = r8;
        r34 = r11;
        r35 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x023f, code lost:
    
        if (r0 == 169) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0243, code lost:
    
        if (r0 != 253) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x024c, code lost:
    
        if (r13 != 1735291493) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0277, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x027c, code lost:
    
        if (r13 != 1684632427) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x027e, code lost:
    
        r13 = defpackage.v7g.F(r13, r7, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0284, code lost:
    
        r7.H(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0485, code lost:
    
        if (r13 == null) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0487, code lost:
    
        r3.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x048a, code lost:
    
        r0 = r32;
        r8 = r33;
        r11 = r34;
        r14 = r35;
        r31 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0292, code lost:
    
        if (r13 != 1953655662) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0294, code lost:
    
        r13 = defpackage.v7g.F(r13, r7, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x029e, code lost:
    
        if (r13 != 1953329263) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02a0, code lost:
    
        r13 = defpackage.v7g.H(r13, "TBPM", r7, r31, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ad, code lost:
    
        if (r13 != 1668311404) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02af, code lost:
    
        r13 = defpackage.v7g.H(r13, "TCMP", r7, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02ba, code lost:
    
        if (r13 != 1668249202) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02bc, code lost:
    
        r13 = defpackage.v7g.E(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02c4, code lost:
    
        if (r13 != 1631670868) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02c6, code lost:
    
        r13 = defpackage.v7g.I(r13, r7, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02d0, code lost:
    
        if (r13 != 1936682605) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02d2, code lost:
    
        r13 = defpackage.v7g.I(r13, r7, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02dc, code lost:
    
        if (r13 != 1936679276) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02de, code lost:
    
        r13 = defpackage.v7g.I(r13, r7, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02e8, code lost:
    
        if (r13 != 1936679282) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02ea, code lost:
    
        r13 = defpackage.v7g.I(r13, r7, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02f4, code lost:
    
        if (r13 != 1936679265) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02f6, code lost:
    
        r13 = defpackage.v7g.I(r13, r7, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0300, code lost:
    
        if (r13 != 1936679791) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0302, code lost:
    
        r13 = defpackage.v7g.I(r13, r7, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x030d, code lost:
    
        if (r13 != 1920233063) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x030f, code lost:
    
        r13 = defpackage.v7g.H(r13, "ITUNESADVISORY", r7, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x031b, code lost:
    
        if (r13 != 1885823344) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x031d, code lost:
    
        r13 = defpackage.v7g.H(r13, "ITUNESGAPLESS", r7, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x032a, code lost:
    
        if (r13 != 1936683886) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x032c, code lost:
    
        r13 = defpackage.v7g.I(r13, r7, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0337, code lost:
    
        if (r13 != 1953919848) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0339, code lost:
    
        r13 = defpackage.v7g.I(r13, r7, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0344, code lost:
    
        if (r13 != 757935405) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0346, code lost:
    
        r0 = null;
        r13 = null;
        r8 = -1;
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x034b, code lost:
    
        r14 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x034d, code lost:
    
        if (r14 >= r9) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x034f, code lost:
    
        r15 = r7.h();
        r36 = r11;
        r11 = r7.h();
        r7.I(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0362, code lost:
    
        if (r11 != 1835360622) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0371, code lost:
    
        if (r11 != 1851878757) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x037d, code lost:
    
        if (r11 != 1684108385) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x037f, code lost:
    
        r11 = r15;
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0385, code lost:
    
        r7.I(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0383, code lost:
    
        r11 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0373, code lost:
    
        r0 = r7.r(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x036b, code lost:
    
        r11 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0364, code lost:
    
        r13 = r7.r(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x038b, code lost:
    
        r36 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x038d, code lost:
    
        if (r13 == null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x038f, code lost:
    
        if (r0 == null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0392, code lost:
    
        if (r8 != (-1)) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0395, code lost:
    
        r7.H(r8);
        r7.I(16);
        r13 = new defpackage.lue(r13, r0, r7.r(r36 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03ab, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0466, code lost:
    
        defpackage.vq1.H("MetadataUtil", "Skipped unknown metadata entry: ".concat(defpackage.ceg.d(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0471, code lost:
    
        r7.H(r9);
        r13 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x024e, code lost:
    
        r0 = defpackage.rae.a(defpackage.v7g.G(r7) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0258, code lost:
    
        if (r0 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x025a, code lost:
    
        r13 = null;
        r8 = new defpackage.gcs("TCON", null, defpackage.yde.y(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x026c, code lost:
    
        r7.H(r9);
        r13 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0265, code lost:
    
        r13 = null;
        defpackage.vq1.n0("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x026b, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x028c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0499, code lost:
    
        r7.H(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x049c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0245, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03b4, code lost:
    
        r0 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03bb, code lost:
    
        if (r0 != 6516084) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03bd, code lost:
    
        r0 = r7.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03c8, code lost:
    
        if (r7.h() != 1684108385) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03ca, code lost:
    
        r7.I(8);
        r0 = r7.r(r0 - 16);
        r13 = new defpackage.ub5("und", r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03ee, code lost:
    
        r7.H(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03df, code lost:
    
        defpackage.vq1.n0("MetadataUtil", "Failed to parse comment attribute: ".concat(defpackage.ceg.d(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03ec, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03fb, code lost:
    
        if (r0 == 7233901) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0400, code lost:
    
        if (r0 != 7631467) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0407, code lost:
    
        if (r0 == 6516589) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x040c, code lost:
    
        if (r0 != 7828084) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0413, code lost:
    
        if (r0 != 6578553) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0415, code lost:
    
        r13 = defpackage.v7g.I(r13, r7, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x041b, code lost:
    
        r7.H(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0423, code lost:
    
        if (r0 != 4280916) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0425, code lost:
    
        r13 = defpackage.v7g.I(r13, r7, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x042f, code lost:
    
        if (r0 != 7630703) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0431, code lost:
    
        r13 = defpackage.v7g.I(r13, r7, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x043b, code lost:
    
        if (r0 != 6384738) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x043d, code lost:
    
        r13 = defpackage.v7g.I(r13, r7, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0447, code lost:
    
        if (r0 != 7108978) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0449, code lost:
    
        r13 = defpackage.v7g.I(r13, r7, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0453, code lost:
    
        if (r0 != 6776174) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0455, code lost:
    
        r13 = defpackage.v7g.I(r13, r7, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x045d, code lost:
    
        if (r0 != 6779504) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x045f, code lost:
    
        r13 = defpackage.v7g.I(r13, r7, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0477, code lost:
    
        r13 = defpackage.v7g.I(r13, r7, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x047e, code lost:
    
        r13 = defpackage.v7g.I(r13, r7, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x049d, code lost:
    
        r32 = r0;
        r34 = r11;
        r35 = r14;
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x04ac, code lost:
    
        if (r3.isEmpty() == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x04b1, code lost:
    
        r13 = new defpackage.u2i(r3);
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x086c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(long j) {
        ArrayList arrayList;
        u2i u2iVar;
        ArrayDeque arrayDeque;
        boolean z;
        ArrayList arrayList2;
        u2i u2iVar2;
        u2i u2iVar3;
        ArrayList arrayList3;
        int i;
        String str;
        u2i u2iVar4;
        u2i u2iVar5;
        ArrayList arrayList4;
        int i2;
        int i3;
        ArrayDeque arrayDeque2;
        boolean z2;
        ArrayList arrayList5;
        int i4;
        u2i u2iVar6;
        u2i b;
        u2i u2iVar7;
        int i5;
        u2i u2iVar8;
        dfh t;
        dfh dfhVar;
        while (true) {
            ArrayDeque arrayDeque3 = this.g;
            if (arrayDeque3.isEmpty() || ((ufi) arrayDeque3.peek()).g != j) {
                break;
            }
            ufi ufiVar = (ufi) arrayDeque3.pop();
            if (ufiVar.b == 1836019574) {
                ufi z3 = ufiVar.z(1835365473);
                ArrayList arrayList6 = new ArrayList();
                boolean z4 = true;
                int i6 = 4;
                int i7 = 1684108385;
                int i8 = this.b;
                int i9 = 8;
                if (z3 != null) {
                    byte[] bArr = ch3.a;
                    vfi A = z3.A(1751411826);
                    vfi A2 = z3.A(1801812339);
                    vfi A3 = z3.A(1768715124);
                    if (A != null && A2 != null && A3 != null) {
                        d7k d7kVar = A.g;
                        d7kVar.H(16);
                        if (d7kVar.h() == 1835299937) {
                            d7k d7kVar2 = A2.g;
                            d7kVar2.H(12);
                            int h = d7kVar2.h();
                            String[] strArr = new String[h];
                            int i10 = 0;
                            while (i10 < h) {
                                int h2 = d7kVar2.h();
                                d7kVar2.I(i6);
                                strArr[i10] = d7kVar2.t(h2 - 8, StandardCharsets.UTF_8);
                                i10++;
                                i6 = 4;
                            }
                            d7k d7kVar3 = A3.g;
                            d7kVar3.H(8);
                            ArrayList arrayList7 = new ArrayList();
                            while (d7kVar3.a() > i9) {
                                int i11 = d7kVar3.b;
                                int h3 = d7kVar3.h();
                                int h4 = d7kVar3.h() - 1;
                                if (h4 < 0 || h4 >= h) {
                                    dfi.o(h4, "Skipped metadata with unknown key index: ", "BoxParsers");
                                } else {
                                    String str2 = strArr[h4];
                                    int i12 = i11 + h3;
                                    while (true) {
                                        int i13 = d7kVar3.b;
                                        if (i13 >= i12) {
                                            dfhVar = null;
                                            break;
                                        }
                                        int h5 = d7kVar3.h();
                                        if (d7kVar3.h() == i7) {
                                            int h6 = d7kVar3.h();
                                            int h7 = d7kVar3.h();
                                            int i14 = h5 - 16;
                                            byte[] bArr2 = new byte[i14];
                                            d7kVar3.f(bArr2, 0, i14);
                                            dfhVar = new dfh(str2, bArr2, h7, h6);
                                            break;
                                        }
                                        d7kVar3.H(i13 + h5);
                                        i7 = 1684108385;
                                    }
                                    if (dfhVar != null) {
                                        arrayList7.add(dfhVar);
                                    }
                                }
                                d7kVar3.H(i11 + h3);
                                i9 = 8;
                                i7 = 1684108385;
                            }
                            if (!arrayList7.isEmpty()) {
                                u2iVar = new u2i(arrayList7);
                                if (this.x) {
                                    if (u2iVar != null && (i8 & 64) != 0 && (t = v7g.t(u2iVar, "auxiliary.tracks.offset")) != null) {
                                        long A4 = new d7k(t.b).A();
                                        if (A4 > 0) {
                                            this.w = A4;
                                            this.v = true;
                                            arrayDeque = arrayDeque3;
                                            arrayDeque.clear();
                                            if (this.v) {
                                                this.k = 2;
                                            }
                                        }
                                    }
                                    arrayList = arrayList6;
                                } else {
                                    vq1.B(u2iVar);
                                    dfh t2 = v7g.t(u2iVar, "auxiliary.tracks.interleaved");
                                    if (t2 != null && t2.b[0] == 0) {
                                        this.y = this.w + 16;
                                    }
                                    dfh t3 = v7g.t(u2iVar, "auxiliary.tracks.map");
                                    vq1.B(t3);
                                    ArrayList a = t3.a();
                                    ArrayList arrayList8 = new ArrayList(a.size());
                                    for (int i15 = 0; i15 < a.size(); i15++) {
                                        int intValue = ((Integer) a.get(i15)).intValue();
                                        arrayList8.add(Integer.valueOf(intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? 0 : 4 : 3 : 2 : 1));
                                    }
                                    arrayList = arrayList8;
                                }
                            }
                        }
                    }
                    u2iVar = null;
                    if (this.x) {
                    }
                } else {
                    arrayList = arrayList6;
                    u2iVar = null;
                }
                ArrayList arrayList9 = new ArrayList();
                boolean z5 = this.E == 1;
                n1d n1dVar = new n1d();
                vfi A5 = ufiVar.A(1969517665);
                if (A5 != null) {
                    byte[] bArr3 = ch3.a;
                    d7k d7kVar4 = A5.g;
                    int i16 = 8;
                    d7kVar4.H(8);
                    u2i u2iVar9 = new u2i(new n2i[0]);
                    while (d7kVar4.a() >= i16) {
                        int i17 = d7kVar4.b;
                        int h8 = d7kVar4.h();
                        int h9 = d7kVar4.h();
                        if (h9 == 1835365473) {
                            d7kVar4.H(i17);
                            int i18 = i17 + h8;
                            d7kVar4.I(i16);
                            int i19 = d7kVar4.b;
                            d7kVar4.I(4);
                            if (d7kVar4.h() != 1751411826) {
                                i19 += 4;
                            }
                            d7kVar4.H(i19);
                            while (true) {
                                int i20 = d7kVar4.b;
                                if (i20 >= i18) {
                                    arrayDeque2 = arrayDeque3;
                                    z2 = z5;
                                    arrayList5 = arrayList9;
                                    u2iVar8 = null;
                                    break;
                                }
                                int h10 = d7kVar4.h();
                                boolean z6 = z4;
                                if (d7kVar4.h() == 1768715124) {
                                    break;
                                }
                                d7kVar4.H(i20 + h10);
                                z4 = true;
                            }
                            u2i u2iVar10 = u2iVar8;
                            u2iVar9 = u2iVar9.b(u2iVar10);
                            i4 = 8;
                        } else {
                            arrayDeque2 = arrayDeque3;
                            z2 = z5;
                            arrayList5 = arrayList9;
                            if (h9 == 1936553057) {
                                d7kVar4.H(i17);
                                int i21 = i17 + h8;
                                d7kVar4.I(12);
                                while (true) {
                                    int i22 = d7kVar4.b;
                                    if (i22 >= i21) {
                                        i4 = 8;
                                        break;
                                    }
                                    int h11 = d7kVar4.h();
                                    if (d7kVar4.h() != 1935766900) {
                                        d7kVar4.H(i22 + h11);
                                    } else if (h11 < 16) {
                                        u2iVar7 = null;
                                        i4 = 8;
                                    } else {
                                        d7kVar4.I(4);
                                        int i23 = -1;
                                        int i24 = 0;
                                        for (int i25 = 0; i25 < 2; i25++) {
                                            int v = d7kVar4.v();
                                            int v2 = d7kVar4.v();
                                            if (v == 0) {
                                                i23 = v2;
                                            } else if (v == 1) {
                                                i24 = v2;
                                            }
                                        }
                                        if (i23 == 12) {
                                            i5 = 240;
                                        } else if (i23 == 13) {
                                            i5 = 120;
                                        } else if (i23 != 21) {
                                            i5 = -2147483647;
                                        } else {
                                            i4 = 8;
                                            if (d7kVar4.a() >= 8 && d7kVar4.b + 8 <= i21) {
                                                int h12 = d7kVar4.h();
                                                int h13 = d7kVar4.h();
                                                if (h12 >= 12 && h13 == 1936877170) {
                                                    i5 = d7kVar4.w();
                                                    if (i5 != -2147483647) {
                                                        u2iVar7 = new u2i(new a1r(i24, i5));
                                                    }
                                                }
                                            }
                                            i5 = -2147483647;
                                            if (i5 != -2147483647) {
                                            }
                                        }
                                        i4 = 8;
                                        if (i5 != -2147483647) {
                                        }
                                    }
                                }
                                u2iVar7 = null;
                                b = u2iVar9.b(u2iVar7);
                            } else {
                                i4 = 8;
                                if (h9 == -1451722374) {
                                    short s = d7kVar4.s();
                                    d7kVar4.I(2);
                                    String t4 = d7kVar4.t(s, StandardCharsets.UTF_8);
                                    int max = Math.max(t4.lastIndexOf(43), t4.lastIndexOf(45));
                                    try {
                                        u2iVar6 = new u2i(new yfi(Float.parseFloat(t4.substring(0, max)), Float.parseFloat(t4.substring(max, t4.length() - 1))));
                                    } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                        u2iVar6 = null;
                                    }
                                    b = u2iVar9.b(u2iVar6);
                                }
                            }
                            u2iVar9 = b;
                        }
                        d7kVar4.H(i17 + h8);
                        i16 = i4;
                        arrayDeque3 = arrayDeque2;
                        z5 = z2;
                        arrayList9 = arrayList5;
                        z4 = true;
                    }
                    arrayDeque = arrayDeque3;
                    z = z5;
                    arrayList2 = arrayList9;
                    u2iVar2 = null;
                    n1dVar.b(u2iVar9);
                    u2iVar3 = u2iVar9;
                } else {
                    arrayDeque = arrayDeque3;
                    z = z5;
                    arrayList2 = arrayList9;
                    u2iVar2 = null;
                    u2iVar3 = null;
                }
                vfi A6 = ufiVar.A(1836476516);
                A6.getClass();
                u2i u2iVar11 = new u2i(ch3.d(A6.g));
                ArrayList g = ch3.g(ufiVar, n1dVar, -9223372036854775807L, null, (i8 & 1) != 0, z, new tuh(22));
                if (this.x) {
                    boolean z7 = arrayList.size() == g.size();
                    Locale locale = Locale.US;
                    vq1.z(dfi.f("The number of auxiliary track types from metadata (", arrayList.size(), g.size(), ") is not same as the number of auxiliary tracks (", ")"), z7);
                }
                String u = lsq.u(g);
                int i26 = 0;
                int i27 = -1;
                int i28 = 0;
                long j2 = -9223372036854775807L;
                while (i26 < g.size()) {
                    o0t o0tVar = (o0t) g.get(i26);
                    if (o0tVar.b == 0) {
                        u2iVar5 = u2iVar3;
                        arrayList3 = g;
                        str = u;
                        i = i28;
                        u2iVar4 = u2iVar;
                        arrayList4 = arrayList2;
                    } else {
                        oqs oqsVar = o0tVar.a;
                        arrayList3 = g;
                        t2c t2cVar = this.z;
                        i = i28 + 1;
                        str = u;
                        int i29 = oqsVar.b;
                        u2i u2iVar12 = u2iVar;
                        dsc dscVar = oqsVar.g;
                        azs M = t2cVar.M(i28, i29);
                        wfi wfiVar = new wfi(oqsVar, o0tVar, M);
                        long j3 = oqsVar.e;
                        if (j3 == -9223372036854775807L) {
                            j3 = o0tVar.h;
                        }
                        M.getClass();
                        j2 = Math.max(j2, j3);
                        boolean equals = "audio/true-hd".equals(dscVar.n);
                        int i30 = o0tVar.e;
                        int i31 = equals ? i30 * 16 : i30 + 30;
                        bsc a2 = dscVar.a();
                        a2.n = i31;
                        if (i29 == 2) {
                            int i32 = dscVar.f;
                            if ((i8 & 8) != 0) {
                                i32 |= i27 == -1 ? 1 : 2;
                            }
                            if (this.x) {
                                i32 |= SQLiteDatabase.OPEN_NOMUTEX;
                                a2.g = ((Integer) arrayList.get(i26)).intValue();
                            }
                            a2.f = i32;
                        }
                        if (i29 == 1 && (i2 = n1dVar.a) != -1 && (i3 = n1dVar.b) != -1) {
                            a2.F = i2;
                            a2.G = i3;
                        }
                        u2i u2iVar13 = dscVar.l;
                        ArrayList arrayList10 = this.i;
                        u2i[] u2iVarArr = {arrayList10.isEmpty() ? u2iVar2 : new u2i(arrayList10), u2iVar3, u2iVar11};
                        if (u2iVar13 == null) {
                            u2iVar13 = new u2i(new n2i[0]);
                        }
                        u2iVar4 = u2iVar12;
                        if (u2iVar12 != null) {
                            int i33 = 0;
                            while (true) {
                                n2i[] n2iVarArr = u2iVar4.a;
                                u2iVar5 = u2iVar3;
                                if (i33 >= n2iVarArr.length) {
                                    break;
                                }
                                n2i n2iVar = n2iVarArr[i33];
                                if (n2iVar instanceof dfh) {
                                    dfh dfhVar2 = (dfh) n2iVar;
                                    if (!dfhVar2.a.equals("com.android.capture.fps")) {
                                        u2iVar13 = u2iVar13.a(dfhVar2);
                                    } else if (i29 == 2) {
                                        u2iVar13 = u2iVar13.a(dfhVar2);
                                    }
                                }
                                i33++;
                                u2iVar3 = u2iVar5;
                            }
                        } else {
                            u2iVar5 = u2iVar3;
                        }
                        for (int i34 = 0; i34 < 3; i34++) {
                            u2iVar13 = u2iVar13.b(u2iVarArr[i34]);
                        }
                        if (u2iVar13.a.length > 0) {
                            a2.k = u2iVar13;
                        }
                        a2.l = l5i.p(str);
                        eta.o(a2, wfiVar.c);
                        if (i29 == 2 && i27 == -1) {
                            i27 = arrayList2.size();
                        }
                        arrayList4 = arrayList2;
                        arrayList4.add(wfiVar);
                    }
                    i26++;
                    arrayList2 = arrayList4;
                    u2iVar = u2iVar4;
                    g = arrayList3;
                    i28 = i;
                    u = str;
                    u2iVar3 = u2iVar5;
                }
                this.C = i27;
                this.D = j2;
                wfi[] wfiVarArr = (wfi[]) arrayList2.toArray(new wfi[0]);
                this.A = wfiVarArr;
                long[][] jArr = new long[wfiVarArr.length][];
                int[] iArr = new int[wfiVarArr.length];
                long[] jArr2 = new long[wfiVarArr.length];
                boolean[] zArr = new boolean[wfiVarArr.length];
                for (int i35 = 0; i35 < wfiVarArr.length; i35++) {
                    jArr[i35] = new long[wfiVarArr[i35].b.b];
                    jArr2[i35] = wfiVarArr[i35].b.f[0];
                }
                long j4 = 0;
                int i36 = 0;
                while (i36 < wfiVarArr.length) {
                    long j5 = Long.MAX_VALUE;
                    int i37 = -1;
                    for (int i38 = 0; i38 < wfiVarArr.length; i38++) {
                        if (!zArr[i38]) {
                            long j6 = jArr2[i38];
                            if (j6 <= j5) {
                                i37 = i38;
                                j5 = j6;
                            }
                        }
                    }
                    int i39 = iArr[i37];
                    long[] jArr3 = jArr[i37];
                    jArr3[i39] = j4;
                    o0t o0tVar2 = wfiVarArr[i37].b;
                    j4 += o0tVar2.d[i39];
                    int i40 = i39 + 1;
                    iArr[i37] = i40;
                    if (i40 < jArr3.length) {
                        jArr2[i37] = o0tVar2.f[i40];
                    } else {
                        zArr[i37] = true;
                        i36++;
                    }
                }
                this.B = jArr;
                this.z.K();
                this.z.E(this);
                arrayDeque.clear();
                if (this.v) {
                }
            } else if (!arrayDeque3.isEmpty()) {
                ((ufi) arrayDeque3.peek()).i.add(ufiVar);
            }
        }
        if (this.k != 2) {
            this.k = 0;
            this.n = 0;
        }
    }

    @Override // defpackage.r2c
    public final void a() {
    }
}
