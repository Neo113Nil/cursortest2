package ru.CryptoPro.JCP.ASN.CertificateExtensions;

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
public class PolicyMappingsSyntax extends Asn1Type {
    public PolicyMappingsSyntax_element[] elements;

    public PolicyMappingsSyntax(int i) {
        this.elements = new PolicyMappingsSyntax_element[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            PolicyMappingsSyntax_element policyMappingsSyntax_element = new PolicyMappingsSyntax_element();
            policyMappingsSyntax_element.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(policyMappingsSyntax_element);
        }
        PolicyMappingsSyntax_element[] policyMappingsSyntax_elementArr = new PolicyMappingsSyntax_element[linkedList.size()];
        this.elements = policyMappingsSyntax_elementArr;
        linkedList.toArray(policyMappingsSyntax_elementArr);
        if (this.elements.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        PolicyMappingsSyntax_element[] policyMappingsSyntax_elementArr = this.elements;
        if (policyMappingsSyntax_elementArr.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        int i = 0;
        for (int length = policyMappingsSyntax_elementArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public PolicyMappingsSyntax() {
        this.elements = null;
    }

    public PolicyMappingsSyntax(PolicyMappingsSyntax_element[] policyMappingsSyntax_elementArr) {
        this.elements = policyMappingsSyntax_elementArr;
    }
}
