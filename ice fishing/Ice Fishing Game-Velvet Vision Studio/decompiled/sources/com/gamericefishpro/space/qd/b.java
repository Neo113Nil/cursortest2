package com.gamericefishpro.space.qd;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.gamericefishpro.space.pd.b {
    private final a _message;
    private final c _result;

    public b(a msg, c actn) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(actn, "actn");
        this._message = msg;
        this._result = actn;
    }

    @Override // com.gamericefishpro.space.pd.b
    public com.gamericefishpro.space.pd.a getMessage() {
        return this._message;
    }

    @Override // com.gamericefishpro.space.pd.b
    public com.gamericefishpro.space.pd.d getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("message", this._message.toJSONObject()).put("action", this._result.toJSONObject());
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }
}
