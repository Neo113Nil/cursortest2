package ru.CryptoPro.AdES.evidence;

import defpackage.cr80;
import defpackage.v2k0;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.SignatureOptions;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder;
import ru.CryptoPro.AdES.tools.CRLUtility;

/* loaded from: classes4.dex */
public interface CertificateChainEvidenceBuilder extends SignatureOptions, CertificateChainEvidenceBase, SignerCertificateEvidenceTypeAcquirable, SignerCertificateRole, AdESXLongType1AttributeParametersDecoder, CRLUtility {
    void build(List<X509Certificate> list) throws AdESException;

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    /* synthetic */ List getCertificateValues();

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    /* synthetic */ List getCompleteCertificateReferences();

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    /* synthetic */ List getCompleteRevocationReferences();

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    /* synthetic */ v2k0 getRevocationValues();

    cr80 getSignerCertificateReference();

    @Override // ru.CryptoPro.AdES.tools.CRLUtility
    /* synthetic */ void setCRLs(Collection collection);

    @Override // ru.CryptoPro.AdES.evidence.SignerCertificateRole
    /* synthetic */ void setCertificateRole(CertificateItem.CertificateRole certificateRole);

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBase, ru.CryptoPro.AdES.tools.CertificateUtility
    /* synthetic */ void setCertificateValues(Set set);

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBase
    /* synthetic */ void setExternalDate(Date date);

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBase
    /* synthetic */ void setIgnoreEvidenceTime(boolean z);

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBase
    /* synthetic */ void setInternalDate(Date date);

    @Override // ru.CryptoPro.AdES.SignatureOptions
    /* synthetic */ void setOptions(Options options);

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBase, ru.CryptoPro.AdES.tools.ProviderUtility
    /* synthetic */ void setProvider(String str);

    @Override // ru.CryptoPro.AdES.evidence.SignerCertificateEvidenceTypeAcquirable
    /* synthetic */ void setSignerMustHaveOcspEvidence(boolean z);
}
