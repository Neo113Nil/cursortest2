package com.anythink.core.common.n.c;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface v extends Closeable, Flushable {
    x a();

    void a(c cVar, long j6);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
