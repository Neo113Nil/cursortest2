package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.Il, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2630Il implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26314a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f26315b;

    /* renamed from: c, reason: collision with root package name */
    public final C2696Mj f26316c;

    public C2630Il(C2696Mj c2696Mj, C3266gN c3266gN) {
        this.f26314a = 0;
        this.f26316c = c2696Mj;
        this.f26315b = c3266gN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final /* bridge */ /* synthetic */ Object f() {
        switch (this.f26314a) {
            case 0:
                return new C2613Hl(this.f26316c.a(), (C4260yv) this.f26315b.f());
            case 1:
                return new C2545Dl((Context) this.f26315b.f(), new HashSet(), this.f26316c.a());
            default:
                return new C2496An((C2595Gk) this.f26315b.f(), this.f26316c.a());
        }
    }

    public /* synthetic */ C2630Il(C3266gN c3266gN, C2696Mj c2696Mj, int i) {
        this.f26314a = i;
        this.f26315b = c3266gN;
        this.f26316c = c2696Mj;
    }
}
