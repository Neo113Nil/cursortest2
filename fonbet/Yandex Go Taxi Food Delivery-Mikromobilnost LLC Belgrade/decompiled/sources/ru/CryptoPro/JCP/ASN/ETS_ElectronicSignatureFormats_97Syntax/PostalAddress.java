package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

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
public class PostalAddress extends Asn1Type {
    public PostalAddress_element[] elements;

    public PostalAddress(int i) {
        this.elements = new PostalAddress_element[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            PostalAddress_element postalAddress_element = new PostalAddress_element();
            postalAddress_element.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(postalAddress_element);
        }
        PostalAddress_element[] postalAddress_elementArr = new PostalAddress_element[linkedList.size()];
        this.elements = postalAddress_elementArr;
        linkedList.toArray(postalAddress_elementArr);
        PostalAddress_element[] postalAddress_elementArr2 = this.elements;
        if (postalAddress_elementArr2.length < 1 || postalAddress_elementArr2.length > 6) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        PostalAddress_element[] postalAddress_elementArr = this.elements;
        if (postalAddress_elementArr.length < 1 || postalAddress_elementArr.length > 6) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        int i = 0;
        for (int length = postalAddress_elementArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public PostalAddress() {
        this.elements = null;
    }

    public PostalAddress(PostalAddress_element[] postalAddress_elementArr) {
        this.elements = postalAddress_elementArr;
    }
}
