package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3139e4 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3086d4 f30665a = new C3086d4(0, 1, null, "audio/ac4");

    /* renamed from: b, reason: collision with root package name */
    public final Cr f30666b = new Cr(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f30667c;

    static {
        int i = AbstractC2659Kg.f26727M;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final int a(R0 r02, U0 u02) {
        Cr cr = this.f30666b;
        int r9 = ((K0) r02).r(cr.f24997a, 0, 16384);
        if (r9 == -1) {
            return -1;
        }
        cr.E(0);
        cr.C(r9);
        boolean z6 = this.f30667c;
        C3086d4 c3086d4 = this.f30665a;
        if (!z6) {
            c3086d4.f30478o = 0L;
            this.f30667c = true;
        }
        c3086d4.b(cr);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f30665a.a(s02, new F4(Integer.MIN_VALUE, 0, 1));
        FQ fq = (FQ) s02;
        fq.B();
        fq.D(new V0(com.anythink.basead.exoplayer.b.f7168b, 0L));
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        this.f30667c = false;
        this.f30665a.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(R0 r02) {
        K0 k02;
        int i;
        Cr cr = new Cr(10);
        int i4 = 0;
        while (true) {
            k02 = (K0) r02;
            k02.E(cr.f24997a, 0, 10, false);
            cr.E(0);
            if (cr.O() != 4801587) {
                break;
            }
            cr.G(3);
            int g9 = cr.g();
            i4 += g9 + 10;
            k02.d(g9, false);
        }
        k02.f26573y = 0;
        k02.d(i4, false);
        int i6 = 0;
        int i9 = i4;
        while (true) {
            int i10 = 7;
            k02.E(cr.f24997a, 0, 7, false);
            cr.E(0);
            int L2 = cr.L();
            if (L2 == 44096 || L2 == 44097) {
                i6++;
                if (i6 >= 4) {
                    return true;
                }
                byte[] bArr = cr.f24997a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i11 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i11 == 65535) {
                        i11 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i10 = 4;
                    }
                    if (L2 == 44097) {
                        i10 += 2;
                    }
                    i = i11 + i10;
                }
                if (i == -1) {
                    break;
                }
                k02.d(i - 7, false);
            } else {
                k02.f26573y = 0;
                i9++;
                if (i9 - i4 >= 8192) {
                    break;
                }
                k02.d(i9, false);
                i6 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }
}
