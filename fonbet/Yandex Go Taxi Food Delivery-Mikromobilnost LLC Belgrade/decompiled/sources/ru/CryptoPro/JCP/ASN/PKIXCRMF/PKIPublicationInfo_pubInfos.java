package ru.CryptoPro.JCP.ASN.PKIXCRMF;

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
public class PKIPublicationInfo_pubInfos extends Asn1Type {
    public SinglePubInfo[] elements;

    public PKIPublicationInfo_pubInfos(int i) {
        this.elements = new SinglePubInfo[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            SinglePubInfo singlePubInfo = new SinglePubInfo();
            singlePubInfo.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(singlePubInfo);
        }
        SinglePubInfo[] singlePubInfoArr = new SinglePubInfo[linkedList.size()];
        this.elements = singlePubInfoArr;
        linkedList.toArray(singlePubInfoArr);
        if (this.elements.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        SinglePubInfo[] singlePubInfoArr = this.elements;
        if (singlePubInfoArr.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        int i = 0;
        for (int length = singlePubInfoArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public PKIPublicationInfo_pubInfos() {
        this.elements = null;
    }

    public PKIPublicationInfo_pubInfos(SinglePubInfo[] singlePubInfoArr) {
        this.elements = singlePubInfoArr;
    }
}
