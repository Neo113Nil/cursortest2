package com.squareup.cash.session.backend;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.session.backend.SessionState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SwitchingState implements SessionState.Initiated {
    public final String appToken;
    public final String sessionToken;
    public final String targetAccountToken;

    public SwitchingState(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.appToken = str;
        this.sessionToken = str2;
        this.targetAccountToken = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitchingState)) {
            return false;
        }
        SwitchingState switchingState = (SwitchingState) obj;
        return Intrinsics.areEqual(this.appToken, switchingState.appToken) && Intrinsics.areEqual(this.sessionToken, switchingState.sessionToken) && Intrinsics.areEqual(this.targetAccountToken, switchingState.targetAccountToken);
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
        return this.targetAccountToken.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.appToken.hashCode() * 31, 31, this.sessionToken);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SwitchingState(appToken=", this.appToken, ", sessionToken=", this.sessionToken, ", targetAccountToken="), this.targetAccountToken, ")");
    }
}
