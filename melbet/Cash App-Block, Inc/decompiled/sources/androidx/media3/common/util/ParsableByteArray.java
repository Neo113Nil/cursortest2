package androidx.media3.common.util;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.extractor.Id3Peeker$$ExternalSyntheticBUOutline0;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class ParsableByteArray {
    public static final char[] CR_AND_LF = {'\r', '\n'};
    public static final char[] LF = {'\n'};
    public static final ImmutableSet SUPPORTED_CHARSETS_FOR_READLINE = ImmutableSet.construct(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public static final AtomicBoolean shouldEnforceLimitOnLegacyMethods = new AtomicBoolean();
    public byte[] data;
    public int limit;
    public int position;

    public ParsableByteArray(int i) {
        this.data = new byte[i];
        this.limit = i;
    }

    public static int decodeUtf8CodeUnit(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return CompositeException.WrappedPrintStream.fromBytes((byte) 0, UnsignedBytes.checkedCast(((i & 7) << 2) | ((i2 & 48) >> 4)), UnsignedBytes.checkedCast(((((byte) i2) & 15) << 4) | ((b & 60) >> 2)), UnsignedBytes.checkedCast(((b & 3) << 6) | (((byte) i4) & 63)));
    }

    public static int getSmallestCodeUnitSize(Charset charset) {
        Trace.checkArgument("Unsupported charset: %s", charset, SUPPORTED_CHARSETS_FOR_READLINE.contains(charset));
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean isUtf8ContinuationByte(byte b) {
        return (b & 192) == 128;
    }

    public final int bytesLeft() {
        return Math.max(this.limit - this.position, 0);
    }

    public final void ensureCapacity(int i) {
        byte[] bArr = this.data;
        if (i > bArr.length) {
            this.data = Arrays.copyOf(bArr, i);
        }
    }

    public final void maybeAssertAtLeastBytesLeftForLegacyMethod(int i) {
        if (!shouldEnforceLimitOnLegacyMethods.get() || bytesLeft() >= i) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m(bytesLeft(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "bytesNeeded= ", ", bytesLeft="));
    }

    public final char peekChar(int i, ByteOrder byteOrder) {
        byte b;
        byte b2;
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.data;
        int i2 = this.position;
        if (byteOrder == byteOrder2) {
            int i3 = i2 + i;
            b = bArr[i3];
            b2 = bArr[i3 + 1];
        } else {
            int i4 = i2 + i;
            b = bArr[i4 + 1];
            b2 = bArr[i4];
        }
        return (char) ((b2 & 255) | (b << 8));
    }

    public final int peekCodePointAndSize(Charset charset) {
        int i;
        Trace.checkArgument("Unsupported charset: %s", charset, SUPPORTED_CHARSETS_FOR_READLINE.contains(charset));
        if (bytesLeft() < getSmallestCodeUnitSize(charset)) {
            Id3Peeker$$ExternalSyntheticBUOutline0.m(this.position, this.limit);
            return 0;
        }
        int i2 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.data[this.position];
            if ((b & 128) == 0) {
                i = Byte.toUnsignedInt(b);
                return (i << 8) | i2;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.data[this.position];
            int i3 = (b2 & 128) == 0 ? 1 : ((b2 & 224) == 192 && bytesLeft() >= 2 && isUtf8ContinuationByte(this.data[this.position + 1])) ? 2 : ((this.data[this.position] & 240) == 224 && bytesLeft() >= 3 && isUtf8ContinuationByte(this.data[this.position + 1]) && isUtf8ContinuationByte(this.data[this.position + 2])) ? 3 : ((this.data[this.position] & 248) == 240 && bytesLeft() >= 4 && isUtf8ContinuationByte(this.data[this.position + 1]) && isUtf8ContinuationByte(this.data[this.position + 2]) && isUtf8ContinuationByte(this.data[this.position + 3])) ? 4 : 0;
            if (i3 == 1) {
                i = Byte.toUnsignedInt(this.data[this.position]);
            } else if (i3 == 2) {
                byte[] bArr = this.data;
                int i4 = this.position;
                i = decodeUtf8CodeUnit(0, 0, bArr[i4], bArr[i4 + 1]);
            } else {
                if (i3 != 3) {
                    if (i3 == 4) {
                        byte[] bArr2 = this.data;
                        int i5 = this.position;
                        i = decodeUtf8CodeUnit(bArr2[i5], bArr2[i5 + 1], bArr2[i5 + 2], bArr2[i5 + 3]);
                    }
                    return 0;
                }
                byte[] bArr3 = this.data;
                int i6 = this.position;
                i = decodeUtf8CodeUnit(0, bArr3[i6] & 15, bArr3[i6 + 1], bArr3[i6 + 2]);
            }
            i2 = i3;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char peekChar = peekChar(0, byteOrder);
            if (!Character.isHighSurrogate(peekChar) || bytesLeft() < 4) {
                i = peekChar;
                i2 = 2;
            } else {
                i = Character.toCodePoint(peekChar, peekChar(2, byteOrder));
                i2 = 4;
            }
        }
        return (i << 8) | i2;
    }

    public final int peekInt() {
        if (bytesLeft() < 4) {
            Id3Peeker$$ExternalSyntheticBUOutline0.m(this.position, this.limit);
            return 0;
        }
        int readInt = readInt();
        this.position -= 4;
        return readInt;
    }

    public final int peekUnsignedByte() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(1);
        return this.data[this.position] & 255;
    }

    public final void readBytes(int i, int i2, byte[] bArr) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i2);
        System.arraycopy(this.data, this.position, bArr, i, i2);
        this.position += i2;
    }

    public final char readCharacterIfInList(Charset charset, char[] cArr) {
        int peekCodePointAndSize;
        if (bytesLeft() >= getSmallestCodeUnitSize(charset) && (peekCodePointAndSize = peekCodePointAndSize(charset)) != 0) {
            long j = peekCodePointAndSize >>> 8;
            Trace.checkArgument(j, "out of range: %s", (j >> 32) == 0);
            int i = (int) j;
            if (!Character.isSupplementaryCodePoint(i)) {
                long j2 = i;
                char c = (char) j2;
                Trace.checkArgument(j2, "Out of range: %s", ((long) c) == j2);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.position = CompositeException.WrappedPrintStream.checkedCast(peekCodePointAndSize & 255) + this.position;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int readInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.position = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.position = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.position = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    public final String readLine(Charset charset) {
        int i;
        Trace.checkArgument("Unsupported charset: %s", charset, SUPPORTED_CHARSETS_FOR_READLINE.contains(charset));
        if (bytesLeft() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            readUtfCharsetFromBom();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                OptionalProvider$$ExternalSyntheticLambda0.m((Object) charset, "Unsupported charset: ");
                return null;
            }
            i = 2;
        }
        int i2 = this.position;
        while (true) {
            int i3 = this.limit;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                byte b = this.data[i2];
                String str = Util.DEVICE_DEBUG_INFO;
                if (b != 10) {
                    if (b == 13) {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.data;
                if (bArr[i2] == 0) {
                    byte b2 = bArr[i2 + 1];
                    String str2 = Util.DEVICE_DEBUG_INFO;
                    if (b2 != 10) {
                        if (b2 == 13) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.data;
                if (bArr2[i2 + 1] == 0) {
                    byte b3 = bArr2[i2];
                    String str3 = Util.DEVICE_DEBUG_INFO;
                    if (b3 == 10 || b3 == 13) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            i2 += i;
        }
        String readString = readString(i2 - this.position, charset);
        if (this.position != this.limit && readCharacterIfInList(charset, CR_AND_LF) == '\r') {
            readCharacterIfInList(charset, LF);
        }
        return readString;
    }

    public final int readLittleEndianInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.position = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.position = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.position = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public final long readLittleEndianLong() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(8);
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        this.position = i + 2;
        this.position = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r3] & 255) << 8) | ((bArr[r8] & 255) << 16);
        this.position = i + 4;
        long j2 = j | ((bArr[r5] & 255) << 24);
        this.position = i + 5;
        long j3 = j2 | ((bArr[r8] & 255) << 32);
        this.position = i + 6;
        long j4 = j3 | ((bArr[r5] & 255) << 40);
        this.position = i + 7;
        long j5 = j4 | ((bArr[r8] & 255) << 48);
        this.position = i + 8;
        return ((bArr[r5] & 255) << 56) | j5;
    }

    public final long readLittleEndianUnsignedInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        this.position = i + 2;
        this.position = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r3] & 255) << 8) | ((bArr[r8] & 255) << 16);
        this.position = i + 4;
        return ((bArr[r5] & 255) << 24) | j;
    }

    public final int readLittleEndianUnsignedIntToInt() {
        int readLittleEndianInt = readLittleEndianInt();
        if (readLittleEndianInt >= 0) {
            return readLittleEndianInt;
        }
        a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readLittleEndianInt, "Top bit not zero: "));
        return 0;
    }

    public final int readLittleEndianUnsignedShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & 255;
        this.position = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final long readLong() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(8);
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        this.position = i + 2;
        this.position = i + 3;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r3] & 255) << 48) | ((bArr[r8] & 255) << 40);
        this.position = i + 4;
        long j2 = j | ((bArr[r5] & 255) << 32);
        this.position = i + 5;
        long j3 = j2 | ((bArr[r8] & 255) << 24);
        this.position = i + 6;
        long j4 = j3 | ((bArr[r5] & 255) << 16);
        this.position = i + 7;
        long j5 = j4 | ((bArr[r8] & 255) << 8);
        this.position = i + 8;
        return (bArr[r5] & 255) | j5;
    }

    public final String readNullTerminatedString() {
        if (bytesLeft() == 0) {
            return null;
        }
        int i = this.position;
        while (i < this.limit && this.data[i] != 0) {
            i++;
        }
        byte[] bArr = this.data;
        int i2 = this.position;
        String str = Util.DEVICE_DEBUG_INFO;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.position = i;
        if (i < this.limit) {
            this.position = i + 1;
        }
        return str2;
    }

    public final short readShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.position = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final String readString(int i, Charset charset) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i);
        String str = new String(this.data, this.position, i, charset);
        this.position += i;
        return str;
    }

    public final int readSynchSafeInt() {
        return readUnsignedByte() | (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7);
    }

    public final int readUnsignedByte() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(1);
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & 255;
    }

    public final int readUnsignedFixedPoint1616() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.position = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.position = i + 4;
        return i4;
    }

    public final long readUnsignedInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        this.position = i + 2;
        this.position = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r3] & 255) << 16) | ((bArr[r8] & 255) << 8);
        this.position = i + 4;
        return (bArr[r5] & 255) | j;
    }

    public final int readUnsignedInt24() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(3);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.position = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.position = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public final int readUnsignedIntToInt() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readInt, "Top bit not zero: "));
        return 0;
    }

    public final int readUnsignedLeb128ToInt() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.position == this.limit) {
                a$$ExternalSyntheticBUOutline0.m$1("Attempting to read a byte over the limit.");
                return 0;
            }
            long readUnsignedByte = readUnsignedByte();
            j |= (127 & readUnsignedByte) << (i * 7);
            if ((readUnsignedByte & 128) == 0) {
                break;
            }
        }
        return CompositeException.WrappedPrintStream.checkedCast(j);
    }

    public final long readUnsignedLongToLong() {
        long readLong = readLong();
        if (readLong >= 0) {
            return readLong;
        }
        a$$ExternalSyntheticBUOutline0.m$1(Recorder$$ExternalSyntheticOutline2.m(readLong, "Top bit not zero: "));
        return 0L;
    }

    public final int readUnsignedShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.position = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public final long readUtf8EncodedLong() {
        int i;
        maybeAssertAtLeastBytesLeftForLegacyMethod(1);
        long j = this.data[this.position];
        int i2 = 7;
        while (true) {
            if (i2 < 0) {
                break;
            }
            if (((1 << i2) & j) != 0) {
                i2--;
            } else if (i2 < 6) {
                j &= r6 - 1;
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        i = 0;
        if (i == 0) {
            throw new NumberFormatException(Recorder$$ExternalSyntheticOutline2.m(j, "Invalid UTF-8 sequence first byte: "));
        }
        maybeAssertAtLeastBytesLeftForLegacyMethod(i);
        for (int i3 = 1; i3 < i; i3++) {
            if ((this.data[this.position + i3] & 192) != 128) {
                throw new NumberFormatException(Recorder$$ExternalSyntheticOutline2.m(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | (r4 & 63);
        }
        this.position += i;
        return j;
    }

    public final Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.data;
            int i = this.position;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.position = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (bytesLeft() < 2) {
            return null;
        }
        byte[] bArr2 = this.data;
        int i2 = this.position;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.position = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.position = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void reset(int i) {
        byte[] bArr = this.data;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        reset(i, bArr);
    }

    public final void setLimit(int i) {
        Trace.checkArgument(i >= 0 && i <= this.data.length);
        this.limit = i;
    }

    public final void setPosition(int i) {
        Trace.checkArgument(i >= 0 && i <= this.limit);
        this.position = i;
    }

    public final void skipBytes(int i) {
        setPosition(this.position + i);
    }

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    public final void reset(int i, byte[] bArr) {
        this.data = bArr;
        this.limit = i;
        this.position = 0;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public ParsableByteArray(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
    }

    public final String readNullTerminatedString(int i) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i);
        if (i == 0) {
            return "";
        }
        int i2 = this.position;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.limit || this.data[i3] != 0) ? i : i - 1;
        byte[] bArr = this.data;
        String str = Util.DEVICE_DEBUG_INFO;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.position += i;
        return str2;
    }
}
