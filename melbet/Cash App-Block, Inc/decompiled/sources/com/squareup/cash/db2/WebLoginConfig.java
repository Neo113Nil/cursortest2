package com.squareup.cash.db2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class WebLoginConfig {
    public final Long expires_at;
    public final String token;

    public WebLoginConfig(String str, Long l) {
        this.token = str;
        this.expires_at = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebLoginConfig)) {
            return false;
        }
        WebLoginConfig webLoginConfig = (WebLoginConfig) obj;
        return Intrinsics.areEqual(this.token, webLoginConfig.token) && Intrinsics.areEqual(this.expires_at, webLoginConfig.expires_at);
    }

    public final int hashCode() {
        String str = this.token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.expires_at;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "WebLoginConfig(token=" + this.token + ", expires_at=" + this.expires_at + ")";
    }
}
