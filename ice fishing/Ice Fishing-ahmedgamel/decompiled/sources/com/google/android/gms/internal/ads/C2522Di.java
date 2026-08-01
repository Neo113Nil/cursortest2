package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Di, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2522Di implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24449a;

    /* renamed from: b, reason: collision with root package name */
    public final C2888Zh f24450b;

    public /* synthetic */ C2522Di(C2888Zh c2888Zh, int i) {
        this.f24449a = i;
        this.f24450b = c2888Zh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final /* bridge */ /* synthetic */ Object f() {
        switch (this.f24449a) {
            case 0:
                return new C2505Ci(this.f24450b.b(), 0);
            case 1:
                return new C2505Ci(this.f24450b.b(), 1);
            case 2:
                return new C2505Ci(this.f24450b.b(), 2);
            default:
                return new C2505Ci(this.f24450b.b(), 3);
        }
    }
}
