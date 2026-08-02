package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class A4 implements Q0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f24408e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24409f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24410g;

    /* renamed from: h, reason: collision with root package name */
    public long f24411h;
    public C1 i;

    /* renamed from: j, reason: collision with root package name */
    public FQ f24412j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f24413k;

    /* renamed from: a, reason: collision with root package name */
    public final Dt f24404a = new Dt();

    /* renamed from: c, reason: collision with root package name */
    public final Cr f24406c = new Cr(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f24405b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final C4216y4 f24407d = new C4216y4(0);

    static {
        int i = AbstractC2991bG.f30056R;
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
        int i4;
        InterfaceC3407j4 c3515l4;
        FQ fq = this.f24412j;
        fq.getClass();
        long j10 = ((K0) r02).f26570v;
        long j11 = com.anythink.basead.exoplayer.b.f7168b;
        C4216y4 c4216y4 = this.f24407d;
        if (j10 != -1 && !c4216y4.f35874c) {
            boolean z6 = c4216y4.f35876e;
            Cr cr = c4216y4.f35873b;
            if (!z6) {
                K0 k02 = (K0) r02;
                long j12 = k02.f26570v;
                int min = (int) Math.min(20000L, j12);
                long j13 = j12 - min;
                if (k02.f26571w != j13) {
                    u02.f28641n = j13;
                    return 1;
                }
                cr.y(min);
                k02.f26573y = 0;
                k02.E(cr.f24997a, 0, min, false);
                int i6 = cr.f24998b;
                int i9 = cr.f24999c - 4;
                while (true) {
                    if (i9 < i6) {
                        break;
                    }
                    if (C4216y4.c(i9, cr.f24997a) == 442) {
                        cr.E(i9 + 4);
                        long a9 = C4216y4.a(cr);
                        if (a9 != com.anythink.basead.exoplayer.b.f7168b) {
                            j11 = a9;
                            break;
                        }
                    }
                    i9--;
                }
                c4216y4.f35878g = j11;
                c4216y4.f35876e = true;
                return 0;
            }
            if (c4216y4.f35878g == com.anythink.basead.exoplayer.b.f7168b) {
                byte[] bArr = AbstractC3182eu.f30783b;
                int length = bArr.length;
                cr.z(0, bArr);
                c4216y4.f35874c = true;
                ((K0) r02).f26573y = 0;
                return 0;
            }
            if (c4216y4.f35875d) {
                long j14 = c4216y4.f35877f;
                if (j14 == com.anythink.basead.exoplayer.b.f7168b) {
                    byte[] bArr2 = AbstractC3182eu.f30783b;
                    int length2 = bArr2.length;
                    cr.z(0, bArr2);
                    c4216y4.f35874c = true;
                    ((K0) r02).f26573y = 0;
                    return 0;
                }
                Dt dt = c4216y4.f35872a;
                c4216y4.f35879h = dt.d(c4216y4.f35878g) - dt.c(j14);
                byte[] bArr3 = AbstractC3182eu.f30783b;
                int length3 = bArr3.length;
                cr.z(0, bArr3);
                c4216y4.f35874c = true;
                ((K0) r02).f26573y = 0;
                return 0;
            }
            K0 k03 = (K0) r02;
            int min2 = (int) Math.min(20000L, k03.f26570v);
            if (k03.f26571w != 0) {
                u02.f28641n = 0L;
                return 1;
            }
            cr.y(min2);
            k03.f26573y = 0;
            k03.E(cr.f24997a, 0, min2, false);
            int i10 = cr.f24998b;
            int i11 = cr.f24999c;
            while (true) {
                if (i10 >= i11 - 3) {
                    break;
                }
                if (C4216y4.c(i10, cr.f24997a) == 442) {
                    cr.E(i10 + 4);
                    long a10 = C4216y4.a(cr);
                    if (a10 != com.anythink.basead.exoplayer.b.f7168b) {
                        j11 = a10;
                        break;
                    }
                }
                i10++;
            }
            c4216y4.f35877f = j11;
            c4216y4.f35875d = true;
            return 0;
        }
        if (!this.f24413k) {
            this.f24413k = true;
            long j15 = c4216y4.f35879h;
            if (j15 != com.anythink.basead.exoplayer.b.f7168b) {
                C1 c12 = new C1(new V2(11), new S0.l(c4216y4.f35872a), j15, j15 + 1, 0L, j10, 188L, 1000);
                this.i = c12;
                this.f24412j.D(c12.f24771a);
            } else {
                fq.D(new V0(j15, 0L));
            }
        }
        C1 c13 = this.i;
        if (c13 != null && c13.f24773c != null) {
            return c13.b((K0) r02, u02);
        }
        K0 k04 = (K0) r02;
        k04.f26573y = 0;
        long q8 = j10 != -1 ? j10 - k04.q() : -1L;
        if (q8 != -1 && q8 < 4) {
            g();
            return -1;
        }
        Cr cr2 = this.f24406c;
        if (!k04.E(cr2.f24997a, 0, 4, true)) {
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
            k04.E(cr2.f24997a, 0, 10, false);
            cr2.E(9);
            k04.a((cr2.K() & 7) + 14, false);
            return 0;
        }
        if (b9 == 443) {
            k04.E(cr2.f24997a, 0, 2, false);
            cr2.E(0);
            k04.a(cr2.L() + 6, false);
            return 0;
        }
        if ((b9 >> 8) != 1) {
            k04.a(1, false);
            return 0;
        }
        int i12 = b9 & com.anythink.basead.exoplayer.k.p.f9259b;
        SparseArray sparseArray = this.f24405b;
        C4270z4 c4270z4 = (C4270z4) sparseArray.get(i12);
        if (!this.f24408e) {
            if (c4270z4 == null) {
                InterfaceC3407j4 interfaceC3407j4 = null;
                if (i12 == 189) {
                    c3515l4 = new C3086d4(0, 0, null, "video/mp2p");
                    this.f24409f = true;
                    this.f24411h = k04.f26571w;
                } else if ((b9 & 224) == 192) {
                    c3515l4 = new C4000u4(null, 0, "video/mp2p");
                    this.f24409f = true;
                    this.f24411h = k04.f26571w;
                } else {
                    if ((b9 & 240) == 224) {
                        c3515l4 = new C3515l4(null, "video/mp2p");
                        this.f24410g = true;
                        this.f24411h = k04.f26571w;
                    }
                    if (interfaceC3407j4 != null) {
                        interfaceC3407j4.a(this.f24412j, new F4(Integer.MIN_VALUE, i12, 256));
                        c4270z4 = new C4270z4(interfaceC3407j4, this.f24404a);
                        sparseArray.put(i12, c4270z4);
                    }
                }
                interfaceC3407j4 = c3515l4;
                if (interfaceC3407j4 != null) {
                }
            }
            long j16 = 1048576;
            if (this.f24409f && this.f24410g) {
                j16 = 8192 + this.f24411h;
            }
            if (k04.f26571w > j16) {
                this.f24408e = true;
                this.f24412j.B();
            }
        }
        k04.E(cr2.f24997a, 0, 2, false);
        cr2.E(0);
        int L2 = cr2.L() + 6;
        if (c4270z4 == null) {
            k04.a(L2, false);
            return 0;
        }
        cr2.y(L2);
        k04.A(cr2.f24997a, 0, L2, false);
        cr2.E(6);
        C4256yr c4256yr = c4270z4.f36063c;
        cr2.H(c4256yr.f36016a, 0, 3);
        c4256yr.d(0);
        c4256yr.f(8);
        c4270z4.f36064d = c4256yr.g();
        c4270z4.f36065e = c4256yr.g();
        c4256yr.f(6);
        cr2.H(c4256yr.f36016a, 0, c4256yr.h(8));
        c4256yr.d(0);
        if (c4270z4.f36064d) {
            c4256yr.f(4);
            long h3 = c4256yr.h(3);
            c4256yr.f(1);
            int h9 = c4256yr.h(15) << 15;
            c4256yr.f(1);
            long h10 = c4256yr.h(15);
            c4256yr.f(1);
            boolean z9 = c4270z4.f36066f;
            Dt dt2 = c4270z4.f36062b;
            if (z9 || !c4270z4.f36065e) {
                i = 0;
                j9 = h3;
                i4 = h9;
            } else {
                c4256yr.f(4);
                i = 0;
                j9 = h3;
                c4256yr.f(1);
                int h11 = c4256yr.h(15) << 15;
                c4256yr.f(1);
                i4 = h9;
                long h12 = c4256yr.h(15);
                c4256yr.f(1);
                dt2.c(h11 | (c4256yr.h(3) << 30) | h12);
                c4270z4.f36066f = true;
            }
            j6 = dt2.c((j9 << 30) | i4 | h10);
        } else {
            i = 0;
            j6 = 0;
        }
        InterfaceC3407j4 interfaceC3407j42 = c4270z4.f36061a;
        interfaceC3407j42.d(4, j6);
        interfaceC3407j42.b(cr2);
        interfaceC3407j42.e();
        cr2.C(cr2.f24997a.length);
        return i;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f24412j = (FQ) s02;
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
        Dt dt = this.f24404a;
        synchronized (dt) {
            j10 = dt.f25247b;
        }
        if (j10 != com.anythink.basead.exoplayer.b.f7168b) {
            long a9 = dt.a();
            if (a9 != com.anythink.basead.exoplayer.b.f7168b) {
                if (a9 != 0) {
                }
            }
            c12 = this.i;
            if (c12 != null) {
                c12.a(j9);
            }
            i = 0;
            while (true) {
                sparseArray = this.f24405b;
                if (i < sparseArray.size()) {
                    return;
                }
                C4270z4 c4270z4 = (C4270z4) sparseArray.valueAt(i);
                c4270z4.f36066f = false;
                c4270z4.f36061a.c();
                i++;
            }
        }
        dt.b(j9);
        c12 = this.i;
        if (c12 != null) {
        }
        i = 0;
        while (true) {
            sparseArray = this.f24405b;
            if (i < sparseArray.size()) {
            }
            C4270z4 c4270z42 = (C4270z4) sparseArray.valueAt(i);
            c4270z42.f36066f = false;
            c4270z42.f36061a.c();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        byte[] bArr = new byte[14];
        K0 k02 = (K0) r02;
        k02.E(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            k02.d(bArr[13] & 7, false);
            k02.E(bArr, 0, 3, false);
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
            SparseArray sparseArray = this.f24405b;
            if (i >= sparseArray.size()) {
                return;
            }
            ((C4270z4) sparseArray.valueAt(i)).f36061a.p();
            i++;
        }
    }
}
