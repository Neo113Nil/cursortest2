package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class S2 implements InterfaceC3136e1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f28114a;

    /* renamed from: b, reason: collision with root package name */
    public final T2[] f28115b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28116c;

    public S2(long j6, T2[] t2Arr, int i) {
        this.f28114a = j6;
        this.f28115b = t2Arr;
        this.f28116c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3083d1 b(long j6) {
        long j9;
        long j10;
        long j11;
        long j12;
        int i;
        int i4;
        int i6;
        int b9;
        T2[] t2Arr = this.f28115b;
        int length = t2Arr.length;
        C3190f1 c3190f1 = C3190f1.f30799c;
        if (length == 0) {
            return new C3083d1(c3190f1, c3190f1);
        }
        int i9 = -1;
        int i10 = this.f28116c;
        if (i10 != -1) {
            C3031c3 c3031c3 = t2Arr[i10].f28462b;
            int a9 = c3031c3.a(j6);
            if (a9 == -1) {
                a9 = c3031c3.b(j6);
            }
            if (a9 == -1) {
                return new C3083d1(c3190f1, c3190f1);
            }
            long[] jArr = c3031c3.f30204f;
            j10 = jArr[a9];
            long[] jArr2 = c3031c3.f30201c;
            j9 = jArr2[a9];
            if (j10 < j6 && a9 < c3031c3.f30200b - 1 && (b9 = c3031c3.b(j6)) != -1 && b9 != a9) {
                long j13 = jArr[b9];
                j12 = jArr2[b9];
                j11 = j13;
                i = 0;
                long j14 = j9;
                while (i < t2Arr.length) {
                    if (i != i10) {
                        C3031c3 c3031c32 = t2Arr[i].f28462b;
                        int a10 = c3031c32.a(j10);
                        if (a10 == i9) {
                            a10 = c3031c32.b(j10);
                        }
                        long[] jArr3 = c3031c32.f30201c;
                        if (a10 == i9) {
                            i4 = i;
                        } else {
                            i4 = i;
                            j14 = Math.min(jArr3[a10], j14);
                        }
                        if (j11 != com.anythink.basead.exoplayer.b.f7168b) {
                            int a11 = c3031c32.a(j11);
                            i6 = -1;
                            if (a11 == -1) {
                                a11 = c3031c32.b(j11);
                            }
                            if (a11 != -1) {
                                j12 = Math.min(jArr3[a11], j12);
                            }
                        } else {
                            i6 = -1;
                        }
                    } else {
                        i4 = i;
                        i6 = i9;
                    }
                    int i11 = i6;
                    i = i4 + 1;
                    i9 = i11;
                }
                C3190f1 c3190f12 = new C3190f1(j10, j14);
                return j11 != com.anythink.basead.exoplayer.b.f7168b ? new C3083d1(c3190f12, c3190f12) : new C3083d1(c3190f12, new C3190f1(j11, j12));
            }
        } else {
            j9 = Long.MAX_VALUE;
            j10 = j6;
        }
        j11 = com.anythink.basead.exoplayer.b.f7168b;
        j12 = -1;
        i = 0;
        long j142 = j9;
        while (i < t2Arr.length) {
        }
        C3190f1 c3190f122 = new C3190f1(j10, j142);
        if (j11 != com.anythink.basead.exoplayer.b.f7168b) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final long c() {
        return this.f28114a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final boolean f() {
        return true;
    }
}
