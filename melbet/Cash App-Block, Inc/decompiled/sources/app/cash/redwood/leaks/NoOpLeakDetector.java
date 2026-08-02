package app.cash.redwood.leaks;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class NoOpLeakDetector implements AutoCloseable {
    public boolean closed;

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.closed = true;
    }

    public final void watchReference(Object obj, String str) {
        obj.getClass();
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
        }
    }
}
