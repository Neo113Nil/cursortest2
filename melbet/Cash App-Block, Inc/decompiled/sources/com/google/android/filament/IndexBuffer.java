package com.google.android.filament;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class IndexBuffer {
    public long mNativeObject;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBufferType(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIndexCount(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native int nSetBuffer(long j, long j2, Buffer buffer, int i, int i2, int i3, Object obj, Runnable runnable);

    public final long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed IndexBuffer");
        return 0L;
    }

    public final void setBuffer(Engine engine, ByteBuffer byteBuffer) {
        if (nSetBuffer(getNativeObject(), engine.getNativeObject(), byteBuffer, byteBuffer.remaining(), 0, byteBuffer.remaining(), null, null) < 0) {
            throw new BufferOverflowException();
        }
    }
}
