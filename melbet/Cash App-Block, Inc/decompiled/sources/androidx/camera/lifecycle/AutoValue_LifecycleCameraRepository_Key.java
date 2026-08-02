package androidx.camera.lifecycle;

import androidx.camera.core.CameraIdentifier;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_LifecycleCameraRepository_Key {
    public final CameraIdentifier cameraIdentifier;
    public final int lifecycleOwnerHash;

    public AutoValue_LifecycleCameraRepository_Key(int i, CameraIdentifier cameraIdentifier) {
        this.lifecycleOwnerHash = i;
        if (cameraIdentifier != null) {
            this.cameraIdentifier = cameraIdentifier;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null cameraIdentifier");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_LifecycleCameraRepository_Key) {
            AutoValue_LifecycleCameraRepository_Key autoValue_LifecycleCameraRepository_Key = (AutoValue_LifecycleCameraRepository_Key) obj;
            if (this.lifecycleOwnerHash == autoValue_LifecycleCameraRepository_Key.lifecycleOwnerHash && this.cameraIdentifier.equals(autoValue_LifecycleCameraRepository_Key.cameraIdentifier)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.cameraIdentifier.hashCode() ^ ((this.lifecycleOwnerHash ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Key{lifecycleOwnerHash=" + this.lifecycleOwnerHash + ", cameraIdentifier=" + this.cameraIdentifier + "}";
    }
}
