package ru.yandex.music.utils;

import android.os.Looper;
import androidx.annotation.NonNull;
import defpackage.y7g;

/* loaded from: classes6.dex */
public abstract class Assertions {
    static {
        com.yandex.music.shared.utils.assertions.Assertions.addTrimClass(Assertions.class);
    }

    public static void assertFalse(boolean z) {
        assertFalse(z, "Assertion failed.");
    }

    public static void assertNonEmpty(String str, String str2) {
        if (y7g.G(str)) {
            com.yandex.music.shared.utils.assertions.Assertions.fail(str2);
        }
    }

    public static void assertNonNull(Object obj) {
        assertNonNull(obj, "arg is null");
    }

    public static void assertTrue(boolean z) {
        if (z) {
            return;
        }
        com.yandex.music.shared.utils.assertions.Assertions.fail("condition not met");
    }

    public static void assertUIThread() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        String name = Thread.currentThread().getName();
        if (myLooper == null) {
            com.yandex.music.shared.utils.assertions.Assertions.fail("Not in UI thread, but on '" + name + "' without looper");
            return;
        }
        com.yandex.music.shared.utils.assertions.Assertions.fail("Not in UI thread, but on '" + name + "' with looper");
    }

    public static void fail() {
        fail("Fail");
    }

    public static void assertFalse(boolean z, String str) {
        if (z) {
            com.yandex.music.shared.utils.assertions.Assertions.fail(str);
        }
    }

    public static void assertNonNull(Object obj, String str) {
        if (obj == null) {
            com.yandex.music.shared.utils.assertions.Assertions.fail(str);
        }
    }

    public static void fail(String str) {
        com.yandex.music.shared.utils.assertions.Assertions.fail(str);
    }

    public static void fail(@NonNull Throwable th) {
        com.yandex.music.shared.utils.assertions.Assertions.fail(th);
    }

    public static void assertTrue(boolean z, String str) {
        if (z) {
            return;
        }
        com.yandex.music.shared.utils.assertions.Assertions.fail(str);
    }

    public static void assertNonEmpty(String str) {
        assertNonEmpty(str, "arg is empty");
    }
}
