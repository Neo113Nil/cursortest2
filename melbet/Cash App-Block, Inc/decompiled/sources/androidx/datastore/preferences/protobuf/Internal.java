package androidx.datastore.preferences.protobuf;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.measurement.zzabh;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class Internal {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Charset UTF_8;

    public interface ProtobufList extends List, RandomAccess {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Charset.forName("US-ASCII");
        UTF_8 = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        final int i = 0;
        final byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        ByteBuffer.wrap(bArr);
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        try {
            new zzabh(bArr, i, objArr, objArr2) { // from class: androidx.datastore.preferences.protobuf.CodedInputStream$ArrayDecoder
                public final byte[] buffer;
                public int bufferSizeAfterLimit;
                public int currentLimit = Integer.MAX_VALUE;
                public int lastTag;
                public int limit;
                public int pos;
                public final int startPos;

                {
                    this.buffer = bArr;
                    this.limit = objArr + i;
                    this.pos = i;
                    this.startPos = i;
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final void checkLastTagWas(int i2) {
                    if (this.lastTag != i2) {
                        throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final int getTotalBytesRead() {
                    return this.pos - this.startPos;
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final boolean isAtEnd() {
                    return this.pos == this.limit;
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final void popLimit(int i2) {
                    this.currentLimit = i2;
                    recomputeBufferSizeAfterLimit();
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final int pushLimit(int i2) {
                    if (i2 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    int totalBytesRead = getTotalBytesRead() + i2;
                    if (totalBytesRead < 0) {
                        throw new InvalidProtocolBufferException("Failed to parse the message.");
                    }
                    int i3 = this.currentLimit;
                    if (totalBytesRead > i3) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.currentLimit = totalBytesRead;
                    recomputeBufferSizeAfterLimit();
                    return i3;
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final boolean readBool() {
                    return readRawVarint64() != 0;
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final ByteString$LiteralByteString readBytes() {
                    byte[] bArr2;
                    int readRawVarint32 = readRawVarint32();
                    byte[] bArr3 = this.buffer;
                    if (readRawVarint32 > 0) {
                        int i2 = this.limit;
                        int i3 = this.pos;
                        if (readRawVarint32 <= i2 - i3) {
                            ByteString$LiteralByteString copyFrom = ByteString$LiteralByteString.copyFrom(i3, readRawVarint32, bArr3);
                            this.pos += readRawVarint32;
                            return copyFrom;
                        }
                    }
                    if (readRawVarint32 == 0) {
                        return ByteString$LiteralByteString.EMPTY;
                    }
                    if (readRawVarint32 > 0) {
                        int i4 = this.limit;
                        int i5 = this.pos;
                        if (readRawVarint32 <= i4 - i5) {
                            int i6 = readRawVarint32 + i5;
                            this.pos = i6;
                            bArr2 = Arrays.copyOfRange(bArr3, i5, i6);
                            ByteString$LiteralByteString byteString$LiteralByteString = ByteString$LiteralByteString.EMPTY;
                            return new ByteString$LiteralByteString(bArr2);
                        }
                    }
                    if (readRawVarint32 > 0) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    if (readRawVarint32 != 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    bArr2 = Internal.EMPTY_BYTE_ARRAY;
                    ByteString$LiteralByteString byteString$LiteralByteString2 = ByteString$LiteralByteString.EMPTY;
                    return new ByteString$LiteralByteString(bArr2);
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final double readDouble() {
                    return Double.longBitsToDouble(readRawLittleEndian64());
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final int readEnum() {
                    return readRawVarint32();
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final int readFixed32() {
                    return readRawLittleEndian32();
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final long readFixed64() {
                    return readRawLittleEndian64();
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final float readFloat() {
                    return Float.intBitsToFloat(readRawLittleEndian32());
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final int readInt32() {
                    return readRawVarint32();
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final long readInt64() {
                    return readRawVarint64();
                }

                public final int readRawLittleEndian32() {
                    int i2 = this.pos;
                    if (this.limit - i2 < 4) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.pos = i2 + 4;
                    byte[] bArr2 = this.buffer;
                    return ((bArr2[i2 + 3] & 255) << 24) | (bArr2[i2] & 255) | ((bArr2[i2 + 1] & 255) << 8) | ((bArr2[i2 + 2] & 255) << 16);
                }

                public final long readRawLittleEndian64() {
                    int i2 = this.pos;
                    if (this.limit - i2 < 8) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.pos = i2 + 8;
                    byte[] bArr2 = this.buffer;
                    return ((bArr2[i2 + 1] & 255) << 8) | (bArr2[i2] & 255) | ((bArr2[i2 + 2] & 255) << 16) | ((bArr2[i2 + 3] & 255) << 24) | ((bArr2[i2 + 4] & 255) << 32) | ((bArr2[i2 + 5] & 255) << 40) | ((bArr2[i2 + 6] & 255) << 48) | ((bArr2[i2 + 7] & 255) << 56);
                }

                public final int readRawVarint32() {
                    int i2;
                    int i3 = this.pos;
                    int i4 = this.limit;
                    if (i4 != i3) {
                        int i5 = i3 + 1;
                        byte[] bArr2 = this.buffer;
                        byte b = bArr2[i3];
                        if (b >= 0) {
                            this.pos = i5;
                            return b;
                        }
                        if (i4 - i5 >= 9) {
                            int i6 = i3 + 2;
                            int i7 = (bArr2[i5] << 7) ^ b;
                            if (i7 < 0) {
                                i2 = i7 ^ (-128);
                            } else {
                                int i8 = i3 + 3;
                                int i9 = (bArr2[i6] << 14) ^ i7;
                                if (i9 >= 0) {
                                    i2 = i9 ^ 16256;
                                } else {
                                    int i10 = i3 + 4;
                                    int i11 = i9 ^ (bArr2[i8] << 21);
                                    if (i11 < 0) {
                                        i2 = (-2080896) ^ i11;
                                    } else {
                                        i8 = i3 + 5;
                                        byte b2 = bArr2[i10];
                                        int i12 = (i11 ^ (b2 << 28)) ^ 266354560;
                                        if (b2 < 0) {
                                            i10 = i3 + 6;
                                            if (bArr2[i8] < 0) {
                                                i8 = i3 + 7;
                                                if (bArr2[i10] < 0) {
                                                    i10 = i3 + 8;
                                                    if (bArr2[i8] < 0) {
                                                        i8 = i3 + 9;
                                                        if (bArr2[i10] < 0) {
                                                            int i13 = i3 + 10;
                                                            if (bArr2[i8] >= 0) {
                                                                i6 = i13;
                                                                i2 = i12;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i2 = i12;
                                        }
                                        i2 = i12;
                                    }
                                    i6 = i10;
                                }
                                i6 = i8;
                            }
                            this.pos = i6;
                            return i2;
                        }
                    }
                    return (int) readRawVarint64SlowPath();
                }

                public final long readRawVarint64() {
                    long j;
                    long j2;
                    long j3;
                    long j4;
                    int i2 = this.pos;
                    int i3 = this.limit;
                    if (i3 != i2) {
                        int i4 = i2 + 1;
                        byte[] bArr2 = this.buffer;
                        byte b = bArr2[i2];
                        if (b >= 0) {
                            this.pos = i4;
                            return b;
                        }
                        if (i3 - i4 >= 9) {
                            int i5 = i2 + 2;
                            int i6 = (bArr2[i4] << 7) ^ b;
                            if (i6 < 0) {
                                j = i6 ^ (-128);
                            } else {
                                int i7 = i2 + 3;
                                int i8 = (bArr2[i5] << 14) ^ i6;
                                if (i8 >= 0) {
                                    j = i8 ^ 16256;
                                    i5 = i7;
                                } else {
                                    int i9 = i2 + 4;
                                    int i10 = i8 ^ (bArr2[i7] << 21);
                                    if (i10 < 0) {
                                        j4 = (-2080896) ^ i10;
                                    } else {
                                        long j5 = i10;
                                        i5 = i2 + 5;
                                        long j6 = j5 ^ (bArr2[i9] << 28);
                                        if (j6 >= 0) {
                                            j3 = 266354560;
                                        } else {
                                            i9 = i2 + 6;
                                            long j7 = j6 ^ (bArr2[i5] << 35);
                                            if (j7 < 0) {
                                                j2 = -34093383808L;
                                            } else {
                                                i5 = i2 + 7;
                                                j6 = j7 ^ (bArr2[i9] << 42);
                                                if (j6 >= 0) {
                                                    j3 = 4363953127296L;
                                                } else {
                                                    i9 = i2 + 8;
                                                    j7 = j6 ^ (bArr2[i5] << 49);
                                                    if (j7 < 0) {
                                                        j2 = -558586000294016L;
                                                    } else {
                                                        i5 = i2 + 9;
                                                        long j8 = (j7 ^ (bArr2[i9] << 56)) ^ 71499008037633920L;
                                                        if (j8 < 0) {
                                                            int i11 = i2 + 10;
                                                            if (bArr2[i5] >= 0) {
                                                                i5 = i11;
                                                            }
                                                        }
                                                        j = j8;
                                                    }
                                                }
                                            }
                                            j4 = j2 ^ j7;
                                        }
                                        j = j3 ^ j6;
                                    }
                                    i5 = i9;
                                    j = j4;
                                }
                            }
                            this.pos = i5;
                            return j;
                        }
                    }
                    return readRawVarint64SlowPath();
                }

                public final long readRawVarint64SlowPath() {
                    long j = 0;
                    for (int i2 = 0; i2 < 64; i2 += 7) {
                        int i3 = this.pos;
                        if (i3 == this.limit) {
                            throw InvalidProtocolBufferException.truncatedMessage();
                        }
                        this.pos = i3 + 1;
                        j |= (r3 & Byte.MAX_VALUE) << i2;
                        if ((this.buffer[i3] & 128) == 0) {
                            return j;
                        }
                    }
                    throw InvalidProtocolBufferException.malformedVarint();
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final int readSFixed32() {
                    return readRawLittleEndian32();
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final long readSFixed64() {
                    return readRawLittleEndian64();
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final int readSInt32() {
                    int readRawVarint32 = readRawVarint32();
                    return (-(readRawVarint32 & 1)) ^ (readRawVarint32 >>> 1);
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final long readSInt64() {
                    long readRawVarint64 = readRawVarint64();
                    return (-(readRawVarint64 & 1)) ^ (readRawVarint64 >>> 1);
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final String readString() {
                    int readRawVarint32 = readRawVarint32();
                    if (readRawVarint32 > 0) {
                        int i2 = this.limit;
                        int i3 = this.pos;
                        if (readRawVarint32 <= i2 - i3) {
                            String str = new String(this.buffer, i3, readRawVarint32, Internal.UTF_8);
                            this.pos += readRawVarint32;
                            return str;
                        }
                    }
                    if (readRawVarint32 == 0) {
                        return "";
                    }
                    if (readRawVarint32 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final String readStringRequireUtf8() {
                    int readRawVarint32 = readRawVarint32();
                    if (readRawVarint32 > 0) {
                        int i2 = this.limit;
                        int i3 = this.pos;
                        if (readRawVarint32 <= i2 - i3) {
                            String decodeUtf8 = Utf8.processor.decodeUtf8(this.buffer, i3, readRawVarint32);
                            this.pos += readRawVarint32;
                            return decodeUtf8;
                        }
                    }
                    if (readRawVarint32 == 0) {
                        return "";
                    }
                    if (readRawVarint32 <= 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final int readTag() {
                    if (isAtEnd()) {
                        this.lastTag = 0;
                        return 0;
                    }
                    int readRawVarint32 = readRawVarint32();
                    this.lastTag = readRawVarint32;
                    if ((readRawVarint32 >>> 3) != 0) {
                        return readRawVarint32;
                    }
                    throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final int readUInt32() {
                    return readRawVarint32();
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final long readUInt64() {
                    return readRawVarint64();
                }

                public final void recomputeBufferSizeAfterLimit() {
                    int i2 = this.limit + this.bufferSizeAfterLimit;
                    this.limit = i2;
                    int i3 = i2 - this.startPos;
                    int i4 = this.currentLimit;
                    if (i3 <= i4) {
                        this.bufferSizeAfterLimit = 0;
                        return;
                    }
                    int i5 = i3 - i4;
                    this.bufferSizeAfterLimit = i5;
                    this.limit = i2 - i5;
                }

                @Override // com.google.android.gms.internal.measurement.zzabh
                public final boolean skipField(int i2) {
                    int i3 = i2 & 7;
                    int i4 = 0;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            skipRawBytes(8);
                            return true;
                        }
                        if (i3 == 2) {
                            skipRawBytes(readRawVarint32());
                            return true;
                        }
                        if (i3 == 3) {
                            skipMessage();
                            checkLastTagWas(((i2 >>> 3) << 3) | 4);
                            return true;
                        }
                        if (i3 == 4) {
                            return false;
                        }
                        if (i3 != 5) {
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        skipRawBytes(4);
                        return true;
                    }
                    int i5 = this.limit - this.pos;
                    byte[] bArr2 = this.buffer;
                    if (i5 >= 10) {
                        while (i4 < 10) {
                            int i6 = this.pos;
                            this.pos = i6 + 1;
                            if (bArr2[i6] < 0) {
                                i4++;
                            }
                        }
                        throw InvalidProtocolBufferException.malformedVarint();
                    }
                    while (i4 < 10) {
                        int i7 = this.pos;
                        if (i7 == this.limit) {
                            throw InvalidProtocolBufferException.truncatedMessage();
                        }
                        this.pos = i7 + 1;
                        if (bArr2[i7] < 0) {
                            i4++;
                        }
                    }
                    throw InvalidProtocolBufferException.malformedVarint();
                    return true;
                }

                public final void skipRawBytes(int i2) {
                    if (i2 >= 0) {
                        int i3 = this.limit;
                        int i4 = this.pos;
                        if (i2 <= i3 - i4) {
                            this.pos = i4 + i2;
                            return;
                        }
                    }
                    if (i2 >= 0) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    throw InvalidProtocolBufferException.negativeSize();
                }
            }.pushLimit(0);
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
