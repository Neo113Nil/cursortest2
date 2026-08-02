package com.google.firebase.installations;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes.dex */
public final class RandomFidGenerator {
    public static final byte FID_4BIT_PREFIX = Byte.parseByte("01110000", 2);
    public static final byte REMOVE_PREFIX_MASK = Byte.parseByte("00001111", 2);

    public static String createRandomFid() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array2 = wrap.array();
        byte b = array2[0];
        array2[16] = b;
        array2[0] = (byte) ((b & REMOVE_PREFIX_MASK) | FID_4BIT_PREFIX);
        return new String(Base64.encode(array2, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
