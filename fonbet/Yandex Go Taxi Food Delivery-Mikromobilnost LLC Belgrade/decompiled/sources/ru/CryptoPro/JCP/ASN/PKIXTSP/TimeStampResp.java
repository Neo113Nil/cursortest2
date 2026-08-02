package ru.CryptoPro.JCP.ASN.PKIXTSP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIStatusInfo;

/* loaded from: classes4.dex */
public class TimeStampResp extends Asn1Type {
    public PKIStatusInfo status;
    public TimeStampToken timeStampToken;

    public TimeStampResp(PKIStatusInfo pKIStatusInfo, TimeStampToken timeStampToken) {
        this.status = pKIStatusInfo;
        this.timeStampToken = timeStampToken;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PKIStatusInfo pKIStatusInfo = new PKIStatusInfo();
        this.status = pKIStatusInfo;
        pKIStatusInfo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            TimeStampToken timeStampToken = new TimeStampToken();
            this.timeStampToken = timeStampToken;
            timeStampToken.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 32, 16)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        TimeStampToken timeStampToken = this.timeStampToken;
        int encode = this.status.encode(asn1BerEncodeBuffer, true) + (timeStampToken != null ? timeStampToken.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.status = null;
        this.timeStampToken = null;
    }

    public TimeStampResp() {
    }

    public TimeStampResp(PKIStatusInfo pKIStatusInfo) {
        this.status = pKIStatusInfo;
    }
}
