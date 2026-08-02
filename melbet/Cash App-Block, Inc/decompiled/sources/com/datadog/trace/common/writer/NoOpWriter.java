package com.datadog.trace.common.writer;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class NoOpWriter implements Writer {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.datadog.trace.common.writer.Writer
    public final void write(ArrayList arrayList) {
    }
}
