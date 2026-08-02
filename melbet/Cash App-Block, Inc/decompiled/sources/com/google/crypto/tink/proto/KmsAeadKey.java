package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes.dex */
public final class KmsAeadKey extends GeneratedMessageLite {
    private static final KmsAeadKey DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private KmsAeadKeyFormat params_;
    private int version_;

    /* loaded from: classes4.dex */
    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public Builder() {
            super(KmsAeadKey.DEFAULT_INSTANCE);
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final void setParams(KmsAeadKeyFormat kmsAeadKeyFormat) {
            copyOnWrite();
            KmsAeadKey.access$300((KmsAeadKey) this.instance, kmsAeadKeyFormat);
        }
    }

    static {
        KmsAeadKey kmsAeadKey = new KmsAeadKey();
        DEFAULT_INSTANCE = kmsAeadKey;
        GeneratedMessageLite.registerDefaultInstance(KmsAeadKey.class, kmsAeadKey);
    }

    public static void access$300(KmsAeadKey kmsAeadKey, KmsAeadKeyFormat kmsAeadKeyFormat) {
        kmsAeadKey.getClass();
        kmsAeadKey.params_ = kmsAeadKeyFormat;
        kmsAeadKey.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static KmsAeadKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (KmsAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
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
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
        }
        if (ordinal == 3) {
            return new KmsAeadKey();
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
        synchronized (KmsAeadKey.class) {
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

    public final KmsAeadKeyFormat getParams() {
        KmsAeadKeyFormat kmsAeadKeyFormat = this.params_;
        return kmsAeadKeyFormat == null ? KmsAeadKeyFormat.getDefaultInstance() : kmsAeadKeyFormat;
    }

    public final int getVersion() {
        return this.version_;
    }
}
