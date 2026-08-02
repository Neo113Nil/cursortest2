package androidx.camera.core.processing;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;

/* loaded from: classes3.dex */
public final class AutoValue_SurfaceProcessorNode_In {
    public final List outConfigs;
    public final SurfaceEdge surfaceEdge;

    public AutoValue_SurfaceProcessorNode_In(SurfaceEdge surfaceEdge, List list) {
        if (surfaceEdge == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null surfaceEdge");
            throw null;
        }
        this.surfaceEdge = surfaceEdge;
        if (list != null) {
            this.outConfigs = list;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null outConfigs");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_SurfaceProcessorNode_In) {
            AutoValue_SurfaceProcessorNode_In autoValue_SurfaceProcessorNode_In = (AutoValue_SurfaceProcessorNode_In) obj;
            if (this.surfaceEdge.equals(autoValue_SurfaceProcessorNode_In.surfaceEdge) && this.outConfigs.equals(autoValue_SurfaceProcessorNode_In.outConfigs)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.outConfigs.hashCode() ^ ((this.surfaceEdge.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{surfaceEdge=");
        sb.append(this.surfaceEdge);
        sb.append(", outConfigs=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.outConfigs, "}");
    }
}
