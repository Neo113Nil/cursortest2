package com.facebook.ads.internal.util.common;

import android.os.Looper;

/* loaded from: classes.dex */
public final class Preconditions {
    public static void checkIsOnMainThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new RuntimeException("Must be called from the UiThread");
        }
    }

    public static void checkIsTrue(boolean z3, String str) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T checkNotNull(T t6, String str) {
        if (t6 != null) {
            return t6;
        }
        throw new IllegalArgumentException(str);
    }
}
