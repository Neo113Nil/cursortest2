package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Gg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2571Gg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25046n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC2605Ig f25047u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f25048v;

    public /* synthetic */ RunnableC2571Gg(TextureViewSurfaceTextureListenerC2605Ig textureViewSurfaceTextureListenerC2605Ig, String str, int i) {
        this.f25046n = i;
        this.f25047u = textureViewSurfaceTextureListenerC2605Ig;
        this.f25048v = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25046n) {
            case 0:
                C4114wg c4114wg = this.f25047u.f25543z;
                if (c4114wg != null) {
                    c4114wg.c(com.anythink.expressad.foundation.d.g.i, "what", "ExoPlayerAdapter exception", "extra", this.f25048v);
                    break;
                }
                break;
            default:
                C4114wg c4114wg2 = this.f25047u.f25543z;
                if (c4114wg2 != null) {
                    c4114wg2.c("error", "what", "ExoPlayerAdapter error", "extra", this.f25048v);
                    break;
                }
                break;
        }
    }
}
