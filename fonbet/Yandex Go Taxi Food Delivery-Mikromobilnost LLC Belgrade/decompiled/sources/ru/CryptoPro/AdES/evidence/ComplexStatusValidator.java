package ru.CryptoPro.AdES.evidence;

import defpackage.v2k0;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.tools.CertificateUtility;

/* loaded from: classes4.dex */
public interface ComplexStatusValidator extends StatusValidator, CertificateUtility {
    List<X509Certificate> getEvidenceChain();

    @Override // ru.CryptoPro.AdES.tools.CertificateUtility
    /* synthetic */ void setCertificateValues(Set set);

    @Override // ru.CryptoPro.AdES.evidence.StatusValidator
    /* synthetic */ void setCompleteCertificateReferences(List list);

    @Override // ru.CryptoPro.AdES.evidence.StatusValidator
    /* synthetic */ void setCompleteRevocationReferences(List list);

    void setExternalDate(Date date);

    void setIgnoreEvidenceTime(boolean z);

    void setInternalDate(Date date);

    void setProvider(String str);

    @Override // ru.CryptoPro.AdES.evidence.StatusValidator
    /* synthetic */ void setRevocationValues(v2k0 v2k0Var);

    @Override // ru.CryptoPro.AdES.evidence.StatusValidator
    /* synthetic */ void setSignerMustHaveOcspEvidence(boolean z);

    void setValidationDate(Date date);
}
