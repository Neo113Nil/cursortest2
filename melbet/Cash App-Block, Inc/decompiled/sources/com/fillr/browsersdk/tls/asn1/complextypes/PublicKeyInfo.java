package com.fillr.browsersdk.tls.asn1.complextypes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.tls.asn1.ASN1DefinedSequence;

/* loaded from: classes4.dex */
public final class PublicKeyInfo extends ASN1DefinedSequence {
    public byte[] preformattedData;

    @Override // com.fillr.browsersdk.tls.asn1.ASN1DefinedSequence
    public final void enqueueValues() {
    }

    @Override // com.fillr.browsersdk.tls.asn1.ASN1Value
    public final byte[] toBytes() {
        byte[] bArr = this.preformattedData;
        return bArr != null ? bArr : super.toBytes();
    }

    @Override // com.fillr.browsersdk.tls.asn1.ASN1DefinedSequence
    public final void validate$1() {
        if (this.preformattedData != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$4("Can't serialize PublicKeyInfo; both 'algorithm' and 'publicKey' are required!");
    }
}
