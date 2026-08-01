package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public class V0 implements InterfaceC3113e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28060a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final long f28061b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f28062c;

    public V0(W0 w02, long j6) {
        this.f28062c = w02;
        this.f28061b = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final C3060d1 b(long j6) {
        Object obj = this.f28062c;
        switch (this.f28060a) {
            case 0:
                W0 w02 = (W0) obj;
                S0.s sVar = w02.f28300k;
                sVar.getClass();
                String str = AbstractC3159eu.f29993a;
                long max = Math.max(0L, Math.min((w02.f28295e * j6) / 1000000, w02.f28299j - 1));
                long[] jArr = (long[]) sVar.f2840u;
                int s9 = AbstractC3159eu.s(jArr, max, false);
                long j9 = s9 == -1 ? 0L : jArr[s9];
                long[] jArr2 = (long[]) sVar.f2841v;
                long j10 = s9 != -1 ? jArr2[s9] : 0L;
                int i = w02.f28295e;
                long j11 = (j9 * 1000000) / i;
                long j12 = this.f28061b;
                C3167f1 c3167f1 = new C3167f1(j11, j10 + j12);
                if (j11 == j6 || s9 == jArr.length - 1) {
                    return new C3060d1(c3167f1, c3167f1);
                }
                int i6 = s9 + 1;
                return new C3060d1(c3167f1, new C3167f1((jArr[i6] * 1000000) / i, j12 + jArr2[i6]));
            case 1:
                return (C3060d1) obj;
            default:
                C3866s1 c3866s1 = (C3866s1) obj;
                C3060d1 a9 = c3866s1.i[0].a(j6);
                int i9 = 1;
                while (true) {
                    C4028v1[] c4028v1Arr = c3866s1.i;
                    if (i9 >= c4028v1Arr.length) {
                        return a9;
                    }
                    C3060d1 a10 = c4028v1Arr[i9].a(j6);
                    if (a10.f29660a.f30014b < a9.f29660a.f30014b) {
                        a9 = a10;
                    }
                    i9++;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final long c() {
        switch (this.f28060a) {
        }
        return this.f28061b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final boolean f() {
        switch (this.f28060a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    public V0(C3866s1 c3866s1, long j6) {
        Objects.requireNonNull(c3866s1);
        this.f28062c = c3866s1;
        this.f28061b = j6;
    }

    public V0(long j6, long j9) {
        this.f28061b = j6;
        C3167f1 c3167f1 = j9 == 0 ? C3167f1.f30012c : new C3167f1(0L, j9);
        this.f28062c = new C3060d1(c3167f1, c3167f1);
    }
}
