package ru.CryptoPro.AdES.external.decode;

import defpackage.cr80;
import java.util.Date;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public interface AdESTAttributeDecoder extends AdESBESAttributeDecoder, AdESTAttributeParametersDecoder {
    /* synthetic */ void decode() throws AdESException;

    @Override // ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder
    /* synthetic */ Set getExistingCertificateValues();

    @Override // ru.CryptoPro.AdES.external.decode.AdESTAttributeParametersDecoder
    /* synthetic */ List getSignatureTimestampTokens();

    @Override // ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder
    /* synthetic */ cr80 getSignerCertificateReference();

    @Override // ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder
    /* synthetic */ Date getSigningTime();

    @Override // ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder
    /* synthetic */ void setProvider(String str);
}
