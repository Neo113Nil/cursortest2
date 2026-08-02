package ru.CryptoPro.JCP.Key;

import java.io.InputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* loaded from: classes4.dex */
public class KeyTwix {
    public final PrivateKey a;
    public final X509Certificate b;

    public KeyTwix(String str, String str2, InputStream inputStream, String str3) throws Exception {
        KeyStore keyStore = KeyStore.getInstance(str3, "JCP");
        char[] charArray = str2 == null ? null : str2.toCharArray();
        keyStore.load(inputStream, charArray);
        this.a = (PrivateKey) keyStore.getKey(str, charArray);
        this.b = (X509Certificate) keyStore.getCertificate(str);
    }

    public X509Certificate getCert() {
        return this.b;
    }

    public PrivateKey getPrivate() {
        return this.a;
    }

    public PublicKey getPublic() {
        return this.b.getPublicKey();
    }

    public KeyTwix(String str, String str2) throws Exception {
        this(str, str2, null, "HDImageStore");
    }

    public KeyTwix(String str) throws Exception {
        this(str, null, null, "HDImageStore");
    }

    public KeyTwix(PrivateKey privateKey, X509Certificate x509Certificate) {
        this.a = privateKey;
        this.b = x509Certificate;
    }
}
