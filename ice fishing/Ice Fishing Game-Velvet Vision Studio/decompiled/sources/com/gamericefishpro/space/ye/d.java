package com.gamericefishpro.space.ye;

import com.gamericefishpro.space.ve.i;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.gamericefishpro.space.ve.g {
    private final c _notification;
    private final e _result;

    public d(c _notification, e _result) {
        Intrinsics.checkNotNullParameter(_notification, "_notification");
        Intrinsics.checkNotNullParameter(_result, "_result");
        this._notification = _notification;
        this._result = _result;
    }

    @Override // com.gamericefishpro.space.ve.g
    public com.gamericefishpro.space.ve.f getNotification() {
        return this._notification;
    }

    @Override // com.gamericefishpro.space.ve.g
    public i getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("notification", this._notification.toJSONObject()).put("action", this._result.toJSONObject());
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }
}
