package ru.CryptoPro.AdES.timestamp;

import defpackage.m8z0;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.external.timestamp.data.TSPData;
import ru.CryptoPro.AdES.tools.DigestUtility;
import ru.CryptoPro.AdES.tools.ProviderUtility;

/* loaded from: classes4.dex */
public interface TSPTimeStamp extends DigestUtility, ProviderUtility {
    m8z0 get();

    void retrieve(String str, TSPData tSPData) throws AdESException;

    @Override // ru.CryptoPro.AdES.tools.DigestUtility
    /* synthetic */ void setDigestAlgorithm(String str);

    /* synthetic */ void setProvider(String str);
}
