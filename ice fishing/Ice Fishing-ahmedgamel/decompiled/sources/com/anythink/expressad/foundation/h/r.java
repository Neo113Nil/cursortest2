package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f20473a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f20474b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f20475c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f20476d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f20477e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f20478f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f20479g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f20480h = false;
    private static final String i = "anythink_";

    static {
        if (com.anythink.expressad.a.f18405a) {
            return;
        }
        f20473a = false;
        f20474b = false;
        f20475c = false;
        f20476d = false;
        f20477e = false;
        f20478f = false;
        f20479g = false;
        f20480h = false;
    }

    private r() {
    }

    private static void a(String str, String str2) {
        if (!f20473a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.v(a(str), str2);
    }

    private static void b(String str, String str2) {
        if (!f20474b || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    private static void c(String str, String str2) {
        if (!f20475c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2);
    }

    private static void d(String str, String str2) {
        if (!f20476d || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2);
    }

    private static void e(String str, String str2) {
        if (!f20477e || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    private static void e(String str, String str2, Throwable th) {
        if (!f20477e || str2 == null) {
            return;
        }
        Log.e(a(str), str2, th);
    }

    private static void a(String str, String str2, Throwable th) {
        if (!f20473a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.v(a(str), str2, th);
    }

    private static void b(String str, String str2, Throwable th) {
        if (!f20474b || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2, th);
    }

    private static void c(String str, String str2, Throwable th) {
        if (!f20475c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2, th);
    }

    private static void d(String str, String str2, Throwable th) {
        if (!f20476d || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th);
    }

    private static void a(String str, Throwable th) {
        if (!f20476d || th == null) {
            return;
        }
        Log.w(a(str), th);
    }

    private static void a(Context context, String str) {
        if (f20478f) {
            Toast.makeText(context, str, 1).show();
        }
    }

    private static String a(String str) {
        return !TextUtils.isEmpty(str) ? i.concat(String.valueOf(str)) : str;
    }
}
