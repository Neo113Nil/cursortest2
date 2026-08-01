package com.anythink.core.common.h;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private List<a> f14044a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f14045a;

        public final String a() {
            return this.f14045a;
        }

        private void a(String str) {
            this.f14045a = str;
        }
    }

    private s() {
    }

    public static s a(JSONObject jSONObject) {
        a aVar;
        s sVar = new s();
        try {
            sVar.f14044a = new ArrayList();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                JSONObject optJSONObject = jSONObject.optJSONObject(keys.next());
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("name");
                    if (TextUtils.isEmpty(optString)) {
                        aVar = null;
                    } else {
                        aVar = new a();
                        aVar.f14045a = optString;
                    }
                    if (aVar != null) {
                        sVar.f14044a.add(aVar);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return sVar;
    }

    private static a b(JSONObject jSONObject) {
        String optString = jSONObject.optString("name");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        a aVar = new a();
        aVar.f14045a = optString;
        return aVar;
    }

    public final List<a> a() {
        return this.f14044a;
    }
}
