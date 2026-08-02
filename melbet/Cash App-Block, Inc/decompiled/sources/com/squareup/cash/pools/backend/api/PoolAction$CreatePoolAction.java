package com.squareup.cash.pools.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PoolAction$CreatePoolAction {
    public final String externalId;

    public PoolAction$CreatePoolAction(String str) {
        str.getClass();
        this.externalId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PoolAction$CreatePoolAction) && Intrinsics.areEqual(this.externalId, ((PoolAction$CreatePoolAction) obj).externalId);
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final int hashCode() {
        return this.externalId.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CreatePoolAction(externalId=", this.externalId, ")");
    }
}
