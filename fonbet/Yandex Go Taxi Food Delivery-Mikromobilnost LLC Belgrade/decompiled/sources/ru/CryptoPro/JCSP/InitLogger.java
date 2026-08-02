package ru.CryptoPro.JCSP;

/* loaded from: classes4.dex */
public interface InitLogger {
    void error(String str);

    void error(String str, Throwable th);

    void info(String str);

    void verbose(String str);

    void warning(String str);
}
