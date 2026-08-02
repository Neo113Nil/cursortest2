package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes.dex */
public final class EciesAeadHkdfPublicKey extends GeneratedMessageLite {
    private static final EciesAeadHkdfPublicKey DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private int bitField0_;
    private EciesAeadHkdfParams params_;
    private int version_;
    private ByteString x_;
    private ByteString y_;

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
        EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey = new EciesAeadHkdfPublicKey();
        DEFAULT_INSTANCE = eciesAeadHkdfPublicKey;
        GeneratedMessageLite.registerDefaultInstance(EciesAeadHkdfPublicKey.class, eciesAeadHkdfPublicKey);
    }

    public EciesAeadHkdfPublicKey() {
        ByteString.LiteralByteString literalByteString = ByteString.EMPTY;
        this.x_ = literalByteString;
        this.y_ = literalByteString;
    }

    public static void access$300(EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey, EciesAeadHkdfParams eciesAeadHkdfParams) {
        eciesAeadHkdfPublicKey.getClass();
        eciesAeadHkdfPublicKey.params_ = eciesAeadHkdfParams;
        eciesAeadHkdfPublicKey.bitField0_ |= 1;
    }

    public static void access$600(EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey, ByteString.LiteralByteString literalByteString) {
        eciesAeadHkdfPublicKey.getClass();
        eciesAeadHkdfPublicKey.x_ = literalByteString;
    }

    public static void access$800(EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey, ByteString byteString) {
        eciesAeadHkdfPublicKey.getClass();
        byteString.getClass();
        eciesAeadHkdfPublicKey.y_ = byteString;
    }

    public static EciesAeadHkdfPublicKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EciesAeadHkdfPublicKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
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
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"bitField0_", "version_", "params_", "x_", "y_"});
        }
        if (ordinal == 3) {
            return new EciesAeadHkdfPublicKey();
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
        synchronized (EciesAeadHkdfPublicKey.class) {
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

    public final EciesAeadHkdfParams getParams() {
        EciesAeadHkdfParams eciesAeadHkdfParams = this.params_;
        return eciesAeadHkdfParams == null ? EciesAeadHkdfParams.getDefaultInstance() : eciesAeadHkdfParams;
    }

    public final int getVersion() {
        return this.version_;
    }

    public final ByteString getX() {
        return this.x_;
    }

    public final ByteString getY() {
        return this.y_;
    }
}
