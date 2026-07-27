package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.qj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3794qj implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33371a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f33372b;

    /* renamed from: c, reason: collision with root package name */
    public final C2987bi f33373c;

    /* renamed from: d, reason: collision with root package name */
    public final C2676Mj f33374d;

    /* renamed from: e, reason: collision with root package name */
    public final C3795qk f33375e;

    public C3794qj(C2570Gf c2570Gf, C3243gN c3243gN, C2987bi c2987bi, C2676Mj c2676Mj, C3795qk c3795qk) {
        this.f33372b = c3243gN;
        this.f33373c = c2987bi;
        this.f33374d = c2676Mj;
        this.f33375e = c3795qk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f33371a) {
            case 0:
                return new C2491Bl(new C3686oj((Context) this.f33372b.f(), this.f33373c.b(), this.f33374d.a(), this.f33375e.a(), 0), AbstractC3413jg.f31275h);
            default:
                return new C2491Bl(new C3686oj((Context) this.f33372b.f(), this.f33373c.b(), this.f33374d.a(), this.f33375e.a(), 1), AbstractC3413jg.f31275h);
        }
    }

    public C3794qj(C3243gN c3243gN, C2987bi c2987bi, C2676Mj c2676Mj, C3795qk c3795qk) {
        this.f33372b = c3243gN;
        this.f33373c = c2987bi;
        this.f33374d = c2676Mj;
        this.f33375e = c3795qk;
    }
}
