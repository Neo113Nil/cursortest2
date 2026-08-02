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

/* loaded from: classes4.dex */
public class CertificateSet extends Asn1Type {
    public CertificateChoices[] elements;

    public CertificateSet(int i) {
        this.elements = new CertificateChoices[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SET);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            CertificateChoices certificateChoices = new CertificateChoices();
            certificateChoices.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(certificateChoices);
        }
        CertificateChoices[] certificateChoicesArr = new CertificateChoices[linkedList.size()];
        this.elements = certificateChoicesArr;
        linkedList.toArray(certificateChoicesArr);
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
        CertificateChoices[] certificateChoicesArr = this.elements;
        Asn1OctetString[] asn1OctetStringArr = new Asn1OctetString[certificateChoicesArr.length];
        int i = 0;
        for (int length = certificateChoicesArr.length - 1; length >= 0; length--) {
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

    public CertificateSet() {
        this.elements = null;
    }

    public CertificateSet(CertificateChoices[] certificateChoicesArr) {
        this.elements = certificateChoicesArr;
    }
}
