package androidx.glance.appwidget.protobuf;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.collect.Iterators$7;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public class ByteString$LiteralByteString implements Iterable, Serializable {
    public static final ByteString$LiteralByteString EMPTY = new ByteString$LiteralByteString(Internal.EMPTY_BYTE_ARRAY);
    public static final ByteString$ArraysByteArrayCopier byteArrayCopier;
    public final byte[] bytes;
    public int hash = 0;

    static {
        byteArrayCopier = Android.isOnAndroidDevice() ? new ByteString$ArraysByteArrayCopier(1) : new ByteString$ArraysByteArrayCopier(0);
    }

    public ByteString$LiteralByteString(byte[] bArr) {
        bArr.getClass();
        this.bytes = bArr;
    }

    public static int checkRange(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("Beginning index larger than ending index: ", i, i2, ", "));
            return 0;
        }
        Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("End index: ", i2, i3, " >= "));
        return 0;
    }

    public static ByteString$LiteralByteString copyFrom(int i, int i2, byte[] bArr) {
        byte[] copyOfRange;
        checkRange(i, i + i2, bArr.length);
        switch (byteArrayCopier.$r8$classId) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                copyOfRange = new byte[i2];
                System.arraycopy(bArr, i, copyOfRange, 0, i2);
                break;
        }
        return new ByteString$LiteralByteString(copyOfRange);
    }

    public byte byteAt(int i) {
        return this.bytes[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ByteString$LiteralByteString) && size() == ((ByteString$LiteralByteString) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof ByteString$LiteralByteString)) {
                return obj.equals(this);
            }
            ByteString$LiteralByteString byteString$LiteralByteString = (ByteString$LiteralByteString) obj;
            int i = this.hash;
            int i2 = byteString$LiteralByteString.hash;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > byteString$LiteralByteString.size()) {
                    a$$ExternalSyntheticBUOutline0.m(size, size());
                    return false;
                }
                if (size > byteString$LiteralByteString.size()) {
                    Handlers$$ExternalSyntheticBUOutline0.m(byteString$LiteralByteString.size(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(size, "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = byteString$LiteralByteString.bytes;
                int offsetIntoBytes = getOffsetIntoBytes() + size;
                int offsetIntoBytes2 = getOffsetIntoBytes();
                int offsetIntoBytes3 = byteString$LiteralByteString.getOffsetIntoBytes();
                while (offsetIntoBytes2 < offsetIntoBytes) {
                    if (this.bytes[offsetIntoBytes2] == bArr[offsetIntoBytes3]) {
                        offsetIntoBytes2++;
                        offsetIntoBytes3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int getOffsetIntoBytes() {
        return 0;
    }

    public final int hashCode() {
        int i = this.hash;
        if (i != 0) {
            return i;
        }
        int size = size();
        int offsetIntoBytes = getOffsetIntoBytes();
        int i2 = size;
        for (int i3 = offsetIntoBytes; i3 < offsetIntoBytes + size; i3++) {
            i2 = (i2 * 31) + this.bytes[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.hash = i2;
        return i2;
    }

    public byte internalByteAt(int i) {
        return this.bytes[i];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new Iterators$7(this);
    }

    public int size() {
        return this.bytes.length;
    }

    public final String toString() {
        ByteString$LiteralByteString byteString$LiteralByteString;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = TextFormatEscaper.escapeBytes(this);
        } else {
            final int checkRange = checkRange(0, 47, size());
            if (checkRange == 0) {
                byteString$LiteralByteString = EMPTY;
            } else {
                final byte[] bArr = this.bytes;
                final int offsetIntoBytes = getOffsetIntoBytes();
                byteString$LiteralByteString = new ByteString$LiteralByteString(bArr, offsetIntoBytes, checkRange) { // from class: androidx.glance.appwidget.protobuf.ByteString$BoundedByteString
                    public final int bytesLength;
                    public final int bytesOffset;

                    {
                        super(bArr);
                        ByteString$LiteralByteString.checkRange(offsetIntoBytes, offsetIntoBytes + checkRange, bArr.length);
                        this.bytesOffset = offsetIntoBytes;
                        this.bytesLength = checkRange;
                    }

                    @Override // androidx.glance.appwidget.protobuf.ByteString$LiteralByteString
                    public final byte byteAt(int i) {
                        int i2 = this.bytesLength;
                        if (((i2 - (i + 1)) | i) >= 0) {
                            return this.bytes[this.bytesOffset + i];
                        }
                        if (i < 0) {
                            JWK$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Index < 0: "));
                            return (byte) 0;
                        }
                        JWK$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("Index > length: ", i, i2, ", "));
                        return (byte) 0;
                    }

                    @Override // androidx.glance.appwidget.protobuf.ByteString$LiteralByteString
                    public final int getOffsetIntoBytes() {
                        return this.bytesOffset;
                    }

                    @Override // androidx.glance.appwidget.protobuf.ByteString$LiteralByteString
                    public final byte internalByteAt(int i) {
                        return this.bytes[this.bytesOffset + i];
                    }

                    @Override // androidx.glance.appwidget.protobuf.ByteString$LiteralByteString
                    public final int size() {
                        return this.bytesLength;
                    }
                };
            }
            concat = TextFormatEscaper.escapeBytes(byteString$LiteralByteString).concat("...");
        }
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m("<ByteString@", size, hexString, " size=", " contents=\""), concat, "\">");
    }
}
