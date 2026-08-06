package androidx.graphics.path;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class PathIteratorPreApi34Impl {
    static {
        java.lang.System.loadLibrary("androidx.graphics.path");
    }

    private final native long createInternalPathIterator(android.graphics.Path path, int i, float f);

    private final native void destroyInternalPathIterator(long j);

    @dalvik.annotation.optimization.FastNative
    private final native boolean internalPathIteratorHasNext(long j);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorNext(long j, float[] fArr, int i);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorPeek(long j);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorRawSize(long j);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorSize(long j);

    public final void finalize() {
        destroyInternalPathIterator(0L);
    }
}
