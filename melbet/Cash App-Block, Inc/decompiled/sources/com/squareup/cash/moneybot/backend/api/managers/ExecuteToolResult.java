package com.squareup.cash.moneybot.backend.api.managers;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ExecuteToolResult {
    public final String clientRouteUrl;

    public ExecuteToolResult(String str) {
        this.clientRouteUrl = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExecuteToolResult) && Intrinsics.areEqual(this.clientRouteUrl, ((ExecuteToolResult) obj).clientRouteUrl);
    }

    public final int hashCode() {
        String str = this.clientRouteUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ExecuteToolResult(clientRouteUrl=", this.clientRouteUrl, ")");
    }
}
