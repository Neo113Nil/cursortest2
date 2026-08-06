package io.appmetrica.analytics.coreutils.internal.logger;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class LoggerStorage {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap f3842a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f3843b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile PublicLogger f3844c = PublicLogger.getAnonymousInstance();

    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return f3844c;
    }

    public static PublicLogger getOrCreateMainPublicLogger(String str) {
        f3844c = getOrCreatePublicLogger(str);
        return f3844c;
    }

    public static PublicLogger getOrCreatePublicLogger(String str) {
        if (TextUtils.isEmpty(str)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger = (PublicLogger) f3842a.get(str);
        if (publicLogger == null) {
            synchronized (f3843b) {
                try {
                    publicLogger = (PublicLogger) f3842a.get(str);
                    if (publicLogger == null) {
                        publicLogger = new PublicLogger(ApiKeyUtils.createPartialApiKey(str));
                        f3842a.put(str, publicLogger);
                    }
                } finally {
                }
            }
        }
        return publicLogger;
    }

    public static void unsetPublicLoggers() {
        f3842a = new HashMap();
        f3844c = PublicLogger.getAnonymousInstance();
    }
}
