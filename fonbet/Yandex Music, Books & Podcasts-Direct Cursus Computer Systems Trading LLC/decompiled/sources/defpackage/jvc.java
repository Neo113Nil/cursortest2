package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.UUID;

/* loaded from: classes.dex */
public final class jvc implements r2c {
    public static final byte[] M = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final dsc N;
    public long A;
    public long B;
    public ivc C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public t2c I;
    public azs[] J;
    public azs[] K;
    public boolean L;
    public final spr a;
    public final int b;
    public final oqs c;
    public final List d;
    public final SparseArray e;
    public final d7k f;
    public final d7k g;
    public final d7k h;
    public final byte[] i;
    public final d7k j;
    public final ojs k;
    public final pt0 l;
    public final d7k m;
    public final ArrayDeque n;
    public final ArrayDeque o;
    public final sj p;
    public final azs q;
    public qsn r;
    public int s;
    public int t;
    public long u;
    public int v;
    public d7k w;
    public long x;
    public int y;
    public long z;

    static {
        bsc bscVar = new bsc();
        bscVar.m = l5i.p("application/x-emsg");
        N = new dsc(bscVar);
    }

    public jvc(spr sprVar, int i, ojs ojsVar, oqs oqsVar, List list, azs azsVar) {
        this.a = sprVar;
        this.b = i;
        this.k = ojsVar;
        this.c = oqsVar;
        this.d = Collections.unmodifiableList(list);
        this.q = azsVar;
        this.l = new pt0(26);
        this.m = new d7k(16);
        this.f = new d7k(zc4.h);
        this.g = new d7k(6);
        this.h = new d7k();
        byte[] bArr = new byte[16];
        this.i = bArr;
        this.j = new d7k(bArr);
        this.n = new ArrayDeque();
        this.o = new ArrayDeque();
        this.e = new SparseArray();
        ude udeVar = yde.b;
        this.r = qsn.e;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = t2c.g0;
        this.J = new azs[0];
        this.K = new azs[0];
        this.p = new sj(new g3a(18, this));
    }

