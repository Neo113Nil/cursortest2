package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class D0 implements InterfaceC3015c1 {

    /* renamed from: a, reason: collision with root package name */
    public final F0 f24295a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24296b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24297c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24298d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24299e;

    /* renamed from: f, reason: collision with root package name */
    public final long f24300f;

    public D0(F0 f02, long j9, long j10, long j11, long j12, long j13) {
        this.f24295a = f02;
        this.f24296b = j9;
        this.f24297c = j10;
        this.f24298d = j11;
        this.f24299e = j12;
        this.f24300f = j13;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final long a() {
        return this.f24296b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final C2961b1 c(long j9) {
        C3070d1 c3070d1 = new C3070d1(j9, E0.a(this.f24295a.d(j9), 0L, this.f24297c, this.f24298d, this.f24299e, this.f24300f));
        return new C2961b1(c3070d1, c3070d1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final boolean d() {
        return true;
    }
}
