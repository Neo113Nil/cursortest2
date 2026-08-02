package com.fillr.browsersdk.tls.asn1.complextypes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.tls.asn1.ASN1DefinedSequence;
import com.fillr.browsersdk.tls.asn1.ASN1ObjectId;
import com.fillr.browsersdk.tls.asn1.ASN1Time;
import com.fillr.browsersdk.tls.asn1.ASN1Type;
import java.math.BigInteger;
import java.util.Date;

/* loaded from: classes4.dex */
public final class TBSCertificate extends ASN1DefinedSequence {
    public final ASN1ObjectId issuer;
    public final ASN1Time serialNumber;
    public final Validity signature;
    public final ASN1ObjectId subject;
    public final PublicKeyInfo subjectPublicKey;
    public final Validity validity;

    public TBSCertificate(BigInteger bigInteger, Validity validity, PublicKeyInfo publicKeyInfo) {
        ASN1Time aSN1Time = new ASN1Time(ASN1Type.INTEGER);
        aSN1Time.date = bigInteger;
        this.serialNumber = aSN1Time;
        long currentTimeMillis = System.currentTimeMillis() - 86400000;
        long currentTimeMillis2 = System.currentTimeMillis() + 60000;
        Validity validity2 = new Validity(0);
        validity2.notBefore = new ASN1Time(new Date(currentTimeMillis));
        validity2.notAfter = new ASN1Time(new Date(currentTimeMillis2));
        this.validity = validity2;
        this.signature = validity;
        this.subjectPublicKey = publicKeyInfo;
        this.issuer = new ASN1ObjectId();
        this.subject = new ASN1ObjectId();
    }

    @Override // com.fillr.browsersdk.tls.asn1.ASN1DefinedSequence
    public final void enqueueValues() {
        addValue(this.serialNumber);
        addValue(this.signature);
        ASN1ObjectId aSN1ObjectId = new ASN1ObjectId();
        aSN1ObjectId.valueChain.addAll(this.issuer.valueChain);
        aSN1ObjectId.valueChain.addAll(this.subject.valueChain);
        addValue(aSN1ObjectId);
        addValue(this.validity);
        addValue(new ASN1ObjectId());
        addValue(this.subjectPublicKey);
    }

    @Override // com.fillr.browsersdk.tls.asn1.ASN1DefinedSequence
    public final void validate$1() {
        ASN1ObjectId aSN1ObjectId;
        ASN1ObjectId aSN1ObjectId2;
        if (this.serialNumber == null || this.signature == null || (aSN1ObjectId = this.issuer) == null || (aSN1ObjectId2 = this.subject) == null || this.validity == null || this.subjectPublicKey == null) {
            a$$ExternalSyntheticBUOutline0.m$4("Can't serialize TBSCertificate; all fields are required!");
        } else if (aSN1ObjectId.valueChain.isEmpty() || aSN1ObjectId2.valueChain.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$4("Can't serialize TBSCertificate; 'subject' and 'issuer' must not be empty!");
        }
    }
}
