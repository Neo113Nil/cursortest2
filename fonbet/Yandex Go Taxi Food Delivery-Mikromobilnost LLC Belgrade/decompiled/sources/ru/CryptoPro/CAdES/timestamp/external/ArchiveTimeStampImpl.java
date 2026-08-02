package ru.CryptoPro.CAdES.timestamp.external;

import defpackage.bcs0;
import defpackage.m8z0;
import defpackage.u87;
import defpackage.vc3;
import defpackage.xc3;
import java.io.IOException;
import java.util.ArrayList;
import org.bouncycastle.tsp.TSPException;
import ru.CryptoPro.AdES.AdESParameters;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.timestamp.data.TSPData;
import ru.CryptoPro.AdES.timestamp.TSPTimeStampImpl;
import ru.CryptoPro.CAdES.BufferedCAdESSignature;
import ru.CryptoPro.CAdES.CAdESSigner;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class ArchiveTimeStampImpl extends TSPTimeStampImpl {
    public final vc3 a;

    public ArchiveTimeStampImpl(vc3 vc3Var) {
        this.a = vc3Var;
    }

    @Override // ru.CryptoPro.AdES.timestamp.TSPTimeStampImpl, ru.CryptoPro.AdES.timestamp.TSPTimeStamp
    public void retrieve(String str, TSPData tSPData) throws AdESException {
        JCPLogger.subEnter();
        super.retrieve(str, tSPData);
        try {
            u87 u87Var = this.timeStampToken.a;
            BufferedCAdESSignature bufferedCAdESSignature = new BufferedCAdESSignature(u87Var.b.getEncoded(), null, AdESParameters.TSA_ARCHIVE_TIME_STAMP_SIMPLE);
            CAdESSigner[] cAdESSignerInfos = bufferedCAdESSignature.getCAdESSignerInfos();
            ArrayList arrayList = new ArrayList();
            for (CAdESSigner cAdESSigner : cAdESSignerInfos) {
                arrayList.add(cAdESSigner.getSignerInfo());
            }
            if (arrayList.size() > 1) {
                throw new AdESException("Invalid signer count.", IAdESException.ecTimestampInvalid);
            }
            CAdESSigner cAdESSignerInfo = bufferedCAdESSignature.getCAdESSignerInfo(0);
            arrayList.remove(cAdESSignerInfo.getSignerInfo());
            if (cAdESSignerInfo.getSignerUnsignedAttributes() != null) {
                throw new AdESException("Not empty unsigned attribute table.", IAdESException.ecTimestampInvalid);
            }
            CAdESSigner.replaceUnsignedAttributes(cAdESSignerInfo, new xc3(this.a));
            arrayList.add(cAdESSignerInfo.getSignerInfo());
            this.timeStampToken = new m8z0(BufferedCAdESSignature.replaceSigners(u87Var, new bcs0(arrayList)));
            JCPLogger.subExit();
        } catch (IOException e) {
            throw new AdESException(e, IAdESException.ecTimestampInvalid);
        } catch (TSPException e2) {
            throw new AdESException(e2, IAdESException.ecTimestampInvalid);
        } catch (AdESException e3) {
            throw e3;
        }
    }
}
