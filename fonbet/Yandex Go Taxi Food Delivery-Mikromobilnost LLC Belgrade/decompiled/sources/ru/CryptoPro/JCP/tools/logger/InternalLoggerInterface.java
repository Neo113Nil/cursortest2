package ru.CryptoPro.JCP.tools.logger;

/* loaded from: classes4.dex */
public interface InternalLoggerInterface {
    void fatal(String str);

    void fatal(String str, Throwable th);

    void fatal(Throwable th);

    void fine(String str);

    void ignoredException(Throwable th);

    void warning(String str);

    void warning(String str, Throwable th);

    void warning(Throwable th);
}
