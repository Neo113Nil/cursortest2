package com.bugsnag.android;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ThreadSendPolicy {
    public static final /* synthetic */ ThreadSendPolicy[] $VALUES;
    public static final ThreadSendPolicy ALWAYS;
    public static final ThreadSendPolicy UNHANDLED_ONLY;

    static {
        ThreadSendPolicy threadSendPolicy = new ThreadSendPolicy("ALWAYS", 0);
        ALWAYS = threadSendPolicy;
        ThreadSendPolicy threadSendPolicy2 = new ThreadSendPolicy("UNHANDLED_ONLY", 1);
        UNHANDLED_ONLY = threadSendPolicy2;
        $VALUES = new ThreadSendPolicy[]{threadSendPolicy, threadSendPolicy2, new ThreadSendPolicy("NEVER", 2)};
    }

    public static ThreadSendPolicy valueOf(String str) {
        return (ThreadSendPolicy) Enum.valueOf(ThreadSendPolicy.class, str);
    }

    public static ThreadSendPolicy[] values() {
        return (ThreadSendPolicy[]) $VALUES.clone();
    }
}
