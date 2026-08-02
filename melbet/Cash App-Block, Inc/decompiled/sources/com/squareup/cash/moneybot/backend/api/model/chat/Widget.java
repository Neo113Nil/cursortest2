package com.squareup.cash.moneybot.backend.api.model.chat;

import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Widget {
    public final ClientRenderable clientRenderable;
    public final Long createdAt;
    public final ChatKickoffParams kickoffParams;
    public final boolean permanent;
    public final String sessionId;
    public final String widgetId;

    public Widget(String str, Long l, ClientRenderable clientRenderable, String str2, ChatKickoffParams chatKickoffParams, boolean z) {
        str.getClass();
        this.widgetId = str;
        this.createdAt = l;
        this.clientRenderable = clientRenderable;
        this.sessionId = str2;
        this.kickoffParams = chatKickoffParams;
        this.permanent = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Widget)) {
            return false;
        }
        Widget widget = (Widget) obj;
        return Intrinsics.areEqual(this.widgetId, widget.widgetId) && Intrinsics.areEqual(this.createdAt, widget.createdAt) && this.clientRenderable.equals(widget.clientRenderable) && Intrinsics.areEqual(this.sessionId, widget.sessionId) && Intrinsics.areEqual(this.kickoffParams, widget.kickoffParams) && this.permanent == widget.permanent;
    }

    public final int hashCode() {
        int hashCode = this.widgetId.hashCode() * 31;
        Long l = this.createdAt;
        int hashCode2 = (this.clientRenderable.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        String str = this.sessionId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ChatKickoffParams chatKickoffParams = this.kickoffParams;
        return Boolean.hashCode(this.permanent) + ((hashCode3 + (chatKickoffParams != null ? chatKickoffParams.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.createdAt, "Widget(widgetId=", this.widgetId, ", createdAt=", ", clientRenderable=");
        m.append(this.clientRenderable);
        m.append(", sessionId=");
        m.append(this.sessionId);
        m.append(", kickoffParams=");
        m.append(this.kickoffParams);
        m.append(", permanent=");
        m.append(this.permanent);
        m.append(")");
        return m.toString();
    }
}
