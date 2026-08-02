package com.squareup.cash.security.presenters;

import com.squareup.protos.franklin.common.ResponseContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PasswordResponseAdapter {
    public final String passwordErrorMessage;
    public final String passwordToken;
    public final Long passwordVersion;
    public final ResponseContext responseContext;

    public PasswordResponseAdapter(ResponseContext responseContext, String str, String str2, Long l) {
        responseContext.getClass();
        this.responseContext = responseContext;
        this.passwordToken = str;
        this.passwordErrorMessage = str2;
        this.passwordVersion = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasswordResponseAdapter)) {
            return false;
        }
        PasswordResponseAdapter passwordResponseAdapter = (PasswordResponseAdapter) obj;
        return Intrinsics.areEqual(this.responseContext, passwordResponseAdapter.responseContext) && Intrinsics.areEqual(this.passwordToken, passwordResponseAdapter.passwordToken) && Intrinsics.areEqual(this.passwordErrorMessage, passwordResponseAdapter.passwordErrorMessage) && Intrinsics.areEqual(this.passwordVersion, passwordResponseAdapter.passwordVersion);
    }

    public final int hashCode() {
        int hashCode = this.responseContext.hashCode() * 31;
        String str = this.passwordToken;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.passwordErrorMessage;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.passwordVersion;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "PasswordResponseAdapter(responseContext=" + this.responseContext + ", passwordToken=" + this.passwordToken + ", passwordErrorMessage=" + this.passwordErrorMessage + ", passwordVersion=" + this.passwordVersion + ")";
    }
}
