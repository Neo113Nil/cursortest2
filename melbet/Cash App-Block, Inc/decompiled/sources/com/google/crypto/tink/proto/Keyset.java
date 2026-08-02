package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.AbstractProtobufList;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.ProtobufArrayList;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes.dex */
public final class Keyset extends GeneratedMessageLite {
    private static final Keyset DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private Internal.ProtobufList key_ = ProtobufArrayList.EMPTY_LIST;
    private int primaryKeyId_;

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }
    }

    public final class Key extends GeneratedMessageLite {
        private static final Key DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile Parser PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private int bitField0_;
        private KeyData keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            public final /* bridge */ /* synthetic */ Object clone() {
                return clone();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
            public final GeneratedMessageLite getDefaultInstanceForType() {
                return this.defaultInstance;
            }
        }

        static {
            Key key = new Key();
            DEFAULT_INSTANCE = key;
            GeneratedMessageLite.registerDefaultInstance(Key.class, key);
        }

        public static void access$100(Key key, KeyData keyData) {
            key.getClass();
            key.keyData_ = keyData;
            key.bitField0_ |= 1;
        }

        public static void access$1000(Key key, OutputPrefixType outputPrefixType) {
            key.getClass();
            key.outputPrefixType_ = outputPrefixType.getNumber();
        }

        public static void access$500(Key key, KeyStatusType keyStatusType) {
            key.getClass();
            key.status_ = keyStatusType.getNumber();
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(int i) {
            Parser parser;
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
            }
            if (ordinal == 3) {
                return new Key();
            }
            if (ordinal == 4) {
                return new Builder(DEFAULT_INSTANCE);
            }
            if (ordinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (ordinal != 6) {
                throw null;
            }
            Parser parser2 = PARSER;
            if (parser2 != null) {
                return parser2;
            }
            synchronized (Key.class) {
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
        }

        public final KeyData getKeyData() {
            KeyData keyData = this.keyData_;
            return keyData == null ? KeyData.getDefaultInstance() : keyData;
        }

        public final int getKeyId() {
            return this.keyId_;
        }

        public final OutputPrefixType getOutputPrefixType() {
            OutputPrefixType forNumber = OutputPrefixType.forNumber(this.outputPrefixType_);
            return forNumber == null ? OutputPrefixType.UNRECOGNIZED : forNumber;
        }

        public final KeyStatusType getStatus() {
            int i = this.status_;
            KeyStatusType keyStatusType = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : KeyStatusType.DESTROYED : KeyStatusType.DISABLED : KeyStatusType.ENABLED : KeyStatusType.UNKNOWN_STATUS;
            return keyStatusType == null ? KeyStatusType.UNRECOGNIZED : keyStatusType;
        }

        public final boolean hasKeyData() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    static {
        Keyset keyset = new Keyset();
        DEFAULT_INSTANCE = keyset;
        GeneratedMessageLite.registerDefaultInstance(Keyset.class, keyset);
    }

    public static void access$1700(Keyset keyset, Key key) {
        keyset.getClass();
        Internal.ProtobufList protobufList = keyset.key_;
        if (!((AbstractProtobufList) protobufList).isMutable) {
            keyset.key_ = protobufList.mutableCopyWithCapacity(protobufList.size() * 2);
        }
        keyset.key_.add(key);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Keyset parseFrom(byte[] bArr) {
        GeneratedMessageLite parsePartialFrom = GeneratedMessageLite.parsePartialFrom(DEFAULT_INSTANCE, bArr, bArr.length, ExtensionRegistryLite.getEmptyRegistry());
        GeneratedMessageLite.checkMessageInitialized(parsePartialFrom);
        return (Keyset) parsePartialFrom;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(int i) {
        Parser parser;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", Key.class});
        }
        if (ordinal == 3) {
            return new Keyset();
        }
        if (ordinal == 4) {
            return new Builder(DEFAULT_INSTANCE);
        }
        if (ordinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (ordinal != 6) {
            throw null;
        }
        Parser parser2 = PARSER;
        if (parser2 != null) {
            return parser2;
        }
        synchronized (Keyset.class) {
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
    }

    public final Key getKey(int i) {
        return (Key) this.key_.get(i);
    }

    public final int getKeyCount() {
        return this.key_.size();
    }

    public final Internal.ProtobufList getKeyList() {
        return this.key_;
    }

    public final int getPrimaryKeyId() {
        return this.primaryKeyId_;
    }

    public static Keyset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        GeneratedMessageLite parsePartialFrom = GeneratedMessageLite.parsePartialFrom(DEFAULT_INSTANCE, bArr, bArr.length, extensionRegistryLite);
        GeneratedMessageLite.checkMessageInitialized(parsePartialFrom);
        return (Keyset) parsePartialFrom;
    }
}
