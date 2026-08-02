package com.squareup.cash.crypto.backend.transaction;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CryptoTransactionAction$InitiateTransactionAction {
    public final String externalId;

    public CryptoTransactionAction$InitiateTransactionAction(String str) {
        str.getClass();
        this.externalId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CryptoTransactionAction$InitiateTransactionAction) && Intrinsics.areEqual(this.externalId, ((CryptoTransactionAction$InitiateTransactionAction) obj).externalId);
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final int hashCode() {
        return this.externalId.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InitiateTransactionAction(externalId=", this.externalId, ")");
    }
}
