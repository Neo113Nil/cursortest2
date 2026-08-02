package com.google.android.gms.internal.ads;

import android.view.Choreographer;

/* renamed from: com.google.android.gms.internal.ads.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ChoreographerFrameCallbackC3619n0 extends AbstractC3565m0 implements Choreographer.FrameCallback {
    @Override // com.google.android.gms.internal.ads.AbstractC3565m0
    public final void a() {
        long j6;
        this.f32655u.registerDisplayListener(this, AbstractC3182eu.p());
        this.f32654n.postFrameCallback(this);
        if (this.f32655u.getDisplay(0) != null) {
            j6 = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            AbstractC2991bG.y("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j6 = com.anythink.basead.exoplayer.b.f7168b;
        }
        this.f32657w = j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3565m0
    public final void b() {
        this.f32655u.unregisterDisplayListener(this);
        this.f32654n.removeFrameCallback(this);
        this.f32656v = com.anythink.basead.exoplayer.b.f7168b;
        this.f32657w = com.anythink.basead.exoplayer.b.f7168b;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        this.f32656v = j6;
        this.f32654n.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long j6;
        if (i == 0) {
            this.f32654n.postFrameCallback(this);
            if (this.f32655u.getDisplay(0) != null) {
                j6 = (long) (1.0E9d / r5.getRefreshRate());
            } else {
                AbstractC2991bG.y("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                j6 = com.anythink.basead.exoplayer.b.f7168b;
            }
            this.f32657w = j6;
        }
    }
}
