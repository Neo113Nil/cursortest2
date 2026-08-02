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

/* loaded from: classes4.dex */
public class CertRepMessage extends Asn1Type {
    public CertRepMessage_caPubs caPubs;
    public _SeqOfCertResponse response;

    public CertRepMessage(CertRepMessage_caPubs certRepMessage_caPubs, _SeqOfCertResponse _seqofcertresponse) {
        this.caPubs = certRepMessage_caPubs;
        this.response = _seqofcertresponse;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, false)) {
            CertRepMessage_caPubs certRepMessage_caPubs = new CertRepMessage_caPubs();
            this.caPubs = certRepMessage_caPubs;
            certRepMessage_caPubs.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        _SeqOfCertResponse _seqofcertresponse = new _SeqOfCertResponse();
        this.response = _seqofcertresponse;
        _seqofcertresponse.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 0, (short) 32, 16)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.response.encode(asn1BerEncodeBuffer, true);
        CertRepMessage_caPubs certRepMessage_caPubs = this.caPubs;
        if (certRepMessage_caPubs != null) {
            encode += certRepMessage_caPubs.encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.caPubs = null;
        this.response = null;
    }

    public CertRepMessage() {
    }

    public CertRepMessage(_SeqOfCertResponse _seqofcertresponse) {
        this.response = _seqofcertresponse;
    }
}
