package ru.CryptoPro.AdES.evidence;

import java.util.Date;
import java.util.Set;
import ru.CryptoPro.AdES.tools.CertificateUtility;
import ru.CryptoPro.AdES.tools.ProviderUtility;

/* loaded from: classes4.dex */
public interface CertificateChainEvidenceBase extends CertificateUtility, ProviderUtility {
    @Override // ru.CryptoPro.AdES.tools.CertificateUtility
    /* synthetic */ void setCertificateValues(Set set);

    void setExternalDate(Date date);

    void setIgnoreEvidenceTime(boolean z);

    void setInternalDate(Date date);

    /* synthetic */ void setProvider(String str);
}
