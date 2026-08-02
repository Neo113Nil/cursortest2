package com.bugsnag.android;

/* loaded from: classes.dex */
public interface Logger {
    void d(String str);

    void d(String str, Throwable th);

    void e(String str);

    void e(String str, Throwable th);

    void i(String str);

    void w(String str);

    void w(String str, Throwable th);
}
