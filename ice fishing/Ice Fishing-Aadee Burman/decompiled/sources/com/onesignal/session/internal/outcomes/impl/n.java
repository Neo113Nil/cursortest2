package com.onesignal.session.internal.outcomes.impl;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class n {
    private JSONArray inAppMessagesIds;
    private JSONArray notificationIds;

    /* JADX WARN: Multi-variable type inference failed */
    public n() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final JSONArray getInAppMessagesIds() {
        return this.inAppMessagesIds;
    }

    public final JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    public final void setInAppMessagesIds(JSONArray jSONArray) {
        this.inAppMessagesIds = jSONArray;
    }

    public final void setNotificationIds(JSONArray jSONArray) {
        this.notificationIds = jSONArray;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put(L5.e.NOTIFICATIONS_IDS, this.notificationIds).put("in_app_message_ids", this.inAppMessagesIds);
        kotlin.jvm.internal.h.d(put, "put(...)");
        return put;
    }

    public String toString() {
        return "OutcomeSourceBody{notificationIds=" + this.notificationIds + ", inAppMessagesIds=" + this.inAppMessagesIds + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(JSONArray jSONArray) {
        this(jSONArray, null, 2, 0 == true ? 1 : 0);
    }

    public n(JSONArray jSONArray, JSONArray jSONArray2) {
        this.notificationIds = jSONArray;
        this.inAppMessagesIds = jSONArray2;
    }

    public /* synthetic */ n(JSONArray jSONArray, JSONArray jSONArray2, int i, kotlin.jvm.internal.e eVar) {
        this((i & 1) != 0 ? new JSONArray() : jSONArray, (i & 2) != 0 ? new JSONArray() : jSONArray2);
    }
}
