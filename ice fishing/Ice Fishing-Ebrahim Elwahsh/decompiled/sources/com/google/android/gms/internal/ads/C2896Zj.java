package com.google.android.gms.internal.ads;

import android.content.Context;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Zj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2896Zj implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29054a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final C2860Xh f29055b;

    /* renamed from: c, reason: collision with root package name */
    public final C2860Xh f29056c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f29057d;

    public C2896Zj(C2860Xh c2860Xh, C2860Xh c2860Xh2, C4009uN c4009uN) {
        this.f29055b = c2860Xh;
        this.f29056c = c2860Xh2;
        this.f29057d = c4009uN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f29054a) {
            case 0:
                Context a9 = this.f29055b.a();
                Zu zu = (Zu) this.f29057d.d();
                C5107a b9 = this.f29056c.b();
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new C2879Yj(a9, zu, b9, c3157eg);
            default:
                C2855Xc o9 = new C2518Df(7).o(this.f29055b.a(), this.f29056c.b(), (Zu) this.f29057d.d());
                AbstractC3137eE.h(o9);
                return o9;
        }
    }

    public C2896Zj(C2860Xh c2860Xh, C4009uN c4009uN, C2860Xh c2860Xh2) {
        this.f29055b = c2860Xh;
        this.f29057d = c4009uN;
        this.f29056c = c2860Xh2;
    }
}
