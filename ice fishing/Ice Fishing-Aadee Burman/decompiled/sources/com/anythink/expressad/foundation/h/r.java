package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f19686a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f19687b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f19688c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f19689d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f19690e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f19691f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f19692g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f19693h = false;
    private static final String i = "anythink_";

    static {
        if (com.anythink.expressad.a.f17618a) {
            return;
        }
        f19686a = false;
        f19687b = false;
        f19688c = false;
        f19689d = false;
        f19690e = false;
        f19691f = false;
        f19692g = false;
        f19693h = false;
    }

    private r() {
    }

    private static void a(String str, String str2) {
        if (!f19686a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.v(a(str), str2);
    }

    private static void b(String str, String str2) {
        if (!f19687b || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    private static void c(String str, String str2) {
        if (!f19688c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2);
    }

    private static void d(String str, String str2) {
        if (!f19689d || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2);
    }

    private static void e(String str, String str2) {
        if (!f19690e || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    private static void e(String str, String str2, Throwable th) {
        if (!f19690e || str2 == null) {
            return;
        }
        Log.e(a(str), str2, th);
    }

    private static void a(String str, String str2, Throwable th) {
        if (!f19686a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.v(a(str), str2, th);
    }

    private static void b(String str, String str2, Throwable th) {
        if (!f19687b || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2, th);
    }

    private static void c(String str, String str2, Throwable th) {
        if (!f19688c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2, th);
    }

    private static void d(String str, String str2, Throwable th) {
        if (!f19689d || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th);
    }

    private static void a(String str, Throwable th) {
        if (!f19689d || th == null) {
            return;
        }
        Log.w(a(str), th);
    }

    private static void a(Context context, String str) {
        if (f19691f) {
            Toast.makeText(context, str, 1).show();
        }
    }

    private static String a(String str) {
        return !TextUtils.isEmpty(str) ? i.concat(String.valueOf(str)) : str;
    }
}
