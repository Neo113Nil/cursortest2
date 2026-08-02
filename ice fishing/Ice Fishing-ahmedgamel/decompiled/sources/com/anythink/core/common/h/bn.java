package com.anythink.core.common.h;

import com.anythink.core.api.ATAdInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bn {

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Object> f14498b;

    /* renamed from: c, reason: collision with root package name */
    private i f14499c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f14500d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14502f;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, String> f14504h;

    /* renamed from: g, reason: collision with root package name */
    private String f14503g = "";

    /* renamed from: a, reason: collision with root package name */
    final Object f14497a = new Object();
    private JSONObject i = null;

    /* renamed from: j, reason: collision with root package name */
    private as f14505j = null;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, com.anythink.core.common.f> f14501e = new ConcurrentHashMap(1);

    public final Object a() {
        return this.f14497a;
    }

    public final Map<String, Object> b() {
        return this.f14498b;
    }

    public final i c() {
        return this.f14499c;
    }

    public final boolean d() {
        return this.f14502f;
    }

    public final String e() {
        return this.f14503g;
    }

    public final JSONObject f() {
        return this.i;
    }

    public final com.anythink.core.common.f a(String str) {
        return this.f14501e.get(str);
    }

    public final String b(String str) {
        Map<String, String> map = this.f14500d;
        return map == null ? "" : map.remove(str);
    }

    public final String c(String str) {
        Map<String, String> map = this.f14504h;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final void a(String str, com.anythink.core.common.f fVar) {
        this.f14501e.put(str, fVar);
    }

    public final void a(Map<String, Object> map) {
        this.f14498b = map;
    }

    public final void a(String str, Object obj) {
        if (this.f14498b == null) {
            this.f14498b = new ConcurrentHashMap(2);
        }
        this.f14498b.put(str, obj);
    }

    public final void b(String str, String str2) {
        if (this.f14504h == null) {
            this.f14504h = new ConcurrentHashMap(2);
        }
        this.f14504h.put(str, str2);
    }

    public final void a(ATAdInfo aTAdInfo) {
        if (aTAdInfo != null) {
            this.f14499c = new i(aTAdInfo.getAdsourceId(), aTAdInfo.getShowId(), aTAdInfo.getNetworkFirmId());
        } else {
            this.f14499c = null;
        }
    }

    public final void a(String str, String str2) {
        synchronized (this) {
            try {
                if (this.f14500d == null) {
                    this.f14500d = new ConcurrentHashMap(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f14500d.put(str, str2);
    }

    public final void a(boolean z6) {
        this.f14502f = z6;
    }

    public final void a(Object[] objArr) {
        this.f14503g = com.anythink.core.common.v.q.a(objArr);
    }

    public final void a(JSONObject jSONObject) {
        this.i = jSONObject;
    }

    public final void a(String str, List<c> list) {
        if (this.f14505j == null) {
            this.f14505j = new as();
        }
        this.f14505j.a(str, list);
    }

    public final void a(String str, String str2, String str3) {
        as asVar = this.f14505j;
        if (asVar != null) {
            asVar.a(str, str2, str3);
        }
    }
}
