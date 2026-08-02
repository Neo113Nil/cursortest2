package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes.dex */
public final class AesCmacKey extends GeneratedMessageLite {
    private static final AesCmacKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private ByteString keyValue_ = ByteString.EMPTY;
    private AesCmacParams params_;
    private int version_;

    /* loaded from: classes4.dex */
    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public Builder() {
            super(AesCmacKey.DEFAULT_INSTANCE);
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final void setKeyValue(ByteString.LiteralByteString literalByteString) {
            copyOnWrite();
            AesCmacKey.access$300((AesCmacKey) this.instance, literalByteString);
        }

        public final void setParams(AesCmacParams aesCmacParams) {
            copyOnWrite();
            AesCmacKey.access$500((AesCmacKey) this.instance, aesCmacParams);
        }
    }

    static {
        AesCmacKey aesCmacKey = new AesCmacKey();
        DEFAULT_INSTANCE = aesCmacKey;
        GeneratedMessageLite.registerDefaultInstance(AesCmacKey.class, aesCmacKey);
    }

    public static void access$300(AesCmacKey aesCmacKey, ByteString.LiteralByteString literalByteString) {
        aesCmacKey.getClass();
        aesCmacKey.keyValue_ = literalByteString;
    }

    public static void access$500(AesCmacKey aesCmacKey, AesCmacParams aesCmacParams) {
        aesCmacKey.getClass();
        aesCmacKey.params_ = aesCmacParams;
        aesCmacKey.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AesCmacKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AesCmacKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(int i) {
        Parser parser;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "keyValue_", "params_"});
        }
        if (ordinal == 3) {
            return new AesCmacKey();
        }
        if (ordinal == 4) {
            return new Builder();
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
        synchronized (AesCmacKey.class) {
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

    public final ByteString getKeyValue() {
        return this.keyValue_;
    }

    public final AesCmacParams getParams() {
        AesCmacParams aesCmacParams = this.params_;
        return aesCmacParams == null ? AesCmacParams.getDefaultInstance() : aesCmacParams;
    }

    public final int getVersion() {
        return this.version_;
    }
}
