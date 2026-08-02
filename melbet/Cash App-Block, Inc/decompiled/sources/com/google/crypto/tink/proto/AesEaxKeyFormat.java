package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes4.dex */
public final class AesEaxKeyFormat extends GeneratedMessageLite {
    private static final AesEaxKeyFormat DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private int bitField0_;
    private int keySize_;
    private AesEaxParams params_;

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final void setKeySize$2(int i) {
            copyOnWrite();
            ((AesEaxKeyFormat) this.instance).keySize_ = i;
        }

        public final void setParams$1(AesEaxParams aesEaxParams) {
            copyOnWrite();
            AesEaxKeyFormat.access$100((AesEaxKeyFormat) this.instance, aesEaxParams);
        }
    }

    static {
        AesEaxKeyFormat aesEaxKeyFormat = new AesEaxKeyFormat();
        DEFAULT_INSTANCE = aesEaxKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(AesEaxKeyFormat.class, aesEaxKeyFormat);
    }

    public static void access$100(AesEaxKeyFormat aesEaxKeyFormat, AesEaxParams aesEaxParams) {
        aesEaxKeyFormat.getClass();
        aesEaxKeyFormat.params_ = aesEaxParams;
        aesEaxKeyFormat.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AesEaxKeyFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AesEaxKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(int i) {
        Parser parser;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
        }
        if (ordinal == 3) {
            return new AesEaxKeyFormat();
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
        synchronized (AesEaxKeyFormat.class) {
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

    public final AesEaxParams getParams() {
        AesEaxParams aesEaxParams = this.params_;
        return aesEaxParams == null ? AesEaxParams.getDefaultInstance() : aesEaxParams;
    }
}
