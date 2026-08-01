package com.anythink.expressad.foundation.g.g.a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f19556a = new HashMap();

    private Object b(String str) {
        return this.f19556a.get(str);
    }

    private void c(String str) {
        if (this.f19556a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f19556a.remove(str);
    }

    public final void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            if (!(obj instanceof String)) {
                this.f19556a.put(str, String.valueOf(obj));
            } else {
                if (TextUtils.isEmpty((String) obj)) {
                    return;
                }
                this.f19556a.put(str, (String) obj);
            }
        } catch (Exception unused) {
        }
    }

    private boolean a(String str) {
        return this.f19556a.containsKey(str);
    }

    public final Map<String, String> a() {
        return this.f19556a;
    }

    private void a(f fVar) {
        Map<String, String> map;
        Map<String, String> map2;
        if (fVar == null || (map = fVar.f19556a) == null || (map2 = this.f19556a) == null) {
            return;
        }
        map2.putAll(map);
    }

    private void a(Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        this.f19556a.putAll(map);
    }
}
