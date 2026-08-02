package io.appmetrica.analytics.coreutils.internal.logger;

import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* loaded from: classes9.dex */
public abstract class LoggerStorage {
    private static HashMap a = new HashMap();
    private static final Object b = new Object();
    private static volatile PublicLogger c = PublicLogger.getAnonymousInstance();

    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return c;
    }

    public static PublicLogger getOrCreateMainPublicLogger(String str) {
        c = getOrCreatePublicLogger(str);
        return c;
    }

    public static PublicLogger getOrCreatePublicLogger(String str) {
        PublicLogger publicLogger;
        if (StringUtils.isNullOrEmpty(str)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger2 = (PublicLogger) a.get(str);
        if (publicLogger2 != null) {
            return publicLogger2;
        }
        synchronized (b) {
            try {
                publicLogger = (PublicLogger) a.get(str);
                if (publicLogger == null) {
                    publicLogger = new PublicLogger(ApiKeyUtils.createPartialApiKey(str));
                    a.put(str, publicLogger);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return publicLogger;
    }

    public static void unsetPublicLoggers() {
        a = new HashMap();
        c = PublicLogger.getAnonymousInstance();
    }
}
