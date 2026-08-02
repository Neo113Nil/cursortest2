package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1DerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class DigestAlgorithmIdentifiers extends Asn1Type {
    public DigestAlgorithmIdentifier[] elements;

    public DigestAlgorithmIdentifiers(int i) {
        this.elements = new DigestAlgorithmIdentifier[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SET);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            DigestAlgorithmIdentifier digestAlgorithmIdentifier = new DigestAlgorithmIdentifier();
            digestAlgorithmIdentifier.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(digestAlgorithmIdentifier);
        }
        DigestAlgorithmIdentifier[] digestAlgorithmIdentifierArr = new DigestAlgorithmIdentifier[linkedList.size()];
        this.elements = digestAlgorithmIdentifierArr;
        linkedList.toArray(digestAlgorithmIdentifierArr);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Asn1DerEncodeBuffer asn1DerEncodeBuffer = new Asn1DerEncodeBuffer();
        DigestAlgorithmIdentifier[] digestAlgorithmIdentifierArr = this.elements;
        Asn1OctetString[] asn1OctetStringArr = new Asn1OctetString[digestAlgorithmIdentifierArr.length];
        int i = 0;
        for (int length = digestAlgorithmIdentifierArr.length - 1; length >= 0; length--) {
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

    public DigestAlgorithmIdentifiers() {
        this.elements = null;
    }

    public DigestAlgorithmIdentifiers(DigestAlgorithmIdentifier[] digestAlgorithmIdentifierArr) {
        this.elements = digestAlgorithmIdentifierArr;
    }
}
