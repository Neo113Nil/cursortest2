package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes4.dex */
public final class KmsEnvelopeAeadKeyFormat extends GeneratedMessageLite {
    private static final KmsEnvelopeAeadKeyFormat DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private int bitField0_;
    private KeyTemplate dekTemplate_;
    private String kekUri_ = "";

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final void setDekTemplate(KeyTemplate keyTemplate) {
            copyOnWrite();
            KmsEnvelopeAeadKeyFormat.access$400((KmsEnvelopeAeadKeyFormat) this.instance, keyTemplate);
        }

        public final void setKekUri(String str) {
            copyOnWrite();
            KmsEnvelopeAeadKeyFormat.access$100((KmsEnvelopeAeadKeyFormat) this.instance, str);
        }
    }

    static {
        KmsEnvelopeAeadKeyFormat kmsEnvelopeAeadKeyFormat = new KmsEnvelopeAeadKeyFormat();
        DEFAULT_INSTANCE = kmsEnvelopeAeadKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(KmsEnvelopeAeadKeyFormat.class, kmsEnvelopeAeadKeyFormat);
    }

    public static void access$100(KmsEnvelopeAeadKeyFormat kmsEnvelopeAeadKeyFormat, String str) {
        kmsEnvelopeAeadKeyFormat.getClass();
        str.getClass();
        kmsEnvelopeAeadKeyFormat.kekUri_ = str;
    }

    public static void access$400(KmsEnvelopeAeadKeyFormat kmsEnvelopeAeadKeyFormat, KeyTemplate keyTemplate) {
        kmsEnvelopeAeadKeyFormat.getClass();
        keyTemplate.getClass();
        kmsEnvelopeAeadKeyFormat.dekTemplate_ = keyTemplate;
        kmsEnvelopeAeadKeyFormat.bitField0_ |= 1;
    }

    public static KmsEnvelopeAeadKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (KmsEnvelopeAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(int i) {
        Parser parser;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "kekUri_", "dekTemplate_"});
        }
        if (ordinal == 3) {
            return new KmsEnvelopeAeadKeyFormat();
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
        synchronized (KmsEnvelopeAeadKeyFormat.class) {
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

    public final KeyTemplate getDekTemplate() {
        KeyTemplate keyTemplate = this.dekTemplate_;
        return keyTemplate == null ? KeyTemplate.getDefaultInstance() : keyTemplate;
    }

    public final String getKekUri() {
        return this.kekUri_;
    }
}
