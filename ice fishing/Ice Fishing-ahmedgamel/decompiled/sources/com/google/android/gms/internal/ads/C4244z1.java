package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4244z1 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35262a;

    /* renamed from: b, reason: collision with root package name */
    public final Cr f35263b;

    /* renamed from: c, reason: collision with root package name */
    public final C3221g1 f35264c;

    public C4244z1(int i) {
        this.f35262a = i;
        switch (i) {
            case 1:
                this.f35263b = new Cr(4);
                this.f35264c = new C3221g1(-1, -1, "image/webp");
                break;
            default:
                this.f35263b = new Cr(4);
                this.f35264c = new C3221g1(-1, -1, "image/avif");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final int a(R0 r02, U0 u02) {
        switch (this.f35262a) {
        }
        return this.f35264c.a(r02, u02);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        switch (this.f35262a) {
            case 0:
                this.f35264c.b(s02);
                break;
            default:
                this.f35264c.b(s02);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        switch (this.f35262a) {
            case 0:
                this.f35264c.c(j6, j9);
                break;
            default:
                this.f35264c.c(j6, j9);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        switch (this.f35262a) {
            case 0:
                K0 k02 = (K0) r02;
                k02.c(4, false);
                Cr cr = this.f35263b;
                cr.y(4);
                k02.A(cr.f24252a, 0, 4, false);
                if (cr.P() == 1718909296) {
                    cr.y(4);
                    k02.A(cr.f24252a, 0, 4, false);
                    if (cr.P() == 1635150182) {
                    }
                }
                break;
            default:
                Cr cr2 = this.f35263b;
                cr2.y(4);
                K0 k03 = (K0) r02;
                k03.A(cr2.f24252a, 0, 4, false);
                if (cr2.P() == 1380533830) {
                    k03.c(4, false);
                    cr2.y(4);
                    k03.A(cr2.f24252a, 0, 4, false);
                    if (cr2.P() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
        int i = this.f35262a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
