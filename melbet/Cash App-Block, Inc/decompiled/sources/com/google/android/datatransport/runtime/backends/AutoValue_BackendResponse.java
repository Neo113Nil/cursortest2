package com.google.android.datatransport.runtime.backends;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class AutoValue_BackendResponse {
    public final long nextRequestWaitMillis;
    public final int status;

    public AutoValue_BackendResponse(int i, long j) {
        if (i == 0) {
            a$$ExternalSyntheticBUOutline0.m$2("Null status");
            throw null;
        }
        this.status = i;
        this.nextRequestWaitMillis = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_BackendResponse)) {
            return false;
        }
        AutoValue_BackendResponse autoValue_BackendResponse = (AutoValue_BackendResponse) obj;
        return CameraSelector$$ExternalSyntheticOutline0.equals(this.status, autoValue_BackendResponse.status) && this.nextRequestWaitMillis == autoValue_BackendResponse.nextRequestWaitMillis;
    }

    public final int hashCode() {
        int ordinal = (CameraSelector$$ExternalSyntheticOutline0.ordinal(this.status) ^ 1000003) * 1000003;
        long j = this.nextRequestWaitMillis;
        return ((int) ((j >>> 32) ^ j)) ^ ordinal;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.status;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.nextRequestWaitMillis, "}", sb);
    }
}
