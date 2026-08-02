package com.squareup.cash.session.backend;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.session.backend.SessionState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class InitiatedState implements SessionState.Initiated {
    public final String appToken;
    public final String sessionToken;

    public InitiatedState(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.appToken = str;
        this.sessionToken = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitiatedState)) {
            return false;
        }
        InitiatedState initiatedState = (InitiatedState) obj;
        return Intrinsics.areEqual(this.appToken, initiatedState.appToken) && Intrinsics.areEqual(this.sessionToken, initiatedState.sessionToken);
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
        return this.sessionToken.hashCode() + (this.appToken.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("InitiatedState(appToken=", this.appToken, ", sessionToken=", this.sessionToken, ")");
    }
}
