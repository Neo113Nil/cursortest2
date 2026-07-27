package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3116e4 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3063d4 f29873a = new C3063d4(0, 1, null, "audio/ac4");

    /* renamed from: b, reason: collision with root package name */
    public final Cr f29874b = new Cr(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f29875c;

    static {
        int i = AbstractC2639Kg.f25949M;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final int a(R0 r02, U0 u02) {
        Cr cr = this.f29874b;
        int m4 = ((K0) r02).m(cr.f24252a, 0, 16384);
        if (m4 == -1) {
            return -1;
        }
        cr.E(0);
        cr.C(m4);
        boolean z3 = this.f29875c;
        C3063d4 c3063d4 = this.f29873a;
        if (!z3) {
            c3063d4.f29706o = 0L;
            this.f29875c = true;
        }
        c3063d4.b(cr);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f29873a.a(s02, new F4(Integer.MIN_VALUE, 0, 1));
        CQ cq = (CQ) s02;
        cq.B();
        cq.D(new V0(com.anythink.basead.exoplayer.b.f6382b, 0L));
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        this.f29875c = false;
        this.f29873a.c();
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
        int i6 = 0;
        while (true) {
            k02 = (K0) r02;
            k02.A(cr.f24252a, 0, 10, false);
            cr.E(0);
            if (cr.O() != 4801587) {
                break;
            }
            cr.G(3);
            int g4 = cr.g();
            i6 += g4 + 10;
            k02.c(g4, false);
        }
        k02.f25821y = 0;
        k02.c(i6, false);
        int i9 = 0;
        int i10 = i6;
        while (true) {
            int i11 = 7;
            k02.A(cr.f24252a, 0, 7, false);
            cr.E(0);
            int L6 = cr.L();
            if (L6 == 44096 || L6 == 44097) {
                i9++;
                if (i9 >= 4) {
                    return true;
                }
                byte[] bArr = cr.f24252a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i12 == 65535) {
                        i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i11 = 4;
                    }
                    if (L6 == 44097) {
                        i11 += 2;
                    }
                    i = i12 + i11;
                }
                if (i == -1) {
                    break;
                }
                k02.c(i - 7, false);
            } else {
                k02.f25821y = 0;
                i10++;
                if (i10 - i6 >= 8192) {
                    break;
                }
                k02.c(i10, false);
                i9 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }
}
