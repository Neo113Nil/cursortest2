package com.datadog.trace.monitor;

/* loaded from: classes4.dex */
public final class NoOpRecording implements AutoCloseable {
    public static final NoOpRecording NO_OP = new NoOpRecording();

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
