package com.google.android.filament;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/* loaded from: classes4.dex */
final class NioUtils {
    private NioUtils() {
    }

    public static Object getBaseArray(Buffer buffer) {
        if (buffer.hasArray()) {
            return buffer.array();
        }
        return null;
    }

    public static int getBaseArrayOffset(Buffer buffer, int i) {
        if (!buffer.hasArray()) {
            return 0;
        }
        return (buffer.position() + buffer.arrayOffset()) << i;
    }

    public static long getBasePointer(Buffer buffer, long j, int i) {
        if (j != 0) {
            return j + (buffer.position() << i);
        }
        return 0L;
    }

    public static int getBufferType(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            return 0;
        }
        if (buffer instanceof CharBuffer) {
            return 1;
        }
        if (buffer instanceof ShortBuffer) {
            return 2;
        }
        if (buffer instanceof IntBuffer) {
            return 3;
        }
        if (buffer instanceof LongBuffer) {
            return 4;
        }
        return buffer instanceof FloatBuffer ? 5 : 6;
    }
}
