package com.anythink.core.common.h;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ax extends bm {

    /* renamed from: a, reason: collision with root package name */
    JSONObject f13752a;

    public ax(String str, String str2, String str3, Map<String, Object> map, JSONObject jSONObject) {
        super(str, str2, str3, "", map, null, null, null);
        this.f13752a = jSONObject;
        a(2);
    }

    public final JSONObject a() {
        return this.f13752a;
    }
}
