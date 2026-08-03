package com.onesignal.notifications.internal;

import ca.i;
import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements i {
    private final String actionId;
    private final String url;

    public e(String str, String str2) {
        this.actionId = str;
        this.url = str2;
    }

    @Override // ca.i
    public String getActionId() {
        return this.actionId;
    }

    @Override // ca.i
    public String getUrl() {
        return this.url;
    }

    public final JSONObject toJSONObject() {
        return com.onesignal.common.f.putSafe(com.onesignal.common.f.putSafe(new JSONObject(), "actionId", getActionId()), "url", getUrl());
    }
}
