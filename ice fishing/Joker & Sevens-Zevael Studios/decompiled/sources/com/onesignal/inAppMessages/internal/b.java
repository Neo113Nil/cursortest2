package com.onesignal.inAppMessages.internal;

import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements i9.b {
    private final a _message;
    private final c _result;

    public b(a aVar, c cVar) {
        pc.j.e(aVar, "msg");
        pc.j.e(cVar, "actn");
        this._message = aVar;
        this._result = cVar;
    }

    @Override // i9.b
    public i9.a getMessage() {
        return this._message;
    }

    @Override // i9.b
    public i9.d getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("message", this._message.toJSONObject()).put("action", this._result.toJSONObject());
        pc.j.d(put, "JSONObject()\n           …, _result.toJSONObject())");
        return put;
    }
}
