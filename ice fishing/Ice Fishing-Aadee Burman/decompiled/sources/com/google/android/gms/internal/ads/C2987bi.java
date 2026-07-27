package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import p2.C4835j;
import p2.RunnableC4830e;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.bi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2987bi implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29309a;

    /* renamed from: b, reason: collision with root package name */
    public final C2872Yh f29310b;

    public /* synthetic */ C2987bi(C2872Yh c2872Yh, int i) {
        this.f29309a = i;
        this.f29310b = c2872Yh;
    }

    public Context a() {
        Context context = this.f29310b.f28707b;
        AbstractC3341iD.j(context);
        return context;
    }

    public C5110a b() {
        C5110a c5110a = this.f29310b.f28706a;
        AbstractC3341iD.j(c5110a);
        return c5110a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f29309a) {
            case 0:
                C2872Yh c2872Yh = this.f29310b;
                return new C2856Xh(c2872Yh.f28707b, c2872Yh.f28706a);
            case 1:
                Context context = this.f29310b.f28707b;
                AbstractC3341iD.j(context);
                return context;
            case 2:
                Context context2 = this.f29310b.f28707b;
                AbstractC3341iD.j(context2);
                return context2;
            case 3:
                WeakReference weakReference = this.f29310b.f28709d;
                AbstractC3341iD.j(weakReference);
                return weakReference;
            case 4:
                return new C3429jw(this.f29310b.f28707b);
            case 5:
                C2872Yh c2872Yh2 = this.f29310b;
                return new RunnableC4830e(c2872Yh2.f28707b, c2872Yh2.f28706a);
            case 6:
                C2872Yh c2872Yh3 = this.f29310b;
                String E8 = C4835j.f39730C.f39735c.E(c2872Yh3.f28707b, c2872Yh3.f28706a.f41388n);
                AbstractC3341iD.j(E8);
                return E8;
            case 7:
                C5110a c5110a = this.f29310b.f28706a;
                AbstractC3341iD.j(c5110a);
                return c5110a;
            default:
                return Long.valueOf(this.f29310b.f28708c);
        }
    }
}
