package com.fillr.browsersdk.tls.asn1.complextypes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.tls.asn1.ASN1BitString;
import com.fillr.browsersdk.tls.asn1.ASN1DefinedSequence;
import com.fillr.browsersdk.tls.asn1.ASN1Type;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.Signature;

/* loaded from: classes4.dex */
public final class SSLCertificate extends ASN1DefinedSequence {
    public final KeyPair keyPair;
    public final Validity signatureAlgorithm;
    public ASN1BitString signatureValue;
    public final TBSCertificate tbsCert;

    public SSLCertificate(BigInteger bigInteger, Validity validity, PublicKeyInfo publicKeyInfo, KeyPair keyPair) {
        this.tbsCert = new TBSCertificate(bigInteger, validity, publicKeyInfo);
        this.signatureAlgorithm = validity;
        this.keyPair = keyPair;
    }

    @Override // com.fillr.browsersdk.tls.asn1.ASN1DefinedSequence
    public final void enqueueValues() {
        addValue(this.tbsCert);
        addValue(this.signatureAlgorithm);
        addValue(this.signatureValue);
    }

    @Override // com.fillr.browsersdk.tls.asn1.ASN1DefinedSequence
    public final void validate$1() {
        if (this.signatureAlgorithm == null) {
            a$$ExternalSyntheticBUOutline0.m$4("Can't serialize SSLCertificate; 'signatureAlgorithm' must be specified!");
            return;
        }
        KeyPair keyPair = this.keyPair;
        if (keyPair == null) {
            a$$ExternalSyntheticBUOutline0.m$4("Can't serialize SSLCertificate; a valid 'keyPair' must be provided!");
            return;
        }
        TBSCertificate tBSCertificate = this.tbsCert;
        tBSCertificate.validate$1();
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(keyPair.getPrivate());
            signature.update(tBSCertificate.toBytes());
            byte[] sign = signature.sign();
            int length = sign.length * 8;
            ASN1BitString aSN1BitString = new ASN1BitString(ASN1Type.BIT_STRING);
            aSN1BitString.bitsBuffer = sign;
            aSN1BitString.numSignificantBits = length;
            int i = length / 8;
            if (length % 8 != 0) {
                i++;
            }
            if (sign.length != i) {
                throw new IllegalArgumentException("The number of significant bits must be no less than the total number of bits minus 7!");
            }
            this.signatureValue = aSN1BitString;
        } catch (Exception e) {
            e.printStackTrace();
            a$$ExternalSyntheticBUOutline0.m$4("Can't serialize SSLCertificate; unable to compute signature!");
        }
    }
}
