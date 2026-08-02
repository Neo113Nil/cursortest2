package com.fillr.browsersdk.tls.asn1;

/* loaded from: classes4.dex */
public final class ASN1Null extends ASN1Value {
    public ASN1Null() {
        super(ASN1Type.NULL);
    }

    @Override // com.fillr.browsersdk.tls.asn1.ASN1Value
    public final byte[] getPayload() {
        return new byte[0];
    }
}
