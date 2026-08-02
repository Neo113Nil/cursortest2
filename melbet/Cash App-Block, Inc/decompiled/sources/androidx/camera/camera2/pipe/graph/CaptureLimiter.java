package androidx.camera.camera2.pipe.graph;

import android.util.Log;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.compat.AndroidFrameInfo;
import androidx.camera.camera2.pipe.graph.GraphLoop;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlinx.atomicfu.AtomicLong;

/* loaded from: classes3.dex */
public final class CaptureLimiter implements Request.Listener, GraphLoop.Listener {
    public GraphLoop _graphLoop;
    public final AtomicLong frameCount;
    public final long requestsUntilActive;

    public CaptureLimiter(long j) {
        this.requestsUntilActive = j;
        if (j <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            throw null;
        }
        AtomicLong atomicLong = new AtomicLong();
        atomicLong.value = 0L;
        this.frameCount = atomicLong;
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onComplete-CcXjc1I */
    public final void mo16onCompleteCcXjc1I(RequestMetadata requestMetadata, long j, AndroidFrameInfo androidFrameInfo) {
        long j2;
        long j3;
        AtomicLong atomicLong = this.frameCount;
        do {
            j2 = atomicLong.value;
            j3 = j2 != -1 ? 1 + j2 : -1L;
        } while (!AtomicLong.FU.compareAndSet(atomicLong, j2, j3));
        if (j3 == this.requestsUntilActive) {
            Log.w("CXCP", "Capture processing is now enabled for " + this._graphLoop + " after " + j3 + " frames.");
            GraphLoop graphLoop = this._graphLoop;
            graphLoop.getClass();
            graphLoop.setCaptureProcessingEnabled(true);
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public final void onGraphShutdown() {
        this.frameCount.value = -1L;
        GraphLoop graphLoop = this._graphLoop;
        graphLoop.getClass();
        graphLoop.setCaptureProcessingEnabled(false);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public final void onGraphStopped() {
        long j;
        AtomicLong atomicLong = this.frameCount;
        do {
            j = atomicLong.value;
        } while (!AtomicLong.FU.compareAndSet(atomicLong, j, j != -1 ? 0L : -1L));
        GraphLoop graphLoop = this._graphLoop;
        graphLoop.getClass();
        graphLoop.setCaptureProcessingEnabled(false);
        StringBuilder sb = new StringBuilder("Capture processing has been disabled for ");
        GraphLoop graphLoop2 = this._graphLoop;
        graphLoop2.getClass();
        sb.append(graphLoop2);
        sb.append(" until ");
        sb.append(this.requestsUntilActive);
        sb.append(" frames have been completed.");
        Log.w("CXCP", sb.toString());
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public final void onStopRepeating() {
    }
}
