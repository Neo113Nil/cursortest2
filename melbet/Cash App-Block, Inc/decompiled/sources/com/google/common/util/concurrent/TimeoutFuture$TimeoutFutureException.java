package com.google.common.util.concurrent;

import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
final class TimeoutFuture$TimeoutFutureException extends TimeoutException {
    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
