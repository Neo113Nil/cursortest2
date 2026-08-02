package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3604mm implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33355a;

    /* renamed from: b, reason: collision with root package name */
    public final C4031ui f33356b;

    public /* synthetic */ C3604mm(C4031ui c4031ui, int i) {
        this.f33355a = i;
        this.f33356b = c4031ui;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f33355a) {
            case 0:
                return new BinderC3496km(this.f33356b.a());
            default:
                return new C4306zn(this.f33356b.a());
        }
    }
}
