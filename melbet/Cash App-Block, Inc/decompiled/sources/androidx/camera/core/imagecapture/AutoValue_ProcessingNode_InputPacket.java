package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageProxy;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_ProcessingNode_InputPacket {
    public final ImageProxy imageProxy;
    public final ProcessingRequest processingRequest;

    public AutoValue_ProcessingNode_InputPacket(ProcessingRequest processingRequest, ImageProxy imageProxy) {
        if (processingRequest == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null processingRequest");
            throw null;
        }
        this.processingRequest = processingRequest;
        this.imageProxy = imageProxy;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_ProcessingNode_InputPacket)) {
            return false;
        }
        AutoValue_ProcessingNode_InputPacket autoValue_ProcessingNode_InputPacket = (AutoValue_ProcessingNode_InputPacket) obj;
        return this.processingRequest.equals(autoValue_ProcessingNode_InputPacket.processingRequest) && this.imageProxy.equals(autoValue_ProcessingNode_InputPacket.imageProxy);
    }

    public final int hashCode() {
        return this.imageProxy.hashCode() ^ ((this.processingRequest.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.processingRequest + ", imageProxy=" + this.imageProxy + "}";
    }
}
