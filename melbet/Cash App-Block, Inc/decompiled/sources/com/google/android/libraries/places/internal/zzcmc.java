package com.google.android.libraries.places.internal;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes4.dex */
public interface zzcmc extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void zzc(zzclo zzcloVar, long j);
}
