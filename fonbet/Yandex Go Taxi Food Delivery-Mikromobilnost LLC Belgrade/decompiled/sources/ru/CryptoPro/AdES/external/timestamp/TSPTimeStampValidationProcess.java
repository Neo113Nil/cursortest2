package ru.CryptoPro.AdES.external.timestamp;

import defpackage.m8z0;
import java.util.Collection;
import java.util.Date;
import java.util.Set;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.SignatureOptions;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.external.timestamp.data.TSPData;
import ru.CryptoPro.AdES.tools.CRLUtility;
import ru.CryptoPro.AdES.tools.CertificateUtility;

/* loaded from: classes4.dex */
public interface TSPTimeStampValidationProcess extends SignatureOptions, CRLUtility, CertificateUtility {
    TSPData getData();

    m8z0 getTimeStampToken();

    /* synthetic */ void setCRLs(Collection collection);

    /* synthetic */ void setCertificateValues(Set set);

    void setExternalDate(Date date);

    @Override // ru.CryptoPro.AdES.SignatureOptions
    /* synthetic */ void setOptions(Options options);

    void validate() throws AdESException;
}
