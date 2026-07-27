package com.onesignal.notifications.internal;

import e5.i;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e implements i {
    private final String actionId;
    private final String url;

    public e(String str, String str2) {
        this.actionId = str;
        this.url = str2;
    }

    @Override // e5.i
    public String getActionId() {
        return this.actionId;
    }

    @Override // e5.i
    public String getUrl() {
        return this.url;
    }

    public final JSONObject toJSONObject() {
        return com.onesignal.common.e.putSafe(com.onesignal.common.e.putSafe(new JSONObject(), "actionId", getActionId()), "url", getUrl());
    }
}
