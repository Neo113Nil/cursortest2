package com.google.crypto.tink.subtle;

import androidx.camera.core.impl.utils.Exif;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.aead.AesEaxKey;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.prf.AesCmacPrfKey;
import com.google.crypto.tink.prf.AesCmacPrfParameters;
import com.squareup.cash.db.WireAdapter;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class AesEaxJce implements Aead {
    static {
        new Exif.AnonymousClass1(18);
    }

    public static AesEaxJce create(AesEaxKey aesEaxKey) {
        if (!re$$ExternalSyntheticOutline0._isCompatible(1)) {
            a$$ExternalSyntheticBUOutline0.m$6("Can not use AES-EAX in FIPS-mode.");
            return null;
        }
        AesEaxParameters aesEaxParameters = aesEaxKey.parameters;
        if (aesEaxParameters.tagSizeBytes != 16) {
            throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + aesEaxParameters.tagSizeBytes);
        }
        byte[] byteArray = ((com.google.crypto.tink.util.Bytes) aesEaxKey.keyBytes.adapter).toByteArray();
        int i = aesEaxParameters.ivSizeBytes;
        aesEaxKey.outputPrefix.toByteArray();
        AesEaxJce aesEaxJce = new AesEaxJce();
        if (!re$$ExternalSyntheticOutline0._isCompatible(1)) {
            a$$ExternalSyntheticBUOutline0.m$6("Can not use AES-EAX in FIPS-mode.");
            throw null;
        }
        if (i != 12 && i != 16) {
            a$$ExternalSyntheticBUOutline0.m$3("IV size should be either 12 or 16 bytes");
            throw null;
        }
        Validators.validateAesKeySize(byteArray.length);
        new SecretKeySpec(byteArray, "AES");
        PrfAesCmac.create(AesCmacPrfKey.create(AesCmacPrfParameters.create(byteArray.length), new WireAdapter(com.google.crypto.tink.util.Bytes.copyFrom(byteArray))));
        return aesEaxJce;
    }
}
