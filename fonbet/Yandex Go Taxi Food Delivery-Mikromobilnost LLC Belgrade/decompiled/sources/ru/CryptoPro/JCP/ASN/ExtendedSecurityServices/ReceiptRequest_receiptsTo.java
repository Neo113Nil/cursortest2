package ru.CryptoPro.JCP.ASN.ExtendedSecurityServices;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import java.io.IOException;
import java.util.LinkedList;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.GeneralNames;

/* loaded from: classes4.dex */
public class ReceiptRequest_receiptsTo extends Asn1Type {
    public GeneralNames[] elements;

    public ReceiptRequest_receiptsTo(int i) {
        this.elements = new GeneralNames[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            GeneralNames generalNames = new GeneralNames();
            generalNames.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(generalNames);
        }
        GeneralNames[] generalNamesArr = new GeneralNames[linkedList.size()];
        this.elements = generalNamesArr;
        linkedList.toArray(generalNamesArr);
        GeneralNames[] generalNamesArr2 = this.elements;
        if (generalNamesArr2.length < 1 || generalNamesArr2.length > 16) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        GeneralNames[] generalNamesArr = this.elements;
        if (generalNamesArr.length < 1 || generalNamesArr.length > 16) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        int i = 0;
        for (int length = generalNamesArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public ReceiptRequest_receiptsTo() {
        this.elements = null;
    }

    public ReceiptRequest_receiptsTo(GeneralNames[] generalNamesArr) {
        this.elements = generalNamesArr;
    }
}
