package com.squareup.cash.biometrics;

import app.cash.molecule.PlatformKt;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;

/* loaded from: classes.dex */
public final class AndroidSecureStore$Crypto$Ready extends PlatformKt {
    public final KeyFactory keyFactory;
    public final KeyPairGenerator keyGenerator;
    public final KeyStore keyStore;

    public AndroidSecureStore$Crypto$Ready(KeyStore keyStore, KeyPairGenerator keyPairGenerator, KeyFactory keyFactory) {
        this.keyStore = keyStore;
        this.keyGenerator = keyPairGenerator;
        this.keyFactory = keyFactory;
    }
}
