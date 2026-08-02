package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1DerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class PresentationAddress_nAddresses extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(128, 32, 3);
    public Asn1OctetString[] elements;

    public PresentationAddress_nAddresses(int i) {
        this.elements = new Asn1OctetString[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            matchTag(asn1BerDecodeBuffer, TAG);
        }
        int matchTag = matchTag(asn1BerDecodeBuffer, Asn1Tag.SET);
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, matchTag);
        while (!asn1BerDecodeContext.expired()) {
            Asn1OctetString asn1OctetString = new Asn1OctetString();
            asn1OctetString.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(asn1OctetString);
        }
        Asn1OctetString[] asn1OctetStringArr = new Asn1OctetString[linkedList.size()];
        this.elements = asn1OctetStringArr;
        linkedList.toArray(asn1OctetStringArr);
        if (this.elements.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        if (this.elements.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        Asn1DerEncodeBuffer asn1DerEncodeBuffer = new Asn1DerEncodeBuffer();
        Asn1OctetString[] asn1OctetStringArr = this.elements;
        Asn1OctetString[] asn1OctetStringArr2 = new Asn1OctetString[asn1OctetStringArr.length];
        int i = 0;
        for (int length = asn1OctetStringArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode((Asn1BerEncodeBuffer) asn1DerEncodeBuffer, true);
            asn1OctetStringArr2[length] = new Asn1OctetString(asn1DerEncodeBuffer.getMsgCopy());
            asn1DerEncodeBuffer.reset();
        }
        Arrays.sort(asn1OctetStringArr2);
        for (int length2 = this.elements.length - 1; length2 >= 0; length2--) {
            asn1OctetStringArr2[length2].encode(asn1BerEncodeBuffer, false);
        }
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SET, i) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encodeTagAndLength) + encodeTagAndLength : encodeTagAndLength;
    }

    public PresentationAddress_nAddresses() {
        this.elements = null;
    }

    public PresentationAddress_nAddresses(Asn1OctetString[] asn1OctetStringArr) {
        this.elements = asn1OctetStringArr;
    }
}
