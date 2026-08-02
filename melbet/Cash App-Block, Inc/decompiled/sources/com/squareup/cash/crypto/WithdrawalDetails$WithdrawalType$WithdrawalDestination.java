package com.squareup.cash.crypto;

import com.squareup.workflow1.ui.BackPressHandlerKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class WithdrawalDetails$WithdrawalType$WithdrawalDestination extends BackPressHandlerKt {
    public final String value;

    public WithdrawalDetails$WithdrawalType$WithdrawalDestination(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WithdrawalDetails$WithdrawalType$WithdrawalDestination) && Intrinsics.areEqual(this.value, ((WithdrawalDetails$WithdrawalType$WithdrawalDestination) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WithdrawalDestination(value=", this.value, ")");
    }
}
