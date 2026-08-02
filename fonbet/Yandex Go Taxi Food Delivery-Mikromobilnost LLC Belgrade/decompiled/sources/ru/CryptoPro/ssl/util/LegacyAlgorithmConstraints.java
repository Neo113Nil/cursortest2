package ru.CryptoPro.ssl.util;

import java.security.AlgorithmParameters;
import java.security.Key;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes4.dex */
public class LegacyAlgorithmConstraints extends AbstractAlgorithmConstraints {
    public static final String PROPERTY_TLS_LEGACY_ALGS = "jdk.tls.legacyAlgorithms";
    public static final HashMap c = new HashMap();
    public final String[] b;

    public LegacyAlgorithmConstraints(String str, AlgorithmDecomposer algorithmDecomposer) {
        super(algorithmDecomposer);
        this.b = AbstractAlgorithmConstraints.b(str, c);
    }

    @Override // java.security.AlgorithmConstraints
    public final boolean permits(Set set, String str, AlgorithmParameters algorithmParameters) {
        return AbstractAlgorithmConstraints.a(this.b, str, this.a);
    }

    @Override // java.security.AlgorithmConstraints
    public final boolean permits(Set set, String str, Key key, AlgorithmParameters algorithmParameters) {
        return AbstractAlgorithmConstraints.a(this.b, str, this.a);
    }

    @Override // java.security.AlgorithmConstraints
    public final boolean permits(Set set, Key key) {
        return true;
    }
}
