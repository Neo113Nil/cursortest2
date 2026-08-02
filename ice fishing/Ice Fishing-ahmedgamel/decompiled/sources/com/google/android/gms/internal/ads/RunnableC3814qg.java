package com.google.android.gms.internal.ads;

import java.util.Objects;
import w2.HandlerC5139A;

/* renamed from: com.google.android.gms.internal.ads.qg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3814qg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34037n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC3921sg f34038u;

    public /* synthetic */ RunnableC3814qg(TextureViewSurfaceTextureListenerC3921sg textureViewSurfaceTextureListenerC3921sg, int i, boolean z6) {
        this.f34037n = i;
        this.f34038u = textureViewSurfaceTextureListenerC3921sg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34037n) {
            case 0:
                C4137wg c4137wg = this.f34038u.J;
                if (c4137wg != null) {
                    c4137wg.h();
                    break;
                }
                break;
            case 1:
                C4137wg c4137wg2 = this.f34038u.J;
                if (c4137wg2 != null) {
                    RunnableC4083vg runnableC4083vg = c4137wg2.f35638x;
                    runnableC4083vg.f35471v = false;
                    HandlerC5139A handlerC5139A = w2.D.f41627l;
                    handlerC5139A.removeCallbacks(runnableC4083vg);
                    handlerC5139A.postDelayed(runnableC4083vg, 250L);
                    handlerC5139A.post(new RunnableC4029ug(c4137wg2, 0));
                    break;
                }
                break;
            case 2:
                TextureViewSurfaceTextureListenerC3921sg textureViewSurfaceTextureListenerC3921sg = this.f34038u;
                C4137wg c4137wg3 = textureViewSurfaceTextureListenerC3921sg.J;
                if (c4137wg3 != null) {
                    c4137wg3.g();
                    textureViewSurfaceTextureListenerC3921sg.J.i();
                    break;
                }
                break;
            case 3:
                TextureViewSurfaceTextureListenerC3921sg textureViewSurfaceTextureListenerC3921sg2 = this.f34038u;
                C4137wg c4137wg4 = textureViewSurfaceTextureListenerC3921sg2.J;
                if (c4137wg4 != null) {
                    if (!textureViewSurfaceTextureListenerC3921sg2.f34762K) {
                        c4137wg4.k();
                        textureViewSurfaceTextureListenerC3921sg2.f34762K = true;
                    }
                    textureViewSurfaceTextureListenerC3921sg2.J.f();
                    break;
                }
                break;
            default:
                C4137wg c4137wg5 = this.f34038u.J;
                if (c4137wg5 != null) {
                    c4137wg5.g();
                    break;
                }
                break;
        }
    }

    public RunnableC3814qg(TextureViewSurfaceTextureListenerC3921sg textureViewSurfaceTextureListenerC3921sg, int i) {
        this.f34037n = i;
        switch (i) {
            case 4:
                Objects.requireNonNull(textureViewSurfaceTextureListenerC3921sg);
                this.f34038u = textureViewSurfaceTextureListenerC3921sg;
                break;
            default:
                Objects.requireNonNull(textureViewSurfaceTextureListenerC3921sg);
                this.f34038u = textureViewSurfaceTextureListenerC3921sg;
                break;
        }
    }
}
