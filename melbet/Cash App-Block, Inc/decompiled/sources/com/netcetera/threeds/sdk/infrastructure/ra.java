package com.netcetera.threeds.sdk.infrastructure;

import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Set;

/* loaded from: classes5.dex */
abstract class ra {
    protected SecureRandom get;
    protected String initialize;

    public ra(String str, SecureRandom secureRandom) {
        this.initialize = str;
        this.get = secureRandom;
    }

    public KeyPairGenerator ThreeDS2Service() {
        String initialize = initialize();
        try {
            String str = this.initialize;
            return str == null ? KeyPairGenerator.getInstance(initialize) : KeyPairGenerator.getInstance(initialize, str);
        } catch (NoSuchAlgorithmException e) {
            JWK$$ExternalSyntheticBUOutline0.m("Couldn't find ", (Object) initialize, (Object) " KeyPairGenerator! ", (Throwable) e);
            return null;
        } catch (NoSuchProviderException e2) {
            throw new ro("Cannot get KeyPairGenerator instance with provider " + this.initialize, e2);
        }
    }

    public KeyFactory get() {
        String initialize = initialize();
        try {
            String str = this.initialize;
            return str == null ? KeyFactory.getInstance(initialize) : KeyFactory.getInstance(initialize, str);
        } catch (NoSuchAlgorithmException e) {
            JWK$$ExternalSyntheticBUOutline0.m("Couldn't find ", (Object) initialize, (Object) " KeyFactory! ", (Throwable) e);
            return null;
        } catch (NoSuchProviderException e2) {
            throw new ro("Cannot get KeyFactory instance with provider " + this.initialize, e2);
        }
    }

    public boolean getWarnings() {
        Set<String> algorithms = Security.getAlgorithms("KeyFactory");
        Set<String> algorithms2 = Security.getAlgorithms("KeyPairGenerator");
        String initialize = initialize();
        return algorithms2.contains(initialize) && algorithms.contains(initialize);
    }

    public abstract String initialize();
}
