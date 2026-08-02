package com.google.crypto.tink.internal;

import com.google.crypto.tink.util.Bytes;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class OutputPrefixUtil {
    public static final Bytes EMPTY_PREFIX = Bytes.copyFrom(new byte[0]);

    public static final Bytes getLegacyOutputPrefix(int i) {
        return Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final Bytes getTinkOutputPrefix(int i) {
        return Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
