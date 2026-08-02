package com.google.firebase.installations.remote;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class AutoValue_TokenResult {
    public final int responseCode;
    public final String token;
    public final long tokenExpirationTimestamp;

    public final class Builder {
        public int responseCode;
        public byte set$0;
        public String token;
        public long tokenExpirationTimestamp;

        public final AutoValue_TokenResult build() {
            if (this.set$0 == 1) {
                return new AutoValue_TokenResult(this.token, this.tokenExpirationTimestamp, this.responseCode);
            }
            a$$ExternalSyntheticBUOutline0.m$1("Missing required properties: tokenExpirationTimestamp");
            return null;
        }

        public final void setResponseCode(int i) {
            this.responseCode = i;
        }

        public final void setToken(String str) {
            this.token = str;
        }

        public final void setTokenExpirationTimestamp(long j) {
            this.tokenExpirationTimestamp = j;
            this.set$0 = (byte) (this.set$0 | 1);
        }
    }

    public AutoValue_TokenResult(String str, long j, int i) {
        this.token = str;
        this.tokenExpirationTimestamp = j;
        this.responseCode = i;
    }

    public static Builder builder() {
        Builder builder = new Builder();
        builder.setTokenExpirationTimestamp(0L);
        return builder;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_TokenResult)) {
            return false;
        }
        AutoValue_TokenResult autoValue_TokenResult = (AutoValue_TokenResult) obj;
        String str = autoValue_TokenResult.token;
        String str2 = this.token;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.tokenExpirationTimestamp != autoValue_TokenResult.tokenExpirationTimestamp) {
            return false;
        }
        int i = autoValue_TokenResult.responseCode;
        int i2 = this.responseCode;
        return i2 == 0 ? i == 0 : CameraSelector$$ExternalSyntheticOutline0.equals(i2, i);
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final String getToken() {
        return this.token;
    }

    public final long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    public final int hashCode() {
        String str = this.token;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.tokenExpirationTimestamp;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i2 = this.responseCode;
        return i ^ (i2 != 0 ? CameraSelector$$ExternalSyntheticOutline0.ordinal(i2) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.token);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.tokenExpirationTimestamp);
        sb.append(", responseCode=");
        int i = this.responseCode;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
