package ru.CryptoPro.JCP.tools.logger;

/* loaded from: classes4.dex */
public interface AndroidLoggingInterface {
    String getName();

    void onError(String str, String str2, Throwable th);

    void onInfo(String str, String str2, Throwable th);

    void onVerbose(String str, String str2);

    void onWarning(String str, String str2, Throwable th);
}
