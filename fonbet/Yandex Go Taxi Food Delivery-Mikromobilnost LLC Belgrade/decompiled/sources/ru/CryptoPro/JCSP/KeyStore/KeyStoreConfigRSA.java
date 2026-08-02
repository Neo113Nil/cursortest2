package ru.CryptoPro.JCSP.KeyStore;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class KeyStoreConfigRSA extends KeyStoreConfigBase {
    private static final List b = Collections.singletonList(24);
    private static final int c = 24;

    public static class KeyStoreConfigRSAInstanceHolder {
        private static final KeyStoreConfigRSA a = new KeyStoreConfigRSA();

        private KeyStoreConfigRSAInstanceHolder() {
        }
    }

    public static KeyStoreConfigRSA getInstance() {
        return KeyStoreConfigRSAInstanceHolder.a;
    }

    public static List getSupportedProviderTypes() {
        return b;
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public int a() {
        return 21;
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public List b() {
        return getSupportedProviderTypes();
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public int c() {
        return 24;
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public String getDefaultKeyStorePrefix() {
        return "CRYPTO_PRO_KEY_STORE_RSA";
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public void load() {
        super.d();
    }
}
