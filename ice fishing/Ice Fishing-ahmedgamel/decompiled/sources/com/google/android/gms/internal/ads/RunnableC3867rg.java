package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3867rg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34417n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f34418u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f34419v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AbstractC3975tg f34420w;

    public /* synthetic */ RunnableC3867rg(AbstractC3975tg abstractC3975tg, int i, int i4, int i6) {
        this.f34417n = i6;
        this.f34418u = i;
        this.f34419v = i4;
        this.f34420w = abstractC3975tg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34417n) {
            case 0:
                C4137wg c4137wg = ((TextureViewSurfaceTextureListenerC3921sg) this.f34420w).J;
                if (c4137wg != null) {
                    c4137wg.j(this.f34418u, this.f34419v);
                    break;
                }
                break;
            default:
                C4137wg c4137wg2 = ((TextureViewSurfaceTextureListenerC2625Ig) this.f34420w).f26292z;
                if (c4137wg2 != null) {
                    c4137wg2.j(this.f34418u, this.f34419v);
                    break;
                }
                break;
        }
    }
}
