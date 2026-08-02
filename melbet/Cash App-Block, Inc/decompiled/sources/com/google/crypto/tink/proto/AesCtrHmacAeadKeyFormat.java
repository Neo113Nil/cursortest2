package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes4.dex */
public final class AesCtrHmacAeadKeyFormat extends GeneratedMessageLite {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final AesCtrHmacAeadKeyFormat DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    private AesCtrKeyFormat aesCtrKeyFormat_;
    private int bitField0_;
    private HmacKeyFormat hmacKeyFormat_;

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final void setAesCtrKeyFormat(AesCtrKeyFormat aesCtrKeyFormat) {
            copyOnWrite();
            AesCtrHmacAeadKeyFormat.access$100((AesCtrHmacAeadKeyFormat) this.instance, aesCtrKeyFormat);
        }

        public final void setHmacKeyFormat(HmacKeyFormat hmacKeyFormat) {
            copyOnWrite();
            AesCtrHmacAeadKeyFormat.access$400((AesCtrHmacAeadKeyFormat) this.instance, hmacKeyFormat);
        }
    }

    static {
        AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat = new AesCtrHmacAeadKeyFormat();
        DEFAULT_INSTANCE = aesCtrHmacAeadKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(AesCtrHmacAeadKeyFormat.class, aesCtrHmacAeadKeyFormat);
    }

    public static void access$100(AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat, AesCtrKeyFormat aesCtrKeyFormat) {
        aesCtrHmacAeadKeyFormat.getClass();
        aesCtrHmacAeadKeyFormat.aesCtrKeyFormat_ = aesCtrKeyFormat;
        aesCtrHmacAeadKeyFormat.bitField0_ |= 1;
    }

    public static void access$400(AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat, HmacKeyFormat hmacKeyFormat) {
        aesCtrHmacAeadKeyFormat.getClass();
        aesCtrHmacAeadKeyFormat.hmacKeyFormat_ = hmacKeyFormat;
        aesCtrHmacAeadKeyFormat.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(int i) {
        Parser parser;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "aesCtrKeyFormat_", "hmacKeyFormat_"});
        }
        if (ordinal == 3) {
            return new AesCtrHmacAeadKeyFormat();
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
        synchronized (AesCtrHmacAeadKeyFormat.class) {
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

    public final AesCtrKeyFormat getAesCtrKeyFormat() {
        AesCtrKeyFormat aesCtrKeyFormat = this.aesCtrKeyFormat_;
        return aesCtrKeyFormat == null ? AesCtrKeyFormat.getDefaultInstance() : aesCtrKeyFormat;
    }

    public final HmacKeyFormat getHmacKeyFormat() {
        HmacKeyFormat hmacKeyFormat = this.hmacKeyFormat_;
        return hmacKeyFormat == null ? HmacKeyFormat.getDefaultInstance() : hmacKeyFormat;
    }
}
