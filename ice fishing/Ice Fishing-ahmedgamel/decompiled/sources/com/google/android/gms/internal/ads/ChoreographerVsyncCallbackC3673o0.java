package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* renamed from: com.google.android.gms.internal.ads.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ChoreographerVsyncCallbackC3673o0 extends AbstractC3565m0 implements Choreographer$VsyncCallback {

    /* renamed from: x, reason: collision with root package name */
    public final Handler f33619x;

    public /* synthetic */ ChoreographerVsyncCallbackC3673o0(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.f33619x = AbstractC3182eu.p();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3565m0
    public final void a() {
        this.f32655u.registerDisplayListener(this, AbstractC3182eu.p());
        this.f32654n.postVsyncCallback(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3565m0
    public final void b() {
        this.f32655u.unregisterDisplayListener(this);
        this.f33619x.removeCallbacksAndMessages(null);
        this.f32654n.removeVsyncCallback(this);
        this.f32656v = com.anythink.basead.exoplayer.b.f7168b;
        this.f32657w = com.anythink.basead.exoplayer.b.f7168b;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.f32654n.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        long frameTimeNanos;
        Choreographer.FrameTimeline[] frameTimelines;
        long expectedPresentationTimeNanos;
        long expectedPresentationTimeNanos2;
        frameTimeNanos = frameData.getFrameTimeNanos();
        this.f32656v = frameTimeNanos;
        frameTimelines = frameData.getFrameTimelines();
        int length = frameTimelines.length;
        long j6 = com.anythink.basead.exoplayer.b.f7168b;
        if (length >= 2) {
            expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos();
            expectedPresentationTimeNanos2 = frameTimelines[0].getExpectedPresentationTimeNanos();
            long j9 = expectedPresentationTimeNanos - expectedPresentationTimeNanos2;
            if (j9 != 0) {
                j6 = j9;
            }
            this.f32657w = j6;
        } else {
            this.f32657w = com.anythink.basead.exoplayer.b.f7168b;
        }
        this.f33619x.postDelayed(new RunnableC3134e(3, this), 500L);
    }
}
