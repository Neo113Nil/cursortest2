package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4258z2 implements InterfaceC4204y2 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f35431a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f35432b;

    /* renamed from: c, reason: collision with root package name */
    public final long f35433c;

    /* renamed from: d, reason: collision with root package name */
    public final long f35434d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35435e;

    public C4258z2(long[] jArr, long[] jArr2, long j9, long j10, int i) {
        this.f35431a = jArr;
        this.f35432b = jArr2;
        this.f35433c = j9;
        this.f35434d = j10;
        this.f35435e = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final long a() {
        return this.f35433c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final C2961b1 c(long j9) {
        long[] jArr = this.f35431a;
        int s3 = AbstractC3548lu.s(jArr, j9, true);
        long j10 = jArr[s3];
        long[] jArr2 = this.f35432b;
        C3070d1 c3070d1 = new C3070d1(j10, jArr2[s3]);
        if (j10 >= j9 || s3 == jArr.length - 1) {
            return new C2961b1(c3070d1, c3070d1);
        }
        int i = s3 + 1;
        return new C2961b1(c3070d1, new C3070d1(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final boolean d() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4204y2
    public final long e() {
        return this.f35434d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4204y2
    public final long f(long j9) {
        return this.f35431a[AbstractC3548lu.s(this.f35432b, j9, true)];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4204y2
    public final int g() {
        return this.f35435e;
    }
}
