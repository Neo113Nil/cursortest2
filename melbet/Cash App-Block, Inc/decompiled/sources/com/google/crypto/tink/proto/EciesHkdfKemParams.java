package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes.dex */
public final class EciesHkdfKemParams extends GeneratedMessageLite {
    public static final int CURVE_TYPE_FIELD_NUMBER = 1;
    private static final EciesHkdfKemParams DEFAULT_INSTANCE;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 2;
    public static final int HKDF_SALT_FIELD_NUMBER = 11;
    private static volatile Parser PARSER;
    private int curveType_;
    private int hkdfHashType_;
    private ByteString hkdfSalt_ = ByteString.EMPTY;

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
        EciesHkdfKemParams eciesHkdfKemParams = new EciesHkdfKemParams();
        DEFAULT_INSTANCE = eciesHkdfKemParams;
        GeneratedMessageLite.registerDefaultInstance(EciesHkdfKemParams.class, eciesHkdfKemParams);
    }

    public static void access$200(EciesHkdfKemParams eciesHkdfKemParams, EllipticCurveType ellipticCurveType) {
        eciesHkdfKemParams.getClass();
        if (ellipticCurveType != EllipticCurveType.UNRECOGNIZED) {
            eciesHkdfKemParams.curveType_ = ellipticCurveType.value;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        }
    }

    public static void access$500(EciesHkdfKemParams eciesHkdfKemParams, HashType hashType) {
        eciesHkdfKemParams.getClass();
        eciesHkdfKemParams.hkdfHashType_ = hashType.getNumber();
    }

    public static void access$700(EciesHkdfKemParams eciesHkdfKemParams, ByteString.LiteralByteString literalByteString) {
        eciesHkdfKemParams.getClass();
        eciesHkdfKemParams.hkdfSalt_ = literalByteString;
    }

    public static EciesHkdfKemParams getDefaultInstance() {
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
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"curveType_", "hkdfHashType_", "hkdfSalt_"});
        }
        if (ordinal == 3) {
            return new EciesHkdfKemParams();
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
        synchronized (EciesHkdfKemParams.class) {
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

    public final EllipticCurveType getCurveType() {
        int i = this.curveType_;
        EllipticCurveType ellipticCurveType = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : EllipticCurveType.CURVE25519 : EllipticCurveType.NIST_P521 : EllipticCurveType.NIST_P384 : EllipticCurveType.NIST_P256 : EllipticCurveType.UNKNOWN_CURVE;
        return ellipticCurveType == null ? EllipticCurveType.UNRECOGNIZED : ellipticCurveType;
    }

    public final HashType getHkdfHashType() {
        HashType forNumber = HashType.forNumber(this.hkdfHashType_);
        return forNumber == null ? HashType.UNRECOGNIZED : forNumber;
    }

    public final ByteString getHkdfSalt() {
        return this.hkdfSalt_;
    }
}
