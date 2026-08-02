package ru.CryptoPro.AdES.external.decode;

import defpackage.cr80;
import defpackage.v2k0;
import java.util.Date;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public interface AdESXLongType1AttributeDecoder extends AdESTAttributeDecoder, AdESXLongType1AttributeParametersDecoder, ParentalDecoder {
    @Override // ru.CryptoPro.AdES.external.decode.AdESTAttributeDecoder
    /* synthetic */ void decode() throws AdESException;

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    /* synthetic */ List getCertificateValues();

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    /* synthetic */ List getCompleteCertificateReferences();

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    /* synthetic */ List getCompleteRevocationReferences();

    @Override // ru.CryptoPro.AdES.external.decode.AdESTAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder
    /* synthetic */ Set getExistingCertificateValues();

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    /* synthetic */ v2k0 getRevocationValues();

    @Override // ru.CryptoPro.AdES.external.decode.AdESTAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESTAttributeParametersDecoder
    /* synthetic */ List getSignatureTimestampTokens();

    @Override // ru.CryptoPro.AdES.external.decode.AdESTAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder
    /* synthetic */ cr80 getSignerCertificateReference();

    @Override // ru.CryptoPro.AdES.external.decode.AdESTAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder
    /* synthetic */ Date getSigningTime();

    /* synthetic */ void setParentalDecoder(AdESXLongType1AttributeDecoder adESXLongType1AttributeDecoder);

    @Override // ru.CryptoPro.AdES.external.decode.AdESTAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder
    /* synthetic */ void setProvider(String str);
}
