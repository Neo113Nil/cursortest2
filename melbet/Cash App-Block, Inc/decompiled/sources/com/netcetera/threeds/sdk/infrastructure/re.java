package com.netcetera.threeds.sdk.infrastructure;

import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;

/* loaded from: classes5.dex */
public class re extends ra {
    public re() {
        this(null, null);
    }

    public KeyPair ThreeDS2Service(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator ThreeDS2Service = ThreeDS2Service();
        try {
            SecureRandom secureRandom = this.get;
            if (secureRandom == null) {
                ThreeDS2Service.initialize(eCParameterSpec);
            } else {
                ThreeDS2Service.initialize(eCParameterSpec, secureRandom);
            }
            return ThreeDS2Service.generateKeyPair();
        } catch (InvalidAlgorithmParameterException e) {
            throw new ro("Unable to create EC key pair with spec " + eCParameterSpec, e);
        }
    }

    public ECPublicKey get(BigInteger bigInteger, BigInteger bigInteger2, ECParameterSpec eCParameterSpec) {
        try {
            return (ECPublicKey) get().generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, bigInteger2), eCParameterSpec));
        } catch (InvalidKeySpecException e) {
            JWK$$ExternalSyntheticBUOutline0.m(e);
            return null;
        }
    }

    public ECPrivateKey getWarnings(BigInteger bigInteger, ECParameterSpec eCParameterSpec) {
        try {
            return (ECPrivateKey) get().generatePrivate(new ECPrivateKeySpec(bigInteger, eCParameterSpec));
        } catch (InvalidKeySpecException e) {
            JWK$$ExternalSyntheticBUOutline0.m(e);
            return null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ra
    public String initialize() {
        return "EC";
    }

    public re(String str, SecureRandom secureRandom) {
        super(str, secureRandom);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ra
    public /* bridge */ /* synthetic */ boolean getWarnings() {
        return super.getWarnings();
    }
}
