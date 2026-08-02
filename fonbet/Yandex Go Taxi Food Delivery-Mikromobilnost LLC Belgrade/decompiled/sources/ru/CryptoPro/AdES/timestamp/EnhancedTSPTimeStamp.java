package ru.CryptoPro.AdES.timestamp;

import defpackage.m8z0;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.external.timestamp.TSPTimeStampEnhancementProcess;
import ru.CryptoPro.AdES.external.timestamp.data.TSPData;

/* loaded from: classes4.dex */
public interface EnhancedTSPTimeStamp extends TSPTimeStamp {
    m8z0 enhance(TSPTimeStampEnhancementProcess tSPTimeStampEnhancementProcess) throws AdESException;

    @Override // ru.CryptoPro.AdES.timestamp.TSPTimeStamp
    /* synthetic */ m8z0 get();

    @Override // ru.CryptoPro.AdES.timestamp.TSPTimeStamp
    /* synthetic */ void retrieve(String str, TSPData tSPData) throws AdESException;

    @Override // ru.CryptoPro.AdES.timestamp.TSPTimeStamp, ru.CryptoPro.AdES.tools.DigestUtility
    /* synthetic */ void setDigestAlgorithm(String str);

    @Override // ru.CryptoPro.AdES.timestamp.TSPTimeStamp, ru.CryptoPro.AdES.tools.ProviderUtility
    /* synthetic */ void setProvider(String str);
}
