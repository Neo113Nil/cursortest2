package ru.CryptoPro.AdES.evidence;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.SignatureOptions;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.tools.CRLUtility;

/* loaded from: classes4.dex */
public interface EvidenceCollector extends SignatureOptions, CertificateChainEvidenceBase, CRLUtility {
    void collect(List<CertificateItem> list, List<Evidence<?>> list2, boolean z) throws AdESException;

    @Override // ru.CryptoPro.AdES.tools.CRLUtility
    /* synthetic */ void setCRLs(Collection collection);

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
}
