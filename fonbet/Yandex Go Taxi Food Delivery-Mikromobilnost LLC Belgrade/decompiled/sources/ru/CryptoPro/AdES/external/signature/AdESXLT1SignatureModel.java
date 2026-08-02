package ru.CryptoPro.AdES.external.signature;

import defpackage.m8z0;
import defpackage.v2k0;
import java.util.List;
import ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder;

/* loaded from: classes4.dex */
public interface AdESXLT1SignatureModel extends AdESXLongType1AttributeParametersDecoder, AdESTSignatureModel {
    List<m8z0> getCAdESCTimestampTokens();

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    /* synthetic */ List getCertificateValues();

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    /* synthetic */ List getCompleteCertificateReferences();

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    /* synthetic */ List getCompleteRevocationReferences();

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    /* synthetic */ v2k0 getRevocationValues();

    /* synthetic */ List getSignatureTimestampTokens();
}
