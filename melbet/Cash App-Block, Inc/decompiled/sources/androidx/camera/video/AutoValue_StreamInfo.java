package androidx.camera.video;

import androidx.camera.core.AutoValue_SurfaceRequest_TransformationInfo;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.impl.ConstantObservable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class AutoValue_StreamInfo {
    public final int id;
    public final AutoValue_SurfaceRequest_TransformationInfo inProgressTransformationInfo;
    public final int streamState;
    public static final AutoValue_StreamInfo STREAM_INFO_ANY_INACTIVE = new AutoValue_StreamInfo(0, 2, null);
    public static final Set NON_SURFACE_STREAM_ID = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));
    public static final ConstantObservable ALWAYS_ACTIVE_OBSERVABLE = new ConstantObservable(new AutoValue_StreamInfo(0, 1, null));

    public AutoValue_StreamInfo(int i, int i2, AutoValue_SurfaceRequest_TransformationInfo autoValue_SurfaceRequest_TransformationInfo) {
        this.id = i;
        if (i2 == 0) {
            a$$ExternalSyntheticBUOutline0.m$2("Null streamState");
            throw null;
        }
        this.streamState = i2;
        this.inProgressTransformationInfo = autoValue_SurfaceRequest_TransformationInfo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_StreamInfo)) {
            return false;
        }
        AutoValue_StreamInfo autoValue_StreamInfo = (AutoValue_StreamInfo) obj;
        if (this.id != autoValue_StreamInfo.id || !CameraSelector$$ExternalSyntheticOutline0.equals(this.streamState, autoValue_StreamInfo.streamState)) {
            return false;
        }
        AutoValue_SurfaceRequest_TransformationInfo autoValue_SurfaceRequest_TransformationInfo = autoValue_StreamInfo.inProgressTransformationInfo;
        AutoValue_SurfaceRequest_TransformationInfo autoValue_SurfaceRequest_TransformationInfo2 = this.inProgressTransformationInfo;
        return autoValue_SurfaceRequest_TransformationInfo2 == null ? autoValue_SurfaceRequest_TransformationInfo == null : autoValue_SurfaceRequest_TransformationInfo2.equals(autoValue_SurfaceRequest_TransformationInfo);
    }

    public final int hashCode() {
        int ordinal = (((this.id ^ 1000003) * 1000003) ^ CameraSelector$$ExternalSyntheticOutline0.ordinal(this.streamState)) * 1000003;
        AutoValue_SurfaceRequest_TransformationInfo autoValue_SurfaceRequest_TransformationInfo = this.inProgressTransformationInfo;
        return (autoValue_SurfaceRequest_TransformationInfo == null ? 0 : autoValue_SurfaceRequest_TransformationInfo.hashCode()) ^ ordinal;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamInfo{id=");
        sb.append(this.id);
        sb.append(", streamState=");
        int i = this.streamState;
        sb.append(i != 1 ? i != 2 ? "null" : "INACTIVE" : "ACTIVE");
        sb.append(", inProgressTransformationInfo=");
        sb.append(this.inProgressTransformationInfo);
        sb.append("}");
        return sb.toString();
    }
}
