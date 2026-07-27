package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Pi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2726Pi implements InterfaceC4010uk {

    /* renamed from: n, reason: collision with root package name */
    public final St f26841n;

    /* renamed from: u, reason: collision with root package name */
    public final C3199fg f26842u;

    public C2726Pi(St st, C3199fg c3199fg) {
        this.f26841n = st;
        this.f26842u = c3199fg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void A() {
        if (this.f26841n.f27639r0) {
            C3199fg c3199fg = this.f26842u;
            synchronized (c3199fg.f30280n) {
                C3092dg c3092dg = c3199fg.f30283w;
                synchronized (c3092dg.f29796f) {
                    c3092dg.f29801l++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void D() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void z() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void t(BinderC2821Ve binderC2821Ve, String str, String str2) {
    }
}
