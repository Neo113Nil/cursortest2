package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes4.dex */
public final class XAesGcmKey extends GeneratedMessageLite {
    private static final XAesGcmKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private ByteString keyValue_ = ByteString.EMPTY;
    private XAesGcmParams params_;
    private int version_;

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final void setKeyValue$9(ByteString.LiteralByteString literalByteString) {
            copyOnWrite();
            XAesGcmKey.access$600((XAesGcmKey) this.instance, literalByteString);
        }

        public final void setParams(XAesGcmParams xAesGcmParams) {
            copyOnWrite();
            XAesGcmKey.access$300((XAesGcmKey) this.instance, xAesGcmParams);
        }
    }

    static {
        XAesGcmKey xAesGcmKey = new XAesGcmKey();
        DEFAULT_INSTANCE = xAesGcmKey;
        GeneratedMessageLite.registerDefaultInstance(XAesGcmKey.class, xAesGcmKey);
    }

    public static void access$300(XAesGcmKey xAesGcmKey, XAesGcmParams xAesGcmParams) {
        xAesGcmKey.getClass();
        xAesGcmKey.params_ = xAesGcmParams;
        xAesGcmKey.bitField0_ |= 1;
    }

    public static void access$600(XAesGcmKey xAesGcmKey, ByteString.LiteralByteString literalByteString) {
        xAesGcmKey.getClass();
        xAesGcmKey.keyValue_ = literalByteString;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static XAesGcmKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (XAesGcmKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
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
            return new XAesGcmKey();
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
        synchronized (XAesGcmKey.class) {
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

    public final XAesGcmParams getParams() {
        XAesGcmParams xAesGcmParams = this.params_;
        return xAesGcmParams == null ? XAesGcmParams.getDefaultInstance() : xAesGcmParams;
    }

    public final int getVersion() {
        return this.version_;
    }
}
