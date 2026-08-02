package ru.CryptoPro.reprov;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertSelector;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.TrustAnchor;
import java.util.Set;
import ru.CryptoPro.reprov.certpath.DistributionPointFetcher;

/* loaded from: classes4.dex */
public class JCPPKIXBuilderParameters extends PKIXBuilderParameters {
    public static final Boolean USE_MS_VERIFY = Boolean.valueOf(DistributionPointFetcher.getBooleanProperty("ru.CryptoPro.reprov.use_ms_verify", false));
    public boolean a;

    public JCPPKIXBuilderParameters(KeyStore keyStore, CertSelector certSelector) throws KeyStoreException, InvalidAlgorithmParameterException {
        super(keyStore, certSelector);
        this.a = false;
    }

    public boolean isUseMicrosoftCheckOfCRL() {
        return this.a;
    }

    public void useMicrosoftCheckOfCRL() {
        this.a = true;
    }

    public void useRFCCheckOfCRL() {
        this.a = false;
    }

    public JCPPKIXBuilderParameters(Set set, CertSelector certSelector) throws InvalidAlgorithmParameterException {
        super((Set<TrustAnchor>) set, certSelector);
        this.a = false;
    }
}
