package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCaptureException;

/* loaded from: classes3.dex */
public final class AutoValue_TakePictureManager_CaptureError {
    public final ImageCaptureException imageCaptureException;
    public final int requestId;

    public AutoValue_TakePictureManager_CaptureError(int i, ImageCaptureException imageCaptureException) {
        this.requestId = i;
        this.imageCaptureException = imageCaptureException;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_TakePictureManager_CaptureError) {
            AutoValue_TakePictureManager_CaptureError autoValue_TakePictureManager_CaptureError = (AutoValue_TakePictureManager_CaptureError) obj;
            return this.requestId == autoValue_TakePictureManager_CaptureError.requestId && this.imageCaptureException == autoValue_TakePictureManager_CaptureError.imageCaptureException;
        }
        return false;
    }

    public final int hashCode() {
        return this.imageCaptureException.hashCode() ^ ((this.requestId ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.requestId + ", imageCaptureException=" + this.imageCaptureException + "}";
    }
}
