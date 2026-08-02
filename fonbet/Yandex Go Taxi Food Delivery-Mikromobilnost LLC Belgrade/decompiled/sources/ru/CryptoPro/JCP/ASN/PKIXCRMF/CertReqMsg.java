package ru.CryptoPro.JCP.ASN.PKIXCRMF;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class CertReqMsg extends Asn1Type {
    public CertRequest certReq;
    public ProofOfPossession pop;
    public CertReqMsg_regInfo regInfo;

    public CertReqMsg(CertRequest certRequest, ProofOfPossession proofOfPossession, CertReqMsg_regInfo certReqMsg_regInfo) {
        this.certReq = certRequest;
        this.pop = proofOfPossession;
        this.regInfo = certReqMsg_regInfo;
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
        CertRequest certRequest = new CertRequest();
        this.certReq = certRequest;
        certRequest.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.expired()) {
            Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
            if (peekTag.equals((short) 128, (short) 0, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3)) {
                ProofOfPossession proofOfPossession = new ProofOfPossession();
                this.pop = proofOfPossession;
                proofOfPossession.decode(asn1BerDecodeBuffer, true, intHolder.value);
            }
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            CertReqMsg_regInfo certReqMsg_regInfo = new CertReqMsg_regInfo();
            this.regInfo = certReqMsg_regInfo;
            certReqMsg_regInfo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 32, 16)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        CertReqMsg_regInfo certReqMsg_regInfo = this.regInfo;
        int encode = certReqMsg_regInfo != null ? certReqMsg_regInfo.encode(asn1BerEncodeBuffer, true) : 0;
        ProofOfPossession proofOfPossession = this.pop;
        if (proofOfPossession != null) {
            encode += proofOfPossession.encode(asn1BerEncodeBuffer, true);
        }
        int encode2 = this.certReq.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.certReq = null;
        this.pop = null;
        this.regInfo = null;
    }

    public CertReqMsg() {
    }

    public CertReqMsg(CertRequest certRequest) {
        this.certReq = certRequest;
    }
}
