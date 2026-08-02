package ru.CryptoPro.AdES.evidence;

import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public abstract class AbstractEvidenceSingleCollector<T> extends AbstractCertificateChainEvidence implements SingleEvidenceCollector<T> {
    protected final List<X509Certificate> certificateChain = new LinkedList();
    protected final Set<X509CRL> additionalCRLs = new HashSet();
    protected boolean signerMustHaveOcspEvidence = false;
    protected AdESException thrownException = null;

    @Override // ru.CryptoPro.AdES.evidence.SingleEvidenceCollector
    public AdESException getException() {
        return this.thrownException;
    }

    @Override // ru.CryptoPro.AdES.evidence.SingleEvidenceCollector
    public abstract /* synthetic */ Evidence make(CertificateItem certificateItem, X509Certificate x509Certificate) throws AdESException;

    @Override // ru.CryptoPro.AdES.evidence.AbstractCertificateChainEvidence, ru.CryptoPro.AdES.tools.CRLUtility
    public void setCRLs(Collection<X509CRL> collection) {
        this.additionalCRLs.addAll(collection);
    }

    @Override // ru.CryptoPro.AdES.evidence.SingleEvidenceCollector
    public void setCheckableCertificateChain(List<X509Certificate> list) {
        this.certificateChain.addAll(list);
    }

    @Override // ru.CryptoPro.AdES.evidence.SingleEvidenceCollector, ru.CryptoPro.AdES.evidence.SignerCertificateEvidenceTypeAcquirable
    public void setSignerMustHaveOcspEvidence(boolean z) {
        this.signerMustHaveOcspEvidence = z;
    }
}
