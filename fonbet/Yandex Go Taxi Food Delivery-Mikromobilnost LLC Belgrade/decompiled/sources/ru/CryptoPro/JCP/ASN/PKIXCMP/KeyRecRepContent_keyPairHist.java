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
public class KeyRecRepContent_keyPairHist extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(128, 32, 2);
    public CertifiedKeyPair[] elements;

    public KeyRecRepContent_keyPairHist(int i) {
        this.elements = new CertifiedKeyPair[i];
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
            CertifiedKeyPair certifiedKeyPair = new CertifiedKeyPair();
            certifiedKeyPair.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(certifiedKeyPair);
        }
        CertifiedKeyPair[] certifiedKeyPairArr = new CertifiedKeyPair[linkedList.size()];
        this.elements = certifiedKeyPairArr;
        linkedList.toArray(certifiedKeyPairArr);
        if (this.elements.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        CertifiedKeyPair[] certifiedKeyPairArr = this.elements;
        if (certifiedKeyPairArr.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        int i = 0;
        for (int length = certifiedKeyPairArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encodeTagAndLength) + encodeTagAndLength : encodeTagAndLength;
    }

    public KeyRecRepContent_keyPairHist() {
        this.elements = null;
    }

    public KeyRecRepContent_keyPairHist(CertifiedKeyPair[] certifiedKeyPairArr) {
        this.elements = certifiedKeyPairArr;
    }
}
