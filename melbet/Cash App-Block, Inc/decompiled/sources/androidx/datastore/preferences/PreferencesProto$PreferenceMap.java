package androidx.datastore.preferences;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.datastore.preferences.protobuf.CodedInputStreamReader;
import androidx.datastore.preferences.protobuf.ExtensionRegistryLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.Parser;
import androidx.datastore.preferences.protobuf.Protobuf;
import androidx.datastore.preferences.protobuf.RawMessageInfo;
import androidx.datastore.preferences.protobuf.Schema;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.WireFormat$FieldType;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.measurement.zzabh;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class PreferencesProto$PreferenceMap extends GeneratedMessageLite {
    private static final PreferencesProto$PreferenceMap DEFAULT_INSTANCE;
    private static volatile Parser PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private MapFieldLite preferences_ = MapFieldLite.EMPTY_MAP_FIELD;

    public final class Builder extends GeneratedMessageLite.Builder {
    }

    public abstract class PreferencesDefaultEntryHolder {
        public static final MapEntryLite defaultEntry = new MapEntryLite(WireFormat$FieldType.STRING, WireFormat$FieldType.MESSAGE, PreferencesProto$Value.getDefaultInstance());
    }

    static {
        PreferencesProto$PreferenceMap preferencesProto$PreferenceMap = new PreferencesProto$PreferenceMap();
        DEFAULT_INSTANCE = preferencesProto$PreferenceMap;
        GeneratedMessageLite.registerDefaultInstance(PreferencesProto$PreferenceMap.class, preferencesProto$PreferenceMap);
    }

    public static MapFieldLite access$100(PreferencesProto$PreferenceMap preferencesProto$PreferenceMap) {
        MapFieldLite mapFieldLite = preferencesProto$PreferenceMap.preferences_;
        if (!mapFieldLite.isMutable) {
            preferencesProto$PreferenceMap.preferences_ = mapFieldLite.mutableCopy();
        }
        return preferencesProto$PreferenceMap.preferences_;
    }

    public static Builder newBuilder() {
        return (Builder) ((GeneratedMessageLite.Builder) DEFAULT_INSTANCE.dynamicMethod(5));
    }

    public static PreferencesProto$PreferenceMap parseFrom(final FileInputStream fileInputStream) {
        PreferencesProto$PreferenceMap preferencesProto$PreferenceMap = DEFAULT_INSTANCE;
        zzabh zzabhVar = new zzabh(fileInputStream) { // from class: androidx.datastore.preferences.protobuf.CodedInputStream$StreamDecoder
            public final byte[] buffer;
            public int bufferSize;
            public int bufferSizeAfterLimit;
            public int currentLimit = Integer.MAX_VALUE;
            public final FileInputStream input;
            public int lastTag;
            public int pos;
            public int totalBytesRetired;

            {
                Charset charset = Internal.UTF_8;
                this.input = fileInputStream;
                this.buffer = new byte[4096];
                this.bufferSize = 0;
                this.pos = 0;
                this.totalBytesRetired = 0;
            }

            @Override // com.google.android.gms.internal.measurement.zzabh
            public final void checkLastTagWas(int i) {
                if (this.lastTag != i) {
                    throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
                }
            }

            @Override // com.google.android.gms.internal.measurement.zzabh
            public final int getTotalBytesRead() {
                return this.totalBytesRetired + this.pos;
            }

            @Override // com.google.android.gms.internal.measurement.zzabh
            public final boolean isAtEnd() {
                return this.pos == this.bufferSize && !tryRefillBuffer(1);
            }

            @Override // com.google.android.gms.internal.measurement.zzabh
            public final void popLimit(int i) {
                this.currentLimit = i;
                recomputeBufferSizeAfterLimit$1();
            }

            @Override // com.google.android.gms.internal.measurement.zzabh
            public final int pushLimit(int i) {
                if (i < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                int i2 = this.totalBytesRetired + this.pos + i;
                if (i2 < 0) {
                    throw new InvalidProtocolBufferException("Failed to parse the message.");
                }
                int i3 = this.currentLimit;
                if (i2 > i3) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.currentLimit = i2;
                recomputeBufferSizeAfterLimit$1();
                return i3;
            }

            @Override // com.google.android.gms.internal.measurement.zzabh
            public final boolean readBool() {
                return readRawVarint64() != 0;
            }

            @Override // com.google.android.gms.internal.measurement.zzabh
            public final ByteString$LiteralByteString readBytes() {
                int readRawVarint32 = readRawVarint32();
                int i = this.bufferSize;
                int i2 = this.pos;
                int i3 = i - i2;
                byte[] bArr = this.buffer;
                if (readRawVarint32 <= i3 && readRawVarint32 > 0) {
                    ByteString$LiteralByteString copyFrom = ByteString$LiteralByteString.copyFrom(i2, readRawVarint32, bArr);
                    this.pos += readRawVarint32;
                    return copyFrom;
                }
                if (readRawVarint32 == 0) {
                    return ByteString$LiteralByteString.EMPTY;
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                byte[] readRawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(readRawVarint32);
                if (readRawBytesSlowPathOneChunk != null) {
                    return ByteString$LiteralByteString.copyFrom(0, readRawBytesSlowPathOneChunk.length, readRawBytesSlowPathOneChunk);
                }
                int i4 = this.pos;
                int i5 = this.bufferSize;
                int i6 = i5 - i4;
                this.totalBytesRetired += i5;
                this.pos = 0;
                this.bufferSize = 0;
                ArrayList readRawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(readRawVarint32 - i6);
                byte[] bArr2 = new byte[readRawVarint32];
                System.arraycopy(bArr, i4, bArr2, 0, i6);
                Iterator it = readRawBytesSlowPathRemainingChunks.iterator();
                while (it.hasNext()) {
                    byte[] bArr3 = (byte[]) it.next();
                    System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
                    i6 += bArr3.length;
                }
                ByteString$LiteralByteString byteString$LiteralByteString = ByteString$LiteralByteString.EMPTY;
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

            public final byte[] readRawBytesSlowPath(int i) {
                byte[] readRawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i);
                if (readRawBytesSlowPathOneChunk != null) {
                    return readRawBytesSlowPathOneChunk;
                }
                int i2 = this.pos;
                int i3 = this.bufferSize;
                int i4 = i3 - i2;
                this.totalBytesRetired += i3;
                this.pos = 0;
                this.bufferSize = 0;
                ArrayList readRawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i - i4);
                byte[] bArr = new byte[i];
                System.arraycopy(this.buffer, i2, bArr, 0, i4);
                Iterator it = readRawBytesSlowPathRemainingChunks.iterator();
                while (it.hasNext()) {
                    byte[] bArr2 = (byte[]) it.next();
                    System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                    i4 += bArr2.length;
                }
                return bArr;
            }

            public final byte[] readRawBytesSlowPathOneChunk(int i) {
                if (i == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                if (i < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                int i2 = this.totalBytesRetired;
                int i3 = this.pos;
                int i4 = i2 + i3 + i;
                if (i4 - Integer.MAX_VALUE > 0) {
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                int i5 = this.currentLimit;
                if (i4 > i5) {
                    skipRawBytes((i5 - i2) - i3);
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                int i6 = this.bufferSize - i3;
                int i7 = i - i6;
                FileInputStream fileInputStream2 = this.input;
                if (i7 >= 4096) {
                    try {
                        if (i7 > fileInputStream2.available()) {
                            return null;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        e.wasThrownFromInputStream = true;
                        throw e;
                    }
                }
                byte[] bArr = new byte[i];
                System.arraycopy(this.buffer, this.pos, bArr, 0, i6);
                this.totalBytesRetired += this.bufferSize;
                this.pos = 0;
                this.bufferSize = 0;
                while (i6 < i) {
                    try {
                        int read = fileInputStream2.read(bArr, i6, i - i6);
                        if (read == -1) {
                            throw InvalidProtocolBufferException.truncatedMessage();
                        }
                        this.totalBytesRetired += read;
                        i6 += read;
                    } catch (InvalidProtocolBufferException e2) {
                        e2.wasThrownFromInputStream = true;
                        throw e2;
                    }
                }
                return bArr;
            }

            public final ArrayList readRawBytesSlowPathRemainingChunks(int i) {
                ArrayList arrayList = new ArrayList();
                while (i > 0) {
                    int min = Math.min(i, 4096);
                    byte[] bArr = new byte[min];
                    int i2 = 0;
                    while (i2 < min) {
                        int read = this.input.read(bArr, i2, min - i2);
                        if (read == -1) {
                            throw InvalidProtocolBufferException.truncatedMessage();
                        }
                        this.totalBytesRetired += read;
                        i2 += read;
                    }
                    i -= min;
                    arrayList.add(bArr);
                }
                return arrayList;
            }

            public final int readRawLittleEndian32() {
                int i = this.pos;
                if (this.bufferSize - i < 4) {
                    refillBuffer(4);
                    i = this.pos;
                }
                this.pos = i + 4;
                byte[] bArr = this.buffer;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }

            public final long readRawLittleEndian64() {
                int i = this.pos;
                if (this.bufferSize - i < 8) {
                    refillBuffer(8);
                    i = this.pos;
                }
                this.pos = i + 8;
                byte[] bArr = this.buffer;
                return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
            }

            public final int readRawVarint32() {
                int i;
                int i2 = this.pos;
                int i3 = this.bufferSize;
                if (i3 != i2) {
                    int i4 = i2 + 1;
                    byte[] bArr = this.buffer;
                    byte b = bArr[i2];
                    if (b >= 0) {
                        this.pos = i4;
                        return b;
                    }
                    if (i3 - i4 >= 9) {
                        int i5 = i2 + 2;
                        int i6 = (bArr[i4] << 7) ^ b;
                        if (i6 < 0) {
                            i = i6 ^ (-128);
                        } else {
                            int i7 = i2 + 3;
                            int i8 = (bArr[i5] << 14) ^ i6;
                            if (i8 >= 0) {
                                i = i8 ^ 16256;
                            } else {
                                int i9 = i2 + 4;
                                int i10 = i8 ^ (bArr[i7] << 21);
                                if (i10 < 0) {
                                    i = (-2080896) ^ i10;
                                } else {
                                    i7 = i2 + 5;
                                    byte b2 = bArr[i9];
                                    int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                    if (b2 < 0) {
                                        i9 = i2 + 6;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 7;
                                            if (bArr[i9] < 0) {
                                                i9 = i2 + 8;
                                                if (bArr[i7] < 0) {
                                                    i7 = i2 + 9;
                                                    if (bArr[i9] < 0) {
                                                        int i12 = i2 + 10;
                                                        if (bArr[i7] >= 0) {
                                                            i5 = i12;
                                                            i = i11;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i = i11;
                                    }
                                    i = i11;
                                }
                                i5 = i9;
                            }
                            i5 = i7;
                        }
                        this.pos = i5;
                        return i;
                    }
                }
                return (int) readRawVarint64SlowPath();
            }

            public final long readRawVarint64() {
                long j;
                long j2;
                long j3;
                long j4;
                int i = this.pos;
                int i2 = this.bufferSize;
                if (i2 != i) {
                    int i3 = i + 1;
                    byte[] bArr = this.buffer;
                    byte b = bArr[i];
                    if (b >= 0) {
                        this.pos = i3;
                        return b;
                    }
                    if (i2 - i3 >= 9) {
                        int i4 = i + 2;
                        int i5 = (bArr[i3] << 7) ^ b;
                        if (i5 < 0) {
                            j = i5 ^ (-128);
                        } else {
                            int i6 = i + 3;
                            int i7 = (bArr[i4] << 14) ^ i5;
                            if (i7 >= 0) {
                                j = i7 ^ 16256;
                                i4 = i6;
                            } else {
                                int i8 = i + 4;
                                int i9 = i7 ^ (bArr[i6] << 21);
                                if (i9 < 0) {
                                    j4 = (-2080896) ^ i9;
                                } else {
                                    long j5 = i9;
                                    i4 = i + 5;
                                    long j6 = j5 ^ (bArr[i8] << 28);
                                    if (j6 >= 0) {
                                        j3 = 266354560;
                                    } else {
                                        i8 = i + 6;
                                        long j7 = j6 ^ (bArr[i4] << 35);
                                        if (j7 < 0) {
                                            j2 = -34093383808L;
                                        } else {
                                            i4 = i + 7;
                                            j6 = j7 ^ (bArr[i8] << 42);
                                            if (j6 >= 0) {
                                                j3 = 4363953127296L;
                                            } else {
                                                i8 = i + 8;
                                                j7 = j6 ^ (bArr[i4] << 49);
                                                if (j7 < 0) {
                                                    j2 = -558586000294016L;
                                                } else {
                                                    i4 = i + 9;
                                                    long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                                    if (j8 < 0) {
                                                        int i10 = i + 10;
                                                        if (bArr[i4] >= 0) {
                                                            i4 = i10;
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
                                i4 = i8;
                                j = j4;
                            }
                        }
                        this.pos = i4;
                        return j;
                    }
                }
                return readRawVarint64SlowPath();
            }

            public final long readRawVarint64SlowPath() {
                long j = 0;
                for (int i = 0; i < 64; i += 7) {
                    if (this.pos == this.bufferSize) {
                        refillBuffer(1);
                    }
                    int i2 = this.pos;
                    this.pos = i2 + 1;
                    j |= (r3 & Byte.MAX_VALUE) << i;
                    if ((this.buffer[i2] & 128) == 0) {
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
                byte[] bArr = this.buffer;
                if (readRawVarint32 > 0) {
                    int i = this.bufferSize;
                    int i2 = this.pos;
                    if (readRawVarint32 <= i - i2) {
                        String str = new String(bArr, i2, readRawVarint32, Internal.UTF_8);
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
                if (readRawVarint32 > this.bufferSize) {
                    return new String(readRawBytesSlowPath(readRawVarint32), Internal.UTF_8);
                }
                refillBuffer(readRawVarint32);
                String str2 = new String(bArr, this.pos, readRawVarint32, Internal.UTF_8);
                this.pos += readRawVarint32;
                return str2;
            }

            @Override // com.google.android.gms.internal.measurement.zzabh
            public final String readStringRequireUtf8() {
                int readRawVarint32 = readRawVarint32();
                int i = this.pos;
                int i2 = this.bufferSize;
                int i3 = i2 - i;
                byte[] bArr = this.buffer;
                if (readRawVarint32 <= i3 && readRawVarint32 > 0) {
                    this.pos = i + readRawVarint32;
                } else {
                    if (readRawVarint32 == 0) {
                        return "";
                    }
                    if (readRawVarint32 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    i = 0;
                    if (readRawVarint32 <= i2) {
                        refillBuffer(readRawVarint32);
                        this.pos = readRawVarint32;
                    } else {
                        bArr = readRawBytesSlowPath(readRawVarint32);
                    }
                }
                return Utf8.processor.decodeUtf8(bArr, i, readRawVarint32);
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

            public final void recomputeBufferSizeAfterLimit$1() {
                int i = this.bufferSize + this.bufferSizeAfterLimit;
                this.bufferSize = i;
                int i2 = this.totalBytesRetired + i;
                int i3 = this.currentLimit;
                if (i2 <= i3) {
                    this.bufferSizeAfterLimit = 0;
                    return;
                }
                int i4 = i2 - i3;
                this.bufferSizeAfterLimit = i4;
                this.bufferSize = i - i4;
            }

            public final void refillBuffer(int i) {
                if (tryRefillBuffer(i)) {
                    return;
                }
                if (i <= (Integer.MAX_VALUE - this.totalBytesRetired) - this.pos) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }

            @Override // com.google.android.gms.internal.measurement.zzabh
            public final boolean skipField(int i) {
                int i2 = i & 7;
                int i3 = 0;
                if (i2 != 0) {
                    if (i2 == 1) {
                        skipRawBytes(8);
                        return true;
                    }
                    if (i2 == 2) {
                        skipRawBytes(readRawVarint32());
                        return true;
                    }
                    if (i2 == 3) {
                        skipMessage();
                        checkLastTagWas(((i >>> 3) << 3) | 4);
                        return true;
                    }
                    if (i2 == 4) {
                        return false;
                    }
                    if (i2 != 5) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    skipRawBytes(4);
                    return true;
                }
                int i4 = this.bufferSize - this.pos;
                byte[] bArr = this.buffer;
                if (i4 >= 10) {
                    while (i3 < 10) {
                        int i5 = this.pos;
                        this.pos = i5 + 1;
                        if (bArr[i5] < 0) {
                            i3++;
                        }
                    }
                    throw InvalidProtocolBufferException.malformedVarint();
                }
                while (i3 < 10) {
                    if (this.pos == this.bufferSize) {
                        refillBuffer(1);
                    }
                    int i6 = this.pos;
                    this.pos = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
                return true;
            }

            public final void skipRawBytes(int i) {
                int i2 = this.bufferSize;
                int i3 = this.pos;
                int i4 = i2 - i3;
                if (i <= i4 && i >= 0) {
                    this.pos = i3 + i;
                    return;
                }
                FileInputStream fileInputStream2 = this.input;
                if (i < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                int i5 = this.totalBytesRetired;
                int i6 = i5 + i3;
                int i7 = i6 + i;
                int i8 = this.currentLimit;
                if (i7 > i8) {
                    skipRawBytes((i8 - i5) - i3);
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired = i6;
                this.bufferSize = 0;
                this.pos = 0;
                while (i4 < i) {
                    long j = i - i4;
                    try {
                        try {
                            long skip = fileInputStream2.skip(j);
                            if (skip < 0 || skip > j) {
                                throw new IllegalStateException(fileInputStream2.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                            if (skip == 0) {
                                break;
                            } else {
                                i4 += (int) skip;
                            }
                        } catch (InvalidProtocolBufferException e) {
                            e.wasThrownFromInputStream = true;
                            throw e;
                        }
                    } catch (Throwable th) {
                        this.totalBytesRetired += i4;
                        recomputeBufferSizeAfterLimit$1();
                        throw th;
                    }
                }
                this.totalBytesRetired += i4;
                recomputeBufferSizeAfterLimit$1();
                if (i4 >= i) {
                    return;
                }
                int i9 = this.bufferSize;
                int i10 = i9 - this.pos;
                this.pos = i9;
                refillBuffer(1);
                while (true) {
                    int i11 = i - i10;
                    int i12 = this.bufferSize;
                    if (i11 <= i12) {
                        this.pos = i11;
                        return;
                    } else {
                        i10 += i12;
                        this.pos = i12;
                        refillBuffer(1);
                    }
                }
            }

            public final boolean tryRefillBuffer(int i) {
                FileInputStream fileInputStream2 = this.input;
                int i2 = this.pos;
                int i3 = i2 + i;
                int i4 = this.bufferSize;
                if (i3 <= i4) {
                    a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "refillBuffer() called when ", " bytes were already available in buffer"));
                    return false;
                }
                int i5 = this.totalBytesRetired;
                if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.currentLimit) {
                    byte[] bArr = this.buffer;
                    if (i2 > 0) {
                        if (i4 > i2) {
                            System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                        }
                        this.totalBytesRetired += i2;
                        this.bufferSize -= i2;
                        this.pos = 0;
                    }
                    int i6 = this.bufferSize;
                    try {
                        int read = fileInputStream2.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.totalBytesRetired) - i6));
                        if (read == 0 || read < -1 || read > bArr.length) {
                            OptionalProvider$$ExternalSyntheticLambda0.m(read, fileInputStream2.getClass());
                            return false;
                        }
                        if (read > 0) {
                            this.bufferSize += read;
                            recomputeBufferSizeAfterLimit$1();
                            if (this.bufferSize >= i) {
                                return true;
                            }
                            return tryRefillBuffer(i);
                        }
                    } catch (InvalidProtocolBufferException e) {
                        e.wasThrownFromInputStream = true;
                        throw e;
                    }
                }
                return false;
            }
        };
        ExtensionRegistryLite emptyRegistry = ExtensionRegistryLite.getEmptyRegistry();
        GeneratedMessageLite newMutableInstance$1 = preferencesProto$PreferenceMap.newMutableInstance$1();
        try {
            Protobuf protobuf = Protobuf.INSTANCE;
            protobuf.getClass();
            Schema schemaFor = protobuf.schemaFor(newMutableInstance$1.getClass());
            CodedInputStreamReader codedInputStreamReader = (CodedInputStreamReader) zzabhVar.zzb;
            if (codedInputStreamReader == null) {
                codedInputStreamReader = new CodedInputStreamReader(zzabhVar);
            }
            schemaFor.mergeFrom(newMutableInstance$1, codedInputStreamReader, emptyRegistry);
            schemaFor.makeImmutable(newMutableInstance$1);
            if (GeneratedMessageLite.isInitialized(newMutableInstance$1, true)) {
                return (PreferencesProto$PreferenceMap) newMutableInstance$1;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (InvalidProtocolBufferException e) {
            if (e.wasThrownFromInputStream) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(int i) {
        Parser parser;
        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", PreferencesDefaultEntryHolder.defaultEntry});
            case 3:
                return new PreferencesProto$PreferenceMap();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (PreferencesProto$PreferenceMap.class) {
                    try {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser();
                            PARSER = parser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return parser;
            default:
                OptionalProvider$$ExternalSyntheticLambda0.m();
                return null;
        }
    }

    public final Map getPreferencesMap() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
