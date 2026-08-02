package ru.CryptoPro.JCP.ASN.PKIXCMP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.CPPKIXCMP.PKIFreeText;

/* loaded from: classes4.dex */
public class PKIStatusInfo extends Asn1Type {
    public PKIFailureInfo failInfo;
    public PKIStatus status;
    public PKIFreeText statusString;

    public PKIStatusInfo(long j, PKIFreeText pKIFreeText, PKIFailureInfo pKIFailureInfo) {
        this.status = new PKIStatus(j);
        this.statusString = pKIFreeText;
        this.failInfo = pKIFailureInfo;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PKIStatus pKIStatus = new PKIStatus();
        this.status = pKIStatus;
        pKIStatus.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            PKIFreeText pKIFreeText = new PKIFreeText();
            this.statusString = pKIFreeText;
            pKIFreeText.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 3, intHolder, false)) {
            PKIFailureInfo pKIFailureInfo = new PKIFailureInfo();
            this.failInfo = pKIFailureInfo;
            pKIFailureInfo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 0, (short) 0, 3)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        PKIFailureInfo pKIFailureInfo = this.failInfo;
        int encode = pKIFailureInfo != null ? pKIFailureInfo.encode(asn1BerEncodeBuffer, true) : 0;
        PKIFreeText pKIFreeText = this.statusString;
        if (pKIFreeText != null) {
            encode += pKIFreeText.encode(asn1BerEncodeBuffer, true);
        }
        int encode2 = this.status.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.status = null;
        this.statusString = null;
        this.failInfo = null;
    }

    public PKIStatusInfo(PKIStatus pKIStatus, PKIFreeText pKIFreeText, PKIFailureInfo pKIFailureInfo) {
        this.status = pKIStatus;
        this.statusString = pKIFreeText;
        this.failInfo = pKIFailureInfo;
    }

    public PKIStatusInfo(PKIStatus pKIStatus) {
        this.status = pKIStatus;
    }

    public PKIStatusInfo() {
    }

    public PKIStatusInfo(long j) {
        this.status = new PKIStatus(j);
    }
}
