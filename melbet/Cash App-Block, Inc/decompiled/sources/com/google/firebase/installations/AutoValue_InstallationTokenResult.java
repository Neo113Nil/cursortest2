package com.google.firebase.installations;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;

/* loaded from: classes4.dex */
public final class AutoValue_InstallationTokenResult {
    public final String token;
    public final long tokenCreationTimestamp;
    public final long tokenExpirationTimestamp;

    public AutoValue_InstallationTokenResult(long j, long j2, String str) {
        this.token = str;
        this.tokenExpirationTimestamp = j;
        this.tokenCreationTimestamp = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_InstallationTokenResult) {
            AutoValue_InstallationTokenResult autoValue_InstallationTokenResult = (AutoValue_InstallationTokenResult) obj;
            if (this.token.equals(autoValue_InstallationTokenResult.token) && this.tokenExpirationTimestamp == autoValue_InstallationTokenResult.tokenExpirationTimestamp && this.tokenCreationTimestamp == autoValue_InstallationTokenResult.tokenCreationTimestamp) {
                return true;
            }
        }
        return false;
    }

    public final String getToken() {
        return this.token;
    }

    public final int hashCode() {
        int hashCode = (this.token.hashCode() ^ 1000003) * 1000003;
        long j = this.tokenExpirationTimestamp;
        long j2 = this.tokenCreationTimestamp;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.token);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.tokenExpirationTimestamp);
        sb.append(", tokenCreationTimestamp=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.tokenCreationTimestamp, "}", sb);
    }
}
