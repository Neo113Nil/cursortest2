package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.measurement.zzacv;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.Internal;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CodedInputStreamReader {
    public int endGroupTag;
    public final zzacv input;
    public int nextTag = 0;
    public int tag;

    public CodedInputStreamReader(zzacv zzacvVar) {
        Internal.checkNotNull(zzacvVar, "input");
        this.input = zzacvVar;
        zzacvVar.zzd = this;
    }

    public static void verifyPackedFixed32Length(int i) {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public static void verifyPackedFixed64Length(int i) {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public final int getFieldNumber() {
        int i = this.nextTag;
        if (i != 0) {
            this.tag = i;
            this.nextTag = 0;
        } else {
            this.tag = this.input.readTag();
        }
        int i2 = this.tag;
        if (i2 == 0 || i2 == this.endGroupTag) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final void mergeGroupFieldInternal(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int i = this.endGroupTag;
        this.endGroupTag = ((this.tag >>> 3) << 3) | 4;
        try {
            schema.mergeFrom(obj, this, extensionRegistryLite);
            if (this.tag == this.endGroupTag) {
            } else {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } finally {
            this.endGroupTag = i;
        }
    }

    public final void mergeMessageFieldInternal(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        zzacv zzacvVar = this.input;
        int readRawVarint32 = ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
        if (zzacvVar.zza + 0 >= zzacvVar.zzb) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int pushLimit = zzacvVar.pushLimit(readRawVarint32);
        zzacvVar.zza++;
        schema.mergeFrom(obj, this, extensionRegistryLite);
        CodedInputStream$ArrayDecoder codedInputStream$ArrayDecoder = (CodedInputStream$ArrayDecoder) zzacvVar;
        if (codedInputStream$ArrayDecoder.lastTag != 0) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        zzacvVar.zza--;
        codedInputStream$ArrayDecoder.currentLimit = pushLimit;
        codedInputStream$ArrayDecoder.recomputeBufferSizeAfterLimit();
    }

    public final void readBoolList(Internal.ProtobufList protobufList) {
        int readTag;
        int readTag2;
        boolean z = protobufList instanceof BooleanArrayList;
        int i = this.tag;
        zzacv zzacvVar = this.input;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    protobufList.add(Boolean.valueOf(zzacvVar.readBool()));
                    if (zzacvVar.isAtEnd()) {
                        return;
                    } else {
                        readTag = zzacvVar.readTag();
                    }
                } while (readTag == this.tag);
                this.nextTag = readTag;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = zzacvVar.getTotalBytesRead() + ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
            do {
                protobufList.add(Boolean.valueOf(zzacvVar.readBool()));
            } while (zzacvVar.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                booleanArrayList.addBoolean(zzacvVar.readBool());
                if (zzacvVar.isAtEnd()) {
                    return;
                } else {
                    readTag2 = zzacvVar.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = zzacvVar.getTotalBytesRead() + ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
        do {
            booleanArrayList.addBoolean(zzacvVar.readBool());
        } while (zzacvVar.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    public final ByteString.LiteralByteString readBytes() {
        byte[] bArr;
        requireWireType(2);
        CodedInputStream$ArrayDecoder codedInputStream$ArrayDecoder = (CodedInputStream$ArrayDecoder) this.input;
        byte[] bArr2 = codedInputStream$ArrayDecoder.buffer;
        int readRawVarint32 = codedInputStream$ArrayDecoder.readRawVarint32();
        if (readRawVarint32 > 0) {
            int i = codedInputStream$ArrayDecoder.limit;
            int i2 = codedInputStream$ArrayDecoder.pos;
            if (readRawVarint32 <= i - i2) {
                ByteString.LiteralByteString copyFrom = ByteString.copyFrom(i2, readRawVarint32, bArr2);
                codedInputStream$ArrayDecoder.pos += readRawVarint32;
                return copyFrom;
            }
        }
        if (readRawVarint32 == 0) {
            return ByteString.EMPTY;
        }
        if (readRawVarint32 > 0) {
            int i3 = codedInputStream$ArrayDecoder.limit;
            int i4 = codedInputStream$ArrayDecoder.pos;
            if (readRawVarint32 <= i3 - i4) {
                int i5 = readRawVarint32 + i4;
                codedInputStream$ArrayDecoder.pos = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                ByteString.LiteralByteString literalByteString = ByteString.EMPTY;
                return new ByteString.LiteralByteString(bArr);
            }
        }
        if (readRawVarint32 > 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (readRawVarint32 != 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        bArr = Internal.EMPTY_BYTE_ARRAY;
        ByteString.LiteralByteString literalByteString2 = ByteString.EMPTY;
        return new ByteString.LiteralByteString(bArr);
    }

    public final void readBytesList(Internal.ProtobufList protobufList) {
        int readTag;
        if ((this.tag & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            protobufList.add(readBytes());
            zzacv zzacvVar = this.input;
            if (zzacvVar.isAtEnd()) {
                return;
            } else {
                readTag = zzacvVar.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    public final void readDoubleList(Internal.ProtobufList protobufList) {
        int readTag;
        int readTag2;
        boolean z = protobufList instanceof DoubleArrayList;
        int i = this.tag;
        zzacv zzacvVar = this.input;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    protobufList.add(Double.valueOf(Double.longBitsToDouble(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian64())));
                    if (zzacvVar.isAtEnd()) {
                        return;
                    } else {
                        readTag = zzacvVar.readTag();
                    }
                } while (readTag == this.tag);
                this.nextTag = readTag;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readRawVarint32 = ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
            verifyPackedFixed64Length(readRawVarint32);
            int totalBytesRead = zzacvVar.getTotalBytesRead() + readRawVarint32;
            do {
                protobufList.add(Double.valueOf(Double.longBitsToDouble(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian64())));
            } while (zzacvVar.getTotalBytesRead() < totalBytesRead);
            return;
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                doubleArrayList.addDouble(Double.longBitsToDouble(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian64()));
                if (zzacvVar.isAtEnd()) {
                    return;
                } else {
                    readTag2 = zzacvVar.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readRawVarint322 = ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
        verifyPackedFixed64Length(readRawVarint322);
        int totalBytesRead2 = zzacvVar.getTotalBytesRead() + readRawVarint322;
        do {
            doubleArrayList.addDouble(Double.longBitsToDouble(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian64()));
        } while (zzacvVar.getTotalBytesRead() < totalBytesRead2);
    }

    public final void readEnumList(Internal.ProtobufList protobufList) {
        int readTag;
        int readTag2;
        boolean z = protobufList instanceof IntArrayList;
        int i = this.tag;
        zzacv zzacvVar = this.input;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    protobufList.add(Integer.valueOf(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32()));
                    if (zzacvVar.isAtEnd()) {
                        return;
                    } else {
                        readTag = zzacvVar.readTag();
                    }
                } while (readTag == this.tag);
                this.nextTag = readTag;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = zzacvVar.getTotalBytesRead() + ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
            do {
                protobufList.add(Integer.valueOf(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32()));
            } while (zzacvVar.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                intArrayList.addInt(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32());
                if (zzacvVar.isAtEnd()) {
                    return;
                } else {
                    readTag2 = zzacvVar.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = zzacvVar.getTotalBytesRead() + ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
        do {
            intArrayList.addInt(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32());
        } while (zzacvVar.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    public final void readFixed32List(Internal.ProtobufList protobufList) {
        int readTag;
        int readTag2;
        boolean z = protobufList instanceof IntArrayList;
        int i = this.tag;
        zzacv zzacvVar = this.input;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int readRawVarint32 = ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
                verifyPackedFixed32Length(readRawVarint32);
                int totalBytesRead = zzacvVar.getTotalBytesRead() + readRawVarint32;
                do {
                    protobufList.add(Integer.valueOf(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian32()));
                } while (zzacvVar.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                protobufList.add(Integer.valueOf(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian32()));
                if (zzacvVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzacvVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int i3 = i & 7;
        if (i3 == 2) {
            int readRawVarint322 = ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
            verifyPackedFixed32Length(readRawVarint322);
            int totalBytesRead2 = zzacvVar.getTotalBytesRead() + readRawVarint322;
            do {
                intArrayList.addInt(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian32());
            } while (zzacvVar.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            intArrayList.addInt(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian32());
            if (zzacvVar.isAtEnd()) {
                return;
            } else {
                readTag2 = zzacvVar.readTag();
            }
        } while (readTag2 == this.tag);
        this.nextTag = readTag2;
    }

    public final void readFixed64List(Internal.ProtobufList protobufList) {
        int readTag;
        int readTag2;
        boolean z = protobufList instanceof LongArrayList;
        int i = this.tag;
        zzacv zzacvVar = this.input;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    protobufList.add(Long.valueOf(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian64()));
                    if (zzacvVar.isAtEnd()) {
                        return;
                    } else {
                        readTag = zzacvVar.readTag();
                    }
                } while (readTag == this.tag);
                this.nextTag = readTag;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readRawVarint32 = ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
            verifyPackedFixed64Length(readRawVarint32);
            int totalBytesRead = zzacvVar.getTotalBytesRead() + readRawVarint32;
            do {
                protobufList.add(Long.valueOf(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian64()));
            } while (zzacvVar.getTotalBytesRead() < totalBytesRead);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                longArrayList.addLong(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian64());
                if (zzacvVar.isAtEnd()) {
                    return;
                } else {
                    readTag2 = zzacvVar.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readRawVarint322 = ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
        verifyPackedFixed64Length(readRawVarint322);
        int totalBytesRead2 = zzacvVar.getTotalBytesRead() + readRawVarint322;
        do {
            longArrayList.addLong(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian64());
        } while (zzacvVar.getTotalBytesRead() < totalBytesRead2);
    }

    public final void readFloatList(Internal.ProtobufList protobufList) {
        int readTag;
        int readTag2;
        boolean z = protobufList instanceof FloatArrayList;
        int i = this.tag;
        zzacv zzacvVar = this.input;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int readRawVarint32 = ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
                verifyPackedFixed32Length(readRawVarint32);
                int totalBytesRead = zzacvVar.getTotalBytesRead() + readRawVarint32;
                do {
                    protobufList.add(Float.valueOf(Float.intBitsToFloat(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian32())));
                } while (zzacvVar.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                protobufList.add(Float.valueOf(Float.intBitsToFloat(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian32())));
                if (zzacvVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzacvVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        int i3 = i & 7;
        if (i3 == 2) {
            int readRawVarint322 = ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
            verifyPackedFixed32Length(readRawVarint322);
            int totalBytesRead2 = zzacvVar.getTotalBytesRead() + readRawVarint322;
            do {
                floatArrayList.addFloat(Float.intBitsToFloat(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian32()));
            } while (zzacvVar.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            floatArrayList.addFloat(Float.intBitsToFloat(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian32()));
            if (zzacvVar.isAtEnd()) {
                return;
            } else {
                readTag2 = zzacvVar.readTag();
            }
        } while (readTag2 == this.tag);
        this.nextTag = readTag2;
    }

    public final void readInt32List(Internal.ProtobufList protobufList) {
        int readTag;
        int readTag2;
        boolean z = protobufList instanceof IntArrayList;
        int i = this.tag;
        zzacv zzacvVar = this.input;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    protobufList.add(Integer.valueOf(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32()));
                    if (zzacvVar.isAtEnd()) {
                        return;
                    } else {
                        readTag = zzacvVar.readTag();
                    }
                } while (readTag == this.tag);
                this.nextTag = readTag;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = zzacvVar.getTotalBytesRead() + ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
            do {
                protobufList.add(Integer.valueOf(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32()));
            } while (zzacvVar.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                intArrayList.addInt(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32());
                if (zzacvVar.isAtEnd()) {
                    return;
                } else {
                    readTag2 = zzacvVar.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = zzacvVar.getTotalBytesRead() + ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
        do {
            intArrayList.addInt(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32());
        } while (zzacvVar.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    public final void readInt64List(Internal.ProtobufList protobufList) {
        int readTag;
        int readTag2;
        boolean z = protobufList instanceof LongArrayList;
        int i = this.tag;
        zzacv zzacvVar = this.input;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    protobufList.add(Long.valueOf(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint64()));
                    if (zzacvVar.isAtEnd()) {
                        return;
                    } else {
                        readTag = zzacvVar.readTag();
                    }
                } while (readTag == this.tag);
                this.nextTag = readTag;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = zzacvVar.getTotalBytesRead() + ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
            do {
                protobufList.add(Long.valueOf(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint64()));
            } while (zzacvVar.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                longArrayList.addLong(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint64());
                if (zzacvVar.isAtEnd()) {
                    return;
                } else {
                    readTag2 = zzacvVar.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = zzacvVar.getTotalBytesRead() + ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
        do {
            longArrayList.addLong(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint64());
        } while (zzacvVar.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    public final void readSFixed32List(Internal.ProtobufList protobufList) {
        int readTag;
        int readTag2;
        boolean z = protobufList instanceof IntArrayList;
        int i = this.tag;
        zzacv zzacvVar = this.input;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int readRawVarint32 = ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
                verifyPackedFixed32Length(readRawVarint32);
                int totalBytesRead = zzacvVar.getTotalBytesRead() + readRawVarint32;
                do {
                    protobufList.add(Integer.valueOf(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian32()));
                } while (zzacvVar.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                protobufList.add(Integer.valueOf(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian32()));
                if (zzacvVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzacvVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int i3 = i & 7;
        if (i3 == 2) {
            int readRawVarint322 = ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
            verifyPackedFixed32Length(readRawVarint322);
            int totalBytesRead2 = zzacvVar.getTotalBytesRead() + readRawVarint322;
            do {
                intArrayList.addInt(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian32());
            } while (zzacvVar.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            intArrayList.addInt(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian32());
            if (zzacvVar.isAtEnd()) {
                return;
            } else {
                readTag2 = zzacvVar.readTag();
            }
        } while (readTag2 == this.tag);
        this.nextTag = readTag2;
    }

    public final void readSFixed64List(Internal.ProtobufList protobufList) {
        int readTag;
        int readTag2;
        boolean z = protobufList instanceof LongArrayList;
        int i = this.tag;
        zzacv zzacvVar = this.input;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    protobufList.add(Long.valueOf(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian64()));
                    if (zzacvVar.isAtEnd()) {
                        return;
                    } else {
                        readTag = zzacvVar.readTag();
                    }
                } while (readTag == this.tag);
                this.nextTag = readTag;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readRawVarint32 = ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
            verifyPackedFixed64Length(readRawVarint32);
            int totalBytesRead = zzacvVar.getTotalBytesRead() + readRawVarint32;
            do {
                protobufList.add(Long.valueOf(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian64()));
            } while (zzacvVar.getTotalBytesRead() < totalBytesRead);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                longArrayList.addLong(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian64());
                if (zzacvVar.isAtEnd()) {
                    return;
                } else {
                    readTag2 = zzacvVar.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readRawVarint322 = ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
        verifyPackedFixed64Length(readRawVarint322);
        int totalBytesRead2 = zzacvVar.getTotalBytesRead() + readRawVarint322;
        do {
            longArrayList.addLong(((CodedInputStream$ArrayDecoder) zzacvVar).readRawLittleEndian64());
        } while (zzacvVar.getTotalBytesRead() < totalBytesRead2);
    }

    public final void readSInt32List(Internal.ProtobufList protobufList) {
        int readTag;
        int readTag2;
        boolean z = protobufList instanceof IntArrayList;
        int i = this.tag;
        zzacv zzacvVar = this.input;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    protobufList.add(Integer.valueOf(zzacv.decodeZigZag32(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32())));
                    if (zzacvVar.isAtEnd()) {
                        return;
                    } else {
                        readTag = zzacvVar.readTag();
                    }
                } while (readTag == this.tag);
                this.nextTag = readTag;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = zzacvVar.getTotalBytesRead() + ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
            do {
                protobufList.add(Integer.valueOf(zzacv.decodeZigZag32(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32())));
            } while (zzacvVar.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                intArrayList.addInt(zzacv.decodeZigZag32(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32()));
                if (zzacvVar.isAtEnd()) {
                    return;
                } else {
                    readTag2 = zzacvVar.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = zzacvVar.getTotalBytesRead() + ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
        do {
            intArrayList.addInt(zzacv.decodeZigZag32(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32()));
        } while (zzacvVar.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    public final void readSInt64List(Internal.ProtobufList protobufList) {
        int readTag;
        int readTag2;
        boolean z = protobufList instanceof LongArrayList;
        int i = this.tag;
        zzacv zzacvVar = this.input;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    protobufList.add(Long.valueOf(zzacv.decodeZigZag64(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint64())));
                    if (zzacvVar.isAtEnd()) {
                        return;
                    } else {
                        readTag = zzacvVar.readTag();
                    }
                } while (readTag == this.tag);
                this.nextTag = readTag;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = zzacvVar.getTotalBytesRead() + ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
            do {
                protobufList.add(Long.valueOf(zzacv.decodeZigZag64(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint64())));
            } while (zzacvVar.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                longArrayList.addLong(zzacv.decodeZigZag64(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint64()));
                if (zzacvVar.isAtEnd()) {
                    return;
                } else {
                    readTag2 = zzacvVar.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = zzacvVar.getTotalBytesRead() + ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
        do {
            longArrayList.addLong(zzacv.decodeZigZag64(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint64()));
        } while (zzacvVar.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    public final String readString() {
        requireWireType(2);
        CodedInputStream$ArrayDecoder codedInputStream$ArrayDecoder = (CodedInputStream$ArrayDecoder) this.input;
        int readRawVarint32 = codedInputStream$ArrayDecoder.readRawVarint32();
        if (readRawVarint32 > 0) {
            int i = codedInputStream$ArrayDecoder.limit;
            int i2 = codedInputStream$ArrayDecoder.pos;
            if (readRawVarint32 <= i - i2) {
                String str = new String(codedInputStream$ArrayDecoder.buffer, i2, readRawVarint32, Internal.UTF_8);
                codedInputStream$ArrayDecoder.pos += readRawVarint32;
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

    public final void readStringListInternal(Internal.ProtobufList protobufList, boolean z) {
        int readTag;
        if ((this.tag & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            protobufList.add(z ? readStringRequireUtf8() : readString());
            zzacv zzacvVar = this.input;
            if (zzacvVar.isAtEnd()) {
                return;
            } else {
                readTag = zzacvVar.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    public final String readStringRequireUtf8() {
        requireWireType(2);
        CodedInputStream$ArrayDecoder codedInputStream$ArrayDecoder = (CodedInputStream$ArrayDecoder) this.input;
        int readRawVarint32 = codedInputStream$ArrayDecoder.readRawVarint32();
        if (readRawVarint32 > 0) {
            int i = codedInputStream$ArrayDecoder.limit;
            int i2 = codedInputStream$ArrayDecoder.pos;
            if (readRawVarint32 <= i - i2) {
                String decodeUtf8 = Utf8.processor.decodeUtf8(codedInputStream$ArrayDecoder.buffer, i2, readRawVarint32);
                codedInputStream$ArrayDecoder.pos += readRawVarint32;
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

    public final void readUInt32List(Internal.ProtobufList protobufList) {
        int readTag;
        int readTag2;
        boolean z = protobufList instanceof IntArrayList;
        int i = this.tag;
        zzacv zzacvVar = this.input;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    protobufList.add(Integer.valueOf(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32()));
                    if (zzacvVar.isAtEnd()) {
                        return;
                    } else {
                        readTag = zzacvVar.readTag();
                    }
                } while (readTag == this.tag);
                this.nextTag = readTag;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = zzacvVar.getTotalBytesRead() + ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
            do {
                protobufList.add(Integer.valueOf(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32()));
            } while (zzacvVar.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                intArrayList.addInt(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32());
                if (zzacvVar.isAtEnd()) {
                    return;
                } else {
                    readTag2 = zzacvVar.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = zzacvVar.getTotalBytesRead() + ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
        do {
            intArrayList.addInt(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32());
        } while (zzacvVar.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    public final void readUInt64List(Internal.ProtobufList protobufList) {
        int readTag;
        int readTag2;
        boolean z = protobufList instanceof LongArrayList;
        int i = this.tag;
        zzacv zzacvVar = this.input;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    protobufList.add(Long.valueOf(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint64()));
                    if (zzacvVar.isAtEnd()) {
                        return;
                    } else {
                        readTag = zzacvVar.readTag();
                    }
                } while (readTag == this.tag);
                this.nextTag = readTag;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = zzacvVar.getTotalBytesRead() + ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
            do {
                protobufList.add(Long.valueOf(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint64()));
            } while (zzacvVar.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                longArrayList.addLong(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint64());
                if (zzacvVar.isAtEnd()) {
                    return;
                } else {
                    readTag2 = zzacvVar.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = zzacvVar.getTotalBytesRead() + ((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint32();
        do {
            longArrayList.addLong(((CodedInputStream$ArrayDecoder) zzacvVar).readRawVarint64());
        } while (zzacvVar.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    public final void requirePosition(int i) {
        if (this.input.getTotalBytesRead() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final void requireWireType(int i) {
        if ((this.tag & 7) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }
}
