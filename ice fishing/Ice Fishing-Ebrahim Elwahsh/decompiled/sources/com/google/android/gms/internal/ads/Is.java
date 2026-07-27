package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class Is implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25643a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4063vN f25644b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4279zN f25645c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4279zN f25646d;

    public Is(C2860Xh c2860Xh, C2860Xh c2860Xh2, C2877Yh c2877Yh) {
        this.f25643a = 1;
        this.f25644b = c2860Xh;
        this.f25645c = c2860Xh2;
        this.f25646d = c2877Yh;
    }

    public C2518Df a() {
        Context a9 = ((C2860Xh) this.f25644b).a();
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        return new C2518Df(a9, c3157eg, ((AN) this.f25646d).d(), (Yu) ((C4009uN) this.f25645c).d());
    }

    public Qr b() {
        Context a9 = ((C2860Xh) this.f25644b).a();
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        return new Qr(a9, c3157eg, ((C3700ok) this.f25646d).a(), ((C2860Xh) this.f25645c).b());
    }

    public Wr c() {
        AbstractC3137eE.h(((C2687Ne) ((C3115dt) this.f25644b).f30253b.f1195v).f26582w);
        C2892Zf c2892Zf = (C2892Zf) ((C4009uN) this.f25646d).d();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((C4009uN) this.f25645c).d();
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        return new Wr(c2892Zf, scheduledExecutorService, c3157eg);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final /* bridge */ /* synthetic */ Object d() {
        switch (this.f25643a) {
            case 0:
                return b();
            case 1:
                return e();
            case 2:
                return a();
            default:
                return c();
        }
    }

    public Qr e() {
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        return new Qr(c3157eg, (Object) ((C2860Xh) this.f25644b).a(), (Object) ((C2860Xh) this.f25645c).b(), (Object) ((C2877Yh) this.f25646d).c(), 7);
    }

    public /* synthetic */ Is(InterfaceC4063vN interfaceC4063vN, InterfaceC4279zN interfaceC4279zN, InterfaceC4279zN interfaceC4279zN2, int i) {
        this.f25643a = i;
        this.f25644b = interfaceC4063vN;
        this.f25646d = interfaceC4279zN;
        this.f25645c = interfaceC4279zN2;
    }
}