    public static pqa c(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            vfi vfiVar = (vfi) list.get(i);
            if (vfiVar.b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = vfiVar.g.a;
                anx V = wyf.V(bArr);
                UUID uuid = V == null ? null : (UUID) V.b;
                if (uuid == null) {
                    vq1.n0("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new oqa(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new pqa(null, false, (oqa[]) arrayList.toArray(new oqa[0]));
    }

    public static void e(d7k d7kVar, int i, vvs vvsVar) {
        d7kVar.H(i + 8);
        int h = d7kVar.h();
        byte[] bArr = ch3.a;
        if ((h & 1) != 0) {
            throw r7k.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (h & 2) != 0;
        int z2 = d7kVar.z();
        if (z2 == 0) {
            Arrays.fill(vvsVar.l, 0, vvsVar.e, false);
            return;
        }
        int i2 = vvsVar.e;
        d7k d7kVar2 = vvsVar.n;
        if (z2 != i2) {
            StringBuilder q = k5r.q(z2, "Senc sample count ", " is different from fragment sample count");
            q.append(vvsVar.e);
            throw r7k.a(null, q.toString());
        }
        Arrays.fill(vvsVar.l, 0, z2, z);
        d7kVar2.E(d7kVar.a());
        vvsVar.k = true;
        vvsVar.o = true;
        d7kVar.f(d7kVar2.a, 0, d7kVar2.c);
        d7kVar2.H(0);
        vvsVar.o = false;
    }

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        SparseArray sparseArray = this.e;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((ivc) sparseArray.valueAt(i)).f();
        }
        this.o.clear();
        this.y = 0;
        ((PriorityQueue) this.p.e).clear();
        this.z = j2;
        this.n.clear();
        this.s = 0;
        this.v = 0;
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        qsn qsnVar;
        x2r Z = leu.Z(s2cVar, true, false);
        if (Z != null) {
            qsnVar = yde.y(Z);
        } else {
            ude udeVar = yde.b;
            qsnVar = qsn.e;
        }
        this.r = qsnVar;
        return Z == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:408:0x077a, code lost:
    
        r54.s = 0;
        r54.v = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x077f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03ab, code lost:
    
        if ((defpackage.dvt.g0(r41, 1000000, r4, r47) + defpackage.dvt.g0(r5[0], 1000000, r2.c, r47)) >= r2.e) goto L156;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(long j) {
        cq7 cq7Var;
        cq7 cq7Var2;
        pqa pqaVar;
        int i;
        ArrayList arrayList;
        int i2;
        ufi ufiVar;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        boolean z;
        int i6;
        int i7;
        ufi ufiVar2;
        int i8;
        int i9;
        int i10;
        int i11;
        cq7 cq7Var3;
        int i12;
        while (true) {
            ArrayDeque arrayDeque = this.n;
            if (arrayDeque.isEmpty() || ((ufi) arrayDeque.peek()).g != j) {
                break;
            }
            ufi ufiVar3 = (ufi) arrayDeque.pop();
            int i13 = ufiVar3.b;
            ArrayList arrayList2 = ufiVar3.i;
            ArrayList arrayList3 = ufiVar3.h;
            int i14 = this.b;
            int i15 = 12;
            oqs oqsVar = this.c;
            SparseArray sparseArray = this.e;
            if (i13 == 1836019574) {
                vq1.z("Unexpected moov box.", oqsVar == null);
                pqa c = c(arrayList3);
                ufi z2 = ufiVar3.z(1836475768);
                z2.getClass();
                ArrayList arrayList4 = z2.h;
                SparseArray sparseArray2 = new SparseArray();
                int size = arrayList4.size();
                long j2 = -9223372036854775807L;
                int i16 = 0;
                while (i16 < size) {
                    vfi vfiVar = (vfi) arrayList4.get(i16);
                    int i17 = vfiVar.b;
                    d7k d7kVar = vfiVar.g;
                    if (i17 == 1953654136) {
                        d7kVar.H(i15);
                        pqaVar = c;
                        Pair create = Pair.create(Integer.valueOf(d7kVar.h()), new cq7(d7kVar.h() - 1, d7kVar.h(), d7kVar.h(), d7kVar.h()));
                        sparseArray2.put(((Integer) create.first).intValue(), (cq7) create.second);
                    } else {
                        pqaVar = c;
                        if (i17 == 1835362404) {
                            d7kVar.H(8);
                            j2 = ch3.c(d7kVar.h()) == 0 ? d7kVar.x() : d7kVar.A();
                        }
                    }
                    i16++;
                    c = pqaVar;
                    i15 = 12;
                }
                int i18 = 1;
                ArrayList g = ch3.g(ufiVar3, new n1d(), j2, c, (i14 & 16) != 0, false, new kac(15, this));
                int size2 = g.size();
                if (sparseArray.size() == 0) {
                    String u = lsq.u(g);
                    int i19 = 0;
                    while (i19 < size2) {
                        o0t o0tVar = (o0t) g.get(i19);
                        oqs oqsVar2 = o0tVar.a;
                        t2c t2cVar = this.I;
                        int i20 = oqsVar2.b;
                        int i21 = oqsVar2.a;
                        azs M2 = t2cVar.M(i19, i20);
                        M2.getClass();
                        if (sparseArray2.size() == i18) {
                            cq7Var = (cq7) sparseArray2.valueAt(0);
                        } else {
                            cq7Var = (cq7) sparseArray2.get(i21);
                            cq7Var.getClass();
                        }
                        sparseArray.put(i21, new ivc(M2, o0tVar, cq7Var, u));
                        this.A = Math.max(this.A, oqsVar2.e);
                        i19++;
                        i18 = 1;
                    }
                    this.I.K();
                } else {
                    vq1.A(sparseArray.size() == size2);
                    for (int i22 = 0; i22 < size2; i22++) {
                        o0t o0tVar2 = (o0t) g.get(i22);
                        oqs oqsVar3 = o0tVar2.a;
                        ivc ivcVar = (ivc) sparseArray.get(oqsVar3.a);
                        int i23 = oqsVar3.a;
                        if (sparseArray2.size() == 1) {
                            cq7Var2 = (cq7) sparseArray2.valueAt(0);
                        } else {
                            cq7Var2 = (cq7) sparseArray2.get(i23);
                            cq7Var2.getClass();
                        }
                        ivcVar.e(o0tVar2, cq7Var2);
                    }
                }
            } else if (i13 == 1836019558) {
                boolean z3 = oqsVar != null;
                int size3 = arrayList2.size();
                int i24 = 0;
                while (i24 < size3) {
                    ufi ufiVar4 = (ufi) arrayList2.get(i24);
                    if (ufiVar4.b == 1953653094) {
                        vfi A = ufiVar4.A(1952868452);
                        ArrayList arrayList5 = ufiVar4.h;
                        A.getClass();
                        d7k d7kVar2 = A.g;
                        d7kVar2.H(8);
                        int h = d7kVar2.h();
                        byte[] bArr2 = ch3.a;
                        ivc ivcVar2 = (ivc) (z3 ? sparseArray.valueAt(0) : sparseArray.get(d7kVar2.h()));
                        if (ivcVar2 == null) {
                            i = size3;
                            ufiVar = ufiVar4;
                            ivcVar2 = null;
                        } else {
                            vvs vvsVar = ivcVar2.b;
                            ufiVar = ufiVar4;
                            if ((h & 1) != 0) {
                                long A2 = d7kVar2.A();
                                vvsVar.b = A2;
                                vvsVar.c = A2;
                            }
                            cq7 cq7Var4 = ivcVar2.e;
                            int h2 = (h & 2) != 0 ? d7kVar2.h() - 1 : cq7Var4.a;
                            int h3 = (h & 8) != 0 ? d7kVar2.h() : cq7Var4.b;
                            if ((h & 16) != 0) {
                                i = size3;
                                i3 = d7kVar2.h();
                            } else {
                                i = size3;
                                i3 = cq7Var4.c;
                            }
                            vvsVar.a = new cq7(h2, h3, i3, (h & 32) != 0 ? d7kVar2.h() : cq7Var4.d);
                        }
                        if (ivcVar2 == null) {
                            arrayList = arrayList2;
                            i2 = i14;
                        } else {
                            vvs vvsVar2 = ivcVar2.b;
                            long j3 = vvsVar2.p;
                            boolean z4 = vvsVar2.q;
                            ivcVar2.f();
                            ivcVar2.m = true;
                            ufi ufiVar5 = ufiVar;
                            vfi A3 = ufiVar5.A(1952867444);
                            if (A3 == null || (i14 & 2) != 0) {
                                vvsVar2.p = j3;
                                vvsVar2.q = z4;
                            } else {
                                d7k d7kVar3 = A3.g;
                                d7kVar3.H(8);
                                vvsVar2.p = ch3.c(d7kVar3.h()) == 1 ? d7kVar3.A() : d7kVar3.x();
                                vvsVar2.q = true;
                            }
                            int size4 = arrayList5.size();
                            int i25 = 0;
                            int i26 = 0;
                            int i27 = 0;
                            while (true) {
                                i4 = 1953658222;
                                if (i25 >= size4) {
                                    break;
                                }
                                int i28 = i25;
                                vfi vfiVar2 = (vfi) arrayList5.get(i25);
                                ArrayList arrayList6 = arrayList2;
                                if (vfiVar2.b == 1953658222) {
                                    d7k d7kVar4 = vfiVar2.g;
                                    d7kVar4.H(12);
                                    int z5 = d7kVar4.z();
                                    if (z5 > 0) {
                                        i27 += z5;
                                        i26++;
                                    }
                                }
                                i25 = i28 + 1;
                                arrayList2 = arrayList6;
                            }
                            arrayList = arrayList2;
                            ivcVar2.h = 0;
                            ivcVar2.g = 0;
                            ivcVar2.f = 0;
                            vvsVar2.d = i26;
                            vvsVar2.e = i27;
                            if (vvsVar2.g.length < i26) {
                                vvsVar2.f = new long[i26];
                                vvsVar2.g = new int[i26];
                            }
                            if (vvsVar2.h.length < i27) {
                                int i29 = (i27 * 125) / 100;
                                vvsVar2.h = new int[i29];
                                vvsVar2.i = new long[i29];
                                vvsVar2.j = new boolean[i29];
                                vvsVar2.l = new boolean[i29];
                            }
                            int i30 = 0;
                            int i31 = 0;
                            int i32 = 0;
                            while (true) {
                                long j4 = 0;
                                if (i30 < size4) {
                                    vfi vfiVar3 = (vfi) arrayList5.get(i30);
                                    int i33 = size4;
                                    if (vfiVar3.b == i4) {
                                        int i34 = i31 + 1;
                                        d7k d7kVar5 = vfiVar3.g;
                                        d7kVar5.H(8);
                                        int h4 = d7kVar5.h();
                                        byte[] bArr3 = ch3.a;
                                        oqs oqsVar4 = ivcVar2.d.a;
                                        i6 = i30;
                                        cq7 cq7Var5 = vvsVar2.a;
                                        int i35 = dvt.a;
                                        int i36 = i31;
                                        vvsVar2.g[i36] = d7kVar5.z();
                                        long[] jArr = vvsVar2.f;
                                        int i37 = i32;
                                        long j5 = vvsVar2.b;
                                        jArr[i36] = j5;
                                        if ((h4 & 1) != 0) {
                                            jArr[i36] = j5 + d7kVar5.h();
                                        }
                                        boolean z6 = (h4 & 4) != 0;
                                        int i38 = cq7Var5.d;
                                        if (z6) {
                                            i38 = d7kVar5.h();
                                        }
                                        boolean z7 = z6;
                                        boolean z8 = (h4 & 256) != 0;
                                        boolean z9 = (h4 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0;
                                        boolean z10 = (h4 & 1024) != 0;
                                        boolean z11 = (h4 & 2048) != 0;
                                        boolean z12 = z10;
                                        long[] jArr2 = oqsVar4.i;
                                        int i39 = i38;
                                        long[] jArr3 = oqsVar4.j;
                                        if (jArr2 != null && jArr2.length == 1 && jArr3 != null) {
                                            long j6 = jArr2[0];
                                            if (j6 != 0) {
                                                long j7 = oqsVar4.d;
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                            }
                                            j4 = jArr3[0];
                                        }
                                        int[] iArr = vvsVar2.h;
                                        long[] jArr4 = vvsVar2.i;
                                        boolean[] zArr = vvsVar2.j;
                                        boolean z13 = oqsVar4.b == 2 && (i14 & 1) != 0;
                                        i32 = i37 + vvsVar2.g[i36];
                                        i7 = i14;
                                        long j8 = oqsVar4.c;
                                        long j9 = vvsVar2.p;
                                        int i40 = i37;
                                        while (i40 < i32) {
                                            if (z8) {
                                                i8 = i40;
                                                i9 = d7kVar5.h();
                                            } else {
                                                i8 = i40;
                                                i9 = cq7Var5.b;
                                            }
                                            boolean z14 = z13;
                                            if (i9 < 0) {
                                                throw r7k.a(null, "Unexpected negative value: " + i9);
                                            }
                                            if (z9) {
                                                i10 = i32;
                                                i11 = d7kVar5.h();
                                            } else {
                                                i10 = i32;
                                                i11 = cq7Var5.c;
                                            }
                                            if (i11 < 0) {
                                                throw r7k.a(null, "Unexpected negative value: " + i11);
                                            }
                                            int h5 = z12 ? d7kVar5.h() : (i8 == 0 && z7) ? i39 : cq7Var5.d;
                                            if (z11) {
                                                cq7Var3 = cq7Var5;
                                                i12 = d7kVar5.h();
                                            } else {
                                                cq7Var3 = cq7Var5;
                                                i12 = 0;
                                            }
                                            int i41 = h5;
                                            long g0 = dvt.g0((i12 + j9) - j4, 1000000L, j8, RoundingMode.DOWN);
                                            jArr4[i8] = g0;
                                            if (!vvsVar2.q) {
                                                jArr4[i8] = g0 + ivcVar2.d.h;
                                            }
                                            iArr[i8] = i11;
                                            zArr[i8] = ((i41 >> 16) & 1) == 0 && (!z14 || i8 == 0);
                                            j9 += i9;
                                            i40 = i8 + 1;
                                            z13 = z14;
                                            i32 = i10;
                                            cq7Var5 = cq7Var3;
                                        }
                                        ufiVar2 = ufiVar5;
                                        vvsVar2.p = j9;
                                        i31 = i34;
                                    } else {
                                        i6 = i30;
                                        i7 = i14;
                                        ufiVar2 = ufiVar5;
                                    }
                                    ufiVar5 = ufiVar2;
                                    i14 = i7;
                                    i4 = 1953658222;
                                    i30 = i6 + 1;
                                    size4 = i33;
                                } else {
                                    i2 = i14;
                                    ufi ufiVar6 = ufiVar5;
                                    oqs oqsVar5 = ivcVar2.d.a;
                                    cq7 cq7Var6 = vvsVar2.a;
                                    cq7Var6.getClass();
                                    int i42 = cq7Var6.a;
                                    lvs[] lvsVarArr = oqsVar5.l;
                                    lvs lvsVar = lvsVarArr == null ? null : lvsVarArr[i42];
                                    vfi A4 = ufiVar6.A(1935763834);
                                    if (A4 != null) {
                                        lvsVar.getClass();
                                        d7k d7kVar6 = A4.g;
                                        int i43 = lvsVar.d;
                                        d7kVar6.H(8);
                                        int h6 = d7kVar6.h();
                                        byte[] bArr4 = ch3.a;
                                        if ((h6 & 1) == 1) {
                                            d7kVar6.I(8);
                                        }
                                        int v = d7kVar6.v();
                                        int z15 = d7kVar6.z();
                                        if (z15 > vvsVar2.e) {
                                            StringBuilder q = k5r.q(z15, "Saiz sample count ", " is greater than fragment sample count");
                                            q.append(vvsVar2.e);
                                            throw r7k.a(null, q.toString());
                                        }
                                        if (v == 0) {
                                            boolean[] zArr2 = vvsVar2.l;
                                            i5 = 0;
                                            for (int i44 = 0; i44 < z15; i44++) {
                                                int v2 = d7kVar6.v();
                                                i5 += v2;
                                                zArr2[i44] = v2 > i43;
                                            }
                                            z = false;
                                        } else {
                                            boolean z16 = v > i43;
                                            i5 = v * z15;
                                            z = false;
                                            Arrays.fill(vvsVar2.l, 0, z15, z16);
                                        }
                                        Arrays.fill(vvsVar2.l, z15, vvsVar2.e, z);
                                        if (i5 > 0) {
                                            vvsVar2.n.E(i5);
                                            vvsVar2.k = true;
                                            vvsVar2.o = true;
                                        }
                                    }
                                    vfi A5 = ufiVar6.A(1935763823);
                                    if (A5 != null) {
                                        d7k d7kVar7 = A5.g;
                                        d7kVar7.H(8);
                                        int h7 = d7kVar7.h();
                                        byte[] bArr5 = ch3.a;
                                        if ((h7 & 1) == 1) {
                                            d7kVar7.I(8);
                                        }
                                        int z17 = d7kVar7.z();
                                        if (z17 != 1) {
                                            throw r7k.a(null, "Unexpected saio entry count: " + z17);
                                        }
                                        vvsVar2.c += ch3.c(h7) == 0 ? d7kVar7.x() : d7kVar7.A();
                                    }
                                    vfi A6 = ufiVar6.A(1936027235);
                                    if (A6 != null) {
                                        e(A6.g, 0, vvsVar2);
                                    }
                                    String str = lvsVar != null ? lvsVar.b : null;
                                    d7k d7kVar8 = null;
                                    d7k d7kVar9 = null;
                                    for (int i45 = 0; i45 < arrayList5.size(); i45++) {
                                        vfi vfiVar4 = (vfi) arrayList5.get(i45);
                                        d7k d7kVar10 = vfiVar4.g;
                                        int i46 = vfiVar4.b;
                                        if (i46 == 1935828848) {
                                            d7kVar10.H(12);
                                            if (d7kVar10.h() == 1936025959) {
                                                d7kVar8 = d7kVar10;
                                            }
                                        } else if (i46 == 1936158820) {
                                            d7kVar10.H(12);
                                            if (d7kVar10.h() == 1936025959) {
                                                d7kVar9 = d7kVar10;
                                            }
                                        }
                                    }
                                    if (d7kVar8 != null && d7kVar9 != null) {
                                        d7kVar8.H(8);
                                        int c2 = ch3.c(d7kVar8.h());
                                        d7kVar8.I(4);
                                        if (c2 == 1) {
                                            d7kVar8.I(4);
                                        }
                                        if (d7kVar8.h() != 1) {
                                            throw r7k.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        d7kVar9.H(8);
                                        int c3 = ch3.c(d7kVar9.h());
                                        d7kVar9.I(4);
                                        if (c3 == 1) {
                                            if (d7kVar9.x() == 0) {
                                                throw r7k.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (c3 >= 2) {
                                            d7kVar9.I(4);
                                        }
                                        if (d7kVar9.x() != 1) {
                                            throw r7k.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        d7kVar9.I(1);
                                        int v3 = d7kVar9.v();
                                        int i47 = (v3 & 240) >> 4;
                                        int i48 = v3 & 15;
                                        boolean z18 = d7kVar9.v() == 1;
                                        if (z18) {
                                            int v4 = d7kVar9.v();
                                            byte[] bArr6 = new byte[16];
                                            d7kVar9.f(bArr6, 0, 16);
                                            if (v4 == 0) {
                                                int v5 = d7kVar9.v();
                                                byte[] bArr7 = new byte[v5];
                                                d7kVar9.f(bArr7, 0, v5);
                                                bArr = bArr7;
                                            } else {
                                                bArr = null;
                                            }
                                            vvsVar2.k = true;
                                            vvsVar2.m = new lvs(z18, str, v4, bArr6, i47, i48, bArr);
                                        }
                                    }
                                    int size5 = arrayList5.size();
                                    for (int i49 = 0; i49 < size5; i49++) {
                                        vfi vfiVar5 = (vfi) arrayList5.get(i49);
                                        if (vfiVar5.b == 1970628964) {
                                            d7k d7kVar11 = vfiVar5.g;
                                            d7kVar11.H(8);
                                            byte[] bArr8 = this.i;
                                            d7kVar11.f(bArr8, 0, 16);
                                            if (Arrays.equals(bArr8, M)) {
                                                e(d7kVar11, 16, vvsVar2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        i = size3;
                        arrayList = arrayList2;
                        i2 = i14;
                    }
                    i24++;
                    arrayList2 = arrayList;
                    size3 = i;
                    i14 = i2;
                }
                pqa c4 = c(arrayList3);
                if (c4 != null) {
                    int size6 = sparseArray.size();
                    for (int i50 = 0; i50 < size6; i50++) {
                        ivc ivcVar3 = (ivc) sparseArray.valueAt(i50);
                        oqs oqsVar6 = ivcVar3.d.a;
                        cq7 cq7Var7 = ivcVar3.b.a;
                        int i51 = dvt.a;
                        int i52 = cq7Var7.a;
                        lvs[] lvsVarArr2 = oqsVar6.l;
                        lvs lvsVar2 = lvsVarArr2 == null ? null : lvsVarArr2[i52];
                        pqa a = c4.a(lvsVar2 != null ? lvsVar2.b : null);
                        bsc a2 = ivcVar3.d.a.g.a();
                        a2.l = l5i.p(ivcVar3.j);
                        a2.q = a;
                        ivcVar3.a.d(new dsc(a2));
                    }
                }
                if (this.z != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i53 = 0; i53 < size7; i53++) {
                        ivc ivcVar4 = (ivc) sparseArray.valueAt(i53);
                        long j10 = this.z;
                        int i54 = ivcVar4.f;
                        while (true) {
                            vvs vvsVar3 = ivcVar4.b;
                            if (i54 < vvsVar3.e && vvsVar3.i[i54] <= j10) {
                                if (vvsVar3.j[i54]) {
                                    ivcVar4.i = i54;
                                }
                                i54++;
                            }
                        }
                    }
                    this.z = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((ufi) arrayDeque.peek()).i.add(ufiVar3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:325:0x00bf, code lost:
    
        r3 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x00c9, code lost:
    
        if (r32.s != 3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x00cd, code lost:
    
        if (r2.m != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x00cf, code lost:
    
        r5 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x00de, code lost:
    
        r32.D = r5;
        r5 = r2.d.a.g;
        r10 = java.util.Objects.equals(r5.n, "video/avc");
        r11 = r32.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x00ee, code lost:
    
        if (r10 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x00f2, code lost:
    
        if ((r11 & 64) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x00f4, code lost:
    
        r5 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0106, code lost:
    
        r32.G = !r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x010e, code lost:
    
        if (r2.f >= r2.i) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0110, code lost:
    
        r33.y(r32.D);
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0119, code lost:
    
        if (r1 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x011c, code lost:
    
        r4 = r3.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0120, code lost:
    
        if (r1 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0122, code lost:
    
        r4.I(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0125, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0129, code lost:
    
        if (r3.k == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x012f, code lost:
    
        if (r3.l[r1] == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0131, code lost:
    
        r4.I(r4.B() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x013d, code lost:
    
        if (r2.c() != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x013f, code lost:
    
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0142, code lost:
    
        r32.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0145, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x014e, code lost:
    
        if (r2.d.a.h != r22) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0150, code lost:
    
        r32.D -= 8;
        r33.y(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x015b, code lost:
    
        r5 = "audio/ac4".equals(r2.d.a.g.n);
        r10 = r32.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x016b, code lost:
    
        if (r5 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x016d, code lost:
    
        r32.E = r2.d(r10, 7);
        r10 = r32.D;
        r11 = r32.j;
        defpackage.ot0.D(r10, r11);
        r2.a.b(r11, 7, 0);
        r32.E += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x018c, code lost:
    
        r32.D += r32.E;
        r32.s = 4;
        r32.F = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0186, code lost:
    
        r32.E = r2.d(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x00f7, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x00ff, code lost:
    
        if (java.util.Objects.equals(r5.n, "video/hevc") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0103, code lost:
    
        if ((r11 & 128) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x00d8, code lost:
    
        r5 = r3.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0198, code lost:
    
        r5 = r2.d;
        r10 = r5.a;
        r11 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x01a0, code lost:
    
        if (r2.m != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x01a2, code lost:
    
        r15 = r5.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x01a8, code lost:
    
        r3 = r7;
        r6 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x01b2, code lost:
    
        if (r4 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x01b4, code lost:
    
        r6 = r4.a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x01b8, code lost:
    
        r12 = r10.k;
        r10 = r10.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x01bc, code lost:
    
        if (r12 == 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x01be, code lost:
    
        r15 = r32.g;
        r5 = r15.a;
        r5[0] = 0;
        r5[1] = 0;
        r5[r18] = 0;
        r13 = 4 - r12;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x01ce, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x01d4, code lost:
    
        if (r32.E >= r32.D) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x01d6, code lost:
    
        r2 = r32.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x01d8, code lost:
    
        if (r2 != 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x01dd, code lost:
    
        if (r32.K.length > 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x01e1, code lost:
    
        if (r32.G != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x01f8, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x01f9, code lost:
    
        r33.readFully(r5, r13, r12 + r2);
        r15.H(0);
        r18 = r15.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0206, code lost:
    
        if (r18 < 0) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0208, code lost:
    
        r32.F = r18 - r2;
        r3 = r32.f;
        r24 = r12;
        r3.H(0);
        r18 = r13;
        r11.b(r3, 4, 0);
        r32.E += 4;
        r32.D += r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0228, code lost:
    
        if (r32.K.length <= 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x022a, code lost:
    
        if (r2 <= 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x022c, code lost:
    
        r3 = r5[4];
        r12 = r10.n;
        r13 = r10.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0236, code lost:
    
        if (java.util.Objects.equals(r12, "video/avc") != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x023c, code lost:
    
        if (defpackage.l5i.c(r13, "video/avc") == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x023f, code lost:
    
        r25 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0250, code lost:
    
        if (java.util.Objects.equals(r10.n, "video/hevc") != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0256, code lost:
    
        if (defpackage.l5i.c(r13, "video/hevc") == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0265, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0266, code lost:
    
        r32.H = r12;
        r11.b(r15, r2, 0);
        r32.E += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0271, code lost:
    
        if (r2 <= 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0275, code lost:
    
        if (r32.G != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x027b, code lost:
    
        if (defpackage.zc4.G(r5, r2, r10) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x027d, code lost:
    
        r32.G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0280, code lost:
    
        r13 = r18;
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0284, code lost:
    
        r12 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0260, code lost:
    
        if (((r25 & 126) >> 1) != 39) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0262, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0243, code lost:
    
        r25 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0248, code lost:
    
        if ((r3 & 31) == 6) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x028f, code lost:
    
        throw defpackage.r7k.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x01e3, code lost:
    
        r2 = defpackage.zc4.N(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x01f3, code lost:
    
        if ((r12 + r2) > (r32.D - r32.E)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x01f5, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0290, code lost:
    
        r24 = r12;
        r18 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0297, code lost:
    
        if (r32.H == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0299, code lost:
    
        r12 = r32.h;
        r12.E(r2);
        r33.readFully(r12.a, 0, r32.F);
        r11.b(r12, r32.F, 0);
        r2 = r32.F;
        r2 = defpackage.zc4.d0(r12.c, r12.a);
        r12.H(0);
        r12.G(r2);
        r2 = r10.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x02c0, code lost:
    
        if (r2 != (-1)) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x02c2, code lost:
    
        r13 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x02c6, code lost:
    
        if (r13.a == 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x02c8, code lost:
    
        r13.a = 0;
        r13.h(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x02e1, code lost:
    
        r13.a(r6, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x02ed, code lost:
    
        if ((r17.a() & 4) == 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x02ef, code lost:
    
        r13.h(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x02f2, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x02fc, code lost:
    
        r32.E += r2;
        r32.F -= r2;
        r3 = r13;
        r13 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x02ce, code lost:
    
        r13 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x02d2, code lost:
    
        if (r13.a == r2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x02d4, code lost:
    
        if (r2 < 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x02d6, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x02d9, code lost:
    
        defpackage.vq1.A(r3);
        r13.a = r2;
        r13.h(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x02d8, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x02f5, code lost:
    
        r13 = r20;
        r2 = r11.c(r33, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x031f, code lost:
    
        r1 = r17.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0325, code lost:
    
        if (r32.G != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0327, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x032a, code lost:
    
        r27 = r1;
        r1 = r17.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0330, code lost:
    
        if (r1 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0332, code lost:
    
        r30 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0339, code lost:
    
        r25 = r6;
        r11.a(r25, r27, r32.D, 0, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x034a, code lost:
    
        if (r14.isEmpty() != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x034c, code lost:
    
        r1 = (defpackage.hvc) r14.removeFirst();
        r32.y -= r1.c;
        r2 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x035d, code lost:
    
        if (r1.b == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x035f, code lost:
    
        r2 = r2 + r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0361, code lost:
    
        if (r4 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0363, code lost:
    
        r2 = r4.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0367, code lost:
    
        r6 = r2;
        r2 = r32.J;
        r3 = r2.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x036c, code lost:
    
        if (r12 >= r3) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x036e, code lost:
    
        r2[r12].a(r6, 1, r1.c, r32.y, null);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0380, code lost:
    
        if (r17.c() != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0382, code lost:
    
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0385, code lost:
    
        r32.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x038a, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0337, code lost:
    
        r30 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x030b, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x030d, code lost:
    
        r2 = r32.E;
        r3 = r32.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0311, code lost:
    
        if (r2 >= r3) goto L484;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0313, code lost:
    
        r32.E += r11.c(r33, r3 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x01ab, code lost:
    
        r15 = r3.i[r2.f];
     */
    @Override // defpackage.r2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(s2c s2cVar, ci0 ci0Var) {
        char c;
        boolean z;
        int i;
        String q;
        String q2;
        long g0;
        long j;
        long g02;
        long x;
        long A;
        long A2;
        while (true) {
            int i2 = this.s;
            ArrayDeque arrayDeque = this.n;
            sj sjVar = this.p;
            SparseArray sparseArray = this.e;
            boolean z2 = true;
            if (i2 != 0) {
                ArrayDeque arrayDeque2 = this.o;
                ojs ojsVar = this.k;
                if (i2 != 1) {
                    long j2 = Long.MAX_VALUE;
                    if (i2 != 2) {
                        ivc ivcVar = this.C;
                        if (ivcVar != null) {
                            c = 2;
                            z = true;
                            i = 8;
                            break;
                        }
                        int size = sparseArray.size();
                        c = 2;
                        int i3 = 0;
                        ivc ivcVar2 = null;
                        while (i3 < size) {
                            ivc ivcVar3 = (ivc) sparseArray.valueAt(i3);
                            boolean z3 = ivcVar3.m;
                            boolean z4 = z2;
                            vvs vvsVar = ivcVar3.b;
                            if ((z3 || ivcVar3.f != ivcVar3.d.b) && (!z3 || ivcVar3.h != vvsVar.d)) {
                                long j3 = !z3 ? ivcVar3.d.c[ivcVar3.f] : vvsVar.f[ivcVar3.h];
                                if (j3 < j2) {
                                    ivcVar2 = ivcVar3;
                                    j2 = j3;
                                }
                            }
                            i3++;
                            z2 = z4;
                        }
                        z = z2;
                        i = 8;
                        if (ivcVar2 == null) {
                            int position = (int) (this.x - s2cVar.getPosition());
                            if (position < 0) {
                                throw r7k.a(null, "Offset to end of mdat was negative.");
                            }
                            s2cVar.y(position);
                            this.s = 0;
                            this.v = 0;
                        } else {
                            int position2 = (int) ((!ivcVar2.m ? ivcVar2.d.c[ivcVar2.f] : ivcVar2.b.f[ivcVar2.h]) - s2cVar.getPosition());
                            if (position2 < 0) {
                                vq1.n0("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                position2 = 0;
                            }
                            s2cVar.y(position2);
                            this.C = ivcVar2;
                            ivcVar = ivcVar2;
                        }
                    } else {
                        int size2 = sparseArray.size();
                        ivc ivcVar4 = null;
                        for (int i4 = 0; i4 < size2; i4++) {
                            vvs vvsVar2 = ((ivc) sparseArray.valueAt(i4)).b;
                            if (vvsVar2.o) {
                                long j4 = vvsVar2.c;
                                if (j4 < j2) {
                                    ivcVar4 = (ivc) sparseArray.valueAt(i4);
                                    j2 = j4;
                                }
                            }
                        }
                        if (ivcVar4 == null) {
                            this.s = 3;
                        } else {
                            int position3 = (int) (j2 - s2cVar.getPosition());
                            if (position3 < 0) {
                                throw r7k.a(null, "Offset to encryption data was negative.");
                            }
                            s2cVar.y(position3);
                            vvs vvsVar3 = ivcVar4.b;
                            d7k d7kVar = vvsVar3.n;
                            s2cVar.readFully(d7kVar.a, 0, d7kVar.c);
                            d7kVar.H(0);
                            vvsVar3.o = false;
                        }
                    }
                } else {
                    int i5 = (int) (this.u - this.v);
                    d7k d7kVar2 = this.w;
                    if (d7kVar2 != null) {
                        s2cVar.readFully(d7kVar2.a, 8, i5);
                        int i6 = this.t;
                        vfi vfiVar = new vfi(i6, d7kVar2);
                        long position4 = s2cVar.getPosition();
                        if (!arrayDeque.isEmpty()) {
                            ((ufi) arrayDeque.peek()).h.add(vfiVar);
                        } else if (i6 == 1936286840) {
                            d7kVar2.H(8);
                            int c2 = ch3.c(d7kVar2.h());
                            d7kVar2.I(4);
                            long x2 = d7kVar2.x();
                            if (c2 == 0) {
                                A = d7kVar2.x();
                                A2 = d7kVar2.x();
                            } else {
                                A = d7kVar2.A();
                                A2 = d7kVar2.A();
                            }
                            long j5 = A2 + position4;
                            long j6 = A;
                            int i7 = dvt.a;
                            long g03 = dvt.g0(j6, 1000000L, x2, RoundingMode.DOWN);
                            d7kVar2.I(2);
                            int B = d7kVar2.B();
                            int[] iArr = new int[B];
                            long[] jArr = new long[B];
                            long[] jArr2 = new long[B];
                            long[] jArr3 = new long[B];
                            long j7 = g03;
                            int i8 = 0;
                            while (i8 < B) {
                                int h = d7kVar2.h();
                                if ((h & Integer.MIN_VALUE) != 0) {
                                    throw r7k.a(null, "Unhandled indirect reference");
                                }
                                long x3 = d7kVar2.x();
                                iArr[i8] = h & Integer.MAX_VALUE;
                                jArr[i8] = j5;
                                jArr3[i8] = j7;
                                j6 += x3;
                                j7 = dvt.g0(j6, 1000000L, x2, RoundingMode.DOWN);
                                jArr2[i8] = j7 - jArr3[i8];
                                d7kVar2.I(4);
                                j5 += iArr[i8];
                                i8++;
                                g03 = g03;
                            }
                            Pair create = Pair.create(Long.valueOf(g03), new tk4(iArr, jArr, jArr2, jArr3));
                            this.B = ((Long) create.first).longValue();
                            this.I.E((fap) create.second);
                            this.L = true;
                        } else if (i6 == 1701671783 && this.J.length != 0) {
                            d7kVar2.H(8);
                            int c3 = ch3.c(d7kVar2.h());
                            long j8 = -9223372036854775807L;
                            if (c3 == 0) {
                                q = d7kVar2.q();
                                q.getClass();
                                q2 = d7kVar2.q();
                                q2.getClass();
                                long x4 = d7kVar2.x();
                                long x5 = d7kVar2.x();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                g0 = dvt.g0(x5, 1000000L, x4, roundingMode);
                                long j9 = this.B;
                                j = j9 != -9223372036854775807L ? j9 + g0 : -9223372036854775807L;
                                g02 = dvt.g0(d7kVar2.x(), 1000L, x4, roundingMode);
                                x = d7kVar2.x();
                            } else if (c3 != 1) {
                                dfi.o(c3, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long x6 = d7kVar2.x();
                                long A3 = d7kVar2.A();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                long g04 = dvt.g0(A3, 1000000L, x6, roundingMode2);
                                long g05 = dvt.g0(d7kVar2.x(), 1000L, x6, roundingMode2);
                                long x7 = d7kVar2.x();
                                q = d7kVar2.q();
                                q.getClass();
                                q2 = d7kVar2.q();
                                q2.getClass();
                                g02 = g05;
                                x = x7;
                                j = g04;
                                g0 = -9223372036854775807L;
                            }
                            String str = q;
                            String str2 = q2;
                            byte[] bArr = new byte[d7kVar2.a()];
                            d7kVar2.f(bArr, 0, d7kVar2.a());
                            d7k d7kVar3 = new d7k(this.l.r(new tib(str, str2, g02, x, bArr)));
                            int a = d7kVar3.a();
                            azs[] azsVarArr = this.J;
                            int length = azsVarArr.length;
                            int i9 = 0;
                            while (i9 < length) {
                                azs azsVar = azsVarArr[i9];
                                d7kVar3.H(0);
                                azsVar.b(d7kVar3, a, 0);
                                i9++;
                                j8 = j8;
                            }
                            if (j == j8) {
                                arrayDeque2.addLast(new hvc(a, g0, true));
                                this.y += a;
                            } else if (!arrayDeque2.isEmpty()) {
                                arrayDeque2.addLast(new hvc(a, j, false));
                                this.y += a;
                            } else if (ojsVar == null || ojsVar.e()) {
                                if (ojsVar != null) {
                                    j = ojsVar.a(j);
                                }
                                long j10 = j;
                                for (azs azsVar2 : this.J) {
                                    azsVar2.a(j10, 1, a, 0, null);
                                }
                            } else {
                                arrayDeque2.addLast(new hvc(a, j, false));
                                this.y += a;
                            }
                        }
                    } else {
                        s2cVar.y(i5);
                    }
                    f(s2cVar.getPosition());
                }
            } else {
                int i10 = this.v;
                d7k d7kVar4 = this.m;
                if (i10 == 0) {
                    if (!s2cVar.o(d7kVar4.a, 0, 8, true)) {
                        sjVar.h(0);
                        return -1;
                    }
                    this.v = 8;
                    d7kVar4.H(0);
                    this.u = d7kVar4.x();
                    this.t = d7kVar4.h();
                }
                long j11 = this.u;
                if (j11 == 1) {
                    s2cVar.readFully(d7kVar4.a, 8, 8);
                    this.v += 8;
                    this.u = d7kVar4.A();
                } else if (j11 == 0) {
                    long length2 = s2cVar.getLength();
                    if (length2 == -1 && !arrayDeque.isEmpty()) {
                        length2 = ((ufi) arrayDeque.peek()).g;
                    }
                    if (length2 != -1) {
                        this.u = (length2 - s2cVar.getPosition()) + this.v;
                    }
                }
                if (this.u < this.v) {
                    throw r7k.c("Atom size less than header length (unsupported).");
                }
                long position5 = s2cVar.getPosition() - this.v;
                int i11 = this.t;
                if ((i11 == 1836019558 || i11 == 1835295092) && !this.L) {
                    this.I.E(new zg2(this.A, position5));
                    this.L = true;
                }
                if (this.t == 1836019558) {
                    int size3 = sparseArray.size();
                    for (int i12 = 0; i12 < size3; i12++) {
                        vvs vvsVar4 = ((ivc) sparseArray.valueAt(i12)).b;
                        vvsVar4.getClass();
                        vvsVar4.c = position5;
                        vvsVar4.b = position5;
                    }
                }
                int i13 = this.t;
                if (i13 == 1835295092) {
                    this.C = null;
                    this.x = position5 + this.u;
                    this.s = 2;
                } else if (i13 == 1836019574 || i13 == 1953653099 || i13 == 1835297121 || i13 == 1835626086 || i13 == 1937007212 || i13 == 1836019558 || i13 == 1953653094 || i13 == 1836475768 || i13 == 1701082227) {
                    long position6 = (s2cVar.getPosition() + this.u) - 8;
                    arrayDeque.push(new ufi(this.t, position6));
                    if (this.u == this.v) {
                        f(position6);
                    } else {
                        this.s = 0;
                        this.v = 0;
                    }
                } else if (i13 == 1751411826 || i13 == 1835296868 || i13 == 1836476516 || i13 == 1936286840 || i13 == 1937011556 || i13 == 1937011827 || i13 == 1668576371 || i13 == 1937011555 || i13 == 1937011578 || i13 == 1937013298 || i13 == 1937007471 || i13 == 1668232756 || i13 == 1937011571 || i13 == 1952867444 || i13 == 1952868452 || i13 == 1953196132 || i13 == 1953654136 || i13 == 1953658222 || i13 == 1886614376 || i13 == 1935763834 || i13 == 1935763823 || i13 == 1936027235 || i13 == 1970628964 || i13 == 1935828848 || i13 == 1936158820 || i13 == 1701606260 || i13 == 1835362404 || i13 == 1701671783) {
                    if (this.v != 8) {
                        throw r7k.c("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.u > 2147483647L) {
                        throw r7k.c("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    d7k d7kVar5 = new d7k((int) this.u);
                    System.arraycopy(d7kVar4.a, 0, d7kVar5.a, 0, 8);
                    this.w = d7kVar5;
                    this.s = 1;
                } else {
                    if (this.u > 2147483647L) {
                        throw r7k.c("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.w = null;
                    this.s = 1;
                }
            }
        }
    }

    @Override // defpackage.r2c
    public final List i() {
        return this.r;
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        int i;
        String str;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            t2cVar = new z0j(t2cVar, this.a);
        }
        this.I = t2cVar;
        this.s = 0;
        this.v = 0;
        azs[] azsVarArr = new azs[2];
        this.J = azsVarArr;
        azs azsVar = this.q;
        if (azsVar != null) {
            azsVarArr[0] = azsVar;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((i2 & 4) != 0) {
            azsVarArr[i] = t2cVar.M(100, 5);
            i3 = 101;
            i++;
        }
        azs[] azsVarArr2 = (azs[]) dvt.a0(i, this.J);
        this.J = azsVarArr2;
        for (azs azsVar2 : azsVarArr2) {
            azsVar2.d(N);
        }
        List list = this.d;
        this.K = new azs[list.size()];
        int i4 = 0;
        while (i4 < this.K.length) {
            azs M2 = this.I.M(i3, 3);
            M2.d((dsc) list.get(i4));
            this.K[i4] = M2;
            i4++;
            i3++;
        }
        oqs oqsVar = this.c;
        if (oqsVar != null) {
            azs M3 = this.I.M(0, oqsVar.b);
            o0t o0tVar = new o0t(this.c, new long[0], new int[0], 0, new long[0], new int[0], 0L);
            cq7 cq7Var = new cq7(0, 0, 0, 0);
            String str2 = oqsVar.g.n;
            if (l5i.o(str2)) {
                str = "video/mp4";
            } else if (l5i.k(str2)) {
                str = "audio/mp4";
            } else {
                if (l5i.m(str2)) {
                    if (Objects.equals(str2, "image/heic")) {
                        str = "image/heif";
                    } else if (Objects.equals(str2, "image/avif")) {
                        str = "image/avif";
                    }
                }
                str = "application/mp4";
            }
            this.e.put(0, new ivc(M3, o0tVar, cq7Var, str));
            this.I.K();
        }
    }

    @Override // defpackage.r2c
    public final void a() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jvc(spr sprVar, int i) {
        this(sprVar, i, null, null, qsn.e, null);
        ude udeVar = yde.b;
    }
}
