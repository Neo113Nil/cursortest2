package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Vj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2826Vj implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28229a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3795qk f28230b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f28231c;

    public C2826Vj(C3795qk c3795qk, C3243gN c3243gN) {
        this.f28230b = c3795qk;
        this.f28231c = c3243gN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f28229a) {
            case 0:
                return new C2810Uj((C2858Xj) this.f28231c.f(), this.f28230b.a());
            default:
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                C3052cu a9 = this.f28230b.a();
                return new Sr(c3360ig, a9, 0);
        }
    }

    public C2826Vj(C3243gN c3243gN, C3795qk c3795qk) {
        this.f28231c = c3243gN;
        this.f28230b = c3795qk;
    }
}
