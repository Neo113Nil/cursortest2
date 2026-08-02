package ru.CryptoPro.JCP.tools.logger;

import java.nio.ByteBuffer;
import java.util.prefs.Preferences;

/* loaded from: classes4.dex */
public interface DefaultLoggerInterface {
    public static final int STACK_TRACE_INDEX = 3;

    public static class CallerDescription {
        public String method;
        public String name;

        public CallerDescription(String str, String str2) {
            this.name = str;
            this.method = str2;
        }
    }

    void dump(String str, Object obj, ByteBuffer byteBuffer);

    void dump(String str, ByteBuffer byteBuffer);

    void dump(String str, byte[] bArr);

    void enter();

    void enter(Object obj);

    void enter(Object obj, Object obj2);

    void enter(Object obj, Object obj2, Object obj3);

    void exit();

    void exit(Object obj);

    void fatal(String str);

    void fatal(String str, Object obj);

    void fatal(String str, Throwable th);

    void fatal(String str, Object... objArr);

    void fatal(Throwable th);

    void fine(String str);

    void fine(String str, Object obj);

    void fine(String str, Throwable th);

    void fine(String str, Object... objArr);

    void fineArray(String str, byte[] bArr);

    void fineArray(String str, int[] iArr);

    void fineFormat(String str, Object... objArr);

    void finer(String str);

    void finer(String str, Object obj);

    void finerFormat(String str, Object... objArr);

    void ignoredException(String str, Throwable th);

    void ignoredException(Throwable th);

    void info(String str);

    void info(String str, Object obj);

    void info(String str, Throwable th);

    void infoFormat(String str, Object... objArr);

    boolean isAllEnabled();

    boolean isConfigEnabled();

    boolean isFineEnabled();

    boolean isFinerEnabled();

    boolean isFinestEnabled();

    boolean isInfoEnabled();

    boolean isSevereEnabled();

    boolean isWarningEnabled();

    void pref(Preferences preferences, String str, Object obj);

    void subEnter();

    void subEnter(Object obj);

    void subEnter(Object obj, Object obj2);

    void subExit();

    void subExit(Object obj);

    void subThrown(String str, Throwable th);

    void subThrown(Throwable th);

    void thrown(String str, Throwable th);

    void thrown(Throwable th);

    void warning(String str);

    void warning(String str, Object obj);

    void warning(String str, Throwable th);

    void warning(String str, Object... objArr);

    void warning(Throwable th);
}
