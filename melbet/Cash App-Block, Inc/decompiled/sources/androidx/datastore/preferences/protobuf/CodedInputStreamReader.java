package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.measurement.zzabh;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class CodedInputStreamReader {
    public int endGroupTag;
    public final zzabh input;
    public int nextTag = 0;
    public int tag;

    public CodedInputStreamReader(zzabh zzabhVar) {
        Charset charset = Internal.UTF_8;
        this.input = zzabhVar;
        zzabhVar.zzb = this;
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
        zzabh zzabhVar = this.input;
        int readUInt32 = zzabhVar.readUInt32();
        if (zzabhVar.zza >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int pushLimit = zzabhVar.pushLimit(readUInt32);
        zzabhVar.zza++;
        schema.mergeFrom(obj, this, extensionRegistryLite);
        zzabhVar.checkLastTagWas(0);
        zzabhVar.zza--;
        zzabhVar.popLimit(pushLimit);
    }

    public final void readBoolList(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzabh zzabhVar = this.input;
        if (i == 0) {
            do {
                protobufList.add(Boolean.valueOf(zzabhVar.readBool()));
                if (zzabhVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzabhVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = zzabhVar.getTotalBytesRead() + zzabhVar.readUInt32();
        do {
            protobufList.add(Boolean.valueOf(zzabhVar.readBool()));
        } while (zzabhVar.getTotalBytesRead() < totalBytesRead);
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
            zzabh zzabhVar = this.input;
            if (zzabhVar.isAtEnd()) {
                return;
            } else {
                readTag = zzabhVar.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    public final void readDoubleList(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzabh zzabhVar = this.input;
        if (i == 1) {
            do {
                protobufList.add(Double.valueOf(zzabhVar.readDouble()));
                if (zzabhVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzabhVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt32 = zzabhVar.readUInt32();
        verifyPackedFixed64Length(readUInt32);
        int totalBytesRead = zzabhVar.getTotalBytesRead() + readUInt32;
        do {
            protobufList.add(Double.valueOf(zzabhVar.readDouble()));
        } while (zzabhVar.getTotalBytesRead() < totalBytesRead);
    }

    public final void readEnumList(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzabh zzabhVar = this.input;
        if (i == 0) {
            do {
                protobufList.add(Integer.valueOf(zzabhVar.readEnum()));
                if (zzabhVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzabhVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = zzabhVar.getTotalBytesRead() + zzabhVar.readUInt32();
        do {
            protobufList.add(Integer.valueOf(zzabhVar.readEnum()));
        } while (zzabhVar.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    public final Object readField(WireFormat$FieldType wireFormat$FieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
        int ordinal = wireFormat$FieldType.ordinal();
        zzabh zzabhVar = this.input;
        switch (ordinal) {
            case 0:
                requireWireType(1);
                return Double.valueOf(zzabhVar.readDouble());
            case 1:
                requireWireType(5);
                return Float.valueOf(zzabhVar.readFloat());
            case 2:
                requireWireType(0);
                return Long.valueOf(zzabhVar.readInt64());
            case 3:
                requireWireType(0);
                return Long.valueOf(zzabhVar.readUInt64());
            case 4:
                requireWireType(0);
                return Integer.valueOf(zzabhVar.readInt32());
            case 5:
                requireWireType(1);
                return Long.valueOf(zzabhVar.readFixed64());
            case 6:
                requireWireType(5);
                return Integer.valueOf(zzabhVar.readFixed32());
            case 7:
                requireWireType(0);
                return Boolean.valueOf(zzabhVar.readBool());
            case 8:
                requireWireType(2);
                return zzabhVar.readStringRequireUtf8();
            case 9:
            default:
                a$$ExternalSyntheticBUOutline0.m$3("unsupported field type.");
                return null;
            case 10:
                requireWireType(2);
                Schema schemaFor = Protobuf.INSTANCE.schemaFor(cls);
                GeneratedMessageLite newInstance = schemaFor.newInstance();
                mergeMessageFieldInternal(newInstance, schemaFor, extensionRegistryLite);
                schemaFor.makeImmutable(newInstance);
                return newInstance;
            case 11:
                return readBytes();
            case 12:
                requireWireType(0);
                return Integer.valueOf(zzabhVar.readUInt32());
            case 13:
                requireWireType(0);
                return Integer.valueOf(zzabhVar.readEnum());
            case 14:
                requireWireType(5);
                return Integer.valueOf(zzabhVar.readSFixed32());
            case 15:
                requireWireType(1);
                return Long.valueOf(zzabhVar.readSFixed64());
            case 16:
                requireWireType(0);
                return Integer.valueOf(zzabhVar.readSInt32());
            case 17:
                requireWireType(0);
                return Long.valueOf(zzabhVar.readSInt64());
        }
    }

    public final void readFixed32List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzabh zzabhVar = this.input;
        if (i == 2) {
            int readUInt32 = zzabhVar.readUInt32();
            verifyPackedFixed32Length(readUInt32);
            int totalBytesRead = zzabhVar.getTotalBytesRead() + readUInt32;
            do {
                protobufList.add(Integer.valueOf(zzabhVar.readFixed32()));
            } while (zzabhVar.getTotalBytesRead() < totalBytesRead);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            protobufList.add(Integer.valueOf(zzabhVar.readFixed32()));
            if (zzabhVar.isAtEnd()) {
                return;
            } else {
                readTag = zzabhVar.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    public final void readFixed64List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzabh zzabhVar = this.input;
        if (i == 1) {
            do {
                protobufList.add(Long.valueOf(zzabhVar.readFixed64()));
                if (zzabhVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzabhVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt32 = zzabhVar.readUInt32();
        verifyPackedFixed64Length(readUInt32);
        int totalBytesRead = zzabhVar.getTotalBytesRead() + readUInt32;
        do {
            protobufList.add(Long.valueOf(zzabhVar.readFixed64()));
        } while (zzabhVar.getTotalBytesRead() < totalBytesRead);
    }

    public final void readFloatList(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzabh zzabhVar = this.input;
        if (i == 2) {
            int readUInt32 = zzabhVar.readUInt32();
            verifyPackedFixed32Length(readUInt32);
            int totalBytesRead = zzabhVar.getTotalBytesRead() + readUInt32;
            do {
                protobufList.add(Float.valueOf(zzabhVar.readFloat()));
            } while (zzabhVar.getTotalBytesRead() < totalBytesRead);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            protobufList.add(Float.valueOf(zzabhVar.readFloat()));
            if (zzabhVar.isAtEnd()) {
                return;
            } else {
                readTag = zzabhVar.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    public final void readInt32List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzabh zzabhVar = this.input;
        if (i == 0) {
            do {
                protobufList.add(Integer.valueOf(zzabhVar.readInt32()));
                if (zzabhVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzabhVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = zzabhVar.getTotalBytesRead() + zzabhVar.readUInt32();
        do {
            protobufList.add(Integer.valueOf(zzabhVar.readInt32()));
        } while (zzabhVar.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    public final void readInt64List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzabh zzabhVar = this.input;
        if (i == 0) {
            do {
                protobufList.add(Long.valueOf(zzabhVar.readInt64()));
                if (zzabhVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzabhVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = zzabhVar.getTotalBytesRead() + zzabhVar.readUInt32();
        do {
            protobufList.add(Long.valueOf(zzabhVar.readInt64()));
        } while (zzabhVar.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    public final void readSFixed32List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzabh zzabhVar = this.input;
        if (i == 2) {
            int readUInt32 = zzabhVar.readUInt32();
            verifyPackedFixed32Length(readUInt32);
            int totalBytesRead = zzabhVar.getTotalBytesRead() + readUInt32;
            do {
                protobufList.add(Integer.valueOf(zzabhVar.readSFixed32()));
            } while (zzabhVar.getTotalBytesRead() < totalBytesRead);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            protobufList.add(Integer.valueOf(zzabhVar.readSFixed32()));
            if (zzabhVar.isAtEnd()) {
                return;
            } else {
                readTag = zzabhVar.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    public final void readSFixed64List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzabh zzabhVar = this.input;
        if (i == 1) {
            do {
                protobufList.add(Long.valueOf(zzabhVar.readSFixed64()));
                if (zzabhVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzabhVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt32 = zzabhVar.readUInt32();
        verifyPackedFixed64Length(readUInt32);
        int totalBytesRead = zzabhVar.getTotalBytesRead() + readUInt32;
        do {
            protobufList.add(Long.valueOf(zzabhVar.readSFixed64()));
        } while (zzabhVar.getTotalBytesRead() < totalBytesRead);
    }

    public final void readSInt32List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzabh zzabhVar = this.input;
        if (i == 0) {
            do {
                protobufList.add(Integer.valueOf(zzabhVar.readSInt32()));
                if (zzabhVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzabhVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = zzabhVar.getTotalBytesRead() + zzabhVar.readUInt32();
        do {
            protobufList.add(Integer.valueOf(zzabhVar.readSInt32()));
        } while (zzabhVar.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    public final void readSInt64List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzabh zzabhVar = this.input;
        if (i == 0) {
            do {
                protobufList.add(Long.valueOf(zzabhVar.readSInt64()));
                if (zzabhVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzabhVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = zzabhVar.getTotalBytesRead() + zzabhVar.readUInt32();
        do {
            protobufList.add(Long.valueOf(zzabhVar.readSInt64()));
        } while (zzabhVar.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    public final void readStringListInternal(Internal.ProtobufList protobufList, boolean z) {
        String readString;
        int readTag;
        if ((this.tag & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            zzabh zzabhVar = this.input;
            if (z) {
                requireWireType(2);
                readString = zzabhVar.readStringRequireUtf8();
            } else {
                requireWireType(2);
                readString = zzabhVar.readString();
            }
            protobufList.add(readString);
            if (zzabhVar.isAtEnd()) {
                return;
            } else {
                readTag = zzabhVar.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    public final void readUInt32List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzabh zzabhVar = this.input;
        if (i == 0) {
            do {
                protobufList.add(Integer.valueOf(zzabhVar.readUInt32()));
                if (zzabhVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzabhVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = zzabhVar.getTotalBytesRead() + zzabhVar.readUInt32();
        do {
            protobufList.add(Integer.valueOf(zzabhVar.readUInt32()));
        } while (zzabhVar.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    public final void readUInt64List(Internal.ProtobufList protobufList) {
        int readTag;
        int i = this.tag & 7;
        zzabh zzabhVar = this.input;
        if (i == 0) {
            do {
                protobufList.add(Long.valueOf(zzabhVar.readUInt64()));
                if (zzabhVar.isAtEnd()) {
                    return;
                } else {
                    readTag = zzabhVar.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = zzabhVar.getTotalBytesRead() + zzabhVar.readUInt32();
        do {
            protobufList.add(Long.valueOf(zzabhVar.readUInt64()));
        } while (zzabhVar.getTotalBytesRead() < totalBytesRead);
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

    public final boolean skipField() {
        int i;
        zzabh zzabhVar = this.input;
        if (zzabhVar.isAtEnd() || (i = this.tag) == this.endGroupTag) {
            return false;
        }
        return zzabhVar.skipField(i);
    }
}
