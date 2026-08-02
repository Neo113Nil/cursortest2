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
public class SignaturePolicyId_sigPolicyQualifiers extends Asn1Type {
    public SigPolicyQualifierInfo[] elements;

    public SignaturePolicyId_sigPolicyQualifiers(int i) {
        this.elements = new SigPolicyQualifierInfo[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            SigPolicyQualifierInfo sigPolicyQualifierInfo = new SigPolicyQualifierInfo();
            sigPolicyQualifierInfo.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(sigPolicyQualifierInfo);
        }
        SigPolicyQualifierInfo[] sigPolicyQualifierInfoArr = new SigPolicyQualifierInfo[linkedList.size()];
        this.elements = sigPolicyQualifierInfoArr;
        linkedList.toArray(sigPolicyQualifierInfoArr);
        if (this.elements.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        SigPolicyQualifierInfo[] sigPolicyQualifierInfoArr = this.elements;
        if (sigPolicyQualifierInfoArr.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        int i = 0;
        for (int length = sigPolicyQualifierInfoArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public SignaturePolicyId_sigPolicyQualifiers() {
        this.elements = null;
    }

    public SignaturePolicyId_sigPolicyQualifiers(SigPolicyQualifierInfo[] sigPolicyQualifierInfoArr) {
        this.elements = sigPolicyQualifierInfoArr;
    }
}
