package com.nimbusds.jose.jwk;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.JWSAlgorithm;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;

/* loaded from: classes5.dex */
public final class Curve implements Serializable {
    public final String name;
    public final String stdName;
    public static final Curve P_256 = new Curve("P-256", "secp256r1");
    public static final Curve SECP256K1 = new Curve("secp256k1", "secp256k1");
    public static final Curve P_256K = new Curve("P-256K", "secp256k1");
    public static final Curve P_384 = new Curve("P-384", "secp384r1");
    public static final Curve P_521 = new Curve("P-521", "secp521r1");
    public static final Curve Ed25519 = new Curve(EdDSAParameterSpec.Ed25519, EdDSAParameterSpec.Ed25519);
    public static final Curve Ed448 = new Curve(EdDSAParameterSpec.Ed448, EdDSAParameterSpec.Ed448);
    public static final Curve X25519 = new Curve(XDHParameterSpec.X25519, XDHParameterSpec.X25519);
    public static final Curve X448 = new Curve(XDHParameterSpec.X448, XDHParameterSpec.X448);

    public Curve(String str, String str2) {
        Objects.requireNonNull(str);
        this.name = str;
        this.stdName = str2;
    }

    public static Set forJWSAlgorithm(JWSAlgorithm jWSAlgorithm) {
        if (JWSAlgorithm.ES256.equals(jWSAlgorithm)) {
            return Collections.singleton(P_256);
        }
        if (JWSAlgorithm.ES256K.equals(jWSAlgorithm)) {
            return Collections.singleton(SECP256K1);
        }
        if (JWSAlgorithm.ES384.equals(jWSAlgorithm)) {
            return Collections.singleton(P_384);
        }
        if (JWSAlgorithm.ES512.equals(jWSAlgorithm)) {
            return Collections.singleton(P_521);
        }
        if (JWSAlgorithm.EdDSA.equals(jWSAlgorithm)) {
            return Collections.unmodifiableSet(new HashSet(Arrays.asList(Ed25519, Ed448)));
        }
        return null;
    }

    public static Curve parse(String str) {
        if (str == null || str.trim().isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("The cryptographic curve string must not be null or empty");
            return null;
        }
        Curve curve = P_256;
        if (str.equals(curve.name)) {
            return curve;
        }
        Curve curve2 = P_256K;
        if (str.equals(curve2.name)) {
            return curve2;
        }
        Curve curve3 = SECP256K1;
        if (str.equals(curve3.name)) {
            return curve3;
        }
        Curve curve4 = P_384;
        if (str.equals(curve4.name)) {
            return curve4;
        }
        Curve curve5 = P_521;
        if (str.equals(curve5.name)) {
            return curve5;
        }
        Curve curve6 = Ed25519;
        if (str.equals(curve6.name)) {
            return curve6;
        }
        Curve curve7 = Ed448;
        if (str.equals(curve7.name)) {
            return curve7;
        }
        Curve curve8 = X25519;
        if (str.equals(curve8.name)) {
            return curve8;
        }
        Curve curve9 = X448;
        return str.equals(curve9.name) ? curve9 : new Curve(str, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Curve) {
            return this.name.equals(((Curve) obj).name);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.name);
    }

    public final String toString() {
        return this.name;
    }
}
