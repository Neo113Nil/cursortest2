package ru.cprocsp.ACSPTLSProxy.store;

import java.security.KeyStore;
import java.security.cert.X509Certificate;
import ru.CryptoPro.JCP.KeyStore.StoreInputStream;
import ru.cprocsp.NGate.tools.log.Logger;

/* loaded from: classes4.dex */
public class KeyDispatcher {
    public static boolean deleteKeyContainer(String str, String str2) {
        try {
            KeyStore keyStore = KeyStore.getInstance(str, "JCSP");
            keyStore.load(new StoreInputStream(str2), null);
            keyStore.deleteEntry(str2);
            return true;
        } catch (Exception e) {
            Logger.e("Key container deleting failed", e);
            return false;
        }
    }

    public static X509Certificate getCertificate(String str, String str2) {
        try {
            KeyStore keyStore = KeyStore.getInstance(str, "JCSP");
            keyStore.load(new StoreInputStream(str2), null);
            return (X509Certificate) keyStore.getCertificate(str2);
        } catch (Exception e) {
            Logger.e(e.getMessage(), e);
            return null;
        }
    }
}
