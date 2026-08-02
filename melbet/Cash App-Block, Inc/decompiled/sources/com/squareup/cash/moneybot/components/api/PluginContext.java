package com.squareup.cash.moneybot.components.api;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PluginContext {
    public final String chatSessionId;
    public final Screen contextScreen;
    public final String homeSessionId;
    public final String renderableKey;
    public final String requestId;

    public PluginContext(String str, String str2, String str3, Screen screen, String str4) {
        this.chatSessionId = str;
        this.homeSessionId = str2;
        this.requestId = str3;
        this.contextScreen = screen;
        this.renderableKey = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginContext)) {
            return false;
        }
        PluginContext pluginContext = (PluginContext) obj;
        return Intrinsics.areEqual(this.chatSessionId, pluginContext.chatSessionId) && Intrinsics.areEqual(this.homeSessionId, pluginContext.homeSessionId) && Intrinsics.areEqual(this.requestId, pluginContext.requestId) && this.contextScreen.equals(pluginContext.contextScreen) && Intrinsics.areEqual(this.renderableKey, pluginContext.renderableKey);
    }

    public final String getRenderableKey() {
        return this.renderableKey;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final int hashCode() {
        String str = this.chatSessionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.homeSessionId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.requestId;
        int m = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.contextScreen, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.renderableKey;
        return m + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PluginContext(chatSessionId=", this.chatSessionId, ", homeSessionId=", this.homeSessionId, ", requestId=");
        m.append(this.requestId);
        m.append(", contextScreen=");
        m.append(this.contextScreen);
        m.append(", renderableKey=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.renderableKey, ")");
    }
}
