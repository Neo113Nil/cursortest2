package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes4.dex */
public final class HpkeParams extends GeneratedMessageLite {
    public static final int AEAD_FIELD_NUMBER = 3;
    private static final HpkeParams DEFAULT_INSTANCE;
    public static final int KDF_FIELD_NUMBER = 2;
    public static final int KEM_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private int aead_;
    private int kdf_;
    private int kem_;

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final void setAead(HpkeAead hpkeAead) {
            copyOnWrite();
            HpkeParams.access$800((HpkeParams) this.instance, hpkeAead);
        }

        public final void setKdf(HpkeKdf hpkeKdf) {
            copyOnWrite();
            HpkeParams.access$500((HpkeParams) this.instance, hpkeKdf);
        }

        public final void setKem(HpkeKem hpkeKem) {
            copyOnWrite();
            HpkeParams.access$200((HpkeParams) this.instance, hpkeKem);
        }
    }

    static {
        HpkeParams hpkeParams = new HpkeParams();
        DEFAULT_INSTANCE = hpkeParams;
        GeneratedMessageLite.registerDefaultInstance(HpkeParams.class, hpkeParams);
    }

    public static void access$200(HpkeParams hpkeParams, HpkeKem hpkeKem) {
        hpkeParams.getClass();
        if (hpkeKem != HpkeKem.UNRECOGNIZED) {
            hpkeParams.kem_ = hpkeKem.value;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        }
    }

    public static void access$500(HpkeParams hpkeParams, HpkeKdf hpkeKdf) {
        hpkeParams.getClass();
        if (hpkeKdf != HpkeKdf.UNRECOGNIZED) {
            hpkeParams.kdf_ = hpkeKdf.value;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        }
    }

    public static void access$800(HpkeParams hpkeParams, HpkeAead hpkeAead) {
        hpkeParams.getClass();
        if (hpkeAead != HpkeAead.UNRECOGNIZED) {
            hpkeParams.aead_ = hpkeAead.value;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        }
    }

    public static HpkeParams getDefaultInstance() {
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
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"kem_", "kdf_", "aead_"});
        }
        if (ordinal == 3) {
            return new HpkeParams();
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
        synchronized (HpkeParams.class) {
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

    public final HpkeAead getAead() {
        int i = this.aead_;
        HpkeAead hpkeAead = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : HpkeAead.CHACHA20_POLY1305 : HpkeAead.AES_256_GCM : HpkeAead.AES_128_GCM : HpkeAead.AEAD_UNKNOWN;
        return hpkeAead == null ? HpkeAead.UNRECOGNIZED : hpkeAead;
    }

    public final HpkeKdf getKdf() {
        int i = this.kdf_;
        HpkeKdf hpkeKdf = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : HpkeKdf.HKDF_SHA512 : HpkeKdf.HKDF_SHA384 : HpkeKdf.HKDF_SHA256 : HpkeKdf.KDF_UNKNOWN;
        return hpkeKdf == null ? HpkeKdf.UNRECOGNIZED : hpkeKdf;
    }

    public final HpkeKem getKem() {
        HpkeKem hpkeKem;
        switch (this.kem_) {
            case 0:
                hpkeKem = HpkeKem.KEM_UNKNOWN;
                break;
            case 1:
                hpkeKem = HpkeKem.DHKEM_X25519_HKDF_SHA256;
                break;
            case 2:
                hpkeKem = HpkeKem.DHKEM_P256_HKDF_SHA256;
                break;
            case 3:
                hpkeKem = HpkeKem.DHKEM_P384_HKDF_SHA384;
                break;
            case 4:
                hpkeKem = HpkeKem.DHKEM_P521_HKDF_SHA512;
                break;
            case 5:
                hpkeKem = HpkeKem.X_WING;
                break;
            case 6:
                hpkeKem = HpkeKem.ML_KEM768;
                break;
            case 7:
                hpkeKem = HpkeKem.ML_KEM1024;
                break;
            default:
                hpkeKem = null;
                break;
        }
        return hpkeKem == null ? HpkeKem.UNRECOGNIZED : hpkeKem;
    }
}
