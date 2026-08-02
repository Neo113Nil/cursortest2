package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

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
public class TeletexDomainDefinedAttributes extends Asn1Type {
    public TeletexDomainDefinedAttribute[] elements;

    public TeletexDomainDefinedAttributes(int i) {
        this.elements = new TeletexDomainDefinedAttribute[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            TeletexDomainDefinedAttribute teletexDomainDefinedAttribute = new TeletexDomainDefinedAttribute();
            teletexDomainDefinedAttribute.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(teletexDomainDefinedAttribute);
        }
        TeletexDomainDefinedAttribute[] teletexDomainDefinedAttributeArr = new TeletexDomainDefinedAttribute[linkedList.size()];
        this.elements = teletexDomainDefinedAttributeArr;
        linkedList.toArray(teletexDomainDefinedAttributeArr);
        TeletexDomainDefinedAttribute[] teletexDomainDefinedAttributeArr2 = this.elements;
        if (teletexDomainDefinedAttributeArr2.length < 1 || teletexDomainDefinedAttributeArr2.length > 4) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        TeletexDomainDefinedAttribute[] teletexDomainDefinedAttributeArr = this.elements;
        if (teletexDomainDefinedAttributeArr.length < 1 || teletexDomainDefinedAttributeArr.length > 4) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        int i = 0;
        for (int length = teletexDomainDefinedAttributeArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public TeletexDomainDefinedAttributes() {
        this.elements = null;
    }

    public TeletexDomainDefinedAttributes(TeletexDomainDefinedAttribute[] teletexDomainDefinedAttributeArr) {
        this.elements = teletexDomainDefinedAttributeArr;
    }
}
