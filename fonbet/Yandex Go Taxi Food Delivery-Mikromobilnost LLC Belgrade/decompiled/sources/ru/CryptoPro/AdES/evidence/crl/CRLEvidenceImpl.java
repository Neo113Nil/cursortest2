package ru.CryptoPro.AdES.evidence.crl;

import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.List;
import ru.CryptoPro.AdES.evidence.AbstractEvidence;
import ru.CryptoPro.AdES.evidence.Evidence;

/* loaded from: classes4.dex */
public class CRLEvidenceImpl extends AbstractEvidence<X509CRL> {
    private final X509CRL crl;

    public CRLEvidenceImpl(X509CRL x509crl, X509Certificate x509Certificate, X509Certificate x509Certificate2, List<X509Certificate> list, List<X509Certificate> list2) {
        super(x509Certificate, x509Certificate2, list, list2);
        this.crl = x509crl;
    }

    @Override // ru.CryptoPro.AdES.evidence.AbstractEvidence, ru.CryptoPro.AdES.evidence.Evidence
    public Evidence.EvidenceType getType() {
        return Evidence.EvidenceType.etCRL;
    }

    @Override // ru.CryptoPro.AdES.evidence.AbstractEvidence, ru.CryptoPro.AdES.evidence.Evidence
    public X509CRL getEvidence() {
        return this.crl;
    }
}
