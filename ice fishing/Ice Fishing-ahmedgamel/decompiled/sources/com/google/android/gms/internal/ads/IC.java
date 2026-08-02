package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public final class IC implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque f26211n = new ArrayDeque(4);

    /* renamed from: u, reason: collision with root package name */
    public Throwable f26212u;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th = this.f26212u;
        while (true) {
            ArrayDeque arrayDeque = this.f26211n;
            if (arrayDeque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) arrayDeque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    try {
                        th.addSuppressed(th2);
                    } catch (Throwable unused) {
                        HC.f26015a.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th2);
                    }
                }
            }
        }
        if (this.f26212u != null || th == null) {
            return;
        }
        Object obj = AbstractC3414jB.f31999a;
        if (IOException.class.isInstance(th)) {
            throw ((Throwable) IOException.class.cast(th));
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new AssertionError(th);
        }
        throw ((Error) th);
    }
}
