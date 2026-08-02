package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes.dex */
public final class KeyTemplate extends GeneratedMessageLite {
    private static final KeyTemplate DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.EMPTY;

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final void setOutputPrefixType(OutputPrefixType outputPrefixType) {
            copyOnWrite();
            KeyTemplate.access$700((KeyTemplate) this.instance, outputPrefixType);
        }

        public final void setTypeUrl$1(String str) {
            copyOnWrite();
            KeyTemplate.access$100((KeyTemplate) this.instance, str);
        }

        public final void setValue$1(ByteString byteString) {
            copyOnWrite();
            KeyTemplate.access$400((KeyTemplate) this.instance, byteString);
        }
    }

    static {
        KeyTemplate keyTemplate = new KeyTemplate();
        DEFAULT_INSTANCE = keyTemplate;
        GeneratedMessageLite.registerDefaultInstance(KeyTemplate.class, keyTemplate);
    }

    public static void access$100(KeyTemplate keyTemplate, String str) {
        keyTemplate.getClass();
        str.getClass();
        keyTemplate.typeUrl_ = str;
    }

    public static void access$400(KeyTemplate keyTemplate, ByteString byteString) {
        keyTemplate.getClass();
        byteString.getClass();
        keyTemplate.value_ = byteString;
    }

    public static void access$700(KeyTemplate keyTemplate, OutputPrefixType outputPrefixType) {
        keyTemplate.getClass();
        keyTemplate.outputPrefixType_ = outputPrefixType.getNumber();
    }

    public static KeyTemplate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static KeyTemplate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        GeneratedMessageLite parsePartialFrom = GeneratedMessageLite.parsePartialFrom(DEFAULT_INSTANCE, bArr, bArr.length, extensionRegistryLite);
        GeneratedMessageLite.checkMessageInitialized(parsePartialFrom);
        return (KeyTemplate) parsePartialFrom;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(int i) {
        Parser parser;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
        }
        if (ordinal == 3) {
            return new KeyTemplate();
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
        synchronized (KeyTemplate.class) {
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

    public final OutputPrefixType getOutputPrefixType() {
        OutputPrefixType forNumber = OutputPrefixType.forNumber(this.outputPrefixType_);
        return forNumber == null ? OutputPrefixType.UNRECOGNIZED : forNumber;
    }

    public final String getTypeUrl() {
        return this.typeUrl_;
    }

    public final ByteString getValue() {
        return this.value_;
    }
}
