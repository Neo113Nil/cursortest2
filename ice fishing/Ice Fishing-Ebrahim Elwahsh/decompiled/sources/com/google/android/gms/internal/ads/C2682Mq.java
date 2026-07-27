package com.google.android.gms.internal.ads;

import android.content.Context;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Mq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2682Mq implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26382a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f26383b;

    /* renamed from: c, reason: collision with root package name */
    public final C4117wN f26384c;

    /* renamed from: d, reason: collision with root package name */
    public final C2860Xh f26385d;

    public C2682Mq(C4009uN c4009uN, C2860Xh c2860Xh, C4117wN c4117wN) {
        this.f26383b = c4009uN;
        this.f26385d = c2860Xh;
        this.f26384c = c4117wN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f26382a) {
            case 0:
                Context context = (Context) this.f26383b.d();
                C5107a b9 = this.f26385d.b();
                C3644ni c3644ni = (C3644ni) this.f26384c.f34977a;
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new C2529Dq(context, b9, c3644ni, c3157eg);
            default:
                return new C2529Dq((Context) this.f26383b.d(), (C3105di) this.f26384c.f34977a, this.f26385d.b());
        }
    }

    public C2682Mq(C4009uN c4009uN, C4117wN c4117wN, C2860Xh c2860Xh) {
        this.f26383b = c4009uN;
        this.f26384c = c4117wN;
        this.f26385d = c2860Xh;
    }
}
