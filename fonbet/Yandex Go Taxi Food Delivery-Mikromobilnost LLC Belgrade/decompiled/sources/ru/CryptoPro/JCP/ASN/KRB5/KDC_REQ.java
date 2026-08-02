package ru.CryptoPro.JCP.ASN.KRB5;

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

/* loaded from: classes4.dex */
public class KDC_REQ extends Asn1Type {
    public Asn1Integer msg_type;
    public _SeqOfPA_DATA padata;
    public Asn1Integer pvno;
    public KDC_REQ_BODY req_body;

    public KDC_REQ(long j, long j2, _SeqOfPA_DATA _seqofpa_data, KDC_REQ_BODY kdc_req_body) {
        this.pvno = new Asn1Integer(j);
        this.msg_type = new Asn1Integer(j2);
        this.padata = _seqofpa_data;
        this.req_body = kdc_req_body;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer = new Asn1Integer();
        this.pvno = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer2 = new Asn1Integer();
        this.msg_type = asn1Integer2;
        asn1Integer2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            _SeqOfPA_DATA _seqofpa_data = new _SeqOfPA_DATA();
            this.padata = _seqofpa_data;
            _seqofpa_data.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        KDC_REQ_BODY kdc_req_body = new KDC_REQ_BODY();
        this.req_body = kdc_req_body;
        kdc_req_body.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.req_body.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode) + encode;
        _SeqOfPA_DATA _seqofpa_data = this.padata;
        if (_seqofpa_data != null) {
            int encode2 = _seqofpa_data.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength = encodeTagAndLength + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode2);
        }
        int encode3 = this.msg_type.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode3) + encodeTagAndLength + encode3;
        int encode4 = this.pvno.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength3 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode4) + encodeTagAndLength2 + encode4;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength3) + encodeTagAndLength3 : encodeTagAndLength3;
    }

    public void init() {
        this.pvno = null;
        this.msg_type = null;
        this.padata = null;
        this.req_body = null;
    }

    public KDC_REQ(Asn1Integer asn1Integer, Asn1Integer asn1Integer2, _SeqOfPA_DATA _seqofpa_data, KDC_REQ_BODY kdc_req_body) {
        this.pvno = asn1Integer;
        this.msg_type = asn1Integer2;
        this.padata = _seqofpa_data;
        this.req_body = kdc_req_body;
    }

    public KDC_REQ(Asn1Integer asn1Integer, Asn1Integer asn1Integer2, KDC_REQ_BODY kdc_req_body) {
        this.pvno = asn1Integer;
        this.msg_type = asn1Integer2;
        this.req_body = kdc_req_body;
    }

    public KDC_REQ() {
    }

    public KDC_REQ(long j, long j2, KDC_REQ_BODY kdc_req_body) {
        this.pvno = new Asn1Integer(j);
        this.msg_type = new Asn1Integer(j2);
        this.req_body = kdc_req_body;
    }
}
