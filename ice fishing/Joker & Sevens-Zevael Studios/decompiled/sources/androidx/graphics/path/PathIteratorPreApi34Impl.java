package androidx.graphics.path;

import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class PathIteratorPreApi34Impl {
    static {
        System.loadLibrary("androidx.graphics.path");
    }

    private final native long createInternalPathIterator(Path path, int i10, float f10);

    private final native void destroyInternalPathIterator(long j3);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j3);

    @FastNative
    private final native int internalPathIteratorNext(long j3, float[] fArr, int i10);

    @FastNative
    private final native int internalPathIteratorPeek(long j3);

    @FastNative
    private final native int internalPathIteratorRawSize(long j3);

    @FastNative
    private final native int internalPathIteratorSize(long j3);

    public final void finalize() {
        destroyInternalPathIterator(0L);
    }
}
