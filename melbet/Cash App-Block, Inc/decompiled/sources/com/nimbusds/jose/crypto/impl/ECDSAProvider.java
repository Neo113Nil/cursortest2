package com.nimbusds.jose.crypto.impl;

import com.google.mlkit.vision.text.Text;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.jwk.Curve;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class ECDSAProvider extends Text.TextBase {
    public static final Set SUPPORTED_ALGORITHMS;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWSAlgorithm.ES256);
        linkedHashSet.add(JWSAlgorithm.ES256K);
        linkedHashSet.add(JWSAlgorithm.ES384);
        linkedHashSet.add(JWSAlgorithm.ES512);
        SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(Curve.P_256);
        linkedHashSet2.add(Curve.SECP256K1);
        linkedHashSet2.add(Curve.P_384);
        linkedHashSet2.add(Curve.P_521);
        Collections.unmodifiableSet(linkedHashSet2);
    }
}
