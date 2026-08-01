package com.google.android.gms.internal.ads;

import java.io.IOException;
import u2.HandlerC5068A;

/* renamed from: com.google.android.gms.internal.ads.Fg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2554Fg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24815n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC2605Ig f24816u;

    public /* synthetic */ RunnableC2554Fg(TextureViewSurfaceTextureListenerC2605Ig textureViewSurfaceTextureListenerC2605Ig, int i) {
        this.f24815n = i;
        this.f24816u = textureViewSurfaceTextureListenerC2605Ig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC2605Ig textureViewSurfaceTextureListenerC2605Ig = this.f24816u;
        switch (this.f24815n) {
            case 0:
                C4114wg c4114wg = textureViewSurfaceTextureListenerC2605Ig.f25543z;
                if (c4114wg != null) {
                    c4114wg.e();
                    break;
                }
                break;
            case 1:
                C4114wg c4114wg2 = textureViewSurfaceTextureListenerC2605Ig.f25543z;
                if (c4114wg2 != null) {
                    c4114wg2.k();
                    break;
                }
                break;
            case 2:
                C4114wg c4114wg3 = textureViewSurfaceTextureListenerC2605Ig.f25543z;
                if (c4114wg3 != null) {
                    c4114wg3.h();
                    break;
                }
                break;
            case 3:
                C4114wg c4114wg4 = textureViewSurfaceTextureListenerC2605Ig.f25543z;
                if (c4114wg4 != null) {
                    c4114wg4.f();
                    break;
                }
                break;
            case 4:
                C4114wg c4114wg5 = textureViewSurfaceTextureListenerC2605Ig.f25543z;
                if (c4114wg5 != null) {
                    c4114wg5.g();
                    break;
                }
                break;
            case 5:
                C4114wg c4114wg6 = textureViewSurfaceTextureListenerC2605Ig.f25543z;
                if (c4114wg6 != null) {
                    RunnableC4060vg runnableC4060vg = c4114wg6.f34861x;
                    runnableC4060vg.f34714v = false;
                    HandlerC5068A handlerC5068A = u2.D.f41237l;
                    handlerC5068A.removeCallbacks(runnableC4060vg);
                    handlerC5068A.postDelayed(runnableC4060vg, 250L);
                    handlerC5068A.post(new RunnableC4006ug(c4114wg6, 0));
                    break;
                }
                break;
            case 6:
                C4114wg c4114wg7 = textureViewSurfaceTextureListenerC2605Ig.f25543z;
                if (c4114wg7 != null) {
                    c4114wg7.i();
                    break;
                }
                break;
            default:
                C2537Eg c2537Eg = textureViewSurfaceTextureListenerC2605Ig.f34329u;
                float f3 = c2537Eg.f24639c ? c2537Eg.f24641e ? 0.0f : c2537Eg.f24642f : 0.0f;
                C3414jh c3414jh = textureViewSurfaceTextureListenerC2605Ig.f25528B;
                if (c3414jh == null) {
                    int i = u2.z.f41322b;
                    v2.i.f("Trying to set volume before player is initialized.");
                    break;
                } else {
                    try {
                        C4051vO c4051vO = c3414jh.f31296z;
                        if (c4051vO != null) {
                            c4051vO.f34696w.b();
                            c4051vO.f34695v.Q1(f3);
                            break;
                        }
                    } catch (IOException e9) {
                        int i6 = u2.z.f41322b;
                        v2.i.g("", e9);
                        return;
                    }
                }
                break;
        }
    }
}
