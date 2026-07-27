package com.google.android.gms.internal.ads;

import android.view.Choreographer;

/* renamed from: com.google.android.gms.internal.ads.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ChoreographerFrameCallbackC3596n0 extends AbstractC3542m0 implements Choreographer.FrameCallback {
    @Override // com.google.android.gms.internal.ads.AbstractC3542m0
    public final void a() {
        long j6;
        this.f31875u.registerDisplayListener(this, AbstractC3159eu.p());
        this.f31874n.postFrameCallback(this);
        if (this.f31875u.getDisplay(0) != null) {
            j6 = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            AbstractC2968bG.y("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j6 = com.anythink.basead.exoplayer.b.f6382b;
        }
        this.f31877w = j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542m0
    public final void b() {
        this.f31875u.unregisterDisplayListener(this);
        this.f31874n.removeFrameCallback(this);
        this.f31876v = com.anythink.basead.exoplayer.b.f6382b;
        this.f31877w = com.anythink.basead.exoplayer.b.f6382b;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        this.f31876v = j6;
        this.f31874n.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long j6;
        if (i == 0) {
            this.f31874n.postFrameCallback(this);
            if (this.f31875u.getDisplay(0) != null) {
                j6 = (long) (1.0E9d / r5.getRefreshRate());
            } else {
                AbstractC2968bG.y("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                j6 = com.anythink.basead.exoplayer.b.f6382b;
            }
            this.f31877w = j6;
        }
    }
}
