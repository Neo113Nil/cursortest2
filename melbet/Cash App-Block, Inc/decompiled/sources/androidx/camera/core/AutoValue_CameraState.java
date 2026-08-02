package androidx.camera.core;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_CameraState {
    public final AutoValue_CameraState_StateError error;

    /* renamed from: type, reason: collision with root package name */
    public final int f844type;

    public AutoValue_CameraState(int i, AutoValue_CameraState_StateError autoValue_CameraState_StateError) {
        if (i == 0) {
            a$$ExternalSyntheticBUOutline0.m$2("Null type");
            throw null;
        }
        this.f844type = i;
        this.error = autoValue_CameraState_StateError;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_CameraState)) {
            return false;
        }
        AutoValue_CameraState autoValue_CameraState = (AutoValue_CameraState) obj;
        if (!CameraSelector$$ExternalSyntheticOutline0.equals(this.f844type, autoValue_CameraState.f844type)) {
            return false;
        }
        AutoValue_CameraState_StateError autoValue_CameraState_StateError = autoValue_CameraState.error;
        AutoValue_CameraState_StateError autoValue_CameraState_StateError2 = this.error;
        return autoValue_CameraState_StateError2 == null ? autoValue_CameraState_StateError == null : autoValue_CameraState_StateError2.equals(autoValue_CameraState_StateError);
    }

    public final int hashCode() {
        int ordinal = (CameraSelector$$ExternalSyntheticOutline0.ordinal(this.f844type) ^ 1000003) * 1000003;
        AutoValue_CameraState_StateError autoValue_CameraState_StateError = this.error;
        return (autoValue_CameraState_StateError == null ? 0 : autoValue_CameraState_StateError.hashCode()) ^ ordinal;
    }

    public final String toString() {
        return "CameraState{type=" + CameraState$Type$EnumUnboxingLocalUtility.stringValueOf(this.f844type) + ", error=" + this.error + "}";
    }
}
