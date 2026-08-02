package com.google.crypto.tink.internal;

import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda2;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class MutableKeyCreationRegistry {
    public static final MutableKeyCreationRegistry globalInstance;
    public final HashMap creators = new HashMap();

    static {
        HmacKeyManager$$ExternalSyntheticLambda2 hmacKeyManager$$ExternalSyntheticLambda2 = new HmacKeyManager$$ExternalSyntheticLambda2(13);
        MutableKeyCreationRegistry mutableKeyCreationRegistry = new MutableKeyCreationRegistry();
        try {
            mutableKeyCreationRegistry.add(hmacKeyManager$$ExternalSyntheticLambda2, LegacyProtoParameters.class);
            globalInstance = mutableKeyCreationRegistry;
        } catch (GeneralSecurityException e) {
            a$$ExternalSyntheticBUOutline0.m("unexpected error.", e);
        }
    }

    public final synchronized void add(HmacKeyManager$$ExternalSyntheticLambda2 hmacKeyManager$$ExternalSyntheticLambda2, Class cls) {
        try {
            HmacKeyManager$$ExternalSyntheticLambda2 hmacKeyManager$$ExternalSyntheticLambda22 = (HmacKeyManager$$ExternalSyntheticLambda2) this.creators.get(cls);
            if (hmacKeyManager$$ExternalSyntheticLambda22 != null && !hmacKeyManager$$ExternalSyntheticLambda22.equals(hmacKeyManager$$ExternalSyntheticLambda2)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls + " already inserted");
            }
            this.creators.put(cls, hmacKeyManager$$ExternalSyntheticLambda2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final TransactorKt createKey(Parameters parameters, Integer num) {
        TransactorKt createKey;
        synchronized (this) {
            HmacKeyManager$$ExternalSyntheticLambda2 hmacKeyManager$$ExternalSyntheticLambda2 = (HmacKeyManager$$ExternalSyntheticLambda2) this.creators.get(parameters.getClass());
            if (hmacKeyManager$$ExternalSyntheticLambda2 == null) {
                throw new GeneralSecurityException("Cannot create a new key for parameters " + parameters + ": no key creator for this class was registered.");
            }
            createKey = hmacKeyManager$$ExternalSyntheticLambda2.createKey(parameters, num);
        }
        return createKey;
    }
}
