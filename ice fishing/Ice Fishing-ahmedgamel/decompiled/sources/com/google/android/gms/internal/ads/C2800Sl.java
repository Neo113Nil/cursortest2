package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Sl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2800Sl implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28336a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.s f28337b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f28338c;

    public /* synthetic */ C2800Sl(S0.s sVar, C3266gN c3266gN, int i) {
        this.f28336a = i;
        this.f28337b = sVar;
        this.f28338c = c3266gN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f28336a) {
            case 0:
                Set u6 = this.f28337b.u((C3280gk) this.f28338c.f());
                AbstractC3364iD.j(u6);
                return u6;
            default:
                return new C2528Cl(new C3655nj(1, (InterfaceC4084vh) this.f28337b.f2970v), (Executor) this.f28338c.f());
        }
    }
}
