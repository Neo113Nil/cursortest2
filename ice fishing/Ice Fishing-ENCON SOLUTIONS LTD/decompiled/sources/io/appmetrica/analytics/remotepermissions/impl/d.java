package io.appmetrica.analytics.remotepermissions.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final String f7565a = "permissions";

    /* renamed from: b, reason: collision with root package name */
    public final String f7566b = "name";

    /* renamed from: c, reason: collision with root package name */
    public final String f7567c = "list";

    /* renamed from: d, reason: collision with root package name */
    public final String f7568d = "enabled";

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a parse(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashSet hashSet = new HashSet();
        JSONObject optJSONObject = jSONObject.optJSONObject(this.f7565a);
        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray(this.f7567c)) != null) {
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                if (optJSONObject2 != null && optJSONObject2.optBoolean(this.f7568d)) {
                    String optString = optJSONObject2.optString(this.f7566b);
                    if (!TextUtils.isEmpty(optString)) {
                        hashSet.add(optString);
                    }
                }
            }
        }
        return new a(hashSet);
    }

    public final a b(JSONObject jSONObject) {
        return (a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
