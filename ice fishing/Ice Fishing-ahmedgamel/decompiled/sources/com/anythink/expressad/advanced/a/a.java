package com.anythink.expressad.advanced.a;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f17709a = new HashMap();

    public static void a(String str) {
        f17709a.put(str, Boolean.TRUE);
    }

    public static boolean b(String str) {
        if (f17709a.containsKey(str)) {
            return f17709a.get(str).booleanValue();
        }
        return false;
    }

    public static void c(String str) {
        f17709a.remove(str);
    }

    private static void a() {
        f17709a.clear();
    }
}
