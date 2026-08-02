package com.google.android.filament;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class VertexBuffer {
    public long mNativeObject;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderAttribute(long j, int i, int i2, int i3, int i4, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBufferCount(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderNormalized(long j, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderVertexCount(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native int nSetBufferAt(long j, long j2, int i, Buffer buffer, int i2, int i3, int i4, Object obj, Runnable runnable);

    public final long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed VertexBuffer");
        return 0L;
    }

    public final void setBufferAt(Engine engine, ByteBuffer byteBuffer) {
        if (nSetBufferAt(getNativeObject(), engine.getNativeObject(), 0, byteBuffer, byteBuffer.remaining(), 0, byteBuffer.remaining(), null, null) < 0) {
            throw new BufferOverflowException();
        }
    }
}
