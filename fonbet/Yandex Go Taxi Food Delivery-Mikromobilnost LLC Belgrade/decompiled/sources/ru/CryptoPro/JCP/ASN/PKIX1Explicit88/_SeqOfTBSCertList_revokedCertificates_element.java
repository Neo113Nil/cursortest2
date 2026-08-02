package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import java.io.IOException;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class _SeqOfTBSCertList_revokedCertificates_element extends Asn1Type {
    public TBSCertList_revokedCertificates_element[] elements;

    public _SeqOfTBSCertList_revokedCertificates_element(int i) {
        this.elements = new TBSCertList_revokedCertificates_element[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            TBSCertList_revokedCertificates_element tBSCertList_revokedCertificates_element = new TBSCertList_revokedCertificates_element();
            tBSCertList_revokedCertificates_element.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(tBSCertList_revokedCertificates_element);
        }
        TBSCertList_revokedCertificates_element[] tBSCertList_revokedCertificates_elementArr = new TBSCertList_revokedCertificates_element[linkedList.size()];
        this.elements = tBSCertList_revokedCertificates_elementArr;
        linkedList.toArray(tBSCertList_revokedCertificates_elementArr);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = 0;
        for (int length = this.elements.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public _SeqOfTBSCertList_revokedCertificates_element() {
        this.elements = null;
    }

    public _SeqOfTBSCertList_revokedCertificates_element(TBSCertList_revokedCertificates_element[] tBSCertList_revokedCertificates_elementArr) {
        this.elements = tBSCertList_revokedCertificates_elementArr;
    }
}
