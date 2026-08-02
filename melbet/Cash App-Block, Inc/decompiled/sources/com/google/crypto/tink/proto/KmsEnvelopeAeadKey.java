package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes.dex */
public final class KmsEnvelopeAeadKey extends GeneratedMessageLite {
    private static final KmsEnvelopeAeadKey DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private KmsEnvelopeAeadKeyFormat params_;
    private int version_;

    /* loaded from: classes4.dex */
    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public Builder() {
            super(KmsEnvelopeAeadKey.DEFAULT_INSTANCE);
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final void setParams(KmsEnvelopeAeadKeyFormat kmsEnvelopeAeadKeyFormat) {
            copyOnWrite();
            KmsEnvelopeAeadKey.access$300((KmsEnvelopeAeadKey) this.instance, kmsEnvelopeAeadKeyFormat);
        }
    }

    static {
        KmsEnvelopeAeadKey kmsEnvelopeAeadKey = new KmsEnvelopeAeadKey();
        DEFAULT_INSTANCE = kmsEnvelopeAeadKey;
        GeneratedMessageLite.registerDefaultInstance(KmsEnvelopeAeadKey.class, kmsEnvelopeAeadKey);
    }

    public static void access$300(KmsEnvelopeAeadKey kmsEnvelopeAeadKey, KmsEnvelopeAeadKeyFormat kmsEnvelopeAeadKeyFormat) {
        kmsEnvelopeAeadKey.getClass();
        kmsEnvelopeAeadKey.params_ = kmsEnvelopeAeadKeyFormat;
        kmsEnvelopeAeadKey.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static KmsEnvelopeAeadKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (KmsEnvelopeAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
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
            return new KmsEnvelopeAeadKey();
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
        synchronized (KmsEnvelopeAeadKey.class) {
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

    public final KmsEnvelopeAeadKeyFormat getParams() {
        KmsEnvelopeAeadKeyFormat kmsEnvelopeAeadKeyFormat = this.params_;
        return kmsEnvelopeAeadKeyFormat == null ? KmsEnvelopeAeadKeyFormat.getDefaultInstance() : kmsEnvelopeAeadKeyFormat;
    }

    public final int getVersion() {
        return this.version_;
    }
}
