package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ln, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3528ln implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31847a;

    /* renamed from: b, reason: collision with root package name */
    public final C2676Mj f31848b;

    /* renamed from: c, reason: collision with root package name */
    public final Yr f31849c;

    /* renamed from: d, reason: collision with root package name */
    public final C4008ui f31850d;

    public /* synthetic */ C3528ln(C2676Mj c2676Mj, Yr yr, C4008ui c4008ui, int i) {
        this.f31847a = i;
        this.f31848b = c2676Mj;
        this.f31849c = yr;
        this.f31850d = c4008ui;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f31847a) {
            case 0:
                return new BinderC3474kn((String) this.f31848b.f26322b.f31665w, (C3797qm) this.f31849c.f(), this.f31850d.a());
            default:
                return new BinderC3582mn((String) this.f31848b.f26322b.f31665w, (C3797qm) this.f31849c.f(), this.f31850d.a());
        }
    }
}
