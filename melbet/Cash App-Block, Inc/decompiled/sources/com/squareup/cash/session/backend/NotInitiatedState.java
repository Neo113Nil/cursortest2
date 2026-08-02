package com.squareup.cash.session.backend;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class NotInitiatedState implements SessionState {
    public final String appToken;

    public NotInitiatedState(String str) {
        this.appToken = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotInitiatedState) && Intrinsics.areEqual(this.appToken, ((NotInitiatedState) obj).appToken);
    }

    public final int hashCode() {
        String str = this.appToken;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NotInitiatedState(appToken=", this.appToken, ")");
    }
}
