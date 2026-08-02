package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1PrintableString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import java.io.IOException;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class UnformattedPostalAddress_printable_address extends Asn1Type {
    public Asn1PrintableString[] elements;

    public UnformattedPostalAddress_printable_address(int i) {
        this.elements = new Asn1PrintableString[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            Asn1PrintableString asn1PrintableString = new Asn1PrintableString();
            asn1PrintableString.decode(asn1BerDecodeBuffer, true, 0);
            if (asn1PrintableString.getLength() < 1 || asn1PrintableString.getLength() > 32768) {
                throw new Asn1ConsVioException("element.getLength()", asn1PrintableString.getLength());
            }
            linkedList.add(asn1PrintableString);
        }
        Asn1PrintableString[] asn1PrintableStringArr = new Asn1PrintableString[linkedList.size()];
        this.elements = asn1PrintableStringArr;
        linkedList.toArray(asn1PrintableStringArr);
        Asn1PrintableString[] asn1PrintableStringArr2 = this.elements;
        if (asn1PrintableStringArr2.length < 1 || asn1PrintableStringArr2.length > 6) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Asn1PrintableString[] asn1PrintableStringArr = this.elements;
        if (asn1PrintableStringArr.length < 1 || asn1PrintableStringArr.length > 6) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        int i = 0;
        for (int length = asn1PrintableStringArr.length - 1; length >= 0; length--) {
            if (this.elements[length].getLength() < 1 || this.elements[length].getLength() > 32768) {
                throw new Asn1ConsVioException("elements[i].getLength()", this.elements[length].getLength());
            }
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public UnformattedPostalAddress_printable_address() {
        this.elements = null;
    }

    public UnformattedPostalAddress_printable_address(Asn1PrintableString[] asn1PrintableStringArr) {
        this.elements = asn1PrintableStringArr;
    }
}
