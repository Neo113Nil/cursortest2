package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class PolicyMappingsSyntax_element extends Asn1Type {
    public CertPolicyId issuerDomainPolicy;
    public CertPolicyId subjectDomainPolicy;

    public PolicyMappingsSyntax_element(int[] iArr, int[] iArr2) {
        this.issuerDomainPolicy = new CertPolicyId(iArr);
        this.subjectDomainPolicy = new CertPolicyId(iArr2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 6, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        CertPolicyId certPolicyId = new CertPolicyId();
        this.issuerDomainPolicy = certPolicyId;
        certPolicyId.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 6, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        CertPolicyId certPolicyId2 = new CertPolicyId();
        this.subjectDomainPolicy = certPolicyId2;
        certPolicyId2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 6)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.issuerDomainPolicy.encode(asn1BerEncodeBuffer, true) + this.subjectDomainPolicy.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.issuerDomainPolicy = null;
        this.subjectDomainPolicy = null;
    }

    public PolicyMappingsSyntax_element(CertPolicyId certPolicyId, CertPolicyId certPolicyId2) {
        this.issuerDomainPolicy = certPolicyId;
        this.subjectDomainPolicy = certPolicyId2;
    }

    public PolicyMappingsSyntax_element() {
    }
}
