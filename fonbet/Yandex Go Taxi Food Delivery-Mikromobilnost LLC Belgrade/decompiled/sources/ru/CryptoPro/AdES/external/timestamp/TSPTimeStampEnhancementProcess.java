package ru.CryptoPro.AdES.external.timestamp;

import defpackage.m8z0;
import java.util.Collection;
import java.util.Set;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.SignatureOptions;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.tools.CRLUtility;
import ru.CryptoPro.AdES.tools.CertificateUtility;
import ru.CryptoPro.AdES.tools.ProviderUtility;

/* loaded from: classes4.dex */
public interface TSPTimeStampEnhancementProcess extends SignatureOptions, CRLUtility, CertificateUtility, ProviderUtility {
    m8z0 enhance() throws AdESException;

    Integer getTimeStampEnhanceType();

    Integer getTimeStampType();

    @Override // ru.CryptoPro.AdES.tools.CRLUtility
    /* synthetic */ void setCRLs(Collection collection);

    @Override // ru.CryptoPro.AdES.tools.CertificateUtility
    /* synthetic */ void setCertificateValues(Set set);

    @Override // ru.CryptoPro.AdES.SignatureOptions
    /* synthetic */ void setOptions(Options options);

    @Override // ru.CryptoPro.AdES.tools.ProviderUtility
    /* synthetic */ void setProvider(String str);
}
