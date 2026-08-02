package ru.CryptoPro.JCSP.KeyStore;

/* loaded from: classes4.dex */
abstract class MetaCSPStoreEDDSA extends MetaCSPStore {
    @Override // ru.CryptoPro.JCSP.KeyStore.MetaCSPStore
    public void b() {
        this.c = KeyStoreConfigEDDSA.getInstance().getMyWord(getClass());
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.MetaCSPStore, ru.CryptoPro.JCSP.KeyStore.CSPStore
    public int getDefaultProviderType() {
        return 32;
    }
}
