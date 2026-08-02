package com.google.common.util.concurrent;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class CycleDetectingLockFactory$PotentialDeadlockException extends CycleDetectingLockFactory$ExampleStackTrace {
    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        Objects.requireNonNull(message);
        StringBuilder sb = new StringBuilder(message);
        for (Throwable th = null; th != null; th = th.getCause()) {
            sb.append(", ");
            sb.append(th.getMessage());
        }
        return sb.toString();
    }
}
