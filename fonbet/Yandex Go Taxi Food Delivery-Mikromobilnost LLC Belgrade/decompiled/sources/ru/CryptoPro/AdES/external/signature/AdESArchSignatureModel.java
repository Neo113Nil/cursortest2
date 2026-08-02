package ru.CryptoPro.AdES.external.signature;

import defpackage.m8z0;
import defpackage.v2k0;
import java.util.List;

/* loaded from: classes4.dex */
public interface AdESArchSignatureModel extends AdESXLT1SignatureModel {
    List<m8z0> getCAdESArchiveTimestampTokens();

    @Override // ru.CryptoPro.AdES.external.signature.AdESXLT1SignatureModel
    /* synthetic */ List getCAdESCTimestampTokens();

    @Override // ru.CryptoPro.AdES.external.signature.AdESXLT1SignatureModel, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    /* synthetic */ List getCertificateValues();

    @Override // ru.CryptoPro.AdES.external.signature.AdESXLT1SignatureModel, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    /* synthetic */ List getCompleteCertificateReferences();

    @Override // ru.CryptoPro.AdES.external.signature.AdESXLT1SignatureModel, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    /* synthetic */ List getCompleteRevocationReferences();

    @Override // ru.CryptoPro.AdES.external.signature.AdESXLT1SignatureModel, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    /* synthetic */ v2k0 getRevocationValues();

    @Override // ru.CryptoPro.AdES.external.signature.AdESXLT1SignatureModel, ru.CryptoPro.AdES.external.signature.AdESTSignatureModel, ru.CryptoPro.AdES.external.decode.AdESTAttributeParametersDecoder
    /* synthetic */ List getSignatureTimestampTokens();
}
