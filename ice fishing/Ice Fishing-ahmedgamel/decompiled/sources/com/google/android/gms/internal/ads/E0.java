package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class E0 implements InterfaceC3136e1 {

    /* renamed from: a, reason: collision with root package name */
    public final G0 f25278a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25279b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25280c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25281d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25282e;

    /* renamed from: f, reason: collision with root package name */
    public final long f25283f;

    public E0(G0 g02, long j6, long j9, long j10, long j11, long j12) {
        this.f25278a = g02;
        this.f25279b = j6;
        this.f25280c = j9;
        this.f25281d = j10;
        this.f25282e = j11;
        this.f25283f = j12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final C3083d1 b(long j6) {
        C3190f1 c3190f1 = new C3190f1(j6, F0.a(this.f25278a.b(j6), 0L, this.f25280c, this.f25281d, this.f25282e, this.f25283f));
        return new C3083d1(c3190f1, c3190f1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final long c() {
        return this.f25279b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final boolean f() {
        return true;
    }
}
