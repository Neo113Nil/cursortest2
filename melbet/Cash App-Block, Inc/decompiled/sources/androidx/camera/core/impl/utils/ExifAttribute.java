package androidx.camera.core.impl.utils;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public final class ExifAttribute {
    public final byte[] bytes;

    /* renamed from: format, reason: collision with root package name */
    public final int f845format;
    public final int numberOfComponents;
    public static final Charset ASCII = StandardCharsets.US_ASCII;
    public static final String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] IFD_FORMAT_BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    public ExifAttribute(int i, int i2, byte[] bArr) {
        this.f845format = i;
        this.numberOfComponents = i2;
        this.bytes = bArr;
    }

    public static ExifAttribute createULong(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new ExifAttribute(4, jArr.length, wrap.array());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(IFD_FORMAT_NAMES[this.f845format]);
        sb.append(", data length:");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.bytes.length, ")", sb);
    }

    public static ExifAttribute createULong(long j, ByteOrder byteOrder) {
        return createULong(new long[]{j}, byteOrder);
    }
}
