package ru.CryptoPro.JCSP.KeyStore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class KeyStoreConfig extends KeyStoreConfigBase {
    private static final List b = Arrays.asList(75, 80, 81);
    private static final int c = 75;

    public static class KeyStoreConfigInstanceHolder {
        private static final KeyStoreConfig a = new KeyStoreConfig();

        private KeyStoreConfigInstanceHolder() {
        }
    }

    public static KeyStoreConfig getInstance() {
        return KeyStoreConfigInstanceHolder.a;
    }

    public static List getSupportedProviderTypes() {
        return Collections.unmodifiableList(b);
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public int a() {
        return 1;
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public List b() {
        return getSupportedProviderTypes();
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public int c() {
        return 75;
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public String getDefaultKeyStorePrefix() {
        return "CRYPTO_PRO_KEY_STORE";
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase
    public void load() {
        super.d();
    }
}
