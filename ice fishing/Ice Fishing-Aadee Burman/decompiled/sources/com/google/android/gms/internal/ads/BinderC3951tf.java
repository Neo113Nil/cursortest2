package com.google.android.gms.internal.ads;

import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.tf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3951tf extends AbstractBinderC3736pf {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34325n;

    /* renamed from: u, reason: collision with root package name */
    public final k2.x f34326u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f34327v;

    public /* synthetic */ BinderC3951tf(k2.x xVar, Object obj, int i) {
        this.f34325n = i;
        this.f34326u = xVar;
        this.f34327v = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3790qf
    public final void a(C4920z0 c4920z0) {
        switch (this.f34325n) {
            case 0:
                G2.d dVar = (G2.d) this.f34326u;
                if (dVar != null) {
                    dVar.onAdFailedToLoad(c4920z0.b());
                    break;
                }
                break;
            default:
                H2.b bVar = (H2.b) this.f34326u;
                if (bVar != null) {
                    bVar.onAdFailedToLoad(c4920z0.b());
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3790qf
    public final void d() {
        C4167xf c4167xf;
        switch (this.f34325n) {
            case 0:
                G2.d dVar = (G2.d) this.f34326u;
                if (dVar != null) {
                    dVar.onAdLoaded((C3897sf) this.f34327v);
                    break;
                }
                break;
            default:
                H2.b bVar = (H2.b) this.f34326u;
                if (bVar != null && (c4167xf = (C4167xf) this.f34327v) != null) {
                    bVar.onAdLoaded(c4167xf);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3790qf
    public final void v(int i) {
        int i6 = this.f34325n;
    }

    private final void U3(int i) {
    }

    private final void V3(int i) {
    }
}
