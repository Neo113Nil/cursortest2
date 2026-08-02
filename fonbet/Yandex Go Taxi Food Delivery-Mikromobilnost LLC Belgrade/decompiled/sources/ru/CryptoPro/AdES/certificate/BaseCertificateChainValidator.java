package ru.CryptoPro.AdES.certificate;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public interface BaseCertificateChainValidator extends CertificateChainValidator, CertificateValidation {
    @Override // ru.CryptoPro.AdES.certificate.CertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateChainBase
    /* synthetic */ String getProvider();

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateChainBase
    /* synthetic */ Date getValidationDate();

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainValidator, ru.CryptoPro.AdES.tools.CRLUtility
    /* synthetic */ void setCRLs(Collection collection);

    @Override // ru.CryptoPro.AdES.certificate.CertificateValidation
    /* synthetic */ void setEnableCertificateValidation(boolean z);

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateChainBase, ru.CryptoPro.AdES.tools.ProviderUtility
    /* synthetic */ void setProvider(String str);

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateChainBase
    /* synthetic */ void setValidationDate(Date date);

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainValidator
    /* synthetic */ void validate(List list, List list2) throws AdESException;
}
