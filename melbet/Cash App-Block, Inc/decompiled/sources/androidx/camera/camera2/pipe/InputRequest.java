package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.media.AndroidImage;

/* loaded from: classes3.dex */
public final class InputRequest {
    public final FrameInfo frameInfo;
    public final AndroidImage image;

    public InputRequest(AndroidImage androidImage, FrameInfo frameInfo) {
        this.image = androidImage;
        this.frameInfo = frameInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InputRequest) {
            InputRequest inputRequest = (InputRequest) obj;
            if (this.image == inputRequest.image && this.frameInfo.equals(inputRequest.frameInfo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.frameInfo.hashCode() + (this.image.hashCode() * 31);
    }

    public final String toString() {
        return "InputRequest(image=" + this.image + ", frameInfo=" + this.frameInfo + ')';
    }
}
