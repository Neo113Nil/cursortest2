package com.google.android.gms.internal.ads;

import java.util.Objects;
import u2.HandlerC5068A;

/* renamed from: com.google.android.gms.internal.ads.qg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3791qg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33255n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC3898sg f33256u;

    public /* synthetic */ RunnableC3791qg(TextureViewSurfaceTextureListenerC3898sg textureViewSurfaceTextureListenerC3898sg, int i, boolean z3) {
        this.f33255n = i;
        this.f33256u = textureViewSurfaceTextureListenerC3898sg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33255n) {
            case 0:
                C4114wg c4114wg = this.f33256u.J;
                if (c4114wg != null) {
                    c4114wg.h();
                    break;
                }
                break;
            case 1:
                C4114wg c4114wg2 = this.f33256u.J;
                if (c4114wg2 != null) {
                    RunnableC4060vg runnableC4060vg = c4114wg2.f34861x;
                    runnableC4060vg.f34714v = false;
                    HandlerC5068A handlerC5068A = u2.D.f41237l;
                    handlerC5068A.removeCallbacks(runnableC4060vg);
                    handlerC5068A.postDelayed(runnableC4060vg, 250L);
                    handlerC5068A.post(new RunnableC4006ug(c4114wg2, 0));
                    break;
                }
                break;
            case 2:
                TextureViewSurfaceTextureListenerC3898sg textureViewSurfaceTextureListenerC3898sg = this.f33256u;
                C4114wg c4114wg3 = textureViewSurfaceTextureListenerC3898sg.J;
                if (c4114wg3 != null) {
                    c4114wg3.g();
                    textureViewSurfaceTextureListenerC3898sg.J.i();
                    break;
                }
                break;
            case 3:
                TextureViewSurfaceTextureListenerC3898sg textureViewSurfaceTextureListenerC3898sg2 = this.f33256u;
                C4114wg c4114wg4 = textureViewSurfaceTextureListenerC3898sg2.J;
                if (c4114wg4 != null) {
                    if (!textureViewSurfaceTextureListenerC3898sg2.f33996K) {
                        c4114wg4.k();
                        textureViewSurfaceTextureListenerC3898sg2.f33996K = true;
                    }
                    textureViewSurfaceTextureListenerC3898sg2.J.f();
                    break;
                }
                break;
            default:
                C4114wg c4114wg5 = this.f33256u.J;
                if (c4114wg5 != null) {
                    c4114wg5.g();
                    break;
                }
                break;
        }
    }

    public RunnableC3791qg(TextureViewSurfaceTextureListenerC3898sg textureViewSurfaceTextureListenerC3898sg, int i) {
        this.f33255n = i;
        switch (i) {
            case 4:
                Objects.requireNonNull(textureViewSurfaceTextureListenerC3898sg);
                this.f33256u = textureViewSurfaceTextureListenerC3898sg;
                break;
            default:
                Objects.requireNonNull(textureViewSurfaceTextureListenerC3898sg);
                this.f33256u = textureViewSurfaceTextureListenerC3898sg;
                break;
        }
    }
}
