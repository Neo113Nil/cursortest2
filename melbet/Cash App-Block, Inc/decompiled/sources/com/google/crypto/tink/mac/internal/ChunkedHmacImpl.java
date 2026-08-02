package com.google.crypto.tink.mac.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.crypto.tink.internal.ConscryptUtil;
import com.google.crypto.tink.mac.AesCmacKey;
import com.google.crypto.tink.mac.ChunkedMac;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class ChunkedHmacImpl implements ChunkedMac {
    public ChunkedHmacImpl() {
        if (re$$ExternalSyntheticOutline0._isCompatible$1(2)) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$6("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }

    public static ChunkedHmacImpl create(AesCmacKey aesCmacKey, Provider provider) {
        ChunkedHmacImpl chunkedHmacImpl = new ChunkedHmacImpl();
        if (!re$$ExternalSyntheticOutline0._isCompatible(1)) {
            a$$ExternalSyntheticBUOutline0.m$6("Cannot use AES-CMAC in FIPS-mode.");
            return null;
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            aesCmacKey.outputPrefix.toByteArray();
            new SecretKeySpec(((Bytes) aesCmacKey.aesKeyBytes.adapter).toByteArray(), "AES");
            return chunkedHmacImpl;
        } catch (NoSuchAlgorithmException e) {
            throw new GeneralSecurityException("AES-CMAC not available.", e);
        }
    }

    public static ChunkedMac create(AesCmacKey aesCmacKey) {
        if (re$$ExternalSyntheticOutline0._isCompatible(1)) {
            Provider providerOrNull = ConscryptUtil.providerOrNull();
            if (providerOrNull != null) {
                try {
                    return create(aesCmacKey, providerOrNull);
                } catch (GeneralSecurityException unused) {
                }
            }
            return new ChunkedHmacImpl();
        }
        a$$ExternalSyntheticBUOutline0.m$6("Cannot use AES-CMAC in FIPS-mode.");
        return null;
    }
}
