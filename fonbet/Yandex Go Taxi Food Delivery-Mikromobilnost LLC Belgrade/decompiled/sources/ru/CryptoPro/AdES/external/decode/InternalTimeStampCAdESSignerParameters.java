package ru.CryptoPro.AdES.external.decode;

import java.util.Date;
import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public interface InternalTimeStampCAdESSignerParameters {
    void setContent(byte[] bArr) throws AdESException;

    void setExternalDate(Date date);
}
