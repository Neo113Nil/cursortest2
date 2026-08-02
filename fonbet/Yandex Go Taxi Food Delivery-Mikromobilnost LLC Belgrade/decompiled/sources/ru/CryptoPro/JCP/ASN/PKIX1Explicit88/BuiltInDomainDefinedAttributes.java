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
public class BuiltInDomainDefinedAttributes extends Asn1Type {
    public BuiltInDomainDefinedAttribute[] elements;

    public BuiltInDomainDefinedAttributes(int i) {
        this.elements = new BuiltInDomainDefinedAttribute[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            BuiltInDomainDefinedAttribute builtInDomainDefinedAttribute = new BuiltInDomainDefinedAttribute();
            builtInDomainDefinedAttribute.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(builtInDomainDefinedAttribute);
        }
        BuiltInDomainDefinedAttribute[] builtInDomainDefinedAttributeArr = new BuiltInDomainDefinedAttribute[linkedList.size()];
        this.elements = builtInDomainDefinedAttributeArr;
        linkedList.toArray(builtInDomainDefinedAttributeArr);
        BuiltInDomainDefinedAttribute[] builtInDomainDefinedAttributeArr2 = this.elements;
        if (builtInDomainDefinedAttributeArr2.length < 1 || builtInDomainDefinedAttributeArr2.length > 4) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        BuiltInDomainDefinedAttribute[] builtInDomainDefinedAttributeArr = this.elements;
        if (builtInDomainDefinedAttributeArr.length < 1 || builtInDomainDefinedAttributeArr.length > 4) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        int i = 0;
        for (int length = builtInDomainDefinedAttributeArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public BuiltInDomainDefinedAttributes() {
        this.elements = null;
    }

    public BuiltInDomainDefinedAttributes(BuiltInDomainDefinedAttribute[] builtInDomainDefinedAttributeArr) {
        this.elements = builtInDomainDefinedAttributeArr;
    }
}
