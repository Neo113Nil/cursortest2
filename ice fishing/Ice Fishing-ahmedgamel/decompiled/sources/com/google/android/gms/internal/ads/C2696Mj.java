package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Mj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2696Mj implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27110a;

    /* renamed from: b, reason: collision with root package name */
    public final C3504ku f27111b;

    public /* synthetic */ C2696Mj(C3504ku c3504ku, int i) {
        this.f27110a = i;
        this.f27111b = c3504ku;
    }

    public St a() {
        St st = (St) this.f27111b.f32446v;
        AbstractC3364iD.j(st);
        return st;
    }

    public Yt b() {
        Yt yt = (Yt) this.f27111b.f32445u;
        AbstractC3364iD.j(yt);
        return yt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f27110a) {
            case 0:
                St st = (St) this.f27111b.f32446v;
                AbstractC3364iD.j(st);
                return st;
            case 1:
                return (String) this.f27111b.f32447w;
            case 2:
                return this.f27111b.r();
            default:
                Yt yt = (Yt) this.f27111b.f32445u;
                AbstractC3364iD.j(yt);
                return yt;
        }
    }
}
