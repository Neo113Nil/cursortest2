package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.AbstractProtobufList;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.ProtobufArrayList;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes4.dex */
public final class KeysetInfo extends GeneratedMessageLite {
    private static final KeysetInfo DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private Internal.ProtobufList keyInfo_ = ProtobufArrayList.EMPTY_LIST;
    private int primaryKeyId_;

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public final void addKeyInfo(KeyInfo keyInfo) {
            copyOnWrite();
            KeysetInfo.access$1700((KeysetInfo) this.instance, keyInfo);
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final void setPrimaryKeyId$1(int i) {
            copyOnWrite();
            ((KeysetInfo) this.instance).primaryKeyId_ = i;
        }
    }

    public final class KeyInfo extends GeneratedMessageLite {
        private static final KeyInfo DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile Parser PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            public final /* bridge */ /* synthetic */ Object clone() {
                return clone();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
            public final GeneratedMessageLite getDefaultInstanceForType() {
                return this.defaultInstance;
            }

            public final void setKeyId$1(int i) {
                copyOnWrite();
                ((KeyInfo) this.instance).keyId_ = i;
            }

            public final void setOutputPrefixType$2(OutputPrefixType outputPrefixType) {
                copyOnWrite();
                KeyInfo.access$1000((KeyInfo) this.instance, outputPrefixType);
            }

            public final void setStatus$1(KeyStatusType keyStatusType) {
                copyOnWrite();
                KeyInfo.access$500((KeyInfo) this.instance, keyStatusType);
            }

            public final void setTypeUrl$2(String str) {
                copyOnWrite();
                KeyInfo.access$100((KeyInfo) this.instance, str);
            }
        }

        static {
            KeyInfo keyInfo = new KeyInfo();
            DEFAULT_INSTANCE = keyInfo;
            GeneratedMessageLite.registerDefaultInstance(KeyInfo.class, keyInfo);
        }

        public static void access$100(KeyInfo keyInfo, String str) {
            keyInfo.getClass();
            str.getClass();
            keyInfo.typeUrl_ = str;
        }

        public static void access$1000(KeyInfo keyInfo, OutputPrefixType outputPrefixType) {
            keyInfo.getClass();
            keyInfo.outputPrefixType_ = outputPrefixType.getNumber();
        }

        public static void access$500(KeyInfo keyInfo, KeyStatusType keyStatusType) {
            keyInfo.getClass();
            keyInfo.status_ = keyStatusType.getNumber();
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            }
            if (ordinal == 3) {
                return new KeyInfo();
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
            synchronized (KeyInfo.class) {
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
    }

    static {
        KeysetInfo keysetInfo = new KeysetInfo();
        DEFAULT_INSTANCE = keysetInfo;
        GeneratedMessageLite.registerDefaultInstance(KeysetInfo.class, keysetInfo);
    }

    public static void access$1700(KeysetInfo keysetInfo, KeyInfo keyInfo) {
        keysetInfo.getClass();
        Internal.ProtobufList protobufList = keysetInfo.keyInfo_;
        if (!((AbstractProtobufList) protobufList).isMutable) {
            keysetInfo.keyInfo_ = protobufList.mutableCopyWithCapacity(protobufList.size() * 2);
        }
        keysetInfo.keyInfo_.add(keyInfo);
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
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", KeyInfo.class});
        }
        if (ordinal == 3) {
            return new KeysetInfo();
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
        synchronized (KeysetInfo.class) {
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
}
