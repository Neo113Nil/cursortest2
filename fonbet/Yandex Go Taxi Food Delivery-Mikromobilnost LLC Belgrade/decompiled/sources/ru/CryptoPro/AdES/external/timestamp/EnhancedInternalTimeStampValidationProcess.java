package ru.CryptoPro.AdES.external.timestamp;

import defpackage.m8z0;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.Set;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder;
import ru.CryptoPro.AdES.external.timestamp.data.TSPData;

/* loaded from: classes4.dex */
public interface EnhancedInternalTimeStampValidationProcess extends TSPTimeStampValidationProcess {
    Set<X509Certificate> getCertificateValues();

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess
    /* synthetic */ TSPData getData();

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess
    /* synthetic */ m8z0 getTimeStampToken();

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess, ru.CryptoPro.AdES.tools.CRLUtility
    /* synthetic */ void setCRLs(Collection collection);

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess, ru.CryptoPro.AdES.tools.CertificateUtility
    /* synthetic */ void setCertificateValues(Set set);

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess
    /* synthetic */ void setExternalDate(Date date);

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess, ru.CryptoPro.AdES.SignatureOptions
    /* synthetic */ void setOptions(Options options);

    void setParentalDecoder(AdESXLongType1AttributeDecoder adESXLongType1AttributeDecoder);

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess
    /* synthetic */ void validate() throws AdESException;
}
