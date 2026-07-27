package com.anythink.basead.exoplayer.k;

import android.os.Looper;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class a {
    private a() {
    }

    public static void a(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z3) {
        if (!z3) {
            throw new IllegalStateException();
        }
    }

    public static void a(boolean z3, Object obj) {
        if (!z3) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void b(boolean z3, Object obj) {
        if (!z3) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static int a(int i, int i6) {
        if (i < 0 || i >= i6) {
            throw new IndexOutOfBoundsException();
        }
        return i;
    }

    public static <T> T a(T t6) {
        t6.getClass();
        return t6;
    }

    private static <T> T a(T t6, Object obj) {
        if (t6 != null) {
            return t6;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    private static String a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    private static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Not in applications main thread");
        }
    }
}
