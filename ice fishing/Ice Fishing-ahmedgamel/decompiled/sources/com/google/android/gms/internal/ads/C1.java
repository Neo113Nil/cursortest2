package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class C1 {

    /* renamed from: a, reason: collision with root package name */
    public final E0 f24771a;

    /* renamed from: b, reason: collision with root package name */
    public final I0 f24772b;

    /* renamed from: c, reason: collision with root package name */
    public F0 f24773c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24774d;

    public C1(G0 g02, I0 i02, long j6, long j9, long j10, long j11, long j12, int i) {
        this.f24772b = i02;
        this.f24774d = i;
        this.f24771a = new E0(g02, j6, j9, j10, j11, j12);
    }

    public static final int c(K0 k02, long j6, U0 u02) {
        if (j6 == k02.f26571w) {
            return 0;
        }
        u02.f28641n = j6;
        return 1;
    }

    public static /* synthetic */ int d(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final void a(long j6) {
        F0 f02 = this.f24773c;
        if (f02 == null || f02.f25457a != j6) {
            E0 e02 = this.f24771a;
            long b9 = e02.f25278a.b(j6);
            long j9 = e02.f25282e;
            long j10 = e02.f25283f;
            long j11 = e02.f25280c;
            long j12 = e02.f25281d;
            F0 f03 = new F0();
            f03.f25457a = j6;
            f03.f25458b = b9;
            f03.f25460d = 0L;
            f03.f25461e = j11;
            f03.f25462f = j12;
            f03.f25463g = j9;
            f03.f25459c = j10;
            f03.f25464h = F0.a(b9, 0L, j11, j12, j9, j10);
            this.f24773c = f03;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        return c(r30, r8, r31);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(K0 k02, U0 u02) {
        while (true) {
            F0 f02 = this.f24773c;
            f02.getClass();
            long j6 = f02.f25462f;
            long j9 = f02.f25463g;
            long j10 = f02.f25464h;
            long j11 = j9 - j6;
            long j12 = this.f24774d;
            I0 i02 = this.f24772b;
            if (j11 <= j12) {
                this.f24773c = null;
                i02.mo1f();
                return c(k02, j6, u02);
            }
            long j13 = j10 - k02.f26571w;
            if (j13 < 0 || j13 > 262144) {
                break;
            }
            k02.a((int) j13, false);
            k02.f26573y = 0;
            H0 q8 = i02.q(k02, f02.f25458b);
            int i = q8.f25973a;
            if (i == -3) {
                this.f24773c = null;
                i02.mo1f();
                return c(k02, j10, u02);
            }
            long j14 = q8.f25974b;
            long j15 = q8.f25975c;
            if (i == -2) {
                f02.f25460d = j14;
                f02.f25462f = j15;
                f02.f25464h = F0.a(f02.f25458b, j14, f02.f25461e, j15, f02.f25463g, f02.f25459c);
            } else {
                if (i != -1) {
                    long j16 = j15 - k02.f26571w;
                    if (j16 >= 0 && j16 <= 262144) {
                        k02.a((int) j16, false);
                    }
                    this.f24773c = null;
                    i02.mo1f();
                    return c(k02, j15, u02);
                }
                f02.f25461e = j14;
                f02.f25463g = j15;
                f02.f25464h = F0.a(f02.f25458b, f02.f25460d, j14, f02.f25462f, j15, f02.f25459c);
            }
        }
    }
}
