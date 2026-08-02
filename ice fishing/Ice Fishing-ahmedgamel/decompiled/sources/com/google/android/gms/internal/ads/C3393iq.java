package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3393iq implements InterfaceC3340hq {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3340hq f31907a;

    /* renamed from: b, reason: collision with root package name */
    public final UA f31908b;

    public C3393iq(InterfaceC3340hq interfaceC3340hq, UA ua) {
        this.f31907a = interfaceC3340hq;
        this.f31908b = ua;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3340hq
    public final P3.a a(Yt yt, St st) {
        return QC.u(this.f31907a.a(yt, st), this.f31908b, AbstractC3436jg.f32055a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3340hq
    public final boolean b(Yt yt, St st) {
        return this.f31907a.b(yt, st);
    }
}
