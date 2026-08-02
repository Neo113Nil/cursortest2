package com.squareup.cash.offers.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CategoryToken implements OffersItemToken {
    public final String token;

    public CategoryToken(String str) {
        str.getClass();
        this.token = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CategoryToken) && Intrinsics.areEqual(this.token, ((CategoryToken) obj).token);
    }

    @Override // com.squareup.cash.offers.backend.api.OffersItemToken
    public final String getToken() {
        return this.token;
    }

    public final int hashCode() {
        return this.token.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CategoryToken(token=", this.token, ")");
    }
}
