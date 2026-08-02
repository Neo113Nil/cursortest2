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
public class ExtensionAttributes extends Asn1Type {
    public ExtensionAttribute[] elements;

    public ExtensionAttributes(int i) {
        this.elements = new ExtensionAttribute[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SET);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            ExtensionAttribute extensionAttribute = new ExtensionAttribute();
            extensionAttribute.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(extensionAttribute);
        }
        ExtensionAttribute[] extensionAttributeArr = new ExtensionAttribute[linkedList.size()];
        this.elements = extensionAttributeArr;
        linkedList.toArray(extensionAttributeArr);
        ExtensionAttribute[] extensionAttributeArr2 = this.elements;
        if (extensionAttributeArr2.length < 1 || extensionAttributeArr2.length > 256) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        ExtensionAttribute[] extensionAttributeArr = this.elements;
        if (extensionAttributeArr.length < 1 || extensionAttributeArr.length > 256) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        Asn1DerEncodeBuffer asn1DerEncodeBuffer = new Asn1DerEncodeBuffer();
        ExtensionAttribute[] extensionAttributeArr2 = this.elements;
        Asn1OctetString[] asn1OctetStringArr = new Asn1OctetString[extensionAttributeArr2.length];
        int i = 0;
        for (int length = extensionAttributeArr2.length - 1; length >= 0; length--) {
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

    public ExtensionAttributes() {
        this.elements = null;
    }

    public ExtensionAttributes(ExtensionAttribute[] extensionAttributeArr) {
        this.elements = extensionAttributeArr;
    }
}
