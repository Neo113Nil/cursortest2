package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.aead.AesCtrHmacAeadKey;
import com.google.crypto.tink.aead.AesCtrHmacAeadParameters;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class EncryptThenAuthenticate implements Aead {
    public final AesCtrJceCipher cipher;
    public final PrfMac mac;
    public final int macLength;
    public final byte[] outputPrefix;

    public EncryptThenAuthenticate(AesCtrJceCipher aesCtrJceCipher, PrfMac prfMac, int i, byte[] bArr) {
        this.cipher = aesCtrJceCipher;
        this.mac = prfMac;
        this.macLength = i;
        this.outputPrefix = bArr;
    }

    public static EncryptThenAuthenticate create(AesCtrHmacAeadKey aesCtrHmacAeadKey) {
        byte[] byteArray = ((com.google.crypto.tink.util.Bytes) aesCtrHmacAeadKey.aesKeyBytes.adapter).toByteArray();
        AesCtrHmacAeadParameters aesCtrHmacAeadParameters = aesCtrHmacAeadKey.parameters;
        AesCtrJceCipher aesCtrJceCipher = new AesCtrJceCipher(byteArray, aesCtrHmacAeadParameters.ivSizeBytes);
        PrfHmacJce prfHmacJce = new PrfHmacJce("HMAC" + aesCtrHmacAeadParameters.hashType, new SecretKeySpec(((com.google.crypto.tink.util.Bytes) aesCtrHmacAeadKey.hmacKeyBytes.adapter).toByteArray(), "HMAC"));
        int i = aesCtrHmacAeadParameters.tagSizeBytes;
        return new EncryptThenAuthenticate(aesCtrJceCipher, new PrfMac(prfHmacJce, i), i, aesCtrHmacAeadKey.outputPrefix.toByteArray());
    }
}
