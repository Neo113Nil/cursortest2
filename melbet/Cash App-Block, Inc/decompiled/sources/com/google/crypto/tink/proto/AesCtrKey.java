package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes4.dex */
public final class AesCtrKey extends GeneratedMessageLite {
    private static final AesCtrKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private ByteString keyValue_ = ByteString.EMPTY;
    private AesCtrParams params_;
    private int version_;

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final void setKeyValue$1(ByteString.LiteralByteString literalByteString) {
            copyOnWrite();
            AesCtrKey.access$600((AesCtrKey) this.instance, literalByteString);
        }

        public final void setParams(AesCtrParams aesCtrParams) {
            copyOnWrite();
            AesCtrKey.access$300((AesCtrKey) this.instance, aesCtrParams);
        }
    }

    static {
        AesCtrKey aesCtrKey = new AesCtrKey();
        DEFAULT_INSTANCE = aesCtrKey;
        GeneratedMessageLite.registerDefaultInstance(AesCtrKey.class, aesCtrKey);
    }

    public static void access$300(AesCtrKey aesCtrKey, AesCtrParams aesCtrParams) {
        aesCtrKey.getClass();
        aesCtrKey.params_ = aesCtrParams;
        aesCtrKey.bitField0_ |= 1;
    }

    public static void access$600(AesCtrKey aesCtrKey, ByteString.LiteralByteString literalByteString) {
        aesCtrKey.getClass();
        aesCtrKey.keyValue_ = literalByteString;
    }

    public static AesCtrKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
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
            return new AesCtrKey();
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
        synchronized (AesCtrKey.class) {
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

    public final AesCtrParams getParams() {
        AesCtrParams aesCtrParams = this.params_;
        return aesCtrParams == null ? AesCtrParams.getDefaultInstance() : aesCtrParams;
    }

    public final int getVersion() {
        return this.version_;
    }
}
