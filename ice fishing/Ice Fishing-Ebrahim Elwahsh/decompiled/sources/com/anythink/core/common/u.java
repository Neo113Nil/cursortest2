package com.anythink.core.common;

import com.anythink.core.api.ATAdInfo;
import com.anythink.core.common.h.bn;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private static volatile u f16603a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, bn> f16604b = new ConcurrentHashMap<>(4);

    private u() {
    }

    public static u a() {
        if (f16603a == null) {
            synchronized (u.class) {
                try {
                    if (f16603a == null) {
                        f16603a = new u();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16603a;
    }

    private synchronized bn h(String str) {
        bn bnVar;
        bnVar = this.f16604b.get(str);
        if (bnVar == null) {
            bnVar = new bn();
            this.f16604b.put(str, bnVar);
        }
        return bnVar;
    }

    public final synchronized Map<String, Object> b(String str) {
        HashMap hashMap;
        hashMap = new HashMap(2);
        Map<String, Object> b9 = h(str).b();
        if (b9 != null) {
            hashMap.putAll(b9);
        }
        return hashMap;
    }

    public final com.anythink.core.common.h.i c(String str) {
        return h(str).c();
    }

    public final void d(String str) {
        h(str).a((ATAdInfo) null);
    }

    public final boolean e(String str) {
        return h(str).d();
    }

    public final String f(String str) {
        return h(str).e();
    }

    public final JSONObject g(String str) {
        return h(str).f();
    }

    public final String b(String str, String str2) {
        return h(str).b(str2);
    }

    public final Object a(String str) {
        return h(str).a();
    }

    public final void b(String str, String str2, String str3) {
        h(str).a(str, str2, str3);
    }

    public final f a(String str, String str2) {
        return h(str).a(str2);
    }

    public final void a(String str, String str2, f fVar) {
        h(str).a(str2, fVar);
    }

    public final synchronized void a(String str, Map<String, Object> map) {
        h(str).a(com.anythink.core.common.v.j.a(map));
    }

    private synchronized void a(String str, String str2, Object obj) {
        h(str).a(str2, obj);
    }

    public final void a(String str, ATAdInfo aTAdInfo) {
        h(str).a(aTAdInfo);
    }

    public final void a(String str, String str2, String str3) {
        h(str).a(str2, str3);
    }

    public final void a(String str, boolean z8) {
        h(str).a(z8);
    }

    public final void a(String str, Object[] objArr) {
        h(str).a(objArr);
    }

    public final void a(String str, int i, String str2) {
        h(str).b(String.valueOf(i), str2);
    }

    public final String a(String str, int i) {
        return h(str).c(String.valueOf(i));
    }

    public final void a(String str, JSONObject jSONObject) {
        h(str).a(jSONObject);
    }

    public final void a(String str, String str2, List<com.anythink.core.common.h.c> list) {
        h(str).a(str2, list);
    }
}
