package com.datadog.trace.api;

import java.io.Closeable;

/* loaded from: classes4.dex */
public final class NoOpStatsDClient implements Closeable {
    public static final NoOpStatsDClient NO_OP = new NoOpStatsDClient();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
