package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Mj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2676Mj implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26321a;

    /* renamed from: b, reason: collision with root package name */
    public final C3481ku f26322b;

    public /* synthetic */ C2676Mj(C3481ku c3481ku, int i) {
        this.f26321a = i;
        this.f26322b = c3481ku;
    }

    public St a() {
        St st = (St) this.f26322b.f31664v;
        AbstractC3341iD.j(st);
        return st;
    }

    public Yt b() {
        Yt yt = (Yt) this.f26322b.f31663u;
        AbstractC3341iD.j(yt);
        return yt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f26321a) {
            case 0:
                St st = (St) this.f26322b.f31664v;
                AbstractC3341iD.j(st);
                return st;
            case 1:
                return (String) this.f26322b.f31665w;
            case 2:
                return this.f26322b.s();
            default:
                Yt yt = (Yt) this.f26322b.f31663u;
                AbstractC3341iD.j(yt);
                return yt;
        }
    }
}
