package androidx.camera.core;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_CameraState_StateError {
    public final int code;

    public AutoValue_CameraState_StateError(int i) {
        this.code = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AutoValue_CameraState_StateError) && this.code == ((AutoValue_CameraState_StateError) obj).code;
    }

    public final int hashCode() {
        return (this.code ^ 1000003) * 1000003;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.code, ", cause=null}", new StringBuilder("StateError{code="));
    }
}
