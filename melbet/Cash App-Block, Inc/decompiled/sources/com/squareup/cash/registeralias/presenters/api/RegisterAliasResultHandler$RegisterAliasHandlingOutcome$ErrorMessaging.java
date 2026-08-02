package com.squareup.cash.registeralias.presenters.api;

import androidx.core.provider.FontsContractCompat;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class RegisterAliasResultHandler$RegisterAliasHandlingOutcome$ErrorMessaging extends FontsContractCompat {
    public final String message;

    public RegisterAliasResultHandler$RegisterAliasHandlingOutcome$ErrorMessaging(String str) {
        str.getClass();
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RegisterAliasResultHandler$RegisterAliasHandlingOutcome$ErrorMessaging) && Intrinsics.areEqual(this.message, ((RegisterAliasResultHandler$RegisterAliasHandlingOutcome$ErrorMessaging) obj).message);
    }

    public final int hashCode() {
        return this.message.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ErrorMessaging(message=", this.message, ")");
    }
}
