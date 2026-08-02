package com.google.crypto.tink.internal;

import com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager$$ExternalSyntheticLambda1;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class MutableKeyDerivationRegistry {
    public static final MutableKeyDerivationRegistry globalInstance = new MutableKeyDerivationRegistry();
    public final HashMap creators = new HashMap();

    public final synchronized void add(AesCtrHmacAeadKeyManager$$ExternalSyntheticLambda1 aesCtrHmacAeadKeyManager$$ExternalSyntheticLambda1, Class cls) {
        try {
            AesCtrHmacAeadKeyManager$$ExternalSyntheticLambda1 aesCtrHmacAeadKeyManager$$ExternalSyntheticLambda12 = (AesCtrHmacAeadKeyManager$$ExternalSyntheticLambda1) this.creators.get(cls);
            if (aesCtrHmacAeadKeyManager$$ExternalSyntheticLambda12 != null && !aesCtrHmacAeadKeyManager$$ExternalSyntheticLambda12.equals(aesCtrHmacAeadKeyManager$$ExternalSyntheticLambda1)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.creators.put(cls, aesCtrHmacAeadKeyManager$$ExternalSyntheticLambda1);
        } catch (Throwable th) {
            throw th;
        }
    }
}
