package ru.CryptoPro.AdES.certificate;

import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import ru.CryptoPro.AdES.BaseParameterValidator;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.tools.CRLUtility;
import ru.CryptoPro.JCP.Util.GetProperty;

/* loaded from: classes4.dex */
public interface CertificateChainValidator extends CertificateChainBase, CRLUtility {
    public static final boolean PARAM_SUN_CRL_DP = GetProperty.getBooleanProperty("com.sun.security.enableCRLDP", false);
    public static final boolean PARAM_IBM_CRL_DP = GetProperty.getBooleanProperty("com.ibm.security.enableCRLDP", false);
    public static final boolean PARAM_OCSP = GetProperty.getBooleanProperty("ocsp.enable", false, true);

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainBase
    /* synthetic */ String getProvider();

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainBase
    /* synthetic */ Date getValidationDate();

    /* synthetic */ void setCRLs(Collection collection);

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainBase, ru.CryptoPro.AdES.tools.ProviderUtility
    /* synthetic */ void setProvider(String str);

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainBase
    /* synthetic */ void setValidationDate(Date date);

    void validate(List<X509Certificate> list, List<BaseParameterValidator<X509Certificate>> list2) throws AdESException;
}
