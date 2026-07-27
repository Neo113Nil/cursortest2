package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class A1 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23620a;

    /* renamed from: b, reason: collision with root package name */
    public final C3221g1 f23621b;

    public A1(int i) {
        this.f23620a = i;
        switch (i) {
            case 1:
                this.f23621b = new C3221g1(35152, 2, "image/png");
                break;
            default:
                this.f23621b = new C3221g1(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final int a(R0 r02, U0 u02) {
        switch (this.f23620a) {
        }
        return this.f23621b.a(r02, u02);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        switch (this.f23620a) {
            case 0:
                this.f23621b.b(s02);
                break;
            default:
                this.f23621b.b(s02);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        switch (this.f23620a) {
            case 0:
                this.f23621b.c(j6, j9);
                break;
            default:
                this.f23621b.c(j6, j9);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        switch (this.f23620a) {
        }
        return this.f23621b.d(r02);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
        int i = this.f23620a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
