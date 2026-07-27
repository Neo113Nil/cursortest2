package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2630Jo implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25760a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f25761b;

    /* renamed from: c, reason: collision with root package name */
    public final C3795qk f25762c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f25763d;

    public /* synthetic */ C2630Jo(C3243gN c3243gN, C3795qk c3795qk, C3243gN c3243gN2, int i) {
        this.f25760a = i;
        this.f25761b = c3243gN;
        this.f25762c = c3795qk;
        this.f25763d = c3243gN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final /* bridge */ /* synthetic */ Object f() {
        switch (this.f25760a) {
            case 0:
                return new C2613Io((C2749Qo) this.f25761b.f(), this.f25762c.a(), (String) this.f25763d.f());
            default:
                return new Qr((T2.a) this.f25761b.f(), this.f25762c.a(), ((Long) this.f25763d.f()).longValue());
        }
    }
}
