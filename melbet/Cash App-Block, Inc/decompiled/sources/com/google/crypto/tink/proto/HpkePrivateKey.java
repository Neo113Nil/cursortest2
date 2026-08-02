package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes.dex */
public final class HpkePrivateKey extends GeneratedMessageLite {
    private static final HpkePrivateKey DEFAULT_INSTANCE;
    private static volatile Parser PARSER = null;
    public static final int PRIVATE_KEY_FIELD_NUMBER = 3;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private ByteString privateKey_ = ByteString.EMPTY;
    private HpkePublicKey publicKey_;
    private int version_;

    /* loaded from: classes4.dex */
    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public Builder() {
            super(HpkePrivateKey.DEFAULT_INSTANCE);
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final void setPrivateKey(ByteString.LiteralByteString literalByteString) {
            copyOnWrite();
            HpkePrivateKey.access$600((HpkePrivateKey) this.instance, literalByteString);
        }

        public final void setPublicKey(HpkePublicKey hpkePublicKey) {
            copyOnWrite();
            HpkePrivateKey.access$300((HpkePrivateKey) this.instance, hpkePublicKey);
        }

        public final void setVersion$1() {
            copyOnWrite();
            ((HpkePrivateKey) this.instance).version_ = 0;
        }
    }

    static {
        HpkePrivateKey hpkePrivateKey = new HpkePrivateKey();
        DEFAULT_INSTANCE = hpkePrivateKey;
        GeneratedMessageLite.registerDefaultInstance(HpkePrivateKey.class, hpkePrivateKey);
    }

    public static void access$300(HpkePrivateKey hpkePrivateKey, HpkePublicKey hpkePublicKey) {
        hpkePrivateKey.getClass();
        hpkePrivateKey.publicKey_ = hpkePublicKey;
        hpkePrivateKey.bitField0_ |= 1;
    }

    public static void access$600(HpkePrivateKey hpkePrivateKey, ByteString.LiteralByteString literalByteString) {
        hpkePrivateKey.getClass();
        hpkePrivateKey.privateKey_ = literalByteString;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static HpkePrivateKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (HpkePrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
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
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "publicKey_", "privateKey_"});
        }
        if (ordinal == 3) {
            return new HpkePrivateKey();
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
        synchronized (HpkePrivateKey.class) {
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

    public final ByteString getPrivateKey() {
        return this.privateKey_;
    }

    public final HpkePublicKey getPublicKey() {
        HpkePublicKey hpkePublicKey = this.publicKey_;
        return hpkePublicKey == null ? HpkePublicKey.getDefaultInstance() : hpkePublicKey;
    }

    public final int getVersion() {
        return this.version_;
    }
}
