package com.google.android.gms.internal.ads;

import android.content.Context;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.So, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2782So implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27617a;

    /* renamed from: b, reason: collision with root package name */
    public final C2860Xh f27618b;

    /* renamed from: c, reason: collision with root package name */
    public final C2860Xh f27619c;

    public /* synthetic */ C2782So(C2860Xh c2860Xh, C2860Xh c2860Xh2, int i) {
        this.f27617a = i;
        this.f27618b = c2860Xh;
        this.f27619c = c2860Xh2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f27617a) {
            case 0:
                return new C2799To(this.f27618b.a(), this.f27619c.b());
            default:
                Context a9 = this.f27618b.a();
                C5107a b9 = this.f27619c.b();
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new C3221fp(a9, b9, c3157eg);
        }
    }
}
