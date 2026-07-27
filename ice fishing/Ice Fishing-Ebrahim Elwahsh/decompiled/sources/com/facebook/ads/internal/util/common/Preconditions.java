package com.facebook.ads.internal.util.common;

import android.os.Looper;

/* loaded from: classes.dex */
public final class Preconditions {
    public static void checkIsOnMainThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new RuntimeException("Must be called from the UiThread");
        }
    }

    public static void checkIsTrue(boolean z8, String str) {
        if (!z8) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T checkNotNull(T t9, String str) {
        if (t9 != null) {
            return t9;
        }
        throw new IllegalArgumentException(str);
    }
}
