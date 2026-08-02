package com.squareup.cash.graphics.swampgl;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public final class PerformanceMetrics {
    public final int entityCount;
    public final float fps;
    public final long frameTimeMs;
    public final long shaderCompileTimeMs;
    public final long timeToFirstFrameMs;
    public final int viewportHeight;
    public final int viewportWidth;
    public final int visibleEntityCount;

    public PerformanceMetrics(float f, long j, long j2, long j3, int i, int i2, int i3, int i4) {
        this.fps = f;
        this.frameTimeMs = j;
        this.shaderCompileTimeMs = j2;
        this.timeToFirstFrameMs = j3;
        this.entityCount = i;
        this.visibleEntityCount = i2;
        this.viewportWidth = i3;
        this.viewportHeight = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerformanceMetrics)) {
            return false;
        }
        PerformanceMetrics performanceMetrics = (PerformanceMetrics) obj;
        return Float.compare(this.fps, performanceMetrics.fps) == 0 && this.frameTimeMs == performanceMetrics.frameTimeMs && this.shaderCompileTimeMs == performanceMetrics.shaderCompileTimeMs && this.timeToFirstFrameMs == performanceMetrics.timeToFirstFrameMs && this.entityCount == performanceMetrics.entityCount && this.visibleEntityCount == performanceMetrics.visibleEntityCount && this.viewportWidth == performanceMetrics.viewportWidth && this.viewportHeight == performanceMetrics.viewportHeight;
    }

    public final int hashCode() {
        return Integer.hashCode(this.viewportHeight) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.viewportWidth, (((Integer.hashCode(this.visibleEntityCount) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.entityCount, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Float.hashCode(this.fps) * 31, 31, this.frameTimeMs), 31, this.shaderCompileTimeMs), 31, this.timeToFirstFrameMs), 31)) * 31) + 79702124) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformanceMetrics(fps=");
        sb.append(this.fps);
        sb.append(", frameTimeMs=");
        sb.append(this.frameTimeMs);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.shaderCompileTimeMs, ", shaderCompileTimeMs=", ", timeToFirstFrameMs=", sb);
        sb.append(this.timeToFirstFrameMs);
        sb.append(", entityCount=");
        sb.append(this.entityCount);
        Fragment$5$$ExternalSyntheticOutline0.m(this.visibleEntityCount, this.viewportWidth, ", visibleEntityCount=", ", backend=Scene, viewportWidth=", sb);
        return re$$ExternalSyntheticOutline0.m(this.viewportHeight, ", viewportHeight=", ")", sb);
    }
}
