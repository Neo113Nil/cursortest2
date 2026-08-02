package ru.CryptoPro.AdES.evidence;

import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import ru.CryptoPro.AdES.tools.CRLUtility;

/* loaded from: classes4.dex */
public abstract class AbstractCertificateChainEvidence implements CertificateChainEvidenceBase, CRLUtility {
    protected String provider = null;
    protected Date internalDate = null;
    protected Date externalDate = null;
    protected boolean ignoreEvidenceTime = false;
    protected final Set<X509Certificate> additionalCertificateValues = new HashSet();
    protected final Set<X509CRL> additionalCRLs = new HashSet();

    @Override // ru.CryptoPro.AdES.tools.CRLUtility
    public void setCRLs(Collection<X509CRL> collection) {
        this.additionalCRLs.addAll(collection);
    }

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBase, ru.CryptoPro.AdES.tools.CertificateUtility
    public void setCertificateValues(Set<X509Certificate> set) {
        this.additionalCertificateValues.addAll(set);
    }

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBase
    public void setExternalDate(Date date) {
        this.externalDate = date;
    }

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBase
    public void setIgnoreEvidenceTime(boolean z) {
        this.ignoreEvidenceTime = z;
    }

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBase
    public void setInternalDate(Date date) {
        this.internalDate = date;
    }

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBase, ru.CryptoPro.AdES.tools.ProviderUtility
    public void setProvider(String str) {
        this.provider = str;
    }
}
