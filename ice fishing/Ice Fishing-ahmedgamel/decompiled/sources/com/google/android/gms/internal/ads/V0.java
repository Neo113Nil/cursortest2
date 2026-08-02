package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public class V0 implements InterfaceC3136e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28857a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final long f28858b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f28859c;

    public V0(W0 w02, long j6) {
        this.f28859c = w02;
        this.f28858b = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final C3083d1 b(long j6) {
        Object obj = this.f28859c;
        switch (this.f28857a) {
            case 0:
                W0 w02 = (W0) obj;
                S0.s sVar = w02.f29098k;
                sVar.getClass();
                String str = AbstractC3182eu.f30782a;
                long max = Math.max(0L, Math.min((w02.f29093e * j6) / 1000000, w02.f29097j - 1));
                long[] jArr = (long[]) sVar.f2969u;
                int s9 = AbstractC3182eu.s(jArr, max, false);
                long j9 = s9 == -1 ? 0L : jArr[s9];
                long[] jArr2 = (long[]) sVar.f2970v;
                long j10 = s9 != -1 ? jArr2[s9] : 0L;
                int i = w02.f29093e;
                long j11 = (j9 * 1000000) / i;
                long j12 = this.f28858b;
                C3190f1 c3190f1 = new C3190f1(j11, j10 + j12);
                if (j11 == j6 || s9 == jArr.length - 1) {
                    return new C3083d1(c3190f1, c3190f1);
                }
                int i4 = s9 + 1;
                return new C3083d1(c3190f1, new C3190f1((jArr[i4] * 1000000) / i, j12 + jArr2[i4]));
            case 1:
                return (C3083d1) obj;
            default:
                C3889s1 c3889s1 = (C3889s1) obj;
                C3083d1 a9 = c3889s1.i[0].a(j6);
                int i6 = 1;
                while (true) {
                    C4051v1[] c4051v1Arr = c3889s1.i;
                    if (i6 >= c4051v1Arr.length) {
                        return a9;
                    }
                    C3083d1 a10 = c4051v1Arr[i6].a(j6);
                    if (a10.f30432a.f30801b < a9.f30432a.f30801b) {
                        a9 = a10;
                    }
                    i6++;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final long c() {
        switch (this.f28857a) {
        }
        return this.f28858b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final boolean f() {
        switch (this.f28857a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    public V0(C3889s1 c3889s1, long j6) {
        Objects.requireNonNull(c3889s1);
        this.f28859c = c3889s1;
        this.f28858b = j6;
    }

    public V0(long j6, long j9) {
        this.f28858b = j6;
        C3190f1 c3190f1 = j9 == 0 ? C3190f1.f30799c : new C3190f1(0L, j9);
        this.f28859c = new C3083d1(c3190f1, c3190f1);
    }
}
