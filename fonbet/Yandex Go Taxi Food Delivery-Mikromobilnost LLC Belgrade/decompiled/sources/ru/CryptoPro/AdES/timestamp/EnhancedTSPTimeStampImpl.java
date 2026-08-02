package ru.CryptoPro.AdES.timestamp;

import defpackage.m8z0;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.external.timestamp.TSPTimeStampEnhancementProcess;

/* loaded from: classes4.dex */
public class EnhancedTSPTimeStampImpl extends TSPTimeStampImpl implements EnhancedTSPTimeStamp {
    @Override // ru.CryptoPro.AdES.timestamp.EnhancedTSPTimeStamp
    public m8z0 enhance(TSPTimeStampEnhancementProcess tSPTimeStampEnhancementProcess) throws AdESException {
        return tSPTimeStampEnhancementProcess.enhance();
    }
}
