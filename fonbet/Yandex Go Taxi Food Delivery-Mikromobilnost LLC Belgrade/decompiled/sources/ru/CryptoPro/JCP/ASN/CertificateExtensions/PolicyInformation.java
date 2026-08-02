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
public class PolicyInformation extends Asn1Type {
    public CertPolicyId policyIdentifier;
    public PolicyInformation_policyQualifiers policyQualifiers;

    public PolicyInformation(int[] iArr, PolicyInformation_policyQualifiers policyInformation_policyQualifiers) {
        this.policyIdentifier = new CertPolicyId(iArr);
        this.policyQualifiers = policyInformation_policyQualifiers;
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
        this.policyIdentifier = certPolicyId;
        certPolicyId.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            PolicyInformation_policyQualifiers policyInformation_policyQualifiers = new PolicyInformation_policyQualifiers();
            this.policyQualifiers = policyInformation_policyQualifiers;
            policyInformation_policyQualifiers.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 6) || peekTag.equals((short) 0, (short) 32, 16)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        PolicyInformation_policyQualifiers policyInformation_policyQualifiers = this.policyQualifiers;
        int encode = this.policyIdentifier.encode(asn1BerEncodeBuffer, true) + (policyInformation_policyQualifiers != null ? policyInformation_policyQualifiers.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.policyIdentifier = null;
        this.policyQualifiers = null;
    }

    public PolicyInformation(CertPolicyId certPolicyId, PolicyInformation_policyQualifiers policyInformation_policyQualifiers) {
        this.policyIdentifier = certPolicyId;
        this.policyQualifiers = policyInformation_policyQualifiers;
    }

    public PolicyInformation(CertPolicyId certPolicyId) {
        this.policyIdentifier = certPolicyId;
    }

    public PolicyInformation() {
    }

    public PolicyInformation(int[] iArr) {
        this.policyIdentifier = new CertPolicyId(iArr);
    }
}
