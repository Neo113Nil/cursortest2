package com.google.crypto.tink.mac;

import androidx.datastore.core.SimpleActor;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.mac.AesCmacParameters;
import com.google.crypto.tink.mac.HmacParameters;
import com.squareup.wire.GrpcMethod;

/* loaded from: classes.dex */
public abstract class PredefinedMacParameters {
    public static final AesCmacParameters AES_CMAC;
    public static final HmacParameters HMAC_SHA256_128BITTAG;
    public static final HmacParameters HMAC_SHA512_512BITTAG;

    static {
        HmacParameters.HashType hashType = HmacParameters.HashType.SHA512;
        HmacParameters.HashType hashType2 = HmacParameters.HashType.SHA256;
        HmacParameters.Variant variant = HmacParameters.Variant.TINK;
        try {
            SimpleActor builder = HmacParameters.builder();
            builder.scope = 32;
            builder.consumeMessage = 16;
            builder.remainingMessages = variant;
            builder.messageQueue = hashType2;
            HMAC_SHA256_128BITTAG = builder.m1113build();
            try {
                SimpleActor builder2 = HmacParameters.builder();
                builder2.scope = 32;
                builder2.consumeMessage = 32;
                builder2.remainingMessages = variant;
                builder2.messageQueue = hashType2;
                builder2.m1113build();
                try {
                    SimpleActor builder3 = HmacParameters.builder();
                    builder3.scope = 64;
                    builder3.consumeMessage = 32;
                    builder3.remainingMessages = variant;
                    builder3.messageQueue = hashType;
                    builder3.m1113build();
                    try {
                        SimpleActor builder4 = HmacParameters.builder();
                        builder4.scope = 64;
                        builder4.consumeMessage = 64;
                        builder4.remainingMessages = variant;
                        builder4.messageQueue = hashType;
                        HMAC_SHA512_512BITTAG = builder4.m1113build();
                        try {
                            GrpcMethod builder5 = AesCmacParameters.builder();
                            builder5.setKeySizeBytes(32);
                            builder5.setTagSizeBytes(16);
                            builder5.responseAdapter = AesCmacParameters.Variant.TINK;
                            AES_CMAC = builder5.m4001build();
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
    }
}
