package androidx.glance.appwidget.protobuf;

import androidx.glance.appwidget.protobuf.Internal;
import com.google.android.gms.internal.time.zzgv;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class CodedInputStreamReader {
    public int endGroupTag;
    public final zzgv input;
    public int nextTag = 0;
    public int tag;

    public CodedInputStreamReader(zzgv zzgvVar) {
        Charset charset = Internal.UTF_8;
        this.input = zzgvVar;
        zzgvVar.zzb = this;
    }

    public static void verifyPackedFixed32Length(int i) {
        if ((i & 3) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
    }

    public static void verifyPackedFixed64Length(int i) {
        if ((i & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
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
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
        } finally {
            this.endGroupTag = i;
        }
    }

    public final void mergeMessageFieldInternal(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        zzgv zzgvVar = this.input;
        int readUInt32 = zzgvVar.readUInt32();
        if (zzgvVar.zza >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int pushLimit = zzgvVar.pushLimit(readUInt32);
        zzgvVar.zza++;
        schema.mergeFrom(obj, this, extensionRegistryLite);
        zzgvVar.checkLastTagWas(0);
        zzgvVar.zza--;
        zzgvVar.popLimit(pushLimit);
    }

    public final void readBoolList(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzgv zzgvVar = this.input;
        if (i == 0) {
            do {
                protobufList.add(Boolean.valueOf(zzgvVar.readBool()));
                if (zzgvVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzgvVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = zzgvVar.getTotalBytesRead() + zzgvVar.readUInt32();
        do {
            protobufList.add(Boolean.valueOf(zzgvVar.readBool()));
        } while (zzgvVar.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    public final ByteString$LiteralByteString readBytes() {
        requireWireType(2);
        return this.input.readBytes();
    }

    public final void readBytesList(Internal.ProtobufList protobufList) {
        int readTag;
        if ((this.tag & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            protobufList.add(readBytes());
            zzgv zzgvVar = this.input;
            if (zzgvVar.isAtEnd()) {
                return;
            } else {
                readTag = zzgvVar.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    public final void readDoubleList(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzgv zzgvVar = this.input;
        if (i == 1) {
            do {
                protobufList.add(Double.valueOf(zzgvVar.readDouble()));
                if (zzgvVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzgvVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt32 = zzgvVar.readUInt32();
        verifyPackedFixed64Length(readUInt32);
        int totalBytesRead = zzgvVar.getTotalBytesRead() + readUInt32;
        do {
            protobufList.add(Double.valueOf(zzgvVar.readDouble()));
        } while (zzgvVar.getTotalBytesRead() < totalBytesRead);
    }

    public final void readEnumList(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzgv zzgvVar = this.input;
        if (i == 0) {
            do {
                protobufList.add(Integer.valueOf(zzgvVar.readEnum()));
                if (zzgvVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzgvVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = zzgvVar.getTotalBytesRead() + zzgvVar.readUInt32();
        do {
            protobufList.add(Integer.valueOf(zzgvVar.readEnum()));
        } while (zzgvVar.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    public final void readFixed32List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzgv zzgvVar = this.input;
        if (i == 2) {
            int readUInt32 = zzgvVar.readUInt32();
            verifyPackedFixed32Length(readUInt32);
            int totalBytesRead = zzgvVar.getTotalBytesRead() + readUInt32;
            do {
                protobufList.add(Integer.valueOf(zzgvVar.readFixed32()));
            } while (zzgvVar.getTotalBytesRead() < totalBytesRead);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            protobufList.add(Integer.valueOf(zzgvVar.readFixed32()));
            if (zzgvVar.isAtEnd()) {
                return;
            } else {
                readTag = zzgvVar.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    public final void readFixed64List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzgv zzgvVar = this.input;
        if (i == 1) {
            do {
                protobufList.add(Long.valueOf(zzgvVar.readFixed64()));
                if (zzgvVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzgvVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt32 = zzgvVar.readUInt32();
        verifyPackedFixed64Length(readUInt32);
        int totalBytesRead = zzgvVar.getTotalBytesRead() + readUInt32;
        do {
            protobufList.add(Long.valueOf(zzgvVar.readFixed64()));
        } while (zzgvVar.getTotalBytesRead() < totalBytesRead);
    }

    public final void readFloatList(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzgv zzgvVar = this.input;
        if (i == 2) {
            int readUInt32 = zzgvVar.readUInt32();
            verifyPackedFixed32Length(readUInt32);
            int totalBytesRead = zzgvVar.getTotalBytesRead() + readUInt32;
            do {
                protobufList.add(Float.valueOf(zzgvVar.readFloat()));
            } while (zzgvVar.getTotalBytesRead() < totalBytesRead);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            protobufList.add(Float.valueOf(zzgvVar.readFloat()));
            if (zzgvVar.isAtEnd()) {
                return;
            } else {
                readTag = zzgvVar.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    public final void readInt32List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzgv zzgvVar = this.input;
        if (i == 0) {
            do {
                protobufList.add(Integer.valueOf(zzgvVar.readInt32()));
                if (zzgvVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzgvVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = zzgvVar.getTotalBytesRead() + zzgvVar.readUInt32();
        do {
            protobufList.add(Integer.valueOf(zzgvVar.readInt32()));
        } while (zzgvVar.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    public final void readInt64List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzgv zzgvVar = this.input;
        if (i == 0) {
            do {
                protobufList.add(Long.valueOf(zzgvVar.readInt64()));
                if (zzgvVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzgvVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = zzgvVar.getTotalBytesRead() + zzgvVar.readUInt32();
        do {
            protobufList.add(Long.valueOf(zzgvVar.readInt64()));
        } while (zzgvVar.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    public final void readSFixed32List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzgv zzgvVar = this.input;
        if (i == 2) {
            int readUInt32 = zzgvVar.readUInt32();
            verifyPackedFixed32Length(readUInt32);
            int totalBytesRead = zzgvVar.getTotalBytesRead() + readUInt32;
            do {
                protobufList.add(Integer.valueOf(zzgvVar.readSFixed32()));
            } while (zzgvVar.getTotalBytesRead() < totalBytesRead);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            protobufList.add(Integer.valueOf(zzgvVar.readSFixed32()));
            if (zzgvVar.isAtEnd()) {
                return;
            } else {
                readTag = zzgvVar.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    public final void readSFixed64List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzgv zzgvVar = this.input;
        if (i == 1) {
            do {
                protobufList.add(Long.valueOf(zzgvVar.readSFixed64()));
                if (zzgvVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzgvVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt32 = zzgvVar.readUInt32();
        verifyPackedFixed64Length(readUInt32);
        int totalBytesRead = zzgvVar.getTotalBytesRead() + readUInt32;
        do {
            protobufList.add(Long.valueOf(zzgvVar.readSFixed64()));
        } while (zzgvVar.getTotalBytesRead() < totalBytesRead);
    }

    public final void readSInt32List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzgv zzgvVar = this.input;
        if (i == 0) {
            do {
                protobufList.add(Integer.valueOf(zzgvVar.readSInt32()));
                if (zzgvVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzgvVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = zzgvVar.getTotalBytesRead() + zzgvVar.readUInt32();
        do {
            protobufList.add(Integer.valueOf(zzgvVar.readSInt32()));
        } while (zzgvVar.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    public final void readSInt64List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzgv zzgvVar = this.input;
        if (i == 0) {
            do {
                protobufList.add(Long.valueOf(zzgvVar.readSInt64()));
                if (zzgvVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzgvVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = zzgvVar.getTotalBytesRead() + zzgvVar.readUInt32();
        do {
            protobufList.add(Long.valueOf(zzgvVar.readSInt64()));
        } while (zzgvVar.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    public final void readStringListInternal(Internal.ProtobufList protobufList, boolean z) {
        String readString;
        int readTag;
        if ((this.tag & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            zzgv zzgvVar = this.input;
            if (z) {
                requireWireType(2);
                readString = zzgvVar.readStringRequireUtf8();
            } else {
                requireWireType(2);
                readString = zzgvVar.readString();
            }
            protobufList.add(readString);
            if (zzgvVar.isAtEnd()) {
                return;
            } else {
                readTag = zzgvVar.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    public final void readUInt32List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzgv zzgvVar = this.input;
        if (i == 0) {
            do {
                protobufList.add(Integer.valueOf(zzgvVar.readUInt32()));
                if (zzgvVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzgvVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = zzgvVar.getTotalBytesRead() + zzgvVar.readUInt32();
        do {
            protobufList.add(Integer.valueOf(zzgvVar.readUInt32()));
        } while (zzgvVar.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    public final void readUInt64List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzgv zzgvVar = this.input;
        if (i == 0) {
            do {
                protobufList.add(Long.valueOf(zzgvVar.readUInt64()));
                if (zzgvVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzgvVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = zzgvVar.getTotalBytesRead() + zzgvVar.readUInt32();
        do {
            protobufList.add(Long.valueOf(zzgvVar.readUInt64()));
        } while (zzgvVar.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
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
