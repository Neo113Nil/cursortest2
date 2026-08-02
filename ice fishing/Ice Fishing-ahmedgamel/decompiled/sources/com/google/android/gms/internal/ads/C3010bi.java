package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import r2.C4906k;
import r2.RunnableC4901f;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.bi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3010bi implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30098a;

    /* renamed from: b, reason: collision with root package name */
    public final C2895Yh f30099b;

    public /* synthetic */ C3010bi(C2895Yh c2895Yh, int i) {
        this.f30098a = i;
        this.f30099b = c2895Yh;
    }

    public Context a() {
        Context context = this.f30099b.f29482b;
        AbstractC3364iD.j(context);
        return context;
    }

    public C5189a b() {
        C5189a c5189a = this.f30099b.f29481a;
        AbstractC3364iD.j(c5189a);
        return c5189a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f30098a) {
            case 0:
                C2895Yh c2895Yh = this.f30099b;
                return new C2879Xh(c2895Yh.f29482b, c2895Yh.f29481a);
            case 1:
                Context context = this.f30099b.f29482b;
                AbstractC3364iD.j(context);
                return context;
            case 2:
                Context context2 = this.f30099b.f29482b;
                AbstractC3364iD.j(context2);
                return context2;
            case 3:
                WeakReference weakReference = this.f30099b.f29484d;
                AbstractC3364iD.j(weakReference);
                return weakReference;
            case 4:
                return new C3506kw(this.f30099b.f29482b);
            case 5:
                C2895Yh c2895Yh2 = this.f30099b;
                return new RunnableC4901f(c2895Yh2.f29482b, c2895Yh2.f29481a);
            case 6:
                C2895Yh c2895Yh3 = this.f30099b;
                String E8 = C4906k.f40186C.f40191c.E(c2895Yh3.f29482b, c2895Yh3.f29481a.f41845n);
                AbstractC3364iD.j(E8);
                return E8;
            case 7:
                C5189a c5189a = this.f30099b.f29481a;
                AbstractC3364iD.j(c5189a);
                return c5189a;
            default:
                return Long.valueOf(this.f30099b.f29483c);
        }
    }
}
