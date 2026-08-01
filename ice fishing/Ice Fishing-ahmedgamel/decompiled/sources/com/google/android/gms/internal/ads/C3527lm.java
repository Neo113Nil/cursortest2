package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3527lm implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31845a;

    /* renamed from: b, reason: collision with root package name */
    public final C4008ui f31846b;

    public /* synthetic */ C3527lm(C4008ui c4008ui, int i) {
        this.f31845a = i;
        this.f31846b = c4008ui;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f31845a) {
            case 0:
                return new BinderC3419jm(this.f31846b.a());
            default:
                return new C4229yn(this.f31846b.a());
        }
    }
}
