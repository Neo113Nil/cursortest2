package ru.CryptoPro.AdES.certificate;

import java.util.Date;
import ru.CryptoPro.AdES.tools.ProviderUtility;

/* loaded from: classes4.dex */
public interface CertificateChainBase extends ProviderUtility {
    String getProvider();

    Date getValidationDate();

    @Override // ru.CryptoPro.AdES.tools.ProviderUtility
    /* synthetic */ void setProvider(String str);

    void setValidationDate(Date date);
}
