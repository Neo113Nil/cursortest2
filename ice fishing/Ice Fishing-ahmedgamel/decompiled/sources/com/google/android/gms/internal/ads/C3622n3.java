package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.n3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3622n3 extends AbstractC3568m3 {

    /* renamed from: n, reason: collision with root package name */
    public C2590Gf f33449n;

    /* renamed from: o, reason: collision with root package name */
    public int f33450o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f33451p;

    /* renamed from: q, reason: collision with root package name */
    public C3029c1 f33452q;

    /* renamed from: r, reason: collision with root package name */
    public C4201xq f33453r;

    @Override // com.google.android.gms.internal.ads.AbstractC3568m3
    public final void a(boolean z6) {
        super.a(z6);
        if (z6) {
            this.f33449n = null;
            this.f33452q = null;
            this.f33453r = null;
        }
        this.f33450o = 0;
        this.f33451p = false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3568m3
    public final long b(Cr cr) {
        if ((cr.f24997a[0] & 1) == 1) {
            return -1L;
        }
        C2590Gf c2590Gf = this.f33449n;
        c2590Gf.getClass();
        int i = cr.f24997a[0] >> 1;
        boolean z6 = ((R2[]) c2590Gf.f25833x)[i & (com.anythink.basead.exoplayer.k.p.f9259b >>> (8 - QC.a(r4.length - 1)))].f27915u;
        C3029c1 c3029c1 = (C3029c1) c2590Gf.f25830u;
        int i4 = z6 ? c3029c1.f30196f : c3029c1.f30195e;
        int i6 = this.f33451p ? (this.f33450o + i4) / 4 : 0;
        byte[] bArr = cr.f24997a;
        int length = bArr.length;
        int i9 = cr.f24999c;
        if (length < i9 + 4) {
            byte[] copyOf = Arrays.copyOf(bArr, i9 + 4);
            cr.z(copyOf.length, copyOf);
        } else {
            cr.C(i9 + 4);
        }
        long j6 = i6;
        byte[] bArr2 = cr.f24997a;
        int i10 = cr.f24999c;
        bArr2[i10 - 4] = (byte) (j6 & 255);
        bArr2[i10 - 3] = (byte) ((j6 >>> 8) & 255);
        bArr2[i10 - 2] = (byte) ((j6 >>> 16) & 255);
        bArr2[i10 - 1] = (byte) ((j6 >>> 24) & 255);
        this.f33451p = true;
        this.f33450o = i4;
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3568m3
    public final boolean c(Cr cr, long j6, S0.c cVar) {
        C2590Gf c2590Gf;
        C3029c1 c3029c1;
        int i;
        int i4;
        C3029c1 c3029c12;
        long j9;
        if (this.f33449n != null) {
            ((DP) cVar.f2902u).getClass();
            return false;
        }
        C3029c1 c3029c13 = this.f33452q;
        int i6 = 1;
        int i9 = 4;
        if (c3029c13 == null) {
            QC.m(1, cr, false);
            cr.i();
            int K7 = cr.K();
            int i10 = cr.i();
            int c9 = cr.c();
            if (c9 <= 0) {
                c9 = -1;
            }
            int c10 = cr.c();
            int i11 = c10 <= 0 ? -1 : c10;
            cr.c();
            int K8 = cr.K();
            int pow = (int) Math.pow(2.0d, K8 & 15);
            int pow2 = (int) Math.pow(2.0d, (K8 & 240) >> 4);
            cr.K();
            byte[] copyOf = Arrays.copyOf(cr.f24997a, cr.f24999c);
            C3029c1 c3029c14 = new C3029c1();
            c3029c14.f30191a = K7;
            c3029c14.f30192b = i10;
            c3029c14.f30193c = c9;
            c3029c14.f30194d = i11;
            c3029c14.f30195e = pow;
            c3029c14.f30196f = pow2;
            c3029c14.f30197g = copyOf;
            this.f33452q = c3029c14;
        } else {
            C4201xq c4201xq = this.f33453r;
            if (c4201xq == null) {
                this.f33453r = QC.h(cr, true, true);
            } else {
                int i12 = cr.f24999c;
                byte[] bArr = new byte[i12];
                System.arraycopy(cr.f24997a, 0, bArr, 0, i12);
                int i13 = 5;
                QC.m(5, cr, false);
                int K9 = cr.K() + 1;
                N6.c cVar2 = new N6.c(cr.f24997a, 1);
                int i14 = 8;
                cVar2.e(cr.f24998b * 8);
                int i15 = 0;
                while (true) {
                    int i16 = 2;
                    int i17 = 16;
                    if (i15 < K9) {
                        int i18 = i14;
                        if (cVar2.d(24) != 5653314) {
                            int i19 = (cVar2.f2047c * 8) + cVar2.f2048d;
                            StringBuilder sb = new StringBuilder(String.valueOf(i19).length() + 55);
                            sb.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb.append(i19);
                            throw U4.a(null, sb.toString());
                        }
                        int d9 = cVar2.d(16);
                        int d10 = cVar2.d(24);
                        if (cVar2.c()) {
                            cVar2.e(5);
                            for (int i20 = 0; i20 < d10; i20 += cVar2.d(QC.a(d10 - i20))) {
                            }
                        } else {
                            boolean c11 = cVar2.c();
                            for (int i21 = 0; i21 < d10; i21++) {
                                if (!c11) {
                                    cVar2.e(5);
                                } else if (cVar2.c()) {
                                    cVar2.e(5);
                                }
                            }
                        }
                        int d11 = cVar2.d(i9);
                        if (d11 > 2) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(d11).length() + 42);
                            sb2.append("lookup type greater than 2 not decodable: ");
                            sb2.append(d11);
                            throw U4.a(null, sb2.toString());
                        }
                        if (d11 == 1) {
                            i16 = d11;
                        } else if (d11 != 2) {
                            c3029c12 = c3029c13;
                            i15++;
                            i14 = i18;
                            c3029c13 = c3029c12;
                            i9 = 4;
                        }
                        cVar2.e(32);
                        cVar2.e(32);
                        int d12 = cVar2.d(i9) + 1;
                        cVar2.e(1);
                        if (i16 != 1) {
                            c3029c12 = c3029c13;
                            j9 = d9 * d10;
                        } else if (d9 != 0) {
                            c3029c12 = c3029c13;
                            j9 = (long) Math.floor(Math.pow(d10, 1.0d / d9));
                        } else {
                            c3029c12 = c3029c13;
                            j9 = 0;
                        }
                        cVar2.e((int) (j9 * d12));
                        i15++;
                        i14 = i18;
                        c3029c13 = c3029c12;
                        i9 = 4;
                    } else {
                        C3029c1 c3029c15 = c3029c13;
                        int i22 = i14;
                        int i23 = 6;
                        int d13 = cVar2.d(6) + 1;
                        for (int i24 = 0; i24 < d13; i24++) {
                            if (cVar2.d(16) != 0) {
                                throw U4.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int d14 = cVar2.d(6) + 1;
                        int i25 = 0;
                        while (true) {
                            int i26 = 3;
                            if (i25 < d14) {
                                int d15 = cVar2.d(i17);
                                if (d15 == 0) {
                                    int i27 = i22;
                                    i = i6;
                                    cVar2.e(i27);
                                    cVar2.e(16);
                                    cVar2.e(16);
                                    cVar2.e(6);
                                    cVar2.e(i27);
                                    int d16 = cVar2.d(4) + 1;
                                    int i28 = 0;
                                    while (i28 < d16) {
                                        cVar2.e(i27);
                                        i28++;
                                        i27 = 8;
                                    }
                                } else {
                                    if (d15 != i6) {
                                        StringBuilder sb3 = new StringBuilder(Wv.b(d15, 41));
                                        sb3.append("floor type greater than 1 not decodable: ");
                                        sb3.append(d15);
                                        throw U4.a(null, sb3.toString());
                                    }
                                    int d17 = cVar2.d(i13);
                                    int[] iArr = new int[d17];
                                    i = i6;
                                    int i29 = -1;
                                    for (int i30 = 0; i30 < d17; i30++) {
                                        int d18 = cVar2.d(4);
                                        iArr[i30] = d18;
                                        if (d18 > i29) {
                                            i29 = d18;
                                        }
                                    }
                                    int i31 = i29 + 1;
                                    int[] iArr2 = new int[i31];
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        iArr2[i32] = cVar2.d(i26) + 1;
                                        int d19 = cVar2.d(i16);
                                        if (d19 > 0) {
                                            i4 = i22;
                                            cVar2.e(i4);
                                        } else {
                                            i4 = i22;
                                        }
                                        int i33 = 0;
                                        while (i33 < (i << d19)) {
                                            cVar2.e(i4);
                                            i33++;
                                            i4 = 8;
                                        }
                                        i32++;
                                        i22 = 8;
                                        i16 = 2;
                                        i26 = 3;
                                    }
                                    cVar2.e(i16);
                                    int d20 = cVar2.d(4);
                                    int i34 = 0;
                                    int i35 = 0;
                                    for (int i36 = 0; i36 < d17; i36++) {
                                        i34 += iArr2[iArr[i36]];
                                        while (i35 < i34) {
                                            cVar2.e(d20);
                                            i35++;
                                        }
                                    }
                                }
                                i25++;
                                i6 = i;
                                i22 = 8;
                                i23 = 6;
                                i16 = 2;
                                i17 = 16;
                                i13 = 5;
                            } else {
                                int i37 = i6;
                                int d21 = cVar2.d(i23) + 1;
                                int i38 = 0;
                                while (i38 < d21) {
                                    if (cVar2.d(16) > 2) {
                                        throw U4.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    cVar2.e(24);
                                    cVar2.e(24);
                                    cVar2.e(24);
                                    int d22 = cVar2.d(i23) + 1;
                                    int i39 = 8;
                                    cVar2.e(8);
                                    int[] iArr3 = new int[d22];
                                    for (int i40 = 0; i40 < d22; i40++) {
                                        iArr3[i40] = ((cVar2.c() ? cVar2.d(5) : 0) * 8) + cVar2.d(3);
                                    }
                                    int i41 = 0;
                                    while (i41 < d22) {
                                        int i42 = 0;
                                        while (i42 < i39) {
                                            if ((iArr3[i41] & (i37 << i42)) != 0) {
                                                cVar2.e(i39);
                                            }
                                            i42++;
                                            i39 = 8;
                                        }
                                        i41++;
                                        i39 = 8;
                                    }
                                    i38++;
                                    i23 = 6;
                                }
                                int d23 = cVar2.d(i23) + 1;
                                int i43 = 0;
                                while (i43 < d23) {
                                    int d24 = cVar2.d(16);
                                    if (d24 != 0) {
                                        StringBuilder sb4 = new StringBuilder(Wv.b(d24, 41));
                                        sb4.append("mapping type other than 0 not supported: ");
                                        sb4.append(d24);
                                        AbstractC2991bG.H("VorbisUtil", sb4.toString());
                                        c3029c1 = c3029c15;
                                    } else {
                                        int d25 = cVar2.c() ? cVar2.d(4) + 1 : i37;
                                        boolean c12 = cVar2.c();
                                        c3029c1 = c3029c15;
                                        int i44 = c3029c1.f30191a;
                                        if (c12) {
                                            int d26 = cVar2.d(8) + 1;
                                            for (int i45 = 0; i45 < d26; i45++) {
                                                int i46 = i44 - 1;
                                                cVar2.e(QC.a(i46));
                                                cVar2.e(QC.a(i46));
                                            }
                                        }
                                        if (cVar2.d(2) != 0) {
                                            throw U4.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (d25 > i37) {
                                            for (int i47 = 0; i47 < i44; i47++) {
                                                cVar2.e(4);
                                            }
                                        }
                                        for (int i48 = 0; i48 < d25; i48++) {
                                            cVar2.e(8);
                                            cVar2.e(8);
                                            cVar2.e(8);
                                        }
                                    }
                                    i43++;
                                    c3029c15 = c3029c1;
                                    i37 = 1;
                                }
                                C3029c1 c3029c16 = c3029c15;
                                int d27 = cVar2.d(6) + 1;
                                R2[] r2Arr = new R2[d27];
                                for (int i49 = 0; i49 < d27; i49++) {
                                    boolean c13 = cVar2.c();
                                    cVar2.d(16);
                                    cVar2.d(16);
                                    cVar2.d(8);
                                    r2Arr[i49] = new R2(6, c13);
                                }
                                if (!cVar2.c()) {
                                    throw U4.a(null, "framing bit after modes not set as expected");
                                }
                                c2590Gf = new C2590Gf(c3029c16, c4201xq, bArr, r2Arr, 2);
                            }
                        }
                    }
                }
            }
        }
        c2590Gf = null;
        this.f33449n = c2590Gf;
        if (c2590Gf == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        C3029c1 c3029c17 = (C3029c1) c2590Gf.f25830u;
        arrayList.add((byte[]) c3029c17.f30197g);
        arrayList.add((byte[]) c2590Gf.f25832w);
        O3 a9 = AbstractC3674o1.a(RB.o((String[]) ((C4201xq) c2590Gf.f25831v).f35841u));
        C3322hP c3322hP = new C3322hP();
        c3322hP.d("audio/ogg");
        c3322hP.e(com.anythink.basead.exoplayer.k.o.f9212G);
        c3322hP.f31553h = c3029c17.f30194d;
        c3322hP.i = c3029c17.f30193c;
        c3322hP.f31538G = c3029c17.f30191a;
        c3322hP.f31540I = c3029c17.f30192b;
        c3322hP.f31561q = arrayList;
        c3322hP.f31555k = a9;
        cVar.f2902u = new DP(c3322hP);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3568m3
    public final void d(long j6) {
        this.f32666g = j6;
        this.f33451p = j6 != 0;
        C3029c1 c3029c1 = this.f33452q;
        this.f33450o = c3029c1 != null ? c3029c1.f30195e : 0;
    }
}
