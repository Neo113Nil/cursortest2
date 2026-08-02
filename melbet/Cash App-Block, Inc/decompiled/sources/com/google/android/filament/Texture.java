package com.google.android.filament;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.load.resource.bytes.ByteBufferRewinder;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class Texture {
    public long mNativeObject;

    static {
        try {
            Class.forName("android.hardware.HardwareBuffer");
        } catch (ClassNotFoundException unused) {
        }
        CameraSelector$$ExternalSyntheticOutline0.values(5);
        CameraSelector$$ExternalSyntheticOutline0.values(109);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFormat(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderHeight(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLevels(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSampler(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderUsage(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderWidth(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native void nGenerateMipmaps(long j, long j2);

    private static native int nGetHeight(long j, int i);

    private static native int nGetWidth(long j, int i);

    private static native int nSetImageCubemap(long j, long j2, int i, Buffer buffer, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, Object obj, Runnable runnable);

    public final void generateMipmaps(Engine engine) {
        nGenerateMipmaps(getNativeObject(), engine.getNativeObject());
    }

    public final int getHeight() {
        return nGetHeight(getNativeObject(), 0);
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed Texture");
        return 0L;
    }

    public final int getWidth() {
        return nGetWidth(getNativeObject(), 0);
    }

    public final void setImage(Engine engine, int i, ByteBufferRewinder byteBufferRewinder, int[] iArr) {
        long nativeObject = getNativeObject();
        long nativeObject2 = engine.getNativeObject();
        ByteBuffer byteBuffer = byteBufferRewinder.buffer;
        if (nSetImageCubemap(nativeObject, nativeObject2, i, byteBuffer, byteBuffer.remaining(), 0, 0, CameraSelector$$ExternalSyntheticOutline0.ordinal(10), 1, 0, CameraSelector$$ExternalSyntheticOutline0.ordinal(5), iArr, null, null) < 0) {
            throw new BufferOverflowException();
        }
    }
}
