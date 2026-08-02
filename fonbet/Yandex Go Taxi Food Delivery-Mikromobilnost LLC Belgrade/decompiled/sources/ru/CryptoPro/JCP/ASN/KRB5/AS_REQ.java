package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1Tag;
import java.io.IOException;

/* loaded from: classes4.dex */
public class AS_REQ extends KDC_REQ {
    public static final Asn1Tag TAG = new Asn1Tag(64, 32, 10);

    public AS_REQ() {
    }

    @Override // ru.CryptoPro.JCP.ASN.KRB5.KDC_REQ, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
        }
        super.decode(asn1BerDecodeBuffer, true, i);
    }

    @Override // ru.CryptoPro.JCP.ASN.KRB5.KDC_REQ, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = super.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encode) + encode : encode;
    }

    public AS_REQ(Asn1Integer asn1Integer, Asn1Integer asn1Integer2, _SeqOfPA_DATA _seqofpa_data, KDC_REQ_BODY kdc_req_body) {
        super(asn1Integer, asn1Integer2, _seqofpa_data, kdc_req_body);
    }

    public AS_REQ(Asn1Integer asn1Integer, Asn1Integer asn1Integer2, KDC_REQ_BODY kdc_req_body) {
        super(asn1Integer, asn1Integer2, kdc_req_body);
    }

    public AS_REQ(long j, long j2, _SeqOfPA_DATA _seqofpa_data, KDC_REQ_BODY kdc_req_body) {
        super(j, j2, _seqofpa_data, kdc_req_body);
    }

    public AS_REQ(long j, long j2, KDC_REQ_BODY kdc_req_body) {
        super(j, j2, kdc_req_body);
    }
}
