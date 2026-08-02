package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Gg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2591Gg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25834n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC2625Ig f25835u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f25836v;

    public /* synthetic */ RunnableC2591Gg(TextureViewSurfaceTextureListenerC2625Ig textureViewSurfaceTextureListenerC2625Ig, String str, int i) {
        this.f25834n = i;
        this.f25835u = textureViewSurfaceTextureListenerC2625Ig;
        this.f25836v = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25834n) {
            case 0:
                C4137wg c4137wg = this.f25835u.f26292z;
                if (c4137wg != null) {
                    c4137wg.c(com.anythink.expressad.foundation.d.g.i, "what", "ExoPlayerAdapter exception", "extra", this.f25836v);
                    break;
                }
                break;
            default:
                C4137wg c4137wg2 = this.f25835u.f26292z;
                if (c4137wg2 != null) {
                    c4137wg2.c("error", "what", "ExoPlayerAdapter error", "extra", this.f25836v);
                    break;
                }
                break;
        }
    }
}
