package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes.dex */
public final class AesCtrHmacAeadKey extends GeneratedMessageLite {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final AesCtrHmacAeadKey DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AesCtrKey aesCtrKey_;
    private int bitField0_;
    private HmacKey hmacKey_;
    private int version_;

    /* loaded from: classes4.dex */
    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public Builder() {
            super(AesCtrHmacAeadKey.DEFAULT_INSTANCE);
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final void setAesCtrKey(AesCtrKey aesCtrKey) {
            copyOnWrite();
            AesCtrHmacAeadKey.access$300((AesCtrHmacAeadKey) this.instance, aesCtrKey);
        }

        public final void setHmacKey(HmacKey hmacKey) {
            copyOnWrite();
            AesCtrHmacAeadKey.access$600((AesCtrHmacAeadKey) this.instance, hmacKey);
        }
    }

    static {
        AesCtrHmacAeadKey aesCtrHmacAeadKey = new AesCtrHmacAeadKey();
        DEFAULT_INSTANCE = aesCtrHmacAeadKey;
        GeneratedMessageLite.registerDefaultInstance(AesCtrHmacAeadKey.class, aesCtrHmacAeadKey);
    }

    public static void access$300(AesCtrHmacAeadKey aesCtrHmacAeadKey, AesCtrKey aesCtrKey) {
        aesCtrHmacAeadKey.getClass();
        aesCtrHmacAeadKey.aesCtrKey_ = aesCtrKey;
        aesCtrHmacAeadKey.bitField0_ |= 1;
    }

    public static void access$600(AesCtrHmacAeadKey aesCtrHmacAeadKey, HmacKey hmacKey) {
        aesCtrHmacAeadKey.getClass();
        aesCtrHmacAeadKey.hmacKey_ = hmacKey;
        aesCtrHmacAeadKey.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AesCtrHmacAeadKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
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
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "version_", "aesCtrKey_", "hmacKey_"});
        }
        if (ordinal == 3) {
            return new AesCtrHmacAeadKey();
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
        synchronized (AesCtrHmacAeadKey.class) {
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

    public final AesCtrKey getAesCtrKey() {
        AesCtrKey aesCtrKey = this.aesCtrKey_;
        return aesCtrKey == null ? AesCtrKey.getDefaultInstance() : aesCtrKey;
    }

    public final HmacKey getHmacKey() {
        HmacKey hmacKey = this.hmacKey_;
        return hmacKey == null ? HmacKey.getDefaultInstance() : hmacKey;
    }

    public final int getVersion() {
        return this.version_;
    }
}
