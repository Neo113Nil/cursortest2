package com.nimbusds.jose;

import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* loaded from: classes5.dex */
public final class JWSAlgorithm extends Algorithm {
    public static final JWSAlgorithm HS256 = new JWSAlgorithm("HS256");
    public static final JWSAlgorithm HS384 = new JWSAlgorithm("HS384");
    public static final JWSAlgorithm HS512 = new JWSAlgorithm("HS512");
    public static final JWSAlgorithm RS256 = new JWSAlgorithm("RS256");
    public static final JWSAlgorithm RS384 = new JWSAlgorithm("RS384");
    public static final JWSAlgorithm RS512 = new JWSAlgorithm("RS512");
    public static final JWSAlgorithm ES256 = new JWSAlgorithm("ES256");
    public static final JWSAlgorithm ES256K = new JWSAlgorithm("ES256K");
    public static final JWSAlgorithm ES384 = new JWSAlgorithm("ES384");
    public static final JWSAlgorithm ES512 = new JWSAlgorithm("ES512");
    public static final JWSAlgorithm PS256 = new JWSAlgorithm("PS256");
    public static final JWSAlgorithm PS384 = new JWSAlgorithm("PS384");
    public static final JWSAlgorithm PS512 = new JWSAlgorithm("PS512");
    public static final JWSAlgorithm EdDSA = new JWSAlgorithm("EdDSA");
    public static final JWSAlgorithm Ed25519 = new JWSAlgorithm(EdDSAParameterSpec.Ed25519);
    public static final JWSAlgorithm Ed448 = new JWSAlgorithm(EdDSAParameterSpec.Ed448);
}
