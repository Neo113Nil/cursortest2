package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class C2 implements B2 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f24012a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f24013b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24014c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24015d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24016e;

    public C2(long[] jArr, long[] jArr2, long j6, long j9, int i) {
        this.f24012a = jArr;
        this.f24013b = jArr2;
        this.f24014c = j6;
        this.f24015d = j9;
        this.f24016e = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final C3060d1 b(long j6) {
        long[] jArr = this.f24012a;
        int s9 = AbstractC3159eu.s(jArr, j6, true);
        long j9 = jArr[s9];
        long[] jArr2 = this.f24013b;
        C3167f1 c3167f1 = new C3167f1(j9, jArr2[s9]);
        if (j9 >= j6 || s9 == jArr.length - 1) {
            return new C3060d1(c3167f1, c3167f1);
        }
        int i = s9 + 1;
        return new C3060d1(c3167f1, new C3167f1(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final long c() {
        return this.f24014c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final int g() {
        return this.f24016e;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final long h() {
        return this.f24015d;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final long k(long j6) {
        return this.f24012a[AbstractC3159eu.s(this.f24013b, j6, true)];
    }
}
