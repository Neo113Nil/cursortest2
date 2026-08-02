package ru.CryptoPro.JCSP.KeyStore;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class KeyStoreConfigECDSA extends KeyStoreConfigBase {
    private static final List b = Collections.singletonList(16);
    private static final int c = 16;

    public static class KeyStoreConfigECDSAInstanceHolder {
        private static final KeyStoreConfigECDSA a = new KeyStoreConfigECDSA();

        private KeyStoreConfigECDSAInstanceHolder() {
        }
    }

    public static KeyStoreConfigECDSA getInstance() {
        return KeyStoreConfigECDSAInstanceHolder.a;
    }

    public static List getSupportedProviderTypes() {
        return b;
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public int a() {
        return 41;
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public List b() {
        return getSupportedProviderTypes();
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public int c() {
        return 16;
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public String getDefaultKeyStorePrefix() {
        return "CRYPTO_PRO_KEY_STORE_EC";
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public void load() {
        super.d();
    }
}
