package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class E0 implements InterfaceC3113e1 {

    /* renamed from: a, reason: collision with root package name */
    public final G0 f24517a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24518b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24519c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24520d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24521e;

    /* renamed from: f, reason: collision with root package name */
    public final long f24522f;

    public E0(G0 g02, long j6, long j9, long j10, long j11, long j12) {
        this.f24517a = g02;
        this.f24518b = j6;
        this.f24519c = j9;
        this.f24520d = j10;
        this.f24521e = j11;
        this.f24522f = j12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final C3060d1 b(long j6) {
        C3167f1 c3167f1 = new C3167f1(j6, F0.a(this.f24517a.b(j6), 0L, this.f24519c, this.f24520d, this.f24521e, this.f24522f));
        return new C3060d1(c3167f1, c3167f1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final long c() {
        return this.f24518b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final boolean f() {
        return true;
    }
}
