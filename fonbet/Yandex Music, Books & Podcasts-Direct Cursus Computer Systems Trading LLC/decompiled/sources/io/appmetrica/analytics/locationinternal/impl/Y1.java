package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class Y1 implements JsonParser {
    public final C0852b a = new C0852b();
    public final M b = new M();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X0 parse(@NotNull JSONObject jSONObject) {
        X0 x0 = new X0();
        JSONArray optJSONArray = jSONObject.optJSONArray("app_statuses");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = this.a.parse(optJSONArray.optString(i)).intValue();
            }
            x0.b = iArr;
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("charge_types");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            int[] iArr2 = new int[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                iArr2[i2] = this.b.parse(optJSONArray2.optString(i2)).intValue();
            }
            x0.a = iArr2;
        }
        return x0;
    }

    public final X0 b(@NotNull JSONObject jSONObject) {
        return (X0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (X0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
