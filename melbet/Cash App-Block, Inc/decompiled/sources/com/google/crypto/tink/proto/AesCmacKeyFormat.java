package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes4.dex */
public final class AesCmacKeyFormat extends GeneratedMessageLite {
    private static final AesCmacKeyFormat DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    private int bitField0_;
    private int keySize_;
    private AesCmacParams params_;

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final void setKeySize(int i) {
            copyOnWrite();
            ((AesCmacKeyFormat) this.instance).keySize_ = i;
        }

        public final void setParams$1(AesCmacParams aesCmacParams) {
            copyOnWrite();
            AesCmacKeyFormat.access$300((AesCmacKeyFormat) this.instance, aesCmacParams);
        }
    }

    static {
        AesCmacKeyFormat aesCmacKeyFormat = new AesCmacKeyFormat();
        DEFAULT_INSTANCE = aesCmacKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(AesCmacKeyFormat.class, aesCmacKeyFormat);
    }

    public static void access$300(AesCmacKeyFormat aesCmacKeyFormat, AesCmacParams aesCmacParams) {
        aesCmacKeyFormat.getClass();
        aesCmacKeyFormat.params_ = aesCmacParams;
        aesCmacKeyFormat.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AesCmacKeyFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AesCmacKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(int i) {
        Parser parser;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "keySize_", "params_"});
        }
        if (ordinal == 3) {
            return new AesCmacKeyFormat();
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
        synchronized (AesCmacKeyFormat.class) {
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

    public final int getKeySize() {
        return this.keySize_;
    }

    public final AesCmacParams getParams() {
        AesCmacParams aesCmacParams = this.params_;
        return aesCmacParams == null ? AesCmacParams.getDefaultInstance() : aesCmacParams;
    }
}
