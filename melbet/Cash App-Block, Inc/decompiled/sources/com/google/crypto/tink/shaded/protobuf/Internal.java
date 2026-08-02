package com.google.crypto.tink.shaded.protobuf;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class Internal {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Charset UTF_8;

    public interface EnumLite {
    }

    public interface ProtobufList extends List, RandomAccess {
        ProtobufList mutableCopyWithCapacity(int i);
    }

    static {
        Charset.forName("US-ASCII");
        UTF_8 = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new CodedInputStream$ArrayDecoder(bArr, 0, 0, false).pushLimit(0);
        } catch (InvalidProtocolBufferException e) {
            Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
        }
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$2(str);
    }

    public static int hashLong(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
