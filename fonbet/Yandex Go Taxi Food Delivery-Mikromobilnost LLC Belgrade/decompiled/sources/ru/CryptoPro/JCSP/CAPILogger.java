package ru.CryptoPro.JCSP;

import ru.CryptoPro.JCP.tools.logger.DefaultLogger;
import ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface;
import ru.CryptoPro.JCP.tools.logger.LoggingFactory;

/* loaded from: classes4.dex */
public class CAPILogger extends NativeAPILogger {
    public static final String LOGGER_NAME = "ru.CryptoPro.JCSP.CAPILogger";
    public static final String SHORT_LOGGER_NAME = "CAPI";
    private static final DefaultLoggerInterface a;

    static {
        DefaultLoggerInterface createLogger = LoggingFactory.createLogger(LOGGER_NAME, SHORT_LOGGER_NAME);
        a = createLogger;
        if (createLogger instanceof DefaultLogger) {
            ((DefaultLogger) createLogger).writeThreadName();
        }
    }

    private CAPILogger() {
    }

    public static void error(String str, Object[] objArr, int i, String... strArr) {
        if (isFinerEnabled()) {
            String a2 = NativeAPILogger.a(str, objArr, true, 0L, i, strArr);
            a.finer(str + a2);
        }
    }

    public static void fatal(String str) {
        a.fine(str);
    }

    public static void finer(String str) {
        a.finer(str);
    }

    public static boolean isAllEnabled() {
        return a.isAllEnabled();
    }

    public static boolean isConfigEnabled() {
        return a.isConfigEnabled();
    }

    public static boolean isFineEnabled() {
        return a.isFineEnabled();
    }

    public static boolean isFinerEnabled() {
        return a.isFinerEnabled();
    }

    public static boolean isFinestEnabled() {
        return a.isFinestEnabled();
    }

    public static boolean isInfoEnabled() {
        return a.isInfoEnabled();
    }

    public static boolean isSevereEnabled() {
        return a.isSevereEnabled();
    }

    public static boolean isWarningEnabled() {
        return a.isWarningEnabled();
    }

    public static void log(String str, Object[] objArr, long j, String... strArr) {
        if (isFinerEnabled()) {
            String a2 = NativeAPILogger.a(str, objArr, false, j, 0, strArr);
            a.finer(str + a2);
        }
    }

    public String toString() {
        return a.toString();
    }

    public static void fatal(String str, Throwable th) {
        a.fine(str, th);
    }

    public static void log(String str, String str2) {
        if (isFinerEnabled()) {
            a.finer(str + "(), " + str2);
        }
    }
}
