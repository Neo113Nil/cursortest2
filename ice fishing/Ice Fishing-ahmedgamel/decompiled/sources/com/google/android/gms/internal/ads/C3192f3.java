package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3192f3 implements InterfaceC3460k3 {

    /* renamed from: A, reason: collision with root package name */
    public long f30804A;

    /* renamed from: B, reason: collision with root package name */
    public long f30805B;

    /* renamed from: C, reason: collision with root package name */
    public long f30806C;

    /* renamed from: D, reason: collision with root package name */
    public long f30807D;

    /* renamed from: E, reason: collision with root package name */
    public long f30808E;

    /* renamed from: n, reason: collision with root package name */
    public final C3406j3 f30809n;

    /* renamed from: u, reason: collision with root package name */
    public final long f30810u;

    /* renamed from: v, reason: collision with root package name */
    public final long f30811v;

    /* renamed from: w, reason: collision with root package name */
    public final AbstractC3568m3 f30812w;

    /* renamed from: x, reason: collision with root package name */
    public int f30813x;

    /* renamed from: y, reason: collision with root package name */
    public long f30814y;

    /* renamed from: z, reason: collision with root package name */
    public long f30815z;

    public C3192f3(AbstractC3568m3 abstractC3568m3, long j6, long j9, long j10, long j11, boolean z6) {
        AbstractC2792Sd.i(j6 >= 0 && j9 > j6);
        this.f30812w = abstractC3568m3;
        this.f30810u = j6;
        this.f30811v = j9;
        if (j10 == j9 - j6 || z6) {
            this.f30814y = j11;
            this.f30813x = 4;
        } else {
            this.f30813x = 0;
        }
        this.f30809n = new C3406j3();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3460k3
    public final void a(long j6) {
        long j9 = this.f30814y - 1;
        String str = AbstractC3182eu.f30782a;
        this.f30804A = Math.max(0L, Math.min(j6, j9));
        this.f30813x = 2;
        this.f30805B = this.f30810u;
        this.f30806C = this.f30811v;
        this.f30807D = 0L;
        this.f30808E = this.f30814y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // com.google.android.gms.internal.ads.InterfaceC3460k3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(K0 k02) {
        C3406j3 c3406j3;
        long j6;
        ?? r42;
        long j9;
        long j10;
        C3406j3 c3406j32;
        long max;
        long j11;
        int i = this.f30813x;
        long j12 = this.f30811v;
        C3406j3 c3406j33 = this.f30809n;
        if (i == 0) {
            c3406j3 = c3406j33;
            j6 = 0;
            long j13 = k02.f26571w;
            this.f30815z = j13;
            this.f30813x = 1;
            long j14 = (-65307) + j12;
            if (j14 > j13) {
                return j14;
            }
            r42 = 0;
        } else if (i != 1) {
            if (i == 2) {
                j9 = 2;
                long j15 = this.f30805B;
                long j16 = this.f30806C;
                if (j15 != j16) {
                    long j17 = k02.f26571w;
                    if (c3406j33.a(k02, j16)) {
                        c3406j33.b(k02, false);
                        k02.f26573y = 0;
                        long j18 = this.f30804A;
                        long j19 = c3406j33.f31947b;
                        long j20 = j18 - j19;
                        int i4 = c3406j33.f31949d + c3406j33.f31950e;
                        if (j20 < 0 || j20 >= 72000) {
                            if (j20 < 0) {
                                this.f30806C = j17;
                                this.f30808E = j19;
                                j10 = -1;
                            } else {
                                j10 = -1;
                                this.f30805B = k02.f26571w + i4;
                                this.f30807D = j19;
                            }
                            long j21 = this.f30806C;
                            long j22 = this.f30805B;
                            long j23 = j21 - j22;
                            if (j23 < 100000) {
                                this.f30806C = j22;
                                c3406j32 = c3406j33;
                                max = j22;
                            } else {
                                c3406j32 = c3406j33;
                                long j24 = k02.f26571w - (i4 * (j20 <= 0 ? 2L : 1L));
                                String str = AbstractC3182eu.f30782a;
                                max = Math.max(j22, Math.min(((j20 * j23) / (this.f30808E - this.f30807D)) + j24, j21 + j10));
                            }
                        }
                    } else {
                        max = this.f30805B;
                        if (max == j17) {
                            throw new IOException("No ogg page can be found.");
                        }
                        c3406j32 = c3406j33;
                        j10 = -1;
                    }
                    if (max == j10) {
                        return max;
                    }
                    this.f30813x = 3;
                    j11 = j10;
                }
                c3406j32 = c3406j33;
                max = -1;
                j10 = -1;
                if (max == j10) {
                }
            } else {
                if (i != 3) {
                    return -1L;
                }
                c3406j32 = c3406j33;
                j11 = -1;
                j9 = 2;
            }
            while (true) {
                c3406j32.a(k02, j11);
                c3406j32.b(k02, false);
                if (c3406j32.f31947b > this.f30804A) {
                    k02.f26573y = 0;
                    this.f30813x = 4;
                    return -(this.f30807D + j9);
                }
                k02.a(c3406j32.f31949d + c3406j32.f31950e, false);
                this.f30805B = k02.f26571w;
                this.f30807D = c3406j32.f31947b;
                j11 = -1;
            }
        } else {
            c3406j3 = c3406j33;
            j6 = 0;
            r42 = 0;
        }
        c3406j3.f31946a = r42;
        c3406j3.f31947b = j6;
        c3406j3.f31948c = r42;
        c3406j3.f31949d = r42;
        c3406j3.f31950e = r42;
        if (!c3406j3.a(k02, -1L)) {
            throw new EOFException();
        }
        c3406j3.b(k02, r42);
        k02.a(c3406j3.f31949d + c3406j3.f31950e, r42);
        long j25 = c3406j3.f31947b;
        while ((c3406j3.f31946a & 4) != 4 && c3406j3.a(k02, -1L) && k02.f26571w < j12 && c3406j3.b(k02, true)) {
            try {
                k02.a(c3406j3.f31949d + c3406j3.f31950e, false);
                j25 = c3406j3.f31947b;
            } catch (EOFException unused) {
            }
        }
        this.f30814y = j25;
        this.f30813x = 4;
        return this.f30815z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3460k3
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ InterfaceC3136e1 mo8i() {
        if (this.f30814y != 0) {
            return new C3138e3(this);
        }
        return null;
    }
}
