package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* renamed from: com.google.android.gms.internal.ads.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ChoreographerVsyncCallbackC3650o0 extends AbstractC3542m0 implements Choreographer$VsyncCallback {

    /* renamed from: x, reason: collision with root package name */
    public final Handler f32832x;

    public /* synthetic */ ChoreographerVsyncCallbackC3650o0(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.f32832x = AbstractC3159eu.p();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542m0
    public final void a() {
        this.f31875u.registerDisplayListener(this, AbstractC3159eu.p());
        this.f31874n.postVsyncCallback(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542m0
    public final void b() {
        this.f31875u.unregisterDisplayListener(this);
        this.f32832x.removeCallbacksAndMessages(null);
        this.f31874n.removeVsyncCallback(this);
        this.f31876v = com.anythink.basead.exoplayer.b.f6382b;
        this.f31877w = com.anythink.basead.exoplayer.b.f6382b;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.f31874n.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        long frameTimeNanos;
        Choreographer.FrameTimeline[] frameTimelines;
        long expectedPresentationTimeNanos;
        long expectedPresentationTimeNanos2;
        frameTimeNanos = frameData.getFrameTimeNanos();
        this.f31876v = frameTimeNanos;
        frameTimelines = frameData.getFrameTimelines();
        int length = frameTimelines.length;
        long j6 = com.anythink.basead.exoplayer.b.f6382b;
        if (length >= 2) {
            expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos();
            expectedPresentationTimeNanos2 = frameTimelines[0].getExpectedPresentationTimeNanos();
            long j9 = expectedPresentationTimeNanos - expectedPresentationTimeNanos2;
            if (j9 != 0) {
                j6 = j9;
            }
            this.f31877w = j6;
        } else {
            this.f31877w = com.anythink.basead.exoplayer.b.f6382b;
        }
        this.f32832x.postDelayed(new RunnableC3111e(3, this), 500L);
    }
}
