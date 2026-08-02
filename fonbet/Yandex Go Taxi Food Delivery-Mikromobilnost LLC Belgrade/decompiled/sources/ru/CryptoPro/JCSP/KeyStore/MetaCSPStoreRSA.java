package ru.CryptoPro.JCSP.KeyStore;

/* loaded from: classes4.dex */
abstract class MetaCSPStoreRSA extends MetaCSPStore {
    @Override // ru.CryptoPro.JCSP.KeyStore.MetaCSPStore
    public void b() {
        this.c = KeyStoreConfigRSA.getInstance().getMyWord(getClass());
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.MetaCSPStore, ru.CryptoPro.JCSP.KeyStore.CSPStore
    public int getDefaultProviderType() {
        return 24;
    }
}
