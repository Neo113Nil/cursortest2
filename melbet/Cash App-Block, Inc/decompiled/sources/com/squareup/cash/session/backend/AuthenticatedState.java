package com.squareup.cash.session.backend;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.session.backend.SessionState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AuthenticatedState implements SessionState.Authenticated {
    public final String accountToken;
    public final String appToken;
    public final String sessionToken;

    public AuthenticatedState(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.appToken = str;
        this.sessionToken = str2;
        this.accountToken = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticatedState)) {
            return false;
        }
        AuthenticatedState authenticatedState = (AuthenticatedState) obj;
        return Intrinsics.areEqual(this.appToken, authenticatedState.appToken) && Intrinsics.areEqual(this.sessionToken, authenticatedState.sessionToken) && Intrinsics.areEqual(this.accountToken, authenticatedState.accountToken);
    }

    public final String getAccountToken() {
        return this.accountToken;
    }

    @Override // com.squareup.cash.session.backend.SessionState.Initiated
    public final String getAppToken() {
        return this.appToken;
    }

    @Override // com.squareup.cash.session.backend.SessionState.Initiated
    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final int hashCode() {
        return this.accountToken.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.appToken.hashCode() * 31, 31, this.sessionToken);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AuthenticatedState(appToken=", this.appToken, ", sessionToken=", this.sessionToken, ", accountToken="), this.accountToken, ")");
    }
}
