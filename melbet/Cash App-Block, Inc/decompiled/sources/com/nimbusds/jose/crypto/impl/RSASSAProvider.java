package com.nimbusds.jose.crypto.impl;

import com.google.mlkit.vision.text.Text;
import com.nimbusds.jose.JWSAlgorithm;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class RSASSAProvider extends Text.TextBase {
    public static final Set SUPPORTED_ALGORITHMS;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWSAlgorithm.RS256);
        linkedHashSet.add(JWSAlgorithm.RS384);
        linkedHashSet.add(JWSAlgorithm.RS512);
        linkedHashSet.add(JWSAlgorithm.PS256);
        linkedHashSet.add(JWSAlgorithm.PS384);
        linkedHashSet.add(JWSAlgorithm.PS512);
        SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(linkedHashSet);
    }
}
