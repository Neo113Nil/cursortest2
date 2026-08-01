package com.anythink.basead.b.e;

import android.text.TextUtils;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, a> f6019a = new HashMap();

    public static class a {

        /* renamed from: d, reason: collision with root package name */
        private static final int f6020d = 1;

        /* renamed from: e, reason: collision with root package name */
        private static final int f6021e = 2;

        /* renamed from: f, reason: collision with root package name */
        private static final int f6022f = 3;

        /* renamed from: a, reason: collision with root package name */
        public String f6023a;

        /* renamed from: b, reason: collision with root package name */
        public int f6024b;

        /* renamed from: c, reason: collision with root package name */
        public String f6025c;

        private String a() {
            int i = this.f6024b;
            return i != 2 ? i != 3 ? this.f6023a : Matcher.quoteReplacement(this.f6025c) : "";
        }
    }

    public final void a(JSONArray jSONArray) {
        this.f6019a.clear();
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString("macro");
                if (!TextUtils.isEmpty(optString)) {
                    a aVar = new a();
                    aVar.f6023a = optString;
                    aVar.f6024b = jSONObject.optInt(NativeAdvancedJsUtils.f17906p, 1);
                    aVar.f6025c = jSONObject.optString("value", "");
                    this.f6019a.put(optString, aVar);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final String a(String str, String str2) {
        a aVar;
        Map<String, a> map = this.f6019a;
        if (map == null || (aVar = map.get(str)) == null) {
            return str2;
        }
        int i = aVar.f6024b;
        if (i == 2) {
            return "";
        }
        if (i != 3) {
            return aVar.f6023a;
        }
        return Matcher.quoteReplacement(aVar.f6025c);
    }
}
