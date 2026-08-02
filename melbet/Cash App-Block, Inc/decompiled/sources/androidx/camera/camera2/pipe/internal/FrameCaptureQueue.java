package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.Request;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.Iterator;
import kotlin.collections.ArrayDeque;

/* loaded from: classes3.dex */
public final class FrameCaptureQueue implements AutoCloseable {
    public boolean closed;
    public final Object lock = new Object();
    public final ArrayDeque queue = new ArrayDeque();

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Iterator<E> it = this.queue.iterator();
            if (it.hasNext()) {
                throw Recorder$$ExternalSyntheticOutline2.m((Iterator) it);
            }
            this.queue.clear();
        }
    }

    public final void remove(Request request) {
        request.getClass();
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return;
                }
                Iterator it = this.queue.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
