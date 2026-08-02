package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import java.io.IOException;
import java.util.LinkedList;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.OtherCertID;

/* loaded from: classes4.dex */
public class CompleteCertificateRefs extends Asn1Type {
    public OtherCertID[] elements;

    public CompleteCertificateRefs(int i) {
        this.elements = new OtherCertID[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            OtherCertID otherCertID = new OtherCertID();
            otherCertID.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(otherCertID);
        }
        OtherCertID[] otherCertIDArr = new OtherCertID[linkedList.size()];
        this.elements = otherCertIDArr;
        linkedList.toArray(otherCertIDArr);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = 0;
        for (int length = this.elements.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public CompleteCertificateRefs() {
        this.elements = null;
    }

    public CompleteCertificateRefs(OtherCertID[] otherCertIDArr) {
        this.elements = otherCertIDArr;
    }
}
