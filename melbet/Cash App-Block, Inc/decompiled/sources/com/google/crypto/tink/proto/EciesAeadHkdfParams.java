package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes.dex */
public final class EciesAeadHkdfParams extends GeneratedMessageLite {
    private static final EciesAeadHkdfParams DEFAULT_INSTANCE;
    public static final int DEM_PARAMS_FIELD_NUMBER = 2;
    public static final int EC_POINT_FORMAT_FIELD_NUMBER = 3;
    public static final int KEM_PARAMS_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private int bitField0_;
    private EciesAeadDemParams demParams_;
    private int ecPointFormat_;
    private EciesHkdfKemParams kemParams_;

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
        EciesAeadHkdfParams eciesAeadHkdfParams = new EciesAeadHkdfParams();
        DEFAULT_INSTANCE = eciesAeadHkdfParams;
        GeneratedMessageLite.registerDefaultInstance(EciesAeadHkdfParams.class, eciesAeadHkdfParams);
    }

    public static void access$100(EciesAeadHkdfParams eciesAeadHkdfParams, EciesHkdfKemParams eciesHkdfKemParams) {
        eciesAeadHkdfParams.getClass();
        eciesAeadHkdfParams.kemParams_ = eciesHkdfKemParams;
        eciesAeadHkdfParams.bitField0_ |= 1;
    }

    public static void access$400(EciesAeadHkdfParams eciesAeadHkdfParams, EciesAeadDemParams eciesAeadDemParams) {
        eciesAeadHkdfParams.getClass();
        eciesAeadHkdfParams.demParams_ = eciesAeadDemParams;
        eciesAeadHkdfParams.bitField0_ |= 2;
    }

    public static void access$800(EciesAeadHkdfParams eciesAeadHkdfParams, EcPointFormat ecPointFormat) {
        eciesAeadHkdfParams.getClass();
        if (ecPointFormat != EcPointFormat.UNRECOGNIZED) {
            eciesAeadHkdfParams.ecPointFormat_ = ecPointFormat.value;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        }
    }

    public static EciesAeadHkdfParams getDefaultInstance() {
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
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"bitField0_", "kemParams_", "demParams_", "ecPointFormat_"});
        }
        if (ordinal == 3) {
            return new EciesAeadHkdfParams();
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
        synchronized (EciesAeadHkdfParams.class) {
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

    public final EciesAeadDemParams getDemParams() {
        EciesAeadDemParams eciesAeadDemParams = this.demParams_;
        return eciesAeadDemParams == null ? EciesAeadDemParams.getDefaultInstance() : eciesAeadDemParams;
    }

    public final EcPointFormat getEcPointFormat() {
        int i = this.ecPointFormat_;
        EcPointFormat ecPointFormat = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : EcPointFormat.DO_NOT_USE_CRUNCHY_UNCOMPRESSED : EcPointFormat.COMPRESSED : EcPointFormat.UNCOMPRESSED : EcPointFormat.UNKNOWN_FORMAT;
        return ecPointFormat == null ? EcPointFormat.UNRECOGNIZED : ecPointFormat;
    }

    public final EciesHkdfKemParams getKemParams() {
        EciesHkdfKemParams eciesHkdfKemParams = this.kemParams_;
        return eciesHkdfKemParams == null ? EciesHkdfKemParams.getDefaultInstance() : eciesHkdfKemParams;
    }
}
