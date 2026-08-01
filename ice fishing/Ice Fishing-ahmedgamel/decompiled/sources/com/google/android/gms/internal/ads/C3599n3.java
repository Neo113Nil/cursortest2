package com.google.android.gms.internal.ads;

import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.n3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3599n3 extends AbstractC3545m3 {

    /* renamed from: n, reason: collision with root package name */
    public C2570Gf f32671n;

    /* renamed from: o, reason: collision with root package name */
    public int f32672o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f32673p;

    /* renamed from: q, reason: collision with root package name */
    public C3006c1 f32674q;

    /* renamed from: r, reason: collision with root package name */
    public C4178xq f32675r;

    @Override // com.google.android.gms.internal.ads.AbstractC3545m3
    public final void a(boolean z3) {
        super.a(z3);
        if (z3) {
            this.f32671n = null;
            this.f32674q = null;
            this.f32675r = null;
        }
        this.f32672o = 0;
        this.f32673p = false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3545m3
    public final long b(Cr cr) {
        if ((cr.f24252a[0] & 1) == 1) {
            return -1L;
        }
        C2570Gf c2570Gf = this.f32671n;
        c2570Gf.getClass();
        int i = cr.f24252a[0] >> 1;
        boolean z3 = ((R2[]) c2570Gf.f25045x)[i & (com.anythink.basead.exoplayer.k.p.f8473b >>> (8 - QC.a(r4.length - 1)))].f27159u;
        C3006c1 c3006c1 = (C3006c1) c2570Gf.f25042u;
        int i6 = z3 ? c3006c1.f29413f : c3006c1.f29412e;
        int i9 = this.f32673p ? (this.f32672o + i6) / 4 : 0;
        byte[] bArr = cr.f24252a;
        int length = bArr.length;
        int i10 = cr.f24254c;
        if (length < i10 + 4) {
            byte[] copyOf = Arrays.copyOf(bArr, i10 + 4);
            cr.z(copyOf.length, copyOf);
        } else {
            cr.C(i10 + 4);
        }
        long j6 = i9;
        byte[] bArr2 = cr.f24252a;
        int i11 = cr.f24254c;
        bArr2[i11 - 4] = (byte) (j6 & 255);
        bArr2[i11 - 3] = (byte) ((j6 >>> 8) & 255);
        bArr2[i11 - 2] = (byte) ((j6 >>> 16) & 255);
        bArr2[i11 - 1] = (byte) ((j6 >>> 24) & 255);
        this.f32673p = true;
        this.f32672o = i6;
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3545m3
    public final boolean c(Cr cr, long j6, S0.c cVar) {
        C2570Gf c2570Gf;
        C3006c1 c3006c1;
        int i;
        int i6;
        C3006c1 c3006c12;
        long j9;
        if (this.f32671n != null) {
            ((DP) cVar.f2775u).getClass();
            return false;
        }
        C3006c1 c3006c13 = this.f32674q;
        int i9 = 1;
        int i10 = 4;
        if (c3006c13 == null) {
            QC.m(1, cr, false);
            cr.i();
            int K7 = cr.K();
            int i11 = cr.i();
            int c9 = cr.c();
            if (c9 <= 0) {
                c9 = -1;
            }
            int c10 = cr.c();
            int i12 = c10 <= 0 ? -1 : c10;
            cr.c();
            int K8 = cr.K();
            int pow = (int) Math.pow(2.0d, K8 & 15);
            int pow2 = (int) Math.pow(2.0d, (K8 & 240) >> 4);
            cr.K();
            byte[] copyOf = Arrays.copyOf(cr.f24252a, cr.f24254c);
            C3006c1 c3006c14 = new C3006c1();
            c3006c14.f29408a = K7;
            c3006c14.f29409b = i11;
            c3006c14.f29410c = c9;
            c3006c14.f29411d = i12;
            c3006c14.f29412e = pow;
            c3006c14.f29413f = pow2;
            c3006c14.f29414g = copyOf;
            this.f32674q = c3006c14;
        } else {
            C4178xq c4178xq = this.f32675r;
            if (c4178xq == null) {
                this.f32675r = QC.h(cr, true, true);
            } else {
                int i13 = cr.f24254c;
                byte[] bArr = new byte[i13];
                System.arraycopy(cr.f24252a, 0, bArr, 0, i13);
                int i14 = 5;
                QC.m(5, cr, false);
                int K9 = cr.K() + 1;
                N6.c cVar2 = new N6.c(cr.f24252a, 1);
                int i15 = 8;
                cVar2.e(cr.f24253b * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 2;
                    int i18 = 16;
                    if (i16 < K9) {
                        int i19 = i15;
                        if (cVar2.d(24) != 5653314) {
                            int i20 = (cVar2.f1959c * 8) + cVar2.f1960d;
                            StringBuilder sb = new StringBuilder(String.valueOf(i20).length() + 55);
                            sb.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb.append(i20);
                            throw U4.a(null, sb.toString());
                        }
                        int d2 = cVar2.d(16);
                        int d9 = cVar2.d(24);
                        if (cVar2.c()) {
                            cVar2.e(5);
                            for (int i21 = 0; i21 < d9; i21 += cVar2.d(QC.a(d9 - i21))) {
                            }
                        } else {
                            boolean c11 = cVar2.c();
                            for (int i22 = 0; i22 < d9; i22++) {
                                if (!c11) {
                                    cVar2.e(5);
                                } else if (cVar2.c()) {
                                    cVar2.e(5);
                                }
                            }
                        }
                        int d10 = cVar2.d(i10);
                        if (d10 > 2) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 42);
                            sb2.append("lookup type greater than 2 not decodable: ");
                            sb2.append(d10);
                            throw U4.a(null, sb2.toString());
                        }
                        if (d10 == 1) {
                            i17 = d10;
                        } else if (d10 != 2) {
                            c3006c12 = c3006c13;
                            i16++;
                            i15 = i19;
                            c3006c13 = c3006c12;
                            i10 = 4;
                        }
                        cVar2.e(32);
                        cVar2.e(32);
                        int d11 = cVar2.d(i10) + 1;
                        cVar2.e(1);
                        if (i17 != 1) {
                            c3006c12 = c3006c13;
                            j9 = d2 * d9;
                        } else if (d2 != 0) {
                            c3006c12 = c3006c13;
                            j9 = (long) Math.floor(Math.pow(d9, 1.0d / d2));
                        } else {
                            c3006c12 = c3006c13;
                            j9 = 0;
                        }
                        cVar2.e((int) (j9 * d11));
                        i16++;
                        i15 = i19;
                        c3006c13 = c3006c12;
                        i10 = 4;
                    } else {
                        C3006c1 c3006c15 = c3006c13;
                        int i23 = i15;
                        int i24 = 6;
                        int d12 = cVar2.d(6) + 1;
                        for (int i25 = 0; i25 < d12; i25++) {
                            if (cVar2.d(16) != 0) {
                                throw U4.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int d13 = cVar2.d(6) + 1;
                        int i26 = 0;
                        while (true) {
                            int i27 = 3;
                            if (i26 < d13) {
                                int d14 = cVar2.d(i18);
                                if (d14 == 0) {
                                    int i28 = i23;
                                    i = i9;
                                    cVar2.e(i28);
                                    cVar2.e(16);
                                    cVar2.e(16);
                                    cVar2.e(6);
                                    cVar2.e(i28);
                                    int d15 = cVar2.d(4) + 1;
                                    int i29 = 0;
                                    while (i29 < d15) {
                                        cVar2.e(i28);
                                        i29++;
                                        i28 = 8;
                                    }
                                } else {
                                    if (d14 != i9) {
                                        StringBuilder sb3 = new StringBuilder(AbstractC4404f.b(d14, 41));
                                        sb3.append("floor type greater than 1 not decodable: ");
                                        sb3.append(d14);
                                        throw U4.a(null, sb3.toString());
                                    }
                                    int d16 = cVar2.d(i14);
                                    int[] iArr = new int[d16];
                                    i = i9;
                                    int i30 = -1;
                                    for (int i31 = 0; i31 < d16; i31++) {
                                        int d17 = cVar2.d(4);
                                        iArr[i31] = d17;
                                        if (d17 > i30) {
                                            i30 = d17;
                                        }
                                    }
                                    int i32 = i30 + 1;
                                    int[] iArr2 = new int[i32];
                                    int i33 = 0;
                                    while (i33 < i32) {
                                        iArr2[i33] = cVar2.d(i27) + 1;
                                        int d18 = cVar2.d(i17);
                                        if (d18 > 0) {
                                            i6 = i23;
                                            cVar2.e(i6);
                                        } else {
                                            i6 = i23;
                                        }
                                        int i34 = 0;
                                        while (i34 < (i << d18)) {
                                            cVar2.e(i6);
                                            i34++;
                                            i6 = 8;
                                        }
                                        i33++;
                                        i23 = 8;
                                        i17 = 2;
                                        i27 = 3;
                                    }
                                    cVar2.e(i17);
                                    int d19 = cVar2.d(4);
                                    int i35 = 0;
                                    int i36 = 0;
                                    for (int i37 = 0; i37 < d16; i37++) {
                                        i35 += iArr2[iArr[i37]];
                                        while (i36 < i35) {
                                            cVar2.e(d19);
                                            i36++;
                                        }
                                    }
                                }
                                i26++;
                                i9 = i;
                                i23 = 8;
                                i24 = 6;
                                i17 = 2;
                                i18 = 16;
                                i14 = 5;
                            } else {
                                int i38 = i9;
                                int d20 = cVar2.d(i24) + 1;
                                int i39 = 0;
                                while (i39 < d20) {
                                    if (cVar2.d(16) > 2) {
                                        throw U4.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    cVar2.e(24);
                                    cVar2.e(24);
                                    cVar2.e(24);
                                    int d21 = cVar2.d(i24) + 1;
                                    int i40 = 8;
                                    cVar2.e(8);
                                    int[] iArr3 = new int[d21];
                                    for (int i41 = 0; i41 < d21; i41++) {
                                        iArr3[i41] = ((cVar2.c() ? cVar2.d(5) : 0) * 8) + cVar2.d(3);
                                    }
                                    int i42 = 0;
                                    while (i42 < d21) {
                                        int i43 = 0;
                                        while (i43 < i40) {
                                            if ((iArr3[i42] & (i38 << i43)) != 0) {
                                                cVar2.e(i40);
                                            }
                                            i43++;
                                            i40 = 8;
                                        }
                                        i42++;
                                        i40 = 8;
                                    }
                                    i39++;
                                    i24 = 6;
                                }
                                int d22 = cVar2.d(i24) + 1;
                                int i44 = 0;
                                while (i44 < d22) {
                                    int d23 = cVar2.d(16);
                                    if (d23 != 0) {
                                        StringBuilder sb4 = new StringBuilder(AbstractC4404f.b(d23, 41));
                                        sb4.append("mapping type other than 0 not supported: ");
                                        sb4.append(d23);
                                        AbstractC2968bG.H("VorbisUtil", sb4.toString());
                                        c3006c1 = c3006c15;
                                    } else {
                                        int d24 = cVar2.c() ? cVar2.d(4) + 1 : i38;
                                        boolean c12 = cVar2.c();
                                        c3006c1 = c3006c15;
                                        int i45 = c3006c1.f29408a;
                                        if (c12) {
                                            int d25 = cVar2.d(8) + 1;
                                            for (int i46 = 0; i46 < d25; i46++) {
                                                int i47 = i45 - 1;
                                                cVar2.e(QC.a(i47));
                                                cVar2.e(QC.a(i47));
                                            }
                                        }
                                        if (cVar2.d(2) != 0) {
                                            throw U4.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (d24 > i38) {
                                            for (int i48 = 0; i48 < i45; i48++) {
                                                cVar2.e(4);
                                            }
                                        }
                                        for (int i49 = 0; i49 < d24; i49++) {
                                            cVar2.e(8);
                                            cVar2.e(8);
                                            cVar2.e(8);
                                        }
                                    }
                                    i44++;
                                    c3006c15 = c3006c1;
                                    i38 = 1;
                                }
                                C3006c1 c3006c16 = c3006c15;
                                int d26 = cVar2.d(6) + 1;
                                R2[] r2Arr = new R2[d26];
                                for (int i50 = 0; i50 < d26; i50++) {
                                    boolean c13 = cVar2.c();
                                    cVar2.d(16);
                                    cVar2.d(16);
                                    cVar2.d(8);
                                    r2Arr[i50] = new R2(6, c13);
                                }
                                if (!cVar2.c()) {
                                    throw U4.a(null, "framing bit after modes not set as expected");
                                }
                                c2570Gf = new C2570Gf(c3006c16, c4178xq, bArr, r2Arr, 2);
                            }
                        }
                    }
                }
            }
        }
        c2570Gf = null;
        this.f32671n = c2570Gf;
        if (c2570Gf == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        C3006c1 c3006c17 = (C3006c1) c2570Gf.f25042u;
        arrayList.add((byte[]) c3006c17.f29414g);
        arrayList.add((byte[]) c2570Gf.f25044w);
        O3 a9 = AbstractC3651o1.a(RB.o((String[]) ((C4178xq) c2570Gf.f25043v).f35055u));
        C3299hP c3299hP = new C3299hP();
        c3299hP.d("audio/ogg");
        c3299hP.e(com.anythink.basead.exoplayer.k.o.f8426G);
        c3299hP.f30787h = c3006c17.f29411d;
        c3299hP.i = c3006c17.f29410c;
        c3299hP.f30772G = c3006c17.f29408a;
        c3299hP.f30774I = c3006c17.f29409b;
        c3299hP.f30795q = arrayList;
        c3299hP.f30789k = a9;
        cVar.f2775u = new DP(c3299hP);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3545m3
    public final void d(long j6) {
        this.f31886g = j6;
        this.f32673p = j6 != 0;
        C3006c1 c3006c1 = this.f32674q;
        this.f32672o = c3006c1 != null ? c3006c1.f29412e : 0;
    }
}
