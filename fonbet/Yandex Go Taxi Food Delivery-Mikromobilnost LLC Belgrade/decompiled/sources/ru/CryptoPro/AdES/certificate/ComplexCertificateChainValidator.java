package ru.CryptoPro.AdES.certificate;

import defpackage.v2k0;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.evidence.SignerCertificateRole;
import ru.CryptoPro.AdES.evidence.StatusValidator;
import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public interface ComplexCertificateChainValidator extends CertificateChainValidator, SignerCertificateRole, StatusValidator {
    @Override // ru.CryptoPro.AdES.certificate.CertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateChainBase
    /* synthetic */ String getProvider();

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateChainBase
    /* synthetic */ Date getValidationDate();

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainValidator, ru.CryptoPro.AdES.tools.CRLUtility
    /* synthetic */ void setCRLs(Collection collection);

    @Override // ru.CryptoPro.AdES.evidence.SignerCertificateRole
    /* synthetic */ void setCertificateRole(CertificateItem.CertificateRole certificateRole);

    @Override // ru.CryptoPro.AdES.evidence.StatusValidator
    /* synthetic */ void setCompleteCertificateReferences(List list);

    @Override // ru.CryptoPro.AdES.evidence.StatusValidator
    /* synthetic */ void setCompleteRevocationReferences(List list);

    void setEnableRevocationReferenceSearchByRevocationValue(boolean z);

    void setNeedOfIssuerSerial(boolean z);

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateChainBase, ru.CryptoPro.AdES.tools.ProviderUtility
    /* synthetic */ void setProvider(String str);

    @Override // ru.CryptoPro.AdES.evidence.StatusValidator
    /* synthetic */ void setRevocationValues(v2k0 v2k0Var);

    @Override // ru.CryptoPro.AdES.evidence.StatusValidator
    /* synthetic */ void setSignerMustHaveOcspEvidence(boolean z);

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateChainBase
    /* synthetic */ void setValidationDate(Date date);

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainValidator
    /* synthetic */ void validate(List list, List list2) throws AdESException;
}
