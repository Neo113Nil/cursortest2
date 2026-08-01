package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Pl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2729Pl implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26854a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.s f26855b;

    public /* synthetic */ C2729Pl(S0.s sVar, int i) {
        this.f26854a = i;
        this.f26855b = sVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f26854a) {
            case 0:
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f26855b.f2841v;
                if (interfaceC4061vh == null) {
                    return null;
                }
                return interfaceC4061vh.q();
            case 1:
                InterfaceC4061vh interfaceC4061vh2 = (InterfaceC4061vh) this.f26855b.f2841v;
                if (interfaceC4061vh2 != null) {
                    return interfaceC4061vh2.q();
                }
                return null;
            default:
                return (InterfaceC4061vh) this.f26855b.f2841v;
        }
    }
}
