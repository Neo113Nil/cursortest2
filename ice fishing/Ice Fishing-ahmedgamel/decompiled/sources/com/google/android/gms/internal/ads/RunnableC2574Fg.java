package com.google.android.gms.internal.ads;

import java.io.IOException;
import w2.HandlerC5139A;

/* renamed from: com.google.android.gms.internal.ads.Fg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2574Fg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25604n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC2625Ig f25605u;

    public /* synthetic */ RunnableC2574Fg(TextureViewSurfaceTextureListenerC2625Ig textureViewSurfaceTextureListenerC2625Ig, int i) {
        this.f25604n = i;
        this.f25605u = textureViewSurfaceTextureListenerC2625Ig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC2625Ig textureViewSurfaceTextureListenerC2625Ig = this.f25605u;
        switch (this.f25604n) {
            case 0:
                C4137wg c4137wg = textureViewSurfaceTextureListenerC2625Ig.f26292z;
                if (c4137wg != null) {
                    c4137wg.e();
                    break;
                }
                break;
            case 1:
                C4137wg c4137wg2 = textureViewSurfaceTextureListenerC2625Ig.f26292z;
                if (c4137wg2 != null) {
                    c4137wg2.k();
                    break;
                }
                break;
            case 2:
                C4137wg c4137wg3 = textureViewSurfaceTextureListenerC2625Ig.f26292z;
                if (c4137wg3 != null) {
                    c4137wg3.h();
                    break;
                }
                break;
            case 3:
                C4137wg c4137wg4 = textureViewSurfaceTextureListenerC2625Ig.f26292z;
                if (c4137wg4 != null) {
                    c4137wg4.f();
                    break;
                }
                break;
            case 4:
                C4137wg c4137wg5 = textureViewSurfaceTextureListenerC2625Ig.f26292z;
                if (c4137wg5 != null) {
                    c4137wg5.g();
                    break;
                }
                break;
            case 5:
                C4137wg c4137wg6 = textureViewSurfaceTextureListenerC2625Ig.f26292z;
                if (c4137wg6 != null) {
                    RunnableC4083vg runnableC4083vg = c4137wg6.f35638x;
                    runnableC4083vg.f35471v = false;
                    HandlerC5139A handlerC5139A = w2.D.f41627l;
                    handlerC5139A.removeCallbacks(runnableC4083vg);
                    handlerC5139A.postDelayed(runnableC4083vg, 250L);
                    handlerC5139A.post(new RunnableC4029ug(c4137wg6, 0));
                    break;
                }
                break;
            case 6:
                C4137wg c4137wg7 = textureViewSurfaceTextureListenerC2625Ig.f26292z;
                if (c4137wg7 != null) {
                    c4137wg7.i();
                    break;
                }
                break;
            default:
                C2557Eg c2557Eg = textureViewSurfaceTextureListenerC2625Ig.f35108u;
                float f2 = c2557Eg.f25392c ? c2557Eg.f25394e ? 0.0f : c2557Eg.f25395f : 0.0f;
                C3437jh c3437jh = textureViewSurfaceTextureListenerC2625Ig.f26277B;
                if (c3437jh == null) {
                    int i = w2.z.f41712b;
                    x2.i.f("Trying to set volume before player is initialized.");
                    break;
                } else {
                    try {
                        C4074vO c4074vO = c3437jh.f32083z;
                        if (c4074vO != null) {
                            c4074vO.f35459w.b();
                            c4074vO.f35458v.R1(f2);
                            break;
                        }
                    } catch (IOException e9) {
                        int i4 = w2.z.f41712b;
                        x2.i.g("", e9);
                        return;
                    }
                }
                break;
        }
    }
}
