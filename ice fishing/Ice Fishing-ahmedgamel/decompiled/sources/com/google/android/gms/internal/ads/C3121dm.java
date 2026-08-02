package com.google.android.gms.internal.ads;

import s2.InterfaceC4964x;

/* renamed from: com.google.android.gms.internal.ads.dm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3121dm implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30616a;

    /* renamed from: b, reason: collision with root package name */
    public final C3067cm f30617b;

    public /* synthetic */ C3121dm(C3067cm c3067cm, int i) {
        this.f30616a = i;
        this.f30617b = c3067cm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f30616a) {
            case 0:
                return (InterfaceC4964x) this.f30617b.f30366v;
            case 1:
                return this.f30617b;
            default:
                C2495Am c2495Am = (C2495Am) this.f30617b.f30365u;
                AbstractC3364iD.j(c2495Am);
                return c2495Am;
        }
    }
}
