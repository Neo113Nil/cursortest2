package com.onesignal.inAppMessages.internal;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b implements O4.b {
    private final a _message;
    private final c _result;

    public b(a msg, c actn) {
        kotlin.jvm.internal.h.e(msg, "msg");
        kotlin.jvm.internal.h.e(actn, "actn");
        this._message = msg;
        this._result = actn;
    }

    @Override // O4.b
    public O4.a getMessage() {
        return this._message;
    }

    @Override // O4.b
    public O4.d getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("message", this._message.toJSONObject()).put(NativeAdvancedJsUtils.f17906p, this._result.toJSONObject());
        kotlin.jvm.internal.h.d(put, "put(...)");
        return put;
    }
}
