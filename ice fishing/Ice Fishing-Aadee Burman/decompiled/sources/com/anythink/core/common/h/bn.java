package com.anythink.core.common.h;

import com.anythink.core.api.ATAdInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bn {

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Object> f13712b;

    /* renamed from: c, reason: collision with root package name */
    private i f13713c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f13714d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13716f;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, String> f13718h;

    /* renamed from: g, reason: collision with root package name */
    private String f13717g = "";

    /* renamed from: a, reason: collision with root package name */
    final Object f13711a = new Object();
    private JSONObject i = null;

    /* renamed from: j, reason: collision with root package name */
    private as f13719j = null;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, com.anythink.core.common.f> f13715e = new ConcurrentHashMap(1);

    public final Object a() {
        return this.f13711a;
    }

    public final Map<String, Object> b() {
        return this.f13712b;
    }

    public final i c() {
        return this.f13713c;
    }

    public final boolean d() {
        return this.f13716f;
    }

    public final String e() {
        return this.f13717g;
    }

    public final JSONObject f() {
        return this.i;
    }

    public final com.anythink.core.common.f a(String str) {
        return this.f13715e.get(str);
    }

    public final String b(String str) {
        Map<String, String> map = this.f13714d;
        return map == null ? "" : map.remove(str);
    }

    public final String c(String str) {
        Map<String, String> map = this.f13718h;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final void a(String str, com.anythink.core.common.f fVar) {
        this.f13715e.put(str, fVar);
    }

    public final void a(Map<String, Object> map) {
        this.f13712b = map;
    }

    public final void a(String str, Object obj) {
        if (this.f13712b == null) {
            this.f13712b = new ConcurrentHashMap(2);
        }
        this.f13712b.put(str, obj);
    }

    public final void b(String str, String str2) {
        if (this.f13718h == null) {
            this.f13718h = new ConcurrentHashMap(2);
        }
        this.f13718h.put(str, str2);
    }

    public final void a(ATAdInfo aTAdInfo) {
        if (aTAdInfo != null) {
            this.f13713c = new i(aTAdInfo.getAdsourceId(), aTAdInfo.getShowId(), aTAdInfo.getNetworkFirmId());
        } else {
            this.f13713c = null;
        }
    }

    public final void a(String str, String str2) {
        synchronized (this) {
            try {
                if (this.f13714d == null) {
                    this.f13714d = new ConcurrentHashMap(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f13714d.put(str, str2);
    }

    public final void a(boolean z3) {
        this.f13716f = z3;
    }

    public final void a(Object[] objArr) {
        this.f13717g = com.anythink.core.common.v.q.a(objArr);
    }

    public final void a(JSONObject jSONObject) {
        this.i = jSONObject;
    }

    public final void a(String str, List<c> list) {
        if (this.f13719j == null) {
            this.f13719j = new as();
        }
        this.f13719j.a(str, list);
    }

    public final void a(String str, String str2, String str3) {
        as asVar = this.f13719j;
        if (asVar != null) {
            asVar.a(str, str2, str3);
        }
    }
}
