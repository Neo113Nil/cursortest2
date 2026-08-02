package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

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
public class RevocationValues extends Asn1Type {
    public _SeqOfCertificateList crlVals;
    public _SeqOfBasicOCSPResponse ocspVals;

    public RevocationValues(_SeqOfCertificateList _seqofcertificatelist, _SeqOfBasicOCSPResponse _seqofbasicocspresponse) {
        this.crlVals = _seqofcertificatelist;
        this.ocspVals = _seqofbasicocspresponse;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            _SeqOfCertificateList _seqofcertificatelist = new _SeqOfCertificateList();
            this.crlVals = _seqofcertificatelist;
            _seqofcertificatelist.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            _SeqOfBasicOCSPResponse _seqofbasicocspresponse = new _SeqOfBasicOCSPResponse();
            this.ocspVals = _seqofbasicocspresponse;
            _seqofbasicocspresponse.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        _SeqOfBasicOCSPResponse _seqofbasicocspresponse = this.ocspVals;
        if (_seqofbasicocspresponse != null) {
            int encode = _seqofbasicocspresponse.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode) + encode;
        } else {
            i = 0;
        }
        _SeqOfCertificateList _seqofcertificatelist = this.crlVals;
        if (_seqofcertificatelist != null) {
            int encode2 = _seqofcertificatelist.encode(asn1BerEncodeBuffer, true);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode2);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public void init() {
        this.crlVals = null;
        this.ocspVals = null;
    }

    public RevocationValues() {
    }
}
