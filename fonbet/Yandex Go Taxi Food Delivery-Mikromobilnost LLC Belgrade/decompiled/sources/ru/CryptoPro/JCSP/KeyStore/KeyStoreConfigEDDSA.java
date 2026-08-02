package ru.CryptoPro.JCSP.KeyStore;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class KeyStoreConfigEDDSA extends KeyStoreConfigBase {
    private static final List b = Collections.singletonList(32);
    private static final int c = 32;

    public static class KeyStoreConfigEDDSAInstanceHolder {
        private static final KeyStoreConfigEDDSA a = new KeyStoreConfigEDDSA();

        private KeyStoreConfigEDDSAInstanceHolder() {
        }
    }

    public static KeyStoreConfigEDDSA getInstance() {
        return KeyStoreConfigEDDSAInstanceHolder.a;
    }

    public static List getSupportedProviderTypes() {
        return b;
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public int a() {
        return 61;
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public List b() {
        return getSupportedProviderTypes();
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public int c() {
        return 32;
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public String getDefaultKeyStorePrefix() {
        return "CRYPTO_PRO_KEY_STORE_ED";
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public void load() {
        super.d();
    }
}
