package ru.CryptoPro.ssl;

import java.security.KeyStore;
import java.security.cert.PKIXBuilderParameters;

/* loaded from: classes4.dex */
public class JavaTLSCertPathManagerParameters extends JavaTLSKeyStoreParameter {
    public PKIXBuilderParameters d;
    public boolean e;
    public boolean f;

    public JavaTLSCertPathManagerParameters(KeyStore keyStore, char[] cArr) {
        super(keyStore, cArr, false);
        this.e = false;
        this.f = true;
    }

    public PKIXBuilderParameters getParameters() {
        PKIXBuilderParameters pKIXBuilderParameters = this.d;
        if (pKIXBuilderParameters != null) {
            return (PKIXBuilderParameters) pKIXBuilderParameters.clone();
        }
        return null;
    }

    public boolean isTlsClientCertPathCheck() {
        return this.f;
    }

    public boolean isTlsClientDisableIssuerCheck() {
        return this.e;
    }

    public void setParameters(PKIXBuilderParameters pKIXBuilderParameters) {
        this.d = pKIXBuilderParameters;
    }

    public void setTlsClientCertPathCheck() {
        this.f = true;
    }

    public void setTlsServerCertPathCheck() {
        this.f = false;
    }

    public void tlsClientDisableIssuerCheck() {
        this.e = true;
    }
}
