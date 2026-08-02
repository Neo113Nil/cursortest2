package coil3.network;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import coil3.Extras;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class NetworkRequest {
    public final Extras extras;
    public final NetworkHeaders headers;
    public final String method;
    public final String url;

    public NetworkRequest(String str, String str2, NetworkHeaders networkHeaders, Extras extras) {
        this.url = str;
        this.method = str2;
        this.headers = networkHeaders;
        this.extras = extras;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkRequest)) {
            return false;
        }
        NetworkRequest networkRequest = (NetworkRequest) obj;
        return this.url.equals(networkRequest.url) && Intrinsics.areEqual(this.method, networkRequest.method) && this.headers.equals(networkRequest.headers) && Intrinsics.areEqual(this.extras, networkRequest.extras);
    }

    public final int hashCode() {
        return this.extras.data.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.url.hashCode() * 31, 31, this.method), this.headers.data, 961);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NetworkRequest(url=", this.url, ", method=", this.method, ", headers=");
        m.append(this.headers);
        m.append(", body=null, extras=");
        m.append(this.extras);
        m.append(")");
        return m.toString();
    }
}
