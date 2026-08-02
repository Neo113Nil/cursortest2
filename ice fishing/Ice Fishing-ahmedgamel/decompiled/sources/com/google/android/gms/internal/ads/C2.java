package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class C2 implements B2 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f24775a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f24776b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24777c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24778d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24779e;

    public C2(long[] jArr, long[] jArr2, long j6, long j9, int i) {
        this.f24775a = jArr;
        this.f24776b = jArr2;
        this.f24777c = j6;
        this.f24778d = j9;
        this.f24779e = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final C3083d1 b(long j6) {
        long[] jArr = this.f24775a;
        int s9 = AbstractC3182eu.s(jArr, j6, true);
        long j9 = jArr[s9];
        long[] jArr2 = this.f24776b;
        C3190f1 c3190f1 = new C3190f1(j9, jArr2[s9]);
        if (j9 >= j6 || s9 == jArr.length - 1) {
            return new C3083d1(c3190f1, c3190f1);
        }
        int i = s9 + 1;
        return new C3083d1(c3190f1, new C3190f1(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final long c() {
        return this.f24777c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final int g() {
        return this.f24779e;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final long h() {
        return this.f24778d;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final long k(long j6) {
        return this.f24775a[AbstractC3182eu.s(this.f24776b, j6, true)];
    }
}
