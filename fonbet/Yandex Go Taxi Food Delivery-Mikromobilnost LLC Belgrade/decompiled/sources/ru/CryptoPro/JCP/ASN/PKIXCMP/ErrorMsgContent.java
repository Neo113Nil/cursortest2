package ru.CryptoPro.JCP.ASN.PKIXCMP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.CPPKIXCMP.PKIFreeText;

/* loaded from: classes4.dex */
public class ErrorMsgContent extends Asn1Type {
    public Asn1Integer errorCode;
    public PKIFreeText errorDetails;
    public PKIStatusInfo pKIStatusInfo;

    public ErrorMsgContent(PKIStatusInfo pKIStatusInfo, long j, PKIFreeText pKIFreeText) {
        this.pKIStatusInfo = pKIStatusInfo;
        this.errorCode = new Asn1Integer(j);
        this.errorDetails = pKIFreeText;
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
        this.pKIStatusInfo = pKIStatusInfo;
        pKIStatusInfo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            Asn1Integer asn1Integer = new Asn1Integer();
            this.errorCode = asn1Integer;
            asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            PKIFreeText pKIFreeText = new PKIFreeText();
            this.errorDetails = pKIFreeText;
            pKIFreeText.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 0, (short) 0, 2)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        PKIFreeText pKIFreeText = this.errorDetails;
        int encode = pKIFreeText != null ? pKIFreeText.encode(asn1BerEncodeBuffer, true) : 0;
        Asn1Integer asn1Integer = this.errorCode;
        if (asn1Integer != null) {
            encode += asn1Integer.encode(asn1BerEncodeBuffer, true);
        }
        int encode2 = this.pKIStatusInfo.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.pKIStatusInfo = null;
        this.errorCode = null;
        this.errorDetails = null;
    }

    public ErrorMsgContent(PKIStatusInfo pKIStatusInfo, Asn1Integer asn1Integer, PKIFreeText pKIFreeText) {
        this.pKIStatusInfo = pKIStatusInfo;
        this.errorCode = asn1Integer;
        this.errorDetails = pKIFreeText;
    }

    public ErrorMsgContent(PKIStatusInfo pKIStatusInfo) {
        this.pKIStatusInfo = pKIStatusInfo;
    }

    public ErrorMsgContent() {
    }
}
