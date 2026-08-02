package androidx.camera.core.processing.concurrent;

import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class AutoValue_DualSurfaceProcessorNode_In {
    public final ArrayList outConfigs;
    public final SurfaceEdge primarySurfaceEdge;
    public final SurfaceEdge secondarySurfaceEdge;

    public AutoValue_DualSurfaceProcessorNode_In(SurfaceEdge surfaceEdge, SurfaceEdge surfaceEdge2, ArrayList arrayList) {
        if (surfaceEdge == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null primarySurfaceEdge");
            throw null;
        }
        this.primarySurfaceEdge = surfaceEdge;
        if (surfaceEdge2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null secondarySurfaceEdge");
            throw null;
        }
        this.secondarySurfaceEdge = surfaceEdge2;
        this.outConfigs = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_DualSurfaceProcessorNode_In)) {
            return false;
        }
        AutoValue_DualSurfaceProcessorNode_In autoValue_DualSurfaceProcessorNode_In = (AutoValue_DualSurfaceProcessorNode_In) obj;
        return this.primarySurfaceEdge.equals(autoValue_DualSurfaceProcessorNode_In.primarySurfaceEdge) && this.secondarySurfaceEdge.equals(autoValue_DualSurfaceProcessorNode_In.secondarySurfaceEdge) && this.outConfigs.equals(autoValue_DualSurfaceProcessorNode_In.outConfigs);
    }

    public final int hashCode() {
        return this.outConfigs.hashCode() ^ ((((this.primarySurfaceEdge.hashCode() ^ 1000003) * 1000003) ^ this.secondarySurfaceEdge.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{primarySurfaceEdge=");
        sb.append(this.primarySurfaceEdge);
        sb.append(", secondarySurfaceEdge=");
        sb.append(this.secondarySurfaceEdge);
        sb.append(", outConfigs=");
        return Recorder$$ExternalSyntheticOutline1.m("}", sb, this.outConfigs);
    }
}
