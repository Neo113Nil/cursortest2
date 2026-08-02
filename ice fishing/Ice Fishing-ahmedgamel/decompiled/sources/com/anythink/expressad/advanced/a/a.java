package com.anythink.expressad.advanced.a;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f18496a = new HashMap();

    public static void a(String str) {
        f18496a.put(str, Boolean.TRUE);
    }

    public static boolean b(String str) {
        if (f18496a.containsKey(str)) {
            return f18496a.get(str).booleanValue();
        }
        return false;
    }

    public static void c(String str) {
        f18496a.remove(str);
    }

    private static void a() {
        f18496a.clear();
    }
}
