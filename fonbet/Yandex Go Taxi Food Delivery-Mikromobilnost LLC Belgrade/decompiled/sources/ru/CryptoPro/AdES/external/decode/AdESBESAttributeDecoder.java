package ru.CryptoPro.AdES.external.decode;

import defpackage.cr80;
import java.util.Date;
import java.util.Set;
import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public interface AdESBESAttributeDecoder extends AdESAttributeDecoder<cr80> {
    @Override // ru.CryptoPro.AdES.external.decode.AdESTAttributeDecoder
    /* synthetic */ void decode() throws AdESException;

    @Override // ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder
    /* synthetic */ Set getExistingCertificateValues();

    @Override // ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder
    /* synthetic */ cr80 getSignerCertificateReference();

    Date getSigningTime();

    @Override // ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder
    /* synthetic */ void setProvider(String str);
}
