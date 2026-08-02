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
public class MLReceiptPolicy_insteadOf extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(128, 32, 1);
    public GeneralNames[] elements;

    public MLReceiptPolicy_insteadOf(int i) {
        this.elements = new GeneralNames[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
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
        if (this.elements.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        GeneralNames[] generalNamesArr = this.elements;
        if (generalNamesArr.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        int i = 0;
        for (int length = generalNamesArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, i) + i : i;
    }

    public MLReceiptPolicy_insteadOf() {
        this.elements = null;
    }

    public MLReceiptPolicy_insteadOf(GeneralNames[] generalNamesArr) {
        this.elements = generalNamesArr;
    }
}
