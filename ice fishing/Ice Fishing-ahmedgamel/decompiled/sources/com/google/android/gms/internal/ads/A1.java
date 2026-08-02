package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class A1 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24400a;

    /* renamed from: b, reason: collision with root package name */
    public final C3244g1 f24401b;

    public A1(int i) {
        this.f24400a = i;
        switch (i) {
            case 1:
                this.f24401b = new C3244g1(35152, 2, "image/png");
                break;
            default:
                this.f24401b = new C3244g1(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final int a(R0 r02, U0 u02) {
        switch (this.f24400a) {
        }
        return this.f24401b.a(r02, u02);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        switch (this.f24400a) {
            case 0:
                this.f24401b.b(s02);
                break;
            default:
                this.f24401b.b(s02);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        switch (this.f24400a) {
            case 0:
                this.f24401b.c(j6, j9);
                break;
            default:
                this.f24401b.c(j6, j9);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        switch (this.f24400a) {
        }
        return this.f24401b.d(r02);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
        int i = this.f24400a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
