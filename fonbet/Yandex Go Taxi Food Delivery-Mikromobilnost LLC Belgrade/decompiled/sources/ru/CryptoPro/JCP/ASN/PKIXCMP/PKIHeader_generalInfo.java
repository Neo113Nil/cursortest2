package ru.CryptoPro.JCP.ASN.PKIXCMP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import java.io.IOException;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class PKIHeader_generalInfo extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(128, 32, 8);
    public InfoTypeAndValue[] elements;

    public PKIHeader_generalInfo(int i) {
        this.elements = new InfoTypeAndValue[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            matchTag(asn1BerDecodeBuffer, TAG);
        }
        int matchTag = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, matchTag);
        while (!asn1BerDecodeContext.expired()) {
            InfoTypeAndValue infoTypeAndValue = new InfoTypeAndValue();
            infoTypeAndValue.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(infoTypeAndValue);
        }
        InfoTypeAndValue[] infoTypeAndValueArr = new InfoTypeAndValue[linkedList.size()];
        this.elements = infoTypeAndValueArr;
        linkedList.toArray(infoTypeAndValueArr);
        if (this.elements.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        InfoTypeAndValue[] infoTypeAndValueArr = this.elements;
        if (infoTypeAndValueArr.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        int i = 0;
        for (int length = infoTypeAndValueArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encodeTagAndLength) + encodeTagAndLength : encodeTagAndLength;
    }

    public PKIHeader_generalInfo() {
        this.elements = null;
    }

    public PKIHeader_generalInfo(InfoTypeAndValue[] infoTypeAndValueArr) {
        this.elements = infoTypeAndValueArr;
    }
}
