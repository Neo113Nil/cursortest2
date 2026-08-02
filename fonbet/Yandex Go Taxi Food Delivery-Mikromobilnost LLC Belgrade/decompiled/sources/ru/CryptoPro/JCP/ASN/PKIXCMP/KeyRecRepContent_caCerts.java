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
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Certificate;

/* loaded from: classes4.dex */
public class KeyRecRepContent_caCerts extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(128, 32, 1);
    public Certificate[] elements;

    public KeyRecRepContent_caCerts(int i) {
        this.elements = new Certificate[i];
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
            Certificate certificate = new Certificate();
            certificate.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(certificate);
        }
        Certificate[] certificateArr = new Certificate[linkedList.size()];
        this.elements = certificateArr;
        linkedList.toArray(certificateArr);
        if (this.elements.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Certificate[] certificateArr = this.elements;
        if (certificateArr.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        int i = 0;
        for (int length = certificateArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encodeTagAndLength) + encodeTagAndLength : encodeTagAndLength;
    }

    public KeyRecRepContent_caCerts() {
        this.elements = null;
    }

    public KeyRecRepContent_caCerts(Certificate[] certificateArr) {
        this.elements = certificateArr;
    }
}
