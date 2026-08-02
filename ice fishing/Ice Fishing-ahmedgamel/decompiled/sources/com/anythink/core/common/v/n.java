package com.anythink.core.common.v;

import android.util.Log;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f17623a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f17624b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f17625c = false;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f17626d = false;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f17627e = false;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f17628f = false;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f17629g = false;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f17630h = false;

    private n() {
    }

    private static void a(String str, String str2, Throwable th) {
        if (f17625c) {
            Log.v(str, str2, th);
        }
    }

    private static void b(String str, String str2) {
        if (f17625c) {
            Log.v(str, str2);
        }
    }

    private static void c(String str, String str2) {
        if (f17626d) {
            Log.d(str, str2);
        }
    }

    private static void d(String str, String str2) {
        if (f17627e) {
            Log.i(str, str2);
        }
    }

    private static void e(String str, String str2) {
        if (f17628f) {
            Log.w(str, str2);
        }
    }

    private static void f(String str, String str2) {
        if (f17629g) {
            Log.e(str, str2);
        }
    }

    private static void a(String str, Throwable th) {
        if (f17628f) {
            Log.w(str, th);
        }
    }

    private static void b(String str, String str2, Throwable th) {
        if (f17626d) {
            Log.d(str, str2, th);
        }
    }

    private static void c(String str, String str2, Throwable th) {
        if (f17627e) {
            Log.i(str, str2, th);
        }
    }

    private static void d(String str, String str2, Throwable th) {
        if (f17628f) {
            Log.w(str, str2, th);
        }
    }

    private static void e(String str, String str2, Throwable th) {
        if (f17629g) {
            Log.e(str, str2, th);
        }
    }

    public static void a(String str, String str2) {
        if (f17627e) {
            int length = 2001 - str.length();
            while (str2.length() > length) {
                Log.d(str, str2.substring(0, length));
                str2 = str2.substring(length);
            }
            Log.d(str, str2);
        }
    }

    private static void b(String str, String str2, Object... objArr) {
        if (f17626d) {
            try {
                Log.i(str, String.format(str2, objArr) + " threadId=" + Thread.currentThread().getId());
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    private static void c(String str, String str2, Object... objArr) {
        if (f17626d) {
            try {
                Log.w(str, String.format(str2, objArr) + " threadId=" + Thread.currentThread().getId());
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    private static void d(String str, String str2, Object... objArr) {
        if (f17629g) {
            try {
                Log.e(str, String.format(str2, objArr) + " threadId=" + Thread.currentThread().getId());
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    private static void a(String str, String str2, Object... objArr) {
        if (f17626d) {
            try {
                Log.d(str, String.format(str2, objArr) + " threadId=" + Thread.currentThread().getId());
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }
}
