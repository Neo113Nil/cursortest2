package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Di, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2542Di implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25196a;

    /* renamed from: b, reason: collision with root package name */
    public final C2911Zh f25197b;

    public /* synthetic */ C2542Di(C2911Zh c2911Zh, int i) {
        this.f25196a = i;
        this.f25197b = c2911Zh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final /* bridge */ /* synthetic */ Object f() {
        switch (this.f25196a) {
            case 0:
                return new C2525Ci(this.f25197b.b(), 0);
            case 1:
                return new C2525Ci(this.f25197b.b(), 1);
            case 2:
                return new C2525Ci(this.f25197b.b(), 2);
            default:
                return new C2525Ci(this.f25197b.b(), 3);
        }
    }
}
