package ru.CryptoPro.JCP.ASN.PKIXOCSP;

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
public class OCSPResponse extends Asn1Type {
    public ResponseBytes responseBytes;
    public OCSPResponseStatus responseStatus;

    public OCSPResponse(int i, ResponseBytes responseBytes) {
        this.responseStatus = new OCSPResponseStatus(i);
        this.responseBytes = responseBytes;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 10, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        OCSPResponseStatus oCSPResponseStatus = new OCSPResponseStatus();
        this.responseStatus = oCSPResponseStatus;
        oCSPResponseStatus.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            ResponseBytes responseBytes = new ResponseBytes();
            this.responseBytes = responseBytes;
            responseBytes.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 10) || peekTag.equals((short) 128, (short) 32, 0)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        ResponseBytes responseBytes = this.responseBytes;
        int i = 0;
        if (responseBytes != null) {
            int encode = responseBytes.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode) + encode;
        }
        int encode2 = this.responseStatus.encode(asn1BerEncodeBuffer, true) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.responseStatus = null;
        this.responseBytes = null;
    }

    public OCSPResponse(OCSPResponseStatus oCSPResponseStatus, ResponseBytes responseBytes) {
        this.responseStatus = oCSPResponseStatus;
        this.responseBytes = responseBytes;
    }

    public OCSPResponse(OCSPResponseStatus oCSPResponseStatus) {
        this.responseStatus = oCSPResponseStatus;
    }

    public OCSPResponse() {
    }

    public OCSPResponse(int i) {
        this.responseStatus = new OCSPResponseStatus(i);
    }
}
