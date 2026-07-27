package com.onesignal.notifications.internal;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import e5.InterfaceC4478f;
import e5.i;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d implements e5.g {
    private final c _notification;
    private final e _result;

    public d(c _notification, e _result) {
        kotlin.jvm.internal.h.e(_notification, "_notification");
        kotlin.jvm.internal.h.e(_result, "_result");
        this._notification = _notification;
        this._result = _result;
    }

    @Override // e5.g
    public InterfaceC4478f getNotification() {
        return this._notification;
    }

    @Override // e5.g
    public i getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("notification", this._notification.toJSONObject()).put(NativeAdvancedJsUtils.f18064p, this._result.toJSONObject());
        kotlin.jvm.internal.h.d(put, "put(...)");
        return put;
    }
}
