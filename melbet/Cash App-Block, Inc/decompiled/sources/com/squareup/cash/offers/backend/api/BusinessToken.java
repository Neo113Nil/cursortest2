package com.squareup.cash.offers.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BusinessToken implements OffersItemToken {
    public final String token;

    public BusinessToken(String str) {
        str.getClass();
        this.token = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BusinessToken) && Intrinsics.areEqual(this.token, ((BusinessToken) obj).token);
    }

    @Override // com.squareup.cash.offers.backend.api.OffersItemToken
    public final String getToken() {
        return this.token;
    }

    public final int hashCode() {
        return this.token.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BusinessToken(token=", this.token, ")");
    }
}
