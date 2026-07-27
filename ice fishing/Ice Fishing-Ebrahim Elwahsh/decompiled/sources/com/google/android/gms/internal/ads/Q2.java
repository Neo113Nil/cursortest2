package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Q2 implements InterfaceC3015c1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f27107a;

    /* renamed from: b, reason: collision with root package name */
    public final R2[] f27108b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27109c;

    public Q2(long j9, R2[] r2Arr, int i) {
        this.f27107a = j9;
        this.f27108b = r2Arr;
        this.f27109c = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final long a() {
        return this.f27107a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2961b1 c(long j9) {
        long j10;
        long j11;
        long j12;
        long j13;
        int i;
        int i4;
        int i9;
        int b9;
        R2[] r2Arr = this.f27108b;
        int length = r2Arr.length;
        C3070d1 c3070d1 = C3070d1.f29773c;
        if (length == 0) {
            return new C2961b1(c3070d1, c3070d1);
        }
        int i10 = -1;
        int i11 = this.f27109c;
        if (i11 != -1) {
            C2908a3 c2908a3 = r2Arr[i11].f27301b;
            int a9 = c2908a3.a(j9);
            if (a9 == -1) {
                a9 = c2908a3.b(j9);
            }
            if (a9 == -1) {
                return new C2961b1(c3070d1, c3070d1);
            }
            long[] jArr = c2908a3.f29168f;
            j11 = jArr[a9];
            long[] jArr2 = c2908a3.f29165c;
            j10 = jArr2[a9];
            if (j11 < j9 && a9 < c2908a3.f29164b - 1 && (b9 = c2908a3.b(j9)) != -1 && b9 != a9) {
                long j14 = jArr[b9];
                j13 = jArr2[b9];
                j12 = j14;
                i = 0;
                long j15 = j10;
                while (i < r2Arr.length) {
                    if (i != i11) {
                        C2908a3 c2908a32 = r2Arr[i].f27301b;
                        int a10 = c2908a32.a(j11);
                        if (a10 == i10) {
                            a10 = c2908a32.b(j11);
                        }
                        long[] jArr3 = c2908a32.f29165c;
                        if (a10 == i10) {
                            i4 = i;
                        } else {
                            i4 = i;
                            j15 = Math.min(jArr3[a10], j15);
                        }
                        if (j12 != com.anythink.basead.exoplayer.b.f6539b) {
                            int a11 = c2908a32.a(j12);
                            i9 = -1;
                            if (a11 == -1) {
                                a11 = c2908a32.b(j12);
                            }
                            if (a11 != -1) {
                                j13 = Math.min(jArr3[a11], j13);
                            }
                        } else {
                            i9 = -1;
                        }
                    } else {
                        i4 = i;
                        i9 = i10;
                    }
                    int i12 = i9;
                    i = i4 + 1;
                    i10 = i12;
                }
                C3070d1 c3070d12 = new C3070d1(j11, j15);
                return j12 != com.anythink.basead.exoplayer.b.f6539b ? new C2961b1(c3070d12, c3070d12) : new C2961b1(c3070d12, new C3070d1(j12, j13));
            }
        } else {
            j10 = Long.MAX_VALUE;
            j11 = j9;
        }
        j12 = com.anythink.basead.exoplayer.b.f6539b;
        j13 = -1;
        i = 0;
        long j152 = j10;
        while (i < r2Arr.length) {
        }
        C3070d1 c3070d122 = new C3070d1(j11, j152);
        if (j12 != com.anythink.basead.exoplayer.b.f6539b) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final boolean d() {
        return true;
    }
}
