package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes.dex */
public final class EciesAeadHkdfPrivateKey extends GeneratedMessageLite {
    private static final EciesAeadHkdfPrivateKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private ByteString keyValue_ = ByteString.EMPTY;
    private EciesAeadHkdfPublicKey publicKey_;
    private int version_;

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
        EciesAeadHkdfPrivateKey eciesAeadHkdfPrivateKey = new EciesAeadHkdfPrivateKey();
        DEFAULT_INSTANCE = eciesAeadHkdfPrivateKey;
        GeneratedMessageLite.registerDefaultInstance(EciesAeadHkdfPrivateKey.class, eciesAeadHkdfPrivateKey);
    }

    public static void access$300(EciesAeadHkdfPrivateKey eciesAeadHkdfPrivateKey, EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey) {
        eciesAeadHkdfPrivateKey.getClass();
        eciesAeadHkdfPrivateKey.publicKey_ = eciesAeadHkdfPublicKey;
        eciesAeadHkdfPrivateKey.bitField0_ |= 1;
    }

    public static void access$600(EciesAeadHkdfPrivateKey eciesAeadHkdfPrivateKey, ByteString.LiteralByteString literalByteString) {
        eciesAeadHkdfPrivateKey.getClass();
        eciesAeadHkdfPrivateKey.keyValue_ = literalByteString;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EciesAeadHkdfPrivateKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (EciesAeadHkdfPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
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
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "publicKey_", "keyValue_"});
        }
        if (ordinal == 3) {
            return new EciesAeadHkdfPrivateKey();
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
        synchronized (EciesAeadHkdfPrivateKey.class) {
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

    public final EciesAeadHkdfPublicKey getPublicKey() {
        EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey = this.publicKey_;
        return eciesAeadHkdfPublicKey == null ? EciesAeadHkdfPublicKey.getDefaultInstance() : eciesAeadHkdfPublicKey;
    }

    public final int getVersion() {
        return this.version_;
    }
}
