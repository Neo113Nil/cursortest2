package com.datadog.trace.util;

import java.lang.Thread;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes4.dex */
public abstract class AgentThreadFactory implements ThreadFactory {
    public static final ThreadGroup AGENT_THREAD_GROUP = new ThreadGroup("dd-trace-java");

    /* renamed from: com.datadog.trace.util.AgentThreadFactory$1, reason: invalid class name */
    public final class AnonymousClass1 implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            switch (3) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    return;
                default:
                    throw null;
            }
        }
    }
}
