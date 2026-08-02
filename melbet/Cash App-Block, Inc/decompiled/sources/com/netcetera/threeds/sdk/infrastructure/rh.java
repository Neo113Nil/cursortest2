package com.netcetera.threeds.sdk.infrastructure;

import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* loaded from: classes5.dex */
public class rh extends ra {
    public rh() {
        this(null, null);
    }

    public RSAPrivateKey ThreeDS2Service(RSAPrivateKeySpec rSAPrivateKeySpec) {
        try {
            return (RSAPrivateKey) get().generatePrivate(rSAPrivateKeySpec);
        } catch (InvalidKeySpecException e) {
            JWK$$ExternalSyntheticBUOutline0.m(e);
            return null;
        }
    }

    public RSAPrivateKey ThreeDS2ServiceInstance(BigInteger bigInteger, BigInteger bigInteger2) {
        return ThreeDS2Service(new RSAPrivateKeySpec(bigInteger, bigInteger2));
    }

    public RSAPublicKey get(BigInteger bigInteger, BigInteger bigInteger2) {
        try {
            return (RSAPublicKey) get().generatePublic(new RSAPublicKeySpec(bigInteger, bigInteger2));
        } catch (InvalidKeySpecException e) {
            JWK$$ExternalSyntheticBUOutline0.m(e);
            return null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ra
    public /* bridge */ /* synthetic */ boolean getWarnings() {
        return super.getWarnings();
    }

    public RSAPrivateKey initialize(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        return ThreeDS2Service(new RSAPrivateCrtKeySpec(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, bigInteger6, bigInteger7, bigInteger8));
    }

    public rh(String str, SecureRandom secureRandom) {
        super(str, secureRandom);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ra
    public String initialize() {
        return "RSA";
    }
}
