package ru.CryptoPro.AdES.evidence;

import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.tools.CRLUtility;

/* loaded from: classes4.dex */
public interface SingleEvidenceCollector<T> extends CertificateChainEvidenceBase, SignerCertificateEvidenceTypeAcquirable, CRLUtility {
    AdESException getException();

    Evidence<T> make(CertificateItem certificateItem, X509Certificate x509Certificate) throws AdESException;

    @Override // ru.CryptoPro.AdES.tools.CRLUtility
    /* synthetic */ void setCRLs(Collection collection);

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBase, ru.CryptoPro.AdES.tools.CertificateUtility
    /* synthetic */ void setCertificateValues(Set set);

    void setCheckableCertificateChain(List<X509Certificate> list);

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBase
    /* synthetic */ void setExternalDate(Date date);

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBase
    /* synthetic */ void setIgnoreEvidenceTime(boolean z);

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBase
    /* synthetic */ void setInternalDate(Date date);

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBase, ru.CryptoPro.AdES.tools.ProviderUtility
    /* synthetic */ void setProvider(String str);

    @Override // ru.CryptoPro.AdES.evidence.SignerCertificateEvidenceTypeAcquirable
    /* synthetic */ void setSignerMustHaveOcspEvidence(boolean z);
}
