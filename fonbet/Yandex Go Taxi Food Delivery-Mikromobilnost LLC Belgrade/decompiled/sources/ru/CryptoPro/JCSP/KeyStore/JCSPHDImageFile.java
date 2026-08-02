package ru.CryptoPro.JCSP.KeyStore;

/* loaded from: classes4.dex */
public class JCSPHDImageFile extends MetaCSPStore {
    public static final String STORE_NAME = "HDImageFileInternal";

    public JCSPHDImageFile() {
        super(true);
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.MetaCSPStore
    public void b() {
        this.c = KeyStoreConfig.getInstance().getMyWord(KeyStoreConfig.getInstance().getHDImage().getClass());
    }
}
