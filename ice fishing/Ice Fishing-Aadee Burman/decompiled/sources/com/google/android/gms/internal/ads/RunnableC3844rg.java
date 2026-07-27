package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3844rg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33644n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f33645u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f33646v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AbstractC3952tg f33647w;

    public /* synthetic */ RunnableC3844rg(AbstractC3952tg abstractC3952tg, int i, int i6, int i9) {
        this.f33644n = i9;
        this.f33645u = i;
        this.f33646v = i6;
        this.f33647w = abstractC3952tg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33644n) {
            case 0:
                C4114wg c4114wg = ((TextureViewSurfaceTextureListenerC3898sg) this.f33647w).J;
                if (c4114wg != null) {
                    c4114wg.j(this.f33645u, this.f33646v);
                    break;
                }
                break;
            default:
                C4114wg c4114wg2 = ((TextureViewSurfaceTextureListenerC2605Ig) this.f33647w).f25543z;
                if (c4114wg2 != null) {
                    c4114wg2.j(this.f33645u, this.f33646v);
                    break;
                }
                break;
        }
    }
}
