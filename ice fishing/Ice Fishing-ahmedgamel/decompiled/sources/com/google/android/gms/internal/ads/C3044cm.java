package com.google.android.gms.internal.ads;

import q2.InterfaceC4915x;

/* renamed from: com.google.android.gms.internal.ads.cm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3044cm implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29579a;

    /* renamed from: b, reason: collision with root package name */
    public final C2991bm f29580b;

    public /* synthetic */ C3044cm(C2991bm c2991bm, int i) {
        this.f29579a = i;
        this.f29580b = c2991bm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f29579a) {
            case 0:
                return (InterfaceC4915x) this.f29580b.f29324v;
            case 1:
                return this.f29580b;
            default:
                C4282zm c4282zm = (C4282zm) this.f29580b.f29323u;
                AbstractC3341iD.j(c4282zm);
                return c4282zm;
        }
    }
}
