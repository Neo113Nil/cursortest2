package androidx.metrics.performance;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class FrameDataApi24 {
    public long frameDurationCpuNanos;
    public long frameDurationUiNanos;
    public long frameStartNanos;
    public boolean isJank;
    public final List states;

    public FrameDataApi24(ArrayList arrayList) {
        arrayList.getClass();
        arrayList.getClass();
        this.states = arrayList;
        this.frameStartNanos = 0L;
        this.frameDurationUiNanos = 0L;
        this.isJank = false;
        this.frameDurationCpuNanos = 0L;
    }

    public boolean equals(Object obj) {
        return (obj instanceof FrameDataApi24) && equals$androidx$metrics$performance$FrameData(obj) && this.frameDurationCpuNanos == ((FrameDataApi24) obj).frameDurationCpuNanos;
    }

    public final boolean equals$androidx$metrics$performance$FrameData(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        FrameDataApi24 frameDataApi24 = (FrameDataApi24) obj;
        return this.frameStartNanos == frameDataApi24.frameStartNanos && this.frameDurationUiNanos == frameDataApi24.frameDurationUiNanos && this.isJank == frameDataApi24.isJank && Intrinsics.areEqual(this.states, frameDataApi24.states);
    }

    public final long getFrameStartNanos() {
        return this.frameStartNanos;
    }

    public int hashCode() {
        return Long.hashCode(this.frameDurationCpuNanos) + (hashCode$androidx$metrics$performance$FrameData() * 31);
    }

    public final int hashCode$androidx$metrics$performance$FrameData() {
        return this.states.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.frameStartNanos) * 31, 31, this.frameDurationUiNanos), 31, this.isJank);
    }

    public final boolean isJank() {
        return this.isJank;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FrameData(frameStartNanos=");
        sb.append(this.frameStartNanos);
        sb.append(", frameDurationUiNanos=");
        sb.append(this.frameDurationUiNanos);
        sb.append(", frameDurationCpuNanos=");
        sb.append(this.frameDurationCpuNanos);
        sb.append(", isJank=");
        sb.append(this.isJank);
        sb.append(", states=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.states, ')');
    }
}
