package com.squareup.cash.moneybot.presenters.plugins;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ServerToolCallKey {
    public final String extensionName;
    public final String requestId;
    public final String toolName;

    public ServerToolCallKey(String str, String str2, String str3) {
        this.requestId = str;
        this.extensionName = str2;
        this.toolName = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerToolCallKey)) {
            return false;
        }
        ServerToolCallKey serverToolCallKey = (ServerToolCallKey) obj;
        return Intrinsics.areEqual(this.requestId, serverToolCallKey.requestId) && this.extensionName.equals(serverToolCallKey.extensionName) && this.toolName.equals(serverToolCallKey.toolName);
    }

    public final int hashCode() {
        String str = this.requestId;
        return this.toolName.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.extensionName);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ServerToolCallKey(requestId=", this.requestId, ", extensionName=", this.extensionName, ", toolName="), this.toolName, ")");
    }
}
