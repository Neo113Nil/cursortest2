package androidx.camera.core.imagecapture;

import androidx.camera.core.processing.Edge;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class AutoValue_ProcessingNode_In {
    public final Edge edge;
    public final int inputFormat;
    public final ArrayList outputFormats;
    public final Edge postviewEdge;

    public AutoValue_ProcessingNode_In(Edge edge, Edge edge2, int i, ArrayList arrayList) {
        this.edge = edge;
        this.postviewEdge = edge2;
        this.inputFormat = i;
        this.outputFormats = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_ProcessingNode_In) {
            AutoValue_ProcessingNode_In autoValue_ProcessingNode_In = (AutoValue_ProcessingNode_In) obj;
            if (this.edge == autoValue_ProcessingNode_In.edge && this.postviewEdge == autoValue_ProcessingNode_In.postviewEdge && this.inputFormat == autoValue_ProcessingNode_In.inputFormat && this.outputFormats.equals(autoValue_ProcessingNode_In.outputFormats)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.outputFormats.hashCode() ^ ((((((this.edge.hashCode() ^ 1000003) * 1000003) ^ this.postviewEdge.hashCode()) * 1000003) ^ this.inputFormat) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{edge=");
        sb.append(this.edge);
        sb.append(", postviewEdge=");
        sb.append(this.postviewEdge);
        sb.append(", inputFormat=");
        sb.append(this.inputFormat);
        sb.append(", outputFormats=");
        return Recorder$$ExternalSyntheticOutline1.m("}", sb, this.outputFormats);
    }
}
