package com.anythink.core.common.w.a.a;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17159a = "d";

    /* renamed from: b, reason: collision with root package name */
    private static volatile Map<String, Map<Class<? extends com.anythink.core.common.w.a.b.b>, com.anythink.core.common.w.a.b.b>> f17160b;

    public static <M extends com.anythink.core.common.w.a.b.b> M a(String str, Class<M> cls) {
        Map<Class<? extends com.anythink.core.common.w.a.b.b>, com.anythink.core.common.w.a.b.b> b9 = b(str);
        if (b9 != null) {
            return (M) b9.get(cls);
        }
        return null;
    }

    private static Map<Class<? extends com.anythink.core.common.w.a.b.b>, com.anythink.core.common.w.a.b.b> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (f17160b == null) {
            synchronized (d.class) {
                try {
                    if (f17160b == null) {
                        f17160b = new ConcurrentHashMap();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Map<Class<? extends com.anythink.core.common.w.a.b.b>, com.anythink.core.common.w.a.b.b> map = f17160b.get(str);
        if (map != null) {
            return map;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        a aVar = new a();
        b bVar = new b(str, aVar);
        concurrentHashMap.put(com.anythink.core.common.w.a.b.e.class, new e(str, aVar, bVar));
        concurrentHashMap.put(com.anythink.core.common.w.a.b.c.class, aVar);
        concurrentHashMap.put(com.anythink.core.common.w.a.b.d.class, bVar);
        f17160b.put(str, concurrentHashMap);
        return concurrentHashMap;
    }

    public static void a(String str) {
        Map<Class<? extends com.anythink.core.common.w.a.b.b>, com.anythink.core.common.w.a.b.b> map;
        com.anythink.core.common.w.a.b.b bVar;
        if (f17160b == null || TextUtils.isEmpty(str) || (map = f17160b.get(str)) == null || map.isEmpty()) {
            return;
        }
        for (Class<? extends com.anythink.core.common.w.a.b.b> cls : map.keySet()) {
            if (cls != null && (bVar = map.get(cls)) != null) {
                bVar.b();
            }
        }
    }
}
