package com.google.crypto.tink.aead;

import androidx.datastore.core.SimpleActor;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.internal.TinkBugException;

/* loaded from: classes.dex */
public abstract class PredefinedAeadParameters {
    public static final AesCtrHmacAeadParameters AES128_CTR_HMAC_SHA256;
    public static final AesEaxParameters AES128_EAX;
    public static final AesGcmParameters AES128_GCM;
    public static final AesCtrHmacAeadParameters AES256_CTR_HMAC_SHA256;
    public static final AesEaxParameters AES256_EAX;
    public static final AesGcmParameters AES256_GCM;
    public static final XAesGcmParameters XAES_256_GCM_160_BIT_NONCE_NO_PREFIX;
    public static final XAesGcmParameters XAES_256_GCM_192_BIT_NONCE;
    public static final XAesGcmParameters XAES_256_GCM_192_BIT_NONCE_NO_PREFIX;
    public static final XAesGcmParameters X_AES_GCM_8_BYTE_SALT_NO_PREFIX;

    static {
        AesEaxParameters.Variant variant = AesEaxParameters.Variant.NO_PREFIX$5;
        AesEaxParameters.Variant variant2 = AesEaxParameters.Variant.TINK$1;
        AesEaxParameters.Variant variant3 = AesEaxParameters.Variant.SHA256;
        AesEaxParameters.Variant variant4 = AesEaxParameters.Variant.TINK;
        AesEaxParameters.Variant variant5 = AesEaxParameters.Variant.TINK$2;
        try {
            SimpleActor builder = AesGcmParameters.builder();
            builder.setIvSizeBytes();
            builder.setKeySizeBytes(16);
            builder.setTagSizeBytes();
            builder.remainingMessages = variant5;
            AES128_GCM = builder.m1111build();
            try {
                SimpleActor builder2 = AesGcmParameters.builder();
                builder2.setIvSizeBytes();
                builder2.setKeySizeBytes(32);
                builder2.setTagSizeBytes();
                builder2.remainingMessages = variant5;
                AES256_GCM = builder2.m1111build();
                try {
                    SimpleActor builder3 = AesEaxParameters.builder();
                    builder3.setIvSizeBytes(16);
                    builder3.setKeySizeBytes(16);
                    builder3.setTagSizeBytes();
                    builder3.remainingMessages = variant4;
                    AES128_EAX = builder3.build();
                    try {
                        SimpleActor builder4 = AesEaxParameters.builder();
                        builder4.setIvSizeBytes(16);
                        builder4.setKeySizeBytes(32);
                        builder4.setTagSizeBytes();
                        builder4.remainingMessages = variant4;
                        AES256_EAX = builder4.build();
                        try {
                            zzlj builder5 = AesCtrHmacAeadParameters.builder();
                            builder5.setAesKeySizeBytes(16);
                            builder5.setHmacKeySizeBytes(32);
                            builder5.setTagSizeBytes(16);
                            builder5.setIvSizeBytes(16);
                            builder5.zzd = variant3;
                            builder5.zzf = variant2;
                            AES128_CTR_HMAC_SHA256 = builder5.build();
                            try {
                                zzlj builder6 = AesCtrHmacAeadParameters.builder();
                                builder6.setAesKeySizeBytes(32);
                                builder6.setHmacKeySizeBytes(32);
                                builder6.setTagSizeBytes(32);
                                builder6.setIvSizeBytes(16);
                                builder6.zzd = variant3;
                                builder6.zzf = variant2;
                                AES256_CTR_HMAC_SHA256 = builder6.build();
                                try {
                                    XAES_256_GCM_192_BIT_NONCE = XAesGcmParameters.create(12, AesEaxParameters.Variant.TINK$5);
                                    try {
                                        XAES_256_GCM_192_BIT_NONCE_NO_PREFIX = XAesGcmParameters.create(12, variant);
                                        try {
                                            XAesGcmParameters create = XAesGcmParameters.create(8, variant);
                                            XAES_256_GCM_160_BIT_NONCE_NO_PREFIX = create;
                                            X_AES_GCM_8_BYTE_SALT_NO_PREFIX = create;
                                        } catch (Exception e) {
                                            throw new TinkBugException(e);
                                        }
                                    } catch (Exception e2) {
                                        throw new TinkBugException(e2);
                                    }
                                } catch (Exception e3) {
                                    throw new TinkBugException(e3);
                                }
                            } catch (Exception e4) {
                                throw new TinkBugException(e4);
                            }
                        } catch (Exception e5) {
                            throw new TinkBugException(e5);
                        }
                    } catch (Exception e6) {
                        throw new TinkBugException(e6);
                    }
                } catch (Exception e7) {
                    throw new TinkBugException(e7);
                }
            } catch (Exception e8) {
                throw new TinkBugException(e8);
            }
        } catch (Exception e9) {
            throw new TinkBugException(e9);
        }
    }
}
