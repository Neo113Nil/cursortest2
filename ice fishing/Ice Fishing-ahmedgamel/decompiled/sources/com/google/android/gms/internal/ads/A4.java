package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class A4 implements Q0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f23628e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23629f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23630g;

    /* renamed from: h, reason: collision with root package name */
    public long f23631h;
    public C1 i;

    /* renamed from: j, reason: collision with root package name */
    public CQ f23632j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23633k;

    /* renamed from: a, reason: collision with root package name */
    public final Dt f23624a = new Dt();

    /* renamed from: c, reason: collision with root package name */
    public final Cr f23626c = new Cr(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f23625b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final C4193y4 f23627d = new C4193y4(0);

    static {
        int i = AbstractC2968bG.f29268R;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x022d  */
    @Override // com.google.android.gms.internal.ads.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(R0 r02, U0 u02) {
        int i;
        long j6;
        long j9;
        int i6;
        InterfaceC3384j4 c3492l4;
        CQ cq = this.f23632j;
        cq.getClass();
        long j10 = ((K0) r02).f25818v;
        long j11 = com.anythink.basead.exoplayer.b.f6382b;
        C4193y4 c4193y4 = this.f23627d;
        if (j10 != -1 && !c4193y4.f35088c) {
            boolean z3 = c4193y4.f35090e;
            Cr cr = c4193y4.f35087b;
            if (!z3) {
                K0 k02 = (K0) r02;
                long j12 = k02.f25818v;
                int min = (int) Math.min(20000L, j12);
                long j13 = j12 - min;
                if (k02.f25819w != j13) {
                    u02.f27844n = j13;
                    return 1;
                }
                cr.y(min);
                k02.f25821y = 0;
                k02.A(cr.f24252a, 0, min, false);
                int i9 = cr.f24253b;
                int i10 = cr.f24254c - 4;
                while (true) {
                    if (i10 < i9) {
                        break;
                    }
                    if (C4193y4.c(i10, cr.f24252a) == 442) {
                        cr.E(i10 + 4);
                        long a9 = C4193y4.a(cr);
                        if (a9 != com.anythink.basead.exoplayer.b.f6382b) {
                            j11 = a9;
                            break;
                        }
                    }
                    i10--;
                }
                c4193y4.f35092g = j11;
                c4193y4.f35090e = true;
                return 0;
            }
            if (c4193y4.f35092g == com.anythink.basead.exoplayer.b.f6382b) {
                byte[] bArr = AbstractC3159eu.f29994b;
                int length = bArr.length;
                cr.z(0, bArr);
                c4193y4.f35088c = true;
                ((K0) r02).f25821y = 0;
                return 0;
            }
            if (c4193y4.f35089d) {
                long j14 = c4193y4.f35091f;
                if (j14 == com.anythink.basead.exoplayer.b.f6382b) {
                    byte[] bArr2 = AbstractC3159eu.f29994b;
                    int length2 = bArr2.length;
                    cr.z(0, bArr2);
                    c4193y4.f35088c = true;
                    ((K0) r02).f25821y = 0;
                    return 0;
                }
                Dt dt = c4193y4.f35086a;
                c4193y4.f35093h = dt.d(c4193y4.f35092g) - dt.c(j14);
                byte[] bArr3 = AbstractC3159eu.f29994b;
                int length3 = bArr3.length;
                cr.z(0, bArr3);
                c4193y4.f35088c = true;
                ((K0) r02).f25821y = 0;
                return 0;
            }
            K0 k03 = (K0) r02;
            int min2 = (int) Math.min(20000L, k03.f25818v);
            if (k03.f25819w != 0) {
                u02.f27844n = 0L;
                return 1;
            }
            cr.y(min2);
            k03.f25821y = 0;
            k03.A(cr.f24252a, 0, min2, false);
            int i11 = cr.f24253b;
            int i12 = cr.f24254c;
            while (true) {
                if (i11 >= i12 - 3) {
                    break;
                }
                if (C4193y4.c(i11, cr.f24252a) == 442) {
                    cr.E(i11 + 4);
                    long a10 = C4193y4.a(cr);
                    if (a10 != com.anythink.basead.exoplayer.b.f6382b) {
                        j11 = a10;
                        break;
                    }
                }
                i11++;
            }
            c4193y4.f35091f = j11;
            c4193y4.f35089d = true;
            return 0;
        }
        if (!this.f23633k) {
            this.f23633k = true;
            long j15 = c4193y4.f35093h;
            if (j15 != com.anythink.basead.exoplayer.b.f6382b) {
                C1 c12 = new C1(new V2(11), new S0.l(c4193y4.f35086a), j15, j15 + 1, 0L, j10, 188L, 1000);
                this.i = c12;
                this.f23632j.D(c12.f24008a);
            } else {
                cq.D(new V0(j15, 0L));
            }
        }
        C1 c13 = this.i;
        if (c13 != null && c13.f24010c != null) {
            return c13.b((K0) r02, u02);
        }
        K0 k04 = (K0) r02;
        k04.f25821y = 0;
        long q8 = j10 != -1 ? j10 - k04.q() : -1L;
        if (q8 != -1 && q8 < 4) {
            g();
            return -1;
        }
        Cr cr2 = this.f23626c;
        if (!k04.A(cr2.f24252a, 0, 4, true)) {
            g();
            return -1;
        }
        cr2.E(0);
        int b9 = cr2.b();
        if (b9 == 441) {
            g();
            return -1;
        }
        if (b9 == 442) {
            k04.A(cr2.f24252a, 0, 10, false);
            cr2.E(9);
            k04.a((cr2.K() & 7) + 14, false);
            return 0;
        }
        if (b9 == 443) {
            k04.A(cr2.f24252a, 0, 2, false);
            cr2.E(0);
            k04.a(cr2.L() + 6, false);
            return 0;
        }
        if ((b9 >> 8) != 1) {
            k04.a(1, false);
            return 0;
        }
        int i13 = b9 & com.anythink.basead.exoplayer.k.p.f8473b;
        SparseArray sparseArray = this.f23625b;
        C4247z4 c4247z4 = (C4247z4) sparseArray.get(i13);
        if (!this.f23628e) {
            if (c4247z4 == null) {
                InterfaceC3384j4 interfaceC3384j4 = null;
                if (i13 == 189) {
                    c3492l4 = new C3063d4(0, 0, null, "video/mp2p");
                    this.f23629f = true;
                    this.f23631h = k04.f25819w;
                } else if ((b9 & 224) == 192) {
                    c3492l4 = new C3977u4(null, 0, "video/mp2p");
                    this.f23629f = true;
                    this.f23631h = k04.f25819w;
                } else {
                    if ((b9 & 240) == 224) {
                        c3492l4 = new C3492l4(null, "video/mp2p");
                        this.f23630g = true;
                        this.f23631h = k04.f25819w;
                    }
                    if (interfaceC3384j4 != null) {
                        interfaceC3384j4.a(this.f23632j, new F4(Integer.MIN_VALUE, i13, 256));
                        c4247z4 = new C4247z4(interfaceC3384j4, this.f23624a);
                        sparseArray.put(i13, c4247z4);
                    }
                }
                interfaceC3384j4 = c3492l4;
                if (interfaceC3384j4 != null) {
                }
            }
            long j16 = 1048576;
            if (this.f23629f && this.f23630g) {
                j16 = 8192 + this.f23631h;
            }
            if (k04.f25819w > j16) {
                this.f23628e = true;
                this.f23632j.B();
            }
        }
        k04.A(cr2.f24252a, 0, 2, false);
        cr2.E(0);
        int L6 = cr2.L() + 6;
        if (c4247z4 == null) {
            k04.a(L6, false);
            return 0;
        }
        cr2.y(L6);
        k04.z(cr2.f24252a, 0, L6, false);
        cr2.E(6);
        C4233yr c4233yr = c4247z4.f35279c;
        cr2.H(c4233yr.f35232a, 0, 3);
        c4233yr.d(0);
        c4233yr.f(8);
        c4247z4.f35280d = c4233yr.g();
        c4247z4.f35281e = c4233yr.g();
        c4233yr.f(6);
        cr2.H(c4233yr.f35232a, 0, c4233yr.h(8));
        c4233yr.d(0);
        if (c4247z4.f35280d) {
            c4233yr.f(4);
            long h9 = c4233yr.h(3);
            c4233yr.f(1);
            int h10 = c4233yr.h(15) << 15;
            c4233yr.f(1);
            long h11 = c4233yr.h(15);
            c4233yr.f(1);
            boolean z6 = c4247z4.f35282f;
            Dt dt2 = c4247z4.f35278b;
            if (z6 || !c4247z4.f35281e) {
                i = 0;
                j9 = h9;
                i6 = h10;
            } else {
                c4233yr.f(4);
                i = 0;
                j9 = h9;
                c4233yr.f(1);
                int h12 = c4233yr.h(15) << 15;
                c4233yr.f(1);
                i6 = h10;
                long h13 = c4233yr.h(15);
                c4233yr.f(1);
                dt2.c(h12 | (c4233yr.h(3) << 30) | h13);
                c4247z4.f35282f = true;
            }
            j6 = dt2.c((j9 << 30) | i6 | h11);
        } else {
            i = 0;
            j6 = 0;
        }
        InterfaceC3384j4 interfaceC3384j42 = c4247z4.f35277a;
        interfaceC3384j42.d(4, j6);
        interfaceC3384j42.b(cr2);
        interfaceC3384j42.e();
        cr2.C(cr2.f24252a.length);
        return i;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f23632j = (CQ) s02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r0 != r7) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035 A[LOOP:0: B:18:0x002d->B:20:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j6, long j9) {
        long j10;
        C1 c12;
        int i;
        SparseArray sparseArray;
        Dt dt = this.f23624a;
        synchronized (dt) {
            j10 = dt.f24486b;
        }
        if (j10 != com.anythink.basead.exoplayer.b.f6382b) {
            long a9 = dt.a();
            if (a9 != com.anythink.basead.exoplayer.b.f6382b) {
                if (a9 != 0) {
                }
            }
            c12 = this.i;
            if (c12 != null) {
                c12.a(j9);
            }
            i = 0;
            while (true) {
                sparseArray = this.f23625b;
                if (i < sparseArray.size()) {
                    return;
                }
                C4247z4 c4247z4 = (C4247z4) sparseArray.valueAt(i);
                c4247z4.f35282f = false;
                c4247z4.f35277a.c();
                i++;
            }
        }
        dt.b(j9);
        c12 = this.i;
        if (c12 != null) {
        }
        i = 0;
        while (true) {
            sparseArray = this.f23625b;
            if (i < sparseArray.size()) {
            }
            C4247z4 c4247z42 = (C4247z4) sparseArray.valueAt(i);
            c4247z42.f35282f = false;
            c4247z42.f35277a.c();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        byte[] bArr = new byte[14];
        K0 k02 = (K0) r02;
        k02.A(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            k02.c(bArr[13] & 7, false);
            k02.A(bArr, 0, 3, false);
            if ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255)) == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }

    public final void g() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f23625b;
            if (i >= sparseArray.size()) {
                return;
            }
            ((C4247z4) sparseArray.valueAt(i)).f35277a.p();
            i++;
        }
    }
}
