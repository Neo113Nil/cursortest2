package com.datadog.trace.logger;

/* loaded from: classes4.dex */
public interface Logger {
    boolean isWarnEnabled();

    void warn(String str, Object... objArr);
}
