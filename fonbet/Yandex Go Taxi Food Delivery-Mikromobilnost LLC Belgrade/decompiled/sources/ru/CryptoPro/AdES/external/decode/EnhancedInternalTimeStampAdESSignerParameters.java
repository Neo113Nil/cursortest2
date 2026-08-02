package ru.CryptoPro.AdES.external.decode;

import java.util.Date;
import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public interface EnhancedInternalTimeStampAdESSignerParameters extends InternalTimeStampCAdESSignerParameters {
    @Override // ru.CryptoPro.AdES.external.decode.InternalTimeStampCAdESSignerParameters
    /* synthetic */ void setContent(byte[] bArr) throws AdESException;

    @Override // ru.CryptoPro.AdES.external.decode.InternalTimeStampCAdESSignerParameters
    /* synthetic */ void setExternalDate(Date date);

    void setParentalDecoder(AdESXLongType1AttributeDecoder adESXLongType1AttributeDecoder);

    void updateIfNeed() throws AdESException;
}
