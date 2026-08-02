package androidx.metrics.performance;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;

/* loaded from: classes3.dex */
public final class FrameDataApi31 extends FrameDataApi24 {
    public long frameDurationTotalNanos;
    public long frameOverrunNanos;

    @Override // androidx.metrics.performance.FrameDataApi24
    public final boolean equals(Object obj) {
        if (!(obj instanceof FrameDataApi31) || !super.equals(obj)) {
            return false;
        }
        FrameDataApi31 frameDataApi31 = (FrameDataApi31) obj;
        return this.frameDurationTotalNanos == frameDataApi31.frameDurationTotalNanos && this.frameOverrunNanos == frameDataApi31.frameOverrunNanos;
    }

    @Override // androidx.metrics.performance.FrameDataApi24
    public final int hashCode() {
        return Long.hashCode(this.frameOverrunNanos) + (Long.hashCode(this.frameDurationTotalNanos) * 31) + (super.hashCode() * 31);
    }

    @Override // androidx.metrics.performance.FrameDataApi24
    public final String toString() {
        StringBuilder sb = new StringBuilder("FrameData(frameStartNanos=");
        sb.append(this.frameStartNanos);
        sb.append(", frameDurationUiNanos=");
        sb.append(this.frameDurationUiNanos);
        sb.append(", frameDurationCpuNanos=");
        sb.append(this.frameDurationCpuNanos);
        sb.append(", frameDurationTotalNanos=");
        sb.append(this.frameDurationTotalNanos);
        sb.append(", frameOverrunNanos=");
        sb.append(this.frameOverrunNanos);
        sb.append(", isJank=");
        sb.append(this.isJank);
        sb.append(", states=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.states, ')');
    }
}
