package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.qq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3824qq implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34186a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f34187b;

    /* renamed from: c, reason: collision with root package name */
    public final C3010bi f34188c;

    /* renamed from: d, reason: collision with root package name */
    public final C3818qk f34189d;

    /* renamed from: e, reason: collision with root package name */
    public final C3266gN f34190e;

    /* renamed from: f, reason: collision with root package name */
    public final C3374iN f34191f;

    /* renamed from: g, reason: collision with root package name */
    public final C3266gN f34192g;

    /* renamed from: h, reason: collision with root package name */
    public final C3266gN f34193h;
    public final C3266gN i;

    /* renamed from: j, reason: collision with root package name */
    public final C3266gN f34194j;

    public /* synthetic */ C3824qq(C3266gN c3266gN, C3010bi c3010bi, C3818qk c3818qk, C3266gN c3266gN2, C3374iN c3374iN, C3266gN c3266gN3, C3266gN c3266gN4, C3266gN c3266gN5, C3266gN c3266gN6, int i) {
        this.f34186a = i;
        this.f34187b = c3266gN;
        this.f34188c = c3010bi;
        this.f34189d = c3818qk;
        this.f34190e = c3266gN2;
        this.f34191f = c3374iN;
        this.f34192g = c3266gN3;
        this.f34193h = c3266gN4;
        this.i = c3266gN5;
        this.f34194j = c3266gN6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f34186a) {
            case 0:
                C3492ki c3492ki = (C3492ki) this.f34191f.f31812a;
                return new C3770pq(c3492ki, (Executor) this.f34190e.f(), (C2649Jn) this.f34192g.f(), this.f34189d.a(), this.f34188c.b(), new C3380ic(), (BinderC2903Yp) this.f34193h.f(), (C3069co) this.i.f(), (C3230fo) this.f34194j.f());
            case 1:
                return new C2635Iq((Context) this.f34187b.f(), this.f34188c.b(), this.f34189d.a(), (Executor) this.f34190e.f(), (C3816qi) this.f34191f.f31812a, (C2649Jn) this.f34192g.f(), new C3380ic(), (BinderC2903Yp) this.f34193h.f(), (C3069co) this.i.f(), (C3230fo) this.f34194j.f());
            default:
                return new C2635Iq((Context) this.f34187b.f(), this.f34188c.b(), this.f34189d.a(), (Executor) this.f34190e.f(), (C3923si) this.f34191f.f31812a, (C2649Jn) this.f34192g.f(), new C3380ic(), (BinderC2903Yp) this.f34193h.f(), (C3069co) this.i.f(), (C3230fo) this.f34194j.f());
        }
    }

    public C3824qq(C3374iN c3374iN, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3818qk c3818qk, C3010bi c3010bi, C3266gN c3266gN4, C3266gN c3266gN5, C3266gN c3266gN6) {
        this.f34186a = 0;
        this.f34191f = c3374iN;
        this.f34187b = c3266gN;
        this.f34190e = c3266gN2;
        this.f34192g = c3266gN3;
        this.f34189d = c3818qk;
        this.f34188c = c3010bi;
        this.f34193h = c3266gN4;
        this.i = c3266gN5;
        this.f34194j = c3266gN6;
    }
}
