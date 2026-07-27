package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3370iq implements InterfaceC3317hq {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3317hq f31122a;

    /* renamed from: b, reason: collision with root package name */
    public final UA f31123b;

    public C3370iq(InterfaceC3317hq interfaceC3317hq, UA ua) {
        this.f31122a = interfaceC3317hq;
        this.f31123b = ua;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3317hq
    public final N3.a a(Yt yt, St st) {
        return QC.u(this.f31122a.a(yt, st), this.f31123b, AbstractC3413jg.f31268a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3317hq
    public final boolean b(Yt yt, St st) {
        return this.f31122a.b(yt, st);
    }
}
