package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class S2 implements InterfaceC3113e1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f27400a;

    /* renamed from: b, reason: collision with root package name */
    public final T2[] f27401b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27402c;

    public S2(long j6, T2[] t2Arr, int i) {
        this.f27400a = j6;
        this.f27401b = t2Arr;
        this.f27402c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3060d1 b(long j6) {
        long j9;
        long j10;
        long j11;
        long j12;
        int i;
        int i6;
        int i9;
        int b9;
        T2[] t2Arr = this.f27401b;
        int length = t2Arr.length;
        C3167f1 c3167f1 = C3167f1.f30012c;
        if (length == 0) {
            return new C3060d1(c3167f1, c3167f1);
        }
        int i10 = -1;
        int i11 = this.f27402c;
        if (i11 != -1) {
            C3008c3 c3008c3 = t2Arr[i11].f27679b;
            int a9 = c3008c3.a(j6);
            if (a9 == -1) {
                a9 = c3008c3.b(j6);
            }
            if (a9 == -1) {
                return new C3060d1(c3167f1, c3167f1);
            }
            long[] jArr = c3008c3.f29421f;
            j10 = jArr[a9];
            long[] jArr2 = c3008c3.f29418c;
            j9 = jArr2[a9];
            if (j10 < j6 && a9 < c3008c3.f29417b - 1 && (b9 = c3008c3.b(j6)) != -1 && b9 != a9) {
                long j13 = jArr[b9];
                j12 = jArr2[b9];
                j11 = j13;
                i = 0;
                long j14 = j9;
                while (i < t2Arr.length) {
                    if (i != i11) {
                        C3008c3 c3008c32 = t2Arr[i].f27679b;
                        int a10 = c3008c32.a(j10);
                        if (a10 == i10) {
                            a10 = c3008c32.b(j10);
                        }
                        long[] jArr3 = c3008c32.f29418c;
                        if (a10 == i10) {
                            i6 = i;
                        } else {
                            i6 = i;
                            j14 = Math.min(jArr3[a10], j14);
                        }
                        if (j11 != com.anythink.basead.exoplayer.b.f6382b) {
                            int a11 = c3008c32.a(j11);
                            i9 = -1;
                            if (a11 == -1) {
                                a11 = c3008c32.b(j11);
                            }
                            if (a11 != -1) {
                                j12 = Math.min(jArr3[a11], j12);
                            }
                        } else {
                            i9 = -1;
                        }
                    } else {
                        i6 = i;
                        i9 = i10;
                    }
                    int i12 = i9;
                    i = i6 + 1;
                    i10 = i12;
                }
                C3167f1 c3167f12 = new C3167f1(j10, j14);
                return j11 != com.anythink.basead.exoplayer.b.f6382b ? new C3060d1(c3167f12, c3167f12) : new C3060d1(c3167f12, new C3167f1(j11, j12));
            }
        } else {
            j9 = Long.MAX_VALUE;
            j10 = j6;
        }
        j11 = com.anythink.basead.exoplayer.b.f6382b;
        j12 = -1;
        i = 0;
        long j142 = j9;
        while (i < t2Arr.length) {
        }
        C3167f1 c3167f122 = new C3167f1(j10, j142);
        if (j11 != com.anythink.basead.exoplayer.b.f6382b) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final long c() {
        return this.f27400a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final boolean f() {
        return true;
    }
}
