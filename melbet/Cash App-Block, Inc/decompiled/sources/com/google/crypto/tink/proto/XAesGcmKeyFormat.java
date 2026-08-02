package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes4.dex */
public final class XAesGcmKeyFormat extends GeneratedMessageLite {
    private static final XAesGcmKeyFormat DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
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

        public final void setParams$1(XAesGcmParams xAesGcmParams) {
            copyOnWrite();
            XAesGcmKeyFormat.access$300((XAesGcmKeyFormat) this.instance, xAesGcmParams);
        }
    }

    static {
        XAesGcmKeyFormat xAesGcmKeyFormat = new XAesGcmKeyFormat();
        DEFAULT_INSTANCE = xAesGcmKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(XAesGcmKeyFormat.class, xAesGcmKeyFormat);
    }

    public static void access$300(XAesGcmKeyFormat xAesGcmKeyFormat, XAesGcmParams xAesGcmParams) {
        xAesGcmKeyFormat.getClass();
        xAesGcmKeyFormat.params_ = xAesGcmParams;
        xAesGcmKeyFormat.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static XAesGcmKeyFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (XAesGcmKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(int i) {
        Parser parser;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
        }
        if (ordinal == 3) {
            return new XAesGcmKeyFormat();
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
        synchronized (XAesGcmKeyFormat.class) {
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

    public final XAesGcmParams getParams() {
        XAesGcmParams xAesGcmParams = this.params_;
        return xAesGcmParams == null ? XAesGcmParams.getDefaultInstance() : xAesGcmParams;
    }

    public final int getVersion() {
        return this.version_;
    }
}
