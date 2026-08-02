package com.google.android.gms.internal.ads;

import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.tf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3974tf extends AbstractBinderC3759pf {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35104n;

    /* renamed from: u, reason: collision with root package name */
    public final m2.x f35105u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f35106v;

    public /* synthetic */ BinderC3974tf(m2.x xVar, Object obj, int i) {
        this.f35104n = i;
        this.f35105u = xVar;
        this.f35106v = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3813qf
    public final void a(C4969z0 c4969z0) {
        switch (this.f35104n) {
            case 0:
                I2.d dVar = (I2.d) this.f35105u;
                if (dVar != null) {
                    dVar.onAdFailedToLoad(c4969z0.b());
                    break;
                }
                break;
            default:
                J2.b bVar = (J2.b) this.f35105u;
                if (bVar != null) {
                    bVar.onAdFailedToLoad(c4969z0.b());
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3813qf
    public final void d() {
        C4190xf c4190xf;
        switch (this.f35104n) {
            case 0:
                I2.d dVar = (I2.d) this.f35105u;
                if (dVar != null) {
                    dVar.onAdLoaded((C3920sf) this.f35106v);
                    break;
                }
                break;
            default:
                J2.b bVar = (J2.b) this.f35105u;
                if (bVar != null && (c4190xf = (C4190xf) this.f35106v) != null) {
                    bVar.onAdLoaded(c4190xf);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3813qf
    public final void v(int i) {
        int i4 = this.f35104n;
    }

    private final void U3(int i) {
    }

    private final void V3(int i) {
    }
}
