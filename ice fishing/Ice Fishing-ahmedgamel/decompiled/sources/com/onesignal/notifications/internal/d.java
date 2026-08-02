package com.onesignal.notifications.internal;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import i5.InterfaceC4598f;
import i5.i;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d implements i5.g {
    private final c _notification;
    private final e _result;

    public d(c _notification, e _result) {
        kotlin.jvm.internal.h.e(_notification, "_notification");
        kotlin.jvm.internal.h.e(_result, "_result");
        this._notification = _notification;
        this._result = _result;
    }

    @Override // i5.g
    public InterfaceC4598f getNotification() {
        return this._notification;
    }

    @Override // i5.g
    public i getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("notification", this._notification.toJSONObject()).put(NativeAdvancedJsUtils.f18693p, this._result.toJSONObject());
        kotlin.jvm.internal.h.d(put, "put(...)");
        return put;
    }
}
