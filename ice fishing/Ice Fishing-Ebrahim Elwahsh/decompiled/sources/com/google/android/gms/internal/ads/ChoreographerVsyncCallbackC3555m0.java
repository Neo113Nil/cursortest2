package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* renamed from: com.google.android.gms.internal.ads.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ChoreographerVsyncCallbackC3555m0 extends AbstractC3447k0 implements Choreographer$VsyncCallback {

    /* renamed from: x, reason: collision with root package name */
    public final Handler f32639x;

    public /* synthetic */ ChoreographerVsyncCallbackC3555m0(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.f32639x = AbstractC3548lu.p();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3447k0
    public final void a() {
        this.f32231u.registerDisplayListener(this, AbstractC3548lu.p());
        this.f32230n.postVsyncCallback(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3447k0
    public final void b() {
        this.f32231u.unregisterDisplayListener(this);
        this.f32639x.removeCallbacksAndMessages(null);
        this.f32230n.removeVsyncCallback(this);
        this.f32232v = com.anythink.basead.exoplayer.b.f6539b;
        this.f32233w = com.anythink.basead.exoplayer.b.f6539b;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.f32230n.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        long frameTimeNanos;
        Choreographer.FrameTimeline[] frameTimelines;
        long expectedPresentationTimeNanos;
        long expectedPresentationTimeNanos2;
        frameTimeNanos = frameData.getFrameTimeNanos();
        this.f32232v = frameTimeNanos;
        frameTimelines = frameData.getFrameTimelines();
        int length = frameTimelines.length;
        long j9 = com.anythink.basead.exoplayer.b.f6539b;
        if (length >= 2) {
            expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos();
            expectedPresentationTimeNanos2 = frameTimelines[0].getExpectedPresentationTimeNanos();
            long j10 = expectedPresentationTimeNanos - expectedPresentationTimeNanos2;
            if (j10 != 0) {
                j9 = j10;
            }
            this.f32233w = j9;
        } else {
            this.f32233w = com.anythink.basead.exoplayer.b.f6539b;
        }
        this.f32639x.postDelayed(new RunnableC3068d(3, this), 500L);
    }
}
