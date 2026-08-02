package io.flutter.view;

import android.view.Choreographer;

/* loaded from: classes4.dex */
class VsyncWaiter$FrameCallback implements Choreographer.FrameCallback {
    private long cookie;
    final /* synthetic */ e this$0;

    public VsyncWaiter$FrameCallback(e eVar, long j) {
        this.this$0 = eVar;
        this.cookie = j;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long nanoTime = System.nanoTime() - j;
        long j2 = nanoTime < 0 ? 0L : nanoTime;
        e eVar = this.this$0;
        eVar.b.onVsync(j2, eVar.a, this.cookie);
        this.this$0.c = this;
    }
}
