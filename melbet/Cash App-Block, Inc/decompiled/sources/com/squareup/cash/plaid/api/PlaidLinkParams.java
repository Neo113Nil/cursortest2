package com.squareup.cash.plaid.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class PlaidLinkParams {
    public final String linkToken;

    public PlaidLinkParams(String str) {
        str.getClass();
        this.linkToken = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlaidLinkParams) && Intrinsics.areEqual(this.linkToken, ((PlaidLinkParams) obj).linkToken);
    }

    public final int hashCode() {
        return this.linkToken.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PlaidLinkParams(linkToken=", this.linkToken, ")");
    }
}
