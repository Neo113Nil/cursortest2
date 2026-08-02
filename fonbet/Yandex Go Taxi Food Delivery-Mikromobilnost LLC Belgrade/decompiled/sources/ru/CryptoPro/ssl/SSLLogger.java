package ru.CryptoPro.ssl;

import java.nio.ByteBuffer;
import ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface;
import ru.CryptoPro.JCP.tools.logger.LoggingFactory;

/* loaded from: classes4.dex */
public final class SSLLogger {
    public static final String LOGGER_NAME = "ru.CryptoPro.ssl.SSLLogger";
    public static final String SHORT_LOGGER_NAME = "SSL";
    public static final DefaultLoggerInterface a = LoggingFactory.createLogger(LOGGER_NAME, SHORT_LOGGER_NAME);

    public static void dump(String str, Object obj, ByteBuffer byteBuffer) {
        a.dump(str, obj, byteBuffer);
    }

    public static void enter() {
        a.enter();
    }

    public static void exit() {
        a.exit();
    }

    public static void fatal(String str) {
        a.fatal(str);
    }

    public static void fine(String str) {
        a.fine(str);
    }

    public static void finer(String str) {
        a.finer(str);
    }

    public static void ignoredException(Throwable th) {
        a.ignoredException(th);
    }

    public static void info(String str) {
        a.info(str);
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

    public static void subEnter() {
        a.subEnter();
    }

    public static void subExit() {
        a.subExit();
    }

    public static void subThrown(String str, Throwable th) {
        a.subThrown(str, th);
    }

    public static void thrown(Throwable th) {
        a.thrown(th);
    }

    public static void warning(String str) {
        a.warning(str);
    }

    public String toString() {
        return a.toString();
    }

    public static void dump(String str, ByteBuffer byteBuffer) {
        a.dump(str, byteBuffer);
    }

    public static void enter(Object obj) {
        a.enter(obj);
    }

    public static void exit(Object obj) {
        a.exit(obj);
    }

    public static void fatal(String str, Object obj) {
        a.fatal(str, obj);
    }

    public static void fine(String str, Object obj) {
        a.fine(str, obj);
    }

    public static void info(String str, Object obj) {
        a.info(str, obj);
    }

    public static void subEnter(Object obj) {
        a.subEnter(obj);
    }

    public static void subExit(Object obj) {
        a.subExit(obj);
    }

    public static void subThrown(Throwable th) {
        a.subThrown(th);
    }

    public static void warning(String str, Throwable th) {
        a.warning(str, th);
    }

    public static void dump(String str, byte[] bArr) {
        a.dump(str, bArr);
    }

    public static void enter(Object obj, Object obj2) {
        a.enter(obj, obj2);
    }

    public static void fatal(String str, Throwable th) {
        a.fatal(str, th);
    }

    public static void fine(String str, Throwable th) {
        a.fine(str, th);
    }

    public static void info(String str, Throwable th) {
        a.info(str, th);
    }

    public static void subEnter(Object obj, Object obj2) {
        a.subEnter(obj, obj2);
    }

    public static void warning(Throwable th) {
        a.warning(th);
    }

    public static void enter(Object obj, Object obj2, Object obj3) {
        a.enter(obj, obj2, obj3);
    }

    public static void fatal(Throwable th) {
        a.fatal(th);
    }
}
