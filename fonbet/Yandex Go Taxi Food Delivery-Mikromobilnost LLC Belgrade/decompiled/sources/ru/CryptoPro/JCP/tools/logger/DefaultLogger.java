package ru.CryptoPro.JCP.tools.logger;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.prefs.Preferences;

/* loaded from: classes4.dex */
public abstract class DefaultLogger implements DefaultLoggerInterface {
    public static final AtomicReference b = new AtomicReference(ThreadNameScope.NoWrite);
    public final AtomicReference a = new AtomicReference(ThreadNameScope.NoWrite);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ThreadNameScope {
        public static final ThreadNameScope NoWrite;
        public static final ThreadNameScope WriteThreadName;
        public static final ThreadNameScope WriteThreadNameInAllLoggers;
        private static final /* synthetic */ ThreadNameScope[] a;

        static {
            ThreadNameScope threadNameScope = new ThreadNameScope("NoWrite", 0);
            NoWrite = threadNameScope;
            ThreadNameScope threadNameScope2 = new ThreadNameScope("WriteThreadName", 1);
            WriteThreadName = threadNameScope2;
            ThreadNameScope threadNameScope3 = new ThreadNameScope("WriteThreadNameInAllLoggers", 2);
            WriteThreadNameInAllLoggers = threadNameScope3;
            a = new ThreadNameScope[]{threadNameScope, threadNameScope2, threadNameScope3};
        }

        public static ThreadNameScope valueOf(String str) {
            return (ThreadNameScope) Enum.valueOf(ThreadNameScope.class, str);
        }

        public static ThreadNameScope[] values() {
            return (ThreadNameScope[]) a.clone();
        }
    }

    public static void writeThreadNameInAllLoggers() {
        b.set(ThreadNameScope.WriteThreadNameInAllLoggers);
    }

    public final String a(String str) {
        if (b.get() != ThreadNameScope.WriteThreadNameInAllLoggers && this.a.get() != ThreadNameScope.WriteThreadName) {
            return str;
        }
        return "[" + Thread.currentThread().getName() + "] :: " + str;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void dump(String str, Object obj, ByteBuffer byteBuffer);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void dump(String str, ByteBuffer byteBuffer);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void dump(String str, byte[] bArr);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void enter();

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void enter(Object obj);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void enter(Object obj, Object obj2);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void enter(Object obj, Object obj2, Object obj3);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void exit();

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void exit(Object obj);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void fatal(String str);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void fatal(String str, Object obj);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void fatal(String str, Throwable th);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void fatal(String str, Object... objArr);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void fatal(Throwable th);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void fine(String str);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void fine(String str, Object obj);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void fine(String str, Throwable th);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void fine(String str, Object... objArr);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void fineArray(String str, byte[] bArr);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void fineArray(String str, int[] iArr);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void fineFormat(String str, Object... objArr);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void finer(String str);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void finer(String str, Object obj);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void finerFormat(String str, Object... objArr);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void ignoredException(String str, Throwable th);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void ignoredException(Throwable th);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void info(String str);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void info(String str, Object obj);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void info(String str, Throwable th);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void infoFormat(String str, Object... objArr);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ boolean isAllEnabled();

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ boolean isConfigEnabled();

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ boolean isFineEnabled();

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ boolean isFinerEnabled();

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ boolean isFinestEnabled();

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ boolean isInfoEnabled();

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ boolean isSevereEnabled();

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ boolean isWarningEnabled();

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void pref(Preferences preferences, String str, Object obj);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void subEnter();

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void subEnter(Object obj);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void subEnter(Object obj, Object obj2);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void subExit();

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void subExit(Object obj);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void subThrown(String str, Throwable th);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void subThrown(Throwable th);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void thrown(String str, Throwable th);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void thrown(Throwable th);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void warning(String str);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void warning(String str, Object obj);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void warning(String str, Throwable th);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void warning(String str, Object... objArr);

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public abstract /* synthetic */ void warning(Throwable th);

    public void writeThreadName() {
        this.a.set(ThreadNameScope.WriteThreadName);
    }
}
