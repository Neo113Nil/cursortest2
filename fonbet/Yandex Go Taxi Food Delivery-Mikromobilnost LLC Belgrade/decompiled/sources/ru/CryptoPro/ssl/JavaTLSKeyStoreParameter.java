package ru.CryptoPro.ssl;

import java.security.KeyStore;
import javax.net.ssl.ManagerFactoryParameters;

/* loaded from: classes4.dex */
public class JavaTLSKeyStoreParameter implements ManagerFactoryParameters {
    public final KeyStore a;
    public final char[] b;
    public final boolean c;

    public JavaTLSKeyStoreParameter(KeyStore keyStore, char[] cArr, boolean z) {
        this.a = keyStore;
        this.c = z;
        if (cArr == null) {
            this.b = null;
            return;
        }
        char[] cArr2 = new char[cArr.length];
        this.b = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    public KeyStore getKeyStore() {
        return this.a;
    }

    public char[] getPassword() {
        return this.b;
    }

    public boolean isFromDefaultContext() {
        return this.c;
    }
}
