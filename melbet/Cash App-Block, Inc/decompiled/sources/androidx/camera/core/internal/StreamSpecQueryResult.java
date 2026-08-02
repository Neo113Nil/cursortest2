package androidx.camera.core.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class StreamSpecQueryResult {
    public final int maxSupportedFrameRate;
    public final Map streamSpecs;

    public StreamSpecQueryResult(int i, Map map) {
        map.getClass();
        this.streamSpecs = map;
        this.maxSupportedFrameRate = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamSpecQueryResult)) {
            return false;
        }
        StreamSpecQueryResult streamSpecQueryResult = (StreamSpecQueryResult) obj;
        return Intrinsics.areEqual(this.streamSpecs, streamSpecQueryResult.streamSpecs) && this.maxSupportedFrameRate == streamSpecQueryResult.maxSupportedFrameRate;
    }

    public final int hashCode() {
        return Integer.hashCode(this.maxSupportedFrameRate) + (this.streamSpecs.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpecQueryResult(streamSpecs=");
        sb.append(this.streamSpecs);
        sb.append(", maxSupportedFrameRate=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.maxSupportedFrameRate, ')');
    }
}
