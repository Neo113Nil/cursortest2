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
    private Map<String, a> f6805a = new HashMap();

    public static class a {

        /* renamed from: d, reason: collision with root package name */
        private static final int f6806d = 1;

        /* renamed from: e, reason: collision with root package name */
        private static final int f6807e = 2;

        /* renamed from: f, reason: collision with root package name */
        private static final int f6808f = 3;

        /* renamed from: a, reason: collision with root package name */
        public String f6809a;

        /* renamed from: b, reason: collision with root package name */
        public int f6810b;

        /* renamed from: c, reason: collision with root package name */
        public String f6811c;

        private String a() {
            int i = this.f6810b;
            return i != 2 ? i != 3 ? this.f6809a : Matcher.quoteReplacement(this.f6811c) : "";
        }
    }

    public final void a(JSONArray jSONArray) {
        this.f6805a.clear();
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString("macro");
                if (!TextUtils.isEmpty(optString)) {
                    a aVar = new a();
                    aVar.f6809a = optString;
                    aVar.f6810b = jSONObject.optInt(NativeAdvancedJsUtils.f18693p, 1);
                    aVar.f6811c = jSONObject.optString("value", "");
                    this.f6805a.put(optString, aVar);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final String a(String str, String str2) {
        a aVar;
        Map<String, a> map = this.f6805a;
        if (map == null || (aVar = map.get(str)) == null) {
            return str2;
        }
        int i = aVar.f6810b;
        if (i == 2) {
            return "";
        }
        if (i != 3) {
            return aVar.f6809a;
        }
        return Matcher.quoteReplacement(aVar.f6811c);
    }
}
