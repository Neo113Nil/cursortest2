package coil3.network;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class NetworkResponse {
    public final SourceResponseBody body;
    public final int code;
    public final Object delegate;
    public final NetworkHeaders headers;
    public final long requestMillis;
    public final long responseMillis;

    public NetworkResponse(int i, long j, long j2, NetworkHeaders networkHeaders, SourceResponseBody sourceResponseBody, Object obj) {
        this.code = i;
        this.requestMillis = j;
        this.responseMillis = j2;
        this.headers = networkHeaders;
        this.body = sourceResponseBody;
        this.delegate = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkResponse)) {
            return false;
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        return this.code == networkResponse.code && this.requestMillis == networkResponse.requestMillis && this.responseMillis == networkResponse.responseMillis && Intrinsics.areEqual(this.headers, networkResponse.headers) && Intrinsics.areEqual(this.body, networkResponse.body) && Intrinsics.areEqual(this.delegate, networkResponse.delegate);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.code * 31, 31, this.requestMillis), 31, this.responseMillis), this.headers.data, 31);
        SourceResponseBody sourceResponseBody = this.body;
        int hashCode = (m + (sourceResponseBody == null ? 0 : sourceResponseBody.source.hashCode())) * 31;
        Object obj = this.delegate;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkResponse(code=");
        sb.append(this.code);
        sb.append(", requestMillis=");
        sb.append(this.requestMillis);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.responseMillis, ", responseMillis=", ", headers=", sb);
        sb.append(this.headers);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", delegate=");
        return Recorder$$ExternalSyntheticOutline1.m(sb, this.delegate, ")");
    }
}
