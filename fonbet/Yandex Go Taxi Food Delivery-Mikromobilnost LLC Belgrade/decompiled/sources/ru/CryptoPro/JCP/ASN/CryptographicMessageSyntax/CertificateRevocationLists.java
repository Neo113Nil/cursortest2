package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1DerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1InvalidLengthException;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.CertificateList;

/* loaded from: classes4.dex */
public class CertificateRevocationLists extends Asn1Type {
    public CertificateList[] elements;

    public CertificateRevocationLists(int i) {
        this.elements = new CertificateList[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SET);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            CertificateList certificateList = new CertificateList();
            certificateList.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(certificateList);
        }
        CertificateList[] certificateListArr = new CertificateList[linkedList.size()];
        this.elements = certificateListArr;
        linkedList.toArray(certificateListArr);
        if (i == -9999) {
            int readByte = asn1BerDecodeBuffer.readByte();
            int readByte2 = asn1BerDecodeBuffer.readByte();
            if (readByte != 0 || readByte2 != 0) {
                throw new Asn1InvalidLengthException();
            }
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Asn1DerEncodeBuffer asn1DerEncodeBuffer = new Asn1DerEncodeBuffer();
        CertificateList[] certificateListArr = this.elements;
        Asn1OctetString[] asn1OctetStringArr = new Asn1OctetString[certificateListArr.length];
        int i = 0;
        for (int length = certificateListArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode((Asn1BerEncodeBuffer) asn1DerEncodeBuffer, true);
            asn1OctetStringArr[length] = new Asn1OctetString(asn1DerEncodeBuffer.getMsgCopy());
            asn1DerEncodeBuffer.reset();
        }
        Arrays.sort(asn1OctetStringArr);
        for (int length2 = this.elements.length - 1; length2 >= 0; length2--) {
            asn1OctetStringArr[length2].encode(asn1BerEncodeBuffer, false);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SET, i) + i : i;
    }

    public CertificateRevocationLists() {
        this.elements = null;
    }

    public CertificateRevocationLists(CertificateList[] certificateListArr) {
        this.elements = certificateListArr;
    }
}
