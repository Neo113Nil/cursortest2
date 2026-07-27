package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4203y1 implements O0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35299a;

    /* renamed from: b, reason: collision with root package name */
    public final C3124e1 f35300b;

    public C4203y1(int i) {
        this.f35299a = i;
        switch (i) {
            case 1:
                this.f35300b = new C3124e1(35152, 2, "image/png");
                break;
            default:
                this.f35300b = new C3124e1(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        switch (this.f35299a) {
            case 0:
                this.f35300b.a(q02);
                break;
            default:
                this.f35300b.a(q02);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        switch (this.f35299a) {
        }
        return this.f35300b.b(p02);
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        switch (this.f35299a) {
            case 0:
                this.f35300b.c(j9, j10);
                break;
            default:
                this.f35300b.c(j9, j10);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final int e(P0 p02, S0 s02) {
        switch (this.f35299a) {
        }
        return this.f35300b.e(p02, s02);
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
        int i = this.f35299a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
