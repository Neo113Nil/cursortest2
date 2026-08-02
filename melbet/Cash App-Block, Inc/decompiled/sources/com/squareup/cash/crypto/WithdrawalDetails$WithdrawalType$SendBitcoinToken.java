package com.squareup.cash.crypto;

import com.squareup.workflow1.ui.BackPressHandlerKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class WithdrawalDetails$WithdrawalType$SendBitcoinToken extends BackPressHandlerKt {
    public final String value;

    public WithdrawalDetails$WithdrawalType$SendBitcoinToken(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WithdrawalDetails$WithdrawalType$SendBitcoinToken) && Intrinsics.areEqual(this.value, ((WithdrawalDetails$WithdrawalType$SendBitcoinToken) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SendBitcoinToken(value=", this.value, ")");
    }
}
