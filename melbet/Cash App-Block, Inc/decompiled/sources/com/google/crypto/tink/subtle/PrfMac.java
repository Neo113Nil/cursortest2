package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Mac;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.crypto.tink.mac.AesCmacKey;
import com.google.crypto.tink.mac.AesCmacParameters;
import com.google.crypto.tink.mac.HmacKey;
import com.google.crypto.tink.mac.HmacParameters;
import com.google.crypto.tink.prf.AesCmacPrfKey;
import com.google.crypto.tink.prf.AesCmacPrfParameters;
import com.google.crypto.tink.prf.Prf;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class PrfMac implements Mac {
    public static final byte[] formatVersion = {0};
    public final byte[] outputPrefix;
    public final byte[] plaintextLegacySuffix;
    public final int tagSize;
    public final Prf wrappedPrf;

    public PrfMac(HmacKey hmacKey) {
        this.wrappedPrf = new PrfHmacJce("HMAC" + hmacKey.parameters.hashType, new SecretKeySpec(((com.google.crypto.tink.util.Bytes) hmacKey.keyBytes.adapter).toByteArray(), "HMAC"));
        HmacParameters hmacParameters = hmacKey.parameters;
        this.tagSize = hmacParameters.tagSizeBytes;
        this.outputPrefix = hmacKey.outputPrefix.toByteArray();
        if (hmacParameters.variant.equals(HmacParameters.Variant.LEGACY)) {
            this.plaintextLegacySuffix = Arrays.copyOf(formatVersion, 1);
        } else {
            this.plaintextLegacySuffix = new byte[0];
        }
    }

    public static PrfMac create(AesCmacKey aesCmacKey) {
        return new PrfMac(aesCmacKey);
    }

    public final byte[] computeMac(byte[] bArr) {
        byte[] bArr2 = this.plaintextLegacySuffix;
        int length = bArr2.length;
        int i = this.tagSize;
        Prf prf = this.wrappedPrf;
        byte[] bArr3 = this.outputPrefix;
        return length > 0 ? Bytes.concat(bArr3, prf.compute(i, Bytes.concat(bArr, bArr2))) : Bytes.concat(bArr3, prf.compute(i, bArr));
    }

    public static PrfMac create(HmacKey hmacKey) {
        return new PrfMac(hmacKey);
    }

    public PrfMac(AesCmacKey aesCmacKey) {
        this.wrappedPrf = PrfAesCmac.create(AesCmacPrfKey.create(AesCmacPrfParameters.create(aesCmacKey.parameters.keySizeBytes), aesCmacKey.aesKeyBytes));
        AesCmacParameters aesCmacParameters = aesCmacKey.parameters;
        this.tagSize = aesCmacParameters.tagSizeBytes;
        this.outputPrefix = aesCmacKey.outputPrefix.toByteArray();
        if (aesCmacParameters.variant.equals(AesCmacParameters.Variant.LEGACY)) {
            this.plaintextLegacySuffix = Arrays.copyOf(formatVersion, 1);
        } else {
            this.plaintextLegacySuffix = new byte[0];
        }
    }

    public PrfMac(PrfHmacJce prfHmacJce, int i) {
        this.wrappedPrf = prfHmacJce;
        this.tagSize = i;
        this.outputPrefix = new byte[0];
        this.plaintextLegacySuffix = new byte[0];
        if (i >= 10) {
            prfHmacJce.compute(i, new byte[0]);
        } else {
            AesGcmSiv$$ExternalSyntheticLambda0.m$1("tag size too small, need at least 10 bytes");
            throw null;
        }
    }
}
