package com.yandex.plus.core.analytics;

/* loaded from: classes4.dex */
public interface e {
    void a();

    void reportError(String str, String str2, Throwable th);

    default void reportUnhandledException(Throwable th) {
    }
}
