package io.appmetrica.analytics.push.coreutils.internal.utils;

import java.util.Map;

/* loaded from: classes9.dex */
public interface Tracker {
    void pauseSession();

    void reportError(String str, Throwable th);

    void reportEvent(String str);

    void reportEvent(String str, Map<String, Object> map);

    void reportUnhandledException(Throwable th);

    void resumeSession();
}
