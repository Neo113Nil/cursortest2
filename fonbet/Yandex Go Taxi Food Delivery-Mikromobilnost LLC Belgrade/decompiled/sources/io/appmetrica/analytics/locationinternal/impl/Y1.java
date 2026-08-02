package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Y1 implements JsonParser {
    public final C0929b a = new C0929b();
    public final M b = new M();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W0 parse(JSONObject jSONObject) {
        W0 w0 = new W0();
        JSONArray optJSONArray = jSONObject.optJSONArray("app_statuses");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = this.a.parse(optJSONArray.optString(i)).intValue();
            }
            w0.b = iArr;
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("charge_types");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            int[] iArr2 = new int[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                iArr2[i2] = this.b.parse(optJSONArray2.optString(i2)).intValue();
            }
            w0.a = iArr2;
        }
        return w0;
    }

    public final W0 b(JSONObject jSONObject) {
        return (W0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (W0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
