package ru.CryptoPro.AdES.external.timestamp.data;

import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.tools.DigestUtility;
import ru.CryptoPro.AdES.tools.ProviderUtility;

/* loaded from: classes4.dex */
public interface TSPData extends DigestUtility, ProviderUtility {
    byte[] getDigest() throws AdESException;

    String getProvider();

    @Override // ru.CryptoPro.AdES.tools.DigestUtility
    /* synthetic */ void setDigestAlgorithm(String str);

    /* synthetic */ void setProvider(String str);

    void validateImprint(byte[] bArr) throws AdESException;
}
