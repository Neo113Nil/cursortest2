package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes4.dex */
public final class KmsAeadKeyFormat extends GeneratedMessageLite {
    private static final KmsAeadKeyFormat DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private String keyUri_ = "";

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final void setKeyUri(String str) {
            copyOnWrite();
            KmsAeadKeyFormat.access$100((KmsAeadKeyFormat) this.instance, str);
        }
    }

    static {
        KmsAeadKeyFormat kmsAeadKeyFormat = new KmsAeadKeyFormat();
        DEFAULT_INSTANCE = kmsAeadKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(KmsAeadKeyFormat.class, kmsAeadKeyFormat);
    }

    public static void access$100(KmsAeadKeyFormat kmsAeadKeyFormat, String str) {
        kmsAeadKeyFormat.getClass();
        str.getClass();
        kmsAeadKeyFormat.keyUri_ = str;
    }

    public static KmsAeadKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static KmsAeadKeyFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (KmsAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(int i) {
        Parser parser;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
        }
        if (ordinal == 3) {
            return new KmsAeadKeyFormat();
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
        synchronized (KmsAeadKeyFormat.class) {
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

    public final String getKeyUri() {
        return this.keyUri_;
    }
}
