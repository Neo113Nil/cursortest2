package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class SG {
    public static SG a(EG eg, Provider provider) {
        SG sg = new SG();
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            eg.f25337d.b();
            new SecretKeySpec(((C3263gK) eg.f25336c.f30647u).b(), "AES");
            return sg;
        } catch (NoSuchAlgorithmException e9) {
            throw new GeneralSecurityException("AES-CMAC not available.", e9);
        }
    }
}
