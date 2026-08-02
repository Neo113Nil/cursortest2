package ru.CryptoPro.JCSP.KeyStore;

import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import ru.CryptoPro.JCSP.CAPILogger;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.KeyStore.MSStore;
import ru.CryptoPro.JCSP.exception.InvalidStoreException;

/* loaded from: classes4.dex */
public class MSStoreInternal extends MSStore {
    public MSStoreInternal(String str) {
        super(str, MSStore.StoreType.stSystem);
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.MSStore
    public void engineLoadInternal(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
        JCSPLogger.subEnter();
        CAPILogger.log("CertOpen*Store*", new Object[]{this.storeName}, 0L, new String[0]);
        int readStore = readStore(getStoreName(), isFile());
        if (readStore == 0) {
            JCSPLogger.subExit();
            return;
        }
        CAPILogger.log("CertOpen*Store*", new Object[]{this.storeName}, readStore, new String[0]);
        throw new InvalidStoreException("CertOpen*Store* failed, store name: " + this.storeName + ", error: 0x" + Integer.toHexString(readStore), readStore);
    }
}
