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
public class PolicyInformation_policyQualifiers extends Asn1Type {
    public PolicyQualifierInfo[] elements;

    public PolicyInformation_policyQualifiers(int i) {
        this.elements = new PolicyQualifierInfo[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            PolicyQualifierInfo policyQualifierInfo = new PolicyQualifierInfo();
            policyQualifierInfo.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(policyQualifierInfo);
        }
        PolicyQualifierInfo[] policyQualifierInfoArr = new PolicyQualifierInfo[linkedList.size()];
        this.elements = policyQualifierInfoArr;
        linkedList.toArray(policyQualifierInfoArr);
        if (this.elements.length < 0) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        PolicyQualifierInfo[] policyQualifierInfoArr = this.elements;
        if (policyQualifierInfoArr.length < 0) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        int i = 0;
        for (int length = policyQualifierInfoArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public PolicyInformation_policyQualifiers() {
        this.elements = null;
    }

    public PolicyInformation_policyQualifiers(PolicyQualifierInfo[] policyQualifierInfoArr) {
        this.elements = policyQualifierInfoArr;
    }
}
