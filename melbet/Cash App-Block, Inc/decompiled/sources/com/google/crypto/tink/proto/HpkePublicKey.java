package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes.dex */
public final class HpkePublicKey extends GeneratedMessageLite {
    private static final HpkePublicKey DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private HpkeParams params_;
    private ByteString publicKey_ = ByteString.EMPTY;
    private int version_;

    /* loaded from: classes4.dex */
    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public Builder() {
            super(HpkePublicKey.DEFAULT_INSTANCE);
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final void setParams$1(HpkeParams hpkeParams) {
            copyOnWrite();
            HpkePublicKey.access$300((HpkePublicKey) this.instance, hpkeParams);
        }

        public final void setPublicKey(ByteString.LiteralByteString literalByteString) {
            copyOnWrite();
            HpkePublicKey.access$600((HpkePublicKey) this.instance, literalByteString);
        }

        public final void setVersion$2() {
            copyOnWrite();
            ((HpkePublicKey) this.instance).version_ = 0;
        }
    }

    static {
        HpkePublicKey hpkePublicKey = new HpkePublicKey();
        DEFAULT_INSTANCE = hpkePublicKey;
        GeneratedMessageLite.registerDefaultInstance(HpkePublicKey.class, hpkePublicKey);
    }

    public static void access$300(HpkePublicKey hpkePublicKey, HpkeParams hpkeParams) {
        hpkePublicKey.getClass();
        hpkePublicKey.params_ = hpkeParams;
        hpkePublicKey.bitField0_ |= 1;
    }

    public static void access$600(HpkePublicKey hpkePublicKey, ByteString.LiteralByteString literalByteString) {
        hpkePublicKey.getClass();
        hpkePublicKey.publicKey_ = literalByteString;
    }

    public static HpkePublicKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static HpkePublicKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (HpkePublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
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
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "publicKey_"});
        }
        if (ordinal == 3) {
            return new HpkePublicKey();
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
        synchronized (HpkePublicKey.class) {
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

    public final HpkeParams getParams() {
        HpkeParams hpkeParams = this.params_;
        return hpkeParams == null ? HpkeParams.getDefaultInstance() : hpkeParams;
    }

    public final ByteString getPublicKey() {
        return this.publicKey_;
    }

    public final int getVersion() {
        return this.version_;
    }
}
