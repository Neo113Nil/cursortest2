package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.l3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3504l3 extends AbstractC3450k3 {

    /* renamed from: n, reason: collision with root package name */
    public C2518Df f32525n;

    /* renamed from: o, reason: collision with root package name */
    public int f32526o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f32527p;

    /* renamed from: q, reason: collision with root package name */
    public C2906a1 f32528q;

    /* renamed from: r, reason: collision with root package name */
    public C2478Aq f32529r;

    @Override // com.google.android.gms.internal.ads.AbstractC3450k3
    public final void a(boolean z8) {
        super.a(z8);
        if (z8) {
            this.f32525n = null;
            this.f32528q = null;
            this.f32529r = null;
        }
        this.f32526o = 0;
        this.f32527p = false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3450k3
    public final long b(Lr lr) {
        if ((lr.f26233a[0] & 1) == 1) {
            return -1L;
        }
        C2518Df c2518Df = this.f32525n;
        c2518Df.getClass();
        int i = lr.f26233a[0] >> 1;
        boolean z8 = ((O2[]) c2518Df.f24456x)[i & (com.anythink.basead.exoplayer.k.p.f8630b >>> (8 - C3686oN.a(r4.length - 1)))].f26640u;
        C2906a1 c2906a1 = (C2906a1) c2518Df.f24453u;
        int i4 = z8 ? c2906a1.f29158f : c2906a1.f29157e;
        int i9 = this.f32527p ? (this.f32526o + i4) / 4 : 0;
        byte[] bArr = lr.f26233a;
        int length = bArr.length;
        int i10 = lr.f26235c;
        if (length < i10 + 4) {
            byte[] copyOf = Arrays.copyOf(bArr, i10 + 4);
            lr.z(copyOf.length, copyOf);
        } else {
            lr.C(i10 + 4);
        }
        long j9 = i9;
        byte[] bArr2 = lr.f26233a;
        int i11 = lr.f26235c;
        bArr2[i11 - 4] = (byte) (j9 & 255);
        bArr2[i11 - 3] = (byte) ((j9 >>> 8) & 255);
        bArr2[i11 - 2] = (byte) ((j9 >>> 16) & 255);
        bArr2[i11 - 1] = (byte) ((j9 >>> 24) & 255);
        this.f32527p = true;
        this.f32526o = i4;
        return j9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3450k3
    public final boolean c(Lr lr, long j9, C2881Yl c2881Yl) {
        C2518Df c2518Df;
        C2906a1 c2906a1;
        int i;
        int i4;
        C2906a1 c2906a12;
        long j10;
        if (this.f32525n != null) {
            ((TP) c2881Yl.f28862u).getClass();
            return false;
        }
        C2906a1 c2906a13 = this.f32528q;
        int i9 = 1;
        int i10 = 4;
        if (c2906a13 == null) {
            C3686oN.m(1, lr, false);
            lr.i();
            int K8 = lr.K();
            int i11 = lr.i();
            int c4 = lr.c();
            if (c4 <= 0) {
                c4 = -1;
            }
            int c9 = lr.c();
            int i12 = c9 <= 0 ? -1 : c9;
            lr.c();
            int K9 = lr.K();
            int pow = (int) Math.pow(2.0d, K9 & 15);
            int pow2 = (int) Math.pow(2.0d, (K9 & 240) >> 4);
            lr.K();
            byte[] copyOf = Arrays.copyOf(lr.f26233a, lr.f26235c);
            C2906a1 c2906a14 = new C2906a1();
            c2906a14.f29153a = K8;
            c2906a14.f29154b = i11;
            c2906a14.f29155c = c4;
            c2906a14.f29156d = i12;
            c2906a14.f29157e = pow;
            c2906a14.f29158f = pow2;
            c2906a14.f29159g = copyOf;
            this.f32528q = c2906a14;
        } else {
            C2478Aq c2478Aq = this.f32529r;
            if (c2478Aq == null) {
                this.f32529r = C3686oN.h(lr, true, true);
            } else {
                int i13 = lr.f26235c;
                byte[] bArr = new byte[i13];
                System.arraycopy(lr.f26233a, 0, bArr, 0, i13);
                int i14 = 5;
                C3686oN.m(5, lr, false);
                int K10 = lr.K() + 1;
                J6.c cVar = new J6.c(lr.f26233a, 1);
                int i15 = 8;
                cVar.e(lr.f26234b * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 2;
                    int i18 = 16;
                    if (i16 < K10) {
                        int i19 = i15;
                        if (cVar.d(24) != 5653314) {
                            int i20 = (cVar.f1406c * 8) + cVar.f1407d;
                            StringBuilder sb = new StringBuilder(String.valueOf(i20).length() + 55);
                            sb.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb.append(i20);
                            throw W4.a(null, sb.toString());
                        }
                        int d2 = cVar.d(16);
                        int d3 = cVar.d(24);
                        if (cVar.c()) {
                            cVar.e(5);
                            for (int i21 = 0; i21 < d3; i21 += cVar.d(C3686oN.a(d3 - i21))) {
                            }
                        } else {
                            boolean c10 = cVar.c();
                            for (int i22 = 0; i22 < d3; i22++) {
                                if (!c10) {
                                    cVar.e(5);
                                } else if (cVar.c()) {
                                    cVar.e(5);
                                }
                            }
                        }
                        int d9 = cVar.d(i10);
                        if (d9 > 2) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(d9).length() + 42);
                            sb2.append("lookup type greater than 2 not decodable: ");
                            sb2.append(d9);
                            throw W4.a(null, sb2.toString());
                        }
                        if (d9 == 1) {
                            i17 = d9;
                        } else if (d9 != 2) {
                            c2906a12 = c2906a13;
                            i16++;
                            i15 = i19;
                            c2906a13 = c2906a12;
                            i10 = 4;
                        }
                        cVar.e(32);
                        cVar.e(32);
                        int d10 = cVar.d(i10) + 1;
                        cVar.e(1);
                        if (i17 != 1) {
                            c2906a12 = c2906a13;
                            j10 = d2 * d3;
                        } else if (d2 != 0) {
                            c2906a12 = c2906a13;
                            j10 = (long) Math.floor(Math.pow(d3, 1.0d / d2));
                        } else {
                            c2906a12 = c2906a13;
                            j10 = 0;
                        }
                        cVar.e((int) (j10 * d10));
                        i16++;
                        i15 = i19;
                        c2906a13 = c2906a12;
                        i10 = 4;
                    } else {
                        C2906a1 c2906a15 = c2906a13;
                        int i23 = i15;
                        int i24 = 6;
                        int d11 = cVar.d(6) + 1;
                        for (int i25 = 0; i25 < d11; i25++) {
                            if (cVar.d(16) != 0) {
                                throw W4.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int d12 = cVar.d(6) + 1;
                        int i26 = 0;
                        while (true) {
                            int i27 = 3;
                            if (i26 < d12) {
                                int d13 = cVar.d(i18);
                                if (d13 == 0) {
                                    int i28 = i23;
                                    i = i9;
                                    cVar.e(i28);
                                    cVar.e(16);
                                    cVar.e(16);
                                    cVar.e(6);
                                    cVar.e(i28);
                                    int d14 = cVar.d(4) + 1;
                                    int i29 = 0;
                                    while (i29 < d14) {
                                        cVar.e(i28);
                                        i29++;
                                        i28 = 8;
                                    }
                                } else {
                                    if (d13 != i9) {
                                        StringBuilder sb3 = new StringBuilder(CL.b(d13, 41));
                                        sb3.append("floor type greater than 1 not decodable: ");
                                        sb3.append(d13);
                                        throw W4.a(null, sb3.toString());
                                    }
                                    int d15 = cVar.d(i14);
                                    int[] iArr = new int[d15];
                                    i = i9;
                                    int i30 = -1;
                                    for (int i31 = 0; i31 < d15; i31++) {
                                        int d16 = cVar.d(4);
                                        iArr[i31] = d16;
                                        if (d16 > i30) {
                                            i30 = d16;
                                        }
                                    }
                                    int i32 = i30 + 1;
                                    int[] iArr2 = new int[i32];
                                    int i33 = 0;
                                    while (i33 < i32) {
                                        iArr2[i33] = cVar.d(i27) + 1;
                                        int d17 = cVar.d(i17);
                                        if (d17 > 0) {
                                            i4 = i23;
                                            cVar.e(i4);
                                        } else {
                                            i4 = i23;
                                        }
                                        int i34 = 0;
                                        while (i34 < (i << d17)) {
                                            cVar.e(i4);
                                            i34++;
                                            i4 = 8;
                                        }
                                        i33++;
                                        i23 = 8;
                                        i17 = 2;
                                        i27 = 3;
                                    }
                                    cVar.e(i17);
                                    int d18 = cVar.d(4);
                                    int i35 = 0;
                                    int i36 = 0;
                                    for (int i37 = 0; i37 < d15; i37++) {
                                        i35 += iArr2[iArr[i37]];
                                        while (i36 < i35) {
                                            cVar.e(d18);
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
                                int d19 = cVar.d(i24) + 1;
                                int i39 = 0;
                                while (i39 < d19) {
                                    if (cVar.d(16) > 2) {
                                        throw W4.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    cVar.e(24);
                                    cVar.e(24);
                                    cVar.e(24);
                                    int d20 = cVar.d(i24) + 1;
                                    int i40 = 8;
                                    cVar.e(8);
                                    int[] iArr3 = new int[d20];
                                    for (int i41 = 0; i41 < d20; i41++) {
                                        iArr3[i41] = ((cVar.c() ? cVar.d(5) : 0) * 8) + cVar.d(3);
                                    }
                                    int i42 = 0;
                                    while (i42 < d20) {
                                        int i43 = 0;
                                        while (i43 < i40) {
                                            if ((iArr3[i42] & (i38 << i43)) != 0) {
                                                cVar.e(i40);
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
                                int d21 = cVar.d(i24) + 1;
                                int i44 = 0;
                                while (i44 < d21) {
                                    int d22 = cVar.d(16);
                                    if (d22 != 0) {
                                        StringBuilder sb4 = new StringBuilder(CL.b(d22, 41));
                                        sb4.append("mapping type other than 0 not supported: ");
                                        sb4.append(d22);
                                        AbstractC3217fl.T("VorbisUtil", sb4.toString());
                                        c2906a1 = c2906a15;
                                    } else {
                                        int d23 = cVar.c() ? cVar.d(4) + 1 : i38;
                                        boolean c11 = cVar.c();
                                        c2906a1 = c2906a15;
                                        int i45 = c2906a1.f29153a;
                                        if (c11) {
                                            int d24 = cVar.d(8) + 1;
                                            for (int i46 = 0; i46 < d24; i46++) {
                                                int i47 = i45 - 1;
                                                cVar.e(C3686oN.a(i47));
                                                cVar.e(C3686oN.a(i47));
                                            }
                                        }
                                        if (cVar.d(2) != 0) {
                                            throw W4.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (d23 > i38) {
                                            for (int i48 = 0; i48 < i45; i48++) {
                                                cVar.e(4);
                                            }
                                        }
                                        for (int i49 = 0; i49 < d23; i49++) {
                                            cVar.e(8);
                                            cVar.e(8);
                                            cVar.e(8);
                                        }
                                    }
                                    i44++;
                                    c2906a15 = c2906a1;
                                    i38 = 1;
                                }
                                C2906a1 c2906a16 = c2906a15;
                                int d25 = cVar.d(6) + 1;
                                O2[] o2Arr = new O2[d25];
                                for (int i50 = 0; i50 < d25; i50++) {
                                    boolean c12 = cVar.c();
                                    cVar.d(16);
                                    cVar.d(16);
                                    cVar.d(8);
                                    o2Arr[i50] = new O2(6, c12);
                                }
                                if (!cVar.c()) {
                                    throw W4.a(null, "framing bit after modes not set as expected");
                                }
                                c2518Df = new C2518Df(c2906a16, c2478Aq, bArr, o2Arr, 2);
                            }
                        }
                    }
                }
            }
        }
        c2518Df = null;
        this.f32525n = c2518Df;
        if (c2518Df == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        C2906a1 c2906a17 = (C2906a1) c2518Df.f24453u;
        arrayList.add((byte[]) c2906a17.f29159g);
        arrayList.add((byte[]) c2518Df.f24455w);
        R3 a9 = AbstractC3556m1.a(UB.o((String[]) ((C2478Aq) c2518Df.f24454v).f23905u));
        C4065vP c4065vP = new C4065vP();
        c4065vP.d("audio/ogg");
        c4065vP.e(com.anythink.basead.exoplayer.k.o.f8583G);
        c4065vP.f34780h = c2906a17.f29156d;
        c4065vP.i = c2906a17.f29155c;
        c4065vP.f34765F = c2906a17.f29153a;
        c4065vP.f34767H = c2906a17.f29154b;
        c4065vP.f34788q = arrayList;
        c4065vP.f34782k = a9;
        c2881Yl.f28862u = new TP(c4065vP);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3450k3
    public final void d(long j9) {
        this.f32242g = j9;
        this.f32527p = j9 != 0;
        C2906a1 c2906a1 = this.f32528q;
        this.f32526o = c2906a1 != null ? c2906a1.f29157e : 0;
    }
}
