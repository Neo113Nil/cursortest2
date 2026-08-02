package com.anythink.expressad.foundation.g.g.a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f20343a = new HashMap();

    private Object b(String str) {
        return this.f20343a.get(str);
    }

    private void c(String str) {
        if (this.f20343a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f20343a.remove(str);
    }

    public final void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            if (!(obj instanceof String)) {
                this.f20343a.put(str, String.valueOf(obj));
            } else {
                if (TextUtils.isEmpty((String) obj)) {
                    return;
                }
                this.f20343a.put(str, (String) obj);
            }
        } catch (Exception unused) {
        }
    }

    private boolean a(String str) {
        return this.f20343a.containsKey(str);
    }

    public final Map<String, String> a() {
        return this.f20343a;
    }

    private void a(f fVar) {
        Map<String, String> map;
        Map<String, String> map2;
        if (fVar == null || (map = fVar.f20343a) == null || (map2 = this.f20343a) == null) {
            return;
        }
        map2.putAll(map);
    }

    private void a(Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        this.f20343a.putAll(map);
    }
}
