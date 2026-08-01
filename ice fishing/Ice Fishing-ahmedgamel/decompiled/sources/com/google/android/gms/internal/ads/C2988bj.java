package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.bj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2988bj implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29311a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f29312b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f29313c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f29314d;

    /* renamed from: e, reason: collision with root package name */
    public final C3243gN f29315e;

    /* renamed from: f, reason: collision with root package name */
    public final C3243gN f29316f;

    public /* synthetic */ C2988bj(C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4, C3243gN c3243gN5, int i) {
        this.f29311a = i;
        this.f29312b = c3243gN;
        this.f29313c = c3243gN2;
        this.f29314d = c3243gN3;
        this.f29315e = c3243gN4;
        this.f29316f = c3243gN5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final /* bridge */ /* synthetic */ Object f() {
        switch (this.f29311a) {
            case 0:
                return new C2934aj((C3250gd) this.f29312b.f(), (C2857Xi) this.f29313c.f(), (Executor) this.f29314d.f(), (C2841Wi) this.f29315e.f(), (T2.a) this.f29316f.f());
            default:
                return new C3260gn((Executor) this.f29312b.f(), (C3095dj) this.f29313c.f(), (C2508Cl) this.f29314d.f(), (C2692Ni) this.f29315e.f(), (C3364ik) this.f29316f.f());
        }
    }
}
