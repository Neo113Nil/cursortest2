package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.qq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3801qq implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33419a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f33420b;

    /* renamed from: c, reason: collision with root package name */
    public final C2987bi f33421c;

    /* renamed from: d, reason: collision with root package name */
    public final C3795qk f33422d;

    /* renamed from: e, reason: collision with root package name */
    public final C3243gN f33423e;

    /* renamed from: f, reason: collision with root package name */
    public final C3351iN f33424f;

    /* renamed from: g, reason: collision with root package name */
    public final C3243gN f33425g;

    /* renamed from: h, reason: collision with root package name */
    public final C3243gN f33426h;
    public final C3243gN i;

    /* renamed from: j, reason: collision with root package name */
    public final C3243gN f33427j;

    public /* synthetic */ C3801qq(C3243gN c3243gN, C2987bi c2987bi, C3795qk c3795qk, C3243gN c3243gN2, C3351iN c3351iN, C3243gN c3243gN3, C3243gN c3243gN4, C3243gN c3243gN5, C3243gN c3243gN6, int i) {
        this.f33419a = i;
        this.f33420b = c3243gN;
        this.f33421c = c2987bi;
        this.f33422d = c3795qk;
        this.f33423e = c3243gN2;
        this.f33424f = c3351iN;
        this.f33425g = c3243gN3;
        this.f33426h = c3243gN4;
        this.i = c3243gN5;
        this.f33427j = c3243gN6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f33419a) {
            case 0:
                C3469ki c3469ki = (C3469ki) this.f33424f.f31039a;
                return new C3747pq(c3469ki, (Executor) this.f33423e.f(), (C2612In) this.f33425g.f(), this.f33422d.a(), this.f33421c.b(), new C3357ic(), (BinderC2880Yp) this.f33426h.f(), (C2993bo) this.i.f(), (C3153eo) this.f33427j.f());
            case 1:
                return new C2615Iq((Context) this.f33420b.f(), this.f33421c.b(), this.f33422d.a(), (Executor) this.f33423e.f(), (C3793qi) this.f33424f.f31039a, (C2612In) this.f33425g.f(), new C3357ic(), (BinderC2880Yp) this.f33426h.f(), (C2993bo) this.i.f(), (C3153eo) this.f33427j.f());
            default:
                return new C2615Iq((Context) this.f33420b.f(), this.f33421c.b(), this.f33422d.a(), (Executor) this.f33423e.f(), (C3900si) this.f33424f.f31039a, (C2612In) this.f33425g.f(), new C3357ic(), (BinderC2880Yp) this.f33426h.f(), (C2993bo) this.i.f(), (C3153eo) this.f33427j.f());
        }
    }

    public C3801qq(C3351iN c3351iN, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3795qk c3795qk, C2987bi c2987bi, C3243gN c3243gN4, C3243gN c3243gN5, C3243gN c3243gN6) {
        this.f33419a = 0;
        this.f33424f = c3351iN;
        this.f33420b = c3243gN;
        this.f33423e = c3243gN2;
        this.f33425g = c3243gN3;
        this.f33422d = c3795qk;
        this.f33421c = c2987bi;
        this.f33426h = c3243gN4;
        this.i = c3243gN5;
        this.f33427j = c3243gN6;
    }
}
