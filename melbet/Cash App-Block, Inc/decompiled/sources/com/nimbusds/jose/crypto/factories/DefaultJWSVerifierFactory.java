package com.nimbusds.jose.crypto.factories;

import com.nimbusds.jose.crypto.impl.ECDSAProvider;
import com.nimbusds.jose.crypto.impl.MACProvider;
import com.nimbusds.jose.crypto.impl.RSASSAProvider;
import com.nimbusds.jose.jca.JCAContext;
import java.util.Collections;
import java.util.LinkedHashSet;

/* loaded from: classes8.dex */
public final class DefaultJWSVerifierFactory {
    public final JCAContext jcaContext = new JCAContext(0);

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(MACProvider.SUPPORTED_ALGORITHMS);
        linkedHashSet.addAll(RSASSAProvider.SUPPORTED_ALGORITHMS);
        linkedHashSet.addAll(ECDSAProvider.SUPPORTED_ALGORITHMS);
        Collections.unmodifiableSet(linkedHashSet);
    }
}
