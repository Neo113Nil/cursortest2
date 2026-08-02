package ru.CryptoPro.JCP.ASN.PKIXCMP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class CertResponse extends Asn1Type {
    public Asn1Integer certReqId;
    public CertifiedKeyPair certifiedKeyPair;
    public Asn1OctetString rspInfo;
    public PKIStatusInfo status;

    public CertResponse(long j, PKIStatusInfo pKIStatusInfo, CertifiedKeyPair certifiedKeyPair, byte[] bArr) {
        this.certReqId = new Asn1Integer(j);
        this.status = pKIStatusInfo;
        this.certifiedKeyPair = certifiedKeyPair;
        this.rspInfo = new Asn1OctetString(bArr);
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
        Asn1Integer asn1Integer = new Asn1Integer();
        this.certReqId = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PKIStatusInfo pKIStatusInfo = new PKIStatusInfo();
        this.status = pKIStatusInfo;
        pKIStatusInfo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            CertifiedKeyPair certifiedKeyPair = new CertifiedKeyPair();
            this.certifiedKeyPair = certifiedKeyPair;
            certifiedKeyPair.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            Asn1OctetString asn1OctetString = new Asn1OctetString();
            this.rspInfo = asn1OctetString;
            asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 0, (short) 0, 4)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Asn1OctetString asn1OctetString = this.rspInfo;
        int encode = asn1OctetString != null ? asn1OctetString.encode(asn1BerEncodeBuffer, true) : 0;
        CertifiedKeyPair certifiedKeyPair = this.certifiedKeyPair;
        if (certifiedKeyPair != null) {
            encode += certifiedKeyPair.encode(asn1BerEncodeBuffer, true);
        }
        int encode2 = this.certReqId.encode(asn1BerEncodeBuffer, true) + this.status.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.certReqId = null;
        this.status = null;
        this.certifiedKeyPair = null;
        this.rspInfo = null;
    }

    public CertResponse(Asn1Integer asn1Integer, PKIStatusInfo pKIStatusInfo, CertifiedKeyPair certifiedKeyPair, Asn1OctetString asn1OctetString) {
        this.certReqId = asn1Integer;
        this.status = pKIStatusInfo;
        this.certifiedKeyPair = certifiedKeyPair;
        this.rspInfo = asn1OctetString;
    }

    public CertResponse(Asn1Integer asn1Integer, PKIStatusInfo pKIStatusInfo) {
        this.certReqId = asn1Integer;
        this.status = pKIStatusInfo;
    }

    public CertResponse() {
    }

    public CertResponse(long j, PKIStatusInfo pKIStatusInfo) {
        this.certReqId = new Asn1Integer(j);
        this.status = pKIStatusInfo;
    }
}
