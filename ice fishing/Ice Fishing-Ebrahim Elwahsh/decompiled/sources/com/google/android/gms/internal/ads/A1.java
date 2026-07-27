package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class A1 {

    /* renamed from: a, reason: collision with root package name */
    public final D0 f23798a;

    /* renamed from: b, reason: collision with root package name */
    public final H0 f23799b;

    /* renamed from: c, reason: collision with root package name */
    public E0 f23800c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23801d;

    public A1(F0 f02, H0 h02, long j9, long j10, long j11, long j12, long j13, int i) {
        this.f23799b = h02;
        this.f23801d = i;
        this.f23798a = new D0(f02, j9, j10, j11, j12, j13);
    }

    public static final int c(J0 j02, long j9, S0 s02) {
        if (j9 == j02.f25675w) {
            return 0;
        }
        s02.f27467n = j9;
        return 1;
    }

    public static /* synthetic */ int d(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final void a(long j9) {
        E0 e02 = this.f23800c;
        if (e02 == null || e02.f24621a != j9) {
            D0 d02 = this.f23798a;
            long d2 = d02.f24295a.d(j9);
            long j10 = d02.f24299e;
            long j11 = d02.f24300f;
            long j12 = d02.f24297c;
            long j13 = d02.f24298d;
            E0 e03 = new E0();
            e03.f24621a = j9;
            e03.f24622b = d2;
            e03.f24624d = 0L;
            e03.f24625e = j12;
            e03.f24626f = j13;
            e03.f24627g = j10;
            e03.f24623c = j11;
            e03.f24628h = E0.a(d2, 0L, j12, j13, j10, j11);
            this.f23800c = e03;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        return c(r30, r8, r31);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(J0 j02, S0 s02) {
        while (true) {
            E0 e02 = this.f23800c;
            e02.getClass();
            long j9 = e02.f24626f;
            long j10 = e02.f24627g;
            long j11 = e02.f24628h;
            long j12 = j10 - j9;
            long j13 = this.f23801d;
            H0 h02 = this.f23799b;
            if (j12 <= j13) {
                this.f23800c = null;
                h02.d();
                return c(j02, j9, s02);
            }
            long j14 = j11 - j02.f25675w;
            if (j14 < 0 || j14 > 262144) {
                break;
            }
            j02.b((int) j14, false);
            j02.f25677y = 0;
            G0 k6 = h02.k(j02, e02.f24622b);
            int i = k6.f25082a;
            if (i == -3) {
                this.f23800c = null;
                h02.d();
                return c(j02, j11, s02);
            }
            long j15 = k6.f25083b;
            long j16 = k6.f25084c;
            if (i == -2) {
                e02.f24624d = j15;
                e02.f24626f = j16;
                e02.f24628h = E0.a(e02.f24622b, j15, e02.f24625e, j16, e02.f24627g, e02.f24623c);
            } else {
                if (i != -1) {
                    long j17 = j16 - j02.f25675w;
                    if (j17 >= 0 && j17 <= 262144) {
                        j02.b((int) j17, false);
                    }
                    this.f23800c = null;
                    h02.d();
                    return c(j02, j16, s02);
                }
                e02.f24625e = j15;
                e02.f24627g = j16;
                e02.f24628h = E0.a(e02.f24622b, e02.f24624d, j15, e02.f24626f, j16, e02.f24623c);
            }
        }
    }
}
