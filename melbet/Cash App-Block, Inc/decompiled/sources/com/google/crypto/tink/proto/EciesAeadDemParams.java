package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes.dex */
public final class EciesAeadDemParams extends GeneratedMessageLite {
    public static final int AEAD_DEM_FIELD_NUMBER = 2;
    private static final EciesAeadDemParams DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    private KeyTemplate aeadDem_;
    private int bitField0_;

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }
    }

    static {
        EciesAeadDemParams eciesAeadDemParams = new EciesAeadDemParams();
        DEFAULT_INSTANCE = eciesAeadDemParams;
        GeneratedMessageLite.registerDefaultInstance(EciesAeadDemParams.class, eciesAeadDemParams);
    }

    public static void access$100(EciesAeadDemParams eciesAeadDemParams, KeyTemplate keyTemplate) {
        eciesAeadDemParams.getClass();
        eciesAeadDemParams.aeadDem_ = keyTemplate;
        eciesAeadDemParams.bitField0_ |= 1;
    }

    public static EciesAeadDemParams getDefaultInstance() {
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
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"bitField0_", "aeadDem_"});
        }
        if (ordinal == 3) {
            return new EciesAeadDemParams();
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
        synchronized (EciesAeadDemParams.class) {
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

    public final KeyTemplate getAeadDem() {
        KeyTemplate keyTemplate = this.aeadDem_;
        return keyTemplate == null ? KeyTemplate.getDefaultInstance() : keyTemplate;
    }
}
