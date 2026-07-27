package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4149x1 implements O0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35107a;

    /* renamed from: b, reason: collision with root package name */
    public final Lr f35108b;

    /* renamed from: c, reason: collision with root package name */
    public final C3124e1 f35109c;

    public C4149x1(int i) {
        this.f35107a = i;
        switch (i) {
            case 1:
                this.f35108b = new Lr(4);
                this.f35109c = new C3124e1(-1, -1, "image/webp");
                break;
            default:
                this.f35108b = new Lr(4);
                this.f35109c = new C3124e1(-1, -1, "image/avif");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        switch (this.f35107a) {
            case 0:
                this.f35109c.a(q02);
                break;
            default:
                this.f35109c.a(q02);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        switch (this.f35107a) {
            case 0:
                J0 j02 = (J0) p02;
                j02.d(4, false);
                Lr lr = this.f35108b;
                lr.y(4);
                j02.I(lr.f26233a, 0, 4, false);
                if (lr.P() == 1718909296) {
                    lr.y(4);
                    j02.I(lr.f26233a, 0, 4, false);
                    if (lr.P() == 1635150182) {
                    }
                }
                break;
            default:
                Lr lr2 = this.f35108b;
                lr2.y(4);
                J0 j03 = (J0) p02;
                j03.I(lr2.f26233a, 0, 4, false);
                if (lr2.P() == 1380533830) {
                    j03.d(4, false);
                    lr2.y(4);
                    j03.I(lr2.f26233a, 0, 4, false);
                    if (lr2.P() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        switch (this.f35107a) {
            case 0:
                this.f35109c.c(j9, j10);
                break;
            default:
                this.f35109c.c(j9, j10);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final int e(P0 p02, S0 s02) {
        switch (this.f35107a) {
        }
        return this.f35109c.e(p02, s02);
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
        int i = this.f35107a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
