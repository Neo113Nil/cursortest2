package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Pair;
import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.c3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0162c3 {
    public static void a(C0328hp c0328hp, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject != null) {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = optJSONObject.optJSONArray("deeplink_conditions");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    String optString = optJSONObject2.optString(PListParser.TAG_KEY, null);
                    if (!TextUtils.isEmpty(optString)) {
                        String optString2 = optJSONObject2.optString(Constants.KEY_VALUE, null);
                        arrayList.add(new Pair(optString, optString2 != null ? new Z2(optString2) : null));
                    }
                }
            }
            c0328hp.s = new C0104a3(arrayList);
        }
    }
}
