package com.onesignal.notifications.internal;

import ca.i;
import org.json.JSONObject;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements ca.g {
    private final c _notification;
    private final e _result;

    public d(c cVar, e eVar) {
        j.e(cVar, "_notification");
        j.e(eVar, "_result");
        this._notification = cVar;
        this._result = eVar;
    }

    @Override // ca.g
    public ca.f getNotification() {
        return this._notification;
    }

    @Override // ca.g
    public i getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("notification", this._notification.toJSONObject()).put("action", this._result.toJSONObject());
        j.d(put, "JSONObject()\n           …, _result.toJSONObject())");
        return put;
    }
}
