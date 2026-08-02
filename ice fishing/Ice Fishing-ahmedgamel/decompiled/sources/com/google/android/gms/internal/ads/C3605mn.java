package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3605mn implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33357a;

    /* renamed from: b, reason: collision with root package name */
    public final C2696Mj f33358b;

    /* renamed from: c, reason: collision with root package name */
    public final Yr f33359c;

    /* renamed from: d, reason: collision with root package name */
    public final C4031ui f33360d;

    public /* synthetic */ C3605mn(C2696Mj c2696Mj, Yr yr, C4031ui c4031ui, int i) {
        this.f33357a = i;
        this.f33358b = c2696Mj;
        this.f33359c = yr;
        this.f33360d = c4031ui;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f33357a) {
            case 0:
                return new BinderC3551ln((String) this.f33358b.f27111b.f32447w, (C3873rm) this.f33359c.f(), this.f33360d.a());
            default:
                return new BinderC3659nn((String) this.f33358b.f27111b.f32447w, (C3873rm) this.f33359c.f(), this.f33360d.a());
        }
    }
}
