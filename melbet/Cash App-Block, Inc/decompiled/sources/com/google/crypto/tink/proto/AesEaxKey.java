package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes.dex */
public final class AesEaxKey extends GeneratedMessageLite {
    private static final AesEaxKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private ByteString keyValue_ = ByteString.EMPTY;
    private AesEaxParams params_;
    private int version_;

    /* loaded from: classes4.dex */
    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public Builder() {
            super(AesEaxKey.DEFAULT_INSTANCE);
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final void setKeyValue$2(ByteString.LiteralByteString literalByteString) {
            copyOnWrite();
            AesEaxKey.access$600((AesEaxKey) this.instance, literalByteString);
        }

        public final void setParams(AesEaxParams aesEaxParams) {
            copyOnWrite();
            AesEaxKey.access$300((AesEaxKey) this.instance, aesEaxParams);
        }
    }

    static {
        AesEaxKey aesEaxKey = new AesEaxKey();
        DEFAULT_INSTANCE = aesEaxKey;
        GeneratedMessageLite.registerDefaultInstance(AesEaxKey.class, aesEaxKey);
    }

    public static void access$300(AesEaxKey aesEaxKey, AesEaxParams aesEaxParams) {
        aesEaxKey.getClass();
        aesEaxKey.params_ = aesEaxParams;
        aesEaxKey.bitField0_ |= 1;
    }

    public static void access$600(AesEaxKey aesEaxKey, ByteString.LiteralByteString literalByteString) {
        aesEaxKey.getClass();
        aesEaxKey.keyValue_ = literalByteString;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AesEaxKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AesEaxKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
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
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
        }
        if (ordinal == 3) {
            return new AesEaxKey();
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
        synchronized (AesEaxKey.class) {
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

    public final AesEaxParams getParams() {
        AesEaxParams aesEaxParams = this.params_;
        return aesEaxParams == null ? AesEaxParams.getDefaultInstance() : aesEaxParams;
    }

    public final int getVersion() {
        return this.version_;
    }
}
