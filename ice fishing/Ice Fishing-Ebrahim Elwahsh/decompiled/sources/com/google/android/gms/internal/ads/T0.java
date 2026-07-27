package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public class T0 implements InterfaceC3015c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27675a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final long f27676b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27677c;

    public T0(U0 u02, long j9) {
        this.f27677c = u02;
        this.f27676b = j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final long a() {
        switch (this.f27675a) {
        }
        return this.f27676b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final C2961b1 c(long j9) {
        Object obj = this.f27677c;
        switch (this.f27675a) {
            case 0:
                U0 u02 = (U0) obj;
                C2881Yl c2881Yl = u02.f27909k;
                c2881Yl.getClass();
                String str = AbstractC3548lu.f32613a;
                long max = Math.max(0L, Math.min((u02.f27904e * j9) / 1000000, u02.f27908j - 1));
                long[] jArr = (long[]) c2881Yl.f28862u;
                int s3 = AbstractC3548lu.s(jArr, max, false);
                long j10 = s3 == -1 ? 0L : jArr[s3];
                long[] jArr2 = (long[]) c2881Yl.f28863v;
                long j11 = s3 != -1 ? jArr2[s3] : 0L;
                int i = u02.f27904e;
                long j12 = (j10 * 1000000) / i;
                long j13 = this.f27676b;
                C3070d1 c3070d1 = new C3070d1(j12, j11 + j13);
                if (j12 == j9 || s3 == jArr.length - 1) {
                    return new C2961b1(c3070d1, c3070d1);
                }
                int i4 = s3 + 1;
                return new C2961b1(c3070d1, new C3070d1((jArr[i4] * 1000000) / i, j13 + jArr2[i4]));
            case 1:
                return (C2961b1) obj;
            default:
                C3718p1 c3718p1 = (C3718p1) obj;
                C2961b1 a9 = c3718p1.i[0].a(j9);
                int i9 = 1;
                while (true) {
                    C3879s1[] c3879s1Arr = c3718p1.i;
                    if (i9 >= c3879s1Arr.length) {
                        return a9;
                    }
                    C2961b1 a10 = c3879s1Arr[i9].a(j9);
                    if (a10.f29379a.f29775b < a9.f29379a.f29775b) {
                        a9 = a10;
                    }
                    i9++;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final boolean d() {
        switch (this.f27675a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    public T0(C3718p1 c3718p1, long j9) {
        Objects.requireNonNull(c3718p1);
        this.f27677c = c3718p1;
        this.f27676b = j9;
    }

    public T0(long j9, long j10) {
        this.f27676b = j9;
        C3070d1 c3070d1 = j10 == 0 ? C3070d1.f29773c : new C3070d1(0L, j10);
        this.f27677c = new C2961b1(c3070d1, c3070d1);
    }
}
