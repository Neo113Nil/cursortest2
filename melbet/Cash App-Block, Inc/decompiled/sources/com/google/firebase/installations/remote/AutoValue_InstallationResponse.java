package com.google.firebase.installations.remote;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.bugsnag.android.TraceParser;

/* loaded from: classes4.dex */
public final class AutoValue_InstallationResponse {
    public final AutoValue_TokenResult authToken;
    public final String fid;
    public final String refreshToken;
    public final int responseCode;
    public final String uri;

    public AutoValue_InstallationResponse(String str, String str2, String str3, AutoValue_TokenResult autoValue_TokenResult, int i) {
        this.uri = str;
        this.fid = str2;
        this.refreshToken = str3;
        this.authToken = autoValue_TokenResult;
        this.responseCode = i;
    }

    public static TraceParser builder() {
        return new TraceParser(11);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_InstallationResponse)) {
            return false;
        }
        AutoValue_InstallationResponse autoValue_InstallationResponse = (AutoValue_InstallationResponse) obj;
        String str = autoValue_InstallationResponse.uri;
        String str2 = this.uri;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = autoValue_InstallationResponse.fid;
        String str4 = this.fid;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = autoValue_InstallationResponse.refreshToken;
        String str6 = this.refreshToken;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        AutoValue_TokenResult autoValue_TokenResult = autoValue_InstallationResponse.authToken;
        AutoValue_TokenResult autoValue_TokenResult2 = this.authToken;
        if (autoValue_TokenResult2 == null) {
            if (autoValue_TokenResult != null) {
                return false;
            }
        } else if (!autoValue_TokenResult2.equals(autoValue_TokenResult)) {
            return false;
        }
        int i = autoValue_InstallationResponse.responseCode;
        int i2 = this.responseCode;
        return i2 == 0 ? i == 0 : CameraSelector$$ExternalSyntheticOutline0.equals(i2, i);
    }

    public final AutoValue_TokenResult getAuthToken() {
        return this.authToken;
    }

    public final String getFid() {
        return this.fid;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final int hashCode() {
        String str = this.uri;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.fid;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.refreshToken;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AutoValue_TokenResult autoValue_TokenResult = this.authToken;
        int hashCode4 = (hashCode3 ^ (autoValue_TokenResult == null ? 0 : autoValue_TokenResult.hashCode())) * 1000003;
        int i = this.responseCode;
        return hashCode4 ^ (i != 0 ? CameraSelector$$ExternalSyntheticOutline0.ordinal(i) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.uri);
        sb.append(", fid=");
        sb.append(this.fid);
        sb.append(", refreshToken=");
        sb.append(this.refreshToken);
        sb.append(", authToken=");
        sb.append(this.authToken);
        sb.append(", responseCode=");
        int i = this.responseCode;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
