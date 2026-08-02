package ru.CryptoPro.AdES.timestamp;

import defpackage.m8z0;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.external.timestamp.data.TSPData;
import ru.CryptoPro.AdES.service.TSPServiceConnectorImpl;
import ru.CryptoPro.AdES.service.TSPServiceResponse;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class TSPTimeStampImpl implements TSPTimeStamp {
    protected m8z0 timeStampToken = null;
    protected String digestAlgorithm = null;
    protected String provider = null;

    @Override // ru.CryptoPro.AdES.timestamp.TSPTimeStamp
    public m8z0 get() {
        return this.timeStampToken;
    }

    @Override // ru.CryptoPro.AdES.timestamp.TSPTimeStamp
    public void retrieve(String str, TSPData tSPData) throws AdESException {
        JCPLogger.subEnter();
        tSPData.setDigestAlgorithm(this.digestAlgorithm);
        tSPData.setProvider(this.provider);
        byte[] digest = tSPData.getDigest();
        TSPServiceConnectorImpl tSPServiceConnectorImpl = new TSPServiceConnectorImpl(str);
        tSPServiceConnectorImpl.setImprint(digest);
        tSPServiceConnectorImpl.setProvider(this.provider);
        tSPServiceConnectorImpl.setDigestAlgorithm(this.digestAlgorithm);
        this.timeStampToken = ((TSPServiceResponse) tSPServiceConnectorImpl.getEncoded()).getResponse();
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.AdES.timestamp.TSPTimeStamp, ru.CryptoPro.AdES.tools.DigestUtility
    public void setDigestAlgorithm(String str) {
        this.digestAlgorithm = str;
    }

    @Override // ru.CryptoPro.AdES.timestamp.TSPTimeStamp, ru.CryptoPro.AdES.tools.ProviderUtility
    public void setProvider(String str) {
        this.provider = str;
    }
}
