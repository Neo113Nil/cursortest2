package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3169f3 implements InterfaceC3437k3 {

    /* renamed from: A, reason: collision with root package name */
    public long f30017A;

    /* renamed from: B, reason: collision with root package name */
    public long f30018B;

    /* renamed from: C, reason: collision with root package name */
    public long f30019C;

    /* renamed from: D, reason: collision with root package name */
    public long f30020D;

    /* renamed from: E, reason: collision with root package name */
    public long f30021E;

    /* renamed from: n, reason: collision with root package name */
    public final C3383j3 f30022n;

    /* renamed from: u, reason: collision with root package name */
    public final long f30023u;

    /* renamed from: v, reason: collision with root package name */
    public final long f30024v;

    /* renamed from: w, reason: collision with root package name */
    public final AbstractC3545m3 f30025w;

    /* renamed from: x, reason: collision with root package name */
    public int f30026x;

    /* renamed from: y, reason: collision with root package name */
    public long f30027y;

    /* renamed from: z, reason: collision with root package name */
    public long f30028z;

    public C3169f3(AbstractC3545m3 abstractC3545m3, long j6, long j9, long j10, long j11, boolean z3) {
        AbstractC2772Sd.i(j6 >= 0 && j9 > j6);
        this.f30025w = abstractC3545m3;
        this.f30023u = j6;
        this.f30024v = j9;
        if (j10 == j9 - j6 || z3) {
            this.f30027y = j11;
            this.f30026x = 4;
        } else {
            this.f30026x = 0;
        }
        this.f30022n = new C3383j3();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3437k3
    public final void a(long j6) {
        long j9 = this.f30027y - 1;
        String str = AbstractC3159eu.f29993a;
        this.f30017A = Math.max(0L, Math.min(j6, j9));
        this.f30026x = 2;
        this.f30018B = this.f30023u;
        this.f30019C = this.f30024v;
        this.f30020D = 0L;
        this.f30021E = this.f30027y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // com.google.android.gms.internal.ads.InterfaceC3437k3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(K0 k02) {
        C3383j3 c3383j3;
        long j6;
        ?? r42;
        long j9;
        long j10;
        C3383j3 c3383j32;
        long max;
        long j11;
        int i = this.f30026x;
        long j12 = this.f30024v;
        C3383j3 c3383j33 = this.f30022n;
        if (i == 0) {
            c3383j3 = c3383j33;
            j6 = 0;
            long j13 = k02.f25819w;
            this.f30028z = j13;
            this.f30026x = 1;
            long j14 = (-65307) + j12;
            if (j14 > j13) {
                return j14;
            }
            r42 = 0;
        } else if (i != 1) {
            if (i == 2) {
                j9 = 2;
                long j15 = this.f30018B;
                long j16 = this.f30019C;
                if (j15 != j16) {
                    long j17 = k02.f25819w;
                    if (c3383j33.a(k02, j16)) {
                        c3383j33.b(k02, false);
                        k02.f25821y = 0;
                        long j18 = this.f30017A;
                        long j19 = c3383j33.f31160b;
                        long j20 = j18 - j19;
                        int i6 = c3383j33.f31162d + c3383j33.f31163e;
                        if (j20 < 0 || j20 >= 72000) {
                            if (j20 < 0) {
                                this.f30019C = j17;
                                this.f30021E = j19;
                                j10 = -1;
                            } else {
                                j10 = -1;
                                this.f30018B = k02.f25819w + i6;
                                this.f30020D = j19;
                            }
                            long j21 = this.f30019C;
                            long j22 = this.f30018B;
                            long j23 = j21 - j22;
                            if (j23 < 100000) {
                                this.f30019C = j22;
                                c3383j32 = c3383j33;
                                max = j22;
                            } else {
                                c3383j32 = c3383j33;
                                long j24 = k02.f25819w - (i6 * (j20 <= 0 ? 2L : 1L));
                                String str = AbstractC3159eu.f29993a;
                                max = Math.max(j22, Math.min(((j20 * j23) / (this.f30021E - this.f30020D)) + j24, j21 + j10));
                            }
                        }
                    } else {
                        max = this.f30018B;
                        if (max == j17) {
                            throw new IOException("No ogg page can be found.");
                        }
                        c3383j32 = c3383j33;
                        j10 = -1;
                    }
                    if (max == j10) {
                        return max;
                    }
                    this.f30026x = 3;
                    j11 = j10;
                }
                c3383j32 = c3383j33;
                max = -1;
                j10 = -1;
                if (max == j10) {
                }
            } else {
                if (i != 3) {
                    return -1L;
                }
                c3383j32 = c3383j33;
                j11 = -1;
                j9 = 2;
            }
            while (true) {
                c3383j32.a(k02, j11);
                c3383j32.b(k02, false);
                if (c3383j32.f31160b > this.f30017A) {
                    k02.f25821y = 0;
                    this.f30026x = 4;
                    return -(this.f30020D + j9);
                }
                k02.a(c3383j32.f31162d + c3383j32.f31163e, false);
                this.f30018B = k02.f25819w;
                this.f30020D = c3383j32.f31160b;
                j11 = -1;
            }
        } else {
            c3383j3 = c3383j33;
            j6 = 0;
            r42 = 0;
        }
        c3383j3.f31159a = r42;
        c3383j3.f31160b = j6;
        c3383j3.f31161c = r42;
        c3383j3.f31162d = r42;
        c3383j3.f31163e = r42;
        if (!c3383j3.a(k02, -1L)) {
            throw new EOFException();
        }
        c3383j3.b(k02, r42);
        k02.a(c3383j3.f31162d + c3383j3.f31163e, r42);
        long j25 = c3383j3.f31160b;
        while ((c3383j3.f31159a & 4) != 4 && c3383j3.a(k02, -1L) && k02.f25819w < j12 && c3383j3.b(k02, true)) {
            try {
                k02.a(c3383j3.f31162d + c3383j3.f31163e, false);
                j25 = c3383j3.f31160b;
            } catch (EOFException unused) {
            }
        }
        this.f30027y = j25;
        this.f30026x = 4;
        return this.f30028z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3437k3
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ InterfaceC3113e1 mo9i() {
        if (this.f30027y != 0) {
            return new C3115e3(this);
        }
        return null;
    }
}
