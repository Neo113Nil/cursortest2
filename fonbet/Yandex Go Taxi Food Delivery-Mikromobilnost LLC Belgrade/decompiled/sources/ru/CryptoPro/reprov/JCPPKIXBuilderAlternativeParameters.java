package ru.CryptoPro.reprov;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertSelector;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.TrustAnchor;
import java.util.Set;

/* loaded from: classes4.dex */
public class JCPPKIXBuilderAlternativeParameters extends PKIXBuilderParameters {
    public String a;
    public String b;

    public JCPPKIXBuilderAlternativeParameters(KeyStore keyStore, CertSelector certSelector) throws KeyStoreException, InvalidAlgorithmParameterException {
        super(keyStore, certSelector);
        this.a = "PKIX";
        this.b = null;
    }

    public String getPkixAlgorithm() {
        return this.a;
    }

    public String getPkixProvider() {
        return this.b;
    }

    public void setPkixAlgorithm(String str) {
        this.a = str;
    }

    public void setPkixProvider(String str) {
        this.b = str;
    }

    public JCPPKIXBuilderAlternativeParameters(Set set, CertSelector certSelector) throws InvalidAlgorithmParameterException {
        super((Set<TrustAnchor>) set, certSelector);
        this.a = "PKIX";
        this.b = null;
    }
}
