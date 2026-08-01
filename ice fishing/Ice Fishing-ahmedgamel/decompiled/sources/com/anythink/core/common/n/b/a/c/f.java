package com.anythink.core.common.n.b.a.c;

/* loaded from: classes.dex */
public final class f {
    private f() {
    }

    public static boolean a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public static boolean b(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    public static boolean c(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    private static boolean d(String str) {
        return str.equals("PROPFIND");
    }

    private static boolean e(String str) {
        return !str.equals("PROPFIND");
    }
}
