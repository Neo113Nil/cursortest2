package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import java.io.IOException;
import java.util.LinkedList;
import ru.CryptoPro.JCP.ASN.PKIXOCSP.BasicOCSPResponse;

/* loaded from: classes4.dex */
public class _SeqOfBasicOCSPResponse extends Asn1Type {
    public BasicOCSPResponse[] elements;

    public _SeqOfBasicOCSPResponse(int i) {
        this.elements = new BasicOCSPResponse[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            BasicOCSPResponse basicOCSPResponse = new BasicOCSPResponse();
            basicOCSPResponse.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(basicOCSPResponse);
        }
        BasicOCSPResponse[] basicOCSPResponseArr = new BasicOCSPResponse[linkedList.size()];
        this.elements = basicOCSPResponseArr;
        linkedList.toArray(basicOCSPResponseArr);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = 0;
        for (int length = this.elements.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public _SeqOfBasicOCSPResponse() {
        this.elements = null;
    }

    public _SeqOfBasicOCSPResponse(BasicOCSPResponse[] basicOCSPResponseArr) {
        this.elements = basicOCSPResponseArr;
    }
}
